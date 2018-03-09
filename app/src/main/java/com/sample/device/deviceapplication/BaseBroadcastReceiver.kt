package com.sample.device.deviceapplication

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent

/**
 * Created by owner on 2018-03-09.
 */
abstract class BaseBroadcastReceiver : BroadcastReceiver() {


    override fun onReceive(context: Context?, intent: Intent?) {
        checkNotificationMessage(context, intent)
    }

    abstract fun checkNotificationMessage(context: Context?, intent: Intent?)
}