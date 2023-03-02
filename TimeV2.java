public class TimeV2 {
    private int timeSince;

    public TimeV2(int hours, int minutes, int seconds){
        timeSince=(hours*60*60)+(minutes*60)+seconds;
    }
    public int gettimeSince(){
        return timeSince;
    }
public String toString(){
    String result="";
        if((timeSince/60/60)<10){
            result+="0"+(timeSince/60/60)+":";
        }else{
            result+=(timeSince/60/60)+":";
        }
        if((timeSince/60%60)<10){
            result+="0"+(timeSince/60%60)+":";
        }else{
            result+=(timeSince/60%60)+":";
        }
        //don't question this
        if((timeSince-(timeSince/60/60*60*60)-(timeSince/60%60*60))<1){
            result+="00";
        }else if((timeSince-(timeSince/60/60*60*60)-(timeSince/60%60*60))<10){
            result+="0"+(timeSince-(timeSince/60/60*60*60)-(timeSince/60%60*60));
        }else{
            result+=(timeSince-(timeSince/60/60*60*60)-(timeSince/60%60*60));
        }
        return result;
}
    public static void main(String[] args) {
        TimeV2 time = new TimeV2(7,2,0);
        System.out.println(time.toString());
    }
}
