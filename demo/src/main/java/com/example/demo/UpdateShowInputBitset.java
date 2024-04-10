package com.example.demo;

import java.util.BitSet;

public class UpdateShowInputBitset {
    private String id;
    private String title;
    private Integer releaseYear;

    private String id1;
    private String title1;
    private Integer releaseYear1;

    private String id2;
    private String title2;
    private Integer releaseYear2;

    private String id3;
    private String title3;
    private Integer releaseYear3;

    private String id4;
    private String title4;
    private Integer releaseYear4;

    private String id5;
    private String title5;
    private Integer releaseYear5;

    private String id6;
    private String title6;
    private Integer releaseYear6;

    private String id7;
    private String title7;
    private Integer releaseYear7;

    private String id8;
    private String title8;
    private Integer releaseYear8;

    private String id9;
    private String title9;
    private Integer releaseYear9;

    private String id10;
    private String title10;
    private Integer releaseYear10;

    private final transient BitSet fieldsPresent = new BitSet();

    private void setField(Field field) {
        fieldsPresent.set(field.getOrdinal());
    }

    public boolean isSet(Field field) {
        return fieldsPresent.get(field.getOrdinal());
    }

    public UpdateShowInputBitset() {
    }

    public UpdateShowInputBitset(String id, String title, Integer releaseYear) {
        this.id = id;
        this.title = title;
        this.releaseYear = releaseYear;

        setField(Field.ID);
        setField(Field.TITLE);
        setField(Field.RELEASE_YEAR);

        this.id1 = id;
        this.title1 = title;
        this.releaseYear1 = releaseYear;

        setField(Field.ID1);
        setField(Field.TITLE1);
        setField(Field.RELEASE_YEAR1);

        this.id2 = id;
        this.title2 = title;
        this.releaseYear2 = releaseYear;

        setField(Field.ID2);
        setField(Field.TITLE2);
        setField(Field.RELEASE_YEAR2);

        this.id3 = id;
        this.title3 = title;
        this.releaseYear3 = releaseYear;

        setField(Field.ID3);
        setField(Field.TITLE3);
        setField(Field.RELEASE_YEAR3);

        this.id4 = id;
        this.title4 = title;
        this.releaseYear4 = releaseYear;

        setField(Field.ID4);
        setField(Field.TITLE4);
        setField(Field.RELEASE_YEAR4);

        this.id5 = id;
        this.title5 = title;
        this.releaseYear5 = releaseYear;

        setField(Field.ID5);
        setField(Field.TITLE5);
        setField(Field.RELEASE_YEAR5);

        this.id6 = id;
        this.title6 = title;
        this.releaseYear6 = releaseYear;

        setField(Field.ID6);
        setField(Field.TITLE6);
        setField(Field.RELEASE_YEAR6);

        this.id7 = id;
        this.title7 = title;
        this.releaseYear7 = releaseYear;

        setField(Field.ID7);
        setField(Field.TITLE7);
        setField(Field.RELEASE_YEAR7);

        this.id8 = id;
        this.title8 = title;
        this.releaseYear8 = releaseYear;

        setField(Field.ID8);
        setField(Field.TITLE8);
        setField(Field.RELEASE_YEAR8);

        this.id9 = id;
        this.title9 = title;
        this.releaseYear9 = releaseYear;

        setField(Field.ID9);
        setField(Field.TITLE9);
        setField(Field.RELEASE_YEAR9);

        this.id10 = id;
        this.title10 = title;
        this.releaseYear10 = releaseYear;

        setField(Field.ID10);
        setField(Field.TITLE10);
        setField(Field.RELEASE_YEAR10);
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
        setField(Field.RELEASE_YEAR);
    }


    // 1
    public String getId1() {
        return id1;
    }

    public void setId1(String id) {
        this.id1 = id;
        setField(Field.ID1);
    }

    public String getTitle1() {
        return title1;
    }

    public void setTitle1(String title) {
        this.title1 = title;
        setField(Field.TITLE1);
    }

    public Integer getReleaseYear1() {
        return releaseYear1;
    }

    public void setReleaseYear1(Integer releaseYear) {
        this.releaseYear1 = releaseYear;
        setField(Field.RELEASE_YEAR1);
    }

