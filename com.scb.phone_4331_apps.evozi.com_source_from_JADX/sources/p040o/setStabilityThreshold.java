package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setStabilityThreshold */
public final /* synthetic */ class setStabilityThreshold implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ setPosY read;

    public /* synthetic */ setStabilityThreshold(setPosY setposy) {
        this.read = setposy;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((C1352hA) obj).write(this.read.IconCompatParcelizer);
    }
}
