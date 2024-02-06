package p040o;

/* renamed from: o.SCBUniversalWebViewActivity_ViewBinding$MediaBrowserCompat$ItemReceiver */
public final class C7043xa484e06c {
    private C7043xa484e06c() {
    }

    public /* synthetic */ C7043xa484e06c(byte b) {
        this();
    }

    public static SCBUniversalWebViewActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver(byte[] bArr, int i, int i2) {
        onGetStartedClick.write((Object) bArr, "$receiver");
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((long) bArr.length, 0, (long) i2);
        byte[] bArr2 = new byte[i2];
        onGetStartedClick.write((Object) bArr, "src");
        onGetStartedClick.write((Object) bArr2, "dest");
        System.arraycopy(bArr, 0, bArr2, 0, i2);
        return new SCBUniversalWebViewActivity_ViewBinding(bArr2);
    }
}
