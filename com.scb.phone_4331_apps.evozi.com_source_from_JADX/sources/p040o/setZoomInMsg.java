package p040o;

import android.net.Uri;
import p040o.AutoValue_CrashlyticsReport_Session_User;
import p040o.access$2300;

/* renamed from: o.setZoomInMsg */
public class setZoomInMsg extends writeUInt64NoTag<CheckParameters_MembersInjector$MediaBrowserCompat$MediaItem> {
    public AutoValue_CrashlyticsReport_Session_User IconCompatParcelizer;
    public CrashlyticsReport MediaBrowserCompat$ItemReceiver;
    public toIntArray MediaMetadataCompat;
    public AutoValue_CrashlyticsReport_Session_User.Builder read;
    public pattern write;

    @HmlPinActivity
    public setZoomInMsg(toIntArray tointarray, pattern pattern, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.MediaMetadataCompat = tointarray;
        this.write = pattern;
    }

    public void onDestroy() {
        super.onDestroy();
        pattern pattern = this.write;
        if (!pattern.MediaBrowserCompat$MediaItem.isDisposed()) {
            pattern.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* renamed from: o.setZoomInMsg$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Uri> {
        private read() {
        }

        public /* synthetic */ read(setZoomInMsg setzoominmsg, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            setZoomInMsg setzoominmsg = setZoomInMsg.this;
            C4730hN hNVar = new C4730hN((Uri) obj);
            if (setzoominmsg.RatingCompat != null) {
                hNVar.IconCompatParcelizer(setzoominmsg.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            if (setZoomInMsg.this.RatingCompat != null) {
                setZoomInMsg.this.MediaBrowserCompat$ItemReceiver(setZoomInMsg.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(setZoomInMsg setzoominmsg) {
        if (setzoominmsg.RatingCompat != null) {
            setzoominmsg.RatingCompat.aj_();
        }
    }
}
