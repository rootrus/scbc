package p040o;

import com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity;

/* renamed from: o.getItem */
public final class getItem implements MileageQuantitySelectionActivity<MwBusinessDetailsActivity> {
    public static void write(MwBusinessDetailsActivity mwBusinessDetailsActivity, AppStatsOCRType appStatsOCRType) {
        mwBusinessDetailsActivity.MediaSessionCompat$Token = appStatsOCRType;
    }
}
