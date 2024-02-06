package p040o;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.CharMatcher;
import p040o.CrashlyticsCore;
import p040o.EmptyImmutableList;
import p040o.Sets;
import p040o.SingletonImmutableMap;
import p040o.access$2300;

/* renamed from: o.clearGlobalBitmap */
public class clearGlobalBitmap extends getDestination<C6397xabb2c88d> {
    /* access modifiers changed from: private */
    public final createColumnKeyIterator AlertController$RecycleListView;
    public double IconCompatParcelizer;
    /* access modifiers changed from: private */
    public EmptyImmutableList Keep;
    public String MediaBrowserCompat$ItemReceiver;
    public List<doBackgroundInitializationAsync> MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private String f2808x50fd9e4a;
    public boolean MediaDescriptionCompat = false;
    public String MediaMetadataCompat;
    public InstallIdProvider MediaSessionCompat$QueueItem;
    public final StreetViewPanoramaLink MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public markInitializationComplete MediaSessionCompat$Token;
    public int ParcelableVolumeInfo;
    /* access modifiers changed from: private */
    public final Sets.SetFromMap PlaybackStateCompat;
    /* access modifiers changed from: private */
    public final valueIteratorImpl PlaybackStateCompat$CustomAction;
    /* access modifiers changed from: private */
    public final SingletonImmutableMap.Values setBackgroundResource;
    private String setHasDecor;

    @HmlPinActivity
    public clearGlobalBitmap(StreetViewPanoramaLink streetViewPanoramaLink, Sets.SetFromMap setFromMap, Sets.PowerSet.BitFilteredSetIterator bitFilteredSetIterator, RegularImmutableBiMap regularImmutableBiMap, valueIteratorImpl valueiteratorimpl, createColumnKeyIterator createcolumnkeyiterator, SingletonImmutableSet singletonImmutableSet, CharMatcher.C31612 r8, SingletonImmutableMap.Values values) {
        super(regularImmutableBiMap, singletonImmutableSet, bitFilteredSetIterator, r8);
        this.MediaSessionCompat$ResultReceiverWrapper = streetViewPanoramaLink;
        this.PlaybackStateCompat = setFromMap;
        this.PlaybackStateCompat$CustomAction = valueiteratorimpl;
        this.AlertController$RecycleListView = createcolumnkeyiterator;
        this.setBackgroundResource = values;
    }

    public void onDestroy() {
        super.onDestroy();
        StreetViewPanoramaLink streetViewPanoramaLink = this.MediaSessionCompat$ResultReceiverWrapper;
        if (!streetViewPanoramaLink.MediaBrowserCompat$MediaItem.isDisposed()) {
            streetViewPanoramaLink.MediaBrowserCompat$MediaItem.dispose();
        }
        streetViewPanoramaLink.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
    }

    public final List<String> MediaBrowserCompat$ItemReceiver() {
        return Arrays.asList(new String[]{"MF_PURCHASE_DISCLAIMER", "MF_SCHEDULE"});
    }

