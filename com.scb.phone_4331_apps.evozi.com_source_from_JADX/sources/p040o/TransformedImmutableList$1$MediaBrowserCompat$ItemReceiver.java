package p040o;

import p040o.TransformedImmutableList;

/* renamed from: o.TransformedImmutableList$1$MediaBrowserCompat$ItemReceiver */
public final class TransformedImmutableList$1$MediaBrowserCompat$ItemReceiver<T, R> implements findFragmentByWho<onPlaceSelected, doWriteToLog> {
    private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ boolean MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ TransformedImmutableList.C38711 write;

    public TransformedImmutableList$1$MediaBrowserCompat$ItemReceiver(TransformedImmutableList.C38711 r1, boolean z, boolean z2) {
        this.write = r1;
        this.MediaBrowserCompat$CustomActionResultReceiver = z;
        this.MediaBrowserCompat$ItemReceiver = z2;
    }

    public final /* synthetic */ Object IconCompatParcelizer(Object obj) {
        onPlaceSelected onplaceselected = (onPlaceSelected) obj;
        TransformedImmutableList.C38711 r0 = this.write;
        onGetStartedClick.IconCompatParcelizer((Object) onplaceselected, "it");
        return r0.read(onplaceselected, this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$ItemReceiver);
    }
}
