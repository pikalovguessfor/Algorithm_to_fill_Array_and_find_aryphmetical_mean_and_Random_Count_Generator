import java.util.Calendar;

public class Random
{

    /*
    * Class with method to create a random number to using next
    * Own developed.
    */

    public static int Rand(){

        int CurrentDateMS = (int)Calendar.getInstance().getTimeInMillis();

        int Seed = (CurrentDateMS * 214052 + 2531011);
        Seed = Seed % 32416;
        Seed = Seed + 1;
        return Seed;
    }


}
