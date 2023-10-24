/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.complexityandsorting;
import com.mycompany.complexityandsorting.Shapes.Cone;
import com.mycompany.complexityandsorting.Shapes.Cylinder;
import com.mycompany.complexityandsorting.Shapes.Pyramid;
import com.mycompany.complexityandsorting.Shapes.OctagonalPrism;
import com.mycompany.complexityandsorting.Shapes.PentagonalPrism;
import com.mycompany.complexityandsorting.Shapes.SquarePrism;
import com.mycompany.complexityandsorting.Shapes.TriangularPrism;
import com.mycompany.complexityandsorting.Shapes.Shape;
import com.mycompany.complexityandsorting.Shapes.ShapeComparator;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 *
 * @author oribermudez
 */
public class ComplexityAndSorting {

    // Flag constants
    private static final String FLAG_FILE = "-f";
    private static final String FLAG_SORT_CRITERIA = "-t";
    private static final String FLAG_SORT_METHOD = "-s";
    
    public static void main(String[] args) {
        
        // Display message promting the user to provide 3 arguments
        if (args.length < 3) {
            System.out.println("Please provide 3 arguments: file name, sorting criteria, and sorting method");
            return;
        }

        // Declare the variables that will store the arguments' value
        String fileName = "";
        String sortingCriteria = "";
        String sortingMethod = "";

        // Assign arguments' value
        for (String arg : args) {
            if (arg.startsWith(FLAG_FILE)) {
                fileName = arg.replaceFirst(FLAG_FILE + "(\"?)(.*?)\\1", "$2").toLowerCase();
            } else if (arg.startsWith(FLAG_SORT_CRITERIA)) {
                sortingCriteria = arg.substring(2).toLowerCase();
            } else if (arg.startsWith(FLAG_SORT_METHOD)) {
                sortingMethod = arg.substring(2).toLowerCase();
            }
        }

        System.out.println("-------- Arguments -------");
        System.out.println("File Name: " + fileName);
        System.out.println("Sorting Criteria: " + sortingCriteria);
        System.out.println("Sorting Method: " + sortingMethod);
        System.out.println("--------------------------\n");

        try {
            // Read file
            Shape[] shapes = readShapesFromFile(fileName);
            
            // Create shape comparator according the sorting criteria
            ShapeComparator comparator = new ShapeComparator(sortingCriteria);

            // Measure time
            long startTime = System.currentTimeMillis();
            Utility.sortShapes(shapes, comparator, sortingMethod);
            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;

            System.out.println("------ Sorting Time ------");
            System.out.println("Time taken to sort: " + elapsedTime + " milliseconds");
            System.out.println("--------------------------\n");

            // Print shapes
            printSortedShapes(shapes);
            
        } catch (FileNotFoundException e) {

            System.err.println("File not found: " + e.getMessage());
            
        } catch (Exception e) {
            
            System.err.println("An unexpected error occurred: " + e.getMessage());
            
        }     
    }
    
   private static Shape[] readShapesFromFile(String fileName) throws FileNotFoundException {
       
        File file = new File(fileName);
        Scanner scanner = new Scanner(file);
        
        // Get the first int of the file
        int numOfObjects = scanner.nextInt();
        
        // Create array of shapes
        Shape[] shapes = new Shape[numOfObjects];

        // Gro through the file and create the shapes
        for (int i = 0; i < numOfObjects; i++) {
            String shapeType = scanner.next();
            double height = scanner.nextDouble();
            double value = scanner.nextDouble();

            Shape shape = createShape(shapeType, height, value);

            if (shape != null) {
                shapes[i] = shape;
            }
        }

        scanner.close();
        
        return shapes;
        
    }

    private static Shape createShape(String shapeType, double height, double value) {
        switch (shapeType.toLowerCase()) {
            case "cylinder":
                return new Cylinder(height, value);
            case "cone":
                return new Cone(height, value);
            case "pyramid":
                return new Pyramid(height, value);
            case "squareprism":
                return new SquarePrism(height, value);
            case "triangularprism":
                return new TriangularPrism(height, value);
            case "pentagonalprism":
                return new PentagonalPrism(height, value);
            case "octagonalprism":
                return new OctagonalPrism(height, value);
            default:
                System.out.println("Unknown shape type: " + shapeType);
                return null;
        }
    }

    private static void printSortedShapes(Shape[] shapes) {
        for (int i = 0; i < shapes.length; i++) {
            if (i == 0 || i == shapes.length - 1 || (i + 1) % 1000 == 0) {
                Shape shape = shapes[i];
                System.out.println("Shape Type: " + shape.getClass().getSimpleName());
                System.out.println("Height: " + shape.getHeight());
                System.out.println("Base Area: " + shape.getBaseArea());
                System.out.println("Volume: " + shape.getVolume());
                System.out.println();
            }
        }
    } 
}
