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
        private List<Type> subtypes = new ArrayList<>();

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
    }

    public static Builder Builder() {
        return new Builder();
    }

    private final Name name;
    private final int size;
    private final List<Type> subtypes;

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
            "size=" + size +
            "]";
    }

}