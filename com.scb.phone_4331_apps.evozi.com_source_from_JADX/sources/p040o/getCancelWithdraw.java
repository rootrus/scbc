package p040o;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.scb.phone.view.fragment.investment.purchase.IpoTabFragment;
import com.scb.phone.view.fragment.investment.purchase.OthersTabFragment;
import com.scb.phone.view.fragment.investment.purchase.PurchasedTabFragment;
import com.scb.phone.view.fragment.investment.purchase.SSFTabFragment;
import com.scb.phone.view.fragment.investment.purchase.SSFTabFragment$MediaBrowserCompat$ItemReceiver;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* renamed from: o.getCancelWithdraw */
public final class getCancelWithdraw extends setCardElevation {
    public final HashMap<String, Fragment> MediaBrowserCompat$CustomActionResultReceiver = new HashMap<>();
    private final Context MediaBrowserCompat$ItemReceiver;
    private final InstallerPackageNameProvider read;
    private final int[] write = {Iterables$3$MediaBrowserCompat$MediaItem.PURCHASED, Iterables$3$MediaBrowserCompat$MediaItem.OTHERS, Iterables$3$MediaBrowserCompat$MediaItem.SSF, Iterables$3$MediaBrowserCompat$MediaItem.IPO};

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public getCancelWithdraw(setTitleMarginStart settitlemarginstart, Context context, InstallerPackageNameProvider installerPackageNameProvider) {
        super(settitlemarginstart);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) installerPackageNameProvider, "purchaseSearchDisplay");
        this.MediaBrowserCompat$ItemReceiver = context;
        this.read = installerPackageNameProvider;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            PurchasedTabFragment MediaBrowserCompat$CustomActionResultReceiver2 = PurchasedTabFragment.MediaBrowserCompat$CustomActionResultReceiver(this.read.read);
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver2, "purchasedTabFragment");
            this.MediaBrowserCompat$CustomActionResultReceiver.put("FRAGMENT_PURCHASED", MediaBrowserCompat$CustomActionResultReceiver2);
            return MediaBrowserCompat$CustomActionResultReceiver2;
        } else if (i == 1) {
            OthersTabFragment read2 = OthersTabFragment.read(this.read.IconCompatParcelizer);
            onGetStartedClick.IconCompatParcelizer((Object) read2, "othersTabsFragment");
            this.MediaBrowserCompat$CustomActionResultReceiver.put("FRAGMENT_OTHERS", read2);
            return read2;
        } else if (i == 2) {
            SSFTabFragment$MediaBrowserCompat$ItemReceiver sSFTabFragment$MediaBrowserCompat$ItemReceiver = SSFTabFragment.IconCompatParcelizer;
            List<InstallIdProvider> list = this.read.MediaBrowserCompat$ItemReceiver;
            SSFTabFragment sSFTabFragment = new SSFTabFragment();
            if (list != null) {
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("LIST_SSF", (ArrayList) list);
                bundle.putString("extra_search_type", "SSF");
                sSFTabFragment.setArguments(bundle);
            }
            this.MediaBrowserCompat$CustomActionResultReceiver.put("FRAGMENT_SSF", sSFTabFragment);
            return sSFTabFragment;
        } else if (i != 3) {
            return new Fragment();
        } else {
            IpoTabFragment MediaBrowserCompat$CustomActionResultReceiver3 = IpoTabFragment.MediaBrowserCompat$CustomActionResultReceiver(this.read.MediaBrowserCompat$CustomActionResultReceiver);
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$CustomActionResultReceiver3, "ipoTabFragment");
            this.MediaBrowserCompat$CustomActionResultReceiver.put("FRAGMENT_IPO", MediaBrowserCompat$CustomActionResultReceiver3);
            return MediaBrowserCompat$CustomActionResultReceiver3;
        }
    }

    public final int getCount() {
        return this.write.length;
    }

    public final CharSequence getPageTitle(int i) {
        return this.MediaBrowserCompat$ItemReceiver.getString(this.write[i]);
    }
}
