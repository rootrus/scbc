package p040o;

/* renamed from: o.isInputShutdown$MediaBrowserCompat$CustomActionResultReceiver */
final class isInputShutdown$MediaBrowserCompat$CustomActionResultReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<String, Boolean> {
    private /* synthetic */ String read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    isInputShutdown$MediaBrowserCompat$CustomActionResultReceiver(String str) {
        super(1);
        this.read = str;
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "it");
        return Boolean.valueOf(!GoodToKnowActivity.MediaBrowserCompat$CustomActionResultReceiver(str, this.read, true));
    }
}
