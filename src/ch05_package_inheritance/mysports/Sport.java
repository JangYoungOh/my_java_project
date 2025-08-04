package ch05_package_inheritance.mysports;

public class Sport {
    private String name; // 종목이름
    private int entry; // 선수 명수

    public Sport(String name, int entry) {
         this.name = name;
         this.entry = entry;
    }
    protected void showInfo() {
        String message = name + "경기는 " + this.entry + "의 엔트리로 구성이 됩니다.";
        System.out.println(message);

    }
}
