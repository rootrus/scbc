package p040o;

import android.widget.Button;
import com.scb.phone.view.fragment.cardmanagement.DeejungPlansFragment;

/* renamed from: o.updateFavourite */
public final /* synthetic */ class updateFavourite implements Runnable {
    private final /* synthetic */ Button MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ DeejungPlansFragment write;

    public /* synthetic */ updateFavourite(DeejungPlansFragment deejungPlansFragment, Button button) {
        this.write = deejungPlansFragment;
        this.MediaBrowserCompat$CustomActionResultReceiver = button;
    }

    public final void run() {
        DeejungPlansFragment deejungPlansFragment = this.write;
        Button button = this.MediaBrowserCompat$CustomActionResultReceiver;
        deejungPlansFragment.plansHorizontalScrollView.smoothScrollTo(button.getLeft() - ((deejungPlansFragment.plansHorizontalScrollView.getWidth() - button.getWidth()) / 2), 0);
    }
}
