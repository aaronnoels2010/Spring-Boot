package pxl.student.be;

public class BaseballCoach implements Coach {
    @Override
    public String getDailyWorkout(){
        return "Spending 30 minutes on the court";
    }
}
