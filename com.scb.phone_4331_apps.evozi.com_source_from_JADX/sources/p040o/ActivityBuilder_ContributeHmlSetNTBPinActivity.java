package p040o;

import com.scb.phone.view.fragment.productcatalog.ProductCatalogFragment;

/* renamed from: o.ActivityBuilder_ContributeHmlSetNTBPinActivity */
public final class ActivityBuilder_ContributeHmlSetNTBPinActivity implements MileageQuantitySelectionActivity<ProductCatalogFragment> {
    public static void read(ProductCatalogFragment productCatalogFragment, getCountryFieldName getcountryfieldname) {
        productCatalogFragment.presenter = getcountryfieldname;
    }
}
