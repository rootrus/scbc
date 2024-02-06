package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.remittance.RemittanceLandingActivity;
import p040o.AbstractBiMap;
import p040o.C3088x7e3e3ebd;
import p040o.C3092xce3d994b;
import p040o.C4831x9c0e34e3;
import p040o.HmlPinActivity;
import p040o.IdExtractor_MembersInjector;
import p040o.ZSYR2K;
import p040o.isTargetRectangleBottomEdgeFilled;
import p040o.isTargetRectangleFilled;
import p040o.isTargetRectangleFilled$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;

public final class RemittanceRetryDeepLinkActivity extends BaseDeepLinkActivity implements IdExtractor_MembersInjector {
    @HmlPinActivity
    public isTargetRectangleFilled presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void ActionMenuPresenter$OverflowMenuButton() {
        super.ActionMenuPresenter$OverflowMenuButton();
        isTargetRectangleFilled istargetrectanglefilled = this.presenter;
        if (istargetrectanglefilled == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        istargetrectanglefilled.MediaBrowserCompat$ItemReceiver(this);
        if (getIntent().getBooleanExtra("NOTIFICATION_INBOX_TAG", false)) {
            this.scbAnalytics.write("inbox_noti", new ZSYR2K("feature", "remittance_retry"));
        }
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        if (str != null) {
            isTargetRectangleFilled istargetrectanglefilled = this.presenter;
            if (istargetrectanglefilled == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) str, "deepLinkId");
            if (istargetrectanglefilled.RatingCompat != null) {
                istargetrectanglefilled.RatingCompat.AlertController$RecycleListView();
            }
            AbstractBiMap.KeySet keySet = istargetrectanglefilled.MediaBrowserCompat$ItemReceiver;
            onGetStartedClick.write((Object) str, Name.MARK);
            isTargetRectangleFilled istargetrectanglefilled2 = istargetrectanglefilled;
            keySet.read(keySet.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(str), new isTargetRectangleBottomEdgeFilled(new isTargetRectangleFilled$MediaBrowserCompat$ItemReceiver(istargetrectanglefilled2)), new isTargetRectangleBottomEdgeFilled(new C4831x9c0e34e3(istargetrectanglefilled2)));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(C3088x7e3e3ebd.C30891 r3) {
        onGetStartedClick.write((Object) r3, "display");
        RemittanceLandingActivity.IconCompatParcelizer iconCompatParcelizer = RemittanceLandingActivity.MediaDescriptionCompat;
        read(RemittanceLandingActivity.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(this, C3092xce3d994b.Builder.RETRY, r3));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        mo14215a_(th);
    }
}
