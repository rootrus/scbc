package com.scb.phone.view.fragment.hml.businessowner;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.hml.HmlBaseOfflineSuccessFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class HmlBusinessOwnerProgressFragment_ViewBinding extends HmlBaseOfflineSuccessFragment_ViewBinding {
    private View IconCompatParcelizer;
    private HmlBusinessOwnerProgressFragment MediaBrowserCompat$CustomActionResultReceiver;

    public HmlBusinessOwnerProgressFragment_ViewBinding(final HmlBusinessOwnerProgressFragment hmlBusinessOwnerProgressFragment, View view) {
        super(hmlBusinessOwnerProgressFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = hmlBusinessOwnerProgressFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_home, "method 'onHomeClick'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                HmlBusinessOwnerProgressFragment.this.onHomeClick();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$CustomActionResultReceiver != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
