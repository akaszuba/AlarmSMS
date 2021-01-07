package com.example.alarmsms.Service

import android.content.Context
import android.widget.Toast

class SmsHandler(private var context: Context){

    fun handleMessage(message: SmsMessage){
        Toast.makeText(context,message.sender + message.text, Toast.LENGTH_LONG).show()
    }
}