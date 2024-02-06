package p040o;

import androidx.core.widget.NestedScrollView;
import com.scb.phone.view.fragment.chequemanagement.chequestatus.ChequeStatusFragment;

/* renamed from: o.getBankingAgentTC */
public final /* synthetic */ class getBankingAgentTC implements NestedScrollView.IconCompatParcelizer {
    private final /* synthetic */ ChequeStatusFragment write;

    public /* synthetic */ getBankingAgentTC(ChequeStatusFragment chequeStatusFragment) {
        this.write = chequeStatusFragment;
    }

    public final void write(NestedScrollView nestedScrollView, int i, int i2) {
        int i3;
        ChequeStatusFragment chequeStatusFragment = this.write;
        if (i >= i2 && i >= (nestedScrollView.getChildAt(0).getMeasuredHeight() - nestedScrollView.getMeasuredHeight()) - 250 && (i3 = chequeStatusFragment.MediaDescriptionCompat) < chequeStatusFragment.MediaMetadataCompat && !chequeStatusFragment.IconCompatParcelizer) {
            chequeStatusFragment.IconCompatParcelizer = true;
            chequeStatusFragment.presenter.MediaBrowserCompat$ItemReceiver = i3 + 1;
            chequeStatusFragment.presenter.MediaBrowserCompat$ItemReceiver(chequeStatusFragment.MediaBrowserCompat$MediaItem, chequeStatusFragment.MediaBrowserCompat$CustomActionResultReceiver, chequeStatusFragment.RatingCompat);
        }
    }
}
