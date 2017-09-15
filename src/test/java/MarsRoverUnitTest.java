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
            "R, E",
            "RR, S",
            "RRR, W",
            "RRRR, N"
    })
    public void turn_right_test(String newDirection, String expected) throws Exception {
        assertThat(new MarsRover().run(newDirection), is(expected));
    }
}
