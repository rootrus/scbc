package com.scb.phone.view.fragment.purchase;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class PurchaseDepositInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private PurchaseDepositInputFragment write;

    public PurchaseDepositInputFragment_ViewBinding(final PurchaseDepositInputFragment purchaseDepositInputFragment, View view) {
        super(purchaseDepositInputFragment, view);
        this.write = purchaseDepositInputFragment;
        purchaseDepositInputFragment.imageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'imageIcon'", ImageView.class);
        purchaseDepositInputFragment.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
        purchaseDepositInputFragment.textNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_number, "field 'textNumber'", TextView.class);
        purchaseDepositInputFragment.billDetail = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.bill_detail, "field 'billDetail'", LinearLayout.class);
        purchaseDepositInputFragment.contactAccount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.contact_account, "field 'contactAccount'", TextView.class);
        purchaseDepositInputFragment.contactAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.contact_account_number, "field 'contactAccountNumber'", TextView.class);
        purchaseDepositInputFragment.refTwoLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_two_layout, "field 'refTwoLayout'", LinearLayout.class);
        purchaseDepositInputFragment.invoiceAccount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.invoice_account, "field 'invoiceAccount'", TextView.class);
        purchaseDepositInputFragment.invoiceAccountNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.invoice_account_number, "field 'invoiceAccountNumber'", TextView.class);
        purchaseDepositInputFragment.refThreeLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_three_layout, "field 'refThreeLayout'", LinearLayout.class);
        purchaseDepositInputFragment.refThreeLabel = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_three_label, "field 'refThreeLabel'", TextView.class);
        purchaseDepositInputFragment.refThreeId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ref_three_id, "field 'refThreeId'", TextView.class);
        purchaseDepositInputFragment.inputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_input_layout, "field 'inputLayout'", TextInputLayout.class);
        purchaseDepositInputFragment.editAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'editAmount'", AmountEditText.class);
        purchaseDepositInputFragment.remainingLimitLinearLayout = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_linear_layout, "field 'remainingLimitLinearLayout'", LinearLayout.class);
        purchaseDepositInputFragment.textRemainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_remaining_limit_text_view, "field 'textRemainingLimit'", TextView.class);
        purchaseDepositInputFragment.remainingLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_text_view, "field 'remainingLimit'", TextView.class);
        purchaseDepositInputFragment.remainingLimitError = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_limit_error_text_view, "field 'remainingLimitError'", TextView.class);
        purchaseDepositInputFragment.noteEditText = (NoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_edit_text, "field 'noteEditText'", NoteEditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_review, "field 'buttonReview' and method 'onReviewButtonClick'");
        purchaseDepositInputFragment.buttonReview = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_review, "field 'buttonReview'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PurchaseDepositInputFragment.this.onReviewButtonClick();
            }
        });
        purchaseDepositInputFragment.mRecyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.amount_recycler_view, "field 'mRecyclerView'", RecyclerView.class);
        purchaseDepositInputFragment.inputContent = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.input_content, "field 'inputContent'", LinearLayout.class);
    }

    public final void read() {
        PurchaseDepositInputFragment purchaseDepositInputFragment = this.write;
        if (purchaseDepositInputFragment != null) {
            this.write = null;
            purchaseDepositInputFragment.imageIcon = null;
            purchaseDepositInputFragment.textTitle = null;
            purchaseDepositInputFragment.textNumber = null;
            purchaseDepositInputFragment.billDetail = null;
            purchaseDepositInputFragment.contactAccount = null;
            purchaseDepositInputFragment.contactAccountNumber = null;
            purchaseDepositInputFragment.refTwoLayout = null;
            purchaseDepositInputFragment.invoiceAccount = null;
            purchaseDepositInputFragment.invoiceAccountNumber = null;
            purchaseDepositInputFragment.refThreeLayout = null;
            purchaseDepositInputFragment.refThreeLabel = null;
            purchaseDepositInputFragment.refThreeId = null;
            purchaseDepositInputFragment.inputLayout = null;
            purchaseDepositInputFragment.editAmount = null;
            purchaseDepositInputFragment.remainingLimitLinearLayout = null;
            purchaseDepositInputFragment.textRemainingLimit = null;
            purchaseDepositInputFragment.remainingLimit = null;
            purchaseDepositInputFragment.remainingLimitError = null;
            purchaseDepositInputFragment.noteEditText = null;
            purchaseDepositInputFragment.buttonReview = null;
            purchaseDepositInputFragment.mRecyclerView = null;
            purchaseDepositInputFragment.inputContent = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
