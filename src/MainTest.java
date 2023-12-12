import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private final Main testing = new Main();
    @org.junit.jupiter.api.Test
    void division() {
        Integer result = testing.division(10,5);
       assertEquals(2,2,"Il risultato è corretto");

    }

    @org.junit.jupiter.api.Test
    void division_Negativa() {
        Integer result = testing.division(10,-2);
        assertEquals(-5,result,"Il risultato è corretto");
    }

    @org.junit.jupiter.api.Test
    void division_Null() {
        Integer result = testing.division(10,null);
        assertNull(null,"Se un parametro è nulla anche il risultato è null");
    }
}