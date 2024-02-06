package p040o;

import android.view.View;
import com.scb.phone.view.adapter.investment.InvestmentDetailsClientListAdapter;
import p040o.ExecutorUtils;

/* renamed from: o.generateTokenForDeejungTransfer */
public final /* synthetic */ class generateTokenForDeejungTransfer implements View.OnClickListener {
    private final /* synthetic */ buildSingleThreadExecutorService IconCompatParcelizer;
    private final /* synthetic */ InvestmentDetailsClientListAdapter read;

    public /* synthetic */ generateTokenForDeejungTransfer(InvestmentDetailsClientListAdapter investmentDetailsClientListAdapter, buildSingleThreadExecutorService buildsinglethreadexecutorservice) {
        this.read = investmentDetailsClientListAdapter;
        this.IconCompatParcelizer = buildsinglethreadexecutorservice;
    }

    public final void onClick(View view) {
        InvestmentDetailsClientListAdapter investmentDetailsClientListAdapter = this.read;
        buildSingleThreadExecutorService buildsinglethreadexecutorservice = this.IconCompatParcelizer;
        FragmentBuilder_BindCalendarFragment fragmentBuilder_BindCalendarFragment = investmentDetailsClientListAdapter.MediaBrowserCompat$ItemReceiver;
        if (fragmentBuilder_BindCalendarFragment != null) {
            fragmentBuilder_BindCalendarFragment.read(0, ((ExecutorUtils.C33402) buildsinglethreadexecutorservice).write.MediaBrowserCompat$ItemReceiver);
        }
    }
}
