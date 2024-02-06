package p040o;

import p040o.Image;
import p040o.access$2300;
import p040o.writeUInt64NoTag;

/* renamed from: o.getBottomRight */
public final /* synthetic */ class getBottomRight implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ Image.C34591.read IconCompatParcelizer;
    private final /* synthetic */ Throwable write;

    public /* synthetic */ getBottomRight(Image.C34591.read read, Throwable th) {
        this.IconCompatParcelizer = read;
        this.write = th;
    }

    public final void IconCompatParcelizer(Object obj) {
        Image.C34591.read read = this.IconCompatParcelizer;
        ((C6393xc7fe0382) obj).read(Image.C34591.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(this.write, access$2300.write.JUST_DISMISS));
    }
}
