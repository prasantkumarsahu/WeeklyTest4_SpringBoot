package com.prasant.WeeklyTest4.Models;

public class Resturant {
    private String resturantName;
    private String resturantAddress;
    private long resturantContact;
    private String spaciality;
    private int totalStaffs;
    private Review review;
    private int numberOfReviews;

    public Resturant(String resturantName, String resturantAddress, long resturantContact, String spaciality, int totalStaffs, Review review, int numberOfReviews) {
        this.resturantName = resturantName;
        this.resturantAddress = resturantAddress;
        this.resturantContact = resturantContact;
        this.spaciality = spaciality;
        this.totalStaffs = totalStaffs;
        this.review = review;
        this.numberOfReviews = numberOfReviews;
    }

    public String getResturantName() {
        return resturantName;
    }

    public void setResturantName(String resturantName) {
        this.resturantName = resturantName;
    }

    public String getResturantAddress() {
        return resturantAddress;
    }

    public void setResturantAddress(String resturantAddress) {
        this.resturantAddress = resturantAddress;
    }

    public long getResturantCoontact() {
        return resturantContact;
    }

    public void setResturantCoontact(long resturantCoontact) {
        this.resturantContact = resturantCoontact;
    }

    public String getSpaciality() {
        return spaciality;
    }

    public void setSpaciality(String spaciality) {
        this.spaciality = spaciality;
    }

    public int getTotalStaffs() {
        return totalStaffs;
    }

    public void setTotalStaffs(int totalStaffs) {
        this.totalStaffs = totalStaffs;
    }

    public Review getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review = review;
    }

    public int getNumberOfReviews() {
        return numberOfReviews;
    }

    public void setNumberOfReviews(int numberOfReviews) {
        this.numberOfReviews = numberOfReviews;
    }
}
