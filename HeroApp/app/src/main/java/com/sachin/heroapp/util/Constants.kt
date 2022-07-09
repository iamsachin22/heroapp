package com.sachin.heroapp.util

object Constants {
    // To connect emulator to localhost
   // const val BASE_URL = "http://10.0.2.2:8080"

    // To connect read device to localhost
    const val BASE_URL = "http://192.168.0.131:8080"

    const val HERO_DATABASE = "hero_database"
    const val DETAILS_ARGUMENT_KEY = "heroId"
    const val HERO_DATABASE_TABLE = "hero_table"
    const val HERO_REMOTE_DATABASE_TABLE = "hero_remote_table"
    const val ON_BOARDING_PAGE_COUNT = 3
    const val LAST_ON_BOARDING_PAGE = 2

    const val PREFERENCES_NAME = "hero_preferences"
    const val PREFERENCES_KEY = "on_boarding_completed"

    const val ITEMS_PER_PAGE = 3
    const val ABOUT_TEXT_MAX_LINES = 7

    const val MIN_BACKGROUND_IMAGE_HEIGHT = 0.4f
}