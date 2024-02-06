package com.scb.phone.view.fragment.transferandpay;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.R;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class FixedTransferSuccessFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;
    private View MediaDescriptionCompat;
    private View MediaMetadataCompat;
    private FixedTransferSuccessFragment write;

    public FixedTransferSuccessFragment_ViewBinding(final FixedTransferSuccessFragment fixedTransferSuccessFragment, View view) {
        super(fixedTransferSuccessFragment, view);
        this.write = fixedTransferSuccessFragment;
        fixedTransferSuccessFragment.textViewSuccessfulTransfer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_successful_transfer, "field 'textViewSuccessfulTransfer'", TextView.class);
        fixedTransferSuccessFragment.textViewUnsuccessfulTransfer = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_unsuccessful_transfer, "field 'textViewUnsuccessfulTransfer'", TextView.class);
        fixedTransferSuccessFragment.textViewTransactionDate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_transaction_date, "field 'textViewTransactionDate'", TextView.class);
        fixedTransferSuccessFragment.textViewRefId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ref_id, "field 'textViewRefId'", TextView.class);
        fixedTransferSuccessFragment.customSource = (CustomTransferAndPaySource) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctp_source, "field 'customSource'", CustomTransferAndPaySource.class);
        fixedTransferSuccessFragment.customTarget = (CustomTransferAndPayTarget) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctp_target, "field 'customTarget'", CustomTransferAndPayTarget.class);
        fixedTransferSuccessFragment.textViewNoteTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_note_title, "field 'textViewNoteTitle'", TextView.class);
        fixedTransferSuccessFragment.textViewNoteValue = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_note_value, "field 'textViewNoteValue'", TextView.class);
        fixedTransferSuccessFragment.customNetAmount = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctp_net_amount, "field 'customNetAmount'", CustomTransferAndPayItem.class);
        fixedTransferSuccessFragment.customInterest = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctp_interest, "field 'customInterest'", CustomTransferAndPayItem.class);
        fixedTransferSuccessFragment.customWithholdingTax = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctp_withholding_tax, "field 'customWithholdingTax'", CustomTransferAndPayItem.class);
        fixedTransferSuccessFragment.customFee = (CustomTransferAndPayItem) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.ctp_fee, "field 'customFee'", CustomTransferAndPayItem.class);
        fixedTransferSuccessFragment.recyclerView = (RecyclerView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.recycler_view, "field 'recyclerView'", RecyclerView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.bt_share_slip, "field 'buttonShareSlip' and method 'onShareSlipButtonClick'");
        fixedTransferSuccessFragment.buttonShareSlip = (Button) onStart.write(IconCompatParcelizer2, R.id.bt_share_slip, "field 'buttonShareSlip'", Button.class);
        this.MediaMetadataCompat = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FixedTransferSuccessFragment.this.onShareSlipButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.bt_save_slip, "field 'buttonSaveSlip' and method 'onSaveSlipButtonClick'");
        fixedTransferSuccessFragment.buttonSaveSlip = (Button) onStart.write(IconCompatParcelizer3, R.id.bt_save_slip, "field 'buttonSaveSlip'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FixedTransferSuccessFragment.this.onSaveSlipButtonClick();
            }
        });
        fixedTransferSuccessFragment.dividerButtons = onStart.IconCompatParcelizer(view, R.id.divider_buttons, "field 'dividerButtons'");
        fixedTransferSuccessFragment.textViewRemainingBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_remaining_balance, "field 'textViewRemainingBalance'", TextView.class);
        View findViewById = view.findViewById(R.id.target_favourite_button);
        if (findViewById != null) {
            this.MediaDescriptionCompat = findViewById;
            findViewById.setOnClickListener(new onCreateDialog() {
                public final void write(View view) {
                    FixedTransferSuccessFragment.this.onAddFavoriteClick();
                }
            });
        }
        View IconCompatParcelizer4 = onStart.IconCompatParcelizer(view, R.id.bt_continue_to_transfer, "method 'onReturnToTransferClick'");
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer4;
        IconCompatParcelizer4.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FixedTransferSuccessFragment.this.onReturnToTransferClick();
            }
        });
        View IconCompatParcelizer5 = onStart.IconCompatParcelizer(view, R.id.bt_return, "method 'onReturnToHomeClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer5;
        IconCompatParcelizer5.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FixedTransferSuccessFragment.this.onReturnToHomeClick();
            }
        });
    }

    public final void read() {
        FixedTransferSuccessFragment fixedTransferSuccessFragment = this.write;
        if (fixedTransferSuccessFragment != null) {
            this.write = null;
            fixedTransferSuccessFragment.textViewSuccessfulTransfer = null;
            fixedTransferSuccessFragment.textViewUnsuccessfulTransfer = null;
            fixedTransferSuccessFragment.textViewTransactionDate = null;
            fixedTransferSuccessFragment.textViewRefId = null;
            fixedTransferSuccessFragment.customSource = null;
            fixedTransferSuccessFragment.customTarget = null;
            fixedTransferSuccessFragment.textViewNoteTitle = null;
            fixedTransferSuccessFragment.textViewNoteValue = null;
            fixedTransferSuccessFragment.customNetAmount = null;
            fixedTransferSuccessFragment.customInterest = null;
            fixedTransferSuccessFragment.customWithholdingTax = null;
            fixedTransferSuccessFragment.customFee = null;
            fixedTransferSuccessFragment.recyclerView = null;
            fixedTransferSuccessFragment.buttonShareSlip = null;
            fixedTransferSuccessFragment.buttonSaveSlip = null;
            fixedTransferSuccessFragment.dividerButtons = null;
            fixedTransferSuccessFragment.textViewRemainingBalance = null;
            this.MediaMetadataCompat.setOnClickListener((View.OnClickListener) null);
            this.MediaMetadataCompat = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            View view = this.MediaDescriptionCompat;
            if (view != null) {
                view.setOnClickListener((View.OnClickListener) null);
                this.MediaDescriptionCompat = null;
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
