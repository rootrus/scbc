package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.rG */
public final /* synthetic */ class C5191rG implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ C5191rG(String str, String str2) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckWorkflowActivity) obj).read(this.write);
    }
}
