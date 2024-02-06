package p040o;

import android.view.View;
import com.scb.phone.view.adapter.investment.InvestmentDetailsClientListAdapter;

/* renamed from: o.getAmortizationList */
public final /* synthetic */ class getAmortizationList implements View.OnClickListener {
    private final /* synthetic */ InvestmentDetailsClientListAdapter IconCompatParcelizer;
    private final /* synthetic */ int MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ int read;

    public /* synthetic */ getAmortizationList(InvestmentDetailsClientListAdapter investmentDetailsClientListAdapter, int i, int i2) {
        this.IconCompatParcelizer = investmentDetailsClientListAdapter;
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.read = i2;
    }

    public final void onClick(View view) {
        String str;
        InvestmentDetailsClientListAdapter investmentDetailsClientListAdapter = this.IconCompatParcelizer;
        int i = this.MediaBrowserCompat$CustomActionResultReceiver;
        int i2 = this.read;
        FragmentBuilder_BindCalendarFragment fragmentBuilder_BindCalendarFragment = investmentDetailsClientListAdapter.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindCalendarFragment != null) {
            buildSingleThreadExecutorService buildsinglethreadexecutorservice = investmentDetailsClientListAdapter.read.get(i2);
            if (buildsinglethreadexecutorservice instanceof getNamedThreadFactory) {
                str = ((getNamedThreadFactory) buildsinglethreadexecutorservice).IconCompatParcelizer.MediaBrowserCompat$ItemReceiver;
            } else {
                str = null;
            }
            fragmentBuilder_BindCalendarFragment.read(i, str);
        }
    }
}
