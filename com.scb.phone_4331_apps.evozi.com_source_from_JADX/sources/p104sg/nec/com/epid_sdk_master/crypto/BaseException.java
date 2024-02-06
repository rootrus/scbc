package p104sg.nec.com.epid_sdk_master.crypto;

import android.util.Log;

/* renamed from: sg.nec.com.epid_sdk_master.crypto.BaseException */
public class BaseException extends Exception {
    private static final String MediaBrowserCompat$ItemReceiver = BaseException.class.getName();

    public BaseException() {
        Log.d(MediaBrowserCompat$ItemReceiver, getMessage());
    }

    public BaseException(Throwable th) {
        super(th);
        if (!(th instanceof BaseException)) {
            Log.d(MediaBrowserCompat$ItemReceiver, getMessage());
        } else {
            Log.d(MediaBrowserCompat$ItemReceiver, getMessage());
        }
    }
}
