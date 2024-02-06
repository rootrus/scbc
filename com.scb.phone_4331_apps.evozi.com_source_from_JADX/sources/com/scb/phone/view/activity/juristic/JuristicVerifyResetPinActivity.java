package com.scb.phone.view.activity.juristic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import com.scb.phone.R;
import com.scb.phone.view.activity.juristic.JuristicResetPinOtpActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C7140hu;
import p040o.CheckEligibilityActivity;
import p040o.DocumentBaseOverlayView_Factory;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.MerchantService;
import p040o.MyECouponActivity_ViewBinding;
import p040o.forEachDstIn;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.showUserInstructionMessage;

public final class JuristicVerifyResetPinActivity extends BaseJuristicPinActivity implements MerchantService, C7140hu {
    public static final write MediaBrowserCompat$SearchResultReceiver = new write((byte) 0);
    private final HmlVerifyEmailActivity MediaMetadataCompat;
    @HmlPinActivity
    public showUserInstructionMessage presenter;

    public JuristicVerifyResetPinActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = read.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaMetadataCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final DocumentBaseOverlayView_Factory<?> mo34046x50fd9e4a() {
        showUserInstructionMessage showuserinstructionmessage = this.presenter;
        if (showuserinstructionmessage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return showuserinstructionmessage;
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        showUserInstructionMessage showuserinstructionmessage = this.presenter;
        if (showuserinstructionmessage == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        showuserinstructionmessage.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        Intent intent = getIntent();
        if (intent != null) {
            showUserInstructionMessage showuserinstructionmessage = this.presenter;
            if (showuserinstructionmessage == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String stringExtra = intent.getStringExtra("EXTRA_TOKEN_ID");
            onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "it.getStringExtra(EXTRA_TOKEN_ID)");
            onGetStartedClick.write((Object) stringExtra, "resetToken");
            showuserinstructionmessage.write = stringExtra;
        }
        ((forEachDstIn) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "forgot_juristic_pin_enter_personal_pin");
    }

    public final void MediaSessionCompat$QueueItem() {
        super.MediaSessionCompat$QueueItem();
        setTitle(R.string.juristic_verify_reset_pin_title);
        TextView textView = this.textLabelTop;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("textLabelTop");
        }
        textView.setText(getString(R.string.juristic_verify_reset_pin_instruction));
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "resetPinTokenId");
        JuristicResetPinOtpActivity.IconCompatParcelizer iconCompatParcelizer = JuristicResetPinOtpActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "resetTokenId");
        Intent intent = new Intent(context, JuristicResetPinOtpActivity.class);
        intent.putExtra("RESET_TOKEN_ID", str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachDstIn> {
        public static final read MediaBrowserCompat$ItemReceiver = new read();

        read() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachDstIn();
        }
    }
}
