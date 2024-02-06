package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getRotateMessage */
public final /* synthetic */ class getRotateMessage implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String read;
    private final /* synthetic */ setGuidanceFrameColor write;

    public /* synthetic */ getRotateMessage(setGuidanceFrameColor setguidanceframecolor, String str) {
        this.write = setguidanceframecolor;
        this.read = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        setGuidanceFrameColor setguidanceframecolor = this.write;
        ((getImageWidth) obj).MediaBrowserCompat$CustomActionResultReceiver(setguidanceframecolor.read.get(this.read).booleanValue());
    }
}
