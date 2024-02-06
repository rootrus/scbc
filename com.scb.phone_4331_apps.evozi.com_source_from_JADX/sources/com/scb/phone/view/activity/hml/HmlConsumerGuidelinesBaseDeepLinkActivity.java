package com.scb.phone.view.activity.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.deeplink.HmlBaseDeepLinkActivity;
import com.scb.phone.view.activity.hml.HmlNTBDocumentUploadGuidelineActivity;
import p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory;
import p040o.HmlPinActivity;
import p040o.TabLayout;
import p040o.VisibilityAwareImageButton;
import p040o.getICheckDeserializerRtti;
import p040o.onGetStartedClick;
import p040o.setDocumentID;
import p040o.zzct;

public abstract class HmlConsumerGuidelinesBaseDeepLinkActivity extends HmlBaseDeepLinkActivity implements CheckCaptureModule_GetICheckDeserializerRttiFactory {
    @HmlPinActivity
    public setDocumentID<CheckCaptureModule_GetICheckDeserializerRttiFactory> presenter;

    public abstract VisibilityAwareImageButton MediaSessionCompat$ResultReceiverWrapper();

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
            C5604xec6fa9b8 hmlDocumentUploadGuidelineActivity$MediaBrowserCompat$ItemReceiver = HmlDocumentUploadGuidelineActivity.MediaMetadataCompat;
            Context context = this;
            VisibilityAwareImageButton MediaSessionCompat$ResultReceiverWrapper = MediaSessionCompat$ResultReceiverWrapper();
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) MediaSessionCompat$ResultReceiverWrapper, "type");
            Intent putExtra = new Intent(context, HmlDocumentUploadGuidelineActivity.class).putExtra("EXTRA_TYPE", MediaSessionCompat$ResultReceiverWrapper.ordinal());
            onGetStartedClick.IconCompatParcelizer((Object) putExtra, "putExtra(key, value?.ordinal ?: -1)");
            Intent putExtra2 = putExtra.putExtra("SHOW_BACK_POP_UP", false).putExtra("DEEPLINK_ID", str);
            onGetStartedClick.IconCompatParcelizer((Object) putExtra2, "Intent(context, HmlDocum…_DEEPLINK_ID, deepLinkId)");
            write(putExtra2);
            read(putExtra2);
            return;
        }
        HmlNTBDocumentUploadGuidelineActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBDocumentUploadGuidelineActivity.MediaBrowserCompat$MediaItem;
        Context context2 = this;
        VisibilityAwareImageButton MediaSessionCompat$ResultReceiverWrapper2 = MediaSessionCompat$ResultReceiverWrapper();
        onGetStartedClick.write((Object) context2, "context");
        onGetStartedClick.write((Object) MediaSessionCompat$ResultReceiverWrapper2, "type");
        Intent putExtra3 = new Intent(context2, HmlNTBDocumentUploadGuidelineActivity.class).putExtra("EXTRA_TYPE", MediaSessionCompat$ResultReceiverWrapper2.ordinal());
        onGetStartedClick.IconCompatParcelizer((Object) putExtra3, "putExtra(key, value?.ordinal ?: -1)");
        Intent putExtra4 = putExtra3.putExtra("SHOW_BACK_POP_UP", false).putExtra("DEEPLINK_ID", str);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra4, "Intent(context, HmlNTBDo…_DEEPLINK_ID, deepLinkId)");
        write(putExtra4);
        read(putExtra4);
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
