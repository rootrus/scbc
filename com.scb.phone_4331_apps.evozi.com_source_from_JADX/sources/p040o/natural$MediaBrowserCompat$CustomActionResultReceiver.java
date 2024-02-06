package p040o;

/* renamed from: o.natural$MediaBrowserCompat$CustomActionResultReceiver */
final class natural$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<String, Boolean> {
    private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    natural$MediaBrowserCompat$CustomActionResultReceiver(String str) {
        super(1);
        this.MediaBrowserCompat$CustomActionResultReceiver = str;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "it");
        return Boolean.valueOf(onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) str));
    }
}
