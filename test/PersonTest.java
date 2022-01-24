import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p1, p2;

    @BeforeEach
    void setUp() {
        p1 = new Person("000001", "Bob", "tester", "Mr.", 1996);
        p2 = new Person("000002", "Jim", "tester", "Mr.", 1997);
    }

    @Test
    void fullName() {
    }

    @Test
    void formalName() {
    }

    @Test
    void getAge() {
    }

    @Test
    void testGetAge() {
    }

    @Test
    void toCSVDataRecord() {
    }
}