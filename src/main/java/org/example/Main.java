package org.example;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Random;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) throws FileNotFoundException, DocumentException {



        Scanner teclado = new Scanner(System.in);

        RamonWriter ramonWriter = new RamonWriter();
        ramonWriter.write("hola.pdf", teclado.nextLine());




    }

}