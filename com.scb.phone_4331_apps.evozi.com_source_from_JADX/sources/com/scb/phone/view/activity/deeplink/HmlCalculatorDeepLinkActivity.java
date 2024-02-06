package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.hml.C5607x23cfbb87;
import com.scb.phone.view.activity.hml.HmlETBLandingActivity;
import com.scb.phone.view.activity.hml.HmlNTBLandingActivity;
import p040o.C10841getUsername;
import p040o.HmlPinActivity;
import p040o.LogFileManager;
import p040o.LookAndFeelParameters;
import p040o.TabLayout;
import p040o.getICheckDeserializerRtti;
import p040o.getUsername$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getUsername$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;
import p040o.zzct;
import p040o.zzjx;

public final class HmlCalculatorDeepLinkActivity extends HmlBaseDeepLinkActivity implements LookAndFeelParameters {
    @HmlPinActivity
    public C10841getUsername presenter;

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C10841getUsername getusername = this.presenter;
        if (getusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        TabLayout tabLayout = getusername.write;
        zzct.zza zza = zzct.zza.CONSUMER;
        onGetStartedClick.write((Object) zza, "type");
        tabLayout.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(zza);
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        super.ActionMenuPresenter$OverflowMenuButton();
        C10841getUsername getusername = this.presenter;
        if (getusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getusername.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void IconCompatParcelizer(zzjx.zza.zzb zzb) {
        onGetStartedClick.write((Object) zzb, "productType");
        HmlNTBLandingActivity.write write = HmlNTBLandingActivity.MediaDescriptionCompat;
        Intent write2 = HmlNTBLandingActivity.write.write(this, zzb);
        write2.putExtra("com.scb.phone.view.activity.deeplink.BaseDeepLinkActivity.EXTRA_FROM_NTB", true);
        write(write2);
        read(write2);
    }

    public final void read(zzjx.zza.zzb zzb) {
        onGetStartedClick.write((Object) zzb, "productType");
        C5607x23cfbb87 hmlETBLandingActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlETBLandingActivity.MediaBrowserCompat$MediaItem;
        Intent IconCompatParcelizer = C5607x23cfbb87.IconCompatParcelizer(this, zzb);
        write(IconCompatParcelizer);
        read(IconCompatParcelizer);
    }

    private final Intent write(Intent intent) {
        Intent intent2 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent2, "intent");
        Bundle extras = intent2.getExtras();
        String str = null;
        intent.putExtra("intent", getICheckDeserializerRtti.write(extras != null ? extras.getString("utm_content") : null));
        Intent intent3 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent3, "intent");
        Bundle extras2 = intent3.getExtras();
        intent.putExtra("utm_campaign", extras2 != null ? extras2.getString("utm_campaign") : null);
        Intent intent4 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent4, "intent");
        Bundle extras3 = intent4.getExtras();
        intent.putExtra("utm_content", extras3 != null ? extras3.getString("utm_content") : null);
        Intent intent5 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent5, "intent");
        Bundle extras4 = intent5.getExtras();
        intent.putExtra("utm_source", extras4 != null ? extras4.getString("utm_source") : null);
        Intent intent6 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent6, "intent");
        Bundle extras5 = intent6.getExtras();
        intent.putExtra("utm_medium", extras5 != null ? extras5.getString("utm_medium") : null);
        Intent intent7 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent7, "intent");
        Bundle extras6 = intent7.getExtras();
        intent.putExtra("lead_type", extras6 != null ? extras6.getString("lead_type") : null);
        Intent intent8 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent8, "intent");
        Bundle extras7 = intent8.getExtras();
        if (extras7 != null) {
            str = extras7.getString("promoCode");
        }
        intent.putExtra("promoCode", str);
        return intent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        C10841getUsername getusername = this.presenter;
        if (getusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return !(getusername.read.write.read() != null);
    }

    public final void MediaSessionCompat$ResultReceiverWrapper(LogFileManager.DirectoryProvider directoryProvider) {
        C10841getUsername getusername = this.presenter;
        if (getusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        String str = null;
        String string = extras != null ? extras.getString("intent") : null;
        Intent intent2 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent2, "intent");
        Bundle extras2 = intent2.getExtras();
        if (extras2 != null) {
            extras2.getString("utm_content");
        }
        Intent intent3 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent3, "intent");
        Bundle extras3 = intent3.getExtras();
        if (extras3 != null) {
            str = extras3.getString("promoCode");
        }
        getusername.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.AppCompatActivity(str);
        writeUInt64NoTag.IconCompatParcelizer write = new C10841getUsername.write(getusername, string);
        if (getusername.RatingCompat != null) {
            write.IconCompatParcelizer(getusername.RatingCompat);
        }
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        C10841getUsername getusername = this.presenter;
        if (getusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Intent intent2 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent2, "intent");
        Bundle extras = intent2.getExtras();
        String str2 = null;
        String string = extras != null ? extras.getString("intent") : null;
        Intent intent3 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent3, "intent");
        Bundle extras2 = intent3.getExtras();
        if (extras2 != null) {
            extras2.getString("utm_content");
        }
        Intent intent4 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent4, "intent");
        Bundle extras3 = intent4.getExtras();
        if (extras3 != null) {
            str2 = extras3.getString("promoCode");
        }
        getusername.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.AppCompatActivity(str2);
        boolean z = true;
        if (getusername.read.write.read() != null) {
            writeUInt64NoTag.IconCompatParcelizer getusername_mediabrowsercompat_customactionresultreceiver = new getUsername$MediaBrowserCompat$CustomActionResultReceiver(getusername, string);
            if (getusername.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getusername_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(getusername.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer getusername_mediabrowsercompat_itemreceiver = new getUsername$MediaBrowserCompat$ItemReceiver(getusername, string);
        if (getusername.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getusername_mediabrowsercompat_itemreceiver.IconCompatParcelizer(getusername.RatingCompat);
        }
    }

    public final void onDestroy() {
        C10841getUsername getusername = this.presenter;
        if (getusername == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getusername.onDestroy();
        super.onDestroy();
    }
}
