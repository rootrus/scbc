package p040o;

import p040o.writeUInt64NoTag;

/* renamed from: o.setFocusEnabled */
public final /* synthetic */ class setFocusEnabled implements writeUInt64NoTag.IconCompatParcelizer {
    private final /* synthetic */ getCaptureCriteria MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setFocusEnabled(getCaptureCriteria getcapturecriteria) {
        this.MediaBrowserCompat$ItemReceiver = getcapturecriteria;
    }

    public final void IconCompatParcelizer(Object obj) {
        getCaptureCriteria getcapturecriteria = this.MediaBrowserCompat$ItemReceiver;
        ((PassportExtractor_MembersInjector) obj).read(toLongArray.MediaBrowserCompat$CustomActionResultReceiver(getcapturecriteria.read, (String) null, getcapturecriteria.MediaBrowserCompat$ItemReceiver, (String) null, (String) null, true, true, (String) null, 72));
    }
}
