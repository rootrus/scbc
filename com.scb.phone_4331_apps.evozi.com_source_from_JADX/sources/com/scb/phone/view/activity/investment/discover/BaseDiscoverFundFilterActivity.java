package com.scb.phone.view.activity.investment.discover;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.data.network.service.easycash.EasycashNcbConsentService;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.investment.discover.DiscoverFundFilterFragment;
import com.scb.phone.view.fragment.investment.discover.DiscoverFundFilterFragment$MediaBrowserCompat$ItemReceiver;
import org.bouncycastle.i18n.MessageBundle;
import p040o.AlertController$RecycleListView;
import p040o.FragmentBuilder_BindBaseRemittanceDetailsFragment;
import p040o.HmlPinActivity;
import p040o.captureEventData;
import p040o.onGetStartedClick;
import p040o.populateFramesList;

public abstract class BaseDiscoverFundFilterActivity extends BaseActivity implements FragmentBuilder_BindBaseRemittanceDetailsFragment {
    public void onCreate(Bundle bundle) {
        Activity activity = this;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(activity);
        super.onCreate(bundle);
        setContentView(R.layout.f77422131492967);
        ButterKnife.MediaBrowserCompat$ItemReceiver(activity);
        String string = getString(R.string.filter);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.filter)");
        onGetStartedClick.write((Object) string, MessageBundle.TITLE_ENTRY);
        setStackedBackground();
        MediaSessionCompat$QueueItem(string);
        setTabContainer();
        DiscoverFundFilterFragment$MediaBrowserCompat$ItemReceiver discoverFundFilterFragment$MediaBrowserCompat$ItemReceiver = DiscoverFundFilterFragment.MediaBrowserCompat$CustomActionResultReceiver;
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_FUND_FILTER_DISPLAY");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtr…XTRA_FUND_FILTER_DISPLAY)");
        populateFramesList populateframeslist = (populateFramesList) parcelableExtra;
        captureEventData captureeventdata = (captureEventData) getIntent().getParcelableExtra("EXTRA_FUND_FILTER_SELECTED_DISPLAY");
        onGetStartedClick.write((Object) populateframeslist, "display");
        DiscoverFundFilterFragment discoverFundFilterFragment = new DiscoverFundFilterFragment();
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("FUND_FILTER_DISPLAY", populateframeslist);
        if (captureeventdata != null) {
            bundle2.putParcelable("FUND_FILTER_SELECTED_DISPLAY", captureeventdata);
        }
        discoverFundFilterFragment.setArguments(bundle2);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, discoverFundFilterFragment).write();
    }

    public final void IconCompatParcelizer(captureEventData captureeventdata) {
        Intent intent = new Intent();
        intent.putExtra("EXTRA_FUND_FILTER_DISPLAY_RETURN", captureeventdata);
        setResult(-1, intent);
        finish();
    }

    public static final class write {
        public final EasycashNcbConsentService write;

        private write() {
        }

        @HmlPinActivity
        public write(EasycashNcbConsentService easycashNcbConsentService) {
            onGetStartedClick.write((Object) easycashNcbConsentService, "easycashNcbConsentService");
            this.write = easycashNcbConsentService;
        }
    }
}
