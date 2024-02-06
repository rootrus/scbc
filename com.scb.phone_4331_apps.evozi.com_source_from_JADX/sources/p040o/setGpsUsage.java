package p040o;

import p040o.access$2300;
import p040o.injectRttiCheckDeserializer;

/* renamed from: o.setGpsUsage */
public class setGpsUsage extends writeUInt64NoTag<injectRttiCheckDeserializer.IconCompatParcelizer> {
    public final geodesic IconCompatParcelizer;

    @HmlPinActivity
    public setGpsUsage(geodesic geodesic, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = geodesic;
    }

    /* renamed from: o.setGpsUsage$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<setListLayout> {
        private write() {
        }

        public /* synthetic */ write(setGpsUsage setgpsusage, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            setGpsUsage.IconCompatParcelizer(setGpsUsage.this);
            boolean z = true;
            if ("0".equals(((setListLayout) obj).MediaBrowserCompat$CustomActionResultReceiver)) {
                setGpsUsage setgpsusage = setGpsUsage.this;
                setCameraDelegate setcameradelegate = setCameraDelegate.IconCompatParcelizer;
                if (setgpsusage.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    setcameradelegate.IconCompatParcelizer(setgpsusage.RatingCompat);
                    return;
                }
                return;
            }
            setGpsUsage setgpsusage2 = setGpsUsage.this;
            getUseVideoFrame getusevideoframe = getUseVideoFrame.MediaBrowserCompat$CustomActionResultReceiver;
            if (setgpsusage2.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getusevideoframe.IconCompatParcelizer(setgpsusage2.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            setGpsUsage.MediaBrowserCompat$CustomActionResultReceiver(setGpsUsage.this);
            setGpsUsage.this.MediaBrowserCompat$ItemReceiver(setGpsUsage.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(setGpsUsage setgpsusage) {
        if (setgpsusage.RatingCompat != null) {
            setgpsusage.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(setGpsUsage setgpsusage) {
        if (setgpsusage.RatingCompat != null) {
            setgpsusage.RatingCompat.aj_();
        }
    }
}
