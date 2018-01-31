package ua.comp.schema.data;

import java.util.ArrayList;
import java.util.List;

/**
 * Created with CodeCrank.io
 */
public class StandardType implements Type {

    public static class Builder {

        private Name name = null;
        private int size = 0;
        private List<Type> subtypes = null;

        public Builder name(Name name) {
            this.name = name; return this;
        }

        public Builder size(int size) {
            this.size = size; return this;
        }

        public Builder subtypes(List<Type> subtypes) {
            this.subtypes = subtypes; return this;
        }

        public StandardType build() {
            return new StandardType(this);
        }

	    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    	// Do Not Overwrite With Generated Code...                                                                       //
	    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	    public Builder name(String name) {
	        this.name = new Name (name); return this;
	    }

        public Builder subtype(Type subtype) {
        	
        		if (this.subtypes == null) {
        			this.subtypes = new ArrayList<>();
        		}
            this.subtypes.add (subtype);
            
            return this;
        }

    }

    public static Builder Builder() {
        return new Builder();
    }

    private final Name name;
    private final int size;
    private final List<Type> subtypes;
    
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Do Not Overwrite With Generated Code...                                                                       //
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

    public StandardType (String name) {
    	
    		this.name = new Name (name);
    		this.size = 0;
    		subtypes = null;
    }

    public StandardType(Name name, int size, List<Type> subtypes) {

        if (name == null) {
            throw new NullPointerException ("name - null not allowed.");
        }

        this.name = name;
        this.size = size;
        this.subtypes = subtypes;
    }

    private StandardType(Builder builder) {

        this.name = builder.name;
        this.size = builder.size;
        this.subtypes = builder.subtypes;

        if (name == null) {
            throw new NullPointerException ("name - null not allowed.");
        }
    }

    @Override
    public Name getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public List<Type> getSubtypes() {
        return subtypes;
    }

    @Override
    public boolean isEnum() {

        return false;
    }

    @Override
    public String toString() {
        return "StandardType [" +
            "name=" + ((name != null) ? name.toString() : "null") +
            ", size=" + size +
            ", subtypes=" + ((subtypes != null) ? subtypes.toString() : "null") +
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
		result = prime * result + size;
		result = prime * result + ((subtypes == null) ? 0 : subtypes.hashCode());
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
		StandardType other = (StandardType) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (size != other.size)
			return false;
		if (subtypes == null) {
			if (other.subtypes != null)
				return false;
		} else if (!subtypes.equals(other.subtypes))
			return false;
		return true;
	}
 
}