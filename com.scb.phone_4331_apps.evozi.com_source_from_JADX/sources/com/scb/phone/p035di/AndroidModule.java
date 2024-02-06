package com.scb.phone.p035di;

import android.app.KeyguardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.hardware.fingerprint.FingerprintManager;
import android.os.Environment;
import com.bumptech.glide.Glide;
import com.scb.phone.R;
import com.scb.phone.view.activity.prelogin.FingerprintHelperInterface;
import java.io.File;
import p039io.github.inflationx.calligraphy3.CalligraphyConfig;
import p040o.AlertController$RecycleListView;
import p040o.BankingServicesDeepLinkActivity;
import p040o.C1189xa6547b7b;
import p040o.ChequeInquiryDeepLinkActivity;
import p040o.CloseAccountReviewActivity;
import p040o.FragmentBuilder_BindDepositFragment;
import p040o.FragmentBuilder_BindECouponBarCodeFragment;
import p040o.FragmentBuilder_BindETBCheckIdentityFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlRepaymentMethodAboutActivity;
import p040o.HmlSetNTBPinActivity;
import p040o.RttiJsonCheck_MembersInjector;
import p040o.count$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getICheckDeserializerKta;
import p040o.getIdType;
import p040o.getSelectedDate;
import p040o.hashCode;
import p040o.regenerateBackground;
import p040o.zaz;

/* renamed from: com.scb.phone.di.AndroidModule */
public class AndroidModule {
    /* access modifiers changed from: package-private */
    public FingerprintHelperInterface IconCompatParcelizer(getSelectedDate getselecteddate) {
        return getselecteddate;
    }

    @HmlSetNTBPinActivity
    public getIdType MediaBrowserCompat$CustomActionResultReceiver(regenerateBackground regeneratebackground) {
        return regeneratebackground;
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseMsisdnURL")
    @HmlSetNTBPinActivity
    public String MediaBrowserCompat$MediaItem() {
        return "http://info-msisdn.scb.co.th:8080/";
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tileVersion")
    public String MediaDescriptionCompat() {
        return "42";
    }

    public RttiJsonCheck_MembersInjector read(FragmentBuilder_BindDepositFragment fragmentBuilder_BindDepositFragment) {
        return fragmentBuilder_BindDepositFragment;
    }

    public Resources MediaBrowserCompat$SearchResultReceiver(Context context) {
        return AlertController$RecycleListView.write(context).getResources();
    }

    public AssetManager IconCompatParcelizer(Context context) {
        return context.getAssets();
    }

    public File MediaBrowserCompat$ItemReceiver(Context context) {
        return context.getCacheDir();
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "fileDir")
    public File MediaDescriptionCompat(Context context) {
        return context.getFilesDir();
    }

    /* access modifiers changed from: package-private */
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "externalStorage")
    public File read(Context context) {
        return new File(Environment.getExternalStorageDirectory(), AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(context));
    }

    @HmlSetNTBPinActivity
    public SharedPreferences MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        return new FragmentBuilder_BindECouponBarCodeFragment(context, "", "secured_shared_prefs.xml");
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "tokenCache")
    @HmlSetNTBPinActivity
    public SharedPreferences write(Context context) {
        return context.getSharedPreferences("FCM_TOKEN", 0);
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOn")
    @HmlSetNTBPinActivity
    @Deprecated
    public CloseAccountReviewActivity MediaMetadataCompat() {
        return new CloseAccountReviewActivity(HmlETBLandingActivity.IconCompatParcelizer());
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnIO")
    @HmlSetNTBPinActivity
    public CloseAccountReviewActivity MediaBrowserCompat$SearchResultReceiver() {
        return new CloseAccountReviewActivity(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver());
    }

    /* access modifiers changed from: package-private */
    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "subscriberOnComputation")
    @HmlSetNTBPinActivity
    public CloseAccountReviewActivity RatingCompat() {
        return new CloseAccountReviewActivity(HmlETBLandingActivity.read());
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "observerOn")
    @HmlSetNTBPinActivity
    public CloseAccountReviewActivity read() {
        return new CloseAccountReviewActivity(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver());
    }

    @HmlSetNTBPinActivity
    public CalligraphyConfig IconCompatParcelizer() {
        return new CalligraphyConfig.Builder().setDefaultFontPath("fonts/db_heavent_regular.ttf").setFontAttrId(R.attr.fontPath).build();
    }

    @HmlSetNTBPinActivity
    public zaz IconCompatParcelizer(Context context, count$MediaBrowserCompat$CustomActionResultReceiver count_mediabrowsercompat_customactionresultreceiver) {
        return new zaz(context, count_mediabrowsercompat_customactionresultreceiver);
    }

    @HmlSetNTBPinActivity
    public hashCode MediaMetadataCompat(Context context) {
        return Glide.MediaBrowserCompat$ItemReceiver(context);
    }

    public C1189xa6547b7b MediaBrowserCompat$ItemReceiver() {
        return new C1189xa6547b7b();
    }

    public KeyguardManager RatingCompat(Context context) {
        return (KeyguardManager) context.getSystemService("keyguard");
    }

    public FingerprintManager MediaBrowserCompat$MediaItem(Context context) {
        return (FingerprintManager) context.getSystemService("fingerprint");
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL")
    @HmlSetNTBPinActivity
    public String write(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("BASE_URL", "https://fasteasy.scbeasy.com:8443/");
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "v1")
    @HmlSetNTBPinActivity
    public String MediaBrowserCompat$ItemReceiver(SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseURL") String str) {
        return str.replace("/v1", "");
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseStaticURL")
    @HmlSetNTBPinActivity
    public String IconCompatParcelizer(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("BASE_STATIC_URL", "https://fasteasy.scbeasy.com:8888/");
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL")
    @HmlSetNTBPinActivity
    public String MediaBrowserCompat$ItemReceiver(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("BASE_ASSETS_URL", "https://fasteasy.scbeasy.com:8888/portalserver/content/bbp/repositories/contentRepository?path=");
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseMediaAssetsURL")
    @HmlSetNTBPinActivity
    public String MediaBrowserCompat$CustomActionResultReceiver(SharedPreferences sharedPreferences) {
        StringBuilder sb = new StringBuilder();
        sb.append(IconCompatParcelizer(sharedPreferences));
        sb.append("media/");
        return sb.toString();
    }

    @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "language")
    public String read(SharedPreferences sharedPreferences) {
        return sharedPreferences.getString("com.scb.phone.pref.key.LANGUAGE", "th");
    }

    @HmlSetNTBPinActivity
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public getICheckDeserializerKta mo13361x50fd9e4a() {
        return new getICheckDeserializerKta();
    }

    public ChequeInquiryDeepLinkActivity write() {
        return new ChequeInquiryDeepLinkActivity();
    }

    @HmlSetNTBPinActivity
    public FragmentBuilder_BindETBCheckIdentityFragment MediaBrowserCompat$CustomActionResultReceiver() {
        return new FragmentBuilder_BindETBCheckIdentityFragment();
    }
}
