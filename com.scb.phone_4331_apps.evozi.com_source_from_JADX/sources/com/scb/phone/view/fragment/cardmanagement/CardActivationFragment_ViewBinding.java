package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class CardActivationFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View MediaBrowserCompat$ItemReceiver;
    private CardActivationFragment write;

    public CardActivationFragment_ViewBinding(final CardActivationFragment cardActivationFragment, View view) {
        super(cardActivationFragment, view);
        this.write = cardActivationFragment;
        cardActivationFragment.imvCreditCard = (ImageView) onStart.IconCompatParcelizer(view, R.id.credit_card_image_view, "field 'imvCreditCard'", ImageView.class);
        cardActivationFragment.cardFirstFourDigit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_front_text_view, "field 'cardFirstFourDigit'", TextView.class);
        cardActivationFragment.cardSecondTwoDigit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_2nd_front_text_view, "field 'cardSecondTwoDigit'", TextView.class);
        cardActivationFragment.cardLastFourDigit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_text_view, "field 'cardLastFourDigit'", TextView.class);
        cardActivationFragment.vgMonth = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_spinner_month, "field 'vgMonth'", ViewGroup.class);
        cardActivationFragment.vgYear = (ViewGroup) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.layout_spinner_year, "field 'vgYear'", ViewGroup.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_activate, "field 'btnActivate' and method 'onActivateClick'");
        cardActivationFragment.btnActivate = (DefaultButton) onStart.write(IconCompatParcelizer, R.id.btn_activate, "field 'btnActivate'", DefaultButton.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                CardActivationFragment.this.onActivateClick();
            }
        });
    }

    public final void read() {
        CardActivationFragment cardActivationFragment = this.write;
        if (cardActivationFragment != null) {
            this.write = null;
            cardActivationFragment.imvCreditCard = null;
            cardActivationFragment.cardFirstFourDigit = null;
            cardActivationFragment.cardSecondTwoDigit = null;
            cardActivationFragment.cardLastFourDigit = null;
            cardActivationFragment.vgMonth = null;
            cardActivationFragment.vgYear = null;
            cardActivationFragment.btnActivate = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
