package com.scb.phone.view.activity.prepaid;

import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity_ViewBinding;
import p040o.onCreateDialog;
import p040o.onStart;

public final class PrepaidTravelForeignCurrencyWalletDetailActivity_ViewBinding extends BaseActivity_ViewBinding {
    private View IconCompatParcelizer;
    private View MediaBrowserCompat$CustomActionResultReceiver;
    private PrepaidTravelForeignCurrencyWalletDetailActivity write;

    public PrepaidTravelForeignCurrencyWalletDetailActivity_ViewBinding(final PrepaidTravelForeignCurrencyWalletDetailActivity prepaidTravelForeignCurrencyWalletDetailActivity, View view) {
        super(prepaidTravelForeignCurrencyWalletDetailActivity, view);
        this.write = prepaidTravelForeignCurrencyWalletDetailActivity;
        prepaidTravelForeignCurrencyWalletDetailActivity.mTxtVwAmount = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.prepaid_wallet_detail_amount_txtVw, "field 'mTxtVwAmount'", TextView.class);
        prepaidTravelForeignCurrencyWalletDetailActivity.mTxtVwCurrencyCode = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.prepaid_wallet_detail_currency_code_txtVw, "field 'mTxtVwCurrencyCode'", TextView.class);
        View IconCompatParcelizer2 = onStart.IconCompatParcelizer(view, R.id.prepaid_wallet_detail_sell_btn, "field 'mBtnSell' and method 'onSellButtonClick'");
        prepaidTravelForeignCurrencyWalletDetailActivity.mBtnSell = (Button) onStart.write(IconCompatParcelizer2, R.id.prepaid_wallet_detail_sell_btn, "field 'mBtnSell'", Button.class);
        this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer2;
        IconCompatParcelizer2.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidTravelForeignCurrencyWalletDetailActivity.this.onSellButtonClick();
            }
        });
        View IconCompatParcelizer3 = onStart.IconCompatParcelizer(view, R.id.prepaid_wallet_detail_buy_btn, "field 'mBtnBuy' and method 'onBuyButtonClick'");
        prepaidTravelForeignCurrencyWalletDetailActivity.mBtnBuy = (Button) onStart.write(IconCompatParcelizer3, R.id.prepaid_wallet_detail_buy_btn, "field 'mBtnBuy'", Button.class);
        this.IconCompatParcelizer = IconCompatParcelizer3;
        IconCompatParcelizer3.setOnClickListener(new onCreateDialog() {
            public final void write(View view) {
                PrepaidTravelForeignCurrencyWalletDetailActivity.this.onBuyButtonClick();
            }
        });
        prepaidTravelForeignCurrencyWalletDetailActivity.mTxtVwRemainingConversionLimit = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.prepaid_wallet_detail_remaining_conversion_limit_txtVw, "field 'mTxtVwRemainingConversionLimit'", TextView.class);
        prepaidTravelForeignCurrencyWalletDetailActivity.mTxtVwSellingRate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.prepaid_wallet_detail_selling_rate_txtVw, "field 'mTxtVwSellingRate'", TextView.class);
        prepaidTravelForeignCurrencyWalletDetailActivity.mTxtVwBuyingRate = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.prepaid_wallet_detail_buying_rate_txtVw, "field 'mTxtVwBuyingRate'", TextView.class);
    }

    public final void read() {
        PrepaidTravelForeignCurrencyWalletDetailActivity prepaidTravelForeignCurrencyWalletDetailActivity = this.write;
        if (prepaidTravelForeignCurrencyWalletDetailActivity != null) {
            this.write = null;
            prepaidTravelForeignCurrencyWalletDetailActivity.mTxtVwAmount = null;
            prepaidTravelForeignCurrencyWalletDetailActivity.mTxtVwCurrencyCode = null;
            prepaidTravelForeignCurrencyWalletDetailActivity.mBtnSell = null;
            prepaidTravelForeignCurrencyWalletDetailActivity.mBtnBuy = null;
            prepaidTravelForeignCurrencyWalletDetailActivity.mTxtVwRemainingConversionLimit = null;
            prepaidTravelForeignCurrencyWalletDetailActivity.mTxtVwSellingRate = null;
            prepaidTravelForeignCurrencyWalletDetailActivity.mTxtVwBuyingRate = null;
            this.MediaBrowserCompat$CustomActionResultReceiver.setOnClickListener((View.OnClickListener) null);
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.IconCompatParcelizer.setOnClickListener((View.OnClickListener) null);
            this.IconCompatParcelizer = null;
            super.read();
            return;
        }
        throw new IllegalStateException("Bindings already cleared.");
    }
}
