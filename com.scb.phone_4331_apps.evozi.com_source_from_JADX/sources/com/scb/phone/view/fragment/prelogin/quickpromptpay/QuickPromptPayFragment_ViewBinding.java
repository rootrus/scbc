package com.scb.phone.view.fragment.prelogin.quickpromptpay;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.transferandpay.transfer.TransferToPromptPayStep1Fragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class QuickPromptPayFragment_ViewBinding extends TransferToPromptPayStep1Fragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private QuickPromptPayFragment write;

    public QuickPromptPayFragment_ViewBinding(final QuickPromptPayFragment quickPromptPayFragment, View view) {
        super(quickPromptPayFragment, view);
        this.write = quickPromptPayFragment;
        quickPromptPayFragment.mImageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_image_view, "field 'mImageIcon'", ImageView.class);
        quickPromptPayFragment.mEditAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'mEditAmount'", AmountEditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_review, "field 'buttonReview' and method 'onReviewButtonClick'");
        quickPromptPayFragment.buttonReview = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_review, "field 'buttonReview'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                QuickPromptPayFragment.this.onReviewButtonClick();
            }
        });
        quickPromptPayFragment.mAccountName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.account_name_text_view, "field 'mAccountName'", TextView.class);
        quickPromptPayFragment.mAmountValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_value_text_view, "field 'mAmountValue'", TextView.class);
        quickPromptPayFragment.remainingLimitLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_linear_layout, "field 'remainingLimitLinearLayout'", LinearLayout.class);
        quickPromptPayFragment.textRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_remaining_limit_text_view, "field 'textRemainingLimit'", TextView.class);
        quickPromptPayFragment.remainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'remainingLimit'", TextView.class);
        quickPromptPayFragment.remainingLimitError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_error_text_view, "field 'remainingLimitError'", TextView.class);
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.modify_quick_prompt_pay, "method 'onModifyClicked'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                QuickPromptPayFragment.this.onModifyClicked();
            }
        });
    }

    public final void read() {
        QuickPromptPayFragment quickPromptPayFragment = this.write;
        if (quickPromptPayFragment != null) {
            this.write = null;
            quickPromptPayFragment.mImageIcon = null;
            quickPromptPayFragment.mEditAmount = null;
            quickPromptPayFragment.buttonReview = null;
            quickPromptPayFragment.mAccountName = null;
            quickPromptPayFragment.mAmountValue = null;
            quickPromptPayFragment.remainingLimitLinearLayout = null;
            quickPromptPayFragment.textRemainingLimit = null;
            quickPromptPayFragment.remainingLimit = null;
            quickPromptPayFragment.remainingLimitError = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
