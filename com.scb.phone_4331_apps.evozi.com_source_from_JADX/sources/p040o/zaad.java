package p040o;

/* renamed from: o.zaad */
public final class zaad extends FragmentBuilder_BindSummaryFragment {
    public zaad() {
    }

    @HmlPinActivity
    public zaad(GoogleSignatureVerifier googleSignatureVerifier, GooglePlayServicesRepairableException googlePlayServicesRepairableException, isUninstalledAppPossiblyUpdating isuninstalledapppossiblyupdating, setDryRun setdryrun, setLogger setlogger) {
    }

    public static int MediaBrowserCompat$ItemReceiver(String str) {
        if (str != null && str.contains("/")) {
            try {
                return Integer.valueOf(str.split("/")[1]).intValue();
            } catch (NumberFormatException e) {
                onCheckBoxClick.MediaBrowserCompat$ItemReceiver((Throwable) e);
            }
        }
        return 0;
    }
}
