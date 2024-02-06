package com.scb.phone.view.fragment.hml;

import android.view.View;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlNTBOnlineSuccessFragment_ViewBinding extends HmlBaseOnlineSuccessFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private HmlNTBOnlineSuccessFragment MediaBrowserCompat$ItemReceiver;

    public HmlNTBOnlineSuccessFragment_ViewBinding(final HmlNTBOnlineSuccessFragment hmlNTBOnlineSuccessFragment, View view) {
        super(hmlNTBOnlineSuccessFragment, view);
        this.MediaBrowserCompat$ItemReceiver = hmlNTBOnlineSuccessFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_register_scbs, "method 'onRegisterClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlNTBOnlineSuccessFragment.this.onRegisterClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