    public String getId2() {
        return id2;
    }

    public void setId2(String id) {
        this.id2 = id;
        setField(Field.ID2);
    }

    public String getTitle2() {
        return title2;
    }

    public void setTitle2(String title) {
        this.title2 = title;
        setField(Field.TITLE2);
    }

    public Integer getReleaseYear2() {
        return releaseYear2;
    }

    public void setReleaseYear2(Integer releaseYear) {
        this.releaseYear2 = releaseYear;
        setField(Field.RELEASE_YEAR2);
    }


    public String getId3() {
        return id3;
    }

    public void setId3(String id) {
        this.id3 = id;
        setField(Field.ID3);
    }

    public String getTitle3() {
        return title3;
    }

    public void setTitle3(String title) {
        this.title3 = title;
        setField(Field.TITLE3);
    }

    public Integer getReleaseYear3() {
        return releaseYear3;
    }

    public void setReleaseYear3(Integer releaseYear) {
        this.releaseYear3 = releaseYear;
        setField(Field.RELEASE_YEAR3);
    }

    public String getId4() {
        return id4;
    }

    public void setId4(String id) {
        this.id4 = id;
        setField(Field.ID4);
    }

    public String getTitle4() {
        return title4;
    }

    public void setTitle4(String title) {
        this.title4 = title;
        setField(Field.TITLE4);
    }

    public Integer getReleaseYear4() {
        return releaseYear4;
    }

    public void setReleaseYear4(Integer releaseYear) {
        this.releaseYear4 = releaseYear;
        setField(Field.RELEASE_YEAR4);
    }

    public String getId5() {
        return id5;
    }

    public void setId5(String id) {
        this.id5 = id;
        setField(Field.ID5);
    }

    public String getTitle5() {
        return title5;
    }

    public void setTitle5(String title) {
        this.title5 = title;
        setField(Field.TITLE5);
    }

    public Integer getReleaseYear5() {
        return releaseYear5;
    }

    public void setReleaseYear5(Integer releaseYear) {
        this.releaseYear5 = releaseYear;
        setField(Field.RELEASE_YEAR5);
    }

    public String getId6() {
        return id6;
    }

    public void setId6(String id) {
        this.id6 = id;
        setField(Field.ID6);
    }

    public String getTitle6() {
        return title6;
    }

    public void setTitle6(String title) {
        this.title6 = title;
        setField(Field.TITLE6);
    }

    public Integer getReleaseYear6() {
        return releaseYear6;
    }

    public void setReleaseYear6(Integer releaseYear) {
        this.releaseYear6 = releaseYear;
        setField(Field.RELEASE_YEAR6);
    }

    public String getId7() {
        return id7;
    }

    public void setId7(String id) {
        this.id7 = id;
        setField(Field.ID7);
    }

    public String getTitle7() {
        return title7;
    }

    public void setTitle7(String title) {
        this.title7 = title;
        setField(Field.TITLE7);
    }

    public Integer getReleaseYear7() {
        return releaseYear7;
    }

    public void setReleaseYear7(Integer releaseYear) {
        this.releaseYear7 = releaseYear;
        setField(Field.RELEASE_YEAR7);
    }

    public String getId8() {
        return id8;
    }

    public void setId8(String id) {
        this.id8 = id;
        setField(Field.ID8);
    }

    public String getTitle8() {
        return title8;
    }

    public void setTitle8(String title) {
        this.title8 = title;
        setField(Field.TITLE8);
    }

    public Integer getReleaseYear8() {
        return releaseYear8;
    }

    public void setReleaseYear8(Integer releaseYear) {
        this.releaseYear8 = releaseYear;
        setField(Field.RELEASE_YEAR8);
    }

    public String getId9() {
        return id9;
    }

    public void setId9(String id) {
        this.id9 = id;
        setField(Field.ID9);
    }

    public String getTitle9() {
        return title9;
    }

    public void setTitle9(String title) {
        this.title9 = title;
        setField(Field.TITLE9);
    }

    public Integer getReleaseYear9() {
        return releaseYear9;
    }

