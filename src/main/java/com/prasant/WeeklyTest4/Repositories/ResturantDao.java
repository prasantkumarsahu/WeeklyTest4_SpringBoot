package com.prasant.WeeklyTest4.Repositories;

import com.prasant.WeeklyTest4.Models.Resturant;
import com.prasant.WeeklyTest4.Models.Review;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ResturantDao {

    private final List<Resturant> resturantList;

    public ResturantDao() {
        resturantList = new ArrayList<>();
        resturantList.add(new Resturant("Demo", "Angul", 7947583929l, "Vegan", 50, Review.OK, 1500));
    }

    public List<Resturant> getAll() {
        return resturantList;
    }

    public boolean add(Resturant resturant) {
        resturantList.add(resturant);
        return true;
    }

    public Resturant remove(int resturantId) {
        return resturantList.remove(resturantId);
    }

    public Resturant update(int resturantId, Resturant updatedResturant) {
        return resturantList.set(resturantId, updatedResturant);
    }
}
