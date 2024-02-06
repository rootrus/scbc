package p040o;

import android.text.TextUtils;
import java.util.Arrays;
import java.util.List;
import p040o.CharMatcher;
import p040o.CheckWorkflowActivity;
import p040o.Sets;
import p040o.SingletonImmutableMap;
import p040o.StandardTable;
import p040o.access$2300;

/* renamed from: o.setCropLineStyle */
public class setCropLineStyle extends getDestination<CheckWorkflowActivity.C64001> {
    /* access modifiers changed from: private */
    public final StandardTable.Column.EntrySet AlertController$RecycleListView;
    public double IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final SingletonImmutableMap.Values Keep;
    public List<doBackgroundInitializationAsync> MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public boolean MediaBrowserCompat$SearchResultReceiver = false;
    /* access modifiers changed from: private */

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public markInitializationComplete f2936x50fd9e4a;
    public String MediaDescriptionCompat;
    public final StreetViewPanoramaLink MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final Sets.SetFromMap MediaSessionCompat$QueueItem;
    public getOsDisplayVersionString MediaSessionCompat$ResultReceiverWrapper;
    public double MediaSessionCompat$Token;
    public int ParcelableVolumeInfo;
    /* access modifiers changed from: private */
    public final StandardTable.C38192 PlaybackStateCompat;
    /* access modifiers changed from: private */
    public EmptyImmutableMultiset setHasDecor;

    @HmlPinActivity
    public setCropLineStyle(StreetViewPanoramaLink streetViewPanoramaLink, Sets.SetFromMap setFromMap, Sets.PowerSet.BitFilteredSetIterator bitFilteredSetIterator, RegularImmutableBiMap regularImmutableBiMap, CharMatcher.C31612 r5, SingletonImmutableSet singletonImmutableSet, StandardTable.C38192 r7, StandardTable.Column.EntrySet entrySet, SingletonImmutableMap.Values values) {
        super(regularImmutableBiMap, singletonImmutableSet, bitFilteredSetIterator, r5);
        this.MediaMetadataCompat = streetViewPanoramaLink;
        this.MediaSessionCompat$QueueItem = setFromMap;
        this.PlaybackStateCompat = r7;
        this.AlertController$RecycleListView = entrySet;
        this.Keep = values;
    }

