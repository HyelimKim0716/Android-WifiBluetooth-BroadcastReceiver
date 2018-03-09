package com.sample.device.deviceapplication

import android.annotation.SuppressLint
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log

/**
 * Created by owner on 2018-03-07.
 */
class BluetoothReceiver : BaseBroadcastReceiver() {

    val TAG = "BluetoothBroadcastReceiver"

    @SuppressLint("LongLogTag")
    override fun checkNotificationMessage(context: Context?, intent: Intent?) {
        Log.d(TAG, "checkNotificationMessage")
    }
}