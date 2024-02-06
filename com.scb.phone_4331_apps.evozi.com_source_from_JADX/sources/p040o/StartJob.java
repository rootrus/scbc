package p040o;

import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.StartJob */
public final /* synthetic */ class StartJob implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String IconCompatParcelizer;

    public /* synthetic */ StartJob(String str) {
        this.IconCompatParcelizer = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getMicrAmount.write) obj).IconCompatParcelizer(this.IconCompatParcelizer);
    }
}
