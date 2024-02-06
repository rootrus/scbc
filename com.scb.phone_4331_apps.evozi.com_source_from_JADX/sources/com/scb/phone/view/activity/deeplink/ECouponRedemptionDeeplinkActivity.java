package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.ccrredemption.ecoupon.MyECouponActivity;
import com.scb.phone.view.activity.ccrredemption.ecoupon.MyECouponActivity$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.Component;
import p040o.FieldNamingPolicy;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.IdExtractActivity_MembersInjector;
import p040o.onGetStartedClick;
import p040o.partitionImpl;
import p040o.setEnabledProtocols;

public final class ECouponRedemptionDeeplinkActivity extends BaseDeepLinkActivity implements IdExtractActivity_MembersInjector {
    @HmlPinActivity
    public FieldNamingPolicy.C33485 presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        onGetStartedClick.write((Object) intent, "data");
        if (str != null) {
            FieldNamingPolicy.C33485 r10 = this.presenter;
            if (r10 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            onGetStartedClick.write((Object) str, "deepLinkId");
            if (r10.RatingCompat != null) {
                r10.RatingCompat.AlertController$RecycleListView();
            }
            partitionImpl partitionimpl = r10.write;
            FundFactSheetActivity read = new FieldNamingPolicy.C33485.read(r10);
            FundFactSheetActivity write = new FieldNamingPolicy.C33485.write(r10);
            onGetStartedClick.write((Object) str, "deepLinkId");
            onGetStartedClick.write((Object) read, "onSuccess");
            onGetStartedClick.write((Object) write, "onError");
            partitionimpl.MediaMetadataCompat.read(read, write, new setEnabledProtocols.read(str), new partitionImpl.read(partitionimpl), partitionimpl.MediaBrowserCompat$ItemReceiver);
            return;
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        FieldNamingPolicy.C33485 r2 = this.presenter;
        if (r2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        r2.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void write(Throwable th) {
        onGetStartedClick.write((Object) th, "throwable");
        mo14215a_(th);
    }

    public final void write(Component.Builder builder) {
        onGetStartedClick.write((Object) builder, "display");
        MyECouponActivity$MediaBrowserCompat$CustomActionResultReceiver myECouponActivity$MediaBrowserCompat$CustomActionResultReceiver = MyECouponActivity.MediaBrowserCompat$SearchResultReceiver;
        read(MyECouponActivity$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(this, builder.MediaBrowserCompat$CustomActionResultReceiver, true));
    }
}
