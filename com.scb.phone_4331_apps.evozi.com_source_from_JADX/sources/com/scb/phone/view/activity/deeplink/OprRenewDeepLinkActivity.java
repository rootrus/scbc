package com.scb.phone.view.activity.deeplink;

import android.content.Intent;
import com.scb.phone.view.activity.ccrredemption.product.OPRRegistrationLandingActivity;
import com.scb.phone.view.activity.ccrredemption.product.OPRStatusRewardsLandingActivity;
import com.scb.phone.view.activity.deeplink.OprRenewDeepLinkActivity;
import p040o.C7539ug;
import p040o.ComponentContainer;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.Maps;
import p040o.chain;
import p040o.eagerInDefaultApp;
import p040o.getInfoWindowAnchorU;
import p040o.getIssueDate;
import p040o.setFieldNamingStrategy;
import p040o.zztx;

public class OprRenewDeepLinkActivity extends BaseDeepLinkActivity implements getIssueDate {
    @HmlPinActivity
    public getInfoWindowAnchorU deepLinkCase;
    @HmlPinActivity
    public setFieldNamingStrategy presenter;

    /* access modifiers changed from: protected */
    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean mo14202x50fd9e4a() {
        return true;
    }

    public final chain MediaDescriptionCompat() {
        return null;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(Intent intent, String str) {
        AlertController$RecycleListView();
        this.deepLinkCase.read(this.deepLinkCase.MediaBrowserCompat$MediaItem(str), new DebitCardMarketConductDeepLinkActivity() {
            public final void IconCompatParcelizer(Object obj) {
                OprRenewDeepLinkActivity oprRenewDeepLinkActivity = OprRenewDeepLinkActivity.this;
                oprRenewDeepLinkActivity.aj_();
                oprRenewDeepLinkActivity.presenter.MediaBrowserCompat$ItemReceiver(oprRenewDeepLinkActivity);
                oprRenewDeepLinkActivity.presenter.read(Maps.FilteredEntryMap.KeySet.MediaBrowserCompat$ItemReceiver((zztx.zzc) obj));
            }
        }, new C7539ug(this));
    }

    public final void read(ComponentContainer componentContainer) {
        componentContainer.Keep = "Notification";
        read(OPRRegistrationLandingActivity.write(this, componentContainer));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(eagerInDefaultApp eagerindefaultapp) {
        eagerindefaultapp.Keep = 0;
        read(OPRStatusRewardsLandingActivity.write(this, eagerindefaultapp));
    }
}
