package com.scb.phone.view.fragment.hml;

import android.view.View;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlNTBOfflineSuccessFragment_ViewBinding extends HmlBaseOfflineSuccessFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private HmlNTBOfflineSuccessFragment write;

    public HmlNTBOfflineSuccessFragment_ViewBinding(final HmlNTBOfflineSuccessFragment hmlNTBOfflineSuccessFragment, View view) {
        super(hmlNTBOfflineSuccessFragment, view);
        this.write = hmlNTBOfflineSuccessFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_register_scbs, "method 'onRegisterClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlNTBOfflineSuccessFragment.this.onRegisterClick();
            }
        });
    }

    public final void read() {
        if (this.write != null) {
            this.write = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
