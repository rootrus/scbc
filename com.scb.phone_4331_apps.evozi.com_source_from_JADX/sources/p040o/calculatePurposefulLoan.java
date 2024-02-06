package p040o;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.scb.phone.R;
import com.scb.phone.view.fragment.sme.gifting.GiftSelectionEmptyStateFragment;
import com.scb.phone.view.fragment.sme.gifting.GiftSelectionFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_OperatingSystem;

/* renamed from: o.calculatePurposefulLoan */
public final class calculatePurposefulLoan extends BrowserActionsFallbackMenuView {
    private List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> IconCompatParcelizer;
    private Context MediaBrowserCompat$CustomActionResultReceiver;
    private List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> MediaBrowserCompat$ItemReceiver;
    private List<Fragment> read;
    private int[] write = {R.string.gifts_present_tab, R.string.gifts_money_tab};

    public calculatePurposefulLoan(Context context, setTitleMarginStart settitlemarginstart, List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> list, List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> list2) {
        super(settitlemarginstart);
        Object obj;
        Object obj2;
        this.MediaBrowserCompat$CustomActionResultReceiver = context;
        this.IconCompatParcelizer = list;
        this.MediaBrowserCompat$ItemReceiver = list2;
        ArrayList arrayList = new ArrayList();
        this.read = arrayList;
        List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> list3 = this.MediaBrowserCompat$ItemReceiver;
        String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(R.string.choose_present_text);
        if (list3 == null || list3.isEmpty()) {
            obj = GiftSelectionEmptyStateFragment.IconCompatParcelizer();
        } else {
            obj = GiftSelectionFragment.write(list3, string);
        }
        arrayList.add(obj);
        List<Fragment> list4 = this.read;
        List<AutoValue_CrashlyticsReport_Session_OperatingSystem.C30991> list5 = this.IconCompatParcelizer;
        String string2 = this.MediaBrowserCompat$CustomActionResultReceiver.getString(R.string.choose_money_text);
        if (list5 == null || list5.isEmpty()) {
            obj2 = GiftSelectionEmptyStateFragment.IconCompatParcelizer();
        } else {
            obj2 = GiftSelectionFragment.write(list5, string2);
        }
        list4.add(obj2);
    }

    public final Fragment MediaBrowserCompat$CustomActionResultReceiver(int i) {
        return this.read.get(i);
    }

    public final int getCount() {
        return this.read.size();
    }

    public final CharSequence getPageTitle(int i) {
        return this.MediaBrowserCompat$CustomActionResultReceiver.getString(this.write[i]);
    }
}
