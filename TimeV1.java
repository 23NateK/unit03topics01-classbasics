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
        if(seconds<1){
            result+="00";
        }else if(seconds<10){
            result+="0"+seconds;
        }
        else{
        result+=seconds;
        }
        return result;
}


    public static void main(String[] args) {
        TimeV1 time = new TimeV1(7,2,4);
        System.out.println(time.toString());

    }
}
// good