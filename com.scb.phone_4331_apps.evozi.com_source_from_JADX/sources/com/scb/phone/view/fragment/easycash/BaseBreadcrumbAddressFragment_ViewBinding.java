package com.scb.phone.view.fragment.easycash;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.ntb.address.BaseAddressFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class BaseBreadcrumbAddressFragment_ViewBinding extends BaseAddressFragment_ViewBinding {
    private BaseBreadcrumbAddressFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public BaseBreadcrumbAddressFragment_ViewBinding(final BaseBreadcrumbAddressFragment baseBreadcrumbAddressFragment, View view) {
        super(baseBreadcrumbAddressFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = baseBreadcrumbAddressFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.select_province, "method 'onSelectProvinceClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                BaseBreadcrumbAddressFragment.this.onSelectProvinceClick();
            }
        });
    }

    public void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
