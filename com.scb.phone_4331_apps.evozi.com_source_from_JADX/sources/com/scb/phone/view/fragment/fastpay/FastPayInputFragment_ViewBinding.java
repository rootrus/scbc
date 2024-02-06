package com.scb.phone.view.fragment.fastpay;

import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FastPayInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private FastPayInputFragment write;

    public FastPayInputFragment_ViewBinding(final FastPayInputFragment fastPayInputFragment, View view) {
        super(fastPayInputFragment, view);
        this.write = fastPayInputFragment;
        fastPayInputFragment.accountFrom = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_source, "field 'accountFrom'", CustomTransferAndPaySource.class);
        fastPayInputFragment.accountTo = (CustomTransferAndPayTarget) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_target, "field 'accountTo'", CustomTransferAndPayTarget.class);
        fastPayInputFragment.amountItem = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.transfer_and_pay_amount, "field 'amountItem'", CustomTransferAndPayItem.class);
        fastPayInputFragment.amountInputLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_input_layout, "field 'amountInputLayout'", LinearLayout.class);
        fastPayInputFragment.inputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_input_layout, "field 'inputLayout'", TextInputLayout.class);
        fastPayInputFragment.editAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'editAmount'", AmountEditText.class);
        fastPayInputFragment.remainingLimitLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_linear_layout, "field 'remainingLimitLinearLayout'", LinearLayout.class);
        fastPayInputFragment.textRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_remaining_limit_text_view, "field 'textRemainingLimit'", TextView.class);
        fastPayInputFragment.remainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'remainingLimit'", TextView.class);
        fastPayInputFragment.remainingLimitError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_error_text_view, "field 'remainingLimitError'", TextView.class);
        fastPayInputFragment.noteEditText = (NoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_edit_text, "field 'noteEditText'", NoteEditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_review, "field 'buttonReview' and method 'onReviewButtonClick'");
        fastPayInputFragment.buttonReview = (Button) onStart.write(IconCompatParcelizer2, R.id.button_review, "field 'buttonReview'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FastPayInputFragment.this.onReviewButtonClick();
            }
        });
    }

    public final void read() {
        FastPayInputFragment fastPayInputFragment = this.write;
        if (fastPayInputFragment != null) {
            this.write = null;
            fastPayInputFragment.accountFrom = null;
            fastPayInputFragment.accountTo = null;
            fastPayInputFragment.amountItem = null;
            fastPayInputFragment.amountInputLayout = null;
            fastPayInputFragment.inputLayout = null;
            fastPayInputFragment.editAmount = null;
            fastPayInputFragment.remainingLimitLinearLayout = null;
            fastPayInputFragment.textRemainingLimit = null;
            fastPayInputFragment.remainingLimit = null;
            fastPayInputFragment.remainingLimitError = null;
            fastPayInputFragment.noteEditText = null;
            fastPayInputFragment.buttonReview = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
