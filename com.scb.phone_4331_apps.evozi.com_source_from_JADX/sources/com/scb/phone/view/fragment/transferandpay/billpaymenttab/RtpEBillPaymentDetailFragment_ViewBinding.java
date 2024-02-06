package com.scb.phone.view.fragment.transferandpay.billpaymenttab;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class RtpEBillPaymentDetailFragment_ViewBinding extends BaseFragment_ViewBinding {
    private RtpEBillPaymentDetailFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public RtpEBillPaymentDetailFragment_ViewBinding(final RtpEBillPaymentDetailFragment rtpEBillPaymentDetailFragment, View view) {
        super(rtpEBillPaymentDetailFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = rtpEBillPaymentDetailFragment;
        rtpEBillPaymentDetailFragment.sourceImageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_image_icon, "field 'sourceImageIcon'", ImageView.class);
        rtpEBillPaymentDetailFragment.sourceTextTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_text_title, "field 'sourceTextTitle'", TextView.class);
        rtpEBillPaymentDetailFragment.sourceTextProxyNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.source_text_proxy_number, "field 'sourceTextProxyNumber'", TextView.class);
        rtpEBillPaymentDetailFragment.destinationImageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.destination_image_icon, "field 'destinationImageIcon'", ImageView.class);
        rtpEBillPaymentDetailFragment.destinationTextTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.destination_text_title, "field 'destinationTextTitle'", TextView.class);
        rtpEBillPaymentDetailFragment.destinationProxyNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.destination_text_proxy_number, "field 'destinationProxyNumber'", TextView.class);
        rtpEBillPaymentDetailFragment.refNo1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_no_1, "field 'refNo1'", TextView.class);
        rtpEBillPaymentDetailFragment.refNo2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_no_2, "field 'refNo2'", TextView.class);
        rtpEBillPaymentDetailFragment.refNo3 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_no_3, "field 'refNo3'", TextView.class);
        rtpEBillPaymentDetailFragment.remainingLimitLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_linear_layout, "field 'remainingLimitLinearLayout'", LinearLayout.class);
        rtpEBillPaymentDetailFragment.textRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_remaining_limit_text_view, "field 'textRemainingLimit'", TextView.class);
        rtpEBillPaymentDetailFragment.remainingLimitError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_error_text_view, "field 'remainingLimitError'", TextView.class);
        rtpEBillPaymentDetailFragment.editAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'editAmount'", AmountEditText.class);
        rtpEBillPaymentDetailFragment.invalidAmountTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.invalid_amount_text_view, "field 'invalidAmountTextView'", TextView.class);
        rtpEBillPaymentDetailFragment.noteEditText = (NoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_edit_text, "field 'noteEditText'", NoteEditText.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_review, "field 'buttonReview' and method 'onReviewButtonClick'");
        rtpEBillPaymentDetailFragment.buttonReview = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.button_review, "field 'buttonReview'", DefaultButton.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RtpEBillPaymentDetailFragment.this.onReviewButtonClick();
            }
        });
        rtpEBillPaymentDetailFragment.tvDueDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ebill_due_date_textview, "field 'tvDueDate'", TextView.class);
    }

    public final void read() {
        RtpEBillPaymentDetailFragment rtpEBillPaymentDetailFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (rtpEBillPaymentDetailFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            rtpEBillPaymentDetailFragment.sourceImageIcon = null;
            rtpEBillPaymentDetailFragment.sourceTextTitle = null;
            rtpEBillPaymentDetailFragment.sourceTextProxyNumber = null;
            rtpEBillPaymentDetailFragment.destinationImageIcon = null;
            rtpEBillPaymentDetailFragment.destinationTextTitle = null;
            rtpEBillPaymentDetailFragment.destinationProxyNumber = null;
            rtpEBillPaymentDetailFragment.refNo1 = null;
            rtpEBillPaymentDetailFragment.refNo2 = null;
            rtpEBillPaymentDetailFragment.refNo3 = null;
            rtpEBillPaymentDetailFragment.remainingLimitLinearLayout = null;
            rtpEBillPaymentDetailFragment.textRemainingLimit = null;
            rtpEBillPaymentDetailFragment.remainingLimitError = null;
            rtpEBillPaymentDetailFragment.editAmount = null;
            rtpEBillPaymentDetailFragment.invalidAmountTextView = null;
            rtpEBillPaymentDetailFragment.noteEditText = null;
            rtpEBillPaymentDetailFragment.buttonReview = null;
            rtpEBillPaymentDetailFragment.tvDueDate = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
