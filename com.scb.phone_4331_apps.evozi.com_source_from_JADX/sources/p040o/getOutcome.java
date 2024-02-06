package p040o;

import com.scb.phone.view.fragment.deposit.DepositDetailTransactionFragment;

/* renamed from: o.getOutcome */
public final /* synthetic */ class getOutcome implements Runnable {
    private final /* synthetic */ DepositDetailTransactionFragment write;

    public /* synthetic */ getOutcome(DepositDetailTransactionFragment depositDetailTransactionFragment) {
        this.write = depositDetailTransactionFragment;
    }

    public final void run() {
        getLastReturnCode getlastreturncode = this.write.mDepositTransactionPresenter;
        boolean z = false;
        onCheckBoxClick.read("Details information not available!", new Object[0]);
        if (getlastreturncode.RatingCompat != null) {
            nativeBinarize nativebinarize = nativeBinarize.MediaBrowserCompat$ItemReceiver;
            if (getlastreturncode.RatingCompat != null) {
                nativebinarize.IconCompatParcelizer(getlastreturncode.RatingCompat);
            }
            Vrs vrs = Vrs.read;
            if (getlastreturncode.RatingCompat != null) {
                z = true;
            }
            if (z) {
                vrs.IconCompatParcelizer(getlastreturncode.RatingCompat);
            }
        }
    }
}
