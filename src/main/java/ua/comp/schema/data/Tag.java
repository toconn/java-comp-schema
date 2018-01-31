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

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Do Not Overwrite With Generated Code...                                                                       //
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((values == null) ? 0 : values.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Tag other = (Tag) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (values == null) {
			if (other.values != null)
				return false;
		} else if (!values.equals(other.values))
			return false;
		return true;
	}

}