package com.scb.phone.view.activity.juristic;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import com.kofax.mobile.sdk._internal.impl.extraction.rtti.C8183f;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseOtpActivity;
import com.scb.phone.view.activity.juristic.JuristicSetupNewPinActivity;
import com.scb.phone.view.activity.pinchange.PinChangeSuccessActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import okhttp3.internal.cache.DiskLruCache;
import p040o.C7133hG;
import p040o.C9715xd99a0bd;
import p040o.DocumentCaptureExperienceCriteriaHolder;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.LinkedListMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.forEachDstIn;
import p040o.getOversizeImage;
import p040o.normalizeFirstWord$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.standardClear;

public final class JuristicOtpActivity extends BaseOtpActivity implements C7133hG {
    public static final IconCompatParcelizer MediaBrowserCompat$MediaItem = new IconCompatParcelizer((byte) 0);
    private String MediaBrowserCompat$SearchResultReceiver;
    private final HmlVerifyEmailActivity MediaDescriptionCompat;
    private String MediaMetadataCompat;
    @HmlPinActivity
    public DocumentCaptureExperienceCriteriaHolder presenter;

    public JuristicOtpActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = C5654x422cbdca.read;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaDescriptionCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        private static final /* synthetic */ void read(Context context, Intent intent) {
            try {
                Intent read = setTapText.write(context, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                context.startActivity(read);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }

        public final void MediaBrowserCompat$ItemReceiver(Context context, String str, String str2) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) str, "deviceState");
            onGetStartedClick.write((Object) str2, "preregistrationTokenId");
            Intent intent = new Intent(context, JuristicOtpActivity.class);
            intent.putExtra("DEVICE_STATE", str);
            intent.putExtra("TOKEN_ID", str2);
            IntentTidInjectionContextAspect.aspectOf();
            read(context, intent);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        DocumentCaptureExperienceCriteriaHolder documentCaptureExperienceCriteriaHolder = this.presenter;
        if (documentCaptureExperienceCriteriaHolder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        documentCaptureExperienceCriteriaHolder.MediaBrowserCompat$ItemReceiver(this);
        String stringExtra = getIntent().getStringExtra("TOKEN_ID");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(TOKEN_ID)");
        this.MediaMetadataCompat = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("DEVICE_STATE");
        forEachDstIn.read read = forEachDstIn.write;
        ((forEachDstIn) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver()).read("user_state", forEachDstIn.read.read(stringExtra2));
        ((forEachDstIn) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "juristic_otp");
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(DE…ONBOARDING_OTP)\n        }");
        this.MediaBrowserCompat$SearchResultReceiver = stringExtra2;
    }

    public final void write(String str, String str2) {
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = str;
        String str9 = str2;
        onGetStartedClick.write((Object) str8, "tokenUUID");
        onGetStartedClick.write((Object) str9, "otp");
        DocumentCaptureExperienceCriteriaHolder documentCaptureExperienceCriteriaHolder = this.presenter;
        if (documentCaptureExperienceCriteriaHolder == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        String str10 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str10 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("deviceState");
        }
        String str11 = this.MediaMetadataCompat;
        if (str11 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("preregistrationTokenId");
        }
        onGetStartedClick.write((Object) str8, "tokenUUID");
        onGetStartedClick.write((Object) str9, "otp");
        onGetStartedClick.write((Object) str10, "deviceState");
        onGetStartedClick.write((Object) str11, "preregistrationTokenId");
        if (documentCaptureExperienceCriteriaHolder.RatingCompat != null) {
            documentCaptureExperienceCriteriaHolder.RatingCompat.AlertController$RecycleListView();
        }
        String string = documentCaptureExperienceCriteriaHolder.write.getSharedPreferences("FCM_TOKEN", 0).getString("FCM_TOKEN", "");
        LinkedListMultimap.AsMapEntries.C35791 r12 = documentCaptureExperienceCriteriaHolder.IconCompatParcelizer;
        FundFactSheetActivity iconCompatParcelizer = new DocumentCaptureExperienceCriteriaHolder.IconCompatParcelizer(documentCaptureExperienceCriteriaHolder, str10);
        FundFactSheetActivity documentCaptureExperienceCriteriaHolder$MediaBrowserCompat$MediaItem = new C9715xd99a0bd(documentCaptureExperienceCriteriaHolder);
        String IconCompatParcelizer2 = documentCaptureExperienceCriteriaHolder.read.RatingCompat.IconCompatParcelizer();
        if (IconCompatParcelizer2 == null || IconCompatParcelizer2 == null) {
            str3 = "";
        } else {
            str3 = IconCompatParcelizer2;
        }
        String MediaBrowserCompat$CustomActionResultReceiver = documentCaptureExperienceCriteriaHolder.read.RatingCompat.MediaBrowserCompat$CustomActionResultReceiver();
        if (MediaBrowserCompat$CustomActionResultReceiver == null || MediaBrowserCompat$CustomActionResultReceiver == null) {
            str4 = "";
        } else {
            str4 = MediaBrowserCompat$CustomActionResultReceiver;
        }
        String str12 = Build.BRAND;
        if (str12 == null || str12 == null) {
            str5 = "";
        } else {
            str5 = str12;
        }
        String str13 = Build.MODEL;
        if (str13 == null || str13 == null) {
            str6 = "";
        } else {
            str6 = str13;
        }
        String str14 = Build.VERSION.RELEASE;
        if (str14 == null || str14 == null) {
            str7 = "";
        } else {
            str7 = str14;
        }
        String str15 = documentCaptureExperienceCriteriaHolder.read.RatingCompat.MediaBrowserCompat$ItemReceiver() ? DiskLruCache.VERSION_1 : "0";
        CharSequence charSequence = string;
        String str16 = null;
        if (charSequence == null || charSequence.length() == 0) {
            string = null;
        }
        if (!(charSequence == null || charSequence.length() == 0)) {
            str16 = "ANDROID";
        }
        FundFactSheetActivity fundFactSheetActivity = documentCaptureExperienceCriteriaHolder$MediaBrowserCompat$MediaItem;
        standardClear standardclear = r7;
        FundFactSheetActivity fundFactSheetActivity2 = iconCompatParcelizer;
        standardClear standardclear2 = new standardClear(str3, str4, str5, str6, str7, str15, str10, str11, string, str16);
        onGetStartedClick.write((Object) fundFactSheetActivity2, "preregistrationTokenId");
        onGetStartedClick.write((Object) fundFactSheetActivity, "onError");
        onGetStartedClick.write((Object) str9, "otp");
        FundFactSheetActivity fundFactSheetActivity3 = fundFactSheetActivity2;
        String str17 = str;
        onGetStartedClick.write((Object) str17, "tokenUUID");
        standardClear standardclear3 = standardclear;
        onGetStartedClick.write((Object) standardclear3, "request");
        LinkedListMultimap.AsMapEntries.C35791 r3 = r12;
        r3.IconCompatParcelizer(r3.write, fundFactSheetActivity3, fundFactSheetActivity, new normalizeFirstWord$MediaBrowserCompat$CustomActionResultReceiver(str9, str17, standardclear3));
    }

    public final void read() {
        String string = getString(R.string.wrong_pin);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.wrong_pin)");
        write(this, R.id.root_activity, string, getOversizeImage.ERROR);
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "preregistrationTokenId");
        Context context = this;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("deviceState");
        }
        Intent read = PinChangeSuccessActivity.read(context, str2);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
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
        finish();
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "preregistrationTokenId");
        JuristicSetupNewPinActivity.IconCompatParcelizer iconCompatParcelizer = JuristicSetupNewPinActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("deviceState");
        }
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str2, "deviceState");
        onGetStartedClick.write((Object) str, "preregistrationTokenId");
        Intent intent = new Intent(context, JuristicSetupNewPinActivity.class);
        intent.putExtra("DEVICE_STATE", str2);
        intent.putExtra("TOKEN_ID", str);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, C8183f.f4230JO);
        write(this, R.id.root_activity, str, getOversizeImage.ERROR);
    }
}
