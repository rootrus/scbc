package p040o;

import android.view.View;
import com.scb.phone.view.adapter.landingpage.TileAdapter;
import com.scb.phone.view.adapter.landingpage.TileAdapter$MediaBrowserCompat$SearchResultReceiver;

/* renamed from: o.postUserProfile */
public final /* synthetic */ class postUserProfile implements View.OnClickListener {
    private final /* synthetic */ discardOldLogFiles$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    private final /* synthetic */ TileAdapter.BannerViewHolder.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ postUserProfile(TileAdapter.BannerViewHolder.IconCompatParcelizer iconCompatParcelizer, discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        this.IconCompatParcelizer = discardoldlogfiles_mediabrowsercompat_itemreceiver;
    }

    public final void onClick(View view) {
        TileAdapter.BannerViewHolder.IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver;
        discardOldLogFiles$MediaBrowserCompat$ItemReceiver discardoldlogfiles_mediabrowsercompat_itemreceiver = this.IconCompatParcelizer;
        TileAdapter$MediaBrowserCompat$SearchResultReceiver<discardOldLogFiles$MediaBrowserCompat$ItemReceiver> tileAdapter$MediaBrowserCompat$SearchResultReceiver = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        if (tileAdapter$MediaBrowserCompat$SearchResultReceiver != null) {
            tileAdapter$MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(discardoldlogfiles_mediabrowsercompat_itemreceiver);
        }
    }
}
