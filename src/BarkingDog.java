public class BarkingDog {
    public static boolean shouldWakeUp(boolean barking,int hourOfDay){
        if(hourOfDay<0||hourOfDay>23){
            return false;
        }
        else if(barking == true && (hourOfDay==23 || (hourOfDay>=0 && hourOfDay<=7)))
        {

            return true;
        }

        return false;
    }
}
