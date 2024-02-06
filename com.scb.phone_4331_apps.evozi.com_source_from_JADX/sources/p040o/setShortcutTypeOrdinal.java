package p040o;

import p040o.proxyGetOnDevicePassportDeserializer;
import p040o.writeUInt64NoTag;

/* renamed from: o.setShortcutTypeOrdinal */
public final class setShortcutTypeOrdinal extends writeUInt64NoTag<proxyGetOnDevicePassportDeserializer.read> {
    public boolean IconCompatParcelizer = true;
    final union read;

    /* renamed from: o.setShortcutTypeOrdinal$write */
    public static final class write<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetOnDevicePassportDeserializer.read> {
        private /* synthetic */ setShortcutTypeOrdinal MediaBrowserCompat$ItemReceiver;

        public write(setShortcutTypeOrdinal setshortcuttypeordinal) {
            this.MediaBrowserCompat$ItemReceiver = setshortcuttypeordinal;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            proxyGetOnDevicePassportDeserializer.read read = (proxyGetOnDevicePassportDeserializer.read) obj;
            union union = this.MediaBrowserCompat$ItemReceiver.read;
            String MediaBrowserCompat$ItemReceiver2 = union.MediaBrowserCompat$ItemReceiver("/10X1/salarySlipKofax/cropTutorial/do_crop_th.gif", "/10X1/salarySlipKofax/cropTutorial/do_crop_en.gif");
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver2, "transformCurrentLanguage…if\"\n                    )");
            String c_ = union.mo26549c_("/10X1/salarySlipKofax/cropTutorial/dont_crop.png");
            onGetStartedClick.IconCompatParcelizer((Object) c_, "transformURL(\"/10X1/sala…pTutorial/dont_crop.png\")");
            read.read(new awaitEvent(MediaBrowserCompat$ItemReceiver2, c_));
            read.read();
        }
    }

    /* renamed from: o.setShortcutTypeOrdinal$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<proxyGetOnDevicePassportDeserializer.read> {
        public static final IconCompatParcelizer write = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((proxyGetOnDevicePassportDeserializer.read) obj).write();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public setShortcutTypeOrdinal(RegularImmutableBiMap regularImmutableBiMap, union union) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) union, "displayMapper");
        this.read = union;
    }
}
