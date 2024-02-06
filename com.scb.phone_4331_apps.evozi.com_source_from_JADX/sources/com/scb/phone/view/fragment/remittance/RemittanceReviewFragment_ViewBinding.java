package com.scb.phone.view.fragment.remittance;

import android.view.View;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RemittanceReviewFragment_ViewBinding extends BaseRemittanceDetailsFragment_ViewBinding {
    private RemittanceReviewFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public RemittanceReviewFragment_ViewBinding(final RemittanceReviewFragment remittanceReviewFragment, View view) {
        super(remittanceReviewFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = remittanceReviewFragment;
        remittanceReviewFragment.tvRemittanceRemarkMessage = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remittance_review_remark_1, "field 'tvRemittanceRemarkMessage'", TextView.class);
        remittanceReviewFragment.tvRemittanceRemarkMessageMore = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remittance_review_remark_2, "field 'tvRemittanceRemarkMessageMore'", TextView.class);
        remittanceReviewFragment.tvRemittanceRemarkMessageRejected = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remittance_review_remark_3, "field 'tvRemittanceRemarkMessageRejected'", TextView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_confirm_review_remittance, "method 'onConfirmClicked'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RemittanceReviewFragment.this.onConfirmClicked();
            }
        });
    }

    public final void read() {
        RemittanceReviewFragment remittanceReviewFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (remittanceReviewFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            remittanceReviewFragment.tvRemittanceRemarkMessage = null;
            remittanceReviewFragment.tvRemittanceRemarkMessageMore = null;
            remittanceReviewFragment.tvRemittanceRemarkMessageRejected = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
