package p040o;

import android.view.KeyEvent;
import android.widget.TextView;
import com.scb.phone.view.fragment.hml.HmlNTBPersonalInfoFragment;

/* renamed from: o.ActivityBuilder_BindCardlessAtmCoachMarkActivity */
public final /* synthetic */ class ActivityBuilder_BindCardlessAtmCoachMarkActivity implements TextView.OnEditorActionListener {
    private final /* synthetic */ HmlNTBPersonalInfoFragment write;

    public /* synthetic */ ActivityBuilder_BindCardlessAtmCoachMarkActivity(HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment) {
        this.write = hmlNTBPersonalInfoFragment;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        HmlNTBPersonalInfoFragment hmlNTBPersonalInfoFragment = this.write;
        if (i != 6) {
            return false;
        }
        hmlNTBPersonalInfoFragment.root.setFocusable(true);
        hmlNTBPersonalInfoFragment.root.setFocusableInTouchMode(true);
        hmlNTBPersonalInfoFragment.root.requestFocus();
        hmlNTBPersonalInfoFragment.PlaybackStateCompat$CustomAction();
        return false;
    }
}
