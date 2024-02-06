package p040o;

import java.util.concurrent.atomic.AtomicBoolean;
import p040o.Constraints;
import p040o.Maps;

/* renamed from: o.getArrayComponentType */
public class getArrayComponentType extends writeUInt64NoTag<IdCaptureModule> {
    /* access modifiers changed from: private */
    public ModifyQuickTopUpReviewActivity IconCompatParcelizer;
    public intoSetBuilder MediaBrowserCompat$ItemReceiver;
    private getSupportedCipherSuites MediaBrowserCompat$MediaItem;
    private getSupportedProtocols MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public Maps.TransformedEntriesMap.EntrySet read;
    /* access modifiers changed from: private */
    public AtomicBoolean write = new AtomicBoolean(false);

    @HmlPinActivity
    public getArrayComponentType(RegularImmutableBiMap regularImmutableBiMap, getSupportedCipherSuites getsupportedciphersuites, Maps.TransformedEntriesMap.EntrySet entrySet, getSupportedProtocols getsupportedprotocols, Maps.UnmodifiableEntrySet unmodifiableEntrySet) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$MediaItem = getsupportedciphersuites;
        this.read = entrySet;
        this.MediaDescriptionCompat = getsupportedprotocols;
    }

    public final void IconCompatParcelizer() {
        Integer num;
        ModifyQuickTopUpReviewActivity modifyQuickTopUpReviewActivity = this.IconCompatParcelizer;
        if (modifyQuickTopUpReviewActivity != null && modifyQuickTopUpReviewActivity.write && !this.write.get()) {
            this.write.set(true);
            alternate alternate = alternate.IconCompatParcelizer;
            if (this.RatingCompat != null) {
                alternate.IconCompatParcelizer(this.RatingCompat);
            }
            getArrayComponentType$MediaBrowserCompat$ItemReceiver getarraycomponenttype_mediabrowsercompat_itemreceiver = new getArrayComponentType$MediaBrowserCompat$ItemReceiver(this);
            getSupportedCipherSuites getsupportedciphersuites = this.MediaBrowserCompat$MediaItem;
            Integer num2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            int i = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            zzvg MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
            if (this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer() == zzvd.REWARDS_WITHIN_POINTS) {
                num = read(this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token);
            } else {
                num = null;
            }
            getsupportedciphersuites.write(new Constraints.ConstrainedSortedSet(num2, i + 1, MediaBrowserCompat$CustomActionResultReceiver, num, this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo, this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem), false);
            this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(getarraycomponenttype_mediabrowsercompat_itemreceiver);
        }
    }

    static Integer read(String str) {
        try {
            return Integer.valueOf(str.replaceAll(",", ""));
        } catch (NumberFormatException unused) {
            return 0;
        } catch (Exception unused2) {
            return 0;
        }
    }

    static /* synthetic */ void read(getArrayComponentType getarraycomponenttype) {
        if (getarraycomponenttype.RatingCompat != null) {
            getarraycomponenttype.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(getArrayComponentType getarraycomponenttype) {
        if (getarraycomponenttype.RatingCompat != null) {
            getarraycomponenttype.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(getArrayComponentType getarraycomponenttype) {
        Expose expose = Expose.MediaBrowserCompat$CustomActionResultReceiver;
        if (getarraycomponenttype.RatingCompat != null) {
            expose.IconCompatParcelizer(getarraycomponenttype.RatingCompat);
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getArrayComponentType getarraycomponenttype) {
        LongSerializationPolicy longSerializationPolicy = LongSerializationPolicy.IconCompatParcelizer;
        if (getarraycomponenttype.RatingCompat != null) {
            longSerializationPolicy.IconCompatParcelizer(getarraycomponenttype.RatingCompat);
        }
    }

    static /* synthetic */ boolean MediaMetadataCompat(getArrayComponentType getarraycomponenttype) {
        return (getarraycomponenttype.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer() == zzvd.ALL_REWARDS && getarraycomponenttype.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver() == zzvg.POPULARITY) ? false : true;
    }

    public final void IconCompatParcelizer(boolean z) {
        Integer num;
        if (z) {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
        }
        C4501x89543781 getarraycomponenttype_mediabrowsercompat_customactionresultreceiver = new C4501x89543781(this);
        Integer num2 = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
        zzvg MediaBrowserCompat$CustomActionResultReceiver = this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        if (this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer() == zzvd.REWARDS_WITHIN_POINTS) {
            num = read(this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$Token);
        } else {
            num = null;
        }
        this.MediaBrowserCompat$MediaItem.write(new Constraints.ConstrainedSortedSet(num2, 0, MediaBrowserCompat$CustomActionResultReceiver, num, this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer, this.MediaBrowserCompat$ItemReceiver.ParcelableVolumeInfo, this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem), false);
        this.MediaBrowserCompat$MediaItem.IconCompatParcelizer(getarraycomponenttype_mediabrowsercompat_customactionresultreceiver);
    }
}
