package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.ey */
public final /* synthetic */ class C9922ey implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setVersion write;

    public /* synthetic */ C9922ey(setVersion setversion) {
        this.write = setversion;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getBlackStreakCount) obj).read(this.write);
    }
}
