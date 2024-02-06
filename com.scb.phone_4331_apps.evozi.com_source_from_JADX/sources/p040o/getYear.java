package p040o;

import android.content.Intent;
import android.net.Uri;
import com.scb.phone.view.activity.mwpartner.MwPartnerCropPhotoActivity;
import java.io.File;
import p040o.TaskRunner;

/* renamed from: o.getYear */
public final /* synthetic */ class getYear implements setDefaultBorder {
    private final /* synthetic */ MwPartnerCropPhotoActivity write;

    public /* synthetic */ getYear(MwPartnerCropPhotoActivity mwPartnerCropPhotoActivity) {
        this.write = mwPartnerCropPhotoActivity;
    }

    public final void MediaBrowserCompat$ItemReceiver(Object obj) {
        MwPartnerCropPhotoActivity mwPartnerCropPhotoActivity = this.write;
        File file = new File((String) obj);
        String obj2 = Uri.fromFile(file).toString();
        boolean z = false;
        if (mwPartnerCropPhotoActivity.cropView.write == null) {
            mwPartnerCropPhotoActivity.setResult(0, new Intent());
            mwPartnerCropPhotoActivity.finish();
            return;
        }
        TaskRunner.C3843b bVar = mwPartnerCropPhotoActivity.presenter;
        if ((file.length() / 1024) / 1024 > 7) {
            getClassificationEventID getclassificationeventid = getClassificationEventID.MediaBrowserCompat$CustomActionResultReceiver;
            if (bVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getclassificationeventid.IconCompatParcelizer(bVar.RatingCompat);
                return;
            }
            return;
        }
        setDismissalTime setdismissaltime = new setDismissalTime(obj2);
        if (bVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setdismissaltime.IconCompatParcelizer(bVar.RatingCompat);
        }
    }
}
