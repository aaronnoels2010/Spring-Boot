package pxl.student.be;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "Today is your happy day";
    }
}
