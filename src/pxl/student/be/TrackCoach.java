package pxl.student.be;

public class TrackCoach implements Coach {
    private FortuneService fortuneService;

    TrackCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Run a hard 5k";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
