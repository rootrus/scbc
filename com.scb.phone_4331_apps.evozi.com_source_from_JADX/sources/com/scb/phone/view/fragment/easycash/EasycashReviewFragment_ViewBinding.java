package com.scb.phone.view.fragment.easycash;

import android.view.View;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class EasycashReviewFragment_ViewBinding extends EasycashBaseReviewFragment_ViewBinding {
    private View IconCompatParcelizer;
    private EasycashReviewFragment MediaBrowserCompat$ItemReceiver;

    public EasycashReviewFragment_ViewBinding(final EasycashReviewFragment easycashReviewFragment, View view) {
        super(easycashReviewFragment, view);
        this.MediaBrowserCompat$ItemReceiver = easycashReviewFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.confirm_button, "method 'onConfirmButtonClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                EasycashReviewFragment.this.onConfirmButtonClicked();
            }
        });
    }

    public final void read() {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
