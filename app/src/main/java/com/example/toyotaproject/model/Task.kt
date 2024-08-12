package com.example.toyotaproject.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "tasks")
data class Task(@PrimaryKey(autoGenerate = true) val id: Int = 0, val message: String)
