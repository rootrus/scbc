package p040o;

/* renamed from: o.Text$MediaBrowserCompat$CustomActionResultReceiver */
final class Text$MediaBrowserCompat$CustomActionResultReceiver<T, R> implements DirectDebitDeepLinkActivity<String, DebitCardProductCatalogActivity> {
    private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ Text read;
    private /* synthetic */ String write;

    Text$MediaBrowserCompat$CustomActionResultReceiver(Text text, String str, String str2) {
        this.read = text;
        this.MediaBrowserCompat$ItemReceiver = str;
        this.write = str2;
    }

    public final /* bridge */ /* synthetic */ Object write(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "applicationUuid");
        return this.read.read.write(str, this.MediaBrowserCompat$ItemReceiver, this.write);
    }
}
