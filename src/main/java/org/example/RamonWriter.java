package org.example;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class RamonWriter {
    public void write(String s, String s1) {
        Document document = new Document();
        try {
            PdfWriter.getInstance(document, new FileOutputStream(s));
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }

        document.open();
        Font font = FontFactory.getFont(FontFactory.COURIER, 42, BaseColor.BLACK);
        Chunk chunk = new Chunk(s1, font);


        try {
            document.add(chunk);
        } catch (DocumentException e) {
            throw new RuntimeException(e);
        }
        document.close();
    }
}
