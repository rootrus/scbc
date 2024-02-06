package com.scb.phone.view.fragment.profilemanagement.accounts;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.profilemanagement.manageaccounts.AccountManagementSuccessActivity;
import com.scb.phone.view.custom.profilemanagement.ReviewAccountFooterCustomView;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_ContributeJuristicBusinessPinActivity;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution;
import p040o.C4911kq;
import p040o.C4912kr;
import p040o.HmlPinActivity;
import p040o.QuickExtractor;
import p040o.getKernelIDDstOver;
import p040o.verifyRegistration;

public class ReviewAccountsFragment extends BaseFragment implements QuickExtractor.C70161 {
    private verifyRegistration IconCompatParcelizer;
    public getKernelIDDstOver MediaBrowserCompat$CustomActionResultReceiver = new getKernelIDDstOver();
    @BindView
    ReviewAccountFooterCustomView footer;
    @BindView
    RecyclerView recyclerView;
    @HmlPinActivity
    public C4912kr reviewAccountsPresenter;

    public static ReviewAccountsFragment MediaBrowserCompat$ItemReceiver(List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list, boolean z, boolean z2, int i) {
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("extra_review_accounts", new ArrayList(list));
        bundle.putBoolean("isOnBoarding", z);
        bundle.putBoolean("com.scb.phone.EXTRA_CONSENT_FLAG", z2);
        bundle.putInt("com.scb.phone.EXTRA_CONSENT_VERSION", i);
        ReviewAccountsFragment reviewAccountsFragment = new ReviewAccountsFragment();
        reviewAccountsFragment.setArguments(bundle);
        return reviewAccountsFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89522131494179, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("addaccount_review");
        }
        this.footer.setListener(new ActivityBuilder_ContributeJuristicBusinessPinActivity(this));
        this.IconCompatParcelizer = new verifyRegistration();
        RecyclerView recyclerView2 = this.recyclerView;
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        this.recyclerView.setAdapter(this.IconCompatParcelizer);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.reviewAccountsPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (getArguments() != null) {
            C4912kr krVar = this.reviewAccountsPresenter;
            ArrayList parcelableArrayList = getArguments().getParcelableArrayList("extra_review_accounts");
            boolean z2 = getArguments().getBoolean("com.scb.phone.EXTRA_CONSENT_FLAG");
            int i = getArguments().getInt("com.scb.phone.EXTRA_CONSENT_VERSION");
            krVar.IconCompatParcelizer = parcelableArrayList;
            krVar.MediaBrowserCompat$ItemReceiver = z2;
            krVar.read = i;
            C4911kq kqVar = new C4911kq(parcelableArrayList);
            if (krVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                kqVar.IconCompatParcelizer(krVar.RatingCompat);
            }
        }
        return inflate;
    }

    public void onDestroy() {
        this.reviewAccountsPresenter.onDestroy();
        super.onDestroy();
    }

    public final void IconCompatParcelizer(List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list) {
        this.IconCompatParcelizer.IconCompatParcelizer(list);
    }

    public final void write(List<AutoValue_CrashlyticsReport_Session_Event_Application_Execution.Builder> list) {
        AccountManagementSuccessActivity.IconCompatParcelizer(getContext(), list);
    }
}
