public class Date {
    private int month;
    private int day;
    private int year;


    public Date(int intMonth, int intDay, int intYear){
        month=intMonth; 
        day=intDay;
        year=intYear;
    }

    public int getMonth(){
        return month;
    }
    public int getDay(){
        return day;
    }
    public int getYear(){
        return year;
    }

    public String toString(){
        String result="";
        if (month<10){
            result+="0"+month+"/";
        }else{
        result+=month+"/";
        }
        if(day<10){
            result+="0"+day+"/";
        }else{
        result+=day+"/";
        }
        // FIXME: I'm glad you checked for the year, but I don't think your logic quite works (see main method)
        if (year>23&&year<1000){
            result+="19"+year;
        }else if(year<1000){
        result+="20"+year;
        }else{
            result+=year;
        }
        return result;
    }

    public static void main(String[] args) {
        Date d1;
        d1 = new Date(4,9,2004);
        System.out.println(d1.toString());

        // TODO:
        Date d2 = new Date(4, 14, 937);
        System.out.println(d2); // expect: 04/14/0937

        Date d3 = new Date(10, 2, 7);
        System.out.println(d3);  // expect: 10/02/0007
    }

}