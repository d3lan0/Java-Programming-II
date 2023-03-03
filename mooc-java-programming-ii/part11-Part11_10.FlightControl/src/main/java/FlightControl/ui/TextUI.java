/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FlightControl.ui;

import FlightControl.Logic.FlightControl;
import FlightControl.domain.Airplane;
import java.util.Scanner;

/**
 *
 * @author theo.higgins
 */
public class TextUI {

    private FlightControl flightcontrol;
    private Scanner scanner;

    public TextUI(FlightControl flightcontrol, Scanner scanner) {
        this.flightcontrol = flightcontrol;
        this.scanner = scanner;
    }

    public void start() {
        startAssetControl();
        System.out.println();
        startFligthControl();
        System.out.println();
    }

    private void startAssetControl() {
        System.out.println("Airport Asset Control");
        System.out.println("--------------------");
        System.out.println();

        while (true) {
            System.out.println("Choose an action:");
            System.out.println("[1] Add an airplane");
            System.out.println("[2] Add a flight");
            System.out.println("[x] Exit Airport Asset Control");
            System.out.println(">");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("x")) {
                break;
            }

            if (input.equals("1")) {
                addAirplane(scanner);
            }

            if (input.equals("2")) {
                addFlight(scanner);
            }
        }

    }

    private void addAirplane(Scanner scanner) {
        System.out.println("Give the airplane id:");
        String id = scanner.nextLine();
        System.out.println("Give the airplane capacity:");
        Integer capacity = Integer.parseInt(scanner.nextLine());
        this.flightcontrol.addAirplane(id, capacity);
    }

    private void addFlight(Scanner scanner) {
        System.out.println("Give the airplane id:");
        Airplane airplane = askForAirplane();
        System.out.println("Give the departure airport id: ");
        String departureId = scanner.nextLine();
        System.out.println("Give the target airport id: ");
        String destinationId = scanner.nextLine();
        this.flightcontrol.addFlight(airplane, departureId, destinationId);
    }

    private Airplane askForAirplane() {
        Airplane airplane = null;
        while (airplane == null) {
            String id = scanner.nextLine();
            airplane = flightcontrol.getAirplane(id);

            if (airplane == null) {
                System.out.println("No airplane with the id " + id + ".");
            }
        }

        return airplane;
    }

    private void startFligthControl() {
        System.out.println("Flight Control");
        System.out.println("------------");
        
        while (true) {
            System.out.println();
            System.out.println("[1] Print airplanes");
            System.out.println("[2] Print flights");
            System.out.println("[3] Print airplane details");
            System.out.println("[x] Quit");
            String input = scanner.nextLine();
            if (input.equalsIgnoreCase("x")) {
                break;
            }

            if (input.equals("1")) {
                printPlanes();
            }

            if (input.equals("2")) {
                printFlights();
            }

            if (input.equals("3")) {
                printAirplaneDetails(scanner);
            }

        }
    }

    private void printPlanes() {
        this.flightcontrol.getAirplanes().stream()
                .forEach(plane -> System.out.println(plane));
    }

    private void printFlights() {
        this.flightcontrol.getFlights().stream()
                .forEach(flight -> System.out.println(flight));
    }

    private void printAirplaneDetails(Scanner scanner) {
        System.out.println("Give the airplane id: ");
        String airplane = scanner.nextLine();
        System.out.println(this.flightcontrol.getAirplane(airplane));
    }

}
