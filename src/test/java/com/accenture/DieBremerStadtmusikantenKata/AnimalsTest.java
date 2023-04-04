package com.accenture.DieBremerStadtmusikantenKata;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalsTest {

    ByteArrayOutputStream outContent;

    @BeforeEach
    void setUp() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @Test
    void allTheOtherAnimalsCanSingTooGivingADifferentMessage(){
        //given
        Animal donkey = new Donkey("testing donkey","iaaaaaaah~~");
        Animal cat=new Cat("testing cat","miau~~");
        //when
        cat.startSinging();
        String[] lines = outContent.toString().split(System.lineSeparator());
        String consoleContentAfterCatStart=lines[lines.length - 1];
        cat.stopSinging();
        lines = outContent.toString().split(System.lineSeparator());
        String consoleContentAfterCatStop=lines[lines.length - 1];
        donkey.startSinging();
        lines = outContent.toString().split(System.lineSeparator());
        String consoleContentAfterDonkeyStart=lines[lines.length - 1];
        donkey.stopSinging();
        lines = outContent.toString().split(System.lineSeparator());
        String consoleContentAfterDonkeyStop=lines[lines.length - 1];
        //then
        assertEquals("El gato testing cat esta cantando miau~~", consoleContentAfterCatStart);
        assertEquals("El gato testing cat no quiere cantar", consoleContentAfterCatStop);
        assertEquals("El asno testing donkey esta cantando iaaaaaaah~~", consoleContentAfterDonkeyStart);
        assertEquals("El asno testing donkey no quiere cantar", consoleContentAfterDonkeyStop);
    }

    @AfterAll
    static void cleanUp(){
        System.setOut(System.out);
    }
}
