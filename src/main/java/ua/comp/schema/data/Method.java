package ua.comp.schema.data;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

/**
 * Created with CodeCrank.io
 */
public class Method implements Comment {

    public static class Builder {

        private Name name = null;		// ID
        private List<Property> parameters = new ArrayList<>();
        private List<Property> returns = new ArrayList<>();
        private String comment = null;
        private String docComment = null;
        private String label = null;
        private LinkedHashMap<String,Tag> tagListMap = new LinkedHashMap<>();

        public Builder name(Name name) {
            this.name = name; return this;
        }

        public Builder parameters(List<Property> parameters) {
            this.parameters = parameters; return this;
        }

        public Builder returns(List<Property> returns) {
            this.returns = returns; return this;
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

        public Method build() {
            return new Method(this);
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
    private final List<Property> parameters;
    private final List<Property> returns;
    private final String comment;
    private final String docComment;
    private final String label;
    private final LinkedHashMap<String,Tag> tagListMap;

    public Method(Name name, List<Property> parameters, List<Property> returns, String comment, String docComment, String label, LinkedHashMap<String,Tag> tagListMap) {

        if (name == null) {
            throw new NullPointerException ("name - null not allowed.");
        }

        this.name = name;
        this.parameters = parameters;
        this.returns = returns;
        this.comment = comment;
        this.docComment = docComment;
        this.label = label;
        this.tagListMap = tagListMap;
    }

    private Method(Builder builder) {

        this.name = builder.name;
        this.parameters = builder.parameters;
        this.returns = builder.returns;
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

    public List<Property> getParameters() {
        return parameters;
    }

    public List<Property> getReturns() {
        return returns;
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

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Do Not Overwrite With Generated Code...                                                                       //
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    @Override
    public String toString() {
        return "Method [" +
            "name=" + ((name != null) ? name.toString() : "null") +
            ", parameters=" + ((parameters != null) ? parameters.toString() : "null") +
            ", returns=" + ((returns != null) ? returns.toString() : "null") +
            ", comment=" + ((comment != null) ? "\"" + comment + "\"" : "null") +
            ", docComment=" + ((docComment != null) ? "\"" + docComment + "\"" : "null") +
            ", label=" + ((label != null) ? "\"" + label + "\"" : "null") +
            ", tagListMap=" + ((tagListMap != null) ? tagListMap.toString() : "null") +
            "]";
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((comment == null) ? 0 : comment.hashCode());
		result = prime * result + ((docComment == null) ? 0 : docComment.hashCode());
		result = prime * result + ((label == null) ? 0 : label.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((parameters == null) ? 0 : parameters.hashCode());
		result = prime * result + ((returns == null) ? 0 : returns.hashCode());
		result = prime * result + ((tagListMap == null) ? 0 : tagListMap.hashCode());
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
		Method other = (Method) obj;
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
		if (parameters == null) {
			if (other.parameters != null)
				return false;
		} else if (!parameters.equals(other.parameters))
			return false;
		if (returns == null) {
			if (other.returns != null)
				return false;
		} else if (!returns.equals(other.returns))
			return false;
		if (tagListMap == null) {
			if (other.tagListMap != null)
				return false;
		} else if (!tagListMap.equals(other.tagListMap))
			return false;
		return true;
	}

}