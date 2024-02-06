package p040o;

/* renamed from: o.FragmentBuilder_BindFatcaQuestionnaireFragment */
public enum FragmentBuilder_BindFatcaQuestionnaireFragment {
    NO_CACHE(1),
    NO_STORE(2);
    
    final int index;

    public static boolean MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return (i & NO_CACHE.index) == 0;
    }

    static boolean MediaBrowserCompat$ItemReceiver(int i) {
        return (i & NO_STORE.index) == 0;
    }

    private FragmentBuilder_BindFatcaQuestionnaireFragment(int i) {
        this.index = i;
    }
}
