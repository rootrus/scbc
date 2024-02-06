package p040o;

import p040o.OnDeviceIdExtractor;
import p040o.writeUInt64NoTag;

/* renamed from: o.hm */
public final class C4775hm extends writeUInt64NoTag<OnDeviceIdExtractor.write> {
    final newReader read;
    public final logEventNoInterceptor write;

    /* renamed from: o.hm$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.write> {
        private /* synthetic */ standardStartAndWait write;

        public IconCompatParcelizer(standardStartAndWait standardstartandwait) {
            this.write = standardstartandwait;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            String str = this.write.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) str, "successfulDisplay.remarks");
            ((OnDeviceIdExtractor.write) obj).MediaBrowserCompat$SearchResultReceiver(str);
        }
    }

    /* renamed from: o.hm$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.write> {
        private /* synthetic */ standardStartAndWait IconCompatParcelizer;

        public read(standardStartAndWait standardstartandwait) {
            this.IconCompatParcelizer = standardstartandwait;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((OnDeviceIdExtractor.write) obj).read(this.IconCompatParcelizer);
        }
    }

    /* renamed from: o.hm$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<OnDeviceIdExtractor.write> {
        private /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ standardStartAndWait MediaBrowserCompat$ItemReceiver;
        private /* synthetic */ C4775hm read;
        private /* synthetic */ boolean write;

        public write(C4775hm hmVar, boolean z, standardStartAndWait standardstartandwait, boolean z2) {
            this.read = hmVar;
            this.MediaBrowserCompat$CustomActionResultReceiver = z;
            this.MediaBrowserCompat$ItemReceiver = standardstartandwait;
            this.write = z2;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((OnDeviceIdExtractor.write) obj).write(this.MediaBrowserCompat$CustomActionResultReceiver, this.read.read.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver), this.write);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public C4775hm(RegularImmutableBiMap regularImmutableBiMap, newReader newreader, logEventNoInterceptor logeventnointerceptor) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) newreader, "prepaidActivationSlipMapper");
        onGetStartedClick.write((Object) logeventnointerceptor, "successCase");
        this.read = newreader;
        this.write = logeventnointerceptor;
    }

    public static final /* synthetic */ void read(C4775hm hmVar) {
        if (hmVar.RatingCompat != null) {
            hmVar.RatingCompat.aj_();
        }
    }
}
