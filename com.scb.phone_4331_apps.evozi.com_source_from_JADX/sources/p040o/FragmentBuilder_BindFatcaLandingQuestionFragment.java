package p040o;

/* renamed from: o.FragmentBuilder_BindFatcaLandingQuestionFragment */
public enum FragmentBuilder_BindFatcaLandingQuestionFragment {
    NO_CACHE(1),
    NO_STORE(2),
    OFFLINE(4);
    
    final int index;

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return (i & NO_CACHE.index) == 0;
    }

    public static boolean MediaBrowserCompat$ItemReceiver(int i) {
        return (i & NO_STORE.index) == 0;
    }

    public static boolean IconCompatParcelizer(int i) {
        return (i & OFFLINE.index) != 0;
    }

    private FragmentBuilder_BindFatcaLandingQuestionFragment(int i) {
        this.index = i;
    }
}
