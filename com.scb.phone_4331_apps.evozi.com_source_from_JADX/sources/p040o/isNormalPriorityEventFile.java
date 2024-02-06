package p040o;

import p040o.KtaJsonCheck;
import p040o.getFrameSize;
import p040o.writeUInt64NoTag;

/* renamed from: o.isNormalPriorityEventFile */
public final /* synthetic */ class isNormalPriorityEventFile implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFrameSize.read IconCompatParcelizer;

    public /* synthetic */ isNormalPriorityEventFile(getFrameSize.read read) {
        this.IconCompatParcelizer = read;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((KtaJsonCheck.C6928a) obj).write(getFrameSize.this.MediaBrowserCompat$ItemReceiver);
    }
}
