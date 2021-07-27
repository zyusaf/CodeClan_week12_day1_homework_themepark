import attractions.Attraction;
import behaviours.IReviewed;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<IReviewed> reviewed;

    public ThemePark() {
        this.reviewed = new ArrayList<>();
    }

    public ArrayList<IReviewed> getReviewed() {
        return reviewed;
    }

    public int reviewedSize(){
        return reviewed.size();
    }

    public void addReview(IReviewed review){
        reviewed.add(review);
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.addToVisitCount();
        visitor.addVisitedAttraction(attraction);
    }
}
