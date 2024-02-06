package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getNv21 */
public final /* synthetic */ class getNv21 implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getPosX read;

    public /* synthetic */ getNv21(getPosX getposx) {
        this.read = getposx;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((RttiJsonPassport) obj).MediaMetadataCompat(this.read.IconCompatParcelizer);
    }
}
