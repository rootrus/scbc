package p040o;

import java.util.List;
import p040o.CrashlyticsReport;
import p040o.StreetViewPanoramaFragment;
import p040o.access$2300;

/* renamed from: o.sA$MediaBrowserCompat$ItemReceiver */
final class sA$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getUserNavigationEnabled> {
    final /* synthetic */ C7425sA IconCompatParcelizer;
    private boolean MediaBrowserCompat$ItemReceiver = false;

    public final /* synthetic */ void onNext(Object obj) {
        getUserNavigationEnabled getusernavigationenabled = (getUserNavigationEnabled) obj;
        C7425sA.MediaMetadataCompat(this.IconCompatParcelizer);
        C7425sA sAVar = this.IconCompatParcelizer;
        StreetViewPanoramaFragment.zza unused = sAVar.MediaBrowserCompat$ItemReceiver = sAVar.MediaBrowserCompat$ItemReceiver;
        boolean z = true;
        if (this.IconCompatParcelizer.RatingCompat != null) {
            if (this.IconCompatParcelizer.MediaDescriptionCompat != null) {
                CrashlyticsReport.Session.Event.Application.Execution write = this.IconCompatParcelizer.write.write(getusernavigationenabled.read, this.IconCompatParcelizer.MediaDescriptionCompat, this.IconCompatParcelizer.read.IconCompatParcelizer.setCheckable());
                if (write != null) {
                    C7425sA sAVar2 = this.IconCompatParcelizer;
                    C7419rq rqVar = new C7419rq(write);
                    if (sAVar2.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        rqVar.IconCompatParcelizer(sAVar2.RatingCompat);
                    }
                } else {
                    this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.biller_not_found, access$2300.write.NAVIGATE_BACK);
                }
            } else {
                getStreetViewPanoramaCamera unused2 = this.IconCompatParcelizer.IconCompatParcelizer = getusernavigationenabled.IconCompatParcelizer;
                if (getusernavigationenabled.read.isEmpty() && this.MediaBrowserCompat$ItemReceiver) {
                    C7425sA sAVar3 = this.IconCompatParcelizer;
                    C7529tu tuVar = C7529tu.write;
                    if (sAVar3.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        tuVar.IconCompatParcelizer(sAVar3.RatingCompat);
                    }
                } else if (!getusernavigationenabled.read.isEmpty() && this.MediaBrowserCompat$ItemReceiver) {
                    C7425sA sAVar4 = this.IconCompatParcelizer;
                    List unused3 = sAVar4.MediaSessionCompat$Token = sAVar4.write.MediaBrowserCompat$ItemReceiver(getusernavigationenabled.read, this.IconCompatParcelizer.read.IconCompatParcelizer.setCheckable());
                    C7425sA sAVar5 = this.IconCompatParcelizer;
                    getLongitude getlongitude = new getLongitude(this);
                    if (sAVar5.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getlongitude.IconCompatParcelizer(sAVar5.RatingCompat);
                    }
                } else if (!getusernavigationenabled.read.isEmpty() && !this.MediaBrowserCompat$ItemReceiver) {
                    C7425sA sAVar6 = this.IconCompatParcelizer;
                    List unused4 = sAVar6.MediaSessionCompat$Token = sAVar6.write.MediaBrowserCompat$ItemReceiver(getusernavigationenabled.read, this.IconCompatParcelizer.read.IconCompatParcelizer.setCheckable());
                    C7425sA sAVar7 = this.IconCompatParcelizer;
                    C7418rp rpVar = new C7418rp(this);
                    if (sAVar7.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        rpVar.IconCompatParcelizer(sAVar7.RatingCompat);
                    }
                }
            }
            boolean unused5 = this.IconCompatParcelizer.MediaMetadataCompat = false;
            C7425sA.read(this.IconCompatParcelizer);
        }
    }

    public sA$MediaBrowserCompat$ItemReceiver(C7425sA sAVar, boolean z) {
        this.IconCompatParcelizer = sAVar;
    }

    public final void onComplete() {
        C7425sA.IconCompatParcelizer(this.IconCompatParcelizer);
    }

    public final void onError(Throwable th) {
        boolean unused = this.IconCompatParcelizer.MediaMetadataCompat = false;
        boolean z = true;
        if ((this.IconCompatParcelizer.RatingCompat != null) && !this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(th)) {
            C7425sA.MediaBrowserCompat$MediaItem(this.IconCompatParcelizer);
            C7425sA sAVar = this.IconCompatParcelizer;
            C7446sX sXVar = C7446sX.read;
            if (sAVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                sXVar.IconCompatParcelizer(sAVar.RatingCompat);
            }
        }
    }
}
