package com.scb.phone.view.fragment.transferandpay.transfer;

import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomGiftingView;
import com.scb.phone.view.custom.common.CustomScheduleView;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class TransferInputAmountFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private TransferInputAmountFragment write;

    public TransferInputAmountFragment_ViewBinding(final TransferInputAmountFragment transferInputAmountFragment, View view) {
        super(transferInputAmountFragment, view);
        this.write = transferInputAmountFragment;
        transferInputAmountFragment.imageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'imageIcon'", ImageView.class);
        transferInputAmountFragment.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
        transferInputAmountFragment.textAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_account_number, "field 'textAccountNumber'", TextView.class);
        transferInputAmountFragment.viewGroupAccountNumber = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.view_group_account_number, "field 'viewGroupAccountNumber'", ViewGroup.class);
        transferInputAmountFragment.editAccountNumber = (EditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_account_number, "field 'editAccountNumber'", EditText.class);
        transferInputAmountFragment.inputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_input_layout, "field 'inputLayout'", TextInputLayout.class);
        transferInputAmountFragment.editAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'editAmount'", AmountEditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_review, "field 'buttonReview' and method 'onReviewButtonClick'");
        transferInputAmountFragment.buttonReview = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_review, "field 'buttonReview'", DefaultButton.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TransferInputAmountFragment.this.onReviewButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.view_edit, "field 'editImageView' and method 'navigateBack'");
        transferInputAmountFragment.editImageView = (ImageView) onStart.write(IconCompatParcelizer3, R.id.view_edit, "field 'editImageView'", ImageView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TransferInputAmountFragment.this.navigateBack();
            }
        });
        transferInputAmountFragment.remainingLimitLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_linear_layout, "field 'remainingLimitLinearLayout'", LinearLayout.class);
        transferInputAmountFragment.textRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_remaining_limit_text_view, "field 'textRemainingLimit'", TextView.class);
        transferInputAmountFragment.remainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'remainingLimit'", TextView.class);
        transferInputAmountFragment.remainingLimitError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_error_text_view, "field 'remainingLimitError'", TextView.class);
        transferInputAmountFragment.noteEditText = (NoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_edit_text, "field 'noteEditText'", NoteEditText.class);
        transferInputAmountFragment.customScheduleView = (CustomScheduleView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_view, "field 'customScheduleView'", CustomScheduleView.class);
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.custom_gifting_view, "field 'customGiftingView' and method 'onGiftingClick'");
        transferInputAmountFragment.customGiftingView = (CustomGiftingView) onStart.write(IconCompatParcelizer4, R.id.custom_gifting_view, "field 'customGiftingView'", CustomGiftingView.class);
        this.IconCompatParcelizer = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                TransferInputAmountFragment.this.onGiftingClick();
            }
        });
        transferInputAmountFragment.giftLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ll_gift_layout, "field 'giftLayout'", LinearLayout.class);
        transferInputAmountFragment.scheduleLine = onStart.IconCompatParcelizer(view, R.id.vw_schedule_line, "field 'scheduleLine'");
        transferInputAmountFragment.noteLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_layout, "field 'noteLayout'", LinearLayout.class);
    }

    public final void read() {
        TransferInputAmountFragment transferInputAmountFragment = this.write;
        if (transferInputAmountFragment != null) {
            this.write = null;
            transferInputAmountFragment.imageIcon = null;
            transferInputAmountFragment.textTitle = null;
            transferInputAmountFragment.textAccountNumber = null;
            transferInputAmountFragment.viewGroupAccountNumber = null;
            transferInputAmountFragment.editAccountNumber = null;
            transferInputAmountFragment.inputLayout = null;
            transferInputAmountFragment.editAmount = null;
            transferInputAmountFragment.buttonReview = null;
            transferInputAmountFragment.editImageView = null;
            transferInputAmountFragment.remainingLimitLinearLayout = null;
            transferInputAmountFragment.textRemainingLimit = null;
            transferInputAmountFragment.remainingLimit = null;
            transferInputAmountFragment.remainingLimitError = null;
            transferInputAmountFragment.noteEditText = null;
            transferInputAmountFragment.customScheduleView = null;
            transferInputAmountFragment.customGiftingView = null;
            transferInputAmountFragment.giftLayout = null;
            transferInputAmountFragment.scheduleLine = null;
            transferInputAmountFragment.noteLayout = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
