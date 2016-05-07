package com.anokmik.databinding.util


@Suppress("UNCHECKED_CAST")
fun <T> Any.castObjectOrThrow(o: Any): T {
    return o as T
}
