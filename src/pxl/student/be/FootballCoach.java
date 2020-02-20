package pxl.student.be;

public class FootballCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Score a goal without touching a player.";
    }
}
