package p040o;

/* renamed from: o.newIdentityHashSet$MediaBrowserCompat$ItemReceiver */
final class newIdentityHashSet$MediaBrowserCompat$ItemReceiver extends CheckEligibilityActivity implements FundFactSheetActivity<String, String> {
    public static final newIdentityHashSet$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = new newIdentityHashSet$MediaBrowserCompat$ItemReceiver();

    newIdentityHashSet$MediaBrowserCompat$ItemReceiver() {
        super(1);
    }

    public final /* synthetic */ Object invoke(Object obj) {
        String str = (String) obj;
        onGetStartedClick.write((Object) str, "it");
        StringBuilder sb = new StringBuilder();
        sb.append("- ");
        sb.append(str);
        return sb.toString();
    }
}
