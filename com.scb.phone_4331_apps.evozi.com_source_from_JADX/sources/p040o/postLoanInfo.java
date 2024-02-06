package p040o;

import com.scb.phone.view.fragment.debitatm.DebitCardTransactionTabFragment;
import p040o.validateGER;

/* renamed from: o.postLoanInfo */
public final /* synthetic */ class postLoanInfo implements validateGER.write {
    private final /* synthetic */ validateGER MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ postLoanInfo(validateGER validateger) {
        this.MediaBrowserCompat$CustomActionResultReceiver = validateger;
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        DebitCardTransactionTabFragment.read(this.MediaBrowserCompat$CustomActionResultReceiver, i);
    }
}
