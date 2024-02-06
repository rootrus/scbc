package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.getPrefsWithGeneratedIdMultiProcessSafe */
public final /* synthetic */ class getPrefsWithGeneratedIdMultiProcessSafe implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ declaresInterruptedEx write;

    public /* synthetic */ getPrefsWithGeneratedIdMultiProcessSafe(declaresInterruptedEx declaresinterruptedex) {
        this.write = declaresinterruptedex;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$ItemReceiver) obj).write(this.write);
    }
}
