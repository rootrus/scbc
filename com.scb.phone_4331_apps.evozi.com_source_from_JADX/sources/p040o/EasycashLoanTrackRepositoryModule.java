package p040o;

import android.view.View;
import com.scb.phone.view.adapter.address.SubDistrictSearchAdapter;
import com.scb.phone.view.adapter.address.SubDistrictSearchAdapter$MediaBrowserCompat$ItemReceiver;

/* renamed from: o.EasycashLoanTrackRepositoryModule */
public final /* synthetic */ class EasycashLoanTrackRepositoryModule implements View.OnClickListener {
    private final /* synthetic */ SubDistrictSearchAdapter MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ EasycashLoanTrackRepositoryModule(SubDistrictSearchAdapter subDistrictSearchAdapter, int i) {
        this.MediaBrowserCompat$CustomActionResultReceiver = subDistrictSearchAdapter;
        this.MediaBrowserCompat$ItemReceiver = i;
    }

    public final void onClick(View view) {
        SubDistrictSearchAdapter subDistrictSearchAdapter = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i = this.MediaBrowserCompat$ItemReceiver;
        SubDistrictSearchAdapter$MediaBrowserCompat$ItemReceiver subDistrictSearchAdapter$MediaBrowserCompat$ItemReceiver = subDistrictSearchAdapter.MediaBrowserCompat$ItemReceiver;
        if (subDistrictSearchAdapter$MediaBrowserCompat$ItemReceiver != null) {
            subDistrictSearchAdapter$MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(subDistrictSearchAdapter.write.get(i));
        }
    }
}
