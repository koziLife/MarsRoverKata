import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class MarsRoverUnitTest {

    private MarsRover rover;

    @Before
    public void setUp() throws Exception {
        Position position = new Position(0, 0, "N");
        rover = new MarsRover(position);
    }

    @Test
    @Parameters({
            "R, 0 0 E",
            "RR, 0 0 S",
            "RRR, 0 0 W",
            "RRRR, 0 0 N"
    })
    public void turn_right_test(String newDirection, String expected) throws Exception {
        assertThat(rover.run(newDirection), is(expected));
    }

    @Test
    @Parameters({
            "L, 0 0 W",
            "LL, 0 0 S",
            "LLL, 0 0 E",
            "LLLL, 0 0 N"
    })
    public void turn_left_test(String newDirection, String expected) throws Exception {
        assertThat(rover.run(newDirection), is(expected));
    }

    @Test
    @Parameters({
            "M, 0 1 N",
            "MMMMMM, 0 5 N"
    })
    public void move_north_test(String newDirection, String expected) throws Exception {
        assertThat(rover.run(newDirection), is(expected));
    }

    @Test
    @Parameters({
            "LLM, 0 0 S",
            "MLLMM, 0 0 S"
    })
    public void move_south_test(String newDirection, String expected) throws Exception {
        assertThat(rover.run(newDirection), is(expected));
    }

    @Test
    @Parameters({
            "RM, 1 0 E",
            "RMMMMMM, 5 0 E"
    })
    public void move_east_test(String newDirection, String expected) throws Exception {
        assertThat(rover.run(newDirection), is(expected));
    }

    @Test
    @Parameters({
            "RMMLLM, 1 0 W",
            "LM, 0 0 W"
    })
    public void move_west_test(String newDirection, String expected) throws Exception {
        assertThat(rover.run(newDirection), is(expected));
    }
}
