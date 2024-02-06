package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.bond.BondInputFragment;

/* renamed from: o.getFundData */
public final /* synthetic */ class getFundData implements DialogInterface.OnClickListener {
    private final /* synthetic */ BondInputFragment read;

    public /* synthetic */ getFundData(BondInputFragment bondInputFragment) {
        this.read = bondInputFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.read.presenter.write();
    }
}
