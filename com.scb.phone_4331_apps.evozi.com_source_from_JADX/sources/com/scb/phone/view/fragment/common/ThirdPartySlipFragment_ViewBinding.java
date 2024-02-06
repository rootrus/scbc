package com.scb.phone.view.fragment.common;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.PurchaseSuccessFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class ThirdPartySlipFragment_ViewBinding extends PurchaseSuccessFragment_ViewBinding {
    private View IconCompatParcelizer;
    private ThirdPartySlipFragment write;

    public ThirdPartySlipFragment_ViewBinding(final ThirdPartySlipFragment thirdPartySlipFragment, View view) {
        super(thirdPartySlipFragment, view);
        this.write = thirdPartySlipFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.return_button, "method 'onClickReturnButton'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ThirdPartySlipFragment.this.onClickReturnButton();
            }
        });
    }

    public final void read() {
        if (this.write != null) {
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
