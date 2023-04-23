package com.prasant.WeeklyTest4.Services;

import com.prasant.WeeklyTest4.Models.Resturant;
import com.prasant.WeeklyTest4.Repositories.ResturantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResturantService {

    @Autowired
    ResturantDao resturantDao;

    public Object getResturantById(int resturantId) {
        try {
            return resturantDao.getAll().get(resturantId);
        } catch (IndexOutOfBoundsException e) {
            return "Invalid Resturant ID : " + resturantId;
        } catch (Exception e) {
            return "Adding Resturant failed....!!!";
        }
    }

    public List<Resturant> getAllResturants() {
        return resturantDao.getAll();
    }

    public String addResturant(Resturant resturant) {
        if (resturantDao.add(resturant))
            return "Resturant added successfully....!!!";
        else
            return "Adding Resturant failed....!!!";
    }

    public String updateResturantById(int resturantId, Resturant updatedResturant) {
        try {
            resturantDao.update(resturantId, updatedResturant);
            return "Updated Resturant successfully....!!!";
        } catch (IndexOutOfBoundsException e) {
            return "Invalid Resturant ID : " + resturantId;
        } catch (Exception e) {
            return "Updating Resturant failed....!!!";
        }
    }

    public String deleteResturantById(int resturantId) {
        try {
            resturantDao.remove(resturantId);
            return "Resturant deleted successfully....!!!";
        } catch (IndexOutOfBoundsException ex) {
            return "Invalid Resturant ID : " + resturantId;
        } catch (Exception e) {
            return "Deleting Resturant failed....!!!";
        }
    }
}
