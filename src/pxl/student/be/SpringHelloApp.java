package pxl.student.be;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringHelloApp {
    public static void main(String[] args) {
        //load the spring configuration file
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);

        System.out.println(theCoach.getDailyWorkout());

        context.close();
    }
}
