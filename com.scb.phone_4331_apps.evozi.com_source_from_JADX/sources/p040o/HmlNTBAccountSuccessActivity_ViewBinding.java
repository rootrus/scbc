package p040o;

import java.util.Collections;
import java.util.Set;

/* renamed from: o.HmlNTBAccountSuccessActivity_ViewBinding */
public class HmlNTBAccountSuccessActivity_ViewBinding extends HmlNationalIdPresenterModule {
    public static final <T> Set<T> MediaBrowserCompat$ItemReceiver(Set<? extends T> set) {
        onGetStartedClick.write((Object) set, "$this$optimizeReadOnlySet");
        int size = set.size();
        if (size == 0) {
            return HmlNTBEkycVerifyIdentifyBranchActivity.MediaBrowserCompat$CustomActionResultReceiver;
        }
        if (size != 1) {
            return set;
        }
        Set<T> singleton = Collections.singleton(set.iterator().next());
        onGetStartedClick.IconCompatParcelizer((Object) singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }
}
