package p040o;

import java.util.List;
import p040o.writeUInt64NoTag;

/* renamed from: o.useVideoPlayerCameraSourceProvider */
public final /* synthetic */ class useVideoPlayerCameraSourceProvider implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ List read;

    public /* synthetic */ useVideoPlayerCameraSourceProvider(String str, List list) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.read = list;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getBackImage) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver, this.read);
    }
}
