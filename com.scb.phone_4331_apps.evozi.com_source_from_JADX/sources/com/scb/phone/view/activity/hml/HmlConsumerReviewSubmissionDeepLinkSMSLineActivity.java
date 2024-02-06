package com.scb.phone.view.activity.hml;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.deeplink.HmlBaseDeepLinkActivity;
import com.scb.phone.view.activity.hml.HmlETBReviewActivity;
import com.scb.phone.view.activity.hml.HmlNTBReviewActivity;
import p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory;
import p040o.HmlPinActivity;
import p040o.TabLayout;
import p040o.VisibilityAwareImageButton;
import p040o.getICheckDeserializerRtti;
import p040o.onGetStartedClick;
import p040o.setDocumentID;
import p040o.zzct;

public final class HmlConsumerReviewSubmissionDeepLinkSMSLineActivity extends HmlBaseDeepLinkActivity implements CheckCaptureModule_GetICheckDeserializerRttiFactory {
    @HmlPinActivity
    public setDocumentID<CheckCaptureModule_GetICheckDeserializerRttiFactory> presenter;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        setDocumentID<CheckCaptureModule_GetICheckDeserializerRttiFactory> setdocumentid = this.presenter;
        if (setdocumentid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        return setdocumentid.IconCompatParcelizer.write.read() == null;
    }

    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        setDocumentID<CheckCaptureModule_GetICheckDeserializerRttiFactory> setdocumentid = this.presenter;
        if (setdocumentid == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setdocumentid.MediaBrowserCompat$ItemReceiver(this);
        setDocumentID<CheckCaptureModule_GetICheckDeserializerRttiFactory> setdocumentid2 = this.presenter;
        if (setdocumentid2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        zzct.zza zza = zzct.zza.CONSUMER;
        onGetStartedClick.write((Object) zza, "type");
        TabLayout tabLayout = setdocumentid2.write;
        onGetStartedClick.write((Object) zza, "type");
        tabLayout.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(zza);
        if (mo14202x50fd9e4a()) {
            HmlETBReviewActivity.read read = HmlETBReviewActivity.MediaMetadataCompat;
            Intent MediaBrowserCompat$CustomActionResultReceiver = HmlETBReviewActivity.read.MediaBrowserCompat$CustomActionResultReceiver(this, VisibilityAwareImageButton.LATEST, str);
            write(MediaBrowserCompat$CustomActionResultReceiver);
            read(MediaBrowserCompat$CustomActionResultReceiver);
            return;
        }
        HmlNTBReviewActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBReviewActivity.MediaMetadataCompat;
        Intent write = HmlNTBReviewActivity.IconCompatParcelizer.write(this, VisibilityAwareImageButton.LATEST, str);
        write(write);
        read(write);
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
}
