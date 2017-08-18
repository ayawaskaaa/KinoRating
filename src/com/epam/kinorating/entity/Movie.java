package com.epam.kinorating.entity;

public class Movie {
    private int id;
    private String name_ru;
    private String name_en;
    private String genre_ru;
    private String genre_en;
    private int year;
    private String title_ru;
    private String title_en;
    private String country_ru;
    private String country_en;
    private int duration;
    private String cast_ru;
    private String cast_en;
    private String awards_ru;
    private String awards_en;
    private String image;
    private boolean tvSerial;

    public Movie() {}

    public Movie(String name_ru, String name_en, String genre_ru, String genre_en, int year, String title_ru,
                 String title_en, String country_ru, String country_en, int duration, String cast_ru, String cast_en,
                 String awards_ru, String awards_en, boolean tvSerial, String image) {
        this.name_ru = name_ru;
        this.name_en = name_en;
        this.genre_ru = genre_ru;
        this.genre_en = genre_en;
        this.year = year;
        this.title_ru = title_ru;
        this.title_en = title_en;
        this.country_ru = country_ru;
        this.country_en = country_en;
        this.duration = duration;
        this.cast_ru = cast_ru;
        this.cast_en = cast_en;
        this.awards_ru = awards_ru;
        this.awards_en = awards_en;
        this.image = image;
        this.tvSerial = tvSerial;
    }

    public Movie(int id, String name_ru, String name_en, String genre_ru, String genre_en, int year,
                 String country_ru, String country_en) {
        this.id = id;
        this.name_ru = name_ru;
        this.name_en = name_en;
        this.genre_ru = genre_ru;
        this.genre_en = genre_en;
        this.year = year;
        this.country_ru = country_ru;
        this.country_en = country_en;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName_ru() {
        return name_ru;
    }

    public void setName_ru(String name_ru) {
        this.name_ru = name_ru;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public String getGenre_ru() {
        return genre_ru;
    }

    public void setGenre_ru(String genre_ru) {
        this.genre_ru = genre_ru;
    }

    public String getGenre_en() {
        return genre_en;
    }

    public void setGenre_en(String genre_en) {
        this.genre_en = genre_en;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle_ru() {
        return title_ru;
    }

    public void setTitle_ru(String title_ru) {
        this.title_ru = title_ru;
    }

    public String getTitle_en() {
        return title_en;
    }

    public void setTitle_en(String title_en) {
        this.title_en = title_en;
    }

    public String getCountry_ru() {
        return country_ru;
    }

    public void setCountry_ru(String country_ru) {
        this.country_ru = country_ru;
    }

    public String getCountry_en() {
        return country_en;
    }

    public void setCountry_en(String country_en) {
        this.country_en = country_en;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String getCast_ru() {
        return cast_ru;
    }

    public void setCast_ru(String cast_ru) {
        this.cast_ru = cast_ru;
    }

    public String getCast_en() {
        return cast_en;
    }

    public void setCast_en(String cast_en) {
        this.cast_en = cast_en;
    }

    public String getAwards_ru() {
        return awards_ru;
    }

    public void setAwards_ru(String awards_ru) {
        this.awards_ru = awards_ru;
    }

    public String getAwards_en() {
        return awards_en;
    }

    public void setAwards_en(String awards_en) {
        this.awards_en = awards_en;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public boolean isTvSerial() {
        return tvSerial;
    }

    public void setTvSerial(boolean tvSerial) {
        this.tvSerial = tvSerial;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Movie movie = (Movie) o;

        if (id != movie.id) return false;
        if (year != movie.year) return false;
        if (duration != movie.duration) return false;
        if (tvSerial != movie.tvSerial) return false;
        if (name_ru != null ? !name_ru.equals(movie.name_ru) : movie.name_ru != null) return false;
        if (name_en != null ? !name_en.equals(movie.name_en) : movie.name_en != null) return false;
        if (genre_ru != null ? !genre_ru.equals(movie.genre_ru) : movie.genre_ru != null) return false;
        if (genre_en != null ? !genre_en.equals(movie.genre_en) : movie.genre_en != null) return false;
        if (title_ru != null ? !title_ru.equals(movie.title_ru) : movie.title_ru != null) return false;
        if (title_en != null ? !title_en.equals(movie.title_en) : movie.title_en != null) return false;
        if (country_ru != null ? !country_ru.equals(movie.country_ru) : movie.country_ru != null) return false;
        if (country_en != null ? !country_en.equals(movie.country_en) : movie.country_en != null) return false;
        if (cast_ru != null ? !cast_ru.equals(movie.cast_ru) : movie.cast_ru != null) return false;
        if (cast_en != null ? !cast_en.equals(movie.cast_en) : movie.cast_en != null) return false;
        if (awards_ru != null ? !awards_ru.equals(movie.awards_ru) : movie.awards_ru != null) return false;
        if (awards_en != null ? !awards_en.equals(movie.awards_en) : movie.awards_en != null) return false;
        return image != null ? image.equals(movie.image) : movie.image == null;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name_ru != null ? name_ru.hashCode() : 0);
        result = 31 * result + (name_en != null ? name_en.hashCode() : 0);
        result = 31 * result + (genre_ru != null ? genre_ru.hashCode() : 0);
        result = 31 * result + (genre_en != null ? genre_en.hashCode() : 0);
        result = 31 * result + year;
        result = 31 * result + (title_ru != null ? title_ru.hashCode() : 0);
        result = 31 * result + (title_en != null ? title_en.hashCode() : 0);
        result = 31 * result + (country_ru != null ? country_ru.hashCode() : 0);
        result = 31 * result + (country_en != null ? country_en.hashCode() : 0);
        result = 31 * result + duration;
        result = 31 * result + (cast_ru != null ? cast_ru.hashCode() : 0);
        result = 31 * result + (cast_en != null ? cast_en.hashCode() : 0);
        result = 31 * result + (awards_ru != null ? awards_ru.hashCode() : 0);
        result = 31 * result + (awards_en != null ? awards_en.hashCode() : 0);
        result = 31 * result + (image != null ? image.hashCode() : 0);
        result = 31 * result + (tvSerial ? 1 : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", name_ru='" + name_ru + '\'' +
                ", name_en='" + name_en + '\'' +
                ", genre_ru='" + genre_ru + '\'' +
                ", genre_en='" + genre_en + '\'' +
                ", year=" + year +
                ", title_ru='" + title_ru + '\'' +
                ", title_en='" + title_en + '\'' +
                ", country_ru='" + country_ru + '\'' +
                ", country_en='" + country_en + '\'' +
                ", duration=" + duration +
                ", cast_ru='" + cast_ru + '\'' +
                ", cast_en='" + cast_en + '\'' +
                ", awards_ru='" + awards_ru + '\'' +
                ", awards_en='" + awards_en + '\'' +
                ", image='" + image + '\'' +
                ", tvSerial=" + tvSerial +
                '}';
    }
}