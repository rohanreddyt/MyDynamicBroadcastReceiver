package com.rohan.user.mydynamicbroadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Vibrator;
import android.util.Log;
import android.widget.Toast;

/**
 * Created by User on 11/1/2016.
 */

public class Receiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Vibrator v = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        Log.d("Dynamic broadcast: ", "Intent Received");
        v.vibrate(500);
        Toast.makeText(context, "INTENT RECEIVED by Receiver", Toast.LENGTH_LONG).show();
    }
}
