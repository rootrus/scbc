package p040o;

import android.view.View;
import com.scb.phone.view.adapter.transferandpay.FavouriteTargetAdapter;

/* renamed from: o.getCustomerContactInformation */
public final /* synthetic */ class getCustomerContactInformation implements View.OnClickListener {
    private final /* synthetic */ int IconCompatParcelizer;
    private final /* synthetic */ FavouriteTargetAdapter write;

    public /* synthetic */ getCustomerContactInformation(FavouriteTargetAdapter favouriteTargetAdapter, int i) {
        this.write = favouriteTargetAdapter;
        this.IconCompatParcelizer = i;
    }

    public final void onClick(View view) {
        FavouriteTargetAdapter favouriteTargetAdapter = this.write;
        int i = this.IconCompatParcelizer;
        FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment = favouriteTargetAdapter.write;
        if (fragmentBuilder_BindCcSofBillPaymentOnlyFragment != null) {
            fragmentBuilder_BindCcSofBillPaymentOnlyFragment.read(i);
        }
    }
}
