package interfaces;

public class FilmDetail {
    FilmObserver filmObserver;
    public void ratedByUser(int count){
        filmObserver.rateIt(count);
    }

    public FilmDetail(FilmObserver filmObserver) {
        this.filmObserver = filmObserver;
    }
}
