package p040o;

import android.content.DialogInterface;
import android.view.View;
import com.scb.phone.view.custom.common.CustomDialog;

/* renamed from: o.verifyOtpResetPin */
public final /* synthetic */ class verifyOtpResetPin implements View.OnClickListener {
    private final /* synthetic */ DialogInterface.OnClickListener MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CustomDialog write;

    public /* synthetic */ verifyOtpResetPin(CustomDialog customDialog, DialogInterface.OnClickListener onClickListener) {
        this.write = customDialog;
        this.MediaBrowserCompat$CustomActionResultReceiver = onClickListener;
    }

    public final void onClick(View view) {
        CustomDialog customDialog = this.write;
        this.MediaBrowserCompat$CustomActionResultReceiver.onClick(customDialog, -1);
        customDialog.dismiss();
    }
}
