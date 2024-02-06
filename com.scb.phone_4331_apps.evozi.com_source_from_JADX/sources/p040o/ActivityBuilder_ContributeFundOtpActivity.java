package p040o;

import com.scb.phone.view.adapter.notification.NotificationAdapter;
import com.scb.phone.view.fragment.notification.NotificationFragment;
import p040o.getDetectorBasedCropper;

/* renamed from: o.ActivityBuilder_ContributeFundOtpActivity */
public final /* synthetic */ class ActivityBuilder_ContributeFundOtpActivity implements NotificationAdapter.IconCompatParcelizer {
    private final /* synthetic */ NotificationFragment IconCompatParcelizer;
    private final /* synthetic */ setNdkPayload MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ ActivityBuilder_ContributeFundOtpActivity(NotificationFragment notificationFragment, setNdkPayload setndkpayload) {
        this.IconCompatParcelizer = notificationFragment;
        this.MediaBrowserCompat$ItemReceiver = setndkpayload;
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        NotificationFragment notificationFragment = this.IconCompatParcelizer;
        setNdkPayload setndkpayload = this.MediaBrowserCompat$ItemReceiver;
        if (z) {
            boolean z2 = true;
            if (setndkpayload != null) {
                getDetectorBasedCropper getdetectorbasedcropper = notificationFragment.notificationPresenter;
                String str = setndkpayload.MediaMetadataCompat;
                if (!getdetectorbasedcropper.write) {
                    if (getdetectorbasedcropper.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        getdetectorbasedcropper.RatingCompat.Keep();
                    }
                    getdetectorbasedcropper.read.MediaBrowserCompat$ItemReceiver(str);
                    getdetectorbasedcropper.read.IconCompatParcelizer(new getDetectorBasedCropper.read(getdetectorbasedcropper, (byte) 0));
                    return;
                }
                if (getdetectorbasedcropper.RatingCompat != null) {
                    getBillParameters getbillparameters = getBillParameters.read;
                    if (getdetectorbasedcropper.RatingCompat == null) {
                        z2 = false;
                    }
                    if (z2) {
                        getbillparameters.IconCompatParcelizer(getdetectorbasedcropper.RatingCompat);
                        return;
                    }
                    return;
                }
                return;
            }
            getDetectorBasedCropper getdetectorbasedcropper2 = notificationFragment.notificationPresenter;
            getdetectorbasedcropper2.write = false;
            if (getdetectorbasedcropper2.RatingCompat == null) {
                z2 = false;
            }
            if (z2) {
                getdetectorbasedcropper2.RatingCompat.Keep();
            }
            getdetectorbasedcropper2.read.read();
            getdetectorbasedcropper2.read.IconCompatParcelizer(new getDetectorBasedCropper.read(getdetectorbasedcropper2, (byte) 0));
        }
    }
}
