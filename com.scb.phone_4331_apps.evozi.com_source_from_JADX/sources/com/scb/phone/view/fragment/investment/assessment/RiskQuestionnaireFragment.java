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
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.suitabilityassessment.QuestionnaireRecyclerViewAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.List;
import p040o.CrashlyticsReportDataCapture;
import p040o.CustomConcurrentHashMap;
import p040o.FragmentBuilder_BindChequeStatusFragment;
import p040o.FragmentBuilder_BindCloseAccountSelectionOwnFragment;
import p040o.HmlPinActivity;
import p040o.cancelJob;
import p040o.cancelJob$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getExtraHeaders;
import p040o.getGrayLevelStreakMaxHeight;
import p040o.onGetStartedClick;
import p040o.populateExecutionData;

public final class RiskQuestionnaireFragment extends BaseFragment implements getGrayLevelStreakMaxHeight {
    private FragmentBuilder_BindCloseAccountSelectionOwnFragment.read IconCompatParcelizer;
    private final FragmentBuilder_BindChequeStatusFragment MediaBrowserCompat$CustomActionResultReceiver = new RiskQuestionnaireFragment$MediaBrowserCompat$ItemReceiver(this);
    @BindView
    public Button btContinue;
    @HmlPinActivity
    public cancelJob presenter;
    @BindView
    public RecyclerView rvQuestions;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void onAttach(Context context) {
        onGetStartedClick.write((Object) context, "context");
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCloseAccountSelectionOwnFragment.read) {
            this.IconCompatParcelizer = (FragmentBuilder_BindCloseAccountSelectionOwnFragment.read) context;
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        populateExecutionData populateexecutiondata;
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89562131494183, viewGroup, false);
        MediaBrowserCompat$CustomActionResultReceiver(this, inflate);
        cancelJob canceljob = this.presenter;
        if (canceljob == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        canceljob.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (!(arguments == null || (populateexecutiondata = (populateExecutionData) arguments.getParcelable("display")) == null)) {
            cancelJob canceljob2 = this.presenter;
            if (canceljob2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            canceljob2.read = populateexecutiondata;
            getExtraHeaders getextraheaders = new getExtraHeaders(populateexecutiondata);
            if (canceljob2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                getextraheaders.IconCompatParcelizer(canceljob2.RatingCompat);
            }
            canceljob2.read();
        }
        return inflate;
    }

    @OnClick
    public final void continueButtonClicked() {
        cancelJob canceljob = this.presenter;
        if (canceljob == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        List<CrashlyticsReportDataCapture> list = canceljob.write;
        if (list != null) {
            if (canceljob.RatingCompat != null) {
                canceljob.RatingCompat.AlertController$RecycleListView();
            }
            ArrayList arrayList = new ArrayList();
            for (CrashlyticsReportDataCapture crashlyticsReportDataCapture : list) {
                arrayList.add(crashlyticsReportDataCapture.MediaBrowserCompat$CustomActionResultReceiver);
            }
            canceljob.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver(new CustomConcurrentHashMap.StrongValueReference(arrayList));
            canceljob.IconCompatParcelizer.IconCompatParcelizer(new cancelJob$MediaBrowserCompat$CustomActionResultReceiver(canceljob, (byte) 0));
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(populateExecutionData populateexecutiondata) {
        onGetStartedClick.write((Object) populateexecutiondata, "display");
        RecyclerView recyclerView = this.rvQuestions;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvQuestions");
        }
        recyclerView.getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setAdapter(new QuestionnaireRecyclerViewAdapter(populateexecutiondata, this.MediaBrowserCompat$CustomActionResultReceiver));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Button button = this.btContinue;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btContinue");
        }
        button.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<CrashlyticsReportDataCapture> list) {
        onGetStartedClick.write((Object) list, "answer");
        FragmentBuilder_BindCloseAccountSelectionOwnFragment.read read = this.IconCompatParcelizer;
        if (read != null) {
            read.MediaBrowserCompat$ItemReceiver(list);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        cancelJob canceljob = this.presenter;
        if (canceljob == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        canceljob.onDestroy();
    }

    public static final RiskQuestionnaireFragment MediaBrowserCompat$CustomActionResultReceiver(String str, populateExecutionData populateexecutiondata) {
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) populateexecutiondata, "display");
        RiskQuestionnaireFragment riskQuestionnaireFragment = new RiskQuestionnaireFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        bundle.putParcelable("display", populateexecutiondata);
        riskQuestionnaireFragment.setArguments(bundle);
        return riskQuestionnaireFragment;
    }
}
