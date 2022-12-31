package interfaces;

public class FilmList implements FilmObserver {

    FilmDetail filmDetail;
    @Override
    public void rateIt(int count) {
        System.out.println("film star sayisi: " + count);
    }

    public void watchFilm(){
        filmDetail = new FilmDetail(this);
    }

    public void refreshScreen(){
        filmDetail.ratedByUser(3);
    }
}
