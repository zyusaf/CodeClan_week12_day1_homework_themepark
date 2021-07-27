import attractions.Attraction;
import attractions.RollerCoaster;
import attractions.RollercoasterTest;
import org.junit.Before;
import org.junit.Test;
import people.Visitor;
import stalls.IceCreamStall;
import stalls.ParkingSpot;

import static org.junit.Assert.assertEquals;

public class TestThemePark {

    ThemePark themePark;
    IceCreamStall iceCreamStall;
    RollerCoaster rollercoster;

    @Before
    public void before(){
        iceCreamStall = new IceCreamStall("Cream", "Dave", ParkingSpot.A2, 3);
        rollercoster = new RollerCoaster("Blue Ridge", 10);
        themePark = new ThemePark();
    }

    @Test
    public void canGetReviewed(){
        themePark.addReview(rollercoster);
        assertEquals(1, themePark.reviewedSize());
    }

    @Test
    public void canVisit(){
        Visitor visitor = new Visitor(25, 800.00, 70.00);
        themePark.visit(visitor, rollercoster);
        assertEquals(1, rollercoster.getVisitCount());
        assertEquals(1, visitor.getVisitedAttractionsSize());
    }
}
