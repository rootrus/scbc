package p040o;

/* renamed from: o.FragmentBuilder_BindInvestmentDetailsFragment */
public enum FragmentBuilder_BindInvestmentDetailsFragment {
    IN_THE_WORKS("works"),
    LAUNCHPAD("launchpad"),
    LIVE("live");
    
    private final String type;

    private FragmentBuilder_BindInvestmentDetailsFragment(String str) {
        this.type = str;
    }

    public final String toString() {
        return this.type;
    }
}
