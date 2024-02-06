package com.scb.phone.view.fragment.investment.assessment;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.view.adapter.investment.assessment.BasicAssetAllocationAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.getInvestmentSummary;
import p040o.populateEventDeviceData;

public class RiskAssessmentSuccessScreenshotFragment extends BaseFragment {
    @BindView
    protected RecyclerView baaRecyclerView;
    @BindView
    protected TextView dateText;
    @BindView
    protected TextView investorTypeText;
    @BindView
    protected TextView nameText;
    @BindView
    protected TextView scoreText;

    public final void IconCompatParcelizer(populateEventDeviceData populateeventdevicedata, View view, Context context) {
        ButterKnife.IconCompatParcelizer(this, view);
        this.nameText.setText(populateeventdevicedata.read);
        this.scoreText.setText(populateeventdevicedata.MediaDescriptionCompat);
        this.investorTypeText.setText(populateeventdevicedata.IconCompatParcelizer);
        this.dateText.setText(populateeventdevicedata.MediaBrowserCompat$ItemReceiver);
        this.baaRecyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new getInvestmentSummary(context, 12), -1);
        this.baaRecyclerView.setNestedScrollingEnabled(false);
        this.baaRecyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        this.baaRecyclerView.setAdapter(new BasicAssetAllocationAdapter(context, populateeventdevicedata.write));
    }
}
