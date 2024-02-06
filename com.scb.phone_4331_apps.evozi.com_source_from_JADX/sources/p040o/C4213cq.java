package p040o;

import com.scb.phone.view.activity.partner.PartnerDiscoverWebViewActivity;
import java.util.List;
import p040o.Iterables;

/* renamed from: o.cq */
public class C4213cq extends writeUInt64NoTag<KtaJsonCheck$MediaBrowserCompat$MediaItem> {
    public List<setDisplayVersion> IconCompatParcelizer;
    public final Iterables.C352212 MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final ByteProcessor MediaMetadataCompat;
    public final onRebind read;
    public int write;

    @HmlPinActivity
    public C4213cq(RegularImmutableBiMap regularImmutableBiMap, ByteProcessor byteProcessor, onRebind onrebind, Iterables.C352212 r4) {
        super(regularImmutableBiMap);
        this.MediaMetadataCompat = byteProcessor;
        this.read = onrebind;
        this.MediaBrowserCompat$ItemReceiver = r4;
    }

    public void onDestroy() {
        onRebind onrebind = this.read;
        if (!onrebind.MediaBrowserCompat$MediaItem.isDisposed()) {
            onrebind.MediaBrowserCompat$MediaItem.dispose();
        }
        super.onDestroy();
    }

    /* renamed from: o.cq$read */
    public class read extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<PartnerDiscoverWebViewActivity.write>> {
        public read() {
        }

        public final /* synthetic */ void onNext(Object obj) {
            List list = (List) obj;
            C4213cq.MediaBrowserCompat$ItemReceiver(C4213cq.this);
            boolean z = true;
            if (list == null || list.size() <= 0) {
                C4213cq cqVar = C4213cq.this;
                C4150cI cIVar = C4150cI.MediaBrowserCompat$CustomActionResultReceiver;
                if (cqVar.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    cIVar.IconCompatParcelizer(cqVar.RatingCompat);
                    return;
                }
                return;
            }
            C4213cq cqVar2 = C4213cq.this;
            List unused = cqVar2.IconCompatParcelizer = ByteProcessor.MediaBrowserCompat$ItemReceiver(list, new processBytes(cqVar2.MediaMetadataCompat));
            C4213cq cqVar3 = C4213cq.this;
            C4152cL cLVar = new C4152cL(this);
            if (cqVar3.RatingCompat == null) {
                z = false;
            }
            if (z) {
                cLVar.IconCompatParcelizer(cqVar3.RatingCompat);
            }
        }

        public final void onError(Throwable th) {
            C4213cq.IconCompatParcelizer(C4213cq.this);
            C4213cq cqVar = C4213cq.this;
            C4150cI cIVar = C4150cI.MediaBrowserCompat$CustomActionResultReceiver;
            if (cqVar.RatingCompat != null) {
                cIVar.IconCompatParcelizer(cqVar.RatingCompat);
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4213cq cqVar) {
        if (cqVar.RatingCompat != null) {
            cqVar.RatingCompat.aj_();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(C4213cq cqVar) {
        if (cqVar.RatingCompat != null) {
            cqVar.RatingCompat.aj_();
        }
    }
}
