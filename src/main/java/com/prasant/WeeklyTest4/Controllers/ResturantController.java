package com.prasant.WeeklyTest4.Controllers;

import com.prasant.WeeklyTest4.Models.Resturant;
import com.prasant.WeeklyTest4.Services.ResturantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ResturantController {

    @Autowired
    ResturantService resturantService;

    @GetMapping("Resturant/{resturantId}")
    public Object getResturantById(@PathVariable int resturantId) {
        return resturantService.getResturantById(resturantId);
    }

    @GetMapping("Resturants")
    public List<Resturant> getAllResturants() {
        return resturantService.getAllResturants();
    }

    @PostMapping("Resturant")
    public String addResturant(@RequestBody Resturant resturant) {
        return resturantService.addResturant(resturant);
    }

    @PutMapping("Resturant/All/{resturantId}")
    public String updateResturantById(@PathVariable int resturantId, @RequestBody Resturant updatedResturant) {
        return resturantService.updateResturantById(resturantId, updatedResturant);
    }

    @DeleteMapping("Resturant/{resturantId}")
    public String deleteResturantById(@PathVariable int resturantId) {
        return resturantService.deleteResturantById(resturantId);
    }
}
