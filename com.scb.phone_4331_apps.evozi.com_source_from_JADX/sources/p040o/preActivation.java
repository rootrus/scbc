package p040o;

import com.scb.phone.view.fragment.easycash.issuer.EasycashIssuerLandingFragment;

/* renamed from: o.preActivation */
public final class preActivation implements MileageQuantitySelectionActivity<EasycashIssuerLandingFragment> {
    public static void IconCompatParcelizer(EasycashIssuerLandingFragment easycashIssuerLandingFragment, getBarCodeResults getbarcoderesults) {
        easycashIssuerLandingFragment.easycashIssuerLandingPresenter = getbarcoderesults;
    }

    public static void MediaBrowserCompat$ItemReceiver(EasycashIssuerLandingFragment easycashIssuerLandingFragment, forEachClear foreachclear) {
        easycashIssuerLandingFragment.tracker = foreachclear;
    }
}
