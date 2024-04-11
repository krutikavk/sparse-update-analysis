# Bitset vs Boolean Solutions
I used [Java Object Layout (JOL)](https://mvnrepository.com/artifact/org.openjdk.jol/jol-core) to look at memory footprint for Bitset vs Boolean Objects. 

I compared Bitset vs Boolean solutions for comparing classes with: 
1. 3 fields 
2. 33 fields

## Data Classes with 3 fields: Bitset vs Boolean

[3-field Bitset class](https://github.com/krutikavk/sparse-update-analysis/blob/main/demo/src/main/java/com/example/demo/ShowBitset.java)

BITSET 3 fields class:
com.example.demo.ShowBitset object internals:
| OFF | SZ  |              TYPE DESCRIPTION             |       VALUE                                |
| --- | --- | ----------------------------------------- | ------------------------------------------ |
| 0   | 8   |                  (object header: mark)    |  0x0000000000000001 (non-biasable; age: 0) |
| 8   | 4   |                  (object header: class)   |  0x010d7658                                |
| 12  | 4   | java.lang.String ShowBitset.id            |  (object)                                  |
| 16  | 4   | java.lang.String ShowBitset.title         |  (object)                                  |
| 20  | 4   | java.lang.Integer ShowBitset.releaseYear  |   2010                                     |
| 24  | 4   | java.util.BitSet ShowBitset.fieldsPresent |  (object)                                  |
| 28  | 4   |                  (object alignment gap)   |                                            |
Instance size: 32 bytes
Space losses: 0 bytes internal + 4 bytes external = 4 bytes total

[3-field Boolean class](https://github.com/krutikavk/sparse-update-analysis/blob/main/demo/src/main/java/com/example/demo/ShowBoolean.java)

BOOLEAN 3 fields class:
com.example.demo.ShowBoolean object internals:
| OFF | SZ  |                    TYPE DESCRIPTION                |       VALUE                                |
| --- | --- | -------------------------------------------------- | ------------------------------------------ |
| 0   | 8   |                   (object header: mark)            | 0x0000000000000001 (non-biasable; age: 0)
| 8   | 4   |                  (object header: class)            | 0x010d7898
| 12  | 1   |          boolean ShowBoolean.isIdDefined           | true
| 13  | 1   |          boolean ShowBoolean.isTitleDefined        | true
| 14  | 1   |          boolean ShowBoolean.isReleaseYearDefined  | true
| 15  | 1   |                  (alignment/padding gap)           | 
| 16  | 4   | java.lang.String ShowBoolean.id                    | (object)
| 20  | 4   | java.lang.String ShowBoolean.title                 | (object)
| 24  | 4   |  java.lang.Integer ShowBoolean.releaseYear         |   2010
| 28  | 4   |                  (object alignment gap)            |
Instance size: 32 bytes
Space losses: 1 bytes internal + 4 bytes external = 5 bytes total

Both Bitset and Boolean based solutions fare similarly for both solutions.



## Data Classes with 33 fields: Bitset vs Boolean

[33-field Bitset class](https://github.com/krutikavk/sparse-update-analysis/blob/main/demo/src/main/java/com/example/demo/UpdateShowInputBitset.java)

BITSET 33 fields class:
com.example.demo.UpdateShowInputBitset object internals:
| OFF | SZ  |                       TYPE DESCRIPTION                  |       VALUE                                |
| --- | --- | ------------------------------------------------------- | ------------------------------------------ |
| 0   | 8   |                  (object header: mark)                  | 0x0000000000000001 (non-biasable; age: 0)  |
| 8   | 4   |                  (object header: class)                 | 0x010d7af0                                 |
| 12  | 4   |  java.lang.String UpdateShowInputBitset.id              | (object)                                   |
| 16  | 4   |  java.lang.String UpdateShowInputBitset.title           | (object)                                   |
| 20  | 4   |  java.lang.Integer UpdateShowInputBitset.releaseYear    | 2024                                       |
| 24  | 4   |  java.lang.String UpdateShowInputBitset.id1             | (object)                                   |
| 28  | 4   |  java.lang.String UpdateShowInputBitset.title1          | (object)                                   |
| 32  | 4   |  java.lang.Integer UpdateShowInputBitset.releaseYear1   | 2024                                       |
| 36  | 4   |  java.lang.String UpdateShowInputBitset.id2             | (object)                                   |
| 40  | 4   |  java.lang.String UpdateShowInputBitset.title2          | (object)                                   |
| 44  | 4   |  java.lang.Integer UpdateShowInputBitset.releaseYear2   | 2024                                       |
| 48  | 4   |  java.lang.String UpdateShowInputBitset.id3             | (object)                                   |
| 52  | 4   |  java.lang.String UpdateShowInputBitset.title3          | (object)                                   |
| 56  | 4   |  java.lang.Integer UpdateShowInputBitset.releaseYear3   | 2024                                       |
| 60  | 4   |  java.lang.String UpdateShowInputBitset.id4             | (object)                                   |
| 64  | 4   |  java.lang.String UpdateShowInputBitset.title4          | (object)                                   |
| 68  | 4   |  java.lang.Integer UpdateShowInputBitset.releaseYear4   | 2024                                       |
| 72  | 4   |  java.lang.String UpdateShowInputBitset.id5             | (object)                                   |
| 76  | 4   |  java.lang.String UpdateShowInputBitset.title5          | (object)                                   |
| 80  | 4   |  java.lang.Integer UpdateShowInputBitset.releaseYear5   | 2024                                       |
| 84  | 4   |  java.lang.String UpdateShowInputBitset.id6             | (object)                                   |
| 88  | 4   |  java.lang.String UpdateShowInputBitset.title6          | (object)                                   |
| 92  | 4   |  java.lang.Integer UpdateShowInputBitset.releaseYear6   | 2024                                       |
| 96  | 4   |  java.lang.String UpdateShowInputBitset.id7             | (object)                                   |
| 100 | 4   |  java.lang.String UpdateShowInputBitset.title7          | (object)                                   |
| 104 | 4   |  java.lang.Integer UpdateShowInputBitset.releaseYear7   | 2024                                       |
| 108 | 4   |  java.lang.String UpdateShowInputBitset.id8             | (object)                                   |
| 112 | 4   |  java.lang.String UpdateShowInputBitset.title8          | (object)                                   |
| 116 | 4   |  java.lang.Integer UpdateShowInputBitset.releaseYear8   | 2024                                       |
| 120 | 4   |  java.lang.String UpdateShowInputBitset.id9             | (object)                                   |
| 124 | 4   |  java.lang.String UpdateShowInputBitset.title9          | (object)                                   |
| 128 | 4   |  java.lang.Integer UpdateShowInputBitset.releaseYear9   | 2024                                       |
| 132 | 4   |  java.lang.String UpdateShowInputBitset.id10            | (object)                                   |
| 136 | 4   |  java.lang.String UpdateShowInputBitset.title10         | (object)                                   |
| 140 | 4   |  java.lang.Integer UpdateShowInputBitset.releaseYear10  | 2024                                       |
| 144 | 4   |  java.util.BitSet UpdateShowInputBitset.fieldsPresent   | (object)                                   |
| 148 | 4                     (object alignment gap)                
Instance size: 152 bytes
Space losses: 0 bytes internal + 4 bytes external = 4 bytes total


[33-field Boolean class](https://github.com/krutikavk/sparse-update-analysis/blob/main/demo/src/main/java/com/example/demo/UpdateShowInputBoolean.java)

BOOLEAN 33 fields class:
com.example.demo.UpdateShowInputBoolean object internals:
| OFF | SZ  |                           TYPE DESCRIPTION                      |       VALUE                                |
| --- | --- | --------------------------------------------------------------- | ------------------------------------------ |
| 0   | 8   |                  (object header: mark)                          | 0x0000000000000001 (non-biasable; age: 0)  |
| 8   | 4   |                  (object header: class)                         | 0x010d81f8                                 |
| 12  | 1   |          boolean UpdateShowInputBoolean.isReleaseYear10Defined  |  true                                      |
| 13  | 1   |          boolean UpdateShowInputBoolean.isTitleDefined          |  true                                      |
| 14  | 1   |          boolean UpdateShowInputBoolean.isReleaseYearDefined    |  true                                      |
| 15  | 1   |          boolean UpdateShowInputBoolean.isId1Defined            |  true                                      |
| 16  | 1   |          boolean UpdateShowInputBoolean.isTitle1Defined         |  true                                      |
| 17  | 1   |          boolean UpdateShowInputBoolean.isReleaseYear1Defined   |  true                                      |
| 18  | 1   |          boolean UpdateShowInputBoolean.isId2Defined            |  true                                      |
| 19  | 1   |          boolean UpdateShowInputBoolean.isTitle2Defined         |  true                                      |
| 20  | 1   |          boolean UpdateShowInputBoolean.isReleaseYear2Defined   |  true                                      |
| 21  | 1   |          boolean UpdateShowInputBoolean.isId3Defined            |  true                                      |
| 22  | 1   |          boolean UpdateShowInputBoolean.isTitle3Defined         |  true                                      |
| 23  | 1   |          boolean UpdateShowInputBoolean.isReleaseYear3Defined   |  true                                      |
| 24  | 1   |          boolean UpdateShowInputBoolean.isId4Defined            |  true                                      |
| 25  | 1   |          boolean UpdateShowInputBoolean.isTitle4Defined         |  true                                      |
| 26  | 1   |          boolean UpdateShowInputBoolean.isReleaseYear4Defined   |  true                                      |
| 27  | 1   |          boolean UpdateShowInputBoolean.isId5Defined            |  true                                      |
| 28  | 1   |          boolean UpdateShowInputBoolean.isTitle5Defined         |  true                                      |
| 29  | 1   |          boolean UpdateShowInputBoolean.isReleaseYear5Defined   |  true                                      |
| 30  | 1   |          boolean UpdateShowInputBoolean.isId6Defined            |  true                                      |
| 31  | 1   |          boolean UpdateShowInputBoolean.isTitle6Defined         |  true                                      |
| 32  | 1   |          boolean UpdateShowInputBoolean.isReleaseYear6Defined   |  true                                      |
| 33  | 1   |          boolean UpdateShowInputBoolean.isId7Defined            |  true                                      |
| 34  | 1   |          boolean UpdateShowInputBoolean.isTitle7Defined         |  true                                      |
| 35  | 1   |          boolean UpdateShowInputBoolean.isReleaseYear7Defined   |  true                                      |
| 36  | 1   |          boolean UpdateShowInputBoolean.isId8Defined            |  true                                      |
| 37  | 1   |          boolean UpdateShowInputBoolean.isTitle8Defined         |  true                                      |
| 38  | 1   |          boolean UpdateShowInputBoolean.isReleaseYear8Defined   |  true                                      |
| 39  | 1   |          boolean UpdateShowInputBoolean.isId9Defined            |  true                                      |
| 40  | 1   |          boolean UpdateShowInputBoolean.isTitle9Defined         |  true                                      |
| 41  | 1   |          boolean UpdateShowInputBoolean.isReleaseYear9Defined   |  true                                      |
| 42  | 1   |          boolean UpdateShowInputBoolean.isId10Defined           |  true                                      |
| 43  | 1   |          boolean UpdateShowInputBoolean.isTitle10Defined        |  true                                      |
| 44  | 1   |          boolean UpdateShowInputBoolean.isIdDefined             |  true                                      |
| 45  | 3   |                  (alignment/padding gap)                        |                                            |
| 48  | 4   |  java.lang.String UpdateShowInputBoolean.id                     |  (object)                                  |
| 52  | 4   |  java.lang.String UpdateShowInputBoolean.title                  |  (object)                                  |
| 56  | 4   |  java.lang.Integer UpdateShowInputBoolean.releaseYear           |   2025                                     |
| 60  | 4   |  java.lang.String UpdateShowInputBoolean.id1                    |  (object)                                  |
| 64  | 4   |  java.lang.String UpdateShowInputBoolean.title1                 |  (object)                                  |
| 68  | 4   |  java.lang.Integer UpdateShowInputBoolean.releaseYear1          |   2025                                     |
| 72  | 4   |  java.lang.String UpdateShowInputBoolean.id2                    |  (object)                                  |
| 76  | 4   |  java.lang.String UpdateShowInputBoolean.title2                 |  (object)                                  |
| 80  | 4   |  java.lang.Integer UpdateShowInputBoolean.releaseYear2          |   2025                                     |
| 84  | 4   |  java.lang.String UpdateShowInputBoolean.id3                    |  (object)                                  |
| 88  | 4   |  java.lang.String UpdateShowInputBoolean.title3                 |  (object)                                  |
| 92  | 4   |  java.lang.Integer UpdateShowInputBoolean.releaseYear3          |   2025                                     |
| 96  | 4   |  java.lang.String UpdateShowInputBoolean.id4                    |  (object)                                  |
| 100 | 4   |  java.lang.String UpdateShowInputBoolean.title4                 |  (object)                                  |
| 104 | 4   |  java.lang.Integer UpdateShowInputBoolean.releaseYear4          |   2025                                     |
| 108 | 4   |  java.lang.String UpdateShowInputBoolean.id5                    |  (object)                                  |
| 112 | 4   |  java.lang.String UpdateShowInputBoolean.title5                 |  (object)                                  |
| 116 | 4   |  java.lang.Integer UpdateShowInputBoolean.releaseYear5          |   2025                                     |
| 120 | 4   |  java.lang.String UpdateShowInputBoolean.id6                    |  (object)                                  |
| 124 | 4   |  java.lang.String UpdateShowInputBoolean.title6                 |  (object)                                  |
| 128 | 4   |  java.lang.Integer UpdateShowInputBoolean.releaseYear6          |   2025                                     |
| 132 | 4   |  java.lang.String UpdateShowInputBoolean.id7                    |  (object)                                  |
| 136 | 4   |  java.lang.String UpdateShowInputBoolean.title7                 |  (object)                                  |
| 140 | 4   |  java.lang.Integer UpdateShowInputBoolean.releaseYear7          |   2025                                     |
| 144 | 4   |  java.lang.String UpdateShowInputBoolean.id8                    |  (object)                                  |
| 148 | 4   |  java.lang.String UpdateShowInputBoolean.title8                 |  (object)                                  |
| 152 | 4   |  java.lang.Integer UpdateShowInputBoolean.releaseYear8          |   2025                                     |
| 156 | 4   |  java.lang.String UpdateShowInputBoolean.id9                    |  (object)                                  |
| 160 | 4   |  java.lang.String UpdateShowInputBoolean.title9                 |  (object)                                  |
| 164 | 4   |  java.lang.Integer UpdateShowInputBoolean.releaseYear9          |   2025                                     |
| 168 | 4   |  java.lang.String UpdateShowInputBoolean.id10                   |  (object)                                  |
| 172 | 4   |  java.lang.String UpdateShowInputBoolean.title10                |  (object)                                  |
| 176 | 4   | java.lang.Integer UpdateShowInputBoolean.releaseYear10          |  2025                                      |
| 180 | 4   |                 (object alignment gap)                          
Instance size: 184 bytes
Space losses: 3 bytes internal + 4 bytes external = 7 bytes total


This indicates Boolean fields consume a 1-byte space while Bitset is much more optimized for storing Boolean field values. 
This disparity will increase further with increase in fields. 












