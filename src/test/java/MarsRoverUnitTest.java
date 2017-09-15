import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class MarsRoverUnitTest {


    @Test
    @Parameters({
            "R, 0 0 E",
            "RR, 0 0 S",
            "RRR, 0 0 W",
            "RRRR, 0 0 N"
    })
    public void turn_right_test(String newDirection, String expected) throws Exception {
        assertThat(new MarsRover().run(newDirection), is(expected));
    }

    @Test
    @Parameters({
            "L, 0 0 W",
            "LL, 0 0 S",
            "LLL, 0 0 E",
            "LLLL, 0 0 N"
    })
    public void turn_left_test(String newDirection, String expected) throws Exception {
        assertThat(new MarsRover().run(newDirection), is(expected));
    }

    @Test
    @Parameters({
            "M, 0 1 N"
    })
    public void move_test(String newDirection, String expected) throws Exception {
        assertThat(new MarsRover().run(newDirection), is(expected));
    }
}
