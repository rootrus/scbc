package p040o;

import com.scb.phone.view.activity.mailingaddress.GoodToKnowActivity;

/* renamed from: o.setCameraMode */
public final class setCameraMode implements MileageQuantitySelectionActivity<GoodToKnowActivity> {
    public static void read(GoodToKnowActivity goodToKnowActivity, AppStatsDsExportHandler appStatsDsExportHandler) {
        goodToKnowActivity.presenter = appStatsDsExportHandler;
    }
}
