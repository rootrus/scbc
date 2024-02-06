package p040o;

import com.scb.phone.view.adapter.easycash.EasycashHeaderAdapter;
import com.scb.phone.view.fragment.easycash.landing.EasycashLandingProductsFragment;

/* renamed from: o.resetPinVerifyByFace */
public final /* synthetic */ class resetPinVerifyByFace implements EasycashHeaderAdapter.write {
    private final /* synthetic */ EasycashLandingProductsFragment read;

    public /* synthetic */ resetPinVerifyByFace(EasycashLandingProductsFragment easycashLandingProductsFragment) {
        this.read = easycashLandingProductsFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getMappingFileId getmappingfileid) {
        this.read.easycashProductsLandingPresenter.read(getmappingfileid);
    }
}
