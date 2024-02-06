package p040o;

import android.view.View;
import com.scb.phone.view.adapter.findus.SelectProvinceOrDistrictAdapter;

/* renamed from: o.BulkTransferService */
public final /* synthetic */ class BulkTransferService implements View.OnClickListener {
    private final /* synthetic */ SelectProvinceOrDistrictAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int read;

    public /* synthetic */ BulkTransferService(SelectProvinceOrDistrictAdapter selectProvinceOrDistrictAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = selectProvinceOrDistrictAdapter;
        this.read = i;
    }

    public final void onClick(View view) {
        SelectProvinceOrDistrictAdapter selectProvinceOrDistrictAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.read;
        FragmentBuilder_BindCcSofBillPaymentOnlyFragment fragmentBuilder_BindCcSofBillPaymentOnlyFragment = selectProvinceOrDistrictAdapter.write;
        if (fragmentBuilder_BindCcSofBillPaymentOnlyFragment != null) {
            fragmentBuilder_BindCcSofBillPaymentOnlyFragment.read(i);
        }
    }
}
