package p040o;

import p040o.getTopLeftCornerWidth;

/* renamed from: o.sy */
public class C7489sy extends writeUInt64NoTag<getTopLeftCornerWidth.MediaDescriptionCompat> {
    @HmlPinActivity
    public C7489sy(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    static /* synthetic */ void write(setUuidFromUtf8Bytes setuuidfromutf8bytes, getTopLeftCornerWidth.MediaDescriptionCompat mediaDescriptionCompat) {
        if (setuuidfromutf8bytes.setShortcut != null) {
            mediaDescriptionCompat.read(setuuidfromutf8bytes);
        } else if (setuuidfromutf8bytes.setPrimaryBackground != null && !setuuidfromutf8bytes.setPrimaryBackground.isEmpty()) {
            mediaDescriptionCompat.IconCompatParcelizer(setuuidfromutf8bytes);
        }
    }
}
