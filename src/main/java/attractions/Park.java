package attractions;

import people.Visitor;

public class Park extends Attraction {

    public Park(String name, int rating) {
        super(name, rating);
    }

    public boolean isAllowedTo(Visitor visitor){
        return visitor.getAge() <= 15;
    }
}
