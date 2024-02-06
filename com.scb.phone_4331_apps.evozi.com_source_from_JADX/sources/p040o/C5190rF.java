package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.rF */
public final /* synthetic */ class C5190rF implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String write;

    public /* synthetic */ C5190rF(String str, String str2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
        this.write = str2;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((CheckWorkflowActivity) obj).MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
    }
}
