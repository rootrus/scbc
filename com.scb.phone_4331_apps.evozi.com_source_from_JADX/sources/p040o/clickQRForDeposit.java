package p040o;

import android.app.Activity;
import android.view.View;

/* renamed from: o.clickQRForDeposit */
public final /* synthetic */ class clickQRForDeposit implements FragmentBuilder_BindIpoTabFragment {
    private final /* synthetic */ BondErrorNoAccountsActivity IconCompatParcelizer;

    public /* synthetic */ clickQRForDeposit(BondErrorNoAccountsActivity bondErrorNoAccountsActivity) {
        this.IconCompatParcelizer = bondErrorNoAccountsActivity;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        View write;
        BondErrorNoAccountsActivity bondErrorNoAccountsActivity = this.IconCompatParcelizer;
        Activity activity = bondErrorNoAccountsActivity.read;
        if (activity != null && activity != null) {
            BondSelectionActivity bondSelectionActivity = bondErrorNoAccountsActivity.MediaBrowserCompat$SearchResultReceiver;
            if (activity != null && (write = BondSelectionActivity.write(activity)) != null) {
                int[] IconCompatParcelizer2 = BondSelectionActivity.IconCompatParcelizer(activity, write.getWidth(), write.getLeft());
                View MediaBrowserCompat$ItemReceiver = BondSelectionActivity.MediaBrowserCompat$ItemReceiver(8, activity, IconCompatParcelizer2[BondSelectionActivity.MediaBrowserCompat$ItemReceiver.intValue()], IconCompatParcelizer2[BondSelectionActivity.read.intValue()], IconCompatParcelizer2[BondSelectionActivity.write.intValue()], IconCompatParcelizer2[BondSelectionActivity.IconCompatParcelizer.intValue()], new int[]{IconCompatParcelizer2[BondSelectionActivity.MediaBrowserCompat$SearchResultReceiver.intValue()], IconCompatParcelizer2[BondSelectionActivity.MediaBrowserCompat$CustomActionResultReceiver.intValue()]});
                MediaBrowserCompat$ItemReceiver.setClickable(false);
                MediaBrowserCompat$ItemReceiver.setFocusable(false);
                bondSelectionActivity.write(activity, "preview_highlight", MediaBrowserCompat$ItemReceiver);
            }
        }
    }
}
