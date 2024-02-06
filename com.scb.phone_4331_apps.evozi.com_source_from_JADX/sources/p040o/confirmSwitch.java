package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.BaseDialogFragment;

/* renamed from: o.confirmSwitch */
public final /* synthetic */ class confirmSwitch implements DialogInterface.OnClickListener {
    private final /* synthetic */ access$2300 IconCompatParcelizer;
    private final /* synthetic */ BaseDialogFragment read;

    public /* synthetic */ confirmSwitch(BaseDialogFragment baseDialogFragment, access$2300 access_2300) {
        this.read = baseDialogFragment;
        this.IconCompatParcelizer = access_2300;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        BaseDialogFragment baseDialogFragment = this.read;
        access$2300 access_2300 = this.IconCompatParcelizer;
        dialogInterface.dismiss();
        baseDialogFragment.dismiss();
        baseDialogFragment.read(access_2300);
    }
}
