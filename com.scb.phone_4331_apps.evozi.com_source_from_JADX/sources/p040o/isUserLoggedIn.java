package p040o;

/* renamed from: o.isUserLoggedIn */
public class isUserLoggedIn extends writeUInt64NoTag<proxyGetIPassportDetector> {
    private final NavigationMenuView read;

    public void read() {
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public isUserLoggedIn(RegularImmutableBiMap regularImmutableBiMap, NavigationMenuView navigationMenuView) {
        super(regularImmutableBiMap);
        onGetStartedClick.write((Object) regularImmutableBiMap, "errorDisplayMapper");
        onGetStartedClick.write((Object) navigationMenuView, "verifyPinCase");
        this.read = navigationMenuView;
    }

    public static final /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(isUserLoggedIn isuserloggedin) {
        if (isuserloggedin.RatingCompat != null) {
            isuserloggedin.RatingCompat.aj_();
        }
    }

    public void write(String str) {
        onGetStartedClick.write((Object) str, "pin");
        if (this.RatingCompat != null) {
            this.RatingCompat.AlertController$RecycleListView();
        }
        this.read.MediaBrowserCompat$CustomActionResultReceiver(str);
        this.read.IconCompatParcelizer(new isUserLoggedIn$MediaBrowserCompat$CustomActionResultReceiver(this));
    }
}
