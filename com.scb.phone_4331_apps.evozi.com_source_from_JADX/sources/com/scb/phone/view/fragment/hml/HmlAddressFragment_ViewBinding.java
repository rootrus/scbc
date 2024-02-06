package com.scb.phone.view.fragment.hml;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ntb.address.BaseAddressFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class HmlAddressFragment_ViewBinding extends BaseAddressFragment_ViewBinding {
    private HmlAddressFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;

    public HmlAddressFragment_ViewBinding(final HmlAddressFragment hmlAddressFragment, View view) {
        super(hmlAddressFragment, view);
        this.IconCompatParcelizer = hmlAddressFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.select_province, "method 'onSelectProvinceClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlAddressFragment.this.onSelectProvinceClick();
            }
        });
    }

    public final void read() {
        if (this.IconCompatParcelizer != null) {
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
