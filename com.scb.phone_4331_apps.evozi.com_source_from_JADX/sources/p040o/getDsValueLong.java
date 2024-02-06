package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getDsValueLong */
public final /* synthetic */ class getDsValueLong implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String read;

    public /* synthetic */ getDsValueLong(String str) {
        this.read = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getAverageSpotNoiseGroupingsPerSquareInch) obj).write(this.read);
    }
}
