package p040o;

import java.util.Comparator;

/* renamed from: o.HmlNTBOnboardingFatcaQuestionsActivity */
public final class HmlNTBOnboardingFatcaQuestionsActivity implements Comparator<Comparable<? super Object>> {
    public static final HmlNTBOnboardingFatcaQuestionsActivity IconCompatParcelizer = new HmlNTBOnboardingFatcaQuestionsActivity();

    private HmlNTBOnboardingFatcaQuestionsActivity() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        onGetStartedClick.write((Object) comparable, "a");
        onGetStartedClick.write((Object) comparable2, "b");
        return comparable.compareTo(comparable2);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return onReturnHomeClicked.MediaBrowserCompat$ItemReceiver;
    }
}
