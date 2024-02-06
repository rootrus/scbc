package p040o;

import android.widget.RadioGroup;
import com.scb.phone.R;
import com.scb.phone.view.adapter.deposit.FatcaQuestionnaireAdapter;
import java.util.Iterator;

/* renamed from: o.BillPaymentService */
public final /* synthetic */ class BillPaymentService implements RadioGroup.OnCheckedChangeListener {
    private final /* synthetic */ FatcaQuestionnaireAdapter IconCompatParcelizer;
    private final /* synthetic */ doWriteNonFatal MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ BillPaymentService(FatcaQuestionnaireAdapter fatcaQuestionnaireAdapter, doWriteNonFatal dowritenonfatal) {
        this.IconCompatParcelizer = fatcaQuestionnaireAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = dowritenonfatal;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        boolean z;
        FatcaQuestionnaireAdapter fatcaQuestionnaireAdapter = this.IconCompatParcelizer;
        doWriteNonFatal dowritenonfatal = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i == R.id.rdb_no) {
            fatcaQuestionnaireAdapter.MediaBrowserCompat$ItemReceiver.put(dowritenonfatal.MediaBrowserCompat$CustomActionResultReceiver, "N");
        } else if (i == R.id.rdb_yes) {
            fatcaQuestionnaireAdapter.MediaBrowserCompat$ItemReceiver.put(dowritenonfatal.MediaBrowserCompat$CustomActionResultReceiver, "Y");
        }
        FatcaQuestionnaireAdapter.IconCompatParcelizer iconCompatParcelizer = fatcaQuestionnaireAdapter.write;
        Iterator<doWriteNonFatal> it = fatcaQuestionnaireAdapter.read.iterator();
        while (true) {
            if (it.hasNext()) {
                if (fatcaQuestionnaireAdapter.MediaBrowserCompat$ItemReceiver.get(it.next().MediaBrowserCompat$CustomActionResultReceiver) == null) {
                    z = false;
                    break;
                }
            } else {
                z = true;
                break;
            }
        }
        iconCompatParcelizer.read(z);
    }
}
