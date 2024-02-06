package p040o;

import p040o.C10827Iterators;
import p040o.writeUInt64NoTag;

/* renamed from: o.IPassportDetector */
public final class IPassportDetector extends writeUInt64NoTag<readFromParcel> {
    public final C10827Iterators.C35456 write;

    /* renamed from: o.IPassportDetector$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<readFromParcel> {
        public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* bridge */ /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((readFromParcel) obj).IconCompatParcelizer();
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public IPassportDetector(RegularImmutableBiMap regularImmutableBiMap, C10827Iterators.C35456 r3) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) r3, "easyCashDFWYNController");
        this.write = r3;
    }
}
