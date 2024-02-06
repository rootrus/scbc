package p040o;

import java.util.List;
import p040o.zzca;

/* renamed from: o.writePngImage$MediaBrowserCompat$CustomActionResultReceiver */
final class writePngImage$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<zzca.zzd.zza>> {
    boolean read;
    final /* synthetic */ writePngImage write;

    public final /* synthetic */ void onNext(Object obj) {
        List list = (List) obj;
        boolean z = true;
        if (this.write.RatingCompat != null) {
            writePngImage.read(this.write);
            writePngImage writepngimage = this.write;
            nativeWriteTiffImage nativewritetiffimage = new nativeWriteTiffImage(this, list);
            if (writepngimage.RatingCompat == null) {
                z = false;
            }
            if (z) {
                nativewritetiffimage.IconCompatParcelizer(writepngimage.RatingCompat);
            }
        }
    }

    writePngImage$MediaBrowserCompat$CustomActionResultReceiver(writePngImage writepngimage, boolean z) {
        this.write = writepngimage;
        this.read = z;
    }

    public final void onComplete() {
        writePngImage.IconCompatParcelizer(this.write);
    }

    public final void onError(Throwable th) {
        boolean z = true;
        if ((this.write.RatingCompat != null) && !this.write.MediaBrowserCompat$SearchResultReceiver(th)) {
            writePngImage.MediaBrowserCompat$CustomActionResultReceiver(this.write);
            writePngImage writepngimage = this.write;
            readImageFile readimagefile = new readImageFile(this, th);
            if (writepngimage.RatingCompat == null) {
                z = false;
            }
            if (z) {
                readimagefile.IconCompatParcelizer(writepngimage.RatingCompat);
            }
        }
    }
}
