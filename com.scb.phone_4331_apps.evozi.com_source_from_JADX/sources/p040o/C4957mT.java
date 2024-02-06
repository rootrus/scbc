package p040o;

import java.util.List;
import p040o.LocationSource;
import p040o.access$2300;
import p040o.getDocumentFramingError;

/* renamed from: o.mT */
public class C4957mT extends writeUInt64NoTag<getDocumentFramingError.write> {
    public int IconCompatParcelizer = 1;
    public final StreetViewPanoramaLocation MediaBrowserCompat$ItemReceiver;
    public int MediaDescriptionCompat = 1;
    /* access modifiers changed from: private */
    public lexicographicalComparator MediaMetadataCompat;
    public final transparency read;
    public final Booleans write;

    @HmlPinActivity
    public C4957mT(RegularImmutableBiMap regularImmutableBiMap, transparency transparency, Booleans booleans, lexicographicalComparator lexicographicalcomparator, StreetViewPanoramaLocation streetViewPanoramaLocation) {
        super(regularImmutableBiMap);
        this.write = booleans;
        this.MediaMetadataCompat = lexicographicalcomparator;
        this.read = transparency;
        this.MediaBrowserCompat$ItemReceiver = streetViewPanoramaLocation;
    }

    public void onDestroy() {
        super.onDestroy();
        StreetViewPanoramaLocation streetViewPanoramaLocation = this.MediaBrowserCompat$ItemReceiver;
        if (!streetViewPanoramaLocation.MediaBrowserCompat$MediaItem.isDisposed()) {
            streetViewPanoramaLocation.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* renamed from: o.mT$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<LocationSource.OnLocationChangedListener> {
        private write() {
        }

        public /* synthetic */ write(C4957mT mTVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            LocationSource.OnLocationChangedListener onLocationChangedListener = (LocationSource.OnLocationChangedListener) obj;
            boolean z = true;
            if (C4957mT.this.RatingCompat != null) {
                List<Out> MediaBrowserCompat$ItemReceiver2 = lexicographicalComparator.MediaBrowserCompat$ItemReceiver(onLocationChangedListener.write, new parent(C4957mT.this.MediaMetadataCompat, C4957mT.this.read.MediaBrowserCompat$ItemReceiver.setItemInvoker()));
                C4957mT mTVar = C4957mT.this;
                C5025nX nXVar = new C5025nX(MediaBrowserCompat$ItemReceiver2);
                if (mTVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    nXVar.IconCompatParcelizer(mTVar.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            if (!C4957mT.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                if (C4957mT.this.RatingCompat != null) {
                    C4957mT mTVar = C4957mT.this;
                    mTVar.MediaBrowserCompat$ItemReceiver(mTVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                }
            }
        }
    }

    /* renamed from: o.mT$read */
    public final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<deactivate> {
        private read() {
        }

        public /* synthetic */ read(C4957mT mTVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            int i;
            int i2;
            deactivate deactivate = (deactivate) obj;
            boolean z = false;
            if (C4957mT.this.RatingCompat != null) {
                if (deactivate.write > 0) {
                    i2 = deactivate.write;
                    i = deactivate.MediaBrowserCompat$CustomActionResultReceiver + 1;
                } else {
                    i = deactivate.MediaBrowserCompat$CustomActionResultReceiver;
                    i2 = 1;
                }
                if (C4957mT.this.IconCompatParcelizer == 1) {
                    C4957mT mTVar = C4957mT.this;
                    C4956mS mSVar = new C4956mS(this, deactivate);
                    if (mTVar.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        mSVar.IconCompatParcelizer(mTVar.RatingCompat);
                    }
                    int unused = C4957mT.this.IconCompatParcelizer = i;
                    int unused2 = C4957mT.this.MediaDescriptionCompat = i2;
                } else if (C4957mT.this.IconCompatParcelizer > deactivate.MediaBrowserCompat$CustomActionResultReceiver || C4957mT.this.IconCompatParcelizer > deactivate.write) {
                    C4957mT mTVar2 = C4957mT.this;
                    C5026nY nYVar = new C5026nY(deactivate);
                    if (mTVar2.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        nYVar.IconCompatParcelizer(mTVar2.RatingCompat);
                    }
                    int unused3 = C4957mT.this.MediaDescriptionCompat = 1;
                } else {
                    C4957mT mTVar3 = C4957mT.this;
                    C5085oa oaVar = new C5085oa(this, deactivate);
                    if (mTVar3.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        oaVar.IconCompatParcelizer(mTVar3.RatingCompat);
                    }
                    int unused4 = C4957mT.this.IconCompatParcelizer = i;
                    int unused5 = C4957mT.this.MediaDescriptionCompat = i2;
                }
                C4957mT.write(C4957mT.this);
            }
        }

        public final void onComplete() {
            C4957mT.MediaBrowserCompat$MediaItem(C4957mT.this);
        }

        public final void onError(Throwable th) {
            if (!C4957mT.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                boolean z = true;
                if (C4957mT.this.RatingCompat != null) {
                    C4957mT mTVar = C4957mT.this;
                    C5027nZ nZVar = new C5027nZ(this, th);
                    if (mTVar.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        nZVar.IconCompatParcelizer(mTVar.RatingCompat);
                    }
                }
            }
        }
    }

    static /* synthetic */ void write(C4957mT mTVar) {
        if (mTVar.RatingCompat != null) {
            mTVar.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$MediaItem(C4957mT mTVar) {
        if (mTVar.RatingCompat != null) {
            mTVar.RatingCompat.ay_();
        }
    }
}
