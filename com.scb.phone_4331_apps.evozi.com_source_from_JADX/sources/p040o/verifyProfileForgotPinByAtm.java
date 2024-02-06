package p040o;

import android.content.DialogInterface;
import android.view.View;
import com.scb.phone.view.custom.common.CustomDialog;

/* renamed from: o.verifyProfileForgotPinByAtm */
public final /* synthetic */ class verifyProfileForgotPinByAtm implements View.OnClickListener {
    private final /* synthetic */ DialogInterface.OnClickListener MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CustomDialog read;

    public /* synthetic */ verifyProfileForgotPinByAtm(CustomDialog customDialog, DialogInterface.OnClickListener onClickListener) {
        this.read = customDialog;
        this.MediaBrowserCompat$CustomActionResultReceiver = onClickListener;
    }

    public final void onClick(View view) {
        CustomDialog customDialog = this.read;
        this.MediaBrowserCompat$CustomActionResultReceiver.onClick(customDialog, -1);
        customDialog.dismiss();
    }
}
