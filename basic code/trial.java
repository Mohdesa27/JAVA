public class trial {
    public static void main(String[] args){
        int v=39;
        float size=1.5f;
        int dayinitial=20;
        int month_days=30;
        int lastdays=30;
        int total_days;
        float perday_work;
        total_days=(month_days-dayinitial)+lastdays;
        System.out.println(total_days);
        perday_work=(v*size)/total_days;
        System.out.println(perday_work+"hours");

    }
}
