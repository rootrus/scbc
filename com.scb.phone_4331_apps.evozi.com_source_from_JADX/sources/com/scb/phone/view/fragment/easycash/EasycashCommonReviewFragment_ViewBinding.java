package com.scb.phone.view.fragment.easycash;

import android.view.View;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public final class EasycashCommonReviewFragment_ViewBinding extends EasycashBaseReviewFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private EasycashCommonReviewFragment MediaBrowserCompat$ItemReceiver;

    public EasycashCommonReviewFragment_ViewBinding(final EasycashCommonReviewFragment easycashCommonReviewFragment, View view) {
        super(easycashCommonReviewFragment, view);
        this.MediaBrowserCompat$ItemReceiver = easycashCommonReviewFragment;
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.confirm_button, "method 'onConfirmButtonClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashCommonReviewFragment.this.onConfirmButtonClicked();
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
