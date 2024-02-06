package p040o;

import p040o.ILocationSourceDelegate;
import p040o.setCvv;
import p040o.writeUInt64NoTag;

/* renamed from: o.setScaleType */
public final /* synthetic */ class setScaleType implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ ILocationSourceDelegate.zza IconCompatParcelizer;

    public /* synthetic */ setScaleType(ILocationSourceDelegate.zza zza) {
        this.IconCompatParcelizer = zza;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((setCvv.IconCompatParcelizer) obj).mo13730i_(this.IconCompatParcelizer.read);
    }
}
