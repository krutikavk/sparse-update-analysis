package com.example.demo;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.util.BitSet;

public class ShowBitset {
    private String id;

    private String title;

    private Integer releaseYear;

    private final transient BitSet fieldsPresent = new BitSet();

    public ShowBitset() {
    }

    public ShowBitset(String id, String title, Integer releaseYear) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        setField(Field.ID);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        setField(Field.TITLE);
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
        setField(Field.RELEASEYEAR);
    }

    private void setField(Field field) {
        fieldsPresent.set(field.getOrdinal());
    }

    private boolean isSet(Field field) {
        return fieldsPresent.get(field.getOrdinal());
    }

    @Override
    public String toString() {
        return "Show{" + "id='" + id + "'," +"title='" + title + "'," +"releaseYear='" + releaseYear + "'" +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowBitset that = (ShowBitset) o;
        return java.util.Objects.equals(id, that.id) &&
                java.util.Objects.equals(title, that.title) &&
                java.util.Objects.equals(releaseYear, that.releaseYear) &&
                java.util.Objects.equals(fieldsPresent, that.fieldsPresent);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, title, releaseYear, fieldsPresent);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public enum Field {
        ID,

        TITLE,

        RELEASEYEAR;

        int ordinal = -1;

        Field() {
            this.ordinal = ordinal;
        }

        public int getOrdinal() {
            return ordinal;
        }
    }

    public static class Builder {
        private String id;

        private String title;

        private Integer releaseYear;

        private final transient BitSet fieldsPresent = new BitSet();

        public ShowBitset build() {
            com.example.demo.ShowBitset result = new com.example.demo.ShowBitset();
            result.id = this.id;
            result.title = this.title;
            result.releaseYear = this.releaseYear;
            for (Field field: Field.values()) {
                if (this.isSet(field)) {
                    result.setField(field);
                }
            }
            return result;
        }

        private void setField(Field field) {
            fieldsPresent.set(field.getOrdinal());
        }

        private boolean isSet(Field field) {
            return fieldsPresent.get(field.getOrdinal());
        }

        public com.example.demo.ShowBitset.Builder id(String id) {
            this.id = id;
            setField(Field.ID);
            return this;
        }

        public com.example.demo.ShowBitset.Builder title(String title) {
            this.title = title;
            setField(Field.TITLE);
            return this;
        }

        public com.example.demo.ShowBitset.Builder releaseYear(Integer releaseYear) {
            this.releaseYear = releaseYear;
            setField(Field.RELEASEYEAR);
            return this;
        }
    }
}