    public final void RatingCompat() {
        if (this.ParcelableVolumeInfo < this.MediaBrowserCompat$ItemReceiver.size()) {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            EmptyImmutableMap$MediaBrowserCompat$CustomActionResultReceiver IconCompatParcelizer2 = EmptyImmutableMap.IconCompatParcelizer();
            IconCompatParcelizer2.write = this.MediaBrowserCompat$ItemReceiver.get(this.ParcelableVolumeInfo).IconCompatParcelizer;
            if (this.read != null && !TextUtils.isEmpty(this.read.write)) {
                C3597xa9335a5d write = LocationAvailability.write();
                write.IconCompatParcelizer = this.read.write;
                IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver = new LocationAvailability(write, (byte) 0);
            }
            this.MediaMetadataCompat.IconCompatParcelizer(new EmptyImmutableMap(IconCompatParcelizer2, (byte) 0));
            this.MediaMetadataCompat.IconCompatParcelizer(new setCropLineStyle$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0));
        }
    }

    public final void write() {
        this.MediaSessionCompat$ResultReceiverWrapper = null;
        C10853onTouch ontouch = C10853onTouch.MediaBrowserCompat$ItemReceiver;
        if (this.RatingCompat != null) {
            ontouch.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public void onDestroy() {
        super.onDestroy();
        StreetViewPanoramaLink streetViewPanoramaLink = this.MediaMetadataCompat;
        if (!streetViewPanoramaLink.MediaBrowserCompat$MediaItem.isDisposed()) {
            streetViewPanoramaLink.MediaBrowserCompat$MediaItem.dispose();
        }
        streetViewPanoramaLink.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver();
    }

    public final List<String> MediaBrowserCompat$ItemReceiver() {
        return Arrays.asList(new String[]{"MF_REDEEM_DISCLAIMER", "MF_SCHEDULE"});
    }

    public final LocationCallback MediaBrowserCompat$CustomActionResultReceiver() {
        return LocationCallback.REDEEM;
    }

    public final boolean read(boolean z) {
        return this.MediaSessionCompat$ResultReceiverWrapper != null && (this.IconCompatParcelizer > 0.0d || this.MediaSessionCompat$Token > 0.0d || z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0042  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaMetadataCompat() {
        /*
            r5 = this;
            o.getOsDisplayVersionString r0 = r5.MediaSessionCompat$ResultReceiverWrapper
            java.lang.String r0 = r0.MediaMetadataCompat
            int r1 = r0.hashCode()
            r2 = 0
            r3 = 1
            r4 = 76
            if (r1 == r4) goto L_0x001c
            r4 = 83
            if (r1 != r4) goto L_0x0026
            java.lang.String r1 = "S"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = r3
            goto L_0x0027
        L_0x001c:
            java.lang.String r1 = "L"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x0026
            r0 = r2
            goto L_0x0027
        L_0x0026:
            r0 = -1
        L_0x0027:
            if (r0 == 0) goto L_0x0042
            if (r0 == r3) goto L_0x0030
            r0 = 0
            r5.IconCompatParcelizer((java.lang.String) r0)
            return
        L_0x0030:
            o.clearHighlights r0 = new o.clearHighlights
            r0.<init>(r5)
            T r1 = r5.RatingCompat
            if (r1 == 0) goto L_0x003a
            r2 = r3
        L_0x003a:
            if (r2 == 0) goto L_0x0041
            T r1 = r5.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x0041:
            return
        L_0x0042:
            o.ImgReviewEditCntrl r0 = new o.ImgReviewEditCntrl
            r0.<init>(r5)
            T r1 = r5.RatingCompat
            if (r1 == 0) goto L_0x004c
            r2 = r3
        L_0x004c:
            if (r2 == 0) goto L_0x0053
            T r1 = r5.RatingCompat
            r0.IconCompatParcelizer(r1)
        L_0x0053:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.setCropLineStyle.MediaMetadataCompat():void");
    }

    /* renamed from: o.setCropLineStyle$IconCompatParcelizer */
    public final class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getTriggeringLocation> {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(setCropLineStyle setcroplinestyle, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            getTriggeringLocation gettriggeringlocation = (getTriggeringLocation) obj;
            boolean z = true;
            if (setCropLineStyle.this.RatingCompat != null) {
                setCropLineStyle setcroplinestyle = setCropLineStyle.this;
                markInitializationComplete unused = setcroplinestyle.f2936x50fd9e4a = setcroplinestyle.MediaSessionCompat$QueueItem.MediaBrowserCompat$ItemReceiver(gettriggeringlocation, setCropLineStyle.this.MediaMetadataCompat.IconCompatParcelizer.setItemInvoker());
                setCropLineStyle setcroplinestyle2 = setCropLineStyle.this;
                C4049av avVar = new C4049av(this);
                if (setcroplinestyle2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    avVar.IconCompatParcelizer(setcroplinestyle2.RatingCompat);
                }
                setCropLineStyle.MediaSessionCompat$ResultReceiverWrapper(setCropLineStyle.this);
            }
        }

        public final void onComplete() {
            setCropLineStyle.RatingCompat(setCropLineStyle.this);
            setCropLineStyle.MediaMetadataCompat(setCropLineStyle.this);
        }

        public final void onError(Throwable th) {
            setCropLineStyle.this.MediaBrowserCompat$ItemReceiver(setCropLineStyle.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    /* renamed from: o.setCropLineStyle$read */
    final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<getPlaceTypes> {
        LocationAvailability write;

        public final /* synthetic */ void onNext(Object obj) {
            getPlaceTypes getplacetypes = (getPlaceTypes) obj;
            boolean z = true;
            if (setCropLineStyle.this.RatingCompat != null) {
                setCropLineStyle.MediaBrowserCompat$ItemReceiver(setCropLineStyle.this);
                if (!getplacetypes.read || getplacetypes.MediaBrowserCompat$CustomActionResultReceiver == null) {
                    setCropLineStyle setcroplinestyle = setCropLineStyle.this;
                    getDisplayToBitmapScalingFactor getdisplaytobitmapscalingfactor = new getDisplayToBitmapScalingFactor(this, getplacetypes);
                    if (setcroplinestyle.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        getdisplaytobitmapscalingfactor.IconCompatParcelizer(setcroplinestyle.RatingCompat);
                        return;
                    }
                    return;
                }
                setCropLineStyle setcroplinestyle2 = setCropLineStyle.this;
                setHighlightRectangle sethighlightrectangle = new setHighlightRectangle(this, getplacetypes);
                if (setcroplinestyle2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    sethighlightrectangle.IconCompatParcelizer(setcroplinestyle2.RatingCompat);
                }
            }
        }

        public read(LocationAvailability locationAvailability) {
            this.write = locationAvailability;
        }

        public final void onComplete() {
            setCropLineStyle.MediaSessionCompat$QueueItem(setCropLineStyle.this);
        }

        public final void onError(Throwable th) {
            if ((setCropLineStyle.this.RatingCompat != null) && !setCropLineStyle.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                setCropLineStyle.this.MediaBrowserCompat$ItemReceiver(setCropLineStyle.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(setCropLineStyle setcroplinestyle) {
        if (setcroplinestyle.RatingCompat != null) {
            setcroplinestyle.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(setCropLineStyle setcroplinestyle) {
        if (setcroplinestyle.RatingCompat != null) {
            setcroplinestyle.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void RatingCompat(setCropLineStyle setcroplinestyle) {
        if (setcroplinestyle.RatingCompat != null) {
            setcroplinestyle.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$SearchResultReceiver(setCropLineStyle setcroplinestyle) {
        if (setcroplinestyle.RatingCompat != null) {
            setcroplinestyle.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaMetadataCompat(setCropLineStyle setcroplinestyle) {
        if (setcroplinestyle.RatingCompat != null) {
            setcroplinestyle.RatingCompat.az_();
        }
    }

    static /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper(setCropLineStyle setcroplinestyle) {
        if (setcroplinestyle.RatingCompat != null) {
            setcroplinestyle.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaSessionCompat$QueueItem(setCropLineStyle setcroplinestyle) {
        if (setcroplinestyle.RatingCompat != null) {
            setcroplinestyle.RatingCompat.ay_();
        }
    }

    static /* synthetic */ boolean read(doBackgroundInitializationAsync dobackgroundinitializationasync) {
        return dobackgroundinitializationasync.MediaBrowserCompat$MediaItem.size() > 0;
    }

    public final void IconCompatParcelizer(String str) {
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        C9729x61ec9a8b MediaBrowserCompat$CustomActionResultReceiver = EmptyImmutableMultiset.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver.read = this.MediaSessionCompat$ResultReceiverWrapper.MediaDescriptionCompat;
        MediaBrowserCompat$CustomActionResultReceiver.write = this.MediaBrowserCompat$MediaItem;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem = this.MediaDescriptionCompat;
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver = this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver.RatingCompat();
        MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = str;
        String str2 = null;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = "A".equals(this.MediaDescriptionCompat) ? removeIfFromRandomAccessList.read(this.IconCompatParcelizer) : null;
        if ("U".equals(this.MediaDescriptionCompat)) {
            str2 = getICheckDeserializerRtti.IconCompatParcelizer(this.MediaSessionCompat$Token);
        }
        MediaBrowserCompat$CustomActionResultReceiver.RatingCompat = str2;
        if (this.read != null) {
            MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver = this.read;
        }
        EmptyImmutableMultiset emptyImmutableMultiset = new EmptyImmutableMultiset(MediaBrowserCompat$CustomActionResultReceiver, (byte) 0);
        this.setHasDecor = emptyImmutableMultiset;
        this.MediaMetadataCompat.write(emptyImmutableMultiset);
        this.MediaMetadataCompat.IconCompatParcelizer(new read(this.read));
    }
}
