package com.scb.phone.view.fragment.investment.discover;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.adapter.investment.discover.DiscoverFundFilterListAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory;
import p040o.FragmentBuilder_BindBaseInvestmentSwitchSuccessReviewFragment;
import p040o.HmlPinActivity;
import p040o.loadInBackground;
import p040o.loginUser;
import p040o.onGetStartedClick;
import p040o.populateSessionOperatingSystemData;

public final class DiscoverFundFilterListFragment extends BaseFragment implements CheckCaptureModule_GetICheckDeserializerRttiFactory {
    public static final DiscoverFundFilterListFragment$MediaBrowserCompat$ItemReceiver IconCompatParcelizer = new DiscoverFundFilterListFragment$MediaBrowserCompat$ItemReceiver((byte) 0);
    /* access modifiers changed from: private */
    public FragmentBuilder_BindBaseInvestmentSwitchSuccessReviewFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final write MediaBrowserCompat$MediaItem = new write();
    @BindView
    public Button btSelect;
    @HmlPinActivity
    public loginUser presenter;
    @BindView
    public RecyclerView rvFundDiscover;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write implements loadInBackground {
        write() {
        }
    }

    public final void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindBaseInvestmentSwitchSuccessReviewFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindBaseInvestmentSwitchSuccessReviewFragment) context;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            loginUser loginuser = this.presenter;
            if (loginuser == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            loginuser.MediaBrowserCompat$ItemReceiver = (populateSessionOperatingSystemData) arguments.getParcelable("FUND_FILTER_LIST_DISPLAY");
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f87602131493987, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        Context context = getContext();
        loginUser loginuser = this.presenter;
        if (loginuser == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        DiscoverFundFilterListAdapter discoverFundFilterListAdapter = new DiscoverFundFilterListAdapter(context, loginuser.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$MediaItem);
        RecyclerView recyclerView = this.rvFundDiscover;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvFundDiscover");
        }
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter(discoverFundFilterListAdapter);
        Button button = this.btSelect;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btSelect");
        }
        button.setOnClickListener(new read(this));
    }

    static final class read implements View.OnClickListener {
        private /* synthetic */ DiscoverFundFilterListFragment MediaBrowserCompat$ItemReceiver;

        read(DiscoverFundFilterListFragment discoverFundFilterListFragment) {
            this.MediaBrowserCompat$ItemReceiver = discoverFundFilterListFragment;
        }

        public final void onClick(View view) {
            List list;
            FragmentBuilder_BindBaseInvestmentSwitchSuccessReviewFragment IconCompatParcelizer = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver;
            if (IconCompatParcelizer != null) {
                loginUser loginuser = this.MediaBrowserCompat$ItemReceiver.presenter;
                if (loginuser == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                populateSessionOperatingSystemData populatesessionoperatingsystemdata = loginuser.MediaBrowserCompat$ItemReceiver;
                List list2 = null;
                if (populatesessionoperatingsystemdata != null) {
                    list = populatesessionoperatingsystemdata.MediaBrowserCompat$CustomActionResultReceiver;
                } else {
                    list = null;
                }
                if (list instanceof ArrayList) {
                    list2 = list;
                }
                ArrayList arrayList = (ArrayList) list2;
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(arrayList);
            }
        }
    }
}
