package p040o;

/* renamed from: o.HeartBeatInfo$MediaBrowserCompat$ItemReceiver */
public final class HeartBeatInfo$MediaBrowserCompat$ItemReceiver implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ ShapeDataParser MediaBrowserCompat$CustomActionResultReceiver;

    private HeartBeatInfo$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ HeartBeatInfo$MediaBrowserCompat$ItemReceiver(ShapeDataParser shapeDataParser) {
        this.MediaBrowserCompat$CustomActionResultReceiver = shapeDataParser;
    }

    public final boolean write(Object obj) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.read.equals(((zzrt) obj).read);
    }
}
