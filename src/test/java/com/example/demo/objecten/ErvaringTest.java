package com.example.demo.objecten;
import com.example.demo.ToonErvaring;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ErvaringTest {
    @Test
    void getervaringhaijin(){
        String loginmessage = ToonErvaring.toonrevaring ("haijin");
        assertEquals("Zalm", loginmessage);
    }
    @Test
    void getervaringjolan(){
        String loginmessage = ToonErvaring.toonrevaring ("jolan");
        assertEquals("Zalm", loginmessage);
    }    @Test
    void getervaringtom(){
        String loginmessage = ToonErvaring.toonrevaring ("tom");
        assertEquals("Dolfijn", loginmessage);
    }
    @Test
    void getervaringMoerie (){
        String loginmessage = ToonErvaring.toonrevaring ("Moerie");
        assertEquals("Dolfijn", loginmessage);
    }
    @Test
    void getervaringhkai(){
        String loginmessage = ToonErvaring.toonrevaring ("kai");
        assertEquals("Haai", loginmessage);
    }
    @Test
    void getervaringrio(){
        String loginmessage = ToonErvaring.toonrevaring ("rio");
        assertEquals("Haai", loginmessage);
    }
}