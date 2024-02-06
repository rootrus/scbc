package com.scb.phone.view.fragment.remittance;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ntb.address.BaseAddressFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RemittanceSenderAddressFragment_ViewBinding extends BaseAddressFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private RemittanceSenderAddressFragment write;

    public RemittanceSenderAddressFragment_ViewBinding(final RemittanceSenderAddressFragment remittanceSenderAddressFragment, View view) {
        super(remittanceSenderAddressFragment, view);
        this.write = remittanceSenderAddressFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.select_province, "method 'onSelectProvinceClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RemittanceSenderAddressFragment.this.onSelectProvinceClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.next_button, "method 'onNextButtonClick'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RemittanceSenderAddressFragment.this.onNextButtonClick();
            }
        });
    }

    public final void read() {
        if (this.write != null) {
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
