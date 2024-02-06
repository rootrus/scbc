package p040o;

/* renamed from: o.fromFile */
public final /* synthetic */ class fromFile implements HmlBaseDeepLinkActivity {
    public static final /* synthetic */ fromFile write = new fromFile();

    private /* synthetic */ fromFile() {
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        onInfoWindowLongClick oninfowindowlongclick = (onInfoWindowLongClick) obj;
        return IGoogleMapDelegate.SCB.name().equalsIgnoreCase(oninfowindowlongclick.ActionMenuItemView) || IGoogleMapDelegate.PROMPTPAY.name().equalsIgnoreCase(oninfowindowlongclick.ActionMenuItemView);
    }
}
