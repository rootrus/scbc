package p040o;

import android.view.View;
import com.scb.phone.view.adapter.sme.gifting.GifShareMomentBackgroundAdapter;

/* renamed from: o.getProductTermAndCondition */
public final /* synthetic */ class getProductTermAndCondition implements View.OnClickListener {
    private final /* synthetic */ GifShareMomentBackgroundAdapter IconCompatParcelizer;
    private final /* synthetic */ withEvents read;

    public /* synthetic */ getProductTermAndCondition(GifShareMomentBackgroundAdapter gifShareMomentBackgroundAdapter, withEvents withevents) {
        this.IconCompatParcelizer = gifShareMomentBackgroundAdapter;
        this.read = withevents;
    }

    public final void onClick(View view) {
        GifShareMomentBackgroundAdapter gifShareMomentBackgroundAdapter = this.IconCompatParcelizer;
        withEvents withevents = this.read;
        if (!withevents.MediaBrowserCompat$MediaItem) {
            show show = new show(gifShareMomentBackgroundAdapter.MediaBrowserCompat$ItemReceiver);
            performSelectProduct performselectproduct = performSelectProduct.MediaBrowserCompat$CustomActionResultReceiver;
            while (show.IconCompatParcelizer.hasNext()) {
                performselectproduct.MediaBrowserCompat$ItemReceiver(show.IconCompatParcelizer.next());
            }
            withevents.MediaBrowserCompat$MediaItem = true;
            gifShareMomentBackgroundAdapter.read.MediaBrowserCompat$ItemReceiver(withevents);
        }
        gifShareMomentBackgroundAdapter.IconCompatParcelizer.write();
    }
}
