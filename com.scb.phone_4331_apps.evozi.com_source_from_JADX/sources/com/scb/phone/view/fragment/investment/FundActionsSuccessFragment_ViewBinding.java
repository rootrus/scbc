package com.scb.phone.view.fragment.investment;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import p040o.onCreateDialog;
import p040o.onStart;

public class FundActionsSuccessFragment_ViewBinding extends BaseInvestmentSuccessFragment_ViewBinding {
    private FundActionsSuccessFragment IconCompatParcelizer;
    private View MediaBrowserCompat$ItemReceiver;
    private View write;

    public FundActionsSuccessFragment_ViewBinding(final FundActionsSuccessFragment fundActionsSuccessFragment, View view) {
        super(fundActionsSuccessFragment, view);
        this.IconCompatParcelizer = fundActionsSuccessFragment;
        fundActionsSuccessFragment.successIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.success_icon, "field 'successIcon'", ImageView.class);
        fundActionsSuccessFragment.successScheduleIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.success_schedule_icon, "field 'successScheduleIcon'", ImageView.class);
        fundActionsSuccessFragment.remainingBalanceTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.remaining_balance_text_view, "field 'remainingBalanceTextView'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.return_button, "field 'returnButton'");
        fundActionsSuccessFragment.returnButton = (TextView) onStart.write(IconCompatParcelizer2, R.id.return_button, "field 'returnButton'", TextView.class);
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundActionsSuccessFragment.this.onReturnHomeClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.investment_save_slip_button, "field 'saveSlipButton' and method 'onSaveSlipButton'");
        fundActionsSuccessFragment.saveSlipButton = (DefaultButton) onStart.write(IconCompatParcelizer3, R.id.investment_save_slip_button, "field 'saveSlipButton'", DefaultButton.class);
        this.write = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                FundActionsSuccessFragment.this.onSaveSlipButton();
            }
        });
        fundActionsSuccessFragment.scheduleNote = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.schedule_note, "field 'scheduleNote'", TextView.class);
    }

    public final void read() {
        FundActionsSuccessFragment fundActionsSuccessFragment = this.IconCompatParcelizer;
        if (fundActionsSuccessFragment != null) {
            this.IconCompatParcelizer = null;
            fundActionsSuccessFragment.successIcon = null;
            fundActionsSuccessFragment.successScheduleIcon = null;
            fundActionsSuccessFragment.remainingBalanceTextView = null;
            fundActionsSuccessFragment.returnButton = null;
            fundActionsSuccessFragment.saveSlipButton = null;
            fundActionsSuccessFragment.scheduleNote = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
