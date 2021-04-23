package com.apollographql.apollo3.cache.normalized.internal

internal expect object Platform {
  fun currentTimeMillis(): Long
}

expect class ReentrantReadWriteLock constructor()

internal expect inline fun <T> ReentrantReadWriteLock.access(action: () -> T): T

internal expect inline fun <T> ReentrantReadWriteLock.write(action: () -> T): T
