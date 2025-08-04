package ch05_package_inheritance.mysports;

public class BaseBall extends Sport {
    private int innings; // 이닝수
    private double hitrate; // 타율
    
    public BaseBall(String name, int entry, int innings, double hitrate){
        super(name, entry);
        this.innings = innings;
        this.hitrate = hitrate;
    }

    public void display() {
        super.showInfo();
        String message = innings + "의 이닝으로 구성되며, 타율 " + this.hitrate + "를 기록하였습니다.";
        System.out.println(message);
    }

}
