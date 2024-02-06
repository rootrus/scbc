package p040o;

import java.util.List;
import java.util.NoSuchElementException;
import p040o.AppMeasurement;
import p040o.IdParameters;
import p040o.Iterables;
import p040o.MapDifference;
import p040o.Synchronized;

/* renamed from: o.nativeConfigureFromFile */
public class nativeConfigureFromFile extends C3970aH<IdParameters.C6915a> {
    /* access modifiers changed from: package-private */
    public final Multimap IconCompatParcelizer;
    final getBaseUrl MediaBrowserCompat$ItemReceiver;
    public final AppMeasurement.Event MediaBrowserCompat$MediaItem;
    final whenAll MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final newLoader f2897x50fd9e4a;
    public discardOldLogFiles$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat;
    /* access modifiers changed from: package-private */
    public getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver MediaMetadataCompat;
    public final FinalizableWeakReference MediaSessionCompat$QueueItem;
    public final MapDifference.ValueDifference MediaSessionCompat$ResultReceiverWrapper;
    public final readObjectNoData MediaSessionCompat$Token;
    final Synchronized.SynchronizedAsMapValues.C38371 ParcelableVolumeInfo;
    /* access modifiers changed from: private */
    public final Synchronized.C38331 PlaybackStateCompat;
    public List<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> read;
    public final Iterables.C352212 write;

    @HmlPinActivity
    public nativeConfigureFromFile(RegularImmutableBiMap regularImmutableBiMap, Synchronized.C38331 r2, MapDifference.ValueDifference valueDifference, whenAll whenall, StreetViewPanoramaOrientation streetViewPanoramaOrientation, newLoader newloader, Multimap multimap, Synchronized.SynchronizedAsMapValues.C38371 r8, FinalizableWeakReference finalizableWeakReference, getBaseUrl getbaseurl, getSubElementOffsetBytes$MediaBrowserCompat$ItemReceiver getsubelementoffsetbytes_mediabrowsercompat_itemreceiver, proxyGetOnDevicePassportDeserializer proxygetondevicepassportdeserializer, readObjectNoData readobjectnodata, AppMeasurement.Event event, Iterables.C352212 r15) {
        super(regularImmutableBiMap, streetViewPanoramaOrientation);
        this.PlaybackStateCompat = r2;
        this.MediaSessionCompat$ResultReceiverWrapper = valueDifference;
        this.MediaBrowserCompat$SearchResultReceiver = whenall;
        this.f2897x50fd9e4a = newloader;
        this.IconCompatParcelizer = multimap;
        this.ParcelableVolumeInfo = r8;
        this.MediaSessionCompat$QueueItem = finalizableWeakReference;
        this.MediaBrowserCompat$ItemReceiver = getbaseurl;
        this.MediaMetadataCompat = getsubelementoffsetbytes_mediabrowsercompat_itemreceiver;
        proxygetondevicepassportdeserializer.write();
        this.MediaSessionCompat$Token = readobjectnodata;
        this.MediaBrowserCompat$MediaItem = event;
        this.write = r15;
    }

    public static boolean write(String str) {
        return str.startsWith("scbeasy://external") || str.startsWith("scbeasy://webview") || str.startsWith("scbeasy://loanorigination/calculator");
    }

