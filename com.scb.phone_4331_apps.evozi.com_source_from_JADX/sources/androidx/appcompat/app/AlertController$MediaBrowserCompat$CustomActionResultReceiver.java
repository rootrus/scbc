package androidx.appcompat.app;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

final class AlertController$MediaBrowserCompat$CustomActionResultReceiver extends Handler {
    private WeakReference<DialogInterface> IconCompatParcelizer;

    public AlertController$MediaBrowserCompat$CustomActionResultReceiver(DialogInterface dialogInterface) {
        this.IconCompatParcelizer = new WeakReference<>(dialogInterface);
    }

    public final void handleMessage(Message message) {
        int i = message.what;
        if (i == -3 || i == -2 || i == -1) {
            ((DialogInterface.OnClickListener) message.obj).onClick(this.IconCompatParcelizer.get(), message.what);
        } else if (i == 1) {
            ((DialogInterface) message.obj).dismiss();
        }
    }
}
