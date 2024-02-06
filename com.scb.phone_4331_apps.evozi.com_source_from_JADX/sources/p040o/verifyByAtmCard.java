package p040o;

import com.scb.phone.view.fragment.easycash.landing.EasycashLandingProductsFragment;

/* renamed from: o.verifyByAtmCard */
public final class verifyByAtmCard implements MileageQuantitySelectionActivity<EasycashLandingProductsFragment> {
    public static void read(EasycashLandingProductsFragment easycashLandingProductsFragment, forEachClear foreachclear) {
        easycashLandingProductsFragment.tracker = foreachclear;
    }

    public static void write(EasycashLandingProductsFragment easycashLandingProductsFragment, setInputDocLongEdge setinputdoclongedge) {
        easycashLandingProductsFragment.easycashProductsLandingPresenter = setinputdoclongedge;
    }
}
