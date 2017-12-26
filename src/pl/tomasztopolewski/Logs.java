package pl.tomasztopolewski;

import pl.tomasztopolewski.preparation.Installation;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Logs {
    public final static String pathToTheFolder = Installation.pathToFolder;
    public final static String nameFile = "logs.txt";

    public int numerator;

    Writer logsput;

    public Logs() throws IOException {
        String line, lastLine = "";

        BufferedReader reader = new BufferedReader(new FileReader(pathToTheFolder + nameFile));
        while ((line = reader.readLine()) != null) lastLine = line;

        String[] s = lastLine.split(Pattern.quote(")"));

        //System.out.println("s[0]: " + s);
        if (s.length > 0) this.numerator = Integer.parseInt(s[0]);
        else this.numerator = 0;
    }



    private SimpleDateFormat dateFormating = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss zzz");


    public void appendStart(String s) throws IOException {
        logsput = new BufferedWriter(new FileWriter(pathToTheFolder + nameFile, true));
        logsput.append("\n\n" + ++numerator + ") [" + dateFormating.format(new Date()) + "] " + s);
        logsput.close();
    }

    public void appendReason() throws IOException {
        logsput = new BufferedWriter(new FileWriter(pathToTheFolder + nameFile, true));

        Scanner scanner = new Scanner(System.in);
        System.out.println("[CONSOLE] Powód uruchomienia programu: ");
        String s = scanner.nextLine();

        logsput.append("\n" + ++numerator + ") [" + dateFormating.format(new Date()) + "] " + s);
        logsput.close();
    }

    public void appendWithReason(String s) throws IOException {
        logsput = new BufferedWriter(new FileWriter(pathToTheFolder + nameFile, true));
        logsput.append("\n" + ++numerator + ") [" + dateFormating.format(new Date()) + "] " + s);
        logsput.close();
    }

    public void appendEnd(String s) throws IOException {
        logsput = new BufferedWriter(new FileWriter(pathToTheFolder + nameFile, true));
        logsput.append("\n" + ++numerator + ") [" + dateFormating.format(new Date()) + "] " + s);
        logsput.close();
    }
}
