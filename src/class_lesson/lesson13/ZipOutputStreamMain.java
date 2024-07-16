package class_lesson.lesson13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class ZipOutputStreamMain {
    public static void main(String[] args) {
        String fileName = "D://1//myNewFile.txt";
        try(ZipOutputStream zipOutputStream = new ZipOutputStream(new FileOutputStream("D://1//output.zip"))){
            FileInputStream fileInputStream = new FileInputStream(fileName);
            ZipEntry entry1 = new ZipEntry("myNewFile.txt");
            zipOutputStream.putNextEntry(entry1);
            byte[] buffer = new byte[fileInputStream.available()];
            fileInputStream.read(buffer);
            zipOutputStream.write(buffer);
            zipOutputStream.closeEntry();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
