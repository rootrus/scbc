package com.scb.phone.view.fragment.profilemanagement.promptpay;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.adapter.profilemanagement.promptpay.DepositAccountsAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.ActivityBuilder_ContributeMailingAddressDetailsActivity;
import p040o.ActivityBuilder_ContributeMailingAddressLandingActivity;
import p040o.ActivityBuilder_ContributeManageEmailInputActivity;
import p040o.C3080xc2f5febc;
import p040o.FragmentBuilder_BindCcSofBillPaymentInputFragment;
import p040o.getInvestmentSummary;

public class LinkAccountFragment extends BaseFragment {
    public FragmentBuilder_BindCcSofBillPaymentInputFragment.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    ImageView accountIcon;
    @BindView
    TextView accountNumberText;
    @BindView
    public Button linkButton;
    @BindView
    RecyclerView recyclerView;
    @BindView
    CheckBox requestMoneyToggle;

    public static LinkAccountFragment MediaBrowserCompat$ItemReceiver(C3080xc2f5febc autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception) {
        LinkAccountFragment linkAccountFragment = new LinkAccountFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("deposits", autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception);
        linkAccountFragment.setArguments(bundle);
        return linkAccountFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCcSofBillPaymentInputFragment.IconCompatParcelizer) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindCcSofBillPaymentInputFragment.IconCompatParcelizer) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88272131494054, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        C3080xc2f5febc autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception = (C3080xc2f5febc) getArguments().getParcelable("deposits");
        RecyclerView recyclerView2 = this.recyclerView;
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        this.recyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new getInvestmentSummary(getContext(), 16), -1);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.recyclerView.setAdapter(new DepositAccountsAdapter(getContext(), autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.write, new ActivityBuilder_ContributeMailingAddressLandingActivity(this)));
        this.accountNumberText.setText(autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.MediaBrowserCompat$CustomActionResultReceiver);
        this.accountIcon.setImageResource(autoValue_CrashlyticsReport_Session_Event_Application_Execution_Exception.IconCompatParcelizer == 0 ? R.drawable.ic_mobile : R.drawable.ic_cid);
        this.linkButton.setOnClickListener(new ActivityBuilder_ContributeManageEmailInputActivity(this));
        this.requestMoneyToggle.setOnCheckedChangeListener(new ActivityBuilder_ContributeMailingAddressDetailsActivity(this));
        return inflate;
    }
}
