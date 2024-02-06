package p040o;

import p040o.C10827Iterators;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CrashlyticsBackgroundWorker;
import p040o.Multisets;
import p040o.zzbt;

/* renamed from: o.setMicrData */
public class setMicrData extends writeUInt64NoTag<CheckExtractActivity_MembersInjector.RatingCompat> {
    final unmodifiableMultiset IconCompatParcelizer;
    public int MediaBrowserCompat$ItemReceiver = 0;
    public final C10827Iterators.PeekingImpl MediaBrowserCompat$MediaItem;
    public getBooleanResourceValue MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public String f2950x50fd9e4a = "";
    public getMaxUserProperties MediaDescriptionCompat;
    final Multisets.AbstractEntry MediaMetadataCompat;
    final leastOf MediaSessionCompat$QueueItem;
    public String MediaSessionCompat$ResultReceiverWrapper = "%.2f";
    Multisets.C36841 read;
    public zzbt.zza.C10761zza write;

    @HmlPinActivity
    public setMicrData(RegularImmutableBiMap regularImmutableBiMap, Multisets.AbstractEntry abstractEntry, leastOf leastof, usingToString usingtostring, Multisets.C36841 r5, unmodifiableMultiset unmodifiablemultiset, C10827Iterators.PeekingImpl peekingImpl) {
        super(regularImmutableBiMap);
        this.MediaMetadataCompat = abstractEntry;
        this.MediaSessionCompat$QueueItem = leastof;
        this.MediaBrowserCompat$MediaItem = peekingImpl;
        this.read = r5;
        this.IconCompatParcelizer = unmodifiablemultiset;
    }

    static /* synthetic */ void read(double d, CheckExtractActivity_MembersInjector.RatingCompat ratingCompat) {
        ratingCompat.aI_();
        ratingCompat.MediaBrowserCompat$ItemReceiver();
        ratingCompat.write(false);
        ratingCompat.write(d);
    }

    static /* synthetic */ void write(getNextExpirable getnextexpirable, CheckExtractActivity_MembersInjector.RatingCompat ratingCompat) {
        ratingCompat.aj_();
        ratingCompat.MediaBrowserCompat$ItemReceiver(getnextexpirable);
    }

    public void onDestroy() {
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer();
        super.onDestroy();
    }

    static /* synthetic */ boolean read(setDataCollectionEnabled setdatacollectionenabled) {
        return ("WEEKLY_PAYMENT".equals(setdatacollectionenabled.MediaBrowserCompat$ItemReceiver) && setdatacollectionenabled.MediaDescriptionCompat != null) || "MONTHLY_PAYMENT".equals(setdatacollectionenabled.MediaBrowserCompat$ItemReceiver);
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(CrashlyticsBackgroundWorker.C32164 r1, CheckExtractActivity_MembersInjector.RatingCompat ratingCompat) {
        if (r1.IconCompatParcelizer != null) {
            ratingCompat.MediaBrowserCompat$CustomActionResultReceiver(r1);
        }
        ratingCompat.write(true);
        ratingCompat.MediaBrowserCompat$CustomActionResultReceiver(true);
    }
}
