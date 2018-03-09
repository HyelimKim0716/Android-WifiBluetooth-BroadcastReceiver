package com.sample.device.deviceapplication

import android.content.Context
import android.content.Intent
import android.net.wifi.WifiManager
import android.util.Log

/**
 * Created by owner on 2018-03-09.
 */
class WifiBroadcastReceiver : BaseBroadcastReceiver() {
    val TAG = "WifiBroadcastReceiver"
    override fun checkNotificationMessage(context: Context?, intent: Intent?) {
        Log.d(TAG, "checkNotificationMessage()")

        val wifiManager = context?.applicationContext?.getSystemService(Context.WIFI_SERVICE) as WifiManager

        Log.d(TAG, "ssid : ${wifiManager.connectionInfo.ssid}, rssi : ${wifiManager.connectionInfo.rssi}")
        wifiManager.configuredNetworks?.forEach {
            Log.d(TAG, ", configuredNetwork ${it.SSID} ${it.BSSID}")
        }

        wifiManager.scanResults?.forEach {
            Log.d(TAG, "scanResult ${it.SSID}, ${it.level}")
        }

        wifiManager.startScan()
    }

}