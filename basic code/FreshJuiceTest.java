class Enums_FreshJuice{
    enum FreshJuiceSize {SMALL, MEDUIM, LARGE }
    FreshJuiceSize size;
    } 
    public class FreshJuiceTest{
    public static void main(String args[]){ 
    Enums_FreshJuice juice =new Enums_FreshJuice(); 
    juice.size =Enums_FreshJuice.FreshJuiceSize.MEDUIM ;
    }
}