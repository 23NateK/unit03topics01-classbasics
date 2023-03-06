public class TimeV2 {
    private int timeSince;

    public TimeV2(int hours, int minutes, int seconds){
        timeSince=(hours*60*60)+(minutes*60)+seconds;
    }
    public int getHours(){
        return timeSince/60/60;
    }
    public int getMinutes(){
        return timeSince/60%60;
    }
    public int getSeconds(){
        return timeSince-(timeSince/60/60*60*60)-(timeSince/60%60*60);
    }
public String toString(){
    String result="";
        if(getHours()<10){
            result+="0"+getHours()+":";
        }else{
            result+=getHours()+":";
        }
        if(getMinutes()<10){
            result+="0"+getMinutes()+":";
        }else{
            result+=getMinutes()+":";
        }
        if(getSeconds()<1){
            result+="00";
        }else if(getSeconds()<10){
            result+="0"+getSeconds();
        }else{
            result+=getSeconds();
        }
        return result;
}
    public static void main(String[] args) {
        TimeV2 time = new TimeV2(7,2,0);
        System.out.println(time.toString());
    }
}
