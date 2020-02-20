package pxl.student.be;

public class FootballCoach implements Coach {
    private FortuneService fortuneService;

    FootballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout() {
        return "Score a goal without touching a player.";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
