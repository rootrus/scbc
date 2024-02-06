package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getEnvTime */
public final /* synthetic */ class getEnvTime implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getTaskError write;

    public /* synthetic */ getEnvTime(getTaskError gettaskerror) {
        this.write = gettaskerror;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((classificationConfidence$MediaBrowserCompat$ItemReceiver) obj).MediaBrowserCompat$MediaItem(this.write.IconCompatParcelizer.read);
    }
}
