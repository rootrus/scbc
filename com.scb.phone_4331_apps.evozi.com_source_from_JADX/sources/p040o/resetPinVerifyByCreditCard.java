package p040o;

import com.scb.phone.view.adapter.easycash.EasycashLoanTrackingAdapter;
import com.scb.phone.view.fragment.easycash.landing.EasycashLandingProductsFragment;

/* renamed from: o.resetPinVerifyByCreditCard */
public final /* synthetic */ class resetPinVerifyByCreditCard implements EasycashLoanTrackingAdapter.read {
    private final /* synthetic */ EasycashLandingProductsFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ resetPinVerifyByCreditCard(EasycashLandingProductsFragment easycashLandingProductsFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = easycashLandingProductsFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getMappingFileId getmappingfileid) {
        this.MediaBrowserCompat$CustomActionResultReceiver.easycashProductsLandingPresenter.read(getmappingfileid);
    }
}
