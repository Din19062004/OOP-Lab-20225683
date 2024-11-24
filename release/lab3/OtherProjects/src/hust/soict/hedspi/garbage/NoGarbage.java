package hust.soict.hedspi.garbage;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class NoGarbage {
	public static void main(String[] args) {
    	String filename = "D:/TTUD/Laboratory/Lab1/Exercise1.exe";
        byte[] inputBytes = {0}; 
        long startTime, endTime;

        try {
            inputBytes = Files.readAllBytes(Paths.get(filename));
            startTime = System.currentTimeMillis();
            StringBuffer outputStringBuffer = new StringBuffer();
            for (byte b : inputBytes) {
                outputStringBuffer.append((char)b); 
            }
            endTime = System.currentTimeMillis();
            System.out.println((endTime - startTime) + " ms");
        } catch (IOException e) {
            System.out.println("Lỗi khi đọc file: " + e.getMessage());
        }
    }
}
