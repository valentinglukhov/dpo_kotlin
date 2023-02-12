object Fibonacci {

    suspend fun take (n: Int) {
        var fN1 = 1.toBigInteger()
        var fN2 = 0.toBigInteger()
        for (f in 0 .. n) {
            val fN = fN1 + fN2
            fN2 = fN1
            fN1 = fN
            if (f == n - 3) println("\nЧисло Фибоначчи для порядкового номера $n: $fN")
        }
    }
}