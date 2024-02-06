package p040o;

import p040o.AppMeasurementSdk;
import p040o.GoogleMap;
import p040o.StandardTable;

/* renamed from: o.LevelnessEvent */
public class LevelnessEvent extends writeUInt64NoTag<PassportParameters_MembersInjector> {
    public String IconCompatParcelizer;
    public boolean MediaBrowserCompat$ItemReceiver = false;
    /* access modifiers changed from: private */
    public final LineReader MediaBrowserCompat$MediaItem;
    private final AppMeasurementSdk.EventInterceptor MediaBrowserCompat$SearchResultReceiver;
    private final equalTo MediaDescriptionCompat;
    final StandardTable.Column.EntrySetIterator read;
    final toLongArray write;

    static /* synthetic */ int IconCompatParcelizer() {
        return 0;
    }

    @HmlPinActivity
    public LevelnessEvent(RegularImmutableBiMap regularImmutableBiMap, AppMeasurementSdk.EventInterceptor eventInterceptor, StandardTable.Column.EntrySetIterator entrySetIterator, toLongArray tolongarray, equalTo equalto, LineReader lineReader) {
        super(regularImmutableBiMap);
        this.MediaBrowserCompat$SearchResultReceiver = eventInterceptor;
        this.read = entrySetIterator;
        this.write = tolongarray;
        this.MediaDescriptionCompat = equalto;
        this.MediaBrowserCompat$MediaItem = lineReader;
    }

    public void IconCompatParcelizer(final boolean z) {
        boolean z2 = true;
        if (this.MediaBrowserCompat$ItemReceiver) {
            if (this.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            this.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(z);
            this.MediaDescriptionCompat.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<GoogleMap.OnMapLongClickListener>() {
                public final /* synthetic */ void onNext(Object obj) {
                    GoogleMap.OnMapLongClickListener onMapLongClickListener = (GoogleMap.OnMapLongClickListener) obj;
                    super.onNext(onMapLongClickListener);
                    LevelnessEvent.read(LevelnessEvent.this);
                    LevelnessEvent levelnessEvent = LevelnessEvent.this;
                    setHighlightColor sethighlightcolor = new setHighlightColor(this, z, onMapLongClickListener);
                    if (levelnessEvent.RatingCompat != null) {
                        sethighlightcolor.IconCompatParcelizer(levelnessEvent.RatingCompat);
                    }
                }

                public final void onError(Throwable th) {
                    super.onError(th);
                    LevelnessEvent.write(LevelnessEvent.this);
                    LevelnessEvent levelnessEvent = LevelnessEvent.this;
                    setImageCacheType setimagecachetype = new setImageCacheType(this, th);
                    if (levelnessEvent.RatingCompat != null) {
                        setimagecachetype.IconCompatParcelizer(levelnessEvent.RatingCompat);
                    }
                }
            });
            return;
        }
        setRetainImage setretainimage = new setRetainImage(this, z);
        if (this.RatingCompat == null) {
            z2 = false;
        }
        if (z2) {
            setretainimage.IconCompatParcelizer(this.RatingCompat);
        }
    }

    public void onDestroy() {
        AppMeasurementSdk.EventInterceptor eventInterceptor = this.MediaBrowserCompat$SearchResultReceiver;
        if (!eventInterceptor.MediaBrowserCompat$MediaItem.isDisposed()) {
            eventInterceptor.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    static /* synthetic */ void read(LevelnessEvent levelnessEvent) {
        if (levelnessEvent.RatingCompat != null) {
            levelnessEvent.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void write(LevelnessEvent levelnessEvent) {
        if (levelnessEvent.RatingCompat != null) {
            levelnessEvent.RatingCompat.aj_();
        }
    }
}
