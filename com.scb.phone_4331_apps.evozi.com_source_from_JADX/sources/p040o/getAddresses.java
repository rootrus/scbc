package p040o;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.scb.phone.view.fragment.ccrredemption.product.ProductListFragment;

/* renamed from: o.getAddresses */
public final /* synthetic */ class getAddresses implements SwipeRefreshLayout.IconCompatParcelizer {
    private final /* synthetic */ ProductListFragment write;

    public /* synthetic */ getAddresses(ProductListFragment productListFragment) {
        this.write = productListFragment;
    }

    public final void read() {
        this.write.productListPresenter.IconCompatParcelizer(false);
    }
}
