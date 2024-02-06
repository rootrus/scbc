package p040o;

/* renamed from: o.zzry */
public final class zzry extends zzuj {
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public zzrz read;
    public String write;

    public /* synthetic */ zzry() {
    }

    private zzry(int i, String str, zzrm zzrm) {
        super(i, str, (zzrm) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public zzry(int i, String str, String str2, String str3, zzrz zzrz) {
        this(i, str3, (zzrm) null);
        onGetStartedClick.write((Object) str, "cardRefNo");
        onGetStartedClick.write((Object) str2, "cardMask");
        onGetStartedClick.write((Object) zzrz, "productType");
        this.write = str;
        this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        this.read = zzrz;
    }
}
