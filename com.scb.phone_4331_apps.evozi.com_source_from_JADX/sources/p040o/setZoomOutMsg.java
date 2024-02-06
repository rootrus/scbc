package p040o;

import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;
import p040o.CheckParameters_MembersInjector;
import p040o.Synchronized;

/* renamed from: o.setZoomOutMsg */
public class setZoomOutMsg extends writeUInt64NoTag<CheckParameters_MembersInjector.read> {
    final Ints IconCompatParcelizer;
    public AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991 MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public final Synchronized.SynchronizedAsMapValues.C38371 MediaBrowserCompat$SearchResultReceiver;
    public final SquareCap read;
    public AutoValue_CrashlyticsReport_Session_OperatingSystem.Builder write;

    @HmlPinActivity
    public setZoomOutMsg(SquareCap squareCap, Synchronized.SynchronizedAsMapValues.C38371 r2, Ints ints, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.read = squareCap;
        this.MediaBrowserCompat$SearchResultReceiver = r2;
        this.IconCompatParcelizer = ints;
    }

    static /* synthetic */ void write(setZoomOutMsg setzoomoutmsg) {
        if (setzoomoutmsg.RatingCompat != null) {
            setzoomoutmsg.RatingCompat.aj_();
        }
    }
}
