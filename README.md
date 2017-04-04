[![Travis Build Status](https://api.travis-ci.org/tonyklawrence/funk.svg)](https://travis-ci.org/tonyklawrence/funk)
[![Current Release Vesion](https://img.shields.io/badge/funk-1.2.0-blue.svg)](https://github.com/tonyklawrence/funk/releases/tag/v1.2.0)

# FunK
FunK, the missing kotlin functions

This small library adds those functions to Kotlin that you are surpised that didn't exist in the first place.

## Compose

It is now possible to compose two functions together (assuming that the output / input matches)

> f compose g == g ° f

## To Option

We can now convert types into optional (nullable) values instead of throwing exception

> "10".toIntOption = 10
>
> "foo".toIntOption = null