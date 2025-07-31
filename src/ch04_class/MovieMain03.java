package ch04_class;

public class MovieMain03 {
    public static void main(String[] args) {

        Movie03 yong = new Movie03();

        Movie03 mira = new Movie03();

        yong.setName("용가리");
        yong.setFood("팝콘");
        yong.setNationality("한국");
        yong.setTime(150);
        yong.setFee(10000);
        yong.setGanre("코미디");



        System.out.println("제목 : " + yong.getName());
        System.out.println("파는 음식 : " + yong.getFood());
        System.out.println("나라 : " + yong.getNationality());
        System.out.println("상영시간 : " + yong.getTime());
        System.out.println("관람가격 : " + yong.getFee());
        System.out.println("장르 : " + yong.getGanre());

        mira.setName("미이라");
        mira.setFood("감자튀김");
        mira.setNationality("영국");
        mira.setTime(100);
        mira.setFee(15000);
        mira.setGanre("스릴러");



        System.out.println("제목 : " + mira.getName());
        System.out.println("파는 음식 : " + mira.getFood());
        System.out.println("나라 : " + mira.getNationality());
        System.out.println("상영시간 : " + mira.getTime());
        System.out.println("관람가격 : " + mira.getFee());
        System.out.println("장르 : " + mira.getGanre());


    }

}
