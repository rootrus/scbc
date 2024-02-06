package com.scb.phone.view.fragment.hml;

import android.view.View;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlETBOfflineSuccessFragment_ViewBinding extends HmlBaseOfflineSuccessFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private HmlETBOfflineSuccessFragment write;

    public HmlETBOfflineSuccessFragment_ViewBinding(final HmlETBOfflineSuccessFragment hmlETBOfflineSuccessFragment, View view) {
        super(hmlETBOfflineSuccessFragment, view);
        this.write = hmlETBOfflineSuccessFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_home, "method 'onHomeClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlETBOfflineSuccessFragment.this.onHomeClick();
            }
        });
    }

    public final void read() {
        if (this.write != null) {
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
