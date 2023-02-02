package com.geektech.myapplication.ui

import com.geektech.myapplication.data.TextModel

interface ItemClick {
    fun onItemClick(textModel: TextModel)
}