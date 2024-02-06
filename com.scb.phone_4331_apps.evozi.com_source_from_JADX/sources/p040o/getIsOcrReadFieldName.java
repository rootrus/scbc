package p040o;

import p040o.C4897kd;
import p040o.getBlackStreakMaxHeight;
import p040o.writeUInt64NoTag;

/* renamed from: o.getIsOcrReadFieldName */
public final /* synthetic */ class getIsOcrReadFieldName implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ C4897kd.write read;

    public /* synthetic */ getIsOcrReadFieldName(C4897kd.write write) {
        this.read = write;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getBlackStreakMaxHeight.write) obj).read(this.read.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
