package p040o;

import p040o.QuickExtractorAgent;
import p040o.writeUInt64NoTag;

/* renamed from: o.hM */
public final /* synthetic */ class C10001hM implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getFileSHA read;

    public /* synthetic */ C10001hM(getFileSHA getfilesha) {
        this.read = getfilesha;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((QuickExtractorAgent.C70191) obj).MediaBrowserCompat$CustomActionResultReceiver(this.read);
    }
}
