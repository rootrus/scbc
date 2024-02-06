package p040o;

import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.enableTracking */
public final /* synthetic */ class enableTracking implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ KotlinDetector$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer;
    private final /* synthetic */ Throwable read;

    public /* synthetic */ enableTracking(KotlinDetector$MediaBrowserCompat$CustomActionResultReceiver kotlinDetector$MediaBrowserCompat$CustomActionResultReceiver, Throwable th) {
        this.IconCompatParcelizer = kotlinDetector$MediaBrowserCompat$CustomActionResultReceiver;
        this.read = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        KotlinDetector$MediaBrowserCompat$CustomActionResultReceiver kotlinDetector$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer;
        ((getAddress5) obj).write(kotlinDetector$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.read, access$2300.write.JUST_DISMISS));
    }
}
