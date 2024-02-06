package p040o;

import android.view.View;
import com.scb.phone.view.adapter.moreoptions.MoreOptionsAdapter;

/* renamed from: o.getLinkRtp */
public final /* synthetic */ class getLinkRtp implements View.OnClickListener {
    private final /* synthetic */ MoreOptionsAdapter MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ int read;

    public /* synthetic */ getLinkRtp(MoreOptionsAdapter moreOptionsAdapter, int i) {
        this.MediaBrowserCompat$ItemReceiver = moreOptionsAdapter;
        this.read = i;
    }

    public final void onClick(View view) {
        MoreOptionsAdapter moreOptionsAdapter = this.MediaBrowserCompat$ItemReceiver;
        int i = this.read;
        FragmentBuilder_BindBaseReviewFragment fragmentBuilder_BindBaseReviewFragment = moreOptionsAdapter.write;
        if (fragmentBuilder_BindBaseReviewFragment != null) {
            fragmentBuilder_BindBaseReviewFragment.write(moreOptionsAdapter.read.get(i));
        }
    }
}
