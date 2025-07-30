package ch04_class;

public class Movie01 {
    String name; //제목
    String food; // 파는 음식
    String nationality; // 나라
    double time; // 상영시간
    double fee; // 관람가격
    String ganre; //장르


    String showFeeInfo() {
        String feee;
        if (fee >= 20000) {
            feee = "비싸다";

        } else if (fee >= 15000) {
            feee = "보통이다";
        } else {
            feee = "싸다";
        }
        String message = name + "의 영화가격은 " + feee + "군요.";
        return message;
    }


    void display() {
        System.out.println("보실 영화는 " + name + "이고 장르는 " + ganre);
        System.out.println("먹을음식 : " + food);
        System.out.println("상영시간 " + time + "분");
        System.out.println("관람가격 : " + fee + "원");
    }
}
