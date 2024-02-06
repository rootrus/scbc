package p040o;

import okhttp3.internal.cache.DiskLruCache;
import p040o.AlertController$RecycleListView;
import p040o.CheckCaptureModule;
import p040o.Synchronized;
import p040o.writeUInt64NoTag;

/* renamed from: o.loadFromFile */
public final class loadFromFile extends writeUInt64NoTag<CheckCaptureModule.C6375a.IconCompatParcelizer> {
    private final setReferenceCounted IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final Synchronized.SynchronizedAsMapEntries.C38351.C38361 read;

    /* renamed from: o.loadFromFile$read */
    static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule.C6375a.IconCompatParcelizer> {
        public static final read read = new read();

        read() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            CheckCaptureModule.C6375a.IconCompatParcelizer iconCompatParcelizer = (CheckCaptureModule.C6375a.IconCompatParcelizer) obj;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.read("");
            }
        }
    }

    /* renamed from: o.loadFromFile$write */
    static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<CheckCaptureModule.C6375a.IconCompatParcelizer> {
        public static final write read = new write();

        write() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            CheckCaptureModule.C6375a.IconCompatParcelizer iconCompatParcelizer = (CheckCaptureModule.C6375a.IconCompatParcelizer) obj;
            if (iconCompatParcelizer != null) {
                iconCompatParcelizer.write();
            }
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public loadFromFile(RegularImmutableBiMap regularImmutableBiMap, setReferenceCounted setreferencecounted, Synchronized.SynchronizedAsMapEntries.C38351.C38361 r4) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) setreferencecounted, "debitCardATMCase");
        onGetStartedClick.write((Object) r4, "assetDisplayMapper");
        this.IconCompatParcelizer = setreferencecounted;
        this.read = r4;
    }

    public final void write() {
        zzrn zzrn;
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = write.read;
        boolean z = true;
        if (this.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(this.RatingCompat);
        }
        zzvf RatingCompat = this.IconCompatParcelizer.read.RatingCompat();
        if (RatingCompat != null && (zzrn = RatingCompat.IconCompatParcelizer) != null && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) DiskLruCache.VERSION_1, (Object) zzrn.write)) {
            if (AlertController$RecycleListView.read.MediaBrowserCompat$ItemReceiver(zzrn.MediaBrowserCompat$CustomActionResultReceiver)) {
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer2 = read.read;
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    iconCompatParcelizer2.IconCompatParcelizer(this.RatingCompat);
                    return;
                }
                return;
            }
            String str = zzrn.MediaBrowserCompat$CustomActionResultReceiver;
            if (str != null) {
                writeUInt64NoTag.IconCompatParcelizer loadfromfile_mediabrowsercompat_itemreceiver = new loadFromFile$MediaBrowserCompat$ItemReceiver(str, this);
                if (this.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    loadfromfile_mediabrowsercompat_itemreceiver.IconCompatParcelizer(this.RatingCompat);
                }
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        setReferenceCounted setreferencecounted = this.IconCompatParcelizer;
        if (!setreferencecounted.MediaBrowserCompat$MediaItem.isDisposed()) {
            setreferencecounted.MediaBrowserCompat$MediaItem.dispose();
        }
    }
}
