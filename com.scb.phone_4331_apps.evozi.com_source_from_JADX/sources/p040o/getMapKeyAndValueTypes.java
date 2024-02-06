package p040o;

import p040o.Maps;

/* renamed from: o.getMapKeyAndValueTypes */
public class getMapKeyAndValueTypes extends declaringClassOf {
    public isEagerInDefaultApp read;

    @HmlPinActivity
    public getMapKeyAndValueTypes(RegularImmutableBiMap regularImmutableBiMap, Maps.TransformedEntriesMap.EntrySet.C36501 r2) {
        super(regularImmutableBiMap, r2);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(isEagerInDefaultApp iseagerindefaultapp) {
        this.read = iseagerindefaultapp;
        super.MediaBrowserCompat$CustomActionResultReceiver(iseagerindefaultapp);
    }

    /* access modifiers changed from: protected */
    public final Long MediaBrowserCompat$ItemReceiver() {
        return Long.valueOf((long) this.read.MediaSessionCompat$ResultReceiverWrapper.ParcelableVolumeInfo.intValue());
    }

    public final void write() {
        super.MediaBrowserCompat$ItemReceiver(false, this.read);
    }
}
