package hust.soict.hedspi.garbage;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.io.IOException;

public class GarbageCreator {
    public static void main(String[] args) {
    	String filename = "D:/TTUD/Laboratory/Lab1/Exercise1.exe";
        byte[] inputBytes = {0}; 
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            String outputString = "";
            for (byte b : inputBytes) {
                outputString += (char) b; 
            }
            endTime = System.currentTimeMillis();
            System.out.println((endTime - startTime) + " ms");
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
