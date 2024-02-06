package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.StateListener */
public final /* synthetic */ class StateListener implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ UncaughtExceptionHandlers write;

    public /* synthetic */ StateListener(UncaughtExceptionHandlers uncaughtExceptionHandlers) {
        this.write = uncaughtExceptionHandlers;
    }

    public final void IconCompatParcelizer(Object obj) {
        ((proxyGetICheckDeserializerRtti$MediaBrowserCompat$MediaItem) obj).write(this.write);
    }
}
