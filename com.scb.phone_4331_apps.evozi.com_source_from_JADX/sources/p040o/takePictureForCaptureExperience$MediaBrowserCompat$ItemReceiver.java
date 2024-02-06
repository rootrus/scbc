package p040o;

import java.util.List;
import p040o.access$2300;

/* renamed from: o.takePictureForCaptureExperience$MediaBrowserCompat$ItemReceiver */
public class takePictureForCaptureExperience$MediaBrowserCompat$ItemReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<CustomCardApplyViewComponent_ViewBinding>> {
    final /* synthetic */ takePictureForCaptureExperience MediaBrowserCompat$ItemReceiver;

    public takePictureForCaptureExperience$MediaBrowserCompat$ItemReceiver(takePictureForCaptureExperience takepictureforcaptureexperience) {
        this.MediaBrowserCompat$ItemReceiver = takepictureforcaptureexperience;
    }

    public final /* synthetic */ void onNext(Object obj) {
        List list = (List) obj;
        takePictureForCaptureExperience.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$ItemReceiver);
        if (list != null) {
            takePictureForCaptureExperience takepictureforcaptureexperience = this.MediaBrowserCompat$ItemReceiver;
            StandardRowSortedTable unused = takepictureforcaptureexperience.write;
            List unused2 = takepictureforcaptureexperience.IconCompatParcelizer = StandardRowSortedTable.MediaBrowserCompat$ItemReceiver(list, new getTorchDelay(this));
            takePictureForCaptureExperience takepictureforcaptureexperience2 = this.MediaBrowserCompat$ItemReceiver;
            getMaxFocusAreas getmaxfocusareas = new getMaxFocusAreas(this);
            if (takepictureforcaptureexperience2.RatingCompat != null) {
                getmaxfocusareas.IconCompatParcelizer(takepictureforcaptureexperience2.RatingCompat);
            }
        }
    }

    public final void onError(Throwable th) {
        takePictureForCaptureExperience.IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
