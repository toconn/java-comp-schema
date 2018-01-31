package ua.comp.schema.data;

import ua.core.data.CaseString;

/**
 * Created with CodeCrank.io
 */
public class Name extends CaseString {

   public Name (String value) {
       super (value);
    }

    @Override
    public String toString() {
        return "Name [" +
            "value=" + ((getValue() != null) ? "\"" + getValue() + "\"" : "null") +
            "]";
    }

    
}