package p040o;

import java.util.concurrent.Callable;
import p040o.AbstractMultimap;

/* renamed from: o.getCancelWithdraw$MediaBrowserCompat$ItemReceiver */
public final class getCancelWithdraw$MediaBrowserCompat$ItemReceiver implements Callable {
    private final /* synthetic */ String MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ C6514xb47b5894 write;

    private getCancelWithdraw$MediaBrowserCompat$ItemReceiver() {
    }

    public /* synthetic */ getCancelWithdraw$MediaBrowserCompat$ItemReceiver(C6514xb47b5894 fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver, String str) {
        this.write = fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver;
        this.MediaBrowserCompat$ItemReceiver = str;
    }

    public final Object call() {
        C6514xb47b5894 fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver = this.write;
        String str = this.MediaBrowserCompat$ItemReceiver;
        fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat = AbstractMultimap.AsMap.AsMapEntries.LOADING;
        if (fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat == null) {
            fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat = new ContentModelParser();
        }
        fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat.MediaBrowserCompat$SearchResultReceiver = null;
        return fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaDescriptionCompat, str, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat, fragmentBuilder_BindEasycashLoanAccountFragment$MediaBrowserCompat$CustomActionResultReceiver.read);
    }
}
