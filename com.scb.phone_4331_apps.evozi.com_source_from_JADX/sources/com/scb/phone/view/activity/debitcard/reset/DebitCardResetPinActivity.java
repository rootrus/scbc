package com.scb.phone.view.activity.debitcard.reset;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import com.scb.phone.R;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTermsAndConditionsActivity;
import com.scb.phone.view.custom.debitcard.CustomPinWithMaxInput;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.concurrent.TimeUnit;
import org.threeten.p041bp.OffsetDateTime;
import p040o.DebitCardResetOtpActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.IdCaptureModule_GetIJsonExactionHelperRttiFactory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.PlaceBuffer;
import p040o.ScriptIntrinsicBLAS;
import p040o.addOnSuccessListener;
import p040o.getClassificationResults;
import p040o.onGetStartedClick;
import p040o.recordException;
import p040o.setTapText;

public final class DebitCardResetPinActivity extends BaseChangePinWithMaxActivity<getClassificationResults> implements IdCaptureModule_GetIJsonExactionHelperRttiFactory {
    private final HmlVerifyEmailActivity MediaBrowserCompat$MediaItem;
    private boolean MediaDescriptionCompat;
    private String MediaMetadataCompat = "";

    public static final Intent read(Context context, String str, boolean z) {
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, DebitCardResetPinActivity.class);
        intent.putExtra("EXTRA_DEBIT_CARD_NUMBER", str);
        intent.putExtra("EXTRA_IS_MAGNETIC_CARD", z);
        return intent;
    }

    public DebitCardResetPinActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = C5582x7666abde.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$MediaItem = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class read {
        public final DeejungTermsAndConditionsActivity.IconCompatParcelizer IconCompatParcelizer;
        public final OffsetDateTime MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String read;

        private read() {
        }

        public read(String str, String str2, OffsetDateTime offsetDateTime, DeejungTermsAndConditionsActivity.IconCompatParcelizer iconCompatParcelizer) {
            onGetStartedClick.write((Object) str, "merchantId");
            onGetStartedClick.write((Object) str2, "walletId");
            this.read = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = offsetDateTime;
            this.IconCompatParcelizer = iconCompatParcelizer;
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        ((getClassificationResults) t).MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (intent == null || (str = intent.getStringExtra("EXTRA_DEBIT_CARD_NUMBER")) == null) {
            str = "";
        }
        this.MediaMetadataCompat = str;
        Intent intent2 = getIntent();
        boolean z = false;
        if (intent2 != null) {
            z = intent2.getBooleanExtra("EXTRA_IS_MAGNETIC_CARD", false);
        }
        this.MediaDescriptionCompat = z;
        MediaSessionCompat$QueueItem().setEnabledLines(true);
        if (this.MediaDescriptionCompat) {
            CustomPinWithMaxInput customPinWithMaxInput = this.customPinInput;
            if (customPinWithMaxInput == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
            }
            customPinWithMaxInput.setMaximumInput(4);
            ((ScriptIntrinsicBLAS.Diag) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "debitcard_resetpin_four_pin_input");
        } else {
            ((ScriptIntrinsicBLAS.Diag) this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "debitcard_resetpin_six_pin_input");
        }
        super.setStackedBackground();
        setTitle(R.string.auto_reset_card_pin_page_title);
        setTabContainer();
        T t2 = this.presenter;
        if (t2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        ((getClassificationResults) t2).IconCompatParcelizer();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.auto_reset_card_pin_page_title);
    }

    public final boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem == null || menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public final void MediaDescriptionCompat() {
        super.MediaDescriptionCompat();
        setTitle(R.string.auto_reset_card_pin_page_title);
        MediaSessionCompat$ResultReceiverWrapper().setText(R.string.auto_reset_card_pin_instruction);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        super.MediaBrowserCompat$CustomActionResultReceiver();
        setTitle(R.string.auto_reset_card_pin_page_title);
        MediaSessionCompat$ResultReceiverWrapper().setText(R.string.auto_confirm_card_pin_instruction);
    }

    public final void write(recordException recordexception) {
        onGetStartedClick.write((Object) recordexception, "resetPinDisplay");
        C5581xb0d0dcf4 debitCardResetOtpActivity$MediaBrowserCompat$CustomActionResultReceiver = DebitCardResetOtpActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) recordexception, "encryptPinDisplay");
        Intent putExtra = new Intent(context, DebitCardResetOtpActivity.class).putExtra("EXTRA_DEBIT_ENCRYPT_PIN", recordexception);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, DebitCar…T_PIN, encryptPinDisplay)");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        mo13712Q_();
    }

    public final void IconCompatParcelizer(String str) {
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getClassificationResults getclassificationresults = (getClassificationResults) t;
        String str2 = this.MediaMetadataCompat;
        onGetStartedClick.write((Object) str2, "cardRefNo");
        addOnSuccessListener addonsuccesslistener = getclassificationresults.IconCompatParcelizer;
        DebitCardResetOtpActivity<PlaceBuffer> delay = addonsuccesslistener.IconCompatParcelizer.MediaBrowserCompat$MediaItem().delay(100, TimeUnit.MILLISECONDS);
        onGetStartedClick.IconCompatParcelizer((Object) delay, "iSprintRepositoryContrac…e, TimeUnit.MILLISECONDS)");
        DebitCardResetOtpActivity<R> map = delay.map(new addOnSuccessListener.write(addonsuccesslistener, str));
        onGetStartedClick.IconCompatParcelizer((Object) map, "preAuthenticateFromApi()…ring())\n                }");
        getclassificationresults.IconCompatParcelizer.write(map, new getClassificationResults.read(getclassificationresults, str2));
    }

    public final void onBackPressed() {
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (((getClassificationResults) t).read()) {
            finish();
            return;
        }
        T t2 = this.presenter;
        if (t2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        ((getClassificationResults) t2).MediaBrowserCompat$CustomActionResultReceiver();
    }

    public final void onDestroy() {
        T t = this.presenter;
        if (t == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        ((getClassificationResults) t).onDestroy();
        super.onDestroy();
    }

    /* renamed from: Q_ */
    public final void mo13712Q_() {
        CustomPinWithMaxInput customPinWithMaxInput = this.customPinInput;
        if (customPinWithMaxInput == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("customPinInput");
        }
        customPinWithMaxInput.MediaBrowserCompat$CustomActionResultReceiver();
    }
}
