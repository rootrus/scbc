package p040o;

import p040o.CheckCaptureModule_GetExtractionParametersFactory;
import p040o.writeUInt64NoTag;

/* renamed from: o.applyNonNullHeader$MediaBrowserCompat$MediaItem */
public final class applyNonNullHeader$MediaBrowserCompat$MediaItem<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule_GetExtractionParametersFactory.IconCompatParcelizer> {
    private /* synthetic */ sameThreadExecutor MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ String write;

    public applyNonNullHeader$MediaBrowserCompat$MediaItem(String str, sameThreadExecutor samethreadexecutor) {
        this.write = str;
        this.MediaBrowserCompat$ItemReceiver = samethreadexecutor;
    }

    public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
        ((CheckCaptureModule_GetExtractionParametersFactory.IconCompatParcelizer) obj).IconCompatParcelizer(this.write, this.MediaBrowserCompat$ItemReceiver);
    }
}
