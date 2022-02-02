import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTest {

    @Test
    public void Greeting_Hello() {
        String name = "Lasse";

        Greeting greeting = new Greeting();
        assertEquals("Hello, Lasse.", greeting.greet(name));
    }

    @Test
    public void Greeting_Null() {
        String name = null;

        Greeting greeting = new Greeting();
        assertEquals("Hello, my friend.", greeting.greet(name));
    }

    @Test
    public void Greeting_Shout() {
        String name = "LASSE";

        Greeting greeting = new Greeting();
        assertEquals("HELLO, LASSE!", greeting.greet(name));
    }

    @Test
    public void Greeting_TwoNames() {
        String[] names = {"Lasse", "Mohammed"};

        Greeting greeting = new Greeting();
        assertEquals("Hello, Lasse and Mohammed.", greeting.greet(names));
    }

    @Test
    public void Greeting_MultipleNames() {
        String[] names = {"Lasse", "Mohammed", "Thomas"};

        Greeting greeting = new Greeting();
        assertEquals("Hello, Lasse, Mohammed and Thomas.", greeting.greet(names));
    }

    @Test
    public void Greeting_MultipleShout() {
        String[] names = {"LASSE", "Mohammed", "Thomas"};

        Greeting greeting = new Greeting();
        assertEquals("Hello, Mohammed and Thomas. AND HELLO LASSE!", greeting.greet(names));

        names = new String[] {"Lasse", "Mohammed", "THOMAS", "NIKOLAJ"};
        greeting = new Greeting();
        assertEquals("Hello, Lasse and Mohammed. AND HELLO THOMAS! AND HELLO NIKOLAJ!", greeting.greet(names));
    }

    @Test
    public void Greeting_CommaSeparated() {
        String name = "Lasse,Mohammed,Nikolaj";

        Greeting greeting = new Greeting();
        assertEquals("Hello, Lasse, Mohammed and Nikolaj.", greeting.greet(name));
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }
}