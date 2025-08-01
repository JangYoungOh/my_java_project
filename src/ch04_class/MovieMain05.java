package ch04_class;

public class MovieMain05 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        Movie05[] movie = new Movie05[2];

        movie[0] = new Movie05("용가리","팝콘","한국",150,10000,"코미디");
        movie[1] = new Movie05("미이라","감자튀김","영국",100,15000,"스릴러");

        for (int i = 0; i < movie.length; i++) {
            movie[i].display();
        }

    }
}
