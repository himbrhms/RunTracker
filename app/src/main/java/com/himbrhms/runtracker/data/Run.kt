package com.himbrhms.runtracker.data

import android.graphics.Bitmap
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "run_table")
data class Run(
    var image: Bitmap? = null,
    var timestamp: Long = 0L,
    var paceInKph: Float = 0f,
    var distanceInM: Int = 0,
    var durationInMs: Long = 0L,
    var burnedKcal: Int = 0
) {
    @PrimaryKey(autoGenerate = true)
    var id: Int? = null
}
