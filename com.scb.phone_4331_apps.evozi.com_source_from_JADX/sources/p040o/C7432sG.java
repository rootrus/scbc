package p040o;

import android.net.Uri;
import p040o.UnsignedBytes;
import p040o.getTopLeftCornerWidth;

/* renamed from: o.sG */
public class C7432sG extends writeUInt64NoTag<getTopLeftCornerWidth.ActionMenuItemView> {
    public boolean IconCompatParcelizer = true;
    public boolean MediaBrowserCompat$ItemReceiver;
    public int MediaBrowserCompat$MediaItem = 0;
    private final fadeIn MediaBrowserCompat$SearchResultReceiver;
    public int MediaDescriptionCompat = 0;
    public final sG$MediaBrowserCompat$CustomActionResultReceiver MediaMetadataCompat;
    /* access modifiers changed from: private */
    public final C7426sB MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public final C7435sJ ParcelableVolumeInfo;
    public Uri read;
    public isRelevant write;

    /* renamed from: o.sG$write */
    public interface write<T> {
        void MediaBrowserCompat$CustomActionResultReceiver(boolean z);

        void MediaBrowserCompat$ItemReceiver(String str);

        void write(T t);
    }

    @HmlPinActivity
    public C7432sG(UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.C39251 r1, fadeIn fadein, C7435sJ sJVar, C7426sB sBVar) {
        super(r1);
        this.MediaBrowserCompat$SearchResultReceiver = fadein;
        this.MediaSessionCompat$ResultReceiverWrapper = sBVar;
        this.ParcelableVolumeInfo = sJVar;
        this.MediaMetadataCompat = new sG$MediaBrowserCompat$CustomActionResultReceiver(this, (byte) 0);
    }

    public final void IconCompatParcelizer(Uri uri, int i, int i2) {
        this.MediaBrowserCompat$MediaItem = i;
        this.MediaDescriptionCompat = i2;
        if (!this.MediaBrowserCompat$ItemReceiver) {
            if (this.RatingCompat != null) {
                this.RatingCompat.AlertController$RecycleListView();
            }
            this.MediaBrowserCompat$SearchResultReceiver.write(uri != null ? uri.toString() : null, i, i2);
            this.MediaBrowserCompat$SearchResultReceiver.IconCompatParcelizer(new read(this, (byte) 0));
            this.read = null;
            return;
        }
        this.read = uri;
    }

    public void write() {
        this.IconCompatParcelizer = false;
        if (this.MediaBrowserCompat$CustomActionResultReceiver instanceof UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.C39251) {
            MediaBrowserCompat$ItemReceiver(((UnsignedBytes.LexicographicalComparatorHolder.UnsafeComparator.C39251) this.MediaBrowserCompat$CustomActionResultReceiver).write(new C7472sq(this)));
        }
    }

    /* renamed from: o.sG$read */
    final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<byte[]> {
        private read() {
        }

        /* synthetic */ read(C7432sG sGVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            C7432sG sGVar = C7432sG.this;
            C7521th thVar = new C7521th((byte[]) obj);
            if (sGVar.RatingCompat != null) {
                thVar.IconCompatParcelizer(sGVar.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            C7432sG.IconCompatParcelizer(C7432sG.this);
            C7432sG.this.write();
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C7432sG sGVar) {
        if (sGVar.RatingCompat != null) {
            sGVar.RatingCompat.aj_();
        }
    }
}
