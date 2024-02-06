package p040o;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.fragment.hml.HmlBasePersonalInfoFragment;

/* renamed from: o.DeepLinkModule_WebViewDeepLinkActivity */
public final /* synthetic */ class DeepLinkModule_WebViewDeepLinkActivity implements TextView.OnEditorActionListener {
    private final /* synthetic */ HmlBasePersonalInfoFragment write;

    public /* synthetic */ DeepLinkModule_WebViewDeepLinkActivity(HmlBasePersonalInfoFragment hmlBasePersonalInfoFragment) {
        this.write = hmlBasePersonalInfoFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        HmlBasePersonalInfoFragment hmlBasePersonalInfoFragment = this.write;
        if (i != 6) {
            return false;
        }
        hmlBasePersonalInfoFragment.root.setFocusable(true);
        hmlBasePersonalInfoFragment.root.setFocusableInTouchMode(true);
        hmlBasePersonalInfoFragment.root.requestFocus();
        hmlBasePersonalInfoFragment.PlaybackStateCompat$CustomAction();
        return false;
    }
}
