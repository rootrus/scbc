package p040o;

import p040o.PassportExtractActivity;
import p040o.writeUInt64NoTag;

/* renamed from: o.surfaceChanged */
public final class surfaceChanged extends writeUInt64NoTag<PassportExtractActivity.write> {
    public final toLongArray write;

    /* renamed from: o.surfaceChanged$IconCompatParcelizer */
    public static final class IconCompatParcelizer<V> implements writeUInt64NoTag.IconCompatParcelizer<PassportExtractActivity.write> {
        private /* synthetic */ immediateFailedFuture IconCompatParcelizer;

        public IconCompatParcelizer(immediateFailedFuture immediatefailedfuture) {
            this.IconCompatParcelizer = immediatefailedfuture;
        }

        public final /* synthetic */ void IconCompatParcelizer(Object obj) {
            ((PassportExtractActivity.write) obj).read(this.IconCompatParcelizer);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public surfaceChanged(RegularImmutableBiMap regularImmutableBiMap, toLongArray tolongarray) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) tolongarray, "mTermsAndConditionsMapper");
        this.write = tolongarray;
    }
}
