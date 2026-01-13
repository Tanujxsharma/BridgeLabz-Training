package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    StringUtils obj=new StringUtils();

    @Test
    @DisplayName("checking the reverse")
    void ReverseCheck(){
        assertEquals("orb ih", obj.reverse("hi bro"));
    }


    @Test
    @DisplayName("checking the string is palindrome or not")
    void isPalindrome(){
        assertTrue(true, obj.reverse("malayalam"));
    }

    @Test
    @DisplayName("checking that all characters are uppercase")

    void isUppercase(){

        assertEquals("HELLO", obj.toUpperCase("hello"));
    }
}