package p040o;

import p040o.Synchronized;
import p040o.proxyGetICheckDeserializerRtti;

/* renamed from: o.isRegistered */
public class isRegistered extends writeUInt64NoTag<proxyGetICheckDeserializerRtti.IconCompatParcelizer> {
    public parseFile IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final Synchronized.SynchronizedSet MediaBrowserCompat$ItemReceiver;
    public final MapStyleOptions write;

    @HmlPinActivity
    public isRegistered(RegularImmutableBiMap regularImmutableBiMap, Synchronized.SynchronizedSet synchronizedSet, MapStyleOptions mapStyleOptions) {
        super(regularImmutableBiMap);
        this.write = mapStyleOptions;
        this.MediaBrowserCompat$ItemReceiver = synchronizedSet;
    }

    static /* synthetic */ void write(isRegistered isregistered) {
        if (isregistered.RatingCompat != null) {
            isregistered.RatingCompat.aj_();
        }
    }
}
