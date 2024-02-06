package com.scb.phone.view.activity.deeplink;

import android.content.Context;
import android.content.Intent;
import com.scb.phone.view.activity.bankingagent.BankingAgentSuccessActivity;
import p040o.CheckCaptureModule_GetExtractionParametersFactory;
import p040o.HmlPinActivity;
import p040o.MoreExecutors;
import p040o.getInfoWindowAnchorU;
import p040o.getJsonObjectFrom;
import p040o.getJsonObjectFrom$MediaBrowserCompat$ItemReceiver;
import p040o.onGetStartedClick;

public final class BankingAgentTransactionsDeepLinkActivity extends BaseDeepLinkActivity implements CheckCaptureModule_GetExtractionParametersFactory.write {
    @HmlPinActivity
    public getJsonObjectFrom presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        getJsonObjectFrom getjsonobjectfrom = this.presenter;
        if (getjsonobjectfrom == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        getjsonobjectfrom.MediaBrowserCompat$ItemReceiver(this);
        getJsonObjectFrom getjsonobjectfrom2 = this.presenter;
        if (getjsonobjectfrom2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (getjsonobjectfrom2.RatingCompat != null) {
            getjsonobjectfrom2.RatingCompat.AlertController$RecycleListView();
        }
        getInfoWindowAnchorU getinfowindowanchoru = getjsonobjectfrom2.write;
        getinfowindowanchoru.read(getinfowindowanchoru.MediaBrowserCompat$CustomActionResultReceiver.write(str), new getJsonObjectFrom$MediaBrowserCompat$ItemReceiver(getjsonobjectfrom2), new getJsonObjectFrom.IconCompatParcelizer(getjsonobjectfrom2));
    }

    public final void read(MoreExecutors.SameThreadExecutorService sameThreadExecutorService) {
        onGetStartedClick.write((Object) sameThreadExecutorService, "display");
        BankingAgentSuccessActivity.read read = BankingAgentSuccessActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) sameThreadExecutorService, "display");
        Intent intent = new Intent(context, BankingAgentSuccessActivity.class);
        intent.putExtra("DISPLAY", sameThreadExecutorService);
        read(intent);
    }

    public final void IconCompatParcelizer(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        mo14215a_(th);
    }
}
