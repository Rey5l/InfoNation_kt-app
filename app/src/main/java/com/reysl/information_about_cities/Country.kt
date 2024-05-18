package com.reysl.information_about_cities

data class Country(
    val name: String,
    val capital: String,
    val population: Long,
    val area: Long,
    val languages: List<Language>,
    val flags: Flag
)

data class Language(
    val name: String
)

data class Flag(
    val png: String
)