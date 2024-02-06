package p040o;

import java.util.Comparator;

/* renamed from: o.onReturnHomeClicked */
final class onReturnHomeClicked implements Comparator<Comparable<? super Object>> {
    public static final onReturnHomeClicked MediaBrowserCompat$ItemReceiver = new onReturnHomeClicked();

    private onReturnHomeClicked() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        Comparable comparable = (Comparable) obj;
        Comparable comparable2 = (Comparable) obj2;
        onGetStartedClick.write((Object) comparable, "a");
        onGetStartedClick.write((Object) comparable2, "b");
        return comparable2.compareTo(comparable);
    }

    public final Comparator<Comparable<Object>> reversed() {
        return HmlNTBOnboardingFatcaQuestionsActivity.IconCompatParcelizer;
    }
}
