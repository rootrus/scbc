package p040o;

import java.util.ArrayList;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AppMeasurement;
import p040o.ImmutableBiMap;
import p040o.MapConstraints;
import p040o.access$2300;
import p040o.getCompressedFrontImageSize;
import p040o.getCompressedFrontImageSize.read;

/* renamed from: o.fz */
public class C4443fz<T extends getCompressedFrontImageSize.read> extends writeUInt64NoTag<T> {
    protected final AppMeasurement.OnEventListener read;
    /* access modifiers changed from: private */
    public final MapConstraints.ConstrainedMultimap.C36372 write;

    @HmlPinActivity
    public C4443fz(RegularImmutableBiMap regularImmutableBiMap, MapConstraints.ConstrainedMultimap.C36372 r2, AppMeasurement.OnEventListener onEventListener) {
        super(regularImmutableBiMap);
        this.read = onEventListener;
        this.write = r2;
    }

    /* renamed from: o.fz$read */
    final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        private read() {
        }

        /* synthetic */ read(C4443fz fzVar, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            C4443fz.this.MediaBrowserCompat$ItemReceiver(C4443fz.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4443fz fzVar = C4443fz.this;
            C9941fo foVar = C9941fo.MediaBrowserCompat$CustomActionResultReceiver;
            if (fzVar.RatingCompat != null) {
                foVar.IconCompatParcelizer(fzVar.RatingCompat);
            }
        }
    }

    static /* synthetic */ void read(C4443fz fzVar) {
        if (fzVar.RatingCompat != null) {
            fzVar.RatingCompat.ay_();
        }
    }

    public final void write() {
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        this.read.read();
        this.read.IconCompatParcelizer(new fz$MediaBrowserCompat$ItemReceiver(this, (byte) 0));
    }

    public final void write(String str) {
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        ArrayList arrayList = new ArrayList();
        smear read2 = smear.read();
        read2.write = DiskLruCache.VERSION_1;
        read2.MediaBrowserCompat$CustomActionResultReceiver = str;
        arrayList.add(read2);
        ImmutableBiMap.EmptyBiMap read3 = ImmutableBiMap.EmptyBiMap.read();
        read3.MediaBrowserCompat$ItemReceiver = arrayList;
        this.read.read(read3);
        this.read.IconCompatParcelizer(new read(this, (byte) 0));
    }
}
