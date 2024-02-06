package p040o;

import p040o.Maps;

/* renamed from: o.getGenericSupertype */
public class getGenericSupertype extends declaringClassOf {
    private isEagerInDefaultApp read;

    @HmlPinActivity
    public getGenericSupertype(RegularImmutableBiMap regularImmutableBiMap, Maps.TransformedEntriesMap.EntrySet.C36501 r2) {
        super(regularImmutableBiMap, r2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(isEagerInDefaultApp iseagerindefaultapp) {
        this.read = iseagerindefaultapp;
        super.MediaBrowserCompat$CustomActionResultReceiver(iseagerindefaultapp);
    }

    /* access modifiers changed from: protected */
    public final Long MediaBrowserCompat$ItemReceiver() {
        return Long.valueOf((long) this.read.MediaSessionCompat$ResultReceiverWrapper.PlaybackStateCompat$CustomAction.intValue());
    }

    public final void IconCompatParcelizer() {
        super.MediaBrowserCompat$ItemReceiver(true, this.read);
    }
}
