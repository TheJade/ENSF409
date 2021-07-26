package Lab1.Q6;

public class Clock {
    private int day, hour, minute, second;

    //constructors
    public Clock(int new_day, int new_hour, int new_minute, int new_second)
    {
        day = new_day;
        hour = new_hour;
        minute = new_minute;
        second = new_second;
    }
    public Clock()
    {
        day = 0;
        hour = 0;
        minute = 0;
        second = 0;
    }

    //geting values from Clock
    public int getDay() {
        return day;
    }
    public int getHour() {
        return hour;
    }
    public int getMinute() {
        return minute;
    }
    public int getSecond() {
        return second;
    }
    
    //set values for Clock
    public void setDay(int new_day)  {
        day = new_day;  //no limit on new_day range
    }

    public void setHour(int new_hour)  {
        if (new_hour > 23 || new_hour < 0)  {
            //not valid range
            System.out.println("setHour's argument was out of valid range");
        }
        else    {
            hour = new_hour;
        }       
    }

    public void setMinute(int new_min)  {
        if (new_min > 59 || new_min < 0)  {
            //not valid range
            System.out.println("setMinute's argument was out of valid range");
        }
        else    {
            minute = new_min;
        }       
    }

    public void setSecond(int new_sec)  {
        if (new_sec > 59 || new_sec < 0)  {
            //not valid range
            System.out.println("setSecond's argument was out of valid range");
        }
        else    {
            second = new_sec;
        }       
    }

    //other methods
    public void increment(int add_seconds) {
        day += add_seconds / 86400; //if seconds added are larger than a day of time it adds to day
        add_seconds = add_seconds-(86400 * (add_seconds/86400));    //removes seconds added to day value
        hour +=  add_seconds / 3600;
        add_seconds = add_seconds-(3600 * (add_seconds/3600));  //removes seconds added to hour value
        minute += add_seconds / 60;
        add_seconds = add_seconds-(60 * (add_seconds/60));  //removes seconds added to minute value
        second += add_seconds;
        
        if (second > 59)    {   //increments the other values if it carries over the valid range
            second = second % 60;
            minute += 1;
        }
        if (minute > 59)    {
            minute = 0;
            hour += 1;
        }
        if (hour > 23)    {
            hour = 0;
            day += 1;
        }
    }

    public int calculateTotalSeconds()  {
        return (86400*day + 3600*hour + 60*minute + second);
    }

    public static void main(String[]args)   {
        //Create elapsed time with the default values of zeros for day, hour minute and second.
        Clock t1 = new Clock(); // Default constructor
        //sets hour to 23
        t1.setHour(23);
        //sets day to 1
        t1.setDay(1);
        // sets minute to 59
        t1.setMinute(59);
        //sets day to 16
        t1.setSecond(16);

        //prints: 1:23:59:16
        System.out.println(t1.getDay() + ":" + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());

        // increments time t1 by 44 seconds:
        t1.increment(44);
        // prints: 2:0:0:0
        System.out.println(t1.getDay() + ":" + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());

        //prints the total elapsed time in seconds: 172,800
        System.out.printf("The elapsed time in seconds is: %d\n", t1.calculateTotalSeconds());

        //REPEAT SIMULAR TESTS FOR t2
        //Elapsed time is 3 day, 1 hour , 4 mins and 5 secs

        System.out.println("\nt2 Testing has started...");
        Clock t2 = new Clock(3, 1, 4, 5);

        //should add exactly 1 day to the Clock
        t2.increment(86400);
        System.out.println("Expected is: 4:1:4:5, Real value is: " + t2.getDay() + ":" + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());

        //adds 1 min and 59 seconds to the time
        t2.increment(119);
        System.out.println("Expected is: 4:1:6:4, Real value is: " + t2.getDay() + ":" + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());

        //assigns new values for the t2 Clock
        t2.setDay(0);
        t2.setHour(7);
        t2.setMinute(37);
        t2.setSecond(16);

        //prints the total elapsed time in seconds: 172,800
        System.out.printf("Expected elapsed time in seconds is: 27436, Real elapsed time in seconds is: %d\n", t2.calculateTotalSeconds());
    }

}
