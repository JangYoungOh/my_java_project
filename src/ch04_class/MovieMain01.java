package ch04_class;

public class MovieMain01 {
    public static void main(String[] args) {
        Movie01 a = new Movie01();

        Movie01 b;
        b = new Movie01();

        a.name =  "용가리";
        a.food = "팝콘";
        a.nationality = "한국";
        a.time = 150;
        a.fee = 10000;
        a.ganre = "코미디";

        System.out.println("제목 : " + a.name);
        System.out.println("파는 음식 : " + a.food);
        System.out.println("나라 : " + a.nationality);
        System.out.println("상영시간 : " + a.time);
        System.out.println("관람가격 : " + a.fee);
        System.out.println("장르 : " + a.ganre);

        b.name =  "미이라";
        b.food = "감자튀김";
        b.nationality = "영국";
        b.time = 100;
        b.fee = 15000;
        b.ganre = "스릴러";

        System.out.println("제목 : " + b.name);
        System.out.println("파는 음식 : " + b.food);
        System.out.println("나라 : " + b.nationality);
        System.out.println("상영시간 : " + b.time);
        System.out.println("관람가격 : " + b.fee);
        System.out.println("장르 : " + b.ganre);

        String message = a.showFeeInfo();
        System.out.println(message);

        message = b.showFeeInfo();
        System.out.println(message);
    }

}
