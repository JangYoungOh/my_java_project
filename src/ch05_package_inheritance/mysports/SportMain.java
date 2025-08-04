package ch05_package_inheritance.mysports;

public class SportMain {
    public static void main(String[] args) {
            FootBall footBall = new FootBall("축구",11,1,5); // 이름, 엔트리, 하프타임, 골수
        footBall.display();

            BaseBall baseBall = new BaseBall("야구", 9, 9, 0.412); // 이름, 엔트리, 이닝수, 타율
        baseBall.display();
    }
}
