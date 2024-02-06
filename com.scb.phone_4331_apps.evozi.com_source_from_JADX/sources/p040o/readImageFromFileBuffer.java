package p040o;

import p040o.access$2300;

/* renamed from: o.readImageFromFileBuffer */
public class readImageFromFileBuffer extends writeUInt64NoTag<newCheckExtractor$MediaBrowserCompat$ItemReceiver> {
    /* access modifiers changed from: private */
    public final FakeTimeLimiter IconCompatParcelizer;
    public final PolygonOptions write;

    @HmlPinActivity
    public readImageFromFileBuffer(RegularImmutableBiMap regularImmutableBiMap, PolygonOptions polygonOptions, FakeTimeLimiter fakeTimeLimiter) {
        super(regularImmutableBiMap);
        this.write = polygonOptions;
        this.IconCompatParcelizer = fakeTimeLimiter;
    }

    /* renamed from: o.readImageFromFileBuffer$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zoomByWithFocus> {
        private final setUuidFromUtf8Bytes read;

        public final /* synthetic */ void onNext(Object obj) {
            readImageFromFileBuffer.read(readImageFromFileBuffer.this);
            getUuidUtf8Bytes write = readImageFromFileBuffer.this.IconCompatParcelizer.write((zoomByWithFocus) obj, this.read);
            readImageFromFileBuffer readimagefromfilebuffer = readImageFromFileBuffer.this;
            createBitmap createbitmap = new createBitmap(write);
            if (readimagefromfilebuffer.RatingCompat != null) {
                createbitmap.IconCompatParcelizer(readimagefromfilebuffer.RatingCompat);
            }
        }

        public read(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
            this.read = setuuidfromutf8bytes;
        }

        public final void onError(Throwable th) {
            readImageFromFileBuffer.this.MediaBrowserCompat$ItemReceiver(readImageFromFileBuffer.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }
    }

    static /* synthetic */ void read(readImageFromFileBuffer readimagefromfilebuffer) {
        if (readimagefromfilebuffer.RatingCompat != null) {
            readimagefromfilebuffer.RatingCompat.aj_();
        }
    }
}
