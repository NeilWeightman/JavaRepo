package com.sparta.oop;

import java.io.Externalizable;
import java.io.Serializable;

public interface Emailable extends Serializable, Externalizable {
    void sendEmail(String message);
}
