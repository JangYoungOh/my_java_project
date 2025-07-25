package ch02_control_statement;

public class MultiIf02 {
    public static void main(String[] args) {
        int age = 5 ;
        double ticket = 1000.0 ;
        double discount ; // 할인율
        String saram;
     if(age<8){
         ticket = 0;
         discount = 100;
         saram =  "유아";
     }else if(age<14){
         ticket = ticket/2;
         discount =50;
         saram =  "어린이";
     }
     else if(age<20){
         ticket = 0.7 * ticket;
         discount = 30;
         saram =  "청소년";
     }
     else if(age>=65){
         ticket = 0.6* ticket;
         discount =40;
         saram =  "노인";
     }
     else{
         ticket = 1000;
         discount = 0;
         saram =  "성인";
     }

     String message = age + "살 : " + saram + "(" + discount+"% 할인)"
                        +"가격은" + ticket+"원 입니다.";
        System.out.println(message);


    }
}
