package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ComponentsInitAndBusRegister */
public final /* synthetic */ class ComponentsInitAndBusRegister implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ VideoPlayerCameraSourceType MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ ComponentsInitAndBusRegister(VideoPlayerCameraSourceType videoPlayerCameraSourceType) {
        this.MediaBrowserCompat$CustomActionResultReceiver = videoPlayerCameraSourceType;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getBlackStreakMaxHeight) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver.read.IconCompatParcelizer);
    }
}
