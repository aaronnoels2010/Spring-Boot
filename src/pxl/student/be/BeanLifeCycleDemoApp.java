package pxl.student.be;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycleDemoApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beanLifeCycle-applicationContext.xml");

        Coach theCoach = context.getBean("myCoach", Coach.class);
        Coach alphaCoach = context.getBean("myCoach", Coach.class);

        boolean result = theCoach == alphaCoach;

        System.out.println("\nPointing to the same object: " + result);
        System.out.println("\nMemory location of theCoach: " + theCoach);
        System.out.println("\nMemory location of alphaCoach: " + alphaCoach);

        context.close();
    }
}
