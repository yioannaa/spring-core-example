package pl.sdacademy.spring.service;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pl.sdacademy.spring.config.HibernateConfig;
import pl.sdacademy.spring.model.UserModel;

import java.util.Scanner;

public class MenuService {

    public static void start() {

        ApplicationContext context = new AnnotationConfigApplicationContext(
                HibernateConfig.class);

        UserService service = context
                .getBean(UserService.class);

        Scanner scanner = new Scanner(System.in);


        System.out.println("Menu: ");
        System.out.println("Jeśli chcesz dodać userów wciśnij 1");


        int d = scanner.nextInt();
        if (d == 1) {
            System.out.println("Ilu userów dodajemy? ");
            int c = scanner.nextInt();
            for (int i = 0; i < c; i++) {

                UserModel user1 = new UserModel();


                System.out.println("Wpisz swoje imię: ");

                String a = scanner.next();
                user1.setName(a);


                System.out.println("Wpisz swój email: ");
                String b = scanner.next();
                user1.setEmail(b);


                service.save(user1);
            }
            System.out.println("Czy chcesz wyświetlić listę wpisanych userów y/n?");

            String e = scanner.next();

            if (e.equals("y")) {


                System.out.println(service.list());

            } else {
                System.out.println("Dzięki");
            }

        } else {
            System.out.println("Trzeba było wpisać 1");


        }

    }

}