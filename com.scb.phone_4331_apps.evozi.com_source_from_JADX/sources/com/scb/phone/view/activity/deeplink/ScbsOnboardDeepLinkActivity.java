package com.scb.phone.view.activity.deeplink;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import com.scb.phone.view.activity.investment.scbs.ScbsLandingActivity;
import p040o.BoundaryType;
import p040o.BoundaryType$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.IdParameters;
import p040o.Lists;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;

public final class ScbsOnboardDeepLinkActivity extends BaseDeepLinkActivity implements IdParameters.IdSide {
    @HmlPinActivity
    public BoundaryType presenter;

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
        onGetStartedClick.write((Object) intent, "data");
        BoundaryType boundaryType = this.presenter;
        if (boundaryType == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        boundaryType.MediaBrowserCompat$ItemReceiver(this);
        BoundaryType boundaryType2 = this.presenter;
        if (boundaryType2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (boundaryType2.RatingCompat != null) {
            boundaryType2.RatingCompat.AlertController$RecycleListView();
        }
        Lists.TransformingSequentialList transformingSequentialList = boundaryType2.write;
        FundFactSheetActivity boundaryType$MediaBrowserCompat$CustomActionResultReceiver = new BoundaryType$MediaBrowserCompat$CustomActionResultReceiver(boundaryType2);
        FundFactSheetActivity write = new BoundaryType.write(boundaryType2);
        onGetStartedClick.write((Object) boundaryType$MediaBrowserCompat$CustomActionResultReceiver, "onSuccess");
        onGetStartedClick.write((Object) write, "onError");
        transformingSequentialList.IconCompatParcelizer(transformingSequentialList.MediaBrowserCompat$CustomActionResultReceiver, boundaryType$MediaBrowserCompat$CustomActionResultReceiver, write, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver());
    }

    public final void write(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        mo14215a_(th);
    }

    public final void IconCompatParcelizer(String str) {
        try {
            read(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (ActivityNotFoundException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
            mo14210S_();
        } catch (NullPointerException e2) {
            onCheckBoxClick.IconCompatParcelizer(e2);
            mo14210S_();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        read(ScbsLandingActivity.read(this));
    }
}
