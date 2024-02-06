package p040o;

import p040o.setPosY;
import p040o.writeUInt64NoTag;

/* renamed from: o.CaptureExperienceData */
public final /* synthetic */ class CaptureExperienceData implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ toScreenLocation IconCompatParcelizer;

    public /* synthetic */ CaptureExperienceData(toScreenLocation toscreenlocation) {
        this.IconCompatParcelizer = toscreenlocation;
    }

    public final void IconCompatParcelizer(Object obj) {
        setPosY.read.write(this.IconCompatParcelizer, (C1352hA) obj);
    }
}
