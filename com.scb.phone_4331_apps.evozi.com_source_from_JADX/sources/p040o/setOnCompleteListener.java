package p040o;

import android.content.ContentResolver;
import android.net.Uri;
import p040o.writeUInt64NoTag;

/* renamed from: o.setOnCompleteListener */
public final /* synthetic */ class setOnCompleteListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ContentResolver IconCompatParcelizer;
    private final /* synthetic */ byte[] MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ float MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ int MediaDescriptionCompat;
    private final /* synthetic */ C4114bu read;
    private final /* synthetic */ Uri write;

    public /* synthetic */ setOnCompleteListener(C4114bu buVar, ContentResolver contentResolver, byte[] bArr, Uri uri, float f, int i) {
        this.read = buVar;
        this.IconCompatParcelizer = contentResolver;
        this.MediaBrowserCompat$CustomActionResultReceiver = bArr;
        this.write = uri;
        this.MediaBrowserCompat$ItemReceiver = f;
        this.MediaDescriptionCompat = i;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getBackBarcodes) obj).read(this.IconCompatParcelizer, this.MediaBrowserCompat$CustomActionResultReceiver, this.write, this.MediaBrowserCompat$ItemReceiver, C4114bu.MediaBrowserCompat$CustomActionResultReceiver(this.MediaDescriptionCompat, 1));
    }
}
