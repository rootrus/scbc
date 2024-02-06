package p040o;

import java.util.HashSet;
import java.util.Set;

/* renamed from: o.DeejungTransferInstallmentsReviewActivity */
public class DeejungTransferInstallmentsReviewActivity {
    private static DeejungTransferInstallmentsReviewActivity IconCompatParcelizer;
    public Set<String> MediaBrowserCompat$ItemReceiver = new HashSet();

    public static DeejungTransferInstallmentsReviewActivity write() {
        DeejungTransferInstallmentsReviewActivity deejungTransferInstallmentsReviewActivity;
        synchronized (DeejungTransferInstallmentsReviewActivity.class) {
            if (IconCompatParcelizer == null) {
                IconCompatParcelizer = new DeejungTransferInstallmentsReviewActivity();
            }
            deejungTransferInstallmentsReviewActivity = IconCompatParcelizer;
        }
        return deejungTransferInstallmentsReviewActivity;
    }
}
