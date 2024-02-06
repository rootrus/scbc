package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.hml.C5607x23cfbb87;
import com.scb.phone.view.activity.hml.HmlETBLandingActivity;
import p040o.C5284xe3543e1b;
import p040o.HmlPinActivity;
import p040o.PassportCaptureModule_GetIPassportDetectorFactory;
import p040o.TabLayout;
import p040o.getICheckDeserializerRtti;
import p040o.onGetStartedClick;
import p040o.setCorrectCaseUserName;
import p040o.writeUInt64NoTag;
import p040o.zzct;
import p040o.zzjx;

public final class HmlBusinessOwnerCalculatorDeepLinkActivity extends HmlBaseDeepLinkActivity implements PassportCaptureModule_GetIPassportDetectorFactory {
    @HmlPinActivity
    public setCorrectCaseUserName presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setCorrectCaseUserName setcorrectcaseusername = this.presenter;
        if (setcorrectcaseusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        TabLayout tabLayout = setcorrectcaseusername.MediaBrowserCompat$ItemReceiver;
        zzct.zza zza = zzct.zza.BUSINESS_OWNER;
        onGetStartedClick.write((Object) zza, "type");
        tabLayout.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(zza);
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        super.ActionMenuPresenter$OverflowMenuButton();
        setCorrectCaseUserName setcorrectcaseusername = this.presenter;
        if (setcorrectcaseusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setcorrectcaseusername.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(zzjx.zza.zzb zzb, String str) {
        onGetStartedClick.write((Object) zzb, "productType");
        C5607x23cfbb87 hmlETBLandingActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlETBLandingActivity.MediaBrowserCompat$MediaItem;
        Intent IconCompatParcelizer = C5607x23cfbb87.IconCompatParcelizer(this, zzb);
        Intent putExtra = IconCompatParcelizer.putExtra("intent", str);
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        String str2 = null;
        Intent putExtra2 = putExtra.putExtra("utm_campaign", extras != null ? extras.getString("utm_campaign") : null);
        Intent intent2 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent2, "intent");
        Bundle extras2 = intent2.getExtras();
        Intent putExtra3 = putExtra2.putExtra("utm_content", extras2 != null ? extras2.getString("utm_content") : null);
        Intent intent3 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent3, "intent");
        Bundle extras3 = intent3.getExtras();
        Intent putExtra4 = putExtra3.putExtra("utm_source", extras3 != null ? extras3.getString("utm_source") : null);
        Intent intent4 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent4, "intent");
        Bundle extras4 = intent4.getExtras();
        Intent putExtra5 = putExtra4.putExtra("utm_medium", extras4 != null ? extras4.getString("utm_medium") : null);
        Intent intent5 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent5, "intent");
        Bundle extras5 = intent5.getExtras();
        if (extras5 != null) {
            str2 = extras5.getString("promoCode");
        }
        onGetStartedClick.IconCompatParcelizer((Object) putExtra5.putExtra("promoCode", str2), "landingIntent.putExtra(D…nkSchema.HML_PROMO_CODE))");
        read(IconCompatParcelizer);
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        Intent intent2 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent2, "intent");
        Bundle extras = intent2.getExtras();
        String str2 = null;
        String write = getICheckDeserializerRtti.write(extras != null ? extras.getString("utm_content") : null);
        setCorrectCaseUserName setcorrectcaseusername = this.presenter;
        if (setcorrectcaseusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Intent intent3 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent3, "intent");
        Bundle extras2 = intent3.getExtras();
        String string = extras2 != null ? extras2.getString("intent") : null;
        Intent intent4 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent4, "intent");
        Bundle extras3 = intent4.getExtras();
        if (extras3 != null) {
            extras3.getString("utm_campaign");
        }
        Intent intent5 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent5, "intent");
        Bundle extras4 = intent5.getExtras();
        if (extras4 != null) {
            extras4.getString("utm_content");
        }
        Intent intent6 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent6, "intent");
        Bundle extras5 = intent6.getExtras();
        if (extras5 != null) {
            extras5.getString("lead_type");
        }
        Intent intent7 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent7, "intent");
        Bundle extras6 = intent7.getExtras();
        if (extras6 != null) {
            str2 = extras6.getString("promoCode");
        }
        TabLayout tabLayout = setcorrectcaseusername.MediaBrowserCompat$ItemReceiver;
        zzct.zza zza = zzct.zza.BUSINESS_OWNER;
        onGetStartedClick.write((Object) zza, "type");
        tabLayout.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(zza);
        setcorrectcaseusername.read.MediaBrowserCompat$ItemReceiver.AppCompatActivity(str2);
        writeUInt64NoTag.IconCompatParcelizer setcorrectcaseusername_mediabrowsercompat_customactionresultreceiver = new C5284xe3543e1b(setcorrectcaseusername, string, write);
        if (setcorrectcaseusername.RatingCompat != null) {
            setcorrectcaseusername_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(setcorrectcaseusername.RatingCompat);
        }
    }

    public final void onDestroy() {
        setCorrectCaseUserName setcorrectcaseusername = this.presenter;
        if (setcorrectcaseusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setcorrectcaseusername.onDestroy();
        super.onDestroy();
    }
}
