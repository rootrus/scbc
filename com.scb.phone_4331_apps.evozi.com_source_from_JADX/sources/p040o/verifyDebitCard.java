package p040o;

import com.scb.phone.view.adapter.landingpage.TileAdapter$MediaBrowserCompat$SearchResultReceiver;

/* renamed from: o.verifyDebitCard */
public final /* synthetic */ class verifyDebitCard implements TileAdapter$MediaBrowserCompat$SearchResultReceiver {
    private final /* synthetic */ FragmentBuilder_BindCurrentAddressFragment MediaBrowserCompat$ItemReceiver;

    public /* synthetic */ verifyDebitCard(FragmentBuilder_BindCurrentAddressFragment fragmentBuilder_BindCurrentAddressFragment) {
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindCurrentAddressFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$MediaItem((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) obj);
    }
}
