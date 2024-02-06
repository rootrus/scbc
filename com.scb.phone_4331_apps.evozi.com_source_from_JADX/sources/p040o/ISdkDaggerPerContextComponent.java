package p040o;

import java.util.List;
import p040o.Equivalences;

/* renamed from: o.ISdkDaggerPerContextComponent */
public class ISdkDaggerPerContextComponent extends writeUInt64NoTag<getListener> {
    public newCameraPosition IconCompatParcelizer;
    final ByteArrayDataInput MediaBrowserCompat$ItemReceiver;
    public final Equivalences.Impl.C33321 MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver;
    public final FinalizablePhantomReference MediaMetadataCompat;
    public List<newCameraPosition> read;
    public boolean write;

    @HmlPinActivity
    public ISdkDaggerPerContextComponent(RegularImmutableBiMap regularImmutableBiMap, FinalizablePhantomReference finalizablePhantomReference, Equivalences.Impl.C33321 r3, ByteArrayDataInput byteArrayDataInput) {
        super(regularImmutableBiMap);
        this.MediaMetadataCompat = finalizablePhantomReference;
        this.MediaBrowserCompat$MediaItem = r3;
        this.MediaBrowserCompat$ItemReceiver = byteArrayDataInput;
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(ISdkDaggerPerContextComponent iSdkDaggerPerContextComponent) {
        if (iSdkDaggerPerContextComponent.RatingCompat != null) {
            iSdkDaggerPerContextComponent.RatingCompat.aj_();
        }
    }
}
