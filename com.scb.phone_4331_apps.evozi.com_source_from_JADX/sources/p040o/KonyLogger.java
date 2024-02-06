package p040o;

import com.scb.phone.view.activity.hml.HmlBaseReviewActivity;
import p040o.UserProfile;

/* renamed from: o.KonyLogger */
public final class KonyLogger<T extends UserProfile> implements MileageQuantitySelectionActivity<HmlBaseReviewActivity<T>> {
    public static <T extends UserProfile> void MediaBrowserCompat$ItemReceiver(HmlBaseReviewActivity<T> hmlBaseReviewActivity, T t) {
        hmlBaseReviewActivity.presenter = t;
    }
}
