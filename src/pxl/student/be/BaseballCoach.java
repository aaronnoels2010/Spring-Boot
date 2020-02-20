package pxl.student.be;

public class BaseballCoach implements Coach {

    private FortuneService fortuneService;

    BaseballCoach(FortuneService fortuneService){
        this.fortuneService = fortuneService;
    }

    @Override
    public String getDailyWorkout(){
        return "Spending 30 minutes on the court";
    }

    @Override
    public String getDailyFortune() {
        return fortuneService.getFortune();
    }
}
