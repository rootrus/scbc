package p040o;

import java.util.List;
import p040o.ImageCapturedListener;
import p040o.writeUInt64NoTag;

/* renamed from: o.ap */
public final /* synthetic */ class C4045ap implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ImageCapturedListener.read IconCompatParcelizer;

    public /* synthetic */ C4045ap(ImageCapturedListener.read read) {
        this.IconCompatParcelizer = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckParameters$CheckCountry$MediaBrowserCompat$ItemReceiver) obj).read(ImageCapturedListener.write((List) ImageCapturedListener.this.write.MediaBrowserCompat$ItemReceiver()));
    }
}
