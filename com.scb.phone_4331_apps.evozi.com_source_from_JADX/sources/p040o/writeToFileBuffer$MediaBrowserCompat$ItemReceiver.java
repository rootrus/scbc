package p040o;

import java.util.ArrayList;
import java.util.List;

/* renamed from: o.writeToFileBuffer$MediaBrowserCompat$ItemReceiver */
public final class writeToFileBuffer$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<clickManagePin$MediaBrowserCompat$CustomActionResultReceiver>> {
    final /* synthetic */ writeToFileBuffer MediaBrowserCompat$ItemReceiver;

    private writeToFileBuffer$MediaBrowserCompat$ItemReceiver(writeToFileBuffer writetofilebuffer) {
        this.MediaBrowserCompat$ItemReceiver = writetofilebuffer;
    }

    public /* synthetic */ writeToFileBuffer$MediaBrowserCompat$ItemReceiver(writeToFileBuffer writetofilebuffer, byte b) {
        this(writetofilebuffer);
    }

    public final /* synthetic */ void onNext(Object obj) {
        List list = (List) obj;
        List unused = this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = list;
        boolean z = true;
        if (this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) {
            ArrayList arrayList = new ArrayList();
            new show(list).read(new setOutputFilePath(arrayList));
            writeToFileBuffer writetofilebuffer = this.MediaBrowserCompat$ItemReceiver;
            retrieveFileBufferBytes retrievefilebufferbytes = new retrieveFileBufferBytes(arrayList);
            if (writetofilebuffer.RatingCompat == null) {
                z = false;
            }
            if (z) {
                retrievefilebufferbytes.IconCompatParcelizer(writetofilebuffer.RatingCompat);
            }
        }
    }

    public final void onComplete() {
        writeToFileBuffer.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
    }

    public final void onError(Throwable th) {
        boolean z = true;
        if ((this.MediaBrowserCompat$ItemReceiver.RatingCompat != null) && !this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$SearchResultReceiver(th)) {
            writeToFileBuffer.MediaBrowserCompat$SearchResultReceiver(this.MediaBrowserCompat$ItemReceiver);
            writeToFileBuffer writetofilebuffer = this.MediaBrowserCompat$ItemReceiver;
            writeJpegImage writejpegimage = new writeJpegImage(this, th);
            if (writetofilebuffer.RatingCompat == null) {
                z = false;
            }
            if (z) {
                writejpegimage.IconCompatParcelizer(writetofilebuffer.RatingCompat);
            }
        }
    }
}
