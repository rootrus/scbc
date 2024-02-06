package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.activity.scheduledtransaction.ScheduleTransactionActivity;

/* renamed from: o.doTranslation */
public final /* synthetic */ class doTranslation implements DialogInterface.OnClickListener {
    private final /* synthetic */ setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ ScheduleTransactionActivity read;

    public /* synthetic */ doTranslation(ScheduleTransactionActivity scheduleTransactionActivity, setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.read = scheduleTransactionActivity;
        this.MediaBrowserCompat$ItemReceiver = setuuidfromutf8bytes;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        ScheduleTransactionActivity scheduleTransactionActivity = this.read;
        setUuidFromUtf8Bytes setuuidfromutf8bytes = this.MediaBrowserCompat$ItemReceiver;
        scheduleTransactionActivity.scheduleTransactionPresenter.MediaBrowserCompat$CustomActionResultReceiver(setuuidfromutf8bytes.setMenu, setuuidfromutf8bytes.setMenuPrepared);
    }
}
