import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {
    Person p1;
    @BeforeEach
    void setUp() {
    p1 = new Person("000001", "John", "Tester", "Mr.", 1995);
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