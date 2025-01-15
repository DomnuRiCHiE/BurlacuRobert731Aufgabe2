package UI;

import Controller.MedikamenteController;
import Controller.PatientenController;
import Model.Medikamente;
import Model.Patienten;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class UI {
    private final Scanner scanner;
    private final PatientenController patientenController;
    private final MedikamenteController medikamenteController;

    public UI(MedikamenteController medikamenteController, PatientenController patientenController) {
        this.patientenController = patientenController;
        this.medikamenteController = medikamenteController;
        scanner = new Scanner(System.in);
    }

    public void menu() {
        while (true) {
            System.out.println();
            System.out.println("1. Task a");
            System.out.println("2. Task b");
            System.out.println("3. Task c");
            System.out.println("4. Task d");
            System.out.println("5. Task e");
            System.out.println("6. Exit");
            System.out.println("Choose: ");
            System.out.println();
            String input = scanner.nextLine();
            switch (input) {
                case "1":
                    menuCRUD();
                    //switchCrudMedikamente();
                    break;
                case "2":
                    menuCRUD();
                    //switchCrudPatienten();
                    break;
                case "3":
                    System.out.println();
                    System.out.println("Give a diagnose: ");
                    String diagnose = scanner.nextLine();
                    System.out.println();
                    //System.out.println(PatientenController.filterByDiagnose(diagnose));
                    break;
                case "4":
                    System.out.println();
                    System.out.println("Give a regisseur: ");
                    String regisseur = scanner.nextLine();
                    System.out.println();
                    //System.out.println(clientController.aufgabeD(regisseur));
                    break;
                case "5":
                    System.out.println();
                    System.out.println("Choose a client id: ");
                    int input1 = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("1 - Ascending OR 2 - Descending");
                    int input2 = scanner.nextInt();
                    scanner.nextLine();
                    //System.out.println(clientController.aufgabeE(input1, input2));
                    break;
                case "6":
                    return;
            }
        }
    }

    public void menuCRUD() {
        System.out.println("1. Create");
        System.out.println("2. Read");
        System.out.println("3. Update");
        System.out.println("4. Delete");
        System.out.println("5. Exit");
        System.out.println("Choose: ");
    }

    public void switchCrudMedikamente() {
        String input = scanner.nextLine();
        while (true) {
            String name, disease;
            int price;
            Medikamente medikamente;
            switch (input) {
                case "1":
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Disease: ");
                    disease = scanner.nextLine();

                    System.out.println("Price: ");
                    price = scanner.nextInt();
                    scanner.nextLine();

                    medikamenteController.add(new Medikamente(name, price, disease));
                    return;

                case "2":
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    medikamente = medikamenteController.get(name);
                    if(medikamente == null) {
                        System.out.println("Medikamente not found");
                    }
                    else {
                        System.out.println(medikamente);
                    }
                    return;

                case "3":
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    medikamente = medikamenteController.get(name);
                    if(medikamente == null) {
                        System.out.println("Film not found");
                    }
                    else {
                        System.out.println(medikamente);
                        System.out.println();

                        System.out.println("New name: ");
                        String newName = scanner.nextLine();

                        System.out.println("New disease: ");
                        String newDisease = scanner.nextLine();

                        System.out.println("New price: ");
                        int newPrice = scanner.nextInt();
                        scanner.nextLine();

                        medikamenteController.update(medikamente, new Medikamente(newName, newPrice, newDisease));
                    }
                    return;

                case "4":
                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    medikamenteController.delete(name);
                    return;

                case "5":
                    return;
            }
        }
    }

    public void switchCrudPatienten() {
        String input = scanner.nextLine();
        while (true) {
            String name, diagnostic;
            List<Medikamente> medikamenteList;
            int id, age;
            Patienten patienten;

            switch (input) {
                case "1":
                    System.out.println("Id: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Name: ");
                    name = scanner.nextLine();

                    System.out.println("Age: ");
                    age = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Diagnose: ");
                    diagnostic = scanner.nextLine();

                    medikamenteList = new ArrayList<>();

                    patientenController.add(new Patienten(id, name, age, diagnostic, medikamenteList));
                    return;

                case "2":
                    System.out.println("Id: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    patienten = patientenController.get(id);
                    if(patienten == null) {
                        System.out.println("Patient not found");
                    }
                    else {
                        System.out.println(patienten);
                    }
                    return;

                case "3":
                    System.out.println("Patienten id: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    patienten = patientenController.get(id);
                    if(patienten == null) {
                        System.out.println("Patient not found");
                    }
                    else {
                        System.out.println(patienten);
                        System.out.println();

                        System.out.println("New Id: ");
                        int newId = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("New Name: ");
                        String newName = scanner.nextLine();

                        System.out.println("New Age: ");
                        int newAge = scanner.nextInt();
                        scanner.nextLine();

                        System.out.println("New Diagnose: ");
                        String newDiagnose = scanner.nextLine();

                        medikamenteList = new ArrayList<>();
                        System.out.println("Select medication with their name: (to finish selection enter a space in prompt)");
                        System.out.println();

                        List<Medikamente> allMedikamente = medikamenteController.getAll();
                        for(Medikamente medikamente : allMedikamente) {
                            System.out.println(medikamente);
                        }
                        System.out.println();

                        String filmInput = "";
                        while (!Objects.equals(filmInput, " ")) {
                            filmInput = scanner.nextLine();
                            Medikamente searchedMedikamente = medikamenteController.get(filmInput);
                            if(searchedMedikamente == null) {
                                System.out.println("Medikamente not found");
                            }
                            else {
                                medikamenteList.add(searchedMedikamente);
                                System.out.println("Medikament added to client list");
                            }
                        }
                        patientenController.update(patienten, new Patienten(newId, newName, newAge, newDiagnose, medikamenteList));
                    }
                    return;

                case "4":
                    System.out.println("Client id: ");
                    id = scanner.nextInt();
                    scanner.nextLine();

                    patientenController.delete(id);
                    return;

                case "5":
                    return;
            }
        }
    }
}