    public final void IconCompatParcelizer() {
        super.IconCompatParcelizer();
        C4047ar arVar = C4047ar.IconCompatParcelizer;
        if (this.RatingCompat != null) {
            arVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public final void write() {
        this.MediaSessionCompat$QueueItem = null;
    }

    public final LocationCallback MediaBrowserCompat$CustomActionResultReceiver() {
        return LocationCallback.PURCHASE;
    }

    public final void MediaBrowserCompat$MediaItem() {
        if (this.read != null && !"O".equalsIgnoreCase(this.read.MediaBrowserCompat$CustomActionResultReceiver) && this.MediaSessionCompat$QueueItem != null) {
            this.read = null;
            inject_apiEventManager inject_apieventmanager = inject_apiEventManager.MediaBrowserCompat$CustomActionResultReceiver;
            boolean z = true;
            if (this.RatingCompat != null) {
                inject_apieventmanager.IconCompatParcelizer(this.RatingCompat);
            }
            super.IconCompatParcelizer();
            C4047ar arVar = C4047ar.IconCompatParcelizer;
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                arVar.IconCompatParcelizer(this.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (i < this.MediaBrowserCompat$MediaItem.size()) {
            this.f2808x50fd9e4a = this.MediaBrowserCompat$MediaItem.get(i).IconCompatParcelizer;
        }
    }

    public final boolean MediaDescriptionCompat() {
        return this.IconCompatParcelizer > 0.0d && this.MediaSessionCompat$QueueItem != null && (!TextUtils.isEmpty(this.MediaMetadataCompat) || !TextUtils.isEmpty(this.MediaBrowserCompat$ItemReceiver));
    }

    public final void write(getOsBuildVersionString getosbuildversionstring) {
        LinkedList<CrashlyticsCore.C32462> MediaMetadataCompat2 = getosbuildversionstring.MediaMetadataCompat();
        if (MediaMetadataCompat2 == null || MediaMetadataCompat2.isEmpty()) {
            MediaBrowserCompat$CustomActionResultReceiver(getosbuildversionstring);
            return;
        }
        C9857aq aqVar = new C9857aq(getosbuildversionstring, MediaMetadataCompat2);
        if (this.RatingCompat != null) {
            aqVar.IconCompatParcelizer(this.RatingCompat);
        }
        MediaMetadataCompat2.removeFirst();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(getOsBuildVersionString getosbuildversionstring) {
        boolean z = true;
        if ("COMPLEX".equalsIgnoreCase(this.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver)) {
            newImageCaptureView newimagecaptureview = new newImageCaptureView(getosbuildversionstring);
            if (this.RatingCompat == null) {
                z = false;
            }
            if (z) {
                newimagecaptureview.IconCompatParcelizer(this.RatingCompat);
                return;
            }
            return;
        }
        C9858as asVar = new C9858as(getosbuildversionstring);
        if (this.RatingCompat == null) {
            z = false;
        }
        if (z) {
            asVar.IconCompatParcelizer(this.RatingCompat);
        }
    }

    /* renamed from: o.clearGlobalBitmap$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getTriggeringLocation> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(clearGlobalBitmap clearglobalbitmap, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getTriggeringLocation gettriggeringlocation = (getTriggeringLocation) obj;
            boolean z = true;
            if (clearGlobalBitmap.this.RatingCompat != null) {
                clearGlobalBitmap clearglobalbitmap = clearGlobalBitmap.this;
                markInitializationComplete unused = clearglobalbitmap.MediaSessionCompat$Token = clearglobalbitmap.PlaybackStateCompat.MediaBrowserCompat$ItemReceiver(gettriggeringlocation, clearGlobalBitmap.this.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer.setItemInvoker());
                clearGlobalBitmap clearglobalbitmap2 = clearGlobalBitmap.this;
                onCameraParametersProduced oncameraparametersproduced = new onCameraParametersProduced(this);
                if (clearglobalbitmap2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    oncameraparametersproduced.IconCompatParcelizer(clearglobalbitmap2.RatingCompat);
                }
                clearGlobalBitmap.MediaSessionCompat$ResultReceiverWrapper(clearGlobalBitmap.this);
            }
        }

        public final void onComplete() {
            clearGlobalBitmap.MediaDescriptionCompat(clearGlobalBitmap.this);
            clearGlobalBitmap.MediaMetadataCompat(clearGlobalBitmap.this);
        }

        public final void onError(Throwable th) {
            clearGlobalBitmap.this.MediaBrowserCompat$ItemReceiver(clearGlobalBitmap.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(clearGlobalBitmap clearglobalbitmap) {
        if (clearglobalbitmap.RatingCompat != null) {
            clearglobalbitmap.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaDescriptionCompat(clearGlobalBitmap clearglobalbitmap) {
        if (clearglobalbitmap.RatingCompat != null) {
            clearglobalbitmap.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaMetadataCompat(clearGlobalBitmap clearglobalbitmap) {
        if (clearglobalbitmap.RatingCompat != null) {
            clearglobalbitmap.RatingCompat.az_();
        }
    }

    static /* synthetic */ void MediaSessionCompat$Token(clearGlobalBitmap clearglobalbitmap) {
        if (clearglobalbitmap.RatingCompat != null) {
            clearglobalbitmap.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper(clearGlobalBitmap clearglobalbitmap) {
        if (clearglobalbitmap.RatingCompat != null) {
            clearglobalbitmap.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void ParcelableVolumeInfo(clearGlobalBitmap clearglobalbitmap) {
        if (clearglobalbitmap.RatingCompat != null) {
            clearglobalbitmap.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void AlertController$RecycleListView(clearGlobalBitmap clearglobalbitmap) {
        if (clearglobalbitmap.RatingCompat != null) {
            clearglobalbitmap.RatingCompat.ay_();
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        EmptyImmutableList$1$MediaBrowserCompat$ItemReceiver read = EmptyImmutableList.C97281.read();
        read.read = this.MediaBrowserCompat$MediaItem.get(this.ParcelableVolumeInfo).IconCompatParcelizer;
        read.write = this.read;
        this.MediaSessionCompat$ResultReceiverWrapper.write(new EmptyImmutableList.C97281(read, (byte) 0), "");
        this.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(new clearGlobalBitmap$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
    }

    public final void IconCompatParcelizer(int i) {
        String str = "T";
        if (!DiskLruCache.VERSION_1.equals(this.MediaSessionCompat$QueueItem.RatingCompat) || !DiskLruCache.VERSION_1.equals(this.MediaSessionCompat$QueueItem.MediaBrowserCompat$MediaItem) ? DiskLruCache.VERSION_1.equals(this.MediaSessionCompat$QueueItem.MediaBrowserCompat$MediaItem) : i == 1) {
            str = "C";
        }
        this.setHasDecor = str;
        EmptyImmutableList emptyImmutableList = new EmptyImmutableList();
        emptyImmutableList.MediaMetadataCompat = this.MediaSessionCompat$QueueItem.IconCompatParcelizer;
        emptyImmutableList.read = removeIfFromRandomAccessList.read(this.IconCompatParcelizer);
        emptyImmutableList.MediaBrowserCompat$CustomActionResultReceiver = this.f2808x50fd9e4a;
        emptyImmutableList.RatingCompat = this.read;
        emptyImmutableList.MediaDescriptionCompat = this.setHasDecor;
        emptyImmutableList.MediaBrowserCompat$ItemReceiver = this.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver;
        emptyImmutableList.MediaBrowserCompat$SearchResultReceiver = this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver.RatingCompat();
        this.Keep = emptyImmutableList;
        if (this.setHasDecor.equalsIgnoreCase("C")) {
            EmptyImmutableList emptyImmutableList2 = this.Keep;
            emptyImmutableList2.write = "";
            emptyImmutableList2.IconCompatParcelizer = this.MediaMetadataCompat;
        } else {
            EmptyImmutableList emptyImmutableList3 = this.Keep;
            emptyImmutableList3.IconCompatParcelizer = "";
            emptyImmutableList3.write = this.MediaBrowserCompat$ItemReceiver;
        }
        this.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(this.Keep);
        this.MediaSessionCompat$ResultReceiverWrapper.IconCompatParcelizer(new clearGlobalBitmap$MediaBrowserCompat$CustomActionResultReceiver(this, this.read));
    }
}
