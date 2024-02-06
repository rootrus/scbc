package p040o;

import android.content.Context;
import android.view.OrientationEventListener;
import android.view.WindowManager;

/* renamed from: o.CGEMV */
public final class CGEMV {
    public getIExceptionResponseDeserializerOnDevice IconCompatParcelizer;
    int MediaBrowserCompat$ItemReceiver;
    public OrientationEventListener read;
    public WindowManager write;

    public final void write(Context context, getIExceptionResponseDeserializerOnDevice getiexceptionresponsedeserializerondevice) {
        OrientationEventListener orientationEventListener = this.read;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
        }
        this.read = null;
        this.write = null;
        this.IconCompatParcelizer = null;
        Context applicationContext = context.getApplicationContext();
        this.IconCompatParcelizer = getiexceptionresponsedeserializerondevice;
        this.write = (WindowManager) applicationContext.getSystemService("window");
        C96722 r3 = new OrientationEventListener(applicationContext) {
            public final void onOrientationChanged(int i) {
                int rotation;
                WindowManager windowManager = CGEMV.this.write;
                getIExceptionResponseDeserializerOnDevice getiexceptionresponsedeserializerondevice = CGEMV.this.IconCompatParcelizer;
                if (CGEMV.this.write != null && getiexceptionresponsedeserializerondevice != null && (rotation = windowManager.getDefaultDisplay().getRotation()) != CGEMV.this.MediaBrowserCompat$ItemReceiver) {
                    CGEMV.this.MediaBrowserCompat$ItemReceiver = rotation;
                    getiexceptionresponsedeserializerondevice.MediaBrowserCompat$CustomActionResultReceiver();
                }
            }
        };
        this.read = r3;
        r3.enable();
        this.MediaBrowserCompat$ItemReceiver = this.write.getDefaultDisplay().getRotation();
    }
}
