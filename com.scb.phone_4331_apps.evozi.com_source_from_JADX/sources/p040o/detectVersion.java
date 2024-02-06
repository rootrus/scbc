package p040o;

import p040o.Maps;

/* renamed from: o.detectVersion */
public class detectVersion extends writeUInt64NoTag<getAddress4> {
    /* access modifiers changed from: private */
    public final C4801in IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final transformEntry MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final Maps.AbstractMapWrapper read;
    public final getLocalPort write;

    @HmlPinActivity
    public detectVersion(RegularImmutableBiMap regularImmutableBiMap, getLocalPort getlocalport, transformEntry transformentry, Maps.AbstractMapWrapper abstractMapWrapper, C4801in inVar) {
        super(regularImmutableBiMap);
        this.write = getlocalport;
        this.MediaBrowserCompat$ItemReceiver = transformentry;
        this.read = abstractMapWrapper;
        this.IconCompatParcelizer = inVar;
    }

    public void onDestroy() {
        getLocalPort getlocalport = this.write;
        if (!getlocalport.MediaBrowserCompat$MediaItem.isDisposed()) {
            getlocalport.MediaBrowserCompat$MediaItem.dispose();
        }
        C4801in inVar = this.IconCompatParcelizer;
        if (!inVar.MediaBrowserCompat$MediaItem.isDisposed()) {
            inVar.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }
}
