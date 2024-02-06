package p040o;

import android.content.DialogInterface;
import android.view.View;
import com.scb.phone.view.custom.common.CustomInputDialog;

/* renamed from: o.getCustomerIndividualsTitles */
public final /* synthetic */ class getCustomerIndividualsTitles implements View.OnClickListener {
    private final /* synthetic */ DialogInterface.OnClickListener MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ CustomInputDialog write;

    public /* synthetic */ getCustomerIndividualsTitles(CustomInputDialog customInputDialog, DialogInterface.OnClickListener onClickListener) {
        this.write = customInputDialog;
        this.MediaBrowserCompat$ItemReceiver = onClickListener;
    }

    public final void onClick(View view) {
        CustomInputDialog customInputDialog = this.write;
        this.MediaBrowserCompat$ItemReceiver.onClick(customInputDialog, -1);
        customInputDialog.dismiss();
    }
}
