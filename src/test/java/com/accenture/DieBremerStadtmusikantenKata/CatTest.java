package com.accenture.DieBremerStadtmusikantenKata;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.*;

class CatTest {

    ByteArrayOutputStream outContent;

    @BeforeEach
    void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
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

    @Test
    void catsDoNotSingFromTheStart(){
        //given
        Cat testingCat=new Cat("testing cat","miau~~");
        //when
        Boolean isSinging=testingCat.isSinging();
        //then
        assertEquals("", outContent.toString());
        assertFalse(isSinging);
    }

    @Test
    void catsCanStartAndStopSinging(){
        //given
        Cat testingCat=new Cat("testing cat","miau~~");
        //when
        Boolean isSingingBeforeStart=testingCat.isSinging();
        testingCat.startSinging();
        Boolean isSingingAfterStart=testingCat.isSinging();
        testingCat.stopSinging();
        Boolean isSingingAfterStop=testingCat.isSinging();
        //then
        assertEquals("miau~~"+System.lineSeparator(), outContent.toString());
        assertFalse(isSingingBeforeStart);
        assertTrue(isSingingAfterStart);
        assertFalse(isSingingAfterStop);

    }

    @AfterAll
    static void cleanUp(){
        System.setOut(System.out);
    }


}