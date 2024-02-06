package com.scb.phone.view.fragment.prepaid.traveltab;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class PrepaidTravelWalletTabFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PrepaidTravelWalletTabFragment IconCompatParcelizer;
    private View write;

    public PrepaidTravelWalletTabFragment_ViewBinding(final PrepaidTravelWalletTabFragment prepaidTravelWalletTabFragment, View view) {
        super(prepaidTravelWalletTabFragment, view);
        this.IconCompatParcelizer = prepaidTravelWalletTabFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btnBuyNewCurrency, "method 'navigateToNewCurrencyPage'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidTravelWalletTabFragment.this.navigateToNewCurrencyPage();
            }
        });
    }

    public final void read() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
