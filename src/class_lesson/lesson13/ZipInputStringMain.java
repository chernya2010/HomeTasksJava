package class_lesson.lesson13;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class ZipInputStringMain {
    public static void main(String[] args) {
        try(ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream("D://1//output.zip"))){
            ZipEntry entry;
            String name = null;
            long size;
            while((entry = zipInputStream.getNextEntry()) != null){
                name = entry.getName();
                size = entry.getSize();
                System.out.printf("File name: %s, File size: %d\n", name, size);
            }
            FileOutputStream fileOutputStream = new FileOutputStream("D://1//new" + name);
            for (int i = zipInputStream.read(); i != -1; i = zipInputStream.read()){
                fileOutputStream.write(i);
            }
            fileOutputStream.flush();
            zipInputStream.closeEntry();
            fileOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
