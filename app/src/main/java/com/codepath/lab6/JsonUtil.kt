package com.codepath.lab6

import kotlinx.serialization.json.Json

fun createJson(): Json {
    return Json {
        ignoreUnknownKeys = true
    }
}