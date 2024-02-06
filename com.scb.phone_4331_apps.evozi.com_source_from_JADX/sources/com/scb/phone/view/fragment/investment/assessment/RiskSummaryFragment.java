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
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.adapter.suitabilityassessment.RiskSummaryRecyclerViewAdapter;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.C1182x42c5e53d;
import p040o.CrashlyticsReportDataCapture;
import p040o.CustomConcurrentHashMap;
import p040o.HmlPinActivity;
import p040o.UserLogin;
import p040o.UserLogin$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getFrontRearWidthDifference;
import p040o.onGetStartedClick;
import p040o.populateEventDeviceData;
import p040o.populateExecutionData;
import p040o.writeUInt64NoTag;

public final class RiskSummaryFragment extends BaseFragment implements getFrontRearWidthDifference {
    private C1182x42c5e53d MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public Button btContinue;
    @HmlPinActivity
    public UserLogin presenter;
    @BindView
    public RecyclerView rvQuestions;
    @BindView
    public TextView tvRiskSubTitle;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    @OnClick
    public final void continueButtonClicked() {
        UserLogin userLogin = this.presenter;
        if (userLogin == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (userLogin.RatingCompat != null) {
            userLogin.RatingCompat.AlertController$RecycleListView();
        }
        ArrayList<CrashlyticsReportDataCapture> arrayList = userLogin.IconCompatParcelizer;
        if (arrayList == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("investmentRiskAssessmentAnswerDisplay");
        }
        Iterable<CrashlyticsReportDataCapture> iterable = arrayList;
        int i = 10;
        onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
        if (iterable instanceof Collection) {
            i = ((Collection) iterable).size();
        }
        Collection arrayList2 = new ArrayList(i);
        for (CrashlyticsReportDataCapture crashlyticsReportDataCapture : iterable) {
            arrayList2.add(crashlyticsReportDataCapture.MediaBrowserCompat$CustomActionResultReceiver);
        }
        userLogin.write.MediaBrowserCompat$CustomActionResultReceiver(new CustomConcurrentHashMap.StrongValueReference((List) arrayList2));
        userLogin.write.IconCompatParcelizer(new UserLogin.write());
    }

    public final void onAttach(Context context) {
        onGetStartedClick.write((Object) context, "context");
        super.onAttach(context);
        if (!(context instanceof C1182x42c5e53d)) {
            context = null;
        }
        this.MediaBrowserCompat$CustomActionResultReceiver = (C1182x42c5e53d) context;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89562131494183, viewGroup, false);
        MediaBrowserCompat$CustomActionResultReceiver(this, inflate);
        TextView textView = this.tvRiskSubTitle;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRiskSubTitle");
        }
        textView.setText(getString(R.string.auto_mf_onboarding_suitability_summary_message));
        Button button = this.btContinue;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btContinue");
        }
        button.setText(getString(R.string.auto_mf_onboarding_risk_continue_button));
        UserLogin userLogin = this.presenter;
        if (userLogin == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        userLogin.MediaBrowserCompat$ItemReceiver(this);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("name");
            populateExecutionData populateexecutiondata = (populateExecutionData) arguments.getParcelable("display");
            ArrayList<CrashlyticsReportDataCapture> parcelableArrayList = arguments.getParcelableArrayList("answer");
            if (!(string == null || populateexecutiondata == null || parcelableArrayList == null)) {
                UserLogin userLogin2 = this.presenter;
                if (userLogin2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
                }
                onGetStartedClick.write((Object) string, "name");
                onGetStartedClick.write((Object) populateexecutiondata, "investmentRiskAssessmentDisplay");
                onGetStartedClick.write((Object) parcelableArrayList, "investmentRiskAssessmentAnswerDisplay");
                userLogin2.read = string;
                userLogin2.IconCompatParcelizer = parcelableArrayList;
                writeUInt64NoTag.IconCompatParcelizer userLogin$MediaBrowserCompat$CustomActionResultReceiver = new UserLogin$MediaBrowserCompat$CustomActionResultReceiver(populateexecutiondata, parcelableArrayList);
                if (userLogin2.RatingCompat != null) {
                    userLogin$MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(userLogin2.RatingCompat);
                }
                writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = UserLogin.read.MediaBrowserCompat$CustomActionResultReceiver;
                if (userLogin2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    iconCompatParcelizer.IconCompatParcelizer(userLogin2.RatingCompat);
                }
            }
        }
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Button button = this.btContinue;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btContinue");
        }
        button.setEnabled(true);
    }

    public final void MediaBrowserCompat$ItemReceiver(populateExecutionData populateexecutiondata, ArrayList<CrashlyticsReportDataCapture> arrayList) {
        onGetStartedClick.write((Object) populateexecutiondata, "investmentRiskAssessmentDisplay");
        onGetStartedClick.write((Object) arrayList, "investmentRiskAssessmentAnswerDisplay");
        RecyclerView recyclerView = this.rvQuestions;
        if (recyclerView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvQuestions");
        }
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        RecyclerView recyclerView2 = this.rvQuestions;
        if (recyclerView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvQuestions");
        }
        recyclerView2.setNestedScrollingEnabled(false);
        RecyclerView recyclerView3 = this.rvQuestions;
        if (recyclerView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("rvQuestions");
        }
        recyclerView3.setAdapter(new RiskSummaryRecyclerViewAdapter(populateexecutiondata, arrayList));
    }

    public final void IconCompatParcelizer(String str, populateEventDeviceData populateeventdevicedata) {
        onGetStartedClick.write((Object) str, "tokenId");
        onGetStartedClick.write((Object) populateeventdevicedata, "riskAssessmentReviewDisplay");
        C1182x42c5e53d fragmentBuilder_BindCloseAccountSelectionOwnFragment$MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (fragmentBuilder_BindCloseAccountSelectionOwnFragment$MediaBrowserCompat$CustomActionResultReceiver != null) {
            fragmentBuilder_BindCloseAccountSelectionOwnFragment$MediaBrowserCompat$CustomActionResultReceiver.read(str, populateeventdevicedata);
        }
    }

    public static final RiskSummaryFragment write(String str, populateExecutionData populateexecutiondata, ArrayList<CrashlyticsReportDataCapture> arrayList) {
        onGetStartedClick.write((Object) str, "name");
        onGetStartedClick.write((Object) populateexecutiondata, "display");
        onGetStartedClick.write((Object) arrayList, "answer");
        RiskSummaryFragment riskSummaryFragment = new RiskSummaryFragment();
        Bundle bundle = new Bundle();
        bundle.putString("name", str);
        bundle.putParcelable("display", populateexecutiondata);
        bundle.putParcelableArrayList("answer", arrayList);
        riskSummaryFragment.setArguments(bundle);
        return riskSummaryFragment;
    }
}
