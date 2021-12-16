package com.sparta.hibernatedemo.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.sparta.hibernatedemo.entities.Actor;
import com.sparta.hibernatedemo.repositories.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class ActorController {
    @Autowired
    private ActorRepository theRepository;
    @Autowired
    ObjectMapper map;
    @GetMapping(value="/sakila/actors")
    public List<Actor> getActors(){
        return theRepository.findAll();
    }
    @GetMapping(value="/sakila/actor")
    public ResponseEntity<String> getActor(@RequestParam Integer id){
        Optional<Actor> result = theRepository.findById(id);
        HttpHeaders headers = new HttpHeaders();
        headers.add("content-type", "application/json");
        if(result.isPresent()) {
            try {
                ResponseEntity<String> resp = new ResponseEntity<>(map.writeValueAsString(result.get()),
                        headers,
                        HttpStatus.OK);
                return resp;
            } catch (JsonProcessingException e) {
                e.printStackTrace();
            }
//            return result.get();
        }
        return new ResponseEntity<String>("{\"message\":\"That actor doesn't exist\"}",
                    headers,
                    HttpStatus.OK);
    }
    @PutMapping(value="/sakila/actor/update")
    public Actor updateActor(@RequestBody Actor newState){
        Optional<Actor> oldState = theRepository.findById(newState.getId());
        if(oldState.isEmpty()) return null;
        theRepository.save(newState);
        return newState;
    }
    @DeleteMapping(value="/sakila/actor/delete")
    @ResponseStatus(value = HttpStatus.NO_CONTENT)
    public void deleteActor(@RequestParam Integer id){
        theRepository.deleteById(id);
    }
    @PostMapping(value="/sakila/actor/add")
    public Actor insertActor(@RequestBody Actor newActor){
        theRepository.save(newActor);
        return newActor;
    }
    @GetMapping(value="/example")
    public ResponseEntity<String> getResponse(){
        return ResponseEntity.status(HttpStatus.NOT_FOUND)
                .header("content-type", "whatever")
                .body("This is my return value");
    }
}
