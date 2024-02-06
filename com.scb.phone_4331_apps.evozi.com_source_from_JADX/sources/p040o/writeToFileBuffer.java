package p040o;

import java.util.List;
import p040o.CheckExtractor_MembersInjector;

/* renamed from: o.writeToFileBuffer */
public class writeToFileBuffer extends writeUInt64NoTag<CheckExtractor_MembersInjector.read> {
    public List<clickManagePin$MediaBrowserCompat$CustomActionResultReceiver> IconCompatParcelizer;
    public List<String> read;
    public final Polyline write;

    @HmlPinActivity
    public writeToFileBuffer(Polyline polyline, RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
        this.write = polyline;
    }

    public void onDestroy() {
        super.onDestroy();
        Polyline polyline = this.write;
        if (!polyline.MediaBrowserCompat$MediaItem.isDisposed()) {
            polyline.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* renamed from: o.writeToFileBuffer$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<String>> {
        private read() {
        }

        public /* synthetic */ read(writeToFileBuffer writetofilebuffer, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            List unused = writeToFileBuffer.this.read = list;
            boolean z = true;
            if (writeToFileBuffer.this.RatingCompat != null) {
                writeToFileBuffer writetofilebuffer = writeToFileBuffer.this;
                releaseImage releaseimage = new releaseImage(list);
                if (writetofilebuffer.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    releaseimage.IconCompatParcelizer(writetofilebuffer.RatingCompat);
                }
            }
        }

        public final void onComplete() {
            writeToFileBuffer.read(writeToFileBuffer.this);
        }

        public final void onError(Throwable th) {
            boolean z = true;
            if ((writeToFileBuffer.this.RatingCompat != null) && !writeToFileBuffer.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                writeToFileBuffer.MediaBrowserCompat$ItemReceiver(writeToFileBuffer.this);
                writeToFileBuffer writetofilebuffer = writeToFileBuffer.this;
                writeImageToFileBuffer writeimagetofilebuffer = new writeImageToFileBuffer(this, th);
                if (writetofilebuffer.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    writeimagetofilebuffer.IconCompatParcelizer(writetofilebuffer.RatingCompat);
                }
            }
        }
    }

    static /* synthetic */ void read(writeToFileBuffer writetofilebuffer) {
        if (writetofilebuffer.RatingCompat != null) {
            writetofilebuffer.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(writeToFileBuffer writetofilebuffer) {
        if (writetofilebuffer.RatingCompat != null) {
            writetofilebuffer.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(writeToFileBuffer writetofilebuffer) {
        if (writetofilebuffer.RatingCompat != null) {
            writetofilebuffer.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(writeToFileBuffer writetofilebuffer) {
        if (writetofilebuffer.RatingCompat != null) {
            writetofilebuffer.RatingCompat.ay_();
        }
    }
}
