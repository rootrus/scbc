package com.scb.phone.view.activity.deeplink;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import p040o.HmlPinActivity;
import p040o.ICheckExtractionServer;
import p040o.getDiskUsed;
import p040o.getEventAppSize;
import p040o.onGetStartedClick;

public final class DataPrivacyManagementDeepLinkActivity extends BaseDeepLinkActivity implements ICheckExtractionServer {
    @HmlPinActivity
    public getEventAppSize moreOptionsPresenter;

    public final void MediaBrowserCompat$CustomActionResultReceiver(getDiskUsed getdiskused) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    public final void read(String str) {
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        getEventAppSize geteventappsize = this.moreOptionsPresenter;
        if (geteventappsize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("moreOptionsPresenter");
        }
        geteventappsize.MediaBrowserCompat$ItemReceiver(this);
        getEventAppSize geteventappsize2 = this.moreOptionsPresenter;
        if (geteventappsize2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("moreOptionsPresenter");
        }
        geteventappsize2.write();
    }

    public final void write(String str) {
        try {
            read(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException unused) {
            mo14210S_();
        } catch (NullPointerException unused2) {
            mo14210S_();
        }
    }
}
