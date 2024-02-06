package com.scb.phone.view.fragment;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public class ReviewCommonFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ReviewCommonFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public ReviewCommonFragment_ViewBinding(final ReviewCommonFragment reviewCommonFragment, View view) {
        super(reviewCommonFragment, view);
        this.MediaBrowserCompat$ItemReceiver = reviewCommonFragment;
        reviewCommonFragment.container = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.review_container, "field 'container'", LinearLayout.class);
        reviewCommonFragment.additionalInfoText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.additional_info_text, "field 'additionalInfoText'", TextView.class);
        reviewCommonFragment.additionalConfirmText = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.additional_confirm_text, "field 'additionalConfirmText'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_confirm, "method 'onConfirmButtonClicked'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ReviewCommonFragment.this.onConfirmButtonClicked();
            }
        });
    }

    public final void read() {
        ReviewCommonFragment reviewCommonFragment = this.MediaBrowserCompat$ItemReceiver;
        if (reviewCommonFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            reviewCommonFragment.container = null;
            reviewCommonFragment.additionalInfoText = null;
            reviewCommonFragment.additionalConfirmText = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
