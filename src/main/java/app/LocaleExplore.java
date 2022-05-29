package app;

import com.DisplayLocales;
import com.Info;
import com.SetLocale;

import java.text.MessageFormat;
import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class LocaleExplore {
    public  void testLocale() {
        DisplayLocales displayLocales = new DisplayLocales();
        SetLocale setLocale = new SetLocale();
        Info info = new Info();
        ResourceBundle resources =
                ResourceBundle.getBundle("Messages");
        Scanner scanner = new Scanner(System.in);



    }
    public static void main(String[] args) {
        LocaleExplore app = new LocaleExplore();
        app.testLocale();
    }
}
