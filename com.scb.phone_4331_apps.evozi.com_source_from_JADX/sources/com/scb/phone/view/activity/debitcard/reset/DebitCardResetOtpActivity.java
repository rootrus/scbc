package com.scb.phone.view.activity.debitcard.reset;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.gson.annotations.SerializedName;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.scb.phone.view.activity.debitatm.DebitCardDetailActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C10041x60bf62d9;
import p040o.C10827Iterators;
import p040o.CheckEligibilityActivity;
import p040o.CustomConcurrentHashMap;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.IdCaptureModule_GetIIdExtractionServerRttiFactory;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ScriptIntrinsicBLAS;
import p040o.loadConfigurationFile;
import p040o.onGetStartedClick;
import p040o.recordException;
import p040o.setTapText;
import p040o.trySetException;

public final class DebitCardResetOtpActivity extends BaseOtpActivity implements IdCaptureModule_GetIIdExtractionServerRttiFactory.read {
    public static final C5581xb0d0dcf4 MediaDescriptionCompat = new C5581xb0d0dcf4((byte) 0);
    private recordException MediaBrowserCompat$MediaItem;
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    @HmlPinActivity
    public loadConfigurationFile presenter;

    public DebitCardResetOtpActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = write.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final void onCreate(Bundle bundle) {
        Bundle extras;
        recordException recordexception;
        super.onCreate(bundle);
        loadConfigurationFile loadconfigurationfile = this.presenter;
        if (loadconfigurationfile == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        loadconfigurationfile.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (intent != null && (extras = intent.getExtras()) != null && (recordexception = (recordException) extras.getParcelable("EXTRA_DEBIT_ENCRYPT_PIN")) != null) {
            onGetStartedClick.IconCompatParcelizer((Object) recordexception, "it");
            this.MediaBrowserCompat$MediaItem = recordexception;
        }
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        super.MediaSessionCompat$ResultReceiverWrapper();
        ((ScriptIntrinsicBLAS.Diag) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "debitcard_resetpin_select_mobile_no_otp");
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        super.AppCompatDelegateImpl$ListMenuDecorView();
        ((ScriptIntrinsicBLAS.Diag) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "debitcard_resetpin_otp_input");
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        if (this.MediaBrowserCompat$MediaItem != null) {
            loadConfigurationFile loadconfigurationfile = this.presenter;
            if (loadconfigurationfile == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            recordException recordexception = this.MediaBrowserCompat$MediaItem;
            if (recordexception == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("encryptPinDisplay");
            }
            onGetStartedClick.write((Object) recordexception, "encryptPinDisplay");
            onGetStartedClick.write((Object) str, "tokenUUID");
            onGetStartedClick.write((Object) str2, "otp");
            if (loadconfigurationfile.RatingCompat != null) {
                loadconfigurationfile.RatingCompat.AlertController$RecycleListView();
            }
            CustomConcurrentHashMap.C32841 r5 = new Object(recordexception.write, recordexception.MediaBrowserCompat$CustomActionResultReceiver, recordexception.IconCompatParcelizer, recordexception.MediaBrowserCompat$ItemReceiver, recordexception.read) {
                @SerializedName("cardRefNo")
                private final String IconCompatParcelizer;
                @SerializedName("e2eeSid")
                private final String MediaBrowserCompat$CustomActionResultReceiver;
                @SerializedName("encryptedPIN")
                private final String MediaBrowserCompat$ItemReceiver;
                @SerializedName("pubKeyIndex")
                private final String read;
                @SerializedName("serverRandom")
                private final String write;

                {
                    onGetStartedClick.write((Object) r2, "cardRefNo");
                    onGetStartedClick.write((Object) r3, "encryptedPIN");
                    onGetStartedClick.write((Object) r4, "e2eeSid");
                    onGetStartedClick.write((Object) r5, "serverRandom");
                    onGetStartedClick.write((Object) r6, "pubKeyIndex");
                    this.IconCompatParcelizer = r2;
                    this.MediaBrowserCompat$ItemReceiver = r3;
                    this.MediaBrowserCompat$CustomActionResultReceiver = r4;
                    this.write = r5;
                    this.read = r6;
                }
            };
            C10827Iterators.C35341 r4 = loadconfigurationfile.IconCompatParcelizer;
            FundFactSheetActivity write2 = new loadConfigurationFile.write(loadconfigurationfile);
            FundFactSheetActivity loadconfigurationfile_mediabrowsercompat_customactionresultreceiver = new C10041x60bf62d9(loadconfigurationfile);
            onGetStartedClick.write((Object) write2, "onSuccess");
            onGetStartedClick.write((Object) loadconfigurationfile_mediabrowsercompat_customactionresultreceiver, "onError");
            onGetStartedClick.write((Object) r5, "request");
            onGetStartedClick.write((Object) str, "tokenUUID");
            onGetStartedClick.write((Object) str2, "otp");
            r4.IconCompatParcelizer(r4.IconCompatParcelizer, write2, loadconfigurationfile_mediabrowsercompat_customactionresultreceiver, new trySetException.write(r5, str, str2));
        }
    }

    /* renamed from: K_ */
    public final void mo13720K_() {
        DebitCardResetPinSuccessActivity$MediaBrowserCompat$ItemReceiver debitCardResetPinSuccessActivity$MediaBrowserCompat$ItemReceiver = DebitCardResetPinSuccessActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, DebitCardResetPinSuccessActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read() {
        Intent IconCompatParcelizer = DebitCardDetailActivity.IconCompatParcelizer((Context) this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onDestroy() {
        loadConfigurationFile loadconfigurationfile = this.presenter;
        if (loadconfigurationfile == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        loadconfigurationfile.onDestroy();
        super.onDestroy();
    }

    static final class write extends CheckEligibilityActivity implements FundActionsSuccessActivity<ScriptIntrinsicBLAS.Diag> {
        public static final write MediaBrowserCompat$ItemReceiver = new write();

        write() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new ScriptIntrinsicBLAS.Diag();
        }
    }
}
