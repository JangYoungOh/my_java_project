package ch07_collection.Crudboard;
// 이 클래스는 객체 1개를 생성해 내기 위한 탬플릿 클래스로써, 웹 프로그래밍에서는 이를 Bean 클래스라고 부릅니다.
public class Board {
    private int no ; //글번호
    private String title ; //제목
    private String writer ; // 작성자
    private String regdata ;// 작성일자
    private int readcount ; // 조회수

    //생성자, getter, setter, toString() 메소드 구현하기
    public Board(){}
    public Board(int no, String title, String writer, String regdata, int readcount) {
        this.no = no;
        this.title = title;
        this.writer = writer;
        this.regdata = regdata;
        this.readcount = readcount;
    }

    @Override
    public String toString() {
        return "Board{" +
                "no=" + no +
                ", title='" + title + '\'' +
                ", writer='" + writer + '\'' +
                ", regdata='" + regdata + '\'' +
                ", readcount=" + readcount +
                '}';
    }

    public int getNo() {
        return no;
    }

    public String getTitle() {
        return title;
    }

    public String getWriter() {
        return writer;
    }

    public String getRegdata() {
        return regdata;
    }

    public int getReadcount() {
        return readcount;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public void setRegdata(String regdata) {
        this.regdata = regdata;
    }

    public void setReadcount(int readcount) {
        this.readcount = readcount;
    }
}

