package p040o;

import p040o.RttiJsonCheck;
import p040o.lambda$component$0;
import p040o.writeUInt64NoTag;

/* renamed from: o.ignoreNullValues */
public final /* synthetic */ class ignoreNullValues implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ zzxi IconCompatParcelizer;
    private final /* synthetic */ lambda$component$0.read MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ ForwardingService write;

    public /* synthetic */ ignoreNullValues(lambda$component$0.read read, zzxi zzxi, ForwardingService forwardingService) {
        this.MediaBrowserCompat$ItemReceiver = read;
        this.IconCompatParcelizer = zzxi;
        this.write = forwardingService;
    }

    public final void IconCompatParcelizer(Object obj) {
        lambda$component$0.read read = this.MediaBrowserCompat$ItemReceiver;
        ((RttiJsonCheck.C12561) obj).read(lambda$component$0.this.MediaBrowserCompat$MediaItem.read(this.IconCompatParcelizer, this.write, lambda$component$0.this.MediaBrowserCompat$SearchResultReceiver));
    }
}
