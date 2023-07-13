package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

import airplanes.Airplane;
import helicopters.Helicopter;
import helicopters.Quadcopter;
import multirotor.Multirotor;
import uav.UAV;
import drones.AgriculturalDrone;
import drones.MAV;

public class Driver {
    public static void main(String[] args) {
        // Creating multiple objects for each class
        Airplane airplane1 = new Airplane("Boeing", 200000000, 10000);
        Airplane airplane2 = new Airplane("Airbus", 190000000, 9500);
        Airplane airplane3 = new Airplane("Boeing", 210000000, 10500);
        Helicopter helicopter1 = new Helicopter("Airbus", 30000000, 8000, 4, 2020, 10);
        Helicopter helicopter2 = new Helicopter("Boeing", 31000000, 8200, 4, 2021, 8);
        Quadcopter quadcopter1 = new Quadcopter("DJI", 1500, 250, 2, 2021, 0, 60);
        Quadcopter quadcopter2 = new Quadcopter("Yuneec", 1400, 240, 2, 2022, 0, 70);
        Multirotor multirotor1 = new Multirotor("Yuneec", 1000, 200, 2, 2022, 0, 4);
        Multirotor multirotor2 = new Multirotor("DJI", 1100, 210, 2, 2023, 0, 6);
        UAV uav1 = new UAV(20, 500);
        UAV uav2 = new UAV(25, 550);
        UAV uav3 = new UAV(30, 600);
        AgriculturalDrone agriDrone1 = new AgriculturalDrone(15, 600, "DJI Agri", 20);
        AgriculturalDrone agriDrone2 = new AgriculturalDrone(16, 620, "Yuneec Agri", 22);
        MAV mav1 = new MAV(1, 300, "Micro Hawk", 0.5);
        MAV mav2 = new MAV(2, 310, "Micro Falcon", 0.6);

        // Displaying information of all the objects
        Object[] objects = {airplane1, airplane2, airplane3, helicopter1, helicopter2, quadcopter1, quadcopter2, multirotor1, multirotor2, uav1, uav2, uav3, agriDrone1, agriDrone2, mav1, mav2};
        for (Object obj : objects) {
            System.out.println(obj);
        }

        // Creating arrays of flying objects
        Object[] flyingObjects1 = {airplane1, helicopter1, quadcopter1, multirotor1, uav1, agriDrone1, mav1, airplane2, helicopter2, quadcopter2, multirotor2, uav2, agriDrone2, mav2, airplane3, uav3};
        Object[] flyingObjects2 = {airplane1, airplane2, helicopter1, helicopter2, quadcopter1, quadcopter2, multirotor1, multirotor2, airplane3};

        // Finding least and most expensive UAV
        findLeastAndMostExpensiveUAV(flyingObjects1);
        findLeastAndMostExpensiveUAV(flyingObjects2);
   
    
    }

    public static void findLeastAndMostExpensiveUAV(Object[] flyingObjects) {
    
    	 try {
             PrintWriter writer = new PrintWriter(new File("output.txt"));

             for (Object obj : flyingObjects) {
                 if (obj instanceof UAV) {
                     UAV currentUav = (UAV) obj;
                     writer.println(currentUav.toString());
                 }
             }

             writer.close();
         } catch (FileNotFoundException e) {
             System.out.println("An error occurred while writing to the file.");
             e.printStackTrace();
         }
    }
}
