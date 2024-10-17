package com.example.fitness.common

import java.text.SimpleDateFormat
import java.util.Date

object MyUtils {

    //Get the current Date Time of the finish workout
    fun getTheCurrentDateTime(): String{
        val currentDate = Date()
        val dateFormat = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
        val formattedDate = dateFormat.format(currentDate)
        return formattedDate
    }

}