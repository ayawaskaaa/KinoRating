package com.epam.kinorating.entity;

import java.sql.Date;

public class UserAction {
    private int ID;
    private int userID;
    private int movieID;
    private int rating;
    private String review;
    private Date dateValuation;
    private Date dateReview;

    public UserAction() {}

    public UserAction(int rating, Date dateValuation, String review, Date dateReview) {
        this.rating = rating;
        this.dateValuation = dateValuation;
        this.review = review;
        this.dateReview = dateReview;
    }

    public UserAction(int userID, int movieID, int rating, Date dateValuation) {
        this.userID = userID;
        this.movieID = movieID;
        this.rating = rating;
        this.dateValuation = dateValuation;
    }

    public UserAction(int userID, int movieID, String review, Date dateReview) {
        this.userID = userID;
        this.movieID = movieID;
        this.review = review;
        this.dateReview = dateReview;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getUserID() {
        return userID;
    }

    public void setUserID(int userID) {
        this.userID = userID;
    }

    public int getMovieID() {
        return movieID;
    }

    public void setMovieID(int movieID) {
        this.movieID = movieID;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public String getReview() {
        return review;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public Date getDateValuation() {
        return dateValuation;
    }

    public void setDateValuation(Date dateValuation) {
        this.dateValuation = dateValuation;
    }

    public Date getDateReview() {
        return dateReview;
    }

    public void setDateReview(Date dateReview) {
        this.dateReview = dateReview;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserAction that = (UserAction) o;

        if (ID != that.ID) return false;
        if (userID != that.userID) return false;
        if (movieID != that.movieID) return false;
        if (rating != that.rating) return false;
        if (review != null ? !review.equals(that.review) : that.review != null) return false;
        if (dateValuation != null ? !dateValuation.equals(that.dateValuation) : that.dateValuation != null)
            return false;
        return dateReview != null ? dateReview.equals(that.dateReview) : that.dateReview == null;
    }

    @Override
    public int hashCode() {
        int result = ID;
        result = 31 * result + userID;
        result = 31 * result + movieID;
        result = 31 * result + rating;
        result = 31 * result + (review != null ? review.hashCode() : 0);
        result = 31 * result + (dateValuation != null ? dateValuation.hashCode() : 0);
        result = 31 * result + (dateReview != null ? dateReview.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "UserAction{" +
                "ID=" + ID +
                ", userID=" + userID +
                ", movieID=" + movieID +
                ", rating=" + rating +
                ", review='" + review + '\'' +
                ", dateValuation=" + dateValuation +
                ", dateReview=" + dateReview +
                '}';
    }
}
