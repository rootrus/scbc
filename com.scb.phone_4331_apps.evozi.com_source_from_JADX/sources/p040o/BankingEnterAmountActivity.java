package p040o;

import android.app.Activity;
import java.util.LinkedList;
import p040o.BondErrorNoAccountsActivity;

/* renamed from: o.BankingEnterAmountActivity */
public final /* synthetic */ class BankingEnterAmountActivity implements FragmentBuilder_BindIpoTabFragment {
    private final /* synthetic */ DeejungTransferLandingActivity read;
    private final /* synthetic */ BondErrorNoAccountsActivity write;

    public /* synthetic */ BankingEnterAmountActivity(BondErrorNoAccountsActivity bondErrorNoAccountsActivity, DeejungTransferLandingActivity deejungTransferLandingActivity) {
        this.write = bondErrorNoAccountsActivity;
        this.read = deejungTransferLandingActivity;
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        BondErrorNoAccountsActivity bondErrorNoAccountsActivity = this.write;
        DeejungTransferLandingActivity deejungTransferLandingActivity = this.read;
        Activity activity = bondErrorNoAccountsActivity.read;
        if (activity != null && deejungTransferLandingActivity != null) {
            BaseAmortizationActivity baseAmortizationActivity = bondErrorNoAccountsActivity.MediaMetadataCompat;
            if (activity != null) {
                boolean z = false;
                if (!(deejungTransferLandingActivity.MediaSessionCompat$QueueItem || deejungTransferLandingActivity.ParcelableVolumeInfo.equals(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem))) {
                    FragmentBuilder_BindHmlExternalAuthenticationFragment fragmentBuilder_BindHmlExternalAuthenticationFragment = bondErrorNoAccountsActivity.MediaSessionCompat$QueueItem;
                    String str = deejungTransferLandingActivity.MediaBrowserCompat$MediaItem;
                    DeejungTransferLandingActivity deejungTransferLandingActivity2 = fragmentBuilder_BindHmlExternalAuthenticationFragment.write.get(str) != null ? (DeejungTransferLandingActivity) fragmentBuilder_BindHmlExternalAuthenticationFragment.write.get(str).get(deejungTransferLandingActivity.ParcelableVolumeInfo) : null;
                    if (deejungTransferLandingActivity2 != null) {
                        deejungTransferLandingActivity = deejungTransferLandingActivity2;
                    }
                }
                if (deejungTransferLandingActivity.MediaSessionCompat$QueueItem || deejungTransferLandingActivity.ParcelableVolumeInfo.equals(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem)) {
                    z = true;
                }
                if (z) {
                    bondErrorNoAccountsActivity.MediaBrowserCompat$ItemReceiver(activity, deejungTransferLandingActivity);
                    return;
                }
                int i = BondErrorNoAccountsActivity.C63445.read[baseAmortizationActivity.ordinal()];
                if (i == 1) {
                    bondErrorNoAccountsActivity.write(activity, bondErrorNoAccountsActivity.RatingCompat.get(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem));
                    bondErrorNoAccountsActivity.MediaBrowserCompat$ItemReceiver(activity, deejungTransferLandingActivity);
                } else if (i == 2) {
                    bondErrorNoAccountsActivity.write(activity, deejungTransferLandingActivity);
                    bondErrorNoAccountsActivity.MediaBrowserCompat$ItemReceiver(activity, bondErrorNoAccountsActivity.RatingCompat.get(deejungTransferLandingActivity.MediaBrowserCompat$MediaItem));
                } else if (i == 3) {
                    bondErrorNoAccountsActivity.MediaBrowserCompat$CustomActionResultReceiver();
                    LinkedList linkedList = new LinkedList();
                    bondErrorNoAccountsActivity.write(activity, deejungTransferLandingActivity, linkedList);
                    bondErrorNoAccountsActivity.f3125x50fd9e4a = linkedList;
                    bondErrorNoAccountsActivity.read(activity, deejungTransferLandingActivity, linkedList, true);
                    bondErrorNoAccountsActivity.write.MediaBrowserCompat$ItemReceiver(activity, deejungTransferLandingActivity);
                }
            }
        }
    }
}
