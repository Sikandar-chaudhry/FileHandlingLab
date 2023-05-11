public class movieInfo {
    private String movieName;
    private int yearOfRelease;
    private double rating;
    private int budgetinM$;

    public movieInfo(String movieName, int yearOfRelease, double rating, int budget) {
        this.movieName = movieName;
        this.yearOfRelease = yearOfRelease;
        this.rating = rating;
        this.budgetinM$ = budget;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getBudget() {
        return budgetinM$;
    }

    public void setBudget(int budget) {
        this.budgetinM$ = budget;
    }

    @Override
    public String toString() {
        return "Movie Info : \n"+
                "Movie Name = "+movieName+
                "\nRelease Year "+yearOfRelease+
                "\nMovie Rating = "+rating+
                "\nMovie Budget in Million $ = "+budgetinM$;
    }
}