    public void setReleaseYear9(Integer releaseYear) {
        this.releaseYear9 = releaseYear;
        setField(Field.RELEASE_YEAR9);
    }

    public String getId10() {
        return id10;
    }

    public void setId10(String id) {
        this.id10 = id;
        setField(Field.ID10);
    }

    public String getTitle10() {
        return title10;
    }

    public void setTitle10(String title) {
        this.title10 = title;
        setField(Field.TITLE10);
    }

    public Integer getReleaseYear10() {
        return releaseYear10;
    }

    public void setReleaseYear10(Integer releaseYear) {
        this.releaseYear10 = releaseYear;
        setField(Field.RELEASE_YEAR10);
    }

    @Override
    public String toString() {
        return "UpdateShowInputBitset{" + "id='" + id + "'," +"title='" + title + "'," +"releaseYear='" + releaseYear + "'" +"}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UpdateShowInputBitset that = (UpdateShowInputBitset) o;
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

    public static class Builder {
        private String id;

        private String title;

        private Integer releaseYear;

        private String id1;
        private String title1;
        private Integer releaseYear1;

        private String id2;
        private String title2;
        private Integer releaseYear2;

        private String id3;
        private String title3;
        private Integer releaseYear3;

        private String id4;
        private String title4;
        private Integer releaseYear4;

        private String id5;
        private String title5;
        private Integer releaseYear5;

        private String id6;
        private String title6;
        private Integer releaseYear6;

        private String id7;
        private String title7;
        private Integer releaseYear7;

        private String id8;
        private String title8;
        private Integer releaseYear8;

        private String id9;
        private String title9;
        private Integer releaseYear9;

        private String id10;
        private String title10;
        private Integer releaseYear10;

        private final transient BitSet fieldsPresent = new BitSet();

        private void setField(Field field) {
            fieldsPresent.set(field.getOrdinal());
        }

        private boolean isSet(Field field) {
            return fieldsPresent.get(field.getOrdinal());
        }

        public com.example.demo.UpdateShowInputBitset build() {
            com.example.demo.UpdateShowInputBitset result = new com.example.demo.UpdateShowInputBitset();
            result.id = this.id;
            result.title = this.title;
            result.releaseYear = this.releaseYear;

            result.id1 = this.id1;
            result.title1 = this.title1;
            result.releaseYear1 = this.releaseYear1;

            result.id2 = this.id2;
            result.title2 = this.title2;
            result.releaseYear2 = this.releaseYear2;

            result.id3 = this.id3;
            result.title3 = this.title3;
            result.releaseYear3 = this.releaseYear3;

            result.id4 = this.id4;
            result.title4 = this.title4;
            result.releaseYear4 = this.releaseYear4;

            result.id5 = this.id5;
            result.title5 = this.title5;
            result.releaseYear5 = this.releaseYear5;

            result.id6 = this.id6;
            result.title6 = this.title6;
            result.releaseYear6 = this.releaseYear6;

            result.id7 = this.id7;
            result.title7 = this.title7;
            result.releaseYear7 = this.releaseYear7;

            result.id8 = this.id8;
            result.title8 = this.title8;
            result.releaseYear8 = this.releaseYear8;

            result.id9 = this.id9;
            result.title9 = this.title9;
            result.releaseYear9 = this.releaseYear9;

            result.id10 = this.id10;
            result.title10 = this.title10;
            result.releaseYear10 = this.releaseYear10;

            for (Field field: Field.values()) {
                if (this.isSet(field)) {
                    result.setField(field);
                }
            }
            return result;
        }

        public com.example.demo.UpdateShowInputBitset.Builder id(String id) {
            this.id = id;
            setField(Field.ID);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder title(String title) {
            this.title = title;
            setField(Field.TITLE);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder releaseYear(
                Integer releaseYear) {
            this.releaseYear = releaseYear;
            setField(Field.RELEASE_YEAR);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder id1(String id1) {
            this.id1 = id1;
            setField(Field.ID1);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder title1(String title1) {
            this.title1 = title1;
            setField(Field.TITLE1);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder releaseYear1(
                Integer releaseYear) {
            this.releaseYear1 = releaseYear1;
            setField(Field.RELEASE_YEAR1);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder id2(String id2) {
            this.id2 = id2;
            setField(Field.ID2);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder title2(String title3) {
            this.title3 = title3;
            setField(Field.TITLE3);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder releaseYear2(
                Integer releaseYear2) {
            this.releaseYear2 = releaseYear2;
            setField(Field.RELEASE_YEAR2);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder id3(String id3) {
            this.id3 = id3;
            setField(Field.ID3);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder title3(String title3) {
            this.title3 = title3;
            setField(Field.TITLE3);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder releaseYear3(
                Integer releaseYear) {
            this.releaseYear3 = releaseYear3;
            setField(Field.RELEASE_YEAR4);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder id4(String id3) {
            this.id3 = id3;
            setField(Field.ID3);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder title4(String title3) {
            this.title3 = title3;
            setField(Field.TITLE3);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder releaseYear4(
                Integer releaseYear4) {
            this.releaseYear4 = releaseYear4;
            setField(Field.RELEASE_YEAR4);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder id5(String id5) {
            this.id5 = id5;
            setField(Field.ID5);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder title5(String title5) {
            this.title5 = title5;
            setField(Field.TITLE5);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder releaseYear5(
                Integer releaseYear) {
            this.releaseYear5 = releaseYear5;
            setField(Field.RELEASE_YEAR5);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder id6(String id6) {
            this.id6 = id6;
            setField(Field.ID6);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder title6(String title6) {
            this.title6 = title6;
            setField(Field.TITLE6);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder releaseYear6(
                Integer releaseYear) {
            this.releaseYear6 = releaseYear6;
            setField(Field.RELEASE_YEAR6);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder id7(String id7) {
            this.id7 = id7;
            setField(Field.ID7);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder title7(String title7) {
            this.title7 = title7;
            setField(Field.TITLE7);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder releaseYear7(
                Integer releaseYear) {
            this.releaseYear7 = releaseYear7;
            setField(Field.RELEASE_YEAR7);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder id8(String id8) {
            this.id8 = id8;
            setField(Field.ID8);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder title8(String title8) {
            this.title8 = title8;
            setField(Field.TITLE8);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder releaseYear8(
                Integer releaseYear) {
            this.releaseYear8 = releaseYear8;
            setField(Field.RELEASE_YEAR8);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder id9(String id9) {
            this.id9 = id9;
            setField(Field.ID9);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder title9(String title9) {
            this.title9 = title9;
            setField(Field.TITLE9);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder releaseYear9(
                Integer releaseYear) {
            this.releaseYear9 = releaseYear9;
            setField(Field.RELEASE_YEAR9);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder id10(String id10) {
            this.id10 = id10;
            setField(Field.ID10);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder title10(String title10) {
            this.title10 = title10;
            setField(Field.TITLE10);
            return this;
        }

        public com.example.demo.UpdateShowInputBitset.Builder releaseYear10(
                Integer releaseYear) {
            this.releaseYear10 = releaseYear10;
            setField(Field.RELEASE_YEAR10);
            return this;
        }
    }

    public enum Field {
        ID(0),
        TITLE(1),
        RELEASE_YEAR(2),

        ID1(3),
        TITLE1(4),
        RELEASE_YEAR1(5),

        ID2(6),
        TITLE2(7),
        RELEASE_YEAR2(8),

        ID3(9),
        TITLE3(10),
        RELEASE_YEAR3(11),

        ID4(12),
        TITLE4(13),
        RELEASE_YEAR4(14),

        ID5(15),
        TITLE5(16),
        RELEASE_YEAR5(17),

        ID6(18),
        TITLE6(19),
        RELEASE_YEAR6(20),

        ID7(21),
        TITLE7(22),
        RELEASE_YEAR7(23),

        ID8(24),
        TITLE8(25),
        RELEASE_YEAR8(26),

        ID9(27),
        TITLE9(28),
        RELEASE_YEAR9(29),

        ID10(30),
        TITLE10(31),
        RELEASE_YEAR10(32);


        int ordinal = -1;

        Field(int ordinal) {
            this.ordinal = ordinal;
        }

        public int getOrdinal() {
            return ordinal;
        }
    }
}