    /* renamed from: o.nativeConfigureFromFile$IconCompatParcelizer */
    class IconCompatParcelizer extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<requireActivity$MediaBrowserCompat$CustomActionResultReceiver> {
        IconCompatParcelizer() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            nativeConfigureFromFile nativeconfigurefromfile = nativeConfigureFromFile.this;
            nativeDocuments nativedocuments = new nativeDocuments(this, (requireActivity$MediaBrowserCompat$CustomActionResultReceiver) obj);
            if (nativeconfigurefromfile.RatingCompat != null) {
                nativedocuments.IconCompatParcelizer(nativeconfigurefromfile.RatingCompat);
            }
        }
    }

    static /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver(discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        return discardoldlogfiles_mediabrowsercompat_itemreceiver != null && getGeoDataClient.OPENACCOUNT_NTB.equals(discardoldlogfiles_mediabrowsercompat_itemreceiver.setTitle);
    }

    /* renamed from: o.nativeConfigureFromFile$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzro> {
        private read() {
        }

        public /* synthetic */ read(nativeConfigureFromFile nativeconfigurefromfile, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            nativeConfigureFromFile.MediaBrowserCompat$CustomActionResultReceiver(nativeConfigureFromFile.this, (zzro) obj);
        }
    }

    public void onDestroy() {
        StreetViewPanoramaOrientation streetViewPanoramaOrientation = this.PlaybackStateCompat$CustomAction;
        if (!streetViewPanoramaOrientation.MediaBrowserCompat$MediaItem.isDisposed()) {
            streetViewPanoramaOrientation.MediaBrowserCompat$MediaItem.dispose();
        }
        whenAll whenall = this.MediaBrowserCompat$SearchResultReceiver;
        if (!whenall.MediaBrowserCompat$MediaItem.isDisposed()) {
            whenall.MediaBrowserCompat$MediaItem.dispose();
        }
        newLoader newloader = this.f2897x50fd9e4a;
        if (!newloader.MediaBrowserCompat$MediaItem.isDisposed()) {
            newloader.MediaBrowserCompat$MediaItem.dispose();
        }
        FinalizableWeakReference finalizableWeakReference = this.MediaSessionCompat$QueueItem;
        if (!finalizableWeakReference.MediaBrowserCompat$MediaItem.isDisposed()) {
            finalizableWeakReference.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: o.nativeConfigureFromFile$write */
    final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<EasycashHeaderAdapter$LoanHeaderViewHolder>> {
        private write() {
        }

        /* synthetic */ write(nativeConfigureFromFile nativeconfigurefromfile, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            nativeConfigureFromFile nativeconfigurefromfile = nativeConfigureFromFile.this;
            nativeGetProcessedImage nativegetprocessedimage = new nativeGetProcessedImage(this, (List) obj);
            if (nativeconfigurefromfile.RatingCompat != null) {
                nativegetprocessedimage.IconCompatParcelizer(nativeconfigurefromfile.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            super.onError(th);
            nativeConfigureFromFile nativeconfigurefromfile = nativeConfigureFromFile.this;
            nativeProcessFrame nativeprocessframe = new nativeProcessFrame(this, th);
            if (nativeconfigurefromfile.RatingCompat != null) {
                nativeprocessframe.IconCompatParcelizer(nativeconfigurefromfile.RatingCompat);
            }
        }

        public final void onComplete() {
            super.onComplete();
            nativeConfigureFromFile nativeconfigurefromfile = nativeConfigureFromFile.this;
            area area = area.read;
            if (nativeconfigurefromfile.RatingCompat != null) {
                area.IconCompatParcelizer(nativeconfigurefromfile.RatingCompat);
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(nativeConfigureFromFile nativeconfigurefromfile, List list) {
        isSupportFragmentClass issupportfragmentclass;
        if (list != null) {
            show show = new show(list);
            show show2 = new show(show.write, new getNextTransition(show.IconCompatParcelizer, nativeGrabImageFrame.write));
            if (show2.IconCompatParcelizer.hasNext()) {
                issupportfragmentclass = isSupportFragmentClass.read(show2.IconCompatParcelizer.next());
            } else {
                issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
            }
            if (issupportfragmentclass.IconCompatParcelizer != null) {
                T t = issupportfragmentclass.IconCompatParcelizer;
                if (t != null) {
                    nativeconfigurefromfile.MediaDescriptionCompat = (discardOldLogFiles$MediaBrowserCompat$ItemReceiver) t;
                    return;
                }
                throw new NoSuchElementException("No value present");
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(nativeConfigureFromFile nativeconfigurefromfile, zzro zzro) {
        nativeconfigurefromfile.PlaybackStateCompat$CustomAction.MediaBrowserCompat$ItemReceiver(zzro);
        nativeconfigurefromfile.PlaybackStateCompat$CustomAction.IconCompatParcelizer(new C5030x3f61e9c2(nativeconfigurefromfile, (byte) 0));
    }
}
