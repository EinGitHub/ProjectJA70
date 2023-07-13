package Company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Manually add employees
        employees.add(new Employee("John Doe", 101, new Date(5, 6, 2012), "Engineer"));
        employees.add(new Employee("Jane Smith", 102, new Date(12, 7, 2015), "Analyst"));

        // Add more employees as needed from user input
        System.out.println("Enter new employee data (enter 'quit' to finish): ");
        while (true) {
            System.out.print("Enter name: ");
            String name = scanner.nextLine();
            if ("quit".equalsIgnoreCase(name)) {
                break;
            }
            System.out.print("Enter ID: ");
            int id = scanner.nextInt();
            scanner.nextLine();  // consume newline left-over
            System.out.print("Enter hire date as day month year: ");
            int day = scanner.nextInt();
            int month = scanner.nextInt();
            int year = scanner.nextInt();
            scanner.nextLine();  // consume newline left-over
            System.out.print("Enter position: ");
            String position = scanner.nextLine();
            employees.add(new Employee(name, id, new Date(day, month, year), position));
        }
        scanner.close();

        // Write the employees to a file
        writeToFile("employees.txt", employees);

        // Read employees back from the file
        List<Employee> readEmployees = readFromFile("employees.txt");

        // Print out each employee read from the file to verify the operations
        for (Employee employee : readEmployees) {
            System.out.println(employee.toString());
        }
    }

    public static void writeToFile(String fileName, List<Employee> employees) {
        try {
            FileOutputStream fileOut = new FileOutputStream(fileName);
            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
            objectOut.writeObject(employees);
            objectOut.close();
            System.out.println("Employees written to file: " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + " not found.");
        } catch (IOException e) {
            System.out.println("Error writing to file: " + fileName);
        }
    }

    @SuppressWarnings("unchecked")
    public static List<Employee> readFromFile(String fileName) {
        List<Employee> employees = new ArrayList<>();
        try {
            FileInputStream fileIn = new FileInputStream(fileName);
            ObjectInputStream objectIn = new ObjectInputStream(fileIn);
            employees = (List<Employee>) objectIn.readObject();
            objectIn.close();
            System.out.println("Employees read from file: " + fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File " + fileName + " not found.");
        } catch (IOException e) {
            System.out.println("Error reading from file: " + fileName);
        } catch (ClassNotFoundException e) {
            System.out.println("Class not found");
        }
        return employees;
    }
}
