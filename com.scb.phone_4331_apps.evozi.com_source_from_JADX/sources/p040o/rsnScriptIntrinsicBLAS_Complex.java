package p040o;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.os.Handler;

/* renamed from: o.rsnScriptIntrinsicBLAS_Complex */
public final class rsnScriptIntrinsicBLAS_Complex implements SensorEventListener {
    CHEMV IconCompatParcelizer;
    public Context MediaBrowserCompat$ItemReceiver;
    private Handler read = new Handler();
    public CHER write;

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public rsnScriptIntrinsicBLAS_Complex(Context context, CHEMV chemv, CHER cher) {
        this.MediaBrowserCompat$ItemReceiver = context;
        this.IconCompatParcelizer = chemv;
        this.write = cher;
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float f = sensorEvent.values[0];
        if (this.IconCompatParcelizer == null) {
            return;
        }
        if (f <= 45.0f) {
            this.read.post(new Runnable(true) {
                public final void run() {
                    rsnScriptIntrinsicBLAS_Complex.this.IconCompatParcelizer.read(false);
                }
            });
        } else if (f >= 450.0f) {
            this.read.post(new Runnable(false) {
                public final void run() {
                    rsnScriptIntrinsicBLAS_Complex.this.IconCompatParcelizer.read(false);
                }
            });
        }
    }
}
