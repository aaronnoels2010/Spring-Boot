package pxl.student.be;

public class CricketCoach implements Coach {
    private FortuneService fortuneService;
    private String emailAddress;
    private String name;

    @Override
    public String getDailyWorkout() {
        return "Practice fast bowling for 15 minutes";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }

    public void setFortuneService(FortuneService fortuneService) {
        this.fortuneService = fortuneService;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CricketCoach{" +
                "emailAddress='" + emailAddress + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
