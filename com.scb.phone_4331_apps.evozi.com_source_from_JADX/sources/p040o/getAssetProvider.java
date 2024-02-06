package p040o;

import p040o.Enums;

/* renamed from: o.getAssetProvider */
public class getAssetProvider extends writeUInt64NoTag<C7512tW> {
    public boolean IconCompatParcelizer;
    public final Enums.ValueOfFunction MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public final subListImpl MediaBrowserCompat$SearchResultReceiver;
    final Equivalences MediaDescriptionCompat;
    final getIdType read;
    public boolean write;

    @HmlPinActivity
    public getAssetProvider(RegularImmutableBiMap regularImmutableBiMap, Enums.ValueOfFunction valueOfFunction, getIdType getidtype, Equivalences equivalences, subListImpl sublistimpl) {
        super(regularImmutableBiMap);
        this.read = getidtype;
        this.MediaBrowserCompat$ItemReceiver = valueOfFunction;
        this.MediaDescriptionCompat = equivalences;
        this.MediaBrowserCompat$SearchResultReceiver = sublistimpl;
    }

    static /* synthetic */ void read(getAssetProvider getassetprovider) {
        if (getassetprovider.RatingCompat != null) {
            getassetprovider.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getAssetProvider getassetprovider) {
        if (getassetprovider.RatingCompat != null) {
            getassetprovider.RatingCompat.aj_();
        }
    }
}
