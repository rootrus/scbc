package p040o;

import java.util.ArrayList;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AppMeasurement;
import p040o.MapConstraints;
import p040o.access$2300;
import p040o.getBottomRightCornerHeight;
import p040o.getBottomRightCornerHeight.write;

/* renamed from: o.fn */
public class C4433fn<T extends getBottomRightCornerHeight.write> extends writeUInt64NoTag<T> {
    protected final AppMeasurement.Param read;
    /* access modifiers changed from: private */
    public final MapConstraints.ConstrainedMultimap.C36372 write;

    @HmlPinActivity
    public C4433fn(RegularImmutableBiMap regularImmutableBiMap, MapConstraints.ConstrainedMultimap.C36372 r2, AppMeasurement.Param param) {
        super(regularImmutableBiMap);
        this.read = param;
        this.write = r2;
    }

    /* renamed from: o.fn$write */
    final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        public final void onComplete() {
        }

        private write() {
        }

        /* synthetic */ write(C4433fn fnVar, byte b) {
            this();
        }

        public final void onError(Throwable th) {
            C4433fn.this.MediaBrowserCompat$ItemReceiver(C4433fn.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4433fn fnVar = C4433fn.this;
            C9943fp fpVar = C9943fp.write;
            if (fnVar.RatingCompat != null) {
                fpVar.IconCompatParcelizer(fnVar.RatingCompat);
            }
        }
    }

    /* renamed from: o.fn$read */
    final class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<zzsj> {
        public final void onComplete() {
        }

        private read() {
        }

        /* synthetic */ read(C4433fn fnVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            zzsj zzsj = (zzsj) obj;
            C4433fn.read(C4433fn.this);
            boolean z = false;
            if (!(C4433fn.this.RatingCompat != null)) {
                return;
            }
            if (zzsj != null && zzsj.MediaBrowserCompat$CustomActionResultReceiver.size() > 1) {
                C4433fn fnVar = C4433fn.this;
                C4430fl flVar = new C4430fl(this, zzsj);
                if (fnVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    flVar.IconCompatParcelizer(fnVar.RatingCompat);
                }
            } else if (zzsj != null && zzsj.MediaBrowserCompat$CustomActionResultReceiver.size() == 1) {
                C4433fn fnVar2 = C4433fn.this;
                C4424fi fiVar = new C4424fi(this, zzsj);
                if (fnVar2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    fiVar.IconCompatParcelizer(fnVar2.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            C4433fn.this.MediaBrowserCompat$ItemReceiver(C4433fn.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.NAVIGATE_BACK));
        }

        public final /* synthetic */ void IconCompatParcelizer(zzsj zzsj, getBottomRightCornerHeight.write write) {
            List list;
            MapConstraints.ConstrainedMultimap.C36372 MediaBrowserCompat$ItemReceiver = C4433fn.this.write;
            zzvf RatingCompat = C4433fn.this.read.MediaBrowserCompat$ItemReceiver.RatingCompat();
            if (RatingCompat != null) {
                list = RatingCompat.MediaBrowserCompat$ItemReceiver;
            } else {
                list = new ArrayList();
            }
            write.read(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(zzsj, list, C4433fn.this.read.MediaBrowserCompat$ItemReceiver.setItemInvoker()).MediaBrowserCompat$ItemReceiver());
        }

        public final /* synthetic */ void write(zzsj zzsj, getBottomRightCornerHeight.write write) {
            List list;
            MapConstraints.ConstrainedMultimap.C36372 MediaBrowserCompat$ItemReceiver = C4433fn.this.write;
            zzvf RatingCompat = C4433fn.this.read.MediaBrowserCompat$ItemReceiver.RatingCompat();
            if (RatingCompat != null) {
                list = RatingCompat.MediaBrowserCompat$ItemReceiver;
            } else {
                list = new ArrayList();
            }
            write.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(zzsj, list, C4433fn.this.read.MediaBrowserCompat$ItemReceiver.setItemInvoker()).MediaBrowserCompat$ItemReceiver());
        }
    }

    static /* synthetic */ void read(C4433fn fnVar) {
        if (fnVar.RatingCompat != null) {
            fnVar.RatingCompat.ay_();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        this.read.write();
        this.read.IconCompatParcelizer(new read(this, (byte) 0));
    }

    public final void IconCompatParcelizer(String str) {
        if (this.RatingCompat != null) {
            this.RatingCompat.Keep();
        }
        HashMultiset MediaBrowserCompat$ItemReceiver = HashMultiset.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = DiskLruCache.VERSION_1;
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = str;
        ArrayList arrayList = new ArrayList();
        arrayList.add(MediaBrowserCompat$ItemReceiver);
        ImmutableAsList read2 = ImmutableAsList.read();
        read2.MediaBrowserCompat$ItemReceiver = arrayList;
        this.read.write(read2);
        this.read.IconCompatParcelizer(new write(this, (byte) 0));
    }
}
