package com.scb.phone.view.fragment.investment.assessment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.investment.assessment.BasicAssetAllocationAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.CustomConcurrentHashMap;
import p040o.FragmentBuilder_BindCloseAccountSelectionOwnFragment;
import p040o.HmlPinActivity;
import p040o.getFrontRearHeightDifference;
import p040o.getInvestmentSummary;
import p040o.getServiceCall;
import p040o.populateEventDeviceData;
import p040o.setRequest;

public class RiskReviewFragment extends BaseFragment implements getFrontRearHeightDifference {
    private FragmentBuilder_BindCloseAccountSelectionOwnFragment.write IconCompatParcelizer;
    @BindView
    protected RecyclerView baaRecyclerView;
    @BindView
    protected Button continueButton;
    @BindView
    protected TextView disclaimerText;
    @BindView
    protected TextView investorTypeText;
    @BindView
    protected TextView nameText;
    @HmlPinActivity
    public setRequest presenter;
    @BindView
    protected TextView scoreText;

    @OnClick
    public void continueButtonClicked(View view) {
        setRequest setrequest = this.presenter;
        if (setrequest.RatingCompat != null) {
            setrequest.RatingCompat.AlertController$RecycleListView();
        }
        setrequest.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(new CustomConcurrentHashMap.ValueIterator(setrequest.read));
        setrequest.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new setRequest.write(setrequest, (byte) 0));
    }

    public static RiskReviewFragment read(String str, populateEventDeviceData populateeventdevicedata) {
        RiskReviewFragment riskReviewFragment = new RiskReviewFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("display", populateeventdevicedata);
        bundle.putString("token", str);
        riskReviewFragment.setArguments(bundle);
        return riskReviewFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCloseAccountSelectionOwnFragment.write) {
            this.IconCompatParcelizer = (FragmentBuilder_BindCloseAccountSelectionOwnFragment.write) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89572131494184, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        setRequest setrequest = this.presenter;
        String string = getArguments() != null ? getArguments().getString("token") : "";
        populateEventDeviceData populateeventdevicedata = getArguments() != null ? (populateEventDeviceData) getArguments().getParcelable("display") : null;
        setrequest.read = string;
        getServiceCall getservicecall = new getServiceCall(populateeventdevicedata);
        if (setrequest.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getservicecall.IconCompatParcelizer(setrequest.RatingCompat);
        }
        return inflate;
    }

    public final void IconCompatParcelizer() {
        this.continueButton.setEnabled(true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(populateEventDeviceData populateeventdevicedata) {
        this.nameText.setText(populateeventdevicedata.read);
        this.scoreText.setText(populateeventdevicedata.MediaDescriptionCompat);
        this.investorTypeText.setText(populateeventdevicedata.IconCompatParcelizer);
        this.disclaimerText.setText(populateeventdevicedata.MediaBrowserCompat$CustomActionResultReceiver);
        this.baaRecyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new getInvestmentSummary(getContext(), 12), -1);
        this.baaRecyclerView.setNestedScrollingEnabled(false);
        RecyclerView recyclerView = this.baaRecyclerView;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.baaRecyclerView.setAdapter(new BasicAssetAllocationAdapter(getContext(), populateeventdevicedata.write));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.IconCompatParcelizer.MediaSessionCompat$QueueItem();
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }
}
