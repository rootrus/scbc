package com.scb.phone.view.fragment.remittance;

import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import p040o.onCreateDialog;
import p040o.onStart;

public final class RemittanceSuccessFragment_ViewBinding extends BaseRemittanceDetailsFragment_ViewBinding {
    private RemittanceSuccessFragment IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaDescriptionCompat;
    private View write;

    public RemittanceSuccessFragment_ViewBinding(final RemittanceSuccessFragment remittanceSuccessFragment, View view) {
        super(remittanceSuccessFragment, view);
        this.IconCompatParcelizer = remittanceSuccessFragment;
        remittanceSuccessFragment.textViewSuccessfulHeaderTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_successful_transfer, "field 'textViewSuccessfulHeaderTitle'", TextView.class);
        remittanceSuccessFragment.pendingIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.iv_pending_icon, "field 'pendingIcon'", ImageView.class);
        remittanceSuccessFragment.textViewTransactionDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_transaction_date, "field 'textViewTransactionDate'", TextView.class);
        remittanceSuccessFragment.textViewRefId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ref_id, "field 'textViewRefId'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_save_slip, "field 'buttonSaveSlip' and method 'onSaveSlipButtonClick'");
        remittanceSuccessFragment.buttonSaveSlip = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_save_slip, "field 'buttonSaveSlip'", Button.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RemittanceSuccessFragment.this.onSaveSlipButtonClick();
            }
        });
        remittanceSuccessFragment.textViewTransactionRemark = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_transation_remark, "field 'textViewTransactionRemark'", TextView.class);
        remittanceSuccessFragment.dividerButtons = onStart.IconCompatParcelizer(view, R.id.divider_buttons, "field 'dividerButtons'");
        remittanceSuccessFragment.amountsSeparatorSpace = onStart.IconCompatParcelizer(view, R.id.remittance_recipient_amounts_separator_space, "field 'amountsSeparatorSpace'");
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_share_slip, "method 'onShareSlipButtonClick'");
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RemittanceSuccessFragment.this.onShareSlipButtonClick();
            }
        });
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.target_favourite_button, "method 'onAddFavoriteClick'");
        this.MediaDescriptionCompat = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RemittanceSuccessFragment.this.onAddFavoriteClick();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.bt_return, "method 'onReturnToAccount'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                RemittanceSuccessFragment.this.onReturnToAccount();
            }
        });
    }

    public final void read() {
        RemittanceSuccessFragment remittanceSuccessFragment = this.IconCompatParcelizer;
        if (remittanceSuccessFragment != null) {
            this.IconCompatParcelizer = null;
            remittanceSuccessFragment.textViewSuccessfulHeaderTitle = null;
            remittanceSuccessFragment.pendingIcon = null;
            remittanceSuccessFragment.textViewTransactionDate = null;
            remittanceSuccessFragment.textViewRefId = null;
            remittanceSuccessFragment.buttonSaveSlip = null;
            remittanceSuccessFragment.textViewTransactionRemark = null;
            remittanceSuccessFragment.dividerButtons = null;
            remittanceSuccessFragment.amountsSeparatorSpace = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.MediaDescriptionCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaDescriptionCompat = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
