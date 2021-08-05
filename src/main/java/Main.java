public class Main {

    public static boolean checkSum(int a,int b){
        int sum = a+b;
        if (10<sum&&sum<=20){
            return true;
        }else {
            return false;
        }
    }
    public static void checkNumber(int a){
        if (a<0){
            System.out.println("Число отрицательное");
        }else {
            System.out.println("Число положительное");
        }
    }
    public static boolean checkNumberBoolean(int a){
        if (a<0){
            return true;
        }
        else {
            return false;
        }
    }
    public static void printString(String string,int count){
        for (int i = 0; i < count; i++) {
            System.out.println(string);
        }
    }
    public static boolean checkLearYear(int year){
        if (year%4!=0){
            return false;
        }else if (year/400*400==year){
            return true;
        }else if (year%100==0){
            return false;
        }
        else return true;
    }
}
