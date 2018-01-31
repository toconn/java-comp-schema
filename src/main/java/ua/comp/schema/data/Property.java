package ua.comp.schema.data;

import java.util.LinkedHashMap;

/**
 * Created with CodeCrank.io
 */
public class Property implements Comment {

    public static class Builder {

        private Name name = null;		// ID
        private Type type = null;
        private String initialValue = null;
        private String comment = null;
        private String docComment = null;
        private String label = null;
        private LinkedHashMap<String,Tag> tagListMap = new LinkedHashMap<>();

        public Builder name(Name name) {
            this.name = name; return this;
        }

        public Builder type(Type type) {
            this.type = type; return this;
        }

        public Builder initialValue(String initialValue) {
            this.initialValue = initialValue; return this;
        }

        public Builder comment(String comment) {
            this.comment = comment; return this;
        }

        public Builder docComment(String docComment) {
            this.docComment = docComment; return this;
        }

        public Builder label(String label) {
            this.label = label; return this;
        }

        public Builder tagListMap(LinkedHashMap<String,Tag> tagListMap) {
            this.tagListMap = tagListMap; return this;
        }

        public Property build() {
            return new Property(this);
        }

	    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    	// Do Not Overwrite With Generated Code...                                                                       //
	    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	    public Builder name(String name) {
	        this.name = new Name (name); return this;
	    }
    }

    public static Builder Builder() {
        return new Builder();
    }

    private final Name name;		// ID
    private final Type type;
    private final String initialValue;
    private final String comment;
    private final String docComment;
    private final String label;
    private final LinkedHashMap<String,Tag> tagListMap;

    public Property(Name name, Type type, String initialValue, String comment, String docComment, String label, LinkedHashMap<String,Tag> tagListMap) {

        if (name == null) {
            throw new NullPointerException ("name - null not allowed.");
        }

        this.name = name;
        this.type = type;
        this.initialValue = initialValue;
        this.comment = comment;
        this.docComment = docComment;
        this.label = label;
        this.tagListMap = tagListMap;
    }

    private Property(Builder builder) {

        this.name = builder.name;
        this.type = builder.type;
        this.initialValue = builder.initialValue;
        this.comment = builder.comment;
        this.docComment = builder.docComment;
        this.label = builder.label;
        this.tagListMap = builder.tagListMap;

        if (name == null) {
            throw new NullPointerException ("name - null not allowed.");
        }
    }

    public Name getName() {
        return name;
    }

    public Type getType() {
        return type;
    }

    public String getInitialValue() {
        return initialValue;
    }

    public String getComment() {
        return comment;
    }

    public String getDocComment() {
        return docComment;
    }

    public String getLabel() {
        return label;
    }

    public LinkedHashMap<String,Tag> getTagListMap() {
        return tagListMap;
    }

    @Override
    public String toString() {
        return "Property [" +
            "name=" + ((name != null) ? name.toString() : "null") +
            ", type=" + ((type != null) ? type.toString() : "null") +
            ", initialValue=" + ((initialValue != null) ? "\"" + initialValue + "\"" : "null") +
            ", comment=" + ((comment != null) ? "\"" + comment + "\"" : "null") +
            ", docComment=" + ((docComment != null) ? "\"" + docComment + "\"" : "null") +
            ", label=" + ((label != null) ? "\"" + label + "\"" : "null") +
            ", tagListMap=" + ((tagListMap != null) ? tagListMap.toString() : "null") +
            "]";
    }
    
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Do Not Overwrite With Generated Code...                                                                       //
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((docComment == null) ? 0 : docComment.hashCode());
		result = prime * result + ((initialValue == null) ? 0 : initialValue.hashCode());
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((tagListMap == null) ? 0 : tagListMap.hashCode());
		result = prime * result + ((type == null) ? 0 : type.hashCode());
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
		Property other = (Property) obj;
		if (comment == null) {
			if (other.comment != null)
				return false;
		} else if (!comment.equals(other.comment))
			return false;
		if (docComment == null) {
			if (other.docComment != null)
				return false;
		} else if (!docComment.equals(other.docComment))
			return false;
		if (initialValue == null) {
			if (other.initialValue != null)
				return false;
		} else if (!initialValue.equals(other.initialValue))
			return false;
		if (label == null) {
			if (other.label != null)
				return false;
		} else if (!label.equals(other.label))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (tagListMap == null) {
			if (other.tagListMap != null)
				return false;
		} else if (!tagListMap.equals(other.tagListMap))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}
    
}