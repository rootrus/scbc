package p040o;

import android.content.DialogInterface;
import com.scb.phone.view.fragment.scheduledtransaction.ScheduleBulkTransferFragment;

/* renamed from: o.ActivityBuilder_ContributeRegistrationActivity */
public final /* synthetic */ class ActivityBuilder_ContributeRegistrationActivity implements DialogInterface.OnClickListener {
    private final /* synthetic */ ScheduleBulkTransferFragment IconCompatParcelizer;

    public /* synthetic */ ActivityBuilder_ContributeRegistrationActivity(ScheduleBulkTransferFragment scheduleBulkTransferFragment) {
        this.IconCompatParcelizer = scheduleBulkTransferFragment;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        this.IconCompatParcelizer.write();
    }
}
