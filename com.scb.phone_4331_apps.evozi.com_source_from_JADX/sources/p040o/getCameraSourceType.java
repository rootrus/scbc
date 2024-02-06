package p040o;

import android.content.ContentResolver;
import android.media.Image;
import android.net.Uri;
import p040o.writeUInt64NoTag;

/* renamed from: o.getCameraSourceType */
public final /* synthetic */ class getCameraSourceType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4114bu IconCompatParcelizer;
    private final /* synthetic */ ContentResolver MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Uri MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ int MediaDescriptionCompat;
    private final /* synthetic */ Image read;
    private final /* synthetic */ float write;

    public /* synthetic */ getCameraSourceType(C4114bu buVar, ContentResolver contentResolver, Image image, Uri uri, float f, int i) {
        this.IconCompatParcelizer = buVar;
        this.MediaBrowserCompat$CustomActionResultReceiver = contentResolver;
        this.read = image;
        this.MediaBrowserCompat$ItemReceiver = uri;
        this.write = f;
        this.MediaDescriptionCompat = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getBackBarcodes) obj).MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.read, this.MediaBrowserCompat$ItemReceiver, this.write, C4114bu.MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat, 2));
    }
}
