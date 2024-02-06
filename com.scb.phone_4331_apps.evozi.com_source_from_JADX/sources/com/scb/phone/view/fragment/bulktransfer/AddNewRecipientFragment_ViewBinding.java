package com.scb.phone.view.fragment.bulktransfer;

import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CounterEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class AddNewRecipientFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private AddNewRecipientFragment MediaBrowserCompat$ItemReceiver;
    private View write;

    public AddNewRecipientFragment_ViewBinding(final AddNewRecipientFragment addNewRecipientFragment, View view) {
        super(addNewRecipientFragment, view);
        this.MediaBrowserCompat$ItemReceiver = addNewRecipientFragment;
        addNewRecipientFragment.textRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_remaining_limit_text_view, "field 'textRemainingLimit'", TextView.class);
        addNewRecipientFragment.remainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'remainingLimit'", TextView.class);
        addNewRecipientFragment.remainingLimitError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_error_text_view, "field 'remainingLimitError'", TextView.class);
        addNewRecipientFragment.remainingLimitLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_linear_layout, "field 'remainingLimitLinearLayout'", LinearLayout.class);
        addNewRecipientFragment.bankIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'bankIcon'", ImageView.class);
        addNewRecipientFragment.bankName = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'bankName'", TextView.class);
        addNewRecipientFragment.accountNumberEditText = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_account_number, "field 'accountNumberEditText'", EditText.class);
        addNewRecipientFragment.amountInputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_input_layout, "field 'amountInputLayout'", TextInputLayout.class);
        addNewRecipientFragment.amountEditText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'amountEditText'", AmountEditText.class);
        addNewRecipientFragment.nickNameCounterEditText = (CounterEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.nick_name_edit_text, "field 'nickNameCounterEditText'", CounterEditText.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.button_review, "field 'reviewButton' and method 'onReviewButtonClick'");
        addNewRecipientFragment.reviewButton = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.button_review, "field 'reviewButton'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AddNewRecipientFragment.this.onReviewButtonClick();
            }
        });
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.view_edit, "method 'navigateBack'");
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                AddNewRecipientFragment.this.navigateBack();
            }
        });
    }

    public final void read() {
        AddNewRecipientFragment addNewRecipientFragment = this.MediaBrowserCompat$ItemReceiver;
        if (addNewRecipientFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            addNewRecipientFragment.textRemainingLimit = null;
            addNewRecipientFragment.remainingLimit = null;
            addNewRecipientFragment.remainingLimitError = null;
            addNewRecipientFragment.remainingLimitLinearLayout = null;
            addNewRecipientFragment.bankIcon = null;
            addNewRecipientFragment.bankName = null;
            addNewRecipientFragment.accountNumberEditText = null;
            addNewRecipientFragment.amountInputLayout = null;
            addNewRecipientFragment.amountEditText = null;
            addNewRecipientFragment.nickNameCounterEditText = null;
            addNewRecipientFragment.reviewButton = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
