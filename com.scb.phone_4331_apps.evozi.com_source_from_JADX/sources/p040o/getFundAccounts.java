package p040o;

import android.content.DialogInterface;
import android.view.View;
import com.scb.phone.view.custom.common.CustomInputDialog;

/* renamed from: o.getFundAccounts */
public final /* synthetic */ class getFundAccounts implements View.OnClickListener {
    private final /* synthetic */ DialogInterface.OnClickListener read;
    private final /* synthetic */ CustomInputDialog write;

    public /* synthetic */ getFundAccounts(CustomInputDialog customInputDialog, DialogInterface.OnClickListener onClickListener) {
        this.write = customInputDialog;
        this.read = onClickListener;
    }

    public final void onClick(View view) {
        CustomInputDialog customInputDialog = this.write;
        this.read.onClick(customInputDialog, -2);
        customInputDialog.dismiss();
    }
}
