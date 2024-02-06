package p040o;

import com.scb.phone.view.fragment.easycash.issuer.EasycashIssuerSearchFragment;

/* renamed from: o.preregisterValidation */
public final class preregisterValidation implements MileageQuantitySelectionActivity<EasycashIssuerSearchFragment> {
    public static void read(EasycashIssuerSearchFragment easycashIssuerSearchFragment, BarCodeDirection barCodeDirection) {
        easycashIssuerSearchFragment.searchPresenter = barCodeDirection;
    }
}
