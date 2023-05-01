package com.agn.taskapp.model

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity
data class Task(
    @PrimaryKey(autoGenerate = true) // индентифийировать данные (от слова обновить)
    // autoGenerate = true если null
    val id: Int? = null,
    var title: String? = null,
    var desc: String? = null
) : Serializable

//
