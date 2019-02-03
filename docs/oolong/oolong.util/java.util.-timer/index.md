[oolong](../../index.md) / [oolong.util](../index.md) / [java.util.Timer](./index.md)

### Extensions for java.util.Timer

| Name | Summary |
|---|---|
| [schedule](schedule.md) | `fun <Msg> `[`Timer`](http://docs.oracle.com/javase/6/docs/api/java/util/Timer.html)`.schedule(time: `[`Date`](http://docs.oracle.com/javase/6/docs/api/java/util/Date.html)`, msg: (`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`) -> `[`Msg`](schedule.md#Msg)`): `[`Sub`](../../oolong.platform/-sub/index.md)`<`[`Msg`](schedule.md#Msg)`>`<br>`fun <Msg> `[`Timer`](http://docs.oracle.com/javase/6/docs/api/java/util/Timer.html)`.schedule(firstTime: `[`Date`](http://docs.oracle.com/javase/6/docs/api/java/util/Date.html)`, period: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, msg: (`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`) -> `[`Msg`](schedule.md#Msg)`): `[`Sub`](../../oolong.platform/-sub/index.md)`<`[`Msg`](schedule.md#Msg)`>`<br>`fun <Msg> `[`Timer`](http://docs.oracle.com/javase/6/docs/api/java/util/Timer.html)`.schedule(delay: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, msg: (`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`) -> `[`Msg`](schedule.md#Msg)`): `[`Sub`](../../oolong.platform/-sub/index.md)`<`[`Msg`](schedule.md#Msg)`>`<br>`fun <Msg> `[`Timer`](http://docs.oracle.com/javase/6/docs/api/java/util/Timer.html)`.schedule(delay: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, period: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, msg: (`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`) -> `[`Msg`](schedule.md#Msg)`): `[`Sub`](../../oolong.platform/-sub/index.md)`<`[`Msg`](schedule.md#Msg)`>`<br>Call [Timer.schedule](http://docs.oracle.com/javase/6/docs/api/java/util/Timer.html#schedule(java.util.TimerTask, long)) with a mapping of [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) to [Msg](schedule.md#Msg). |
| [scheduleAtFixedRate](schedule-at-fixed-rate.md) | `fun <Msg> `[`Timer`](http://docs.oracle.com/javase/6/docs/api/java/util/Timer.html)`.scheduleAtFixedRate(firstTime: `[`Date`](http://docs.oracle.com/javase/6/docs/api/java/util/Date.html)`, period: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, msg: (`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`) -> `[`Msg`](schedule-at-fixed-rate.md#Msg)`): `[`Sub`](../../oolong.platform/-sub/index.md)`<`[`Msg`](schedule-at-fixed-rate.md#Msg)`>`<br>`fun <Msg> `[`Timer`](http://docs.oracle.com/javase/6/docs/api/java/util/Timer.html)`.scheduleAtFixedRate(delay: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, period: `[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`, msg: (`[`Long`](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html)`) -> `[`Msg`](schedule-at-fixed-rate.md#Msg)`): `[`Sub`](../../oolong.platform/-sub/index.md)`<`[`Msg`](schedule-at-fixed-rate.md#Msg)`>`<br>Call [Timer.scheduleAtFixedRate](http://docs.oracle.com/javase/6/docs/api/java/util/Timer.html#scheduleAtFixedRate(java.util.TimerTask, long, long)) with a mapping of [Long](https://kotlinlang.org/api/latest/jvm/stdlib/kotlin/-long/index.html) to [Msg](schedule-at-fixed-rate.md#Msg). |