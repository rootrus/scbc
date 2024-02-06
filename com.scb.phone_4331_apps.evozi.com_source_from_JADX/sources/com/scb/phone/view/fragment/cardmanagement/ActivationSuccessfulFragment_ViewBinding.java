package com.scb.phone.view.fragment.cardmanagement;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ActivationSuccessfulFragment_ViewBinding extends BaseFragment_ViewBinding {
    private ActivationSuccessfulFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public ActivationSuccessfulFragment_ViewBinding(final ActivationSuccessfulFragment activationSuccessfulFragment, View view) {
        super(activationSuccessfulFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = activationSuccessfulFragment;
        activationSuccessfulFragment.txvActivationDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_activation_date_time, "field 'txvActivationDate'", TextView.class);
        activationSuccessfulFragment.txvMaskedCardNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_masked_card_no, "field 'txvMaskedCardNo'", TextView.class);
        activationSuccessfulFragment.txvCardLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_limit, "field 'txvCardLimit'", TextView.class);
        activationSuccessfulFragment.txvFirst4DNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_front_text_view, "field 'txvFirst4DNo'", TextView.class);
        activationSuccessfulFragment.txvSecond2DNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_2nd_front_text_view, "field 'txvSecond2DNo'", TextView.class);
        activationSuccessfulFragment.txvLast4DNo = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.card_number_text_view, "field 'txvLast4DNo'", TextView.class);
        activationSuccessfulFragment.txvCardAdded = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_added_msg, "field 'txvCardAdded'", TextView.class);
        activationSuccessfulFragment.imvCreditCard = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.credit_card_image_view, "field 'imvCreditCard'", ImageView.class);
        View IconCompatParcelizer = onStart.IconCompatParcelizer(view, R.id.btn_accounts, "method 'onAccountsClick'");
        this.write = IconCompatParcelizer;
        IconCompatParcelizer.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ActivationSuccessfulFragment.this.onAccountsClick();
            }
        });
    }

    public final void read() {
        ActivationSuccessfulFragment activationSuccessfulFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (activationSuccessfulFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            activationSuccessfulFragment.txvActivationDate = null;
            activationSuccessfulFragment.txvMaskedCardNo = null;
            activationSuccessfulFragment.txvCardLimit = null;
            activationSuccessfulFragment.txvFirst4DNo = null;
            activationSuccessfulFragment.txvSecond2DNo = null;
            activationSuccessfulFragment.txvLast4DNo = null;
            activationSuccessfulFragment.txvCardAdded = null;
            activationSuccessfulFragment.imvCreditCard = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
