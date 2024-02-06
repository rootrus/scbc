package com.scb.phone.view.activity.debitcard;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseChangePinActivity;
import p040o.getNumberOfRows;
import p040o.proxyGetIIdExtractionServerOnDevice;

public class DebitCardConfirmPinActivity extends BaseChangePinActivity<getNumberOfRows> implements proxyGetIIdExtractionServerOnDevice {
    public static Intent read(Context context) {
        return new Intent(context, DebitCardConfirmPinActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        mo13676d_("atm_activate_setup_pin_screen");
        ((getNumberOfRows) this.presenter).MediaBrowserCompat$ItemReceiver(this);
        ((getNumberOfRows) this.presenter).IconCompatParcelizer();
        super.setStackedBackground();
        setTitle(R.string.debit_card_confirm_pin_title);
        setTabContainer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.debit_card_confirm_pin_title);
        setTabContainer();
    }

    public final void MediaDescriptionCompat() {
        setTitle(R.string.debit_card_confirm_pin_title);
        this.topTextView.setText(R.string.debit_card_set_pin_instruction);
    }

    public final void RatingCompat() {
        setResult(-1);
        finish();
    }
}
