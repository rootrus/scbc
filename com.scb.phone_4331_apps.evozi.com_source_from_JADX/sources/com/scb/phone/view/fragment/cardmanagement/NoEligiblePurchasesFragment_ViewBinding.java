package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class NoEligiblePurchasesFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private NoEligiblePurchasesFragment MediaBrowserCompat$ItemReceiver;

    public NoEligiblePurchasesFragment_ViewBinding(final NoEligiblePurchasesFragment noEligiblePurchasesFragment, View view) {
        super(noEligiblePurchasesFragment, view);
        this.MediaBrowserCompat$ItemReceiver = noEligiblePurchasesFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.more_information, "method 'onMoreInfoClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                NoEligiblePurchasesFragment.this.onMoreInfoClick();
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
