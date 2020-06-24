package spring_boot_testng.testng_sping;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest(classes = TestNGWithSpringApplication.class)
public class TestNGTestsWithSpringBootIT extends AbstractTestNGSpringContextTests{

	@Test
    public void simpleTest() {
		System.out.println("Test 1 started!!!!");
        Assert.assertEquals(2 * 2, 4, "2x2 should be 4");
    }
}
