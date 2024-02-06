package p040o;

import p040o.getMicrAmount;
import p040o.writeUInt64NoTag;

/* renamed from: o.setAdditionalMetadata */
public final /* synthetic */ class setAdditionalMetadata implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ valueOrNull IconCompatParcelizer;

    public /* synthetic */ setAdditionalMetadata(valueOrNull valueornull) {
        this.IconCompatParcelizer = valueornull;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getMicrAmount.read) obj).MediaBrowserCompat$ItemReceiver(this.IconCompatParcelizer);
    }
}
