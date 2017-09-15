import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

@RunWith(JUnitParamsRunner.class)
public class AcceptanceTest {

    @Test
    @Parameters({
            "5 5\n1 2 N\nLMLMLMLMM, 1 3 N",
            "5 5\n2 3 W\nLMRMRMMLMMM, 0 4 W"
    })
    public void acceptance_rover_run_test(String command, String finalPosition) throws Exception {
        NasaLauncher launcher = new NasaLauncher(command);
        assertThat(launcher.launch(), is(finalPosition));
    }

}
