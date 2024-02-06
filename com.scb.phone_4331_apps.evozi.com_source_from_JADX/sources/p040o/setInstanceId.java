package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setInstanceId */
public final /* synthetic */ class setInstanceId implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ String read;

    public /* synthetic */ setInstanceId(String str) {
        this.read = str;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((getFrontException$MediaBrowserCompat$CustomActionResultReceiver) obj).IconCompatParcelizer(this.read);
    }
}
