package com.scb.phone.view.activity.deeplink;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import java.util.Set;
import p040o.C4583x2cd0b42e;
import p040o.C7510tT;
import p040o.GoodToKnowActivity;
import p040o.HmlNTBEkycVerifyIdentifyBranchActivity;
import p040o.HmlPinActivity;
import p040o.getHorizontalMovementGuidance;
import p040o.getHorizontalMovementGuidance$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;
import p040o.zzwi;
import p040o.zzwp;

public final class JustForYouEntryPointDeepLinkActivity extends BaseDeepLinkActivity implements C7510tT {
    @HmlPinActivity
    public getHorizontalMovementGuidance presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$Token() {
        return 1;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        String str2;
        Set<String> set;
        zzwp zzwp;
        onGetStartedClick.write((Object) intent, "data");
        getHorizontalMovementGuidance gethorizontalmovementguidance = this.presenter;
        if (gethorizontalmovementguidance == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        gethorizontalmovementguidance.MediaBrowserCompat$ItemReceiver(this);
        getHorizontalMovementGuidance gethorizontalmovementguidance2 = this.presenter;
        if (gethorizontalmovementguidance2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Uri data = intent.getData();
        zzwi write = gethorizontalmovementguidance2.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write();
        if (write == null || (zzwp = write.read) == null) {
            str2 = null;
        } else {
            str2 = zzwp.write;
        }
        CharSequence charSequence = str2;
        boolean z = false;
        if (!(charSequence == null || GoodToKnowActivity.read(charSequence))) {
            Uri.Builder buildUpon = Uri.parse(str2).buildUpon();
            if (data == null || (set = data.getQueryParameterNames()) == null) {
                set = HmlNTBEkycVerifyIdentifyBranchActivity.MediaBrowserCompat$CustomActionResultReceiver;
            }
            for (String str3 : set) {
                buildUpon.appendQueryParameter(str3, data != null ? data.getQueryParameter(str3) : null);
            }
            writeUInt64NoTag.IconCompatParcelizer gethorizontalmovementguidance_mediabrowsercompat_customactionresultreceiver = new C4583x2cd0b42e(buildUpon);
            if (gethorizontalmovementguidance2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                gethorizontalmovementguidance_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(gethorizontalmovementguidance2.RatingCompat);
                return;
            }
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = getHorizontalMovementGuidance$MediaBrowserCompat$ItemReceiver.IconCompatParcelizer;
        if (gethorizontalmovementguidance2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(gethorizontalmovementguidance2.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(Uri uri) {
        onGetStartedClick.write((Object) uri, "uri");
        try {
            read(new Intent("android.intent.action.VIEW", uri));
        } catch (ActivityNotFoundException e) {
            mo14215a_(e);
        }
    }

    public final void write(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        mo14215a_(th);
    }
}
