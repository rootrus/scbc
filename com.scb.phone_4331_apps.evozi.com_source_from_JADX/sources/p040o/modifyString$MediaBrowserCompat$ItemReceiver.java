package p040o;

/* renamed from: o.modifyString$MediaBrowserCompat$ItemReceiver */
public final class modifyString$MediaBrowserCompat$ItemReceiver implements getAllowReturnTransitionOverlap {
    private final /* synthetic */ ShapePathParser read;

    private modifyString$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ modifyString$MediaBrowserCompat$ItemReceiver(ShapePathParser shapePathParser) {
        this.read = shapePathParser;
    }

    public final boolean write(Object obj) {
        ShapePathParser shapePathParser = this.read;
        return shapePathParser.read != null && shapePathParser.read.equals(((zzrt) obj).read);
    }
}
