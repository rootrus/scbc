package p040o;

import com.scb.phone.view.activity.ndid.IdpShareInformationActivity;

/* renamed from: o.setWeekDayTextAppearance */
public final /* synthetic */ class setWeekDayTextAppearance implements Runnable {
    private final /* synthetic */ IdpShareInformationActivity MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ setWeekDayTextAppearance(IdpShareInformationActivity idpShareInformationActivity) {
        this.MediaBrowserCompat$ItemReceiver = idpShareInformationActivity;
    }

    public final void run() {
        IdpShareInformationActivity idpShareInformationActivity = this.MediaBrowserCompat$ItemReceiver;
        idpShareInformationActivity.presenter.write(idpShareInformationActivity.MediaBrowserCompat$MediaItem);
    }
}
