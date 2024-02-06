package p040o;

import p040o.AbstractBiMap;
import p040o.access$2300;
import p040o.getBlackStreakMaxHeight;

/* renamed from: o.kd */
public class C4897kd extends writeUInt64NoTag<getBlackStreakMaxHeight.write> {
    public final getCompatIPv4Address IconCompatParcelizer;
    /* access modifiers changed from: private */
    public final AbstractBiMap.EntrySet.C29881 MediaBrowserCompat$ItemReceiver;
    /* access modifiers changed from: private */
    public final transparency read;
    public final including write;

    @HmlPinActivity
    public C4897kd(RegularImmutableBiMap regularImmutableBiMap, including including, getCompatIPv4Address getcompatipv4address, transparency transparency, AbstractBiMap.EntrySet.C29881 r5) {
        super(regularImmutableBiMap);
        this.write = including;
        this.IconCompatParcelizer = getcompatipv4address;
        this.read = transparency;
        this.MediaBrowserCompat$ItemReceiver = r5;
    }

    /* renamed from: o.kd$write */
    public final class write extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<Boolean> {
        final String MediaBrowserCompat$CustomActionResultReceiver;

        public write(String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = str;
        }

        public final void onError(Throwable th) {
            C4897kd.this.MediaBrowserCompat$ItemReceiver(C4897kd.this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
        }

        public final void onComplete() {
            C4897kd.IconCompatParcelizer(C4897kd.this);
        }

        public final /* synthetic */ void onNext(Object obj) {
            C4897kd.this.read.IconCompatParcelizer.read();
            C4897kd.this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.write();
            C4897kd kdVar = C4897kd.this;
            getIsOcrReadFieldName getisocrreadfieldname = new getIsOcrReadFieldName(this);
            if (kdVar.RatingCompat != null) {
                getisocrreadfieldname.IconCompatParcelizer(kdVar.RatingCompat);
            }
        }
    }

    static /* synthetic */ void IconCompatParcelizer(C4897kd kdVar) {
        if (kdVar.RatingCompat != null) {
            kdVar.RatingCompat.aj_();
        }
    }
}
