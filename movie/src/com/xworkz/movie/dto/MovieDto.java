package com.xworkz.movie.dto;

import java.util.Objects;

public class MovieDto {

    private int movieID;
    private long boxOfficeCollection;
    private boolean is3D;
    private char certification;
    private double budget;
    private float runtimeHours;

    private String title;
    private String director;
    private Integer releaseYear;
    private Long imdbVotes;
    private Double imdbRating;
    private Float userRating;
    private Boolean isHit;

    public void setMovieID(int movieID) { this.movieID = movieID; }
    public void setBoxOfficeCollection(long boxOfficeCollection) { this.boxOfficeCollection = boxOfficeCollection; }
    public void setIs3D(boolean is3D) { this.is3D = is3D; }
    public void setCertification(char certification) { this.certification = certification; }
    public void setBudget(double budget) { this.budget = budget; }
    public void setRuntimeHours(float runtimeHours) { this.runtimeHours = runtimeHours; }
    public void setTitle(String title) { this.title = title; }
    public void setDirector(String director) { this.director = director; }
    public void setReleaseYear(Integer releaseYear) { this.releaseYear = releaseYear; }
    public void setImdbVotes(Long imdbVotes) { this.imdbVotes = imdbVotes; }
    public void setImdbRating(Double imdbRating) { this.imdbRating = imdbRating; }
    public void setUserRating(Float userRating) { this.userRating = userRating; }
    public void setIsHit(Boolean isHit) { this.isHit = isHit; }

    public int getMovieID() { return movieID; }
    public long getBoxOfficeCollection() { return boxOfficeCollection; }
    public boolean isIs3D() { return is3D; }
    public char getCertification() { return certification; }
    public double getBudget() { return budget; }
    public float getRuntimeHours() { return runtimeHours; }
    public String getTitle() { return title; }
    public String getDirector() { return director; }
    public Integer getReleaseYear() { return releaseYear; }
    public Long getImdbVotes() { return imdbVotes; }
    public Double getImdbRating() { return imdbRating; }
    public Float getUserRating() { return userRating; }
    public Boolean getIsHit() { return isHit; }

    @Override
    public int hashCode() {
        return Objects.hash(movieID, boxOfficeCollection, is3D, certification, budget, runtimeHours,
                title, director, releaseYear, imdbVotes, imdbRating, userRating, isHit);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof MovieDto)) return false;
        MovieDto other = (MovieDto) obj;
        return movieID == other.movieID &&
                boxOfficeCollection == other.boxOfficeCollection &&
                is3D == other.is3D &&
                certification == other.certification &&
                Double.compare(other.budget, budget) == 0 &&
                Float.compare(other.runtimeHours, runtimeHours) == 0 &&
                Objects.equals(title, other.title) &&
                Objects.equals(director, other.director) &&
                Objects.equals(releaseYear, other.releaseYear) &&
                Objects.equals(imdbVotes, other.imdbVotes) &&
                Objects.equals(imdbRating, other.imdbRating) &&
                Objects.equals(userRating, other.userRating) &&
                Objects.equals(isHit, other.isHit);
    }

    @Override
    public String toString() {
        return "MovieDto { movieID=" + movieID + ", boxOfficeCollection=" + boxOfficeCollection + ", is3D=" + is3D + ", certification=" + certification + ", budget=" + budget + ", runtimeHours=" + runtimeHours + ", title='" + title + "', director='" + director + "', releaseYear=" + releaseYear + ", imdbVotes=" + imdbVotes + ", imdbRating=" + imdbRating + ", userRating=" + userRating + ", isHit=" + isHit + "}";
    }
}