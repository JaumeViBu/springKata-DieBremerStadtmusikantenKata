package com.accenture.DieBremerStadtmusikantenKata;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void catsMustHaveANameAndTheSoundTheyDoWhenTheySing() {
        //given
        Cat testingCat=new Cat("testing cat","miau~~");
        //when
        var name=testingCat.getName();
        var sound=testingCat.getSound();
        //then
        assertEquals("testing cat", name);
        assertEquals("miau~~", sound);
    }
}