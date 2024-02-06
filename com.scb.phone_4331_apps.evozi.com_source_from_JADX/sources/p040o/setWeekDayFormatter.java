package p040o;

import com.scb.phone.view.activity.ndid.IdpShareInformationActivity;

/* renamed from: o.setWeekDayFormatter */
public final /* synthetic */ class setWeekDayFormatter implements ZHPR2$MediaBrowserCompat$ItemReceiver {
    private final /* synthetic */ IdpShareInformationActivity MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ setWeekDayFormatter(IdpShareInformationActivity idpShareInformationActivity) {
        this.MediaBrowserCompat$CustomActionResultReceiver = idpShareInformationActivity;
    }

    public final void read() {
        IdpShareInformationActivity.write(this.MediaBrowserCompat$CustomActionResultReceiver);
    }
}
