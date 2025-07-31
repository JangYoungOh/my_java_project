package ch04_class;

public class Movie03 {
    private String name; //제목
    private String food; // 파는 음식
    private String nationality; // 나라
    private double time; // 상영시간
    private double fee; // 관람가격
    private String ganre; //장르

    public void setName(String name) {
        this.name = name ;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setTime(double time) {
        this.time = time;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }

    public void setGanre(String ganre) {
        this.ganre = ganre;
    }

    public String getName() {
        return name;
    }

    public String getFood() {
        return food;
    }

    public String getNationality() {
        return nationality;
    }

    public double getTime() {
        return time;
    }

    public double getFee() {
        return fee;
    }

    public String getGanre() {
        return ganre;
    }
}

