package com.scb.phone.view.fragment.ccrredemption.mileage;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public class MileageConfirmRedemptionFragment_ViewBinding extends BaseFragment_ViewBinding {
    private View IconCompatParcelizer;
    private MileageConfirmRedemptionFragment MediaBrowserCompat$CustomActionResultReceiver;
    private View MediaBrowserCompat$ItemReceiver;

    public MileageConfirmRedemptionFragment_ViewBinding(final MileageConfirmRedemptionFragment mileageConfirmRedemptionFragment, View view) {
        super(mileageConfirmRedemptionFragment, view);
        this.MediaBrowserCompat$CustomActionResultReceiver = mileageConfirmRedemptionFragment;
        mileageConfirmRedemptionFragment.txvMilesDeliveryEta = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.miles_delivery_eta, "field 'txvMilesDeliveryEta'", TextView.class);
        mileageConfirmRedemptionFragment.txvCardBalanceAfterRedemption = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.txv_card_balance_after_redemption, "field 'txvCardBalanceAfterRedemption'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.btn_redeem_another_reward, "field 'btnRedeemAnotherReward' and method 'onRedeemAnotherRewardClick'");
        mileageConfirmRedemptionFragment.btnRedeemAnotherReward = (Button) onStart.write(IconCompatParcelizer2, R.id.btn_redeem_another_reward, "field 'btnRedeemAnotherReward'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MileageConfirmRedemptionFragment.this.onRedeemAnotherRewardClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.btn_account_summary, "method 'onAccountSummaryClick'");
        this.MediaBrowserCompat$ItemReceiver = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                MileageConfirmRedemptionFragment.this.onAccountSummaryClick();
            }
        });
    }

    public final void read() {
        MileageConfirmRedemptionFragment mileageConfirmRedemptionFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mileageConfirmRedemptionFragment != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            mileageConfirmRedemptionFragment.txvMilesDeliveryEta = null;
            mileageConfirmRedemptionFragment.txvCardBalanceAfterRedemption = null;
            mileageConfirmRedemptionFragment.btnRedeemAnotherReward = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$ItemReceiver = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
