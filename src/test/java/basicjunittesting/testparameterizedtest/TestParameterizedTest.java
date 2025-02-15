package basicjunittesting.testparameterizedtest;

import org.junit.jupiter.params.ParameterizedTest;
import static org.junit.jupiter.api.Assertions.*;
import com.tit.junit.basicproblem.parameterizedtest.Parameterized;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.params.provider.ValueSource;

public class TestParameterizedTest {
    static Parameterized parameterized;
    @BeforeAll
    static void setUp(){
        parameterized = new Parameterized();
    }
    @ParameterizedTest
    @ValueSource (ints = {2 , 4 , 6 ,7 ,9})
    void testEvenNumbers(int number){
        assertTrue(parameterized.isEven(number));
    }
}
