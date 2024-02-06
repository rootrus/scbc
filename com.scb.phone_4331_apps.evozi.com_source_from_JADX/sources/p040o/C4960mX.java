package p040o;

import java.util.List;
import p040o.LocationSource;
import p040o.access$2300;
import p040o.getDocumentFramingError;

/* renamed from: o.mX */
public class C4960mX extends writeUInt64NoTag<getDocumentFramingError.read> {
    public final topPrivateDomain IconCompatParcelizer;
    public final transparency MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$SearchResultReceiver = 1;
    /* access modifiers changed from: private */
    public lexicographicalComparator MediaDescriptionCompat;
    public int read = 1;
    public final clearConditionalUserPropertyAs write;

    @HmlPinActivity
    public C4960mX(RegularImmutableBiMap regularImmutableBiMap, transparency transparency, topPrivateDomain topprivatedomain, lexicographicalComparator lexicographicalcomparator, clearConditionalUserPropertyAs clearconditionaluserpropertyas) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = topprivatedomain;
        this.MediaDescriptionCompat = lexicographicalcomparator;
        this.MediaBrowserCompat$ItemReceiver = transparency;
        this.write = clearconditionaluserpropertyas;
    }

    public void onDestroy() {
        super.onDestroy();
        clearConditionalUserPropertyAs clearconditionaluserpropertyas = this.write;
        if (!clearconditionaluserpropertyas.MediaBrowserCompat$MediaItem.isDisposed()) {
            clearconditionaluserpropertyas.MediaBrowserCompat$MediaItem.dispose();
        }
    }

    /* renamed from: o.mX$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<LocationSource.OnLocationChangedListener> {
        private write() {
        }

        public /* synthetic */ write(C4960mX mXVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            LocationSource.OnLocationChangedListener onLocationChangedListener = (LocationSource.OnLocationChangedListener) obj;
            boolean z = true;
            if (C4960mX.this.RatingCompat != null) {
                List<Out> MediaBrowserCompat$ItemReceiver = lexicographicalComparator.MediaBrowserCompat$ItemReceiver(onLocationChangedListener.write, new parent(C4960mX.this.MediaDescriptionCompat, C4960mX.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver.setItemInvoker()));
                C4960mX mXVar = C4960mX.this;
                C5091oi oiVar = new C5091oi(MediaBrowserCompat$ItemReceiver);
                if (mXVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    oiVar.IconCompatParcelizer(mXVar.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            if (!C4960mX.this.MediaBrowserCompat$SearchResultReceiver(th)) {
                if (C4960mX.this.RatingCompat != null) {
                    C4960mX mXVar = C4960mX.this;
                    mXVar.MediaBrowserCompat$ItemReceiver(mXVar.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
                }
            }
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4960mX mXVar) {
        if (mXVar.RatingCompat != null) {
            mXVar.RatingCompat.ay_();
        }
    }

    static /* synthetic */ void MediaMetadataCompat(C4960mX mXVar) {
        if (mXVar.RatingCompat != null) {
            mXVar.RatingCompat.ay_();
        }
    }
}
