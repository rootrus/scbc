package p040o;

import java.util.List;
import p040o.CrashlyticsController;

/* renamed from: o.symmetricDifference */
public final class symmetricDifference {
    public static final symmetricDifference MediaBrowserCompat$CustomActionResultReceiver = new symmetricDifference();

    private symmetricDifference() {
    }

    public static List<CrashlyticsController.C32346> MediaBrowserCompat$CustomActionResultReceiver(List<CrashlyticsController.C32346> list) {
        Integer num = null;
        for (CrashlyticsController.C32346 next : list) {
            if (next.MediaBrowserCompat$CustomActionResultReceiver) {
                if (num != null) {
                    list.get(num.intValue()).MediaBrowserCompat$CustomActionResultReceiver = false;
                }
                num = Integer.valueOf(list.indexOf(next));
            }
        }
        return list;
    }
}
