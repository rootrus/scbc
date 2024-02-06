package p040o;

import p040o.LogFileManager;
import p040o.Synchronized;
import p040o.access$2300;

/* renamed from: o.rH */
public class C5192rH extends writeUInt64NoTag<getSpotNoise> {
    public LogFileManager.DirectoryProvider IconCompatParcelizer;
    public final AppMeasurementSdk read;
    public final Synchronized.SynchronizedAsMapEntries.C38351.C38361 write;

    @HmlPinActivity
    public C5192rH(AppMeasurementSdk appMeasurementSdk, Synchronized.SynchronizedAsMapEntries.C38351.C38361 r2, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.write = r2;
        this.read = appMeasurementSdk;
    }

    /* renamed from: o.rH$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<String> {
        private setLogFile MediaBrowserCompat$ItemReceiver;

        public final /* synthetic */ void onNext(Object obj) {
            String str = (String) obj;
            C5192rH.MediaBrowserCompat$CustomActionResultReceiver(C5192rH.this);
            boolean z = true;
            if (C5192rH.this.RatingCompat != null) {
                C5192rH.this.read.write.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver);
                C5192rH.this.read.write.IconCompatParcelizer(str);
                C5192rH.this.read.write.IconCompatParcelizer(false);
                C5192rH rHVar = C5192rH.this;
                setGalleryButtonEnabled setgallerybuttonenabled = new setGalleryButtonEnabled(this);
                if (rHVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    setgallerybuttonenabled.IconCompatParcelizer(rHVar.RatingCompat);
                }
            }
        }

        public write(setLogFile setlogfile) {
            this.MediaBrowserCompat$ItemReceiver = setlogfile;
        }

        public final void onComplete() {
            C5192rH.write(C5192rH.this);
        }

        public final void onError(Throwable th) {
            C5192rH.read(C5192rH.this);
            boolean z = false;
            if (C5192rH.this.RatingCompat != null) {
                C5192rH.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS);
                C5192rH.this.read.write.MediaBrowserCompat$ItemReceiver("");
                C5192rH.this.read.write.IconCompatParcelizer("");
                C5192rH.this.read.write.IconCompatParcelizer(true);
                C5192rH rHVar = C5192rH.this;
                C5416so soVar = new C5416so(this);
                if (rHVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    soVar.IconCompatParcelizer(rHVar.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void write(C5192rH rHVar) {
        if (rHVar.RatingCompat != null) {
            rHVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void read(C5192rH rHVar) {
        if (rHVar.RatingCompat != null) {
            rHVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C5192rH rHVar) {
        if (rHVar.RatingCompat != null) {
            rHVar.RatingCompat.aj_();
        }
    }
}
