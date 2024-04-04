public class Time {
    // Getters and setters
    private int hours;
    private int minutes;
    private int seconds;

    // Constructor and initializer :3
    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    // Getters and Setters
    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if (hours >= 0 && hours < 24) { // 24 hours in one day :3
            this.hours = hours;
        } else {
            this.hours = 0; // Default value
        }
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60) { // 60 secs in a minutes :3
            this.seconds = seconds;
        } else {
            this.seconds = 0; // Default value
        }
    }

    public int getMinutes() {
        return minutes;
    }
    public void setMinutes (int minutes) {
        if (minutes >= 0 && minutes < 60) { // 60 mins in 1 hour :3
            this.minutes = minutes;
        } else {
            this.minutes = 0; // Default value
        }
    }

    @Override // To not return address hehe
    public String toString() {
        return String.format("%02d:%02d:%02d", hours, minutes, seconds);
    }

    public static void main (String [] args) {
        // Test our code meow :3
        // Create new object !
        Time time = new Time(1, 5, 37);
        System.out.println("Current Time: " + time  + " =(^.__.^)=");

        // Test setters
        time.setHours(7);
        System.out.println("New Time: " + time);
    }
}


