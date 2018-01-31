package ua.comp.schema.data;

import java.util.ArrayList;
import java.util.List;
/**
 * Created with CodeCrank.io
 */
public class ComplexTypeDefinition implements TypeDefinition, Comment {

    public static class Builder {

        private Name name = null;
        private String namespace = "";		// Namespace, Package
        private String comment = "";
        private String docComment = "";
        private List<String> superTypes = new ArrayList<>();
        private List<String> interfaces = new ArrayList<>();
        private List<Property> propertys = new ArrayList<>();
        private List<Method> methods = new ArrayList<>();

        public Builder name(Name name) {
            this.name = name; return this;
        }

        public Builder namespace(String namespace) {
            this.namespace = namespace; return this;
        }

        public Builder comment(String comment) {
            this.comment = comment; return this;
        }

        public Builder docComment(String docComment) {
            this.docComment = docComment; return this;
        }

        public Builder superTypes(List<String> superTypes) {
            this.superTypes = superTypes; return this;
        }

        public Builder interfaces(List<String> interfaces) {
            this.interfaces = interfaces; return this;
        }

        public Builder propertys(List<Property> propertys) {
            this.propertys = propertys; return this;
        }

        public Builder methods(List<Method> methods) {
            this.methods = methods; return this;
        }

        public ComplexTypeDefinition build() {
            return new ComplexTypeDefinition(this);
        }
    }

    public static Builder Builder() {
        return new Builder();
    }

    private final Name name;
    private final String namespace;		// Namespace, Package
    private final String comment;
    private final String docComment;
    private final List<String> superTypes;
    private final List<String> interfaces;
    private final List<Property> propertys;
    private final List<Method> methods;

    public ComplexTypeDefinition(Name name, String namespace, String comment, String docComment, List<String> superTypes, List<String> interfaces, List<Property> propertys, List<Method> methods) {

        if (name == null) {
            throw new NullPointerException ("name - null not allowed.");
        }

        this.name = name;
        this.namespace = namespace;
        this.comment = comment;
        this.docComment = docComment;
        this.superTypes = superTypes;
        this.interfaces = interfaces;
        this.propertys = propertys;
        this.methods = methods;
    }

    private ComplexTypeDefinition(Builder builder) {

        this.name = builder.name;
        this.namespace = builder.namespace;
        this.comment = builder.comment;
        this.docComment = builder.docComment;
        this.superTypes = builder.superTypes;
        this.interfaces = builder.interfaces;
        this.propertys = builder.propertys;
        this.methods = builder.methods;

        if (name == null) {
            throw new NullPointerException ("name - null not allowed.");
        }
    }

    public Name getName() {
        return name;
    }

    public String getNamespace() {
        return namespace;
    }

    public String getComment() {
        return comment;
    }

    public String getDocComment() {
        return docComment;
    }

    public List<String> getSuperTypes() {
        return superTypes;
    }

    public List<String> getInterfaces() {
        return interfaces;
    }

    public List<Property> getPropertys() {
        return propertys;
    }

    public List<Method> getMethods() {
        return methods;
    }

    @Override
    public String toString() {
        return "ComplexTypeDefinition [" +
            "name=" + ((name != null) ? name.toString() : "null") +
            ", namespace=" + ((namespace != null) ? "\"" + namespace + "\"" : "null") +
            ", comment=" + ((comment != null) ? "\"" + comment + "\"" : "null") +
            ", docComment=" + ((docComment != null) ? "\"" + docComment + "\"" : "null") +
            ", superTypes=" + ((superTypes != null) ? superTypes.toString() : "null") +
            ", interfaces=" + ((interfaces != null) ? interfaces.toString() : "null") +
            ", propertys=" + ((propertys != null) ? propertys.toString() : "null") +
            ", methods=" + ((methods != null) ? methods.toString() : "null") +
            "]";
    }

}