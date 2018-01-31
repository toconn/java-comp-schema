package ua.comp.schema.data;

import java.util.List;

import ua.core.utils.CollectionUtils;

/**
 * Created with CodeCrank.io
 */
public class Tag {

    private final String name;
    private final List<String> values;

    public Tag(String name, List<String> values) {

        this.name = name;
        this.values = values;
    }

    public String getName() {
        return name;
    }

    public List<String> getValues() {
        return values;
    }


    public String getValue() {

    		if (hasValues()) {
    			return this.values.get(0);
    		}
    		else {
    			return null;
    		}
    }

    public boolean hasValues() {

        return CollectionUtils.isNotEmpty (this.values);
    }

    @Override
    public String toString() {
        return "Tag [" +
            "name=" + ((name != null) ? "\"" + name + "\"" : "null") +
            ", values=" + ((values != null) ? values.toString() : "null") +
            "]";
    }

}