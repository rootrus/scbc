package p040o;

import p040o.getImageWidth;
import p040o.isProximityOn;
import p040o.writeUInt64NoTag;

/* renamed from: o.addPageDetectionListener */
public final /* synthetic */ class addPageDetectionListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ isAnimationTutorEnable MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ addPageDetectionListener(isAnimationTutorEnable isanimationtutorenable) {
        this.MediaBrowserCompat$CustomActionResultReceiver = isanimationtutorenable;
    }

    public final void IconCompatParcelizer(Object obj) {
        isAnimationTutorEnable isanimationtutorenable = this.MediaBrowserCompat$CustomActionResultReceiver;
        isProximityOn.read read = isProximityOn.read();
        read.MediaBrowserCompat$SearchResultReceiver = false;
        read.IconCompatParcelizer = isanimationtutorenable.read;
        read.write = "M";
        read.IconCompatParcelizer = isanimationtutorenable.read;
        read.MediaBrowserCompat$CustomActionResultReceiver = isanimationtutorenable.read();
        ((getImageWidth.IconCompatParcelizer.C10788IconCompatParcelizer) obj).read(new isProximityOn(read, (byte) 0));
    }
}
