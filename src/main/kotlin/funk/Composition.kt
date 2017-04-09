package funk

infix fun<B, C> Function0<B>.compose(ƒ: (B) -> C): () -> C = { ƒ(this()) }
infix fun<A, B, C> Function1<A, B>.compose(ƒ: (B) -> C): (A) -> C = { ƒ(this(it)) }
