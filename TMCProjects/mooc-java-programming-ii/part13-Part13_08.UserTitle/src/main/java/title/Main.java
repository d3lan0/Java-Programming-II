package title;


import javafx.application.Application;
import sun.management.snmp.jvmmib.JVM_MANAGEMENT_MIBOidTable;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please give a title: ");
        String title = scanner.nextLine();

        Application.launch(UserTitle.class,
               "--title=" + title);
    }

}
