package p040o;

/* renamed from: o.NavigationMenuItemView$MediaBrowserCompat$CustomActionResultReceiver */
final class C9789xb4bf7c78<T, R> implements DirectDebitDeepLinkActivity<String, DebitCardProductCatalogActivity> {
    private /* synthetic */ NavigationMenuItemView IconCompatParcelizer;
    private /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private /* synthetic */ String read;
    private /* synthetic */ String write;

    C9789xb4bf7c78(NavigationMenuItemView navigationMenuItemView, String str, String str2, String str3) {
        this.IconCompatParcelizer = navigationMenuItemView;
        this.read = str;
        this.write = str2;
        this.MediaBrowserCompat$ItemReceiver = str3;
    }

    public final /* synthetic */ Object write(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "applicationUuid");
        return this.IconCompatParcelizer.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(str, this.read, this.write, this.MediaBrowserCompat$ItemReceiver);
    }
}
