package p040o;

/* renamed from: o.zzma$MediaBrowserCompat$ItemReceiver */
public enum zzma$MediaBrowserCompat$ItemReceiver {
    CREDIT_CARD("card"),
    SPEEDY_CASH("card"),
    SPEEDY_LOAN("speedyloan"),
    SPEEDY_LOAN_TOP_UP("speedyloan"),
    MHMC("mhmc"),
    COMMERCIAL_LOAN("commercial"),
    MCMC("mcmc");
    
    public final String apiPath;

    private zzma$MediaBrowserCompat$ItemReceiver(String str) {
        this.apiPath = str;
    }
}
