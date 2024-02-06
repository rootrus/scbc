package com.scb.phone.view.fragment.investment.onboarding;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.investment.onboarding.FundSourceListAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.FragmentBuilder_BindCardlessWithdrawAmountFragment;
import p040o.HmlPinActivity;
import p040o.getCrashlyticsInstallId;
import p040o.injectRttiCheckDeserializer;
import p040o.onGlobalLayout;
import p040o.onGlobalLayout$MediaBrowserCompat$ItemReceiver;

public class FundSourceListFragment extends BaseFragment implements injectRttiCheckDeserializer.write, FragmentBuilder_BindCardlessWithdrawAmountFragment {
    private FundSourceListAdapter IconCompatParcelizer;
    @BindView
    RecyclerView recyclerView;
    @HmlPinActivity
    public onGlobalLayout sourceOfFundListPresenter;

    public void onAttach(Context context) {
        super.onAttach(context);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88472131494074, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.sourceOfFundListPresenter.MediaBrowserCompat$ItemReceiver(this);
        onGlobalLayout ongloballayout = this.sourceOfFundListPresenter;
        if (ongloballayout.RatingCompat != null) {
            z = true;
        }
        if (z) {
            ongloballayout.RatingCompat.AlertController$RecycleListView();
        }
        ongloballayout.read.MediaBrowserCompat$CustomActionResultReceiver();
        ongloballayout.read.IconCompatParcelizer(new onGlobalLayout$MediaBrowserCompat$ItemReceiver(ongloballayout));
        return inflate;
    }

    public final void write(List<getCrashlyticsInstallId> list) {
        getContext();
        this.IconCompatParcelizer = new FundSourceListAdapter(list, this);
        getContext();
        this.recyclerView.setLayoutManager(new LinearLayoutManager());
        this.recyclerView.setAdapter(this.IconCompatParcelizer);
        this.recyclerView.setNestedScrollingEnabled(true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        getCrashlyticsInstallId getcrashlyticsinstallid;
        FundSourceListAdapter fundSourceListAdapter = this.IconCompatParcelizer;
        if (fundSourceListAdapter != null) {
            List<getCrashlyticsInstallId> list = fundSourceListAdapter.read;
            if (list != null) {
                getcrashlyticsinstallid = list.get(i);
            } else {
                getcrashlyticsinstallid = null;
            }
            Intent intent = new Intent();
            intent.putExtra("EXTRA_FUND_SOURCE", getcrashlyticsinstallid);
            Fragment targetFragment = getTargetFragment();
            if (targetFragment != null) {
                targetFragment.onActivityResult(getTargetRequestCode(), -1, intent);
            }
            getActivity().onBackPressed();
        }
    }
}
