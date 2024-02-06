package p040o;

import android.content.DialogInterface;
import android.view.View;
import com.scb.phone.view.custom.common.CustomDialog;

/* renamed from: o.setupNewPin */
public final /* synthetic */ class setupNewPin implements View.OnClickListener {
    private final /* synthetic */ CustomDialog IconCompatParcelizer;
    private final /* synthetic */ DialogInterface.OnClickListener write;

    public /* synthetic */ setupNewPin(CustomDialog customDialog, DialogInterface.OnClickListener onClickListener) {
        this.IconCompatParcelizer = customDialog;
        this.write = onClickListener;
    }

    public final void onClick(View view) {
        CustomDialog customDialog = this.IconCompatParcelizer;
        this.write.onClick(customDialog, -1);
        customDialog.dismiss();
    }
}
