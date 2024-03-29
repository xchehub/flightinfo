package com.joe.flightinfo.helper

import android.content.Context

const val PREFERENCE_NAME = "flight_info"
const val BASE_AIRPORT = "base_airport"
const val BASE_CURRENCY = "base_currency"

const val USD_RATE = "usd_rate"
const val CAD_RATE = "cad_rate"
const val EUR_RATE = "eur_rate"
const val CNY_RATE = "cny_rate"
const val HKD_RATE = "hkd_rate"
const val JPY_RATE = "jpy_rate"

object SharePreferenceHelper {
    fun setBaseAirport(context: Context, baseAirPort: String) {
        context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE).edit()
            .putString(BASE_AIRPORT, baseAirPort).apply()
    }

    fun getBaseAirport(context: Context): String? {
        return context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
            .getString(BASE_AIRPORT, "")
    }

    fun setBaseCurrency(context: Context, baseAirPort: String) {
        context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE).edit()
            .putString(BASE_CURRENCY, baseAirPort).apply()
    }

    fun getBaseCurrency(context: Context): String? {
        return context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
            .getString(BASE_CURRENCY, "")
    }

    fun setCADRate(context: Context, baseAirPort: String) {
        context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE).edit()
            .putString(CAD_RATE, baseAirPort).apply()
    }

    fun getCADRate(context: Context): String? {
        return context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
            .getString(CAD_RATE, "")
    }
    fun setEURRate(context: Context, baseAirPort: String) {
        context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE).edit()
            .putString(EUR_RATE, baseAirPort).apply()
    }

    fun getEURRate(context: Context): String? {
        return context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
            .getString(EUR_RATE, "")
    }
    fun setCNYRate(context: Context, baseAirPort: String) {
        context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE).edit()
            .putString(CNY_RATE, baseAirPort).apply()
    }

    fun getCNYRate(context: Context): String? {
        return context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
            .getString(CNY_RATE, "")
    }
    fun setHKDRate(context: Context, baseAirPort: String) {
        context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE).edit()
            .putString(HKD_RATE, baseAirPort).apply()
    }

    fun getHKDRate(context: Context): String? {
        return context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
            .getString(HKD_RATE, "")
    }
    fun setJPYRate(context: Context, baseAirPort: String) {
        context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE).edit()
            .putString(JPY_RATE, baseAirPort).apply()
    }

    fun getJPYRate(context: Context): String? {
        return context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE)
            .getString(JPY_RATE, "")
    }
}