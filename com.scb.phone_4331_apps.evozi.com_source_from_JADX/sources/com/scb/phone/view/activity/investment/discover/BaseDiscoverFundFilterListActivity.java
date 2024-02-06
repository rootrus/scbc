package com.scb.phone.view.activity.investment.discover;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.investment.discover.DiscoverFundFilterListFragment;
import com.scb.phone.view.fragment.investment.discover.DiscoverFundFilterListFragment$MediaBrowserCompat$ItemReceiver;
import java.util.ArrayList;
import org.bouncycastle.i18n.MessageBundle;
import p040o.AlertController$RecycleListView;
import p040o.CardView;
import p040o.FragmentBuilder_BindBaseInvestmentSwitchSuccessReviewFragment;
import p040o.onGetStartedClick;
import p040o.populateSessionOperatingSystemData;

public abstract class BaseDiscoverFundFilterListActivity extends BaseActivity implements FragmentBuilder_BindBaseInvestmentSwitchSuccessReviewFragment {
    public void onCreate(Bundle bundle) {
        Activity activity = this;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(activity);
        super.onCreate(bundle);
        setContentView(R.layout.f77432131492968);
        ButterKnife.MediaBrowserCompat$ItemReceiver(activity);
        populateSessionOperatingSystemData populatesessionoperatingsystemdata = (populateSessionOperatingSystemData) getIntent().getParcelableExtra("EXTRA_FUND_FILTER_LIST_DISPLAY");
        if (populatesessionoperatingsystemdata != null) {
            String str = populatesessionoperatingsystemdata.read;
            if (str == null) {
                str = "";
            }
            onGetStartedClick.write((Object) str, MessageBundle.TITLE_ENTRY);
            setStackedBackground();
            MediaSessionCompat$QueueItem(str);
            setTabContainer();
            CardView read = getSupportFragmentManager().read();
            DiscoverFundFilterListFragment$MediaBrowserCompat$ItemReceiver discoverFundFilterListFragment$MediaBrowserCompat$ItemReceiver = DiscoverFundFilterListFragment.IconCompatParcelizer;
            onGetStartedClick.write((Object) populatesessionoperatingsystemdata, "display");
            DiscoverFundFilterListFragment discoverFundFilterListFragment = new DiscoverFundFilterListFragment();
            Bundle bundle2 = new Bundle();
            bundle2.putParcelable("FUND_FILTER_LIST_DISPLAY", populatesessionoperatingsystemdata);
            discoverFundFilterListFragment.setArguments(bundle2);
            read.MediaBrowserCompat$ItemReceiver(R.id.container, discoverFundFilterListFragment).write();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(ArrayList<String> arrayList) {
        onGetStartedClick.write((Object) arrayList, "selectedIds");
        Intent intent = new Intent();
        intent.putStringArrayListExtra("EXTRA_FILTER_IDS_SELECTED", arrayList);
        setResult(-1, intent);
        finish();
    }
}
