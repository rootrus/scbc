package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.scheduledtransaction.ScheduleTransactionActivity;

/* renamed from: o.change */
public final /* synthetic */ class change implements DialogInterface.OnClickListener {
    private final /* synthetic */ ScheduleTransactionActivity MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setUuidFromUtf8Bytes read;

    public /* synthetic */ change(ScheduleTransactionActivity scheduleTransactionActivity, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.MediaBrowserCompat$CustomActionResultReceiver = scheduleTransactionActivity;
        this.read = setuuidfromutf8bytes;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver.scheduleTransactionPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.read.setMenu, (String) null);
    }
}
