package p040o;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.fragment.bond.BondInputFragment;

/* renamed from: o.getHistoricalData */
public final /* synthetic */ class getHistoricalData implements TextView.OnEditorActionListener {
    private final /* synthetic */ BondInputFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ getHistoricalData(BondInputFragment bondInputFragment) {
        this.MediaBrowserCompat$ItemReceiver = bondInputFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        BondInputFragment bondInputFragment = this.MediaBrowserCompat$ItemReceiver;
        if (i != 6) {
            return false;
        }
        bondInputFragment.mobileNumberInput.setFocusable(true);
        bondInputFragment.mobileNumberInput.setFocusableInTouchMode(true);
        bondInputFragment.mobileNumberInput.requestFocus();
        bondInputFragment.PlaybackStateCompat$CustomAction();
        return true;
    }
}
