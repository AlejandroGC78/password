package Comprobacion;

import org.junit.Test;

import static Comprobacion.password.SecurityLevel.*;
import static org.junit.Assert.*;

public class passwordTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK, password.assessPassword("1234567"));
    }

    @Test
    public void weak_when_has_less_than_only_letters() {
        assertEquals(WEAK, password.assessPassword("abcdefgh"));
    }

    @Test
    public void medium_when_has_less_than_letters_and_numers() {
        assertEquals(MEDIUM, password.assessPassword("abcd1234"));
    }

    @Test
    public void strong_when_has_less_than_symbols_and_numers() {
        assertEquals(STRONG, password.assessPassword("abcd123?"));
    }

}