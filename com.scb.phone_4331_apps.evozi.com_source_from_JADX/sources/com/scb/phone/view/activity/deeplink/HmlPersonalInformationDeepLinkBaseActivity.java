package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.hml.HmlETBPersonalInfoActivity;
import p040o.HmlPinActivity;
import p040o.PassportCaptureModule_GetIExtractionServerKtaFactory;
import p040o.getICheckDeserializerRtti;
import p040o.getProperty;
import p040o.onGetStartedClick;

public abstract class HmlPersonalInformationDeepLinkBaseActivity extends HmlBaseDeepLinkActivity implements PassportCaptureModule_GetIExtractionServerKtaFactory {
    @HmlPinActivity
    public getProperty presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        super.ActionMenuPresenter$OverflowMenuButton();
        getProperty getproperty = this.presenter;
        if (getproperty == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getproperty.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
        Intent intent = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent, "intent");
        Bundle extras = intent.getExtras();
        String str = null;
        MediaBrowserCompat$CustomActionResultReceiver.putExtra("intent", getICheckDeserializerRtti.write(extras != null ? extras.getString("utm_content") : null));
        Intent intent2 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent2, "intent");
        Bundle extras2 = intent2.getExtras();
        MediaBrowserCompat$CustomActionResultReceiver.putExtra("utm_campaign", extras2 != null ? extras2.getString("utm_campaign") : null);
        Intent intent3 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent3, "intent");
        Bundle extras3 = intent3.getExtras();
        MediaBrowserCompat$CustomActionResultReceiver.putExtra("utm_content", extras3 != null ? extras3.getString("utm_content") : null);
        Intent intent4 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent4, "intent");
        Bundle extras4 = intent4.getExtras();
        MediaBrowserCompat$CustomActionResultReceiver.putExtra("utm_source", extras4 != null ? extras4.getString("utm_source") : null);
        Intent intent5 = getIntent();
        onGetStartedClick.IconCompatParcelizer((Object) intent5, "intent");
        Bundle extras5 = intent5.getExtras();
        if (extras5 != null) {
            str = extras5.getString("utm_medium");
        }
        MediaBrowserCompat$CustomActionResultReceiver.putExtra("utm_medium", str);
        read(MediaBrowserCompat$CustomActionResultReceiver);
    }

    public void onDestroy() {
        getProperty getproperty = this.presenter;
        if (getproperty == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getproperty.onDestroy();
        super.onDestroy();
    }
}
