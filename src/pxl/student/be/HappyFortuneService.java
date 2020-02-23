package pxl.student.be;

import java.util.ArrayList;
import java.util.Random;

public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        ArrayList<String> fortunes = new ArrayList<>();
        fortunes.add("I wish you a merry christmas");
        fortunes.add("I wish you a happy new year");
        fortunes.add("I wish you a happy live");
        int fortunePosition = new Random().nextInt(fortunes.size());
        return fortunes.get(fortunePosition);
    }
}
