package p040o;

/* renamed from: o.shouldSendGlobalHeartBeat$MediaBrowserCompat$ItemReceiver */
public final class shouldSendGlobalHeartBeat$MediaBrowserCompat$ItemReceiver implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ RectangleShapeParser read;

    private shouldSendGlobalHeartBeat$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ shouldSendGlobalHeartBeat$MediaBrowserCompat$ItemReceiver(RectangleShapeParser rectangleShapeParser) {
        this.read = rectangleShapeParser;
    }

    public final boolean write(Object obj) {
        RectangleShapeParser rectangleShapeParser = this.read;
        return rectangleShapeParser.read != null && rectangleShapeParser.read.equals(((zzrt) obj).read);
    }
}
