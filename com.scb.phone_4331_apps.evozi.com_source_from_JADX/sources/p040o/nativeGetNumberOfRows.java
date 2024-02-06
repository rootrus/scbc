package p040o;

@HmlSetNTBPinActivity
/* renamed from: o.nativeGetNumberOfRows */
public class nativeGetNumberOfRows extends writeUInt64NoTag<IdCaptureModule_GetIIdExtractionServerKtaFactory> {
    @HmlPinActivity
    public nativeGetNumberOfRows(RegularImmutableBiMap regularImmutableBiMap) {
        super(regularImmutableBiMap);
    }

    public final void IconCompatParcelizer(String str, String str2) {
        if (str != null && str2 != null) {
            read(str, str2, (Runnable) new nativeGetNumPages(this));
        }
    }
}
