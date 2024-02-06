package com.scb.phone.view.fragment.transferandpay.cardlessatm;

import android.view.View;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CardlessReviewFragment_ViewBinding extends BaseFragment_ViewBinding {
    private CardlessReviewFragment IconCompatParcelizer;
    private View write;

    public CardlessReviewFragment_ViewBinding(final CardlessReviewFragment cardlessReviewFragment, View view) {
        super(cardlessReviewFragment, view);
        this.IconCompatParcelizer = cardlessReviewFragment;
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.button_continue, "field 'mContinueButton' and method 'onContinueButtonClick'");
        cardlessReviewFragment.mContinueButton = (DefaultButton) onStart.write(IconCompatParcelizer2, R.id.button_continue, "field 'mContinueButton'", DefaultButton.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CardlessReviewFragment.this.onContinueButtonClick();
            }
        });
        cardlessReviewFragment.customSource = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cardless_source, "field 'customSource'", CustomTransferAndPaySource.class);
        cardlessReviewFragment.customAmount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cardless_amount, "field 'customAmount'", CustomTransferAndPayItem.class);
        cardlessReviewFragment.customSpinner = (Spinner) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.spinner, "field 'customSpinner'", Spinner.class);
        cardlessReviewFragment.conditionTv = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_condition, "field 'conditionTv'", TextView.class);
        cardlessReviewFragment.cardlessImportantCsLayout = (ConstraintLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.cs_layout_cardless_important, "field 'cardlessImportantCsLayout'", ConstraintLayout.class);
    }

    public final void read() {
        CardlessReviewFragment cardlessReviewFragment = this.IconCompatParcelizer;
        if (cardlessReviewFragment != null) {
            this.IconCompatParcelizer = null;
            cardlessReviewFragment.mContinueButton = null;
            cardlessReviewFragment.customSource = null;
            cardlessReviewFragment.customAmount = null;
            cardlessReviewFragment.customSpinner = null;
            cardlessReviewFragment.conditionTv = null;
            cardlessReviewFragment.cardlessImportantCsLayout = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
