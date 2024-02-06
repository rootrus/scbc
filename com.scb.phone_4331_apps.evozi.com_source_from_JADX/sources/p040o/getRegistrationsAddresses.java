package p040o;

import android.content.DialogInterface;
import android.view.View;
import com.scb.phone.view.custom.common.CustomInputDialog;

/* renamed from: o.getRegistrationsAddresses */
public final /* synthetic */ class getRegistrationsAddresses implements View.OnClickListener {
    private final /* synthetic */ DialogInterface.OnClickListener MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ CustomInputDialog MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ boolean write;

    public /* synthetic */ getRegistrationsAddresses(CustomInputDialog customInputDialog, DialogInterface.OnClickListener onClickListener, boolean z) {
        this.MediaBrowserCompat$ItemReceiver = customInputDialog;
        this.MediaBrowserCompat$CustomActionResultReceiver = onClickListener;
        this.write = z;
    }

    public final void onClick(View view) {
        CustomInputDialog customInputDialog = this.MediaBrowserCompat$ItemReceiver;
        DialogInterface.OnClickListener onClickListener = this.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = this.write;
        onClickListener.onClick(customInputDialog, -1);
        if (z) {
            customInputDialog.dismiss();
        }
    }
}
