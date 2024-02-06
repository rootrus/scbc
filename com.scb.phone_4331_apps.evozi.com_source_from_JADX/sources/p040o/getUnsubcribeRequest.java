package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.requesttopay.IncomingFragment;
import com.scb.phone.view.fragment.requesttopay.OutgoingFragment;

/* renamed from: o.getUnsubcribeRequest */
public final class getUnsubcribeRequest extends setCardElevation {
    private final String IconCompatParcelizer;
    private int[] MediaBrowserCompat$CustomActionResultReceiver = {R.string.request_money_outgoing, R.string.request_money_incoming};
    private Context MediaBrowserCompat$ItemReceiver;

    public getUnsubcribeRequest(setTitleMarginStart settitlemarginstart, Context context, String str) {
        super(settitlemarginstart);
        this.MediaBrowserCompat$ItemReceiver = context;
        this.IconCompatParcelizer = str;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return OutgoingFragment.read(this.IconCompatParcelizer);
        }
        if (i != 1) {
            return null;
        }
        return IncomingFragment.IconCompatParcelizer(this.IconCompatParcelizer);
    }

    public final int getCount() {
        return this.MediaBrowserCompat$CustomActionResultReceiver.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.MediaBrowserCompat$ItemReceiver.getString(this.MediaBrowserCompat$CustomActionResultReceiver[i]);
    }
}
