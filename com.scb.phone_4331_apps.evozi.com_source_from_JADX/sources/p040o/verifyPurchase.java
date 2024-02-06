package p040o;

import com.scb.phone.view.fragment.PurchaseSuccessFragment;
import p040o.Iterables;

/* renamed from: o.verifyPurchase */
public final class verifyPurchase implements MileageQuantitySelectionActivity<PurchaseSuccessFragment> {
    public static void MediaBrowserCompat$ItemReceiver(PurchaseSuccessFragment purchaseSuccessFragment, Iterables.C352414 r1) {
        purchaseSuccessFragment.componentFactory = r1;
    }

    public static void write(PurchaseSuccessFragment purchaseSuccessFragment, getSessionEventSize getsessioneventsize) {
        purchaseSuccessFragment.presenter = getsessioneventsize;
    }

    public static void write(PurchaseSuccessFragment purchaseSuccessFragment, setExitButtonEnabled setexitbuttonenabled) {
        purchaseSuccessFragment.themesSlipPresenter = setexitbuttonenabled;
    }
}
