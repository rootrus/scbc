package com.scb.phone.view.fragment.investment.onboarding;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ntb.address.BaseAddressFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FundAddressDetailFragment_ViewBinding extends BaseAddressFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private FundAddressDetailFragment MediaBrowserCompat$ItemReceiver;

    public FundAddressDetailFragment_ViewBinding(final FundAddressDetailFragment fundAddressDetailFragment, View view) {
        super(fundAddressDetailFragment, view);
        this.MediaBrowserCompat$ItemReceiver = fundAddressDetailFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.select_province, "method 'onSelectProvinceClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundAddressDetailFragment.this.onSelectProvinceClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'onNextButtonClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundAddressDetailFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
