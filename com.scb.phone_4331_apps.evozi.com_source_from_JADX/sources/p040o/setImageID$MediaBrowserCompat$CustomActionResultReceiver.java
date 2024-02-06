package p040o;

import p040o.access$2300;

/* renamed from: o.setImageID$MediaBrowserCompat$CustomActionResultReceiver */
public class setImageID$MediaBrowserCompat$CustomActionResultReceiver extends IndoorBuilding$MediaBrowserCompat$ItemReceiver<logHealthData> {
    final /* synthetic */ setImageID MediaBrowserCompat$ItemReceiver;

    private setImageID$MediaBrowserCompat$CustomActionResultReceiver(setImageID setimageid) {
        this.MediaBrowserCompat$ItemReceiver = setimageid;
    }

    public /* synthetic */ setImageID$MediaBrowserCompat$CustomActionResultReceiver(setImageID setimageid, byte b) {
        this(setimageid);
    }

    public final /* synthetic */ void onNext(Object obj) {
        logHealthData loghealthdata = (logHealthData) obj;
        super.onNext(loghealthdata);
        setImageID setimageid = this.MediaBrowserCompat$ItemReceiver;
        getImageFilePath getimagefilepath = new getImageFilePath(this, loghealthdata);
        if (setimageid.RatingCompat != null) {
            getimagefilepath.IconCompatParcelizer(setimageid.RatingCompat);
        }
    }

    public final void onError(Throwable th) {
        super.onError(th);
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(th, access$2300.write.JUST_DISMISS));
    }
}
