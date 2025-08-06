package io.github.numq.starsnomore.interactor

interface Interactor<in Input, out Output> {
    suspend fun execute(input: Input): Result<Output>
}