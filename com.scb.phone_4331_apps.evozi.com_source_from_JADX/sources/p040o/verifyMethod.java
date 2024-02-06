package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.custom.common.CustomDialog;

/* renamed from: o.verifyMethod */
public final /* synthetic */ class verifyMethod implements DialogInterface.OnClickListener {
    private final /* synthetic */ DialogInterface.OnClickListener MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ verifyMethod(DialogInterface.OnClickListener onClickListener) {
        this.MediaBrowserCompat$ItemReceiver = onClickListener;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        CustomDialog.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, dialogInterface, i);
    }
}
