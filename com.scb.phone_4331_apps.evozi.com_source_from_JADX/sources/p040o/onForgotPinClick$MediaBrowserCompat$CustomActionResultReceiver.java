package p040o;

import android.os.Handler;
import android.os.Message;

/* renamed from: o.onForgotPinClick$MediaBrowserCompat$CustomActionResultReceiver */
public class onForgotPinClick$MediaBrowserCompat$CustomActionResultReceiver extends Handler {
    private /* synthetic */ onForgotPinClick MediaBrowserCompat$ItemReceiver;

    protected onForgotPinClick$MediaBrowserCompat$CustomActionResultReceiver(onForgotPinClick onforgotpinclick) {
        this.MediaBrowserCompat$ItemReceiver = onforgotpinclick;
    }

    public final void handleMessage(Message message) {
        this.MediaBrowserCompat$ItemReceiver.write.notifyChanged();
    }
}
