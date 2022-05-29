package com;

import java.util.Locale;

public class DisplayLocales {
    public void display() {
        for (Locale locale : Locale.getAvailableLocales())
            System.out.println(locale.toString());
    }
}
