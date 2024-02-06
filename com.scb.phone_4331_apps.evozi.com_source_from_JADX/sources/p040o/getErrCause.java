package p040o;

import p040o.CharMatcher;

/* renamed from: o.getErrCause */
public class getErrCause extends writeUInt64NoTag<getLatestCachedModelDataBuildInfo> {
    public CharMatcher.LookupTable IconCompatParcelizer;
    public String MediaBrowserCompat$ItemReceiver;
    public CharMatcher.C3167Or read;
    final toLongArray write;

    @HmlPinActivity
    public getErrCause(RegularImmutableBiMap regularImmutableBiMap, CharMatcher.C3167Or or, CharMatcher.LookupTable lookupTable, toLongArray tolongarray) {
        super(regularImmutableBiMap);
        this.read = or;
        this.IconCompatParcelizer = lookupTable;
        this.write = tolongarray;
    }

    /* renamed from: o.getErrCause$write */
    public class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        public write() {
        }

        static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(getLatestCachedModelDataBuildInfo getlatestcachedmodeldatabuildinfo) {
            getlatestcachedmodeldatabuildinfo.aj_();
            getlatestcachedmodeldatabuildinfo.MediaBrowserCompat$SearchResultReceiver();
        }

        public final void onError(Throwable th) {
            super.onError(th);
            getErrCause geterrcause = getErrCause.this;
            ImgClassificationEventAltDao imgClassificationEventAltDao = new ImgClassificationEventAltDao(this, th);
            if (geterrcause.RatingCompat != null) {
                imgClassificationEventAltDao.IconCompatParcelizer(geterrcause.RatingCompat);
            }
        }

        public final /* synthetic */ void onNext(Object obj) {
            getErrCause geterrcause = getErrCause.this;
            setStartTime setstarttime = setStartTime.write;
            if (geterrcause.RatingCompat != null) {
                setstarttime.IconCompatParcelizer(geterrcause.RatingCompat);
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        CharMatcher.C3167Or or = this.read;
        if (!or.MediaBrowserCompat$MediaItem.isDisposed()) {
            or.MediaBrowserCompat$MediaItem.dispose();
        }
    }
}
