package com.example.demo;

import java.lang.Integer;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;

public class ShowBoolean {
    private String id;

    private String title;

    private Integer releaseYear;

    private boolean isIdDefined = false;

    private boolean isTitleDefined = false;

    private boolean isReleaseYearDefined = false;

    public ShowBoolean() {
    }

    public ShowBoolean(String id, String title, Integer releaseYear) {
        this.id = id;
        this.isIdDefined = true;
        this.title = title;
        this.isTitleDefined = true;
        this.releaseYear = releaseYear;
        this.isReleaseYearDefined = true;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
        this.isIdDefined = true;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.isTitleDefined = true;
    }

    public Integer getReleaseYear() {
        return releaseYear;
    }

    public void setReleaseYear(Integer releaseYear) {
        this.releaseYear = releaseYear;
        this.isReleaseYearDefined = true;
    }

    @Override
    public String toString() {
        return "Show{" + "id='" + id + "'," +"title='" + title + "'," +"releaseYear='" + releaseYear + "'" +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ShowBoolean that = (ShowBoolean) o;
        return java.util.Objects.equals(id, that.id) &&
                java.util.Objects.equals(title, that.title) &&
                java.util.Objects.equals(releaseYear, that.releaseYear);
    }

    @Override
    public int hashCode() {
        return java.util.Objects.hash(id, title, releaseYear);
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public boolean getIsIdDefined() {
        return isIdDefined;
    }

    public boolean getIsTitleDefined() {
        return isTitleDefined;
    }

    public boolean getIsReleaseYearDefined() {
        return isReleaseYearDefined;
    }

    public static class Builder {
        private String id;

        private String title;

        private Integer releaseYear;

        private boolean isIdDefined = false;

        private boolean isTitleDefined = false;

        private boolean isReleaseYearDefined = false;

        public ShowBoolean build() {
            com.example.demo.ShowBoolean result = new com.example.demo.ShowBoolean();
            if(this.isIdDefined) {
                result.setId(this.id);
            }
            if(this.isTitleDefined) {
                result.setTitle(this.title);
            }
            if(this.isReleaseYearDefined) {
                result.setReleaseYear(this.releaseYear);
            }
            return result;
        }

        public com.example.demo.ShowBoolean.Builder id(String id) {
            this.id = id;
            this.isIdDefined = true;
            return this;
        }

        public com.example.demo.ShowBoolean.Builder title(String title) {
            this.title = title;
            this.isTitleDefined = true;
            return this;
        }

        public com.example.demo.ShowBoolean.Builder releaseYear(Integer releaseYear) {
            this.releaseYear = releaseYear;
            this.isReleaseYearDefined = true;
            return this;
        }

        public boolean getIsIdDefined() {
            return isIdDefined;
        }

        public boolean getIsTitleDefined() {
            return isTitleDefined;
        }

        public boolean getIsReleaseYearDefined() {
            return isReleaseYearDefined;
        }
    }
}
