package com.scb.phone.view.fragment.prepaid.cashout;

import android.view.View;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class PrepaidCashOutInputFragment_ViewBinding extends BaseFragment_ViewBinding {
    private PrepaidCashOutInputFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public PrepaidCashOutInputFragment_ViewBinding(final PrepaidCashOutInputFragment prepaidCashOutInputFragment, View view) {
        super(prepaidCashOutInputFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = prepaidCashOutInputFragment;
        prepaidCashOutInputFragment.mNoteEditText = (NoteEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.note_edit_text, "field 'mNoteEditText'", NoteEditText.class);
        prepaidCashOutInputFragment.mAmountEditText = (AmountEditText) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cash_out_amount_value_edit_text, "field 'mAmountEditText'", AmountEditText.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_cash_out_review, "field 'btnReview' and method 'btnReviewClicked'");
        prepaidCashOutInputFragment.btnReview = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.btn_cash_out_review, "field 'btnReview'", DefaultButton.class);
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidCashOutInputFragment.this.btnReviewClicked(view);
            }
        });
    }

    public final void read() {
        PrepaidCashOutInputFragment prepaidCashOutInputFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (prepaidCashOutInputFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            prepaidCashOutInputFragment.mNoteEditText = null;
            prepaidCashOutInputFragment.mAmountEditText = null;
            prepaidCashOutInputFragment.btnReview = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
