import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class MarsRoverTest {

    @Test
    public void acceptance_rover_run_test() throws Exception {
        assertThat(new MarsRover().run("5 5\\n1 2 N\\nLMLMLMLMM"), is("1 3 N"));
    }

}
