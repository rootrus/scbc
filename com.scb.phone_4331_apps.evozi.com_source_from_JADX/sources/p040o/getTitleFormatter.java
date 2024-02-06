package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.scheduledtransaction.ScheduleTransactionActivity;

/* renamed from: o.getTitleFormatter */
public final /* synthetic */ class getTitleFormatter implements DialogInterface.OnClickListener {
    private final /* synthetic */ ScheduleTransactionActivity MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ setUuidFromUtf8Bytes read;

    public /* synthetic */ getTitleFormatter(ScheduleTransactionActivity scheduleTransactionActivity, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.MediaBrowserCompat$CustomActionResultReceiver = scheduleTransactionActivity;
        this.read = setuuidfromutf8bytes;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ScheduleTransactionActivity scheduleTransactionActivity = this.MediaBrowserCompat$CustomActionResultReceiver;
        setUuidFromUtf8Bytes setuuidfromutf8bytes = this.read;
        scheduleTransactionActivity.scheduleTransactionPresenter.MediaBrowserCompat$CustomActionResultReceiver(setuuidfromutf8bytes.setMenu, setuuidfromutf8bytes.setMenuPrepared);
    }
}
