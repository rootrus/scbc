package com.scb.phone.view.fragment.ebillsubscription;

import android.view.View;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class EbillSubscriptionReviewFragment_ViewBinding extends BaseEBillSubscriptionReviewFragment_ViewBinding {
    private EbillSubscriptionReviewFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public EbillSubscriptionReviewFragment_ViewBinding(final EbillSubscriptionReviewFragment ebillSubscriptionReviewFragment, View view) {
        super(ebillSubscriptionReviewFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = ebillSubscriptionReviewFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_confirm, "method 'onConfirmButtonClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EbillSubscriptionReviewFragment.this.onConfirmButtonClick();
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
