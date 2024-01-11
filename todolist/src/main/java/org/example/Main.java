package org.example;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TodoList todoList = new TodoList();

        while (true) {
            System.out.println("\nTodoListe App Menü:");
            System.out.println("1. Kategorie hinzufügen");
            System.out.println("2. Aufgabe hinzufügen");
            System.out.println("3. Aufgaben anzeigen");
            System.out.println("4. Aufgabe entfernen");
            System.out.println("5. Beenden");

            System.out.print("Geben Sie Ihre Auswahl ein (1-5): ");
            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1:
                    System.out.print("Geben Sie den Namen der Kategorie ein: ");
                    scanner.nextLine();
                    String kategorieName = scanner.nextLine();
                    todoList.addCategory(kategorieName);
                    break;
                case 2:
                    System.out.print("Geben Sie den Namen der Kategorie ein: ");
                    scanner.nextLine();
                    String kategorie = scanner.nextLine();
                    System.out.print("Geben Sie die Aufgabenbeschreibung ein: ");
                    String aufgabenBeschreibung = scanner.nextLine();
                    todoList.addTask(kategorie, aufgabenBeschreibung);
                    break;
                case 3:
                    System.out.print("Geben Sie den Namen der Kategorie ein: ");
                    scanner.nextLine();
                    String kategorieAnzeigen = scanner.nextLine();
                    todoList.viewTasks(kategorieAnzeigen);
                    break;
                case 4:
                    System.out.print("Geben Sie den Namen der Kategorie ein: ");
                    scanner.nextLine();
                    String kategorieEntfernen = scanner.nextLine();
                    System.out.print("Geben Sie den Index der zu entfernenden Aufgabe ein: ");
                    int index = scanner.nextInt();
                    todoList.removeTask(kategorieEntfernen, index - 1);
                    break;
                case 5:
                    System.out.println("Beende TodoListe");
                    System.exit(0);
                default:
                    System.out.println("Ungültige Auswahl. Bitte geben Sie eine Zahl zwischen 1 und 5 ein.");
            }
        }
    }
}
