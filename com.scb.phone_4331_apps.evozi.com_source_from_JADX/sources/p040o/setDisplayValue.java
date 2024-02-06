package p040o;

import p040o.proxyGetOnDevicePassportDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.setDisplayValue */
public final class setDisplayValue extends writeUInt64NoTag<proxyGetOnDevicePassportDeserializer.IconCompatParcelizer> {
    final union write;

    /* renamed from: o.setDisplayValue$read */
    public static final class read<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetOnDevicePassportDeserializer.IconCompatParcelizer> {
        private /* synthetic */ setDisplayValue read;

        public read(setDisplayValue setdisplayvalue) {
            this.read = setdisplayvalue;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            proxyGetOnDevicePassportDeserializer.IconCompatParcelizer iconCompatParcelizer = (proxyGetOnDevicePassportDeserializer.IconCompatParcelizer) obj;
            union union = this.read.write;
            String MediaBrowserCompat$ItemReceiver = union.MediaBrowserCompat$ItemReceiver("/10X1/salarySlipKofax/reviewTutorial/do_review_th.gif", "/10X1/salarySlipKofax/reviewTutorial/do_review_en.gif");
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "transformCurrentLanguage…if\"\n                    )");
            String c_ = union.mo26549c_("/10X1/salarySlipKofax/reviewTutorial/dont_review.png");
            onGetStartedClick.IconCompatParcelizer((Object) c_, "transformURL(\"/10X1/sala…utorial/dont_review.png\")");
            iconCompatParcelizer.MediaBrowserCompat$ItemReceiver(new awaitEvent(MediaBrowserCompat$ItemReceiver, c_));
            iconCompatParcelizer.read();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setDisplayValue(RegularImmutableBiMap regularImmutableBiMap, union union) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) union, "displayMapper");
        this.write = union;
    }
}
