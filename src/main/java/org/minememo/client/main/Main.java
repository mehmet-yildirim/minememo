package org.minememo.client.main;

import joptsimple.NonOptionArgumentSpec;
import joptsimple.OptionParser;
import joptsimple.OptionSet;

import java.util.List;

/**
 * Created by Mehmet on 09.02.2015.
 */
public class Main {

    public static void main(String[] args) {
        OptionParser optionParser = new OptionParser();
        optionParser.allowsUnrecognizedOptions();
        
        optionParser.accepts("fullscreen");
        optionParser.accepts("checkGlErrors");

        NonOptionArgumentSpec argumentSpec = optionParser.nonOptions();
        OptionSet optionSet = optionParser.parse(args);
        
    }
}
