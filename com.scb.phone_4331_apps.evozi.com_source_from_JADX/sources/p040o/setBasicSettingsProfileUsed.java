package p040o;

import p040o.CheckExtractActivity_MembersInjector;
import p040o.Multisets;

/* renamed from: o.setBasicSettingsProfileUsed */
public class setBasicSettingsProfileUsed extends writeUInt64NoTag<CheckExtractActivity_MembersInjector.setPadding> {
    /* access modifiers changed from: package-private */
    public immutableSortedCopy IconCompatParcelizer;
    public getNextEvictable MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public explicit MediaBrowserCompat$MediaItem;
    public getTotalRamInBytes MediaDescriptionCompat;
    public Detector read;
    public isEmulator write;

    @HmlPinActivity
    setBasicSettingsProfileUsed(RegularImmutableBiMap regularImmutableBiMap, usingToString usingtostring, Multisets.C36852 r3, Detector detector, explicit explicit, immutableSortedCopy immutablesortedcopy) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = immutablesortedcopy;
        this.MediaBrowserCompat$MediaItem = explicit;
        this.read = detector;
    }

    public final void read(int i) {
        getResourcePackageName getresourcepackagename = this.MediaDescriptionCompat.MediaBrowserCompat$MediaItem.get(i);
        isEmulator isemulator = new isEmulator();
        this.write = isemulator;
        isemulator.f2875x50fd9e4a = getresourcepackagename.IconCompatParcelizer;
        this.write.setHasDecor = getresourcepackagename.MediaBrowserCompat$ItemReceiver;
        this.write.AlertController$RecycleListView = getresourcepackagename.read;
        this.write.MediaSessionCompat$QueueItem = getresourcepackagename.MediaDescriptionCompat;
        this.write.MediaSessionCompat$ResultReceiverWrapper = getresourcepackagename.MediaMetadataCompat;
        this.write.MediaSessionCompat$Token = getresourcepackagename.MediaBrowserCompat$SearchResultReceiver;
        this.write.PlaybackStateCompat = getresourcepackagename.MediaSessionCompat$Token;
        this.write.PlaybackStateCompat$CustomAction = getresourcepackagename.ParcelableVolumeInfo;
        this.write.MediaBrowserCompat$CustomActionResultReceiver = Integer.valueOf(getresourcepackagename.RatingCompat);
        this.write.ParcelableVolumeInfo = getresourcepackagename.MediaBrowserCompat$MediaItem;
        getNextEvictable getnextevictable = this.MediaBrowserCompat$ItemReceiver;
        getnextevictable.write = getresourcepackagename.RatingCompat;
        getnextevictable.MediaBrowserCompat$CustomActionResultReceiver = getresourcepackagename.MediaBrowserCompat$MediaItem;
        getBasicSettingsProfileUsed getbasicsettingsprofileused = new getBasicSettingsProfileUsed(this, getresourcepackagename);
        if (this.RatingCompat != null) {
            getbasicsettingsprofileused.IconCompatParcelizer(this.RatingCompat);
        }
    }

    static /* synthetic */ void read(setBasicSettingsProfileUsed setbasicsettingsprofileused) {
        if (setbasicsettingsprofileused.RatingCompat != null) {
            setbasicsettingsprofileused.RatingCompat.aj_();
        }
    }
}
