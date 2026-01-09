package Passengers;

public class Passengers { 
    
    private String passName;
    private int age;
    private long phonenumber;
    private String startingStop;
    private String endingStop;

    public Passengers(String passName, int age, long phonenumber, String startingStop, String endingStop) {
        this.passName = passName;
        this.age = age;
        this.phonenumber = phonenumber;
        this.startingStop = startingStop;
        this.endingStop = endingStop;
    }

    public String getPassName() {
        return passName;
    }

    public int getAge() {
        return age;
    }

    public long getPhonenumber() {
        return phonenumber;
    }

    public String getStartingStop() {
        return startingStop;
    }

    public String getEndingStop() {
        return endingStop;
    }
}
