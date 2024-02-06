package p040o;

import com.scb.phone.view.adapter.easycash.EasycashProductAdapter;
import com.scb.phone.view.fragment.easycash.landing.EasycashLandingProductsFragment;

/* renamed from: o.preValidation */
public final /* synthetic */ class preValidation implements EasycashProductAdapter.IconCompatParcelizer {
    private final /* synthetic */ EasycashLandingProductsFragment IconCompatParcelizer;

    public /* synthetic */ preValidation(EasycashLandingProductsFragment easycashLandingProductsFragment) {
        this.IconCompatParcelizer = easycashLandingProductsFragment;
    }

    public final void read(getMappingFileId getmappingfileid) {
        this.IconCompatParcelizer.easycashProductsLandingPresenter.read(getmappingfileid);
    }
}
