package p040o;

import com.scb.phone.view.fragment.deposit.DepositDetailTransactionFragment;
import java.util.ArrayList;

/* renamed from: o.getConsent */
public final /* synthetic */ class getConsent implements Runnable {
    private final /* synthetic */ DepositDetailTransactionFragment IconCompatParcelizer;
    private final /* synthetic */ getSessionFileProvider read;

    public /* synthetic */ getConsent(DepositDetailTransactionFragment depositDetailTransactionFragment, getSessionFileProvider getsessionfileprovider) {
        this.IconCompatParcelizer = depositDetailTransactionFragment;
        this.read = getsessionfileprovider;
    }

    public final void run() {
        DepositDetailTransactionFragment depositDetailTransactionFragment = this.IconCompatParcelizer;
        getSessionFileProvider getsessionfileprovider = this.read;
        getLastReturnCode getlastreturncode = depositDetailTransactionFragment.mDepositTransactionPresenter;
        ArrayList arrayList = new ArrayList();
        if (getsessionfileprovider instanceof hasCrashDataForSession) {
            arrayList.addAll(((hasCrashDataForSession) getsessionfileprovider).MediaBrowserCompat$CustomActionResultReceiver);
        } else if (getsessionfileprovider instanceof openSession) {
            arrayList.addAll(((openSession) getsessionfileprovider).MediaBrowserCompat$SearchResultReceiver);
        } else {
            return;
        }
        boolean z = true;
        if (getlastreturncode.RatingCompat != null) {
            nativeExecute nativeexecute = new nativeExecute(arrayList, getsessionfileprovider);
            if (getlastreturncode.RatingCompat == null) {
                z = false;
            }
            if (z) {
                nativeexecute.IconCompatParcelizer(getlastreturncode.RatingCompat);
            }
        }
    }
}
