package ch01_variable_operator;
/*
   작성자 : 홍길동
   작성일 : 7월 23일
   목적 : 처음 해보는 자바 프로그래밍

   탭(tab) : 들여쓰기 내어 쓰기(shift + tab)
   소스 코드 자동으로 들여 쓰기
   IntelliJ : Ctrl + Alt + L
*/
public class MyPrint {
    public static void main(String[] args) {
        // 한줄 짜리 주석(comment) 단축키 : 컨트롤 슬래시
        System.out.println("홍"); // 성을 출력합니다.
        System.out.println(); // 엔터 누릅니다.
        // 이름을 출력합니다.
        System.out.println("길");
        System.out.println("동");

        System.out.print("대한 민국");
        System.out.println(" 화이팅");
        System.out.println();
        System.out.println("\"예체능\" 프로그램 메인 MC \'강호동\'");

        System.out.println();
        System.out.println("이름\t국어\t영어\t수학");
        System.out.println("김철수\t50\t60\t70");
        System.out.println("박영희\t30\t40\t50");

    }
}
