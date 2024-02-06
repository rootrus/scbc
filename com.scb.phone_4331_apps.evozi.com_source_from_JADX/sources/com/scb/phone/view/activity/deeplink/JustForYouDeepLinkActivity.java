package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.scb.phone.view.activity.justforyou.C5657x1df7ecb1;
import com.scb.phone.view.activity.justforyou.JustForYouLandingActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.IdExtractActivity;
import p040o.LinkedListMultimap;
import p040o.areEdgesInView;
import p040o.onGetStartedClick;
import p040o.writeUInt64NoTag;
import p040o.zzwi;
import p040o.zzwp;

public final class JustForYouDeepLinkActivity extends BaseDeepLinkActivity implements IdExtractActivity.IconCompatParcelizer {
    @HmlPinActivity
    public areEdgesInView presenter;

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
        zzwp zzwp;
        onGetStartedClick.write((Object) intent, "data");
        areEdgesInView areedgesinview = this.presenter;
        if (areedgesinview == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        areedgesinview.MediaBrowserCompat$ItemReceiver(this);
        areEdgesInView areedgesinview2 = this.presenter;
        if (areedgesinview2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Uri data = intent.getData();
        zzwi write = areedgesinview2.IconCompatParcelizer.read.write();
        if (write == null || (zzwp = write.read) == null) {
            str2 = null;
        } else {
            str2 = zzwp.MediaBrowserCompat$ItemReceiver;
        }
        CharSequence charSequence = str2;
        boolean z = false;
        if (!(charSequence == null || GoodToKnowActivity.read(charSequence))) {
            areedgesinview2.write = Uri.parse(str2).buildUpon();
            areedgesinview2.read = data;
            LinkedListMultimap.MultisetView.C35822.C35831.C35841 r5 = areedgesinview2.MediaBrowserCompat$ItemReceiver;
            areEdgesInView areedgesinview3 = areedgesinview2;
            r5.MediaBrowserCompat$ItemReceiver(new areEdgesInView.IconCompatParcelizer(areedgesinview3), new areEdgesInView.write(areedgesinview3));
            return;
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = areEdgesInView.read.MediaBrowserCompat$CustomActionResultReceiver;
        if (areedgesinview2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            iconCompatParcelizer.IconCompatParcelizer(areedgesinview2.RatingCompat);
        }
    }

    public final void IconCompatParcelizer(Uri uri) {
        onGetStartedClick.write((Object) uri, "uri");
        C5657x1df7ecb1 justForYouLandingActivity$MediaBrowserCompat$CustomActionResultReceiver = JustForYouLandingActivity.MediaMetadataCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) uri, "uri");
        read(new Intent(context, JustForYouLandingActivity.class).putExtra("URI", uri));
    }

    public final void IconCompatParcelizer(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        mo14215a_(th);
    }
}
