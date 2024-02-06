package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.BaseDialogFragment;

/* renamed from: o.getMutualFundsConfig */
public final /* synthetic */ class getMutualFundsConfig implements DialogInterface.OnClickListener {
    private final /* synthetic */ BaseDialogFragment IconCompatParcelizer;
    private final /* synthetic */ access$2300 read;

    public /* synthetic */ getMutualFundsConfig(BaseDialogFragment baseDialogFragment, access$2300 access_2300) {
        this.IconCompatParcelizer = baseDialogFragment;
        this.read = access_2300;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BaseDialogFragment baseDialogFragment = this.IconCompatParcelizer;
        access$2300 access_2300 = this.read;
        dialogInterface.dismiss();
        baseDialogFragment.dismiss();
        baseDialogFragment.read(access_2300);
    }
}
