public class TimeV1 {
    private int hours;
    private int minutes;
    private int seconds;

    public TimeV1(int intHours, int intMinutes, int intSeconds){
        hours=intHours;
        minutes=intMinutes;
        seconds=intSeconds;
    }
    public int getHours(){
        return hours;
    }
    public int getMinutes(){
        return minutes;
    }
    public int getSeconds(){
        return seconds;
    }
public String toString(){
    String result="";
        if (hours<10){
            result+="0"+hours+":";
        }else{
        result+=hours+":";
        }
        if(minutes<10){
            result+="0"+minutes+":";
        }else{
        result+=minutes+":";
        }
        result+=seconds;
        return result;
}


    public static void main(String[] args) {
        TimeV1 time = new TimeV1(7,02,23);
        System.out.println(time.toString());

    }
}
