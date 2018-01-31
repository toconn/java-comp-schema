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
        private String comment = "";
        private String docComment = "";
        private String label = "";
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

}