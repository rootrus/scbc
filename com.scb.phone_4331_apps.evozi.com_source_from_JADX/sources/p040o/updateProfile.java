package p040o;

import android.view.View;
import android.widget.Button;
import com.scb.phone.view.fragment.cardmanagement.DeejungPlansFragment;

/* renamed from: o.updateProfile */
public final /* synthetic */ class updateProfile implements View.OnClickListener {
    private final /* synthetic */ DeejungPlansFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ Button MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ updateProfile(DeejungPlansFragment deejungPlansFragment, Button button) {
        this.MediaBrowserCompat$CustomActionResultReceiver = deejungPlansFragment;
        this.MediaBrowserCompat$ItemReceiver = button;
    }

    public final void onClick(View view) {
        DeejungPlansFragment deejungPlansFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        Button button = this.MediaBrowserCompat$ItemReceiver;
        deejungPlansFragment.MediaBrowserCompat$ItemReceiver();
        button.setSelected(true);
        deejungPlansFragment.viewPager.setCurrentItem(((Integer) view.getTag()).intValue());
    }
}
