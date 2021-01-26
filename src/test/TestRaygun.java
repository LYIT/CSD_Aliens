package test;
import com.company.Raygun;
import com.company.Alien;
import org.testng.Assert;
import org.testng.annotations.Test;

//Making a change here so I can commit this file

/**
 * testFireAtHit() The gun should only fire if it is charged.
 * Firing the gun will reduce the charge by 1.
 * If the bug isDodging bug.miss() should be called, otherwise bug.hit */
public class TestRaygun {

        private Raygun raygun;
        private Alien alien;
    @Test
    public void testFireAtHit() {

        int ExpectedAlienHealth = 0;
        //given
        alien = new Alien(false, 1);

        //when
        raygun.fireAt(alien);
        int ActualAlienHealth =  raygun.getcChrg();

        //then
        Assert.assertEquals(ExpectedAlienHealth, ActualAlienHealth);

    }
    @Test
    public void testFireAtMiss() throws Exception {

        //given
        Alien testAlien = new Alien(true, 1);

        //when
        raygun.fireAt(testAlien);
        int ActualAlienHealth =  raygun.getcChrg();

        //then
        Assert.assertEquals(ActualAlienHealth, " add expected");

    }

    @Test
    public void testIsChargedTrue() {

        //given
        Alien testAlien = new Alien(true, 1);

        //when
        boolean ExpectedResult= raygun.isCharged();

        //then
        Assert.assertEquals(ExpectedResult, "true");

    }
    public void testIsChargedFalse() {

        //given
        Alien testAlien = new Alien(true, 0);

        //when
        boolean ExpectedResult= raygun.isCharged();

        //then
        Assert.assertEquals(ExpectedResult, "false");

    }

    public void isFullyCharged(){

        //given
        Alien testAlien = new Alien(true, 0);

        //when
        boolean ExpectedResultBeforeCharge= raygun.isFullyCharged();
        boolean ExpectedResultAfterCharge= raygun.isCharged();



        //then
    }

    public void testFullyCharged() throws Exception {

        //given
        final int mChrg = 0;
        final int cChrg = 0;

        //when



        //then
    }
    @Test
    void teardown()
    {
        System.out.println("Rest");
    }

}
