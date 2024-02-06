package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.SurfaceChangedEvent */
public final /* synthetic */ class SurfaceChangedEvent implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFileSHA write;

    public /* synthetic */ SurfaceChangedEvent(getFileSHA getfilesha) {
        this.write = getfilesha;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C7535ub) obj).IconCompatParcelizer(this.write);
    }
}
