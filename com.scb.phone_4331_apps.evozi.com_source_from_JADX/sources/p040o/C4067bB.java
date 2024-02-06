package p040o;

import p040o.KtaJsonCheck;
import p040o.writeUInt64NoTag;

/* renamed from: o.bB */
public final /* synthetic */ class C4067bB implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFiles write;

    public /* synthetic */ C4067bB(getFiles getfiles) {
        this.write = getfiles;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck.ParcelableVolumeInfo) obj).IconCompatParcelizer(this.write.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
