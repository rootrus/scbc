package p040o;

import p040o.Maps;

/* renamed from: o.checkContentProviderAuthority */
public class checkContentProviderAuthority extends writeUInt64NoTag<getExpirationDate> {
    /* access modifiers changed from: private */
    public final transformEntry IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final C4801in MediaBrowserCompat$ItemReceiver;
    public final getLocalPort read;
    /* access modifiers changed from: private */
    public final Maps.AbstractMapWrapper write;

    @HmlPinActivity
    public checkContentProviderAuthority(RegularImmutableBiMap regularImmutableBiMap, getLocalPort getlocalport, transformEntry transformentry, Maps.AbstractMapWrapper abstractMapWrapper, C4801in inVar) {
        super(regularImmutableBiMap);
        this.read = getlocalport;
        this.IconCompatParcelizer = transformentry;
        this.write = abstractMapWrapper;
        this.MediaBrowserCompat$ItemReceiver = inVar;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(checkContentProviderAuthority checkcontentproviderauthority) {
        if (checkcontentproviderauthority.RatingCompat != null) {
            checkcontentproviderauthority.RatingCompat.aj_();
        }
    }
}
