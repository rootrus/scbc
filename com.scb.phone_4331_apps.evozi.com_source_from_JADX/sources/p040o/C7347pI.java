package p040o;

import com.scb.phone.view.activity.easycash.EasycashCarInformationActivity;
import p040o.Image;

/* renamed from: o.pI */
public final class C7347pI implements MileageQuantitySelectionActivity<EasycashCarInformationActivity> {
    public static void write(EasycashCarInformationActivity easycashCarInformationActivity, Image.BitmapDataObject bitmapDataObject) {
        easycashCarInformationActivity.presenter = bitmapDataObject;
    }

    public static void MediaBrowserCompat$CustomActionResultReceiver(EasycashCarInformationActivity easycashCarInformationActivity, forEachClear foreachclear) {
        easycashCarInformationActivity.tracker = foreachclear;
    }
}
