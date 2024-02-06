package com.scb.phone.view.fragment.hml;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlSetNTBPinSuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private HmlSetNTBPinSuccessFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public HmlSetNTBPinSuccessFragment_ViewBinding(final HmlSetNTBPinSuccessFragment hmlSetNTBPinSuccessFragment, View view) {
        super(hmlSetNTBPinSuccessFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlSetNTBPinSuccessFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.bt_ntb_pin_setup_button, "method 'onButtonClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlSetNTBPinSuccessFragment.this.onButtonClicked();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
