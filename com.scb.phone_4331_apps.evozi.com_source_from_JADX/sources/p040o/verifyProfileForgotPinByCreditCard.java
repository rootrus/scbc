package p040o;

import android.content.DialogInterface;
import android.view.View;
import com.scb.phone.view.custom.common.CustomDialog;

/* renamed from: o.verifyProfileForgotPinByCreditCard */
public final /* synthetic */ class verifyProfileForgotPinByCreditCard implements View.OnClickListener {
    private final /* synthetic */ DialogInterface.OnClickListener IconCompatParcelizer;
    private final /* synthetic */ CustomDialog MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ verifyProfileForgotPinByCreditCard(CustomDialog customDialog, DialogInterface.OnClickListener onClickListener) {
        this.MediaBrowserCompat$CustomActionResultReceiver = customDialog;
        this.IconCompatParcelizer = onClickListener;
    }

    public final void onClick(View view) {
        CustomDialog customDialog = this.MediaBrowserCompat$CustomActionResultReceiver;
        this.IconCompatParcelizer.onClick(customDialog, -2);
        customDialog.dismiss();
    }
}
