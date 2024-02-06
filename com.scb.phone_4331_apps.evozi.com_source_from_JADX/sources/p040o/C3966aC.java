package p040o;

import p040o.access$2300;
import p040o.getCropTetragon;
import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.aC */
public final /* synthetic */ class C3966aC implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getCropTetragon.read MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Throwable MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ C3966aC(getCropTetragon.read read, Throwable th) {
        this.MediaBrowserCompat$CustomActionResultReceiver = read;
        this.MediaBrowserCompat$ItemReceiver = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        getCropTetragon.read read = this.MediaBrowserCompat$CustomActionResultReceiver;
        ((getMicrAmount.RatingCompat) obj).read(getCropTetragon.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver, access$2300.write.JUST_DISMISS).IconCompatParcelizer);
    }
}
