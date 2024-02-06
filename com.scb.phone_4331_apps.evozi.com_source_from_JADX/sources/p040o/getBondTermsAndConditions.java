package p040o;

import android.widget.CompoundButton;
import androidx.recyclerview.widget.RecyclerView;
import com.scb.phone.view.adapter.fixedtransfer.C5754x33d87c9f;
import com.scb.phone.view.adapter.fixedtransfer.FixedTransferSubDepositAdapter;

/* renamed from: o.getBondTermsAndConditions */
public final /* synthetic */ class getBondTermsAndConditions implements CompoundButton.OnCheckedChangeListener {
    private final /* synthetic */ C5754x33d87c9f IconCompatParcelizer;
    private final /* synthetic */ FixedTransferSubDepositAdapter.SubDepositViewHolder MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ parseEventExecutionException read;

    public /* synthetic */ getBondTermsAndConditions(FixedTransferSubDepositAdapter.SubDepositViewHolder subDepositViewHolder, parseEventExecutionException parseeventexecutionexception, C5754x33d87c9f fixedTransferSubDepositAdapter$MediaBrowserCompat$CustomActionResultReceiver) {
        this.MediaBrowserCompat$CustomActionResultReceiver = subDepositViewHolder;
        this.read = parseeventexecutionexception;
        this.IconCompatParcelizer = fixedTransferSubDepositAdapter$MediaBrowserCompat$CustomActionResultReceiver;
    }

    public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
        int i;
        FixedTransferSubDepositAdapter.SubDepositViewHolder subDepositViewHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
        parseEventExecutionException parseeventexecutionexception = this.read;
        C5754x33d87c9f fixedTransferSubDepositAdapter$MediaBrowserCompat$CustomActionResultReceiver = this.IconCompatParcelizer;
        parseeventexecutionexception.MediaMetadataCompat = z;
        if (fixedTransferSubDepositAdapter$MediaBrowserCompat$CustomActionResultReceiver != null) {
            RecyclerView recyclerView = subDepositViewHolder.MediaMetadataCompat;
            if (recyclerView == null) {
                i = -1;
            } else {
                i = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) subDepositViewHolder);
            }
            fixedTransferSubDepositAdapter$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(i, z);
        }
    }
}
