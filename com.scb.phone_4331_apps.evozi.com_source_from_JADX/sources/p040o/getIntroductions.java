package p040o;

import com.scb.phone.view.adapter.landingpage.TileAdapter$MediaBrowserCompat$SearchResultReceiver;

/* renamed from: o.getIntroductions */
public final /* synthetic */ class getIntroductions implements TileAdapter$MediaBrowserCompat$SearchResultReceiver {
    private final /* synthetic */ FragmentBuilder_BindCurrentAddressFragment IconCompatParcelizer;

    public /* synthetic */ getIntroductions(FragmentBuilder_BindCurrentAddressFragment fragmentBuilder_BindCurrentAddressFragment) {
        this.IconCompatParcelizer = fragmentBuilder_BindCurrentAddressFragment;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Object obj) {
        this.IconCompatParcelizer.write((discardOldLogFiles$MediaBrowserCompat$ItemReceiver) obj);
    }
}
