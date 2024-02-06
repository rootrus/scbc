package com.scb.phone.view.fragment.purchase;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class PurchaseCreditCardInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private PurchaseCreditCardInputFragment MediaBrowserCompat$ItemReceiver;

    public PurchaseCreditCardInputFragment_ViewBinding(final PurchaseCreditCardInputFragment purchaseCreditCardInputFragment, View view) {
        super(purchaseCreditCardInputFragment, view);
        this.MediaBrowserCompat$ItemReceiver = purchaseCreditCardInputFragment;
        purchaseCreditCardInputFragment.imageIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_icon, "field 'imageIcon'", ImageView.class);
        purchaseCreditCardInputFragment.textTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'textTitle'", TextView.class);
        purchaseCreditCardInputFragment.textNumber = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_number, "field 'textNumber'", TextView.class);
        purchaseCreditCardInputFragment.terminalId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.terminal_id, "field 'terminalId'", TextView.class);
        purchaseCreditCardInputFragment.inputLayout = (TextInputLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_error_input_layout, "field 'inputLayout'", TextInputLayout.class);
        purchaseCreditCardInputFragment.editAmount = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.edit_amount, "field 'editAmount'", AmountEditText.class);
        purchaseCreditCardInputFragment.noteEditText = (NoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_edit_text, "field 'noteEditText'", NoteEditText.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_review, "field 'buttonReview' and method 'onReviewButtonClick'");
        purchaseCreditCardInputFragment.buttonReview = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_review, "field 'buttonReview'", DefaultButton.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PurchaseCreditCardInputFragment.this.onReviewButtonClick();
            }
        });
    }

    public final void read() {
        PurchaseCreditCardInputFragment purchaseCreditCardInputFragment = this.MediaBrowserCompat$ItemReceiver;
        if (purchaseCreditCardInputFragment != null) {
            this.MediaBrowserCompat$ItemReceiver = null;
            purchaseCreditCardInputFragment.imageIcon = null;
            purchaseCreditCardInputFragment.textTitle = null;
            purchaseCreditCardInputFragment.textNumber = null;
            purchaseCreditCardInputFragment.terminalId = null;
            purchaseCreditCardInputFragment.inputLayout = null;
            purchaseCreditCardInputFragment.editAmount = null;
            purchaseCreditCardInputFragment.noteEditText = null;
            purchaseCreditCardInputFragment.buttonReview = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
