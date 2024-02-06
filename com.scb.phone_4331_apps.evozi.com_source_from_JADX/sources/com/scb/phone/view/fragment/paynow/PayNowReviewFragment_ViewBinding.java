package com.scb.phone.view.fragment.paynow;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ThaiTextView;
import com.scb.phone.view.custom.transferandpay.CustomNoteItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class PayNowReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private PayNowReviewFragment MediaBrowserCompat$CustomActionResultReceiver;

    public PayNowReviewFragment_ViewBinding(final PayNowReviewFragment payNowReviewFragment, View view) {
        super(payNowReviewFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = payNowReviewFragment;
        payNowReviewFragment.accountSource = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.paynow_review_source, "field 'accountSource'", CustomTransferAndPaySource.class);
        payNowReviewFragment.accountTarget = (CustomTransferAndPayTarget) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.paynow_review_target, "field 'accountTarget'", CustomTransferAndPayTarget.class);
        payNowReviewFragment.conversionRate = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.paynow_conversion_rate, "field 'conversionRate'", CustomTransferAndPayItem.class);
        payNowReviewFragment.amountToSendLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.paynow_amount_to_send, "field 'amountToSendLayout'", LinearLayout.class);
        payNowReviewFragment.amountToSend = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_paynow_amount_to_send_value, "field 'amountToSend'", TextView.class);
        payNowReviewFragment.amountToGetLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.paynow_amount_to_get, "field 'amountToGetLayout'", LinearLayout.class);
        payNowReviewFragment.amountToGet = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_paynow_amount_to_get_value, "field 'amountToGet'", TextView.class);
        payNowReviewFragment.feeLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.paynow_fee, "field 'feeLayout'", LinearLayout.class);
        payNowReviewFragment.fee = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_paynow_fee_value, "field 'fee'", TextView.class);
        payNowReviewFragment.transactionDetails = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.paynow_transaction_details, "field 'transactionDetails'", CustomNoteItem.class);
        payNowReviewFragment.note = (CustomNoteItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.paynow_note, "field 'note'", CustomNoteItem.class);
        payNowReviewFragment.remark = (ThaiTextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_paynow_review_remark, "field 'remark'", ThaiTextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_confirm_paynow, "method 'onConfirmClicked'");
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PayNowReviewFragment.this.onConfirmClicked();
            }
        });
    }

    public final void read() {
        PayNowReviewFragment payNowReviewFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (payNowReviewFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            payNowReviewFragment.accountSource = null;
            payNowReviewFragment.accountTarget = null;
            payNowReviewFragment.conversionRate = null;
            payNowReviewFragment.amountToSendLayout = null;
            payNowReviewFragment.amountToSend = null;
            payNowReviewFragment.amountToGetLayout = null;
            payNowReviewFragment.amountToGet = null;
            payNowReviewFragment.feeLayout = null;
            payNowReviewFragment.fee = null;
            payNowReviewFragment.transactionDetails = null;
            payNowReviewFragment.note = null;
            payNowReviewFragment.remark = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
