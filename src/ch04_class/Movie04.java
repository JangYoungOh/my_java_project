package ch04_class;

public class Movie04 {
    private String name;
    private String food;
    private String nationality;
    private double time;
    private double fee;
    private String ganre;

    public Movie04(String name, String food, String nationality, double time, double fee, String ganre){
        this.name= name;
        this.food= food;
        this.nationality = nationality;
        this.time = time;
        this. fee = fee;
        this.ganre = ganre;


    }
    public void display() {
        System.out.println("제목 : " + this.name);
        System.out.println("파는 음식 : " + this.food);
        System.out.println("나라 : " + this.nationality);
        System.out.println("상영시간 : " + this.time);
        System.out.println("관람가격 : " + this.fee);
        System.out.println("장르 : " + this.ganre);
    }
}
