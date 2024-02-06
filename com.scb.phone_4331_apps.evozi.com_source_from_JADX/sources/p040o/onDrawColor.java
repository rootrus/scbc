package p040o;

import com.scb.phone.view.activity.mwpartner.MwCreateQrActivity;
import com.squareup.picasso.Picasso$MediaBrowserCompat$CustomActionResultReceiver;

/* renamed from: o.onDrawColor */
public final /* synthetic */ class onDrawColor implements Picasso$MediaBrowserCompat$CustomActionResultReceiver {
    private final /* synthetic */ MwCreateQrActivity write;

    public /* synthetic */ onDrawColor(MwCreateQrActivity mwCreateQrActivity) {
        this.write = mwCreateQrActivity;
    }

    public final void read() {
        MwCreateQrActivity mwCreateQrActivity = this.write;
        mwCreateQrActivity.imageShopCover.setVisibility(8);
        mwCreateQrActivity.layoutEmptyShopCover.setVisibility(0);
    }
}
