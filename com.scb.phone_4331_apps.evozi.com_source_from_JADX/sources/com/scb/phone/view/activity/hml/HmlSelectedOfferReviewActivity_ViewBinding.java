package com.scb.phone.view.activity.hml;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onStart;

public class HmlSelectedOfferReviewActivity_ViewBinding extends BaseActivity_ViewBinding {
    private HmlSelectedOfferReviewActivity write;

    public HmlSelectedOfferReviewActivity_ViewBinding(HmlSelectedOfferReviewActivity hmlSelectedOfferReviewActivity, View view) {
        super(hmlSelectedOfferReviewActivity, view);
        this.write = hmlSelectedOfferReviewActivity;
        hmlSelectedOfferReviewActivity.container = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_layout_details_container, "field 'container'", LinearLayout.class);
        hmlSelectedOfferReviewActivity.amount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_amount, "field 'amount'", TextView.class);
        hmlSelectedOfferReviewActivity.repaymentAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_repayment_amount, "field 'repaymentAmount'", TextView.class);
        hmlSelectedOfferReviewActivity.btnConfirm = (Button) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.button_continue, "field 'btnConfirm'", Button.class);
    }

    public final void read() {
        HmlSelectedOfferReviewActivity hmlSelectedOfferReviewActivity = this.write;
        if (hmlSelectedOfferReviewActivity != null) {
            this.write = null;
            hmlSelectedOfferReviewActivity.container = null;
            hmlSelectedOfferReviewActivity.amount = null;
            hmlSelectedOfferReviewActivity.repaymentAmount = null;
            hmlSelectedOfferReviewActivity.btnConfirm = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
