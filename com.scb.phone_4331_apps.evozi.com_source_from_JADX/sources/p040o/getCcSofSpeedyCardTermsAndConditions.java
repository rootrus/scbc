package p040o;

import com.scb.phone.view.adapter.chequemanagement.stopcheque.StopChequeHistoryAdapter;
import com.scb.phone.view.fragment.chequemanagement.stopcheque.StopChequeHistoryFragment;
import java.util.List;

/* renamed from: o.getCcSofSpeedyCardTermsAndConditions */
public final /* synthetic */ class getCcSofSpeedyCardTermsAndConditions implements Runnable {
    private final /* synthetic */ StopChequeHistoryFragment MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ getRoots read;

    public /* synthetic */ getCcSofSpeedyCardTermsAndConditions(StopChequeHistoryFragment stopChequeHistoryFragment, getRoots getroots) {
        this.MediaBrowserCompat$ItemReceiver = stopChequeHistoryFragment;
        this.read = getroots;
    }

    public final void run() {
        StopChequeHistoryFragment stopChequeHistoryFragment = this.MediaBrowserCompat$ItemReceiver;
        getRoots getroots = this.read;
        stopChequeHistoryFragment.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(false, (StopChequeHistoryAdapter.IconCompatParcelizer) null);
        StopChequeHistoryAdapter stopChequeHistoryAdapter = stopChequeHistoryFragment.MediaBrowserCompat$CustomActionResultReceiver;
        List<CycleDetector> list = getroots.MediaBrowserCompat$ItemReceiver;
        if (!list.isEmpty()) {
            int size = stopChequeHistoryAdapter.read.size();
            int size2 = list.size();
            stopChequeHistoryAdapter.read.addAll(list);
            stopChequeHistoryAdapter.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(size, size2);
            stopChequeHistoryAdapter.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(size - 1, 1);
        }
    }
}
