package C02ClassBasic;

public class C0205Constructor {
    public static void main(String[] args) {
        Calendar myCal = new Calendar("2024", "12", "11");
////        데이터의 안정성을 위해 일반적으로 setter를 사용하지 않음.
//        myCal.setYear(2024);
//        myCal.setMonth(12);
//        myCal.setDay(11);
        myCal.today();
    }
}

class Calendar {
    private String year;
    private String month;
    private String day;

//    생성자는 메서드의 일종으로 클래스명과 동일한 이름을 갖는 메서드.
//    생성자를 통해 객체변수값들을 객체가 만들어지는 시점에 초기화(세팅).
    public Calendar(String year, String month, String day){
        this.year = year;
        this.month = month;
        this.day = day;
    }
//    별도의 생성자를 만들경우, 기본생성자는 더 이상 사용할 수 없으므로 별도 추가 필요.
    public Calendar() {

    }

    public String getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public String getDay() {
        return day;
    }

    public void today () {
        System.out.println("오늘은 "+this.getYear()+"연도, "+this.getMonth()+"월, "+this.getDay()+"일 입니다.");
    }

}
