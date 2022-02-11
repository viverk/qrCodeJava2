/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package qrcode2;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import net.glxn.qrgen.QRCode;
import net.glxn.qrgen.image.ImageType;

/**
 *
 * @author Promattex
 */
public class Qrcode2 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        String details = "test Viverk";

        ByteArrayOutputStream out = QRCode.from(details).to(ImageType.PNG).stream();

        File f = new File("C:\\Users\\Promattex\\Desktop\\testQrCode\\test.png");
        FileOutputStream fos = new FileOutputStream(f);
        
        fos.write(out.toByteArray());
        fos.flush();
    }

}
