package p040o;

import android.content.DialogInterface;
import android.view.View;
import com.scb.phone.view.custom.common.CustomDialog;

/* renamed from: o.ForgotPinService */
public final /* synthetic */ class ForgotPinService implements View.OnClickListener {
    private final /* synthetic */ DialogInterface.OnClickListener MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ CustomDialog read;

    public /* synthetic */ ForgotPinService(CustomDialog customDialog, DialogInterface.OnClickListener onClickListener) {
        this.read = customDialog;
        this.MediaBrowserCompat$ItemReceiver = onClickListener;
    }

    public final void onClick(View view) {
        CustomDialog customDialog = this.read;
        this.MediaBrowserCompat$ItemReceiver.onClick(customDialog, -2);
        customDialog.dismiss();
    }
}
