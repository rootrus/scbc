package p040o;

import android.view.View;
import com.scb.phone.view.adapter.ccrredemption.product.ProductListAdapter;

/* renamed from: o.getMailingAddressConfirmation */
public final /* synthetic */ class getMailingAddressConfirmation implements View.OnClickListener {
    private final /* synthetic */ intoSet IconCompatParcelizer;
    private final /* synthetic */ ProductListAdapter read;

    public /* synthetic */ getMailingAddressConfirmation(ProductListAdapter productListAdapter, intoSet intoset) {
        this.read = productListAdapter;
        this.IconCompatParcelizer = intoset;
    }

    public final void onClick(View view) {
        ProductListAdapter productListAdapter = this.read;
        productListAdapter.read.MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
    }
}
