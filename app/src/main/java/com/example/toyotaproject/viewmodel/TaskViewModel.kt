package com.example.toyotaproject.viewmodel

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.example.toyotaproject.data.db.TaskDatabase
import com.example.toyotaproject.database.dao.TaskDao
import com.example.toyotaproject.model.Task
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.launch


class TaskViewModel (application: Application) : AndroidViewModel(application) {
    private val taskDao: TaskDao = TaskDatabase.getDatabase(application).taskDao()
    val tasks: Flow<List<Task>> = taskDao.getAllTasks()

    fun addTask(task: Task) {
        viewModelScope.launch {
            taskDao.insert(task)
        }
    }
}