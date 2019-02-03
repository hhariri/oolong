[oolong](../../index.md) / [oolong.util](../index.md) / [java.util.Random](index.md) / [nextBoolean](./next-boolean.md)

# nextBoolean

`fun <Msg> `[`Random`](http://docs.oracle.com/javase/6/docs/api/java/util/Random.html)`.nextBoolean(msg: (`[`Boolean`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)`) -> `[`Msg`](next-boolean.md#Msg)`): `[`Cmd`](../../oolong.platform/-cmd/index.md)`<`[`Msg`](next-boolean.md#Msg)`>` [(source)](https://github.com/pardom/oolong/tree/master/oolong/src/main/kotlin/oolong/util/random.kt#L12)

Call [Random.nextBoolean](http://docs.oracle.com/javase/6/docs/api/java/util/Random.html#nextBoolean()) with a mapping of [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) to [Msg](next-boolean.md#Msg).

### Parameters

`msg` - map function of [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html) to [Msg](next-boolean.md#Msg)

**Return**
[Cmd](../../oolong.platform/-cmd/index.md) of [Msg](next-boolean.md#Msg) for the generated [Boolean](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-boolean/index.html)
