public class secondToMinutesConversion {
    public static String getDurationString(long min,long sec){
        if(min<0 || ((sec <0 || sec>59))){
            System.out.println("Invalid Input");
            return "invalid value";
        }
        else{
            long hr=min/60;
            long remainingMinutes=min%60;
            String StringHours= hr + "h";
            if(hr<10){
                StringHours="0"+ StringHours;
            }
            String StringMinutes= remainingMinutes + "m";
            if(remainingMinutes<10){
                StringMinutes="0"+ StringMinutes;
            }

            String StringSec= sec + "s";
            if(sec<10){
                StringSec="0"+ StringSec;
            }
            return StringHours+" "+ StringMinutes+ " " +StringSec;
        }
    }
    public static String getDurationString(long sec){
        if(sec<0){
            return "invalid input";
        }
        else{
            long min=sec/60;
            long remainingSec=sec%60;
            return getDurationString(min,remainingSec);
        }
    }

    public static void main(String[] args) {
        System.out.println(getDurationString(65,45));
        System.out.println(getDurationString(3945l));
        System.out.println("What is your name?" +
                "MySelf Girish H S " +
                "From which section do you belong to?"
                );
        System.out.println(5*40);
        System.out.println(12*4);
    }
}
