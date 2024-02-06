package p040o;

import java.util.List;
import p040o.ByteStreams;
import p040o.FinalizableReferenceQueue;
import p040o.access$2300;

/* renamed from: o.dG */
public class C4249dG extends writeUInt64NoTag<C6930xffe1298e> {
    public final FinalizableReferenceQueue.DirectLoader IconCompatParcelizer;
    public isTrafficEnabled MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final ByteStreams.C31364 read;
    public List<isTrafficEnabled> write;

    @HmlPinActivity
    public C4249dG(RegularImmutableBiMap regularImmutableBiMap, FinalizableReferenceQueue.DirectLoader directLoader, ByteStreams.C31364 r3) {
        super(regularImmutableBiMap);
        this.IconCompatParcelizer = directLoader;
        this.read = r3;
    }

    /* renamed from: o.dG$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<isTrafficEnabled>> {
        private read() {
        }

        public /* synthetic */ read(C4249dG dGVar, byte b) {
            this();
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            C4249dG.MediaBrowserCompat$ItemReceiver(C4249dG.this);
            C4249dG.this.write = list;
            if (list.size() > 0) {
                boolean z = false;
                C4249dG.this.MediaBrowserCompat$ItemReceiver = (isTrafficEnabled) list.get(0);
                C4249dG dGVar = C4249dG.this;
                C4222cx cxVar = new C4222cx(this, list);
                if (dGVar.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    cxVar.IconCompatParcelizer(dGVar.RatingCompat);
                }
            }
        }

        public final void onError(Throwable th) {
            C4249dG.MediaBrowserCompat$CustomActionResultReceiver(C4249dG.this);
            C4249dG.this.MediaBrowserCompat$ItemReceiver(C4249dG.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4249dG dGVar) {
        if (dGVar.RatingCompat != null) {
            dGVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(C4249dG dGVar) {
        if (dGVar.RatingCompat != null) {
            dGVar.RatingCompat.aj_();
        }
    }
}
