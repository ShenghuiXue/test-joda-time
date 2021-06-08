# test-joda-time

Test the output of DateTimeFormat.patternForStyle("S-", locale) method in joda-time running in java 8 and open jdk-11

```java
****************************************************** 
locale: en_GB
format: dd/MM/y
java version: 11
****************************************************** 
locale: fr
format: dd/MM/y
java version: 11
****************************************************** 
locale: en_US
format: M/d/yy
java version: 11
****************************************************** 
locale: en_CA
format: y-MM-dd
java version: 11

****************************************************** 
locale: en_GB
format: dd/MM/yy
java version: 1.8.0_221
****************************************************** 
locale: fr
format: dd/MM/yy
java version: 1.8.0_221
****************************************************** 
locale: en_US
format: M/d/yy
java version: 1.8.0_221
****************************************************** 
locale: en_CA
format: dd/MM/yy
java version: 1.8.0_221
```
