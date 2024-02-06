package p040o;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.fragment.closeaccount.CloseAccountSelectionOtherFragment;

/* renamed from: o.getBannerTilesList */
public final /* synthetic */ class getBannerTilesList implements TextView.OnEditorActionListener {
    private final /* synthetic */ CloseAccountSelectionOtherFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ getBannerTilesList(CloseAccountSelectionOtherFragment closeAccountSelectionOtherFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = closeAccountSelectionOtherFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        CloseAccountSelectionOtherFragment closeAccountSelectionOtherFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (i != 6) {
            return false;
        }
        closeAccountSelectionOtherFragment.button.setFocusable(true);
        closeAccountSelectionOtherFragment.button.setFocusableInTouchMode(true);
        closeAccountSelectionOtherFragment.button.requestFocus();
        closeAccountSelectionOtherFragment.PlaybackStateCompat$CustomAction();
        return true;
    }
}
