// AndroidWakeScreenModule.java

package com.reactlibrary;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.Callback;
import android.os.PowerManager;
import android.os.Build;
import static androidx.core.content.ContextCompat.getSystemService;


public class AndroidWakeScreenModule extends ReactContextBaseJavaModule {

    private final ReactApplicationContext reactContext;

    public AndroidWakeScreenModule(ReactApplicationContext reactContext) {
        super(reactContext);
        this.reactContext = reactContext;
    }

    @Override
    public String getName() {
        return "AndroidWakeScreen";
    }

    @ReactMethod
    public void wakeScreen() {
        PowerManager powerManager = (PowerManager) getReactApplicationContext().getSystemService(getReactApplicationContext().POWER_SERVICE);
        boolean screenOn = Build.VERSION.SDK_INT >= 20 ? powerManager.isInteractive() : powerManager.isScreenOn();
        if (!screenOn) {
            PowerManager.WakeLock wakeLock = powerManager.newWakeLock(PowerManager.SCREEN_DIM_WAKE_LOCK | PowerManager.ACQUIRE_CAUSES_WAKEUP, "yourApp:tag");
            wakeLock.acquire();
        }
    }
}
