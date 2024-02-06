package com.scb.phone.view.fragment.investment.assessment;

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
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.investment.assessment.RiskLevelsAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.ActivityBuilder_BindLoanTermsConditionsActivity;
import p040o.C10859sendImage;
import p040o.C1183x31fe2cc;
import p040o.HmlPinActivity;
import p040o.getFoldedOrTornDocumentEdges;
import p040o.getInvestmentSummary;
import p040o.getkfsServerType;
import p040o.populateExceptionData;
import p040o.populateExecutionData;

public class RiskSelectionFragment extends BaseFragment implements getFoldedOrTornDocumentEdges {
    private C1183x31fe2cc MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    protected Button continueButton;
    @HmlPinActivity
    public C10859sendImage presenter;
    @BindView
    protected RecyclerView recyclerView;

    @OnClick
    public void continueButtonClicked(View view) {
        C10859sendImage sendimage = this.presenter;
        if (sendimage.read != null) {
            if (sendimage.RatingCompat != null) {
                sendimage.RatingCompat.AlertController$RecycleListView();
            }
            sendimage.write.MediaBrowserCompat$ItemReceiver(sendimage.read);
            sendimage.write.IconCompatParcelizer(new C10859sendImage.read(sendimage, (byte) 0));
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C1183x31fe2cc) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (C1183x31fe2cc) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89582131494185, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        C10859sendImage sendimage = this.presenter;
        if (sendimage.RatingCompat != null) {
            sendimage.RatingCompat.AlertController$RecycleListView();
        }
        sendimage.write.IconCompatParcelizer();
        sendimage.write.IconCompatParcelizer(new C10859sendImage.write(sendimage, (byte) 0));
        return inflate;
    }

    public final void IconCompatParcelizer(boolean z) {
        this.continueButton.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<populateExceptionData> list) {
        RecyclerView recyclerView2 = this.recyclerView;
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(1, false));
        this.recyclerView.IconCompatParcelizer((RecyclerView.RatingCompat) new getInvestmentSummary(getContext(), 16), -1);
        this.recyclerView.setNestedScrollingEnabled(false);
        this.recyclerView.setAdapter(new RiskLevelsAdapter(getContext(), list, new ActivityBuilder_BindLoanTermsConditionsActivity(this)));
    }

    public final /* synthetic */ void read(String str) {
        C10859sendImage sendimage = this.presenter;
        sendimage.read = str;
        getkfsServerType getkfsservertype = new getkfsServerType(sendimage);
        if (sendimage.RatingCompat != null) {
            getkfsservertype.IconCompatParcelizer(sendimage.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(populateExecutionData populateexecutiondata) {
        this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(populateexecutiondata);
    }

    public final void IconCompatParcelizer() {
        this.MediaBrowserCompat$CustomActionResultReceiver.mo14631x50fd9e4a();
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }
}
