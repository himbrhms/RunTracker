package com.himbrhms.runtracker.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface RunDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertRun(run: Run)

    @Delete
    suspend fun  deleteRun(run: Run)

    @Query("SELECT * FROM run_table ORDER BY dateTimeStamp DESC")
    fun getAllRunsSortedByDate(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY durationInMs DESC")
    fun getAllRunsSortedByDuration(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY distanceInM DESC")
    fun getAllRunsSortedByDistance(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY burnedCalories DESC")
    fun getAllRunsSortedByBurnedKcal(): LiveData<List<Run>>

    @Query("SELECT * FROM run_table ORDER BY averagePaceInKph DESC")
    fun getAllRunsSortedByPace(): LiveData<List<Run>>

    @Query("SELECT SUM(durationInMs) FROM run_table")
    fun getTotalDurationInMs(): LiveData<Long>

    @Query("SELECT SUM(burnedCalories) FROM run_table")
    fun getTotalBurnedCalories(): LiveData<Int>

    @Query("SELECT SUM(distanceInM) FROM run_table")
    fun getTotalDistanceInM(): LiveData<Int>

    @Query("SELECT AVG(averagePaceInKph) FROM run_table")
    fun getTotalAveragePaceInKph(): LiveData<Float>
}
