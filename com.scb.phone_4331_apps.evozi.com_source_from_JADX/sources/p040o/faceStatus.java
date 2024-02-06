package p040o;

import android.content.DialogInterface;
import android.view.View;
import com.scb.phone.view.custom.common.CustomDialog;

/* renamed from: o.faceStatus */
public final /* synthetic */ class faceStatus implements View.OnClickListener {
    private final /* synthetic */ DialogInterface.OnClickListener MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ CustomDialog write;

    public /* synthetic */ faceStatus(CustomDialog customDialog, DialogInterface.OnClickListener onClickListener) {
        this.write = customDialog;
        this.MediaBrowserCompat$ItemReceiver = onClickListener;
    }

    public final void onClick(View view) {
        CustomDialog customDialog = this.write;
        this.MediaBrowserCompat$ItemReceiver.onClick(customDialog, -1);
        customDialog.dismiss();
    }
}
