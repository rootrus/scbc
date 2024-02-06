package p040o;

import com.scb.phone.view.adapter.landingpage.TileAdapter$MediaBrowserCompat$SearchResultReceiver;

/* renamed from: o.getUnbilled */
public final /* synthetic */ class getUnbilled implements TileAdapter$MediaBrowserCompat$SearchResultReceiver {
    private final /* synthetic */ FragmentBuilder_BindCurrentAddressFragment read;

    public /* synthetic */ getUnbilled(FragmentBuilder_BindCurrentAddressFragment fragmentBuilder_BindCurrentAddressFragment) {
        this.read = fragmentBuilder_BindCurrentAddressFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        this.read.MediaBrowserCompat$CustomActionResultReceiver((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) obj);
    }
}
