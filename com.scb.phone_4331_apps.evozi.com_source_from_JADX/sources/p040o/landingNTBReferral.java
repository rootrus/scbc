package p040o;

import android.view.View;
import com.scb.phone.view.adapter.transferandpay.transfer.TransferToMeStep1Adapter;

/* renamed from: o.landingNTBReferral */
public final /* synthetic */ class landingNTBReferral implements View.OnClickListener {
    private final /* synthetic */ parseOs IconCompatParcelizer;
    private final /* synthetic */ TransferToMeStep1Adapter read;

    public /* synthetic */ landingNTBReferral(TransferToMeStep1Adapter transferToMeStep1Adapter, parseOs parseos) {
        this.read = transferToMeStep1Adapter;
        this.IconCompatParcelizer = parseos;
    }

    public final void onClick(View view) {
        TransferToMeStep1Adapter transferToMeStep1Adapter = this.read;
        parseOs parseos = this.IconCompatParcelizer;
        TransferToMeStep1Adapter.write write = transferToMeStep1Adapter.MediaBrowserCompat$ItemReceiver;
        if (write != null) {
            write.IconCompatParcelizer(parseos);
        }
    }
}
