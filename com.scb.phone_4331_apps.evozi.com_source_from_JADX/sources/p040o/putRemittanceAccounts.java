package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.creditcard.InformationTabFragment;
import com.scb.phone.view.fragment.creditcard.PointTabFragment;
import com.scb.phone.view.fragment.creditcard.SettingTabFragment;
import java.util.ArrayList;
import java.util.List;

/* renamed from: o.putRemittanceAccounts */
public final class putRemittanceAccounts extends setCardElevation {
    private String IconCompatParcelizer;
    private Context MediaBrowserCompat$CustomActionResultReceiver;
    private List<chain> MediaBrowserCompat$ItemReceiver;
    private int[] read = {R.string.credit_card_detail_tab, R.string.credit_card_point_tab, R.string.credit_card_setting_tab};
    private chain write;

    public final int getCount() {
        return 3;
    }

    public putRemittanceAccounts(setTitleMarginStart settitlemarginstart, Context context, chain chain, List<chain> list, String str) {
        super(settitlemarginstart);
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.write = chain;
        this.MediaBrowserCompat$ItemReceiver = list;
        this.IconCompatParcelizer = str;
    }

    public final Fragment read(int i) {
        if (i == 0) {
            return InformationTabFragment.IconCompatParcelizer(this.write, this.IconCompatParcelizer);
        }
        if (i == 1) {
            return PointTabFragment.MediaBrowserCompat$CustomActionResultReceiver(this.write, new ArrayList(this.MediaBrowserCompat$ItemReceiver));
        }
        if (i != 2) {
            return null;
        }
        return SettingTabFragment.MediaBrowserCompat$CustomActionResultReceiver(this.write, (ArrayList<chain>) new ArrayList(this.MediaBrowserCompat$ItemReceiver));
    }

    public final CharSequence getPageTitle(int i) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getString(this.read[i]);
    }
}
