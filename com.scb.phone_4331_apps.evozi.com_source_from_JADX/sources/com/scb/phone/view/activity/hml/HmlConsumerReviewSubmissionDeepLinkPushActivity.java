package com.scb.phone.view.activity.hml;

import android.content.Intent;
import com.scb.phone.view.activity.deeplink.HmlBaseDeepLinkActivity;
import com.scb.phone.view.activity.hml.HmlETBReviewActivity;
import com.scb.phone.view.activity.hml.HmlNTBReviewActivity;
import p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory;
import p040o.HmlPinActivity;
import p040o.TabLayout;
import p040o.VisibilityAwareImageButton;
import p040o.onGetStartedClick;
import p040o.setDocumentID;
import p040o.zzct;

public final class HmlConsumerReviewSubmissionDeepLinkPushActivity extends HmlBaseDeepLinkActivity implements CheckCaptureModule_GetICheckDeserializerRttiFactory {
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
            read(HmlETBReviewActivity.read.MediaBrowserCompat$CustomActionResultReceiver(this, VisibilityAwareImageButton.BYID, str));
            return;
        }
        HmlNTBReviewActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBReviewActivity.MediaMetadataCompat;
        read(HmlNTBReviewActivity.IconCompatParcelizer.write(this, VisibilityAwareImageButton.BYID, str));
    }
}
