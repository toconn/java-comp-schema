package ua.comp.schema.data;

import java.util.ArrayList;
import java.util.List;
/**
 * Created with CodeCrank.io
 */
public class ComplexTypeDefinition implements TypeDefinition, Comment {

    public static class Builder {

        private Name name = null;
        private String namespace = null;		// Namespace, Package
        private String comment = null;
        private String docComment = null;
        private List<String> superTypes = new ArrayList<>();
        private List<String> interfaces = new ArrayList<>();
        private List<Property> properties = new ArrayList<>();
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

        public Builder properties(List<Property> properties) {
            this.properties = properties; return this;
        }

        public Builder methods(List<Method> methods) {
            this.methods = methods; return this;
        }

        public ComplexTypeDefinition build() {
            return new ComplexTypeDefinition(this);
        }

	    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    	// Do Not Overwrite With Generated Code...                                                                       //
	    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public Builder name(String name) {
            this.name = new Name (name); return this;
        }
        
        public Builder property(Property property) {
            this.properties.add (property); return this;
        }

        public Builder method(Method method) {
            this.methods.add (method); return this;
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
    private final List<Property> properties;
    private final List<Method> methods;

    public ComplexTypeDefinition(Name name, String namespace, String comment, String docComment, List<String> superTypes, List<String> interfaces, List<Property> properties, List<Method> methods) {

        if (name == null) {
            throw new NullPointerException ("name - null not allowed.");
        }

        this.name = name;
        this.namespace = namespace;
        this.comment = comment;
        this.docComment = docComment;
        this.superTypes = superTypes;
        this.interfaces = interfaces;
        this.properties = properties;
        this.methods = methods;
    }

    private ComplexTypeDefinition(Builder builder) {

        this.name = builder.name;
        this.namespace = builder.namespace;
        this.comment = builder.comment;
        this.docComment = builder.docComment;
        this.superTypes = builder.superTypes;
        this.interfaces = builder.interfaces;
        this.properties = builder.properties;
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

    public List<Property> getProperties() {
        return properties;
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
            ", properties=" + ((properties != null) ? properties.toString() : "null") +
            ", methods=" + ((methods != null) ? methods.toString() : "null") +
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
		result = prime * result + ((interfaces == null) ? 0 : interfaces.hashCode());
		result = prime * result + ((methods == null) ? 0 : methods.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((namespace == null) ? 0 : namespace.hashCode());
		result = prime * result + ((properties == null) ? 0 : properties.hashCode());
		result = prime * result + ((superTypes == null) ? 0 : superTypes.hashCode());
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
		ComplexTypeDefinition other = (ComplexTypeDefinition) obj;
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
		if (interfaces == null) {
			if (other.interfaces != null)
				return false;
		} else if (!interfaces.equals(other.interfaces))
			return false;
		if (methods == null) {
			if (other.methods != null)
				return false;
		} else if (!methods.equals(other.methods))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (namespace == null) {
			if (other.namespace != null)
				return false;
		} else if (!namespace.equals(other.namespace))
			return false;
		if (properties == null) {
			if (other.properties != null)
				return false;
		} else if (!properties.equals(other.properties))
			return false;
		if (superTypes == null) {
			if (other.superTypes != null)
				return false;
		} else if (!superTypes.equals(other.superTypes))
			return false;
		return true;
	}

}