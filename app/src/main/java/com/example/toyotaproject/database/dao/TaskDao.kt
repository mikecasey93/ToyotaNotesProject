package com.example.toyotaproject.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.example.toyotaproject.model.Task
import kotlinx.coroutines.flow.Flow

@Dao
interface TaskDao {
    @Query("SELECT * FROM tasks")
    fun getAllTasks(): Flow<List<Task>>

    @Insert
    suspend fun insert(task: Task)
}