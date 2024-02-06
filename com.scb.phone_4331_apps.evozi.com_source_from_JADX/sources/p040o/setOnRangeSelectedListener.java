package p040o;

import com.scb.phone.view.activity.prepaid.request.PrepaidRequestReviewActivity;

/* renamed from: o.setOnRangeSelectedListener */
public final class setOnRangeSelectedListener implements MileageQuantitySelectionActivity<PrepaidRequestReviewActivity> {
    public static void MediaBrowserCompat$ItemReceiver(PrepaidRequestReviewActivity prepaidRequestReviewActivity, IExtractionServer iExtractionServer) {
        prepaidRequestReviewActivity.presenter = iExtractionServer;
    }
}
