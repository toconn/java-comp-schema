package ua.comp.schema.data;

import java.util.LinkedHashMap;

/**
 * Created with CodeCrank.io
 */
public class Schema {

    public static class Builder {

        private String namespace = null;
        private Type rootType = null;
        private LinkedHashMap<String,TypeDefinition> typeDefinitionListMap = new LinkedHashMap<>();
        private LinkedHashMap<String,String> typeNamespaceListMap = new LinkedHashMap<>();		// Maps a type to a default namespace if known.

        public Builder namespace(String namespace) {
            this.namespace = namespace; return this;
        }

        public Builder rootType(Type rootType) {
            this.rootType = rootType; return this;
        }

         public Builder typeDefinitionListMap(LinkedHashMap<String,TypeDefinition> typeDefinitionListMap) {
            this.typeDefinitionListMap = typeDefinitionListMap; return this;
        }

        public Builder typeNamespaceListMap(LinkedHashMap<String,String> typeNamespaceListMap) {
            this.typeNamespaceListMap = typeNamespaceListMap; return this;
        }

        public Schema build() {
            return new Schema(this);
        }
        
	    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	    	// Do Not Overwrite With Generated Code...                                                                       //
	    	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

        public Builder typeDefinition(TypeDefinition typeDefinition) {
            this.typeDefinitionListMap.put(typeDefinition.getName().getValue(), typeDefinition); return this;
        }

    }

    public static Builder Builder() {
        return new Builder();
    }

    private String namespace;
    private Type rootType;
    private LinkedHashMap<String,TypeDefinition> typeDefinitionListMap;
    private LinkedHashMap<String,String> typeNamespaceListMap;		// Maps a type to a default namespace if known.

    public Schema() {
    	
    		this.typeDefinitionListMap = new LinkedHashMap<>();
    		this.typeNamespaceListMap = new LinkedHashMap<>();
    }

    public Schema(String namespace, Type rootType, LinkedHashMap<String,TypeDefinition> typeDefinitionListMap, LinkedHashMap<String,String> typeNamespaceListMap) {

        if (rootType == null) {
            throw new NullPointerException ("rootType - null not allowed.");
        }
        
        this.namespace = namespace;
        this.rootType = rootType;
        this.typeDefinitionListMap = typeDefinitionListMap;
        this.typeNamespaceListMap = typeNamespaceListMap;
    }

    private Schema(Builder builder) {

        this.namespace = builder.namespace;
        this.rootType = builder.rootType;
        this.typeDefinitionListMap = builder.typeDefinitionListMap;
        this.typeNamespaceListMap = builder.typeNamespaceListMap;

        if (rootType == null) {
            throw new NullPointerException ("rootType - null not allowed.");
        }
    }

    public String getNamespace() {
        return namespace;
    }

    public Type getRootType() {
        return rootType;
    }

    public LinkedHashMap<String,TypeDefinition> getTypeDefinitionListMap() {
        return typeDefinitionListMap;
    }

    public LinkedHashMap<String,String> getTypeNamespaceListMap() {
        return typeNamespaceListMap;
    }

    public void setNamespace(String namespace) {
        this.namespace = namespace;
    }

    public void setRootType(Type rootType) {
        if (rootType == null) {
            throw new NullPointerException ("rootType - null not allowed.");
        }
        this.rootType = rootType;
    }

    public void setTypeDefinitionListMap(LinkedHashMap<String,TypeDefinition> typeDefinitionListMap) {
        this.typeDefinitionListMap = typeDefinitionListMap;
    }

    public void setTypeNamespaceListMap(LinkedHashMap<String,String> typeNamespaceListMap) {
        this.typeNamespaceListMap = typeNamespaceListMap;
    }

    @Override
    public String toString() {
        return "Schema [" +
            "namespace=" + ((namespace != null) ? "\"" + namespace + "\"" : "null") +
            ", typeDefinitionListMap=" + ((typeDefinitionListMap != null) ? typeDefinitionListMap.toString() : "null") +
            "]";
    }

	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	// Do Not Overwrite With Generated Code...                                                                       //
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((namespace == null) ? 0 : namespace.hashCode());
		result = prime * result + ((rootType == null) ? 0 : rootType.hashCode());
		result = prime * result + ((typeDefinitionListMap == null) ? 0 : typeDefinitionListMap.hashCode());
		result = prime * result + ((typeNamespaceListMap == null) ? 0 : typeNamespaceListMap.hashCode());
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
		Schema other = (Schema) obj;
		if (namespace == null) {
			if (other.namespace != null)
				return false;
		} else if (!namespace.equals(other.namespace))
			return false;
		if (rootType == null) {
			if (other.rootType != null)
				return false;
		} else if (!rootType.equals(other.rootType))
			return false;
		if (typeDefinitionListMap == null) {
			if (other.typeDefinitionListMap != null)
				return false;
		} else if (!typeDefinitionListMap.equals(other.typeDefinitionListMap))
			return false;
		if (typeNamespaceListMap == null) {
			if (other.typeNamespaceListMap != null)
				return false;
		} else if (!typeNamespaceListMap.equals(other.typeNamespaceListMap))
			return false;
		return true;
	}
    
    

}