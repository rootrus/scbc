package p040o;

import p040o.CheckParameters_MembersInjector;
import p040o.access$2300;

/* renamed from: o.showRect */
public class showRect extends setListener<CheckParameters_MembersInjector.write> {
    public pattern write;

    @HmlPinActivity
    public showRect(pattern pattern, startCap startcap, StreetViewPanoramaCamera streetViewPanoramaCamera, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap, startcap, streetViewPanoramaCamera);
        this.write = pattern;
    }

    /* renamed from: o.showRect$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        AutoValue_CrashlyticsReport_Session_User MediaBrowserCompat$CustomActionResultReceiver;

        public final void onComplete() {
        }

        public write(AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User) {
            this.MediaBrowserCompat$CustomActionResultReceiver = autoValue_CrashlyticsReport_Session_User;
        }

        public final void onError(Throwable th) {
            showRect.this.MediaBrowserCompat$ItemReceiver(showRect.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final /* synthetic */ void onNext(Object obj) {
            boolean z = true;
            if (showRect.this.RatingCompat != null) {
                showRect showrect = showRect.this;
                onOrientationChanged onorientationchanged = new onOrientationChanged(this);
                if (showrect.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    onorientationchanged.IconCompatParcelizer(showrect.RatingCompat);
                }
                showRect.MediaBrowserCompat$CustomActionResultReceiver(showRect.this);
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(showRect showrect) {
        if (showrect.RatingCompat != null) {
            showrect.RatingCompat.aj_();
        }
    }
}
