package com.scb.phone.view.activity.debitcard.reset;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import java.util.HashMap;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.ScriptIntrinsicBLAS;
import p040o.ZHER2K;
import p040o.onGetStartedClick;

public final class DebitCardResetPinSuccessActivity extends BaseActivity {
    public static final DebitCardResetPinSuccessActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$SearchResultReceiver = new DebitCardResetPinSuccessActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    private HashMap MediaDescriptionCompat;
    private final HmlVerifyEmailActivity MediaMetadataCompat;

    public final void onBackPressed() {
    }

    public DebitCardResetPinSuccessActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = read.write;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaMetadataCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77262131492951);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        int i = ZHER2K.write.pinchange_success_title;
        if (this.MediaDescriptionCompat == null) {
            this.MediaDescriptionCompat = new HashMap();
        }
        View view = (View) this.MediaDescriptionCompat.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.MediaDescriptionCompat.put(Integer.valueOf(i), view);
        }
        TextView textView = (TextView) view;
        onGetStartedClick.IconCompatParcelizer((Object) textView, "pinchange_success_title");
        textView.setText(getString(R.string.auto_debit_card_reset_pin_successful_meaasge));
        ((ScriptIntrinsicBLAS.Diag) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "debitcard_resetpin_success");
    }

    @OnClick
    public final void onOkClick() {
        HomeActivity.write((Context) this, true);
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<ScriptIntrinsicBLAS.Diag> {
        public static final read write = new read();

        read() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ScriptIntrinsicBLAS.Diag();
        }
    }
}
