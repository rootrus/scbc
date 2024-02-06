package com.scb.phone.view.activity.juristic;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C7139ht;
import p040o.CheckEligibilityActivity;
import p040o.DocumentCaptureExperience_MembersInjector;
import p040o.ExplicitOrdering;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.LinkedListMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.forEachDstIn;
import p040o.getOversizeImage;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.toUpperCase$MediaBrowserCompat$ItemReceiver;

public final class JuristicResetPinOtpActivity extends BaseOtpActivity implements C7139ht {
    public static final IconCompatParcelizer MediaDescriptionCompat = new IconCompatParcelizer((byte) 0);
    private String MediaBrowserCompat$MediaItem;
    private final HmlVerifyEmailActivity MediaMetadataCompat;
    @HmlPinActivity
    public DocumentCaptureExperience_MembersInjector presenter;

    public JuristicResetPinOtpActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = read.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaMetadataCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DocumentCaptureExperience_MembersInjector documentCaptureExperience_MembersInjector = this.presenter;
        if (documentCaptureExperience_MembersInjector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        documentCaptureExperience_MembersInjector.MediaBrowserCompat$ItemReceiver(this);
        String stringExtra = getIntent().getStringExtra("RESET_TOKEN_ID");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(RESET_TOKEN_ID)");
        this.MediaBrowserCompat$MediaItem = stringExtra;
        ((forEachDstIn) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "forgot_juristic_pin_verify_mobile");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2, String str3) {
        super.MediaBrowserCompat$CustomActionResultReceiver(str, str2, str3);
        ((forEachDstIn) this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "forgot_juristic_pin_otp");
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        DocumentCaptureExperience_MembersInjector documentCaptureExperience_MembersInjector = this.presenter;
        if (documentCaptureExperience_MembersInjector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str3 = this.MediaBrowserCompat$MediaItem;
        if (str3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("resetTokenId");
        }
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) str2, "otp");
        onGetStartedClick.write((Object) str3, "resetTokenId");
        if (documentCaptureExperience_MembersInjector.RatingCompat != null) {
            documentCaptureExperience_MembersInjector.RatingCompat.AlertController$RecycleListView();
        }
        LinkedListMultimap.AsMapEntries.C35791 r5 = documentCaptureExperience_MembersInjector.write;
        FundFactSheetActivity iconCompatParcelizer = new DocumentCaptureExperience_MembersInjector.IconCompatParcelizer(documentCaptureExperience_MembersInjector, str3);
        FundFactSheetActivity write = new DocumentCaptureExperience_MembersInjector.write(documentCaptureExperience_MembersInjector);
        ExplicitOrdering explicitOrdering = new ExplicitOrdering(str3);
        onGetStartedClick.write((Object) iconCompatParcelizer, "resetTokenId");
        onGetStartedClick.write((Object) write, "onError");
        onGetStartedClick.write((Object) str2, "otp");
        onGetStartedClick.write((Object) str, "tokenUUID");
        onGetStartedClick.write((Object) explicitOrdering, "request");
        r5.IconCompatParcelizer(r5.MediaBrowserCompat$CustomActionResultReceiver, iconCompatParcelizer, write, new toUpperCase$MediaBrowserCompat$ItemReceiver(str2, str, explicitOrdering));
    }

    public final void IconCompatParcelizer() {
        String string = getString(R.string.wrong_pin);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.wrong_pin)");
        write(this, R.id.root_activity, string, getOversizeImage.ERROR);
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "resetTokenId");
        JuristicSetupResetPinActivity$MediaBrowserCompat$ItemReceiver juristicSetupResetPinActivity$MediaBrowserCompat$ItemReceiver = JuristicSetupResetPinActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "resetTokenId");
        Intent intent = new Intent(context, JuristicSetupResetPinActivity.class);
        intent.putExtra("RESET_TOKEN_ID", str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
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

    public final void read(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        write(this, R.id.root_activity, str, getOversizeImage.ERROR);
    }
}
