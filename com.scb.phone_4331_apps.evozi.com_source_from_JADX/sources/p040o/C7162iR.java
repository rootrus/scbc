package p040o;

import com.scb.phone.view.activity.cardmanagement.DeejungPlansActivity;
import org.jmrtd.cbeff.ISO781611;

/* renamed from: o.iR */
public final /* synthetic */ class C7162iR implements Runnable {
    private final /* synthetic */ DeejungPlansActivity write;

    public /* synthetic */ C7162iR(DeejungPlansActivity deejungPlansActivity) {
        this.write = deejungPlansActivity;
    }

    public final void run() {
        this.write.nestedScrollView.MediaBrowserCompat$CustomActionResultReceiver((int) ISO781611.BIOMETRIC_SUBTYPE_TAG);
    }
}
