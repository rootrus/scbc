package p040o;

import p040o.PassportCaptureModule;
import p040o.SignedBytes;
import p040o.setItemBackground;
import p040o.writeUInt64NoTag;
import p040o.zziu;

/* renamed from: o.setOptions */
public final class setOptions extends getSheetID<PassportCaptureModule.C6975b> {
    private final setItemBackground IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final SignedBytes.LexicographicalComparator MediaBrowserCompat$ItemReceiver;
    private final BaseTransientBottomBar$Behavior MediaMetadataCompat;

    /* renamed from: o.setOptions$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportCaptureModule.C6975b> {
        private /* synthetic */ setOptions IconCompatParcelizer;
        private /* synthetic */ StreetViewPanoramaFragment read;

        write(setOptions setoptions, StreetViewPanoramaFragment streetViewPanoramaFragment) {
            this.IconCompatParcelizer = setoptions;
            this.read = streetViewPanoramaFragment;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String c_ = this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.mo26549c_(this.read.read);
            onGetStartedClick.IconCompatParcelizer((Object) c_, "baseAssetsDisplayMapper.…rmAssetUrl(bank.bankLogo)");
            String str = this.read.write;
            onGetStartedClick.IconCompatParcelizer((Object) str, "bank.name");
            ((PassportCaptureModule.C6975b) obj).read(c_, str, (String) null);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setOptions(setItemBackground setitembackground, BaseTransientBottomBar$Behavior baseTransientBottomBar$Behavior, SignedBytes.LexicographicalComparator lexicographicalComparator, RegularImmutableBiMap regularImmutableBiMap, setItemIconTintList setitemicontintlist) {
        super(regularImmutableBiMap, setitemicontintlist);
        onGetStartedClick.write((Object) setitembackground, "addOperatingAccountCase");
        onGetStartedClick.write((Object) baseTransientBottomBar$Behavior, "getSelectedBankCase");
        onGetStartedClick.write((Object) lexicographicalComparator, "baseAssetsDisplayMapper");
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) setitemicontintlist, "customerTypeCase");
        this.IconCompatParcelizer = setitembackground;
        this.MediaMetadataCompat = baseTransientBottomBar$Behavior;
        this.MediaBrowserCompat$ItemReceiver = lexicographicalComparator;
    }

    public final void write() {
        StreetViewPanoramaFragment MediaBrowserCompat$MediaItem = this.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem();
        this.write = new zziu.zzc((String) null, MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$MediaItem.IconCompatParcelizer, MediaBrowserCompat$MediaItem.read, "");
        writeUInt64NoTag.IconCompatParcelizer write2 = new write(this, MediaBrowserCompat$MediaItem);
        if (this.RatingCompat != null) {
            write2.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public static final /* synthetic */ void write(setOptions setoptions) {
        if (setoptions.RatingCompat != null) {
            setoptions.RatingCompat.aj_();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        String str = this.read;
        if (str != null) {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            this.IconCompatParcelizer.IconCompatParcelizer(new setOptions$MediaBrowserCompat$CustomActionResultReceiver(this), new setOptions$MediaBrowserCompat$ItemReceiver(this), new setItemBackground.read(str), MediaBrowserCompat$CustomActionResultReceiver());
        }
    }
}
