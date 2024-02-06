package p040o;

import android.view.View;
import com.scb.phone.view.fragment.ccrredemption.product.ProductListFragment;

/* renamed from: o.getIdentityValidation */
public final /* synthetic */ class getIdentityValidation implements View.OnClickListener {
    private final /* synthetic */ ProductListFragment read;

    public /* synthetic */ getIdentityValidation(ProductListFragment productListFragment) {
        this.read = productListFragment;
    }

    public final void onClick(View view) {
        this.read.productListPresenter.IconCompatParcelizer();
    }
}
