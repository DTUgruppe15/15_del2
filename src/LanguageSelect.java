import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LanguageSelect {
    static String[] textArr;

    public static void selectLanguage(int language){
        String languageStr;
        switch (language){
            default -> languageStr = "English.txt";
        }

        List<String> listOfStrings = new ArrayList<String>();

        try {
            listOfStrings = Files.readAllLines(Paths.get(languageStr));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        textArr = listOfStrings.toArray(new String[0]);
    }

    public String getTextAtIndex(int index){
        return textArr[index];
    }
}
