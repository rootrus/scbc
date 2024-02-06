package com.scb.phone.view.activity.easycash;

import android.content.Intent;
import com.scb.phone.view.activity.deeplink.BaseDeepLinkActivity;
import p040o.C10827Iterators;
import p040o.CameraSource;
import p040o.CrashlyticsBackgroundWorker;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.IPassportDetector;
import p040o.IPassportDetector$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.IPassportDetector$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.readFromParcel;
import p040o.writeUInt64NoTag;

public final class EasycashReferralSendDfwDeepLinkActivity extends BaseDeepLinkActivity implements readFromParcel {
    @HmlPinActivity
    public IPassportDetector presenter;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        IPassportDetector iPassportDetector = this.presenter;
        if (iPassportDetector == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iPassportDetector.MediaBrowserCompat$ItemReceiver(this);
        if (str != null) {
            IPassportDetector iPassportDetector2 = this.presenter;
            if (iPassportDetector2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) str, "productType");
            boolean z = true;
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "HOME") || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) str, (Object) "AUTO")) {
                if (iPassportDetector2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iPassportDetector2.RatingCompat.AlertController$RecycleListView();
                }
                C10827Iterators.C35456 r1 = iPassportDetector2.write;
                FundFactSheetActivity iPassportDetector$MediaBrowserCompat$CustomActionResultReceiver = new IPassportDetector$MediaBrowserCompat$CustomActionResultReceiver(iPassportDetector2);
                FundFactSheetActivity iPassportDetector$MediaBrowserCompat$ItemReceiver = new IPassportDetector$MediaBrowserCompat$ItemReceiver(iPassportDetector2);
                onGetStartedClick.write((Object) iPassportDetector$MediaBrowserCompat$CustomActionResultReceiver, "onSuccess");
                onGetStartedClick.write((Object) iPassportDetector$MediaBrowserCompat$ItemReceiver, "onError");
                onGetStartedClick.write((Object) str, "request");
                r1.MediaBrowserCompat$ItemReceiver(r1.IconCompatParcelizer, iPassportDetector$MediaBrowserCompat$CustomActionResultReceiver, iPassportDetector$MediaBrowserCompat$ItemReceiver, new CameraSource.zzb.read(str), new C10827Iterators.C35456.IconCompatParcelizer(r1, str));
                return;
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IPassportDetector.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
            if (iPassportDetector2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                iconCompatParcelizer.IconCompatParcelizer(iPassportDetector2.RatingCompat);
            }
        }
    }

    public final void IconCompatParcelizer(CrashlyticsBackgroundWorker.C32131 r2) {
        onGetStartedClick.write((Object) r2, "easycashReferralDisplay");
        read(EasycashReferralSendProductActivity.write(this, r2));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Throwable th) {
        onGetStartedClick.write((Object) th, "e");
        mo14215a_(th);
    }

    public final void IconCompatParcelizer() {
        mo14210S_();
    }
}
