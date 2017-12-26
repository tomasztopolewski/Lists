package pl.tomasztopolewski.preparation;

import pl.tomasztopolewski.Logs;
import java.io.File;

public class Installation {

    public final static String pathToFolder = "C:\\Program Files\\Lists\\";

    public boolean isOkay() {
        return new File(pathToFolder + "settings.lists").canRead()
                && new File(pathToFolder + "settings.lists").canWrite()

                && new File(pathToFolder + Logs.nameFile).canRead()
                && new File(pathToFolder + Logs.nameFile).canWrite()

                /*&& new File(pathToFolder + "0.txt").canRead()
                && new File(pathToFolder + "0.txt").canWrite()

                && new File(pathToFolder + "1.txt").canRead()
                && new File(pathToFolder + "1.txt").canWrite()

                && new File(pathToFolder + "2.txt").canRead()
                && new File(pathToFolder + "2.txt").canWrite()

                && new File(pathToFolder + "3.txt").canRead()
                && new File(pathToFolder + "3.txt").canWrite()

                && new File(pathToFolder + "4.txt").canRead()
                && new File(pathToFolder + "4.txt").canWrite()

                && new File(pathToFolder + "5.txt").canRead()
                && new File(pathToFolder + "5.txt").canWrite()

                && new File(pathToFolder + "6.txt").canRead()
                && new File(pathToFolder + "6.txt").canWrite()

                && new File(pathToFolder + "7.txt").canRead()
                && new File(pathToFolder + "7.txt").canWrite()

                && new File(pathToFolder + "8.txt").canRead()
                && new File(pathToFolder + "8.txt").canWrite()

                && new File(pathToFolder + "9.txt").canRead()
                && new File(pathToFolder + "9.txt").canWrite())*/  ? true : false;
    }

}
