package com.example.myalarmapp.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.myalarmapp.room.Alarm

class AlarmDiffUtil(private val oldList: List<Alarm>, private val newList: List<Alarm>) : DiffUtil.Callback() {
    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        val oldData = oldList[oldItemPosition]
        val newList = newList[newItemPosition]
        return oldData.id == newList.id
                && oldData.date == newList.date
                && oldData.time == newList.time
                && oldData.note == newList.note
                && oldData.time == newList.time
    }
}