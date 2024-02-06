package com.scb.phone.view.activity.ccrredemption.confirm;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.cardmanagement.SaveSlipBaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class ConfirmRedemptionActivity_ViewBinding extends SaveSlipBaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private ConfirmRedemptionActivity MediaBrowserCompat$CustomActionResultReceiver;
    private View write;

    public ConfirmRedemptionActivity_ViewBinding(final ConfirmRedemptionActivity confirmRedemptionActivity, View view) {
        super(confirmRedemptionActivity, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = confirmRedemptionActivity;
        confirmRedemptionActivity.txvCardBalance = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_balance_after_redemption, "field 'txvCardBalance'", TextView.class);
        confirmRedemptionActivity.txvDescription1 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description1, "field 'txvDescription1'", TextView.class);
        confirmRedemptionActivity.txvDescription2 = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description2, "field 'txvDescription2'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_redeem_another_reward, "field 'redeemButton' and method 'onRedeemAnotherRewardClick'");
        confirmRedemptionActivity.redeemButton = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_redeem_another_reward, "field 'redeemButton'", Button.class);
        this.write = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ConfirmRedemptionActivity.this.onRedeemAnotherRewardClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_account_summary, "method 'onAccountSummaryClick'");
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                ConfirmRedemptionActivity.this.onAccountSummaryClick();
            }
        });
    }

    public final void read() {
        ConfirmRedemptionActivity confirmRedemptionActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (confirmRedemptionActivity != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            confirmRedemptionActivity.txvCardBalance = null;
            confirmRedemptionActivity.txvDescription1 = null;
            confirmRedemptionActivity.txvDescription2 = null;
            confirmRedemptionActivity.redeemButton = null;
            this.write.setOnClickListener((View.OnClickListener) null);
            this.write = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
