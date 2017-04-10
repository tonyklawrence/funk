[![Travis Build Status](https://api.travis-ci.org/tonyklawrence/funk.svg)](https://travis-ci.org/tonyklawrence/funk)
[![Current Release Vesion](https://img.shields.io/badge/funk-1.2.2-blue.svg)](https://github.com/tonyklawrence/funk/releases/tag/v1.2.2)
[![Maven Central](https://img.shields.io/maven-central/v/com.tonylawrence/funk.svg)](https://search.maven.org/#search%7Cga%7C1%7Cg%3A%22com.tonylawrence%22%20AND%20a%3A%22funk%22)

# FunK
FunK, the missing kotlin functions

This small library adds those functions to Kotlin that you are surpised that didn't exist in the first place.

### Gradle
```groovy
compile 'com.tonylawrence:funk:1.2.1'
```

### Maven
```xml
<dependency>
    <groupId>com.tonylawrence</groupId>
    <artifactId>funk</artifactId>
    <version>1.2.1</version>
</dependency>
```

---
## Compose

It is now possible to compose two functions together (assuming that the output / input matches)

> f compose g == g ° f

## To Option

We can now convert types into optional (nullable) values instead of throwing exception

> "10".toIntOption = 10
>
> "foo".toIntOption = null
