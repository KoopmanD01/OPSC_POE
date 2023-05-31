package com.example.opsc_poe

import android.content.Context
import android.content.Intent
import android.os.Bundle



    fun openIntent(context: Context, order: String, activityToOpen: Class<*>)
    {
        val intent = Intent(context, activityToOpen)
        intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        intent.putExtra("order",order)
        context.startActivity(intent)

    }

    fun shareIntent(context: Context, order: String)
    {
        var sendIntent = Intent()

        sendIntent.setAction(Intent.ACTION_SEND)
        sendIntent.putExtra(Intent.EXTRA_TEXT, order)
        sendIntent.setType("text/plain")

        var shareIntent = Intent.createChooser(sendIntent, null)
        shareIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        context.startActivity(shareIntent)
    }


