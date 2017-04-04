package funk

infix fun<A, B, C> Function1<B, C>.compose(ƒ: (A) -> B): (A) -> C = { this(ƒ(it)) }