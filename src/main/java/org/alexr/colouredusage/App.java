package org.alexr.colouredusage;

import org.alexr.colored.Attribute;
import org.alexr.colored.Colored;

public class App {
    public static void main(String[] args) {
        Colored.print("Hello,", Attribute.RED.bold());
        Colored.print(" Word!", Attribute.GREEN);
        Colored.println(" Again;)", Attribute.BLUE.underline());
    }
}
