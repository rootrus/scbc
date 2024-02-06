package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getDsValueInt */
public final /* synthetic */ class getDsValueInt implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ access$2200 write;

    public /* synthetic */ getDsValueInt(access$2200 access_2200) {
        this.write = access_2200;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getAverageSpotNoiseGroupingsPerSquareInch) obj).write(this.write.IconCompatParcelizer);
    }
}
