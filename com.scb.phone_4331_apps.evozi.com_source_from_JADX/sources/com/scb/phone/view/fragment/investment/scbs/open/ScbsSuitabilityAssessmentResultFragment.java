package com.scb.phone.view.fragment.investment.scbs.open;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C7132hF;
import p040o.FragmentBuilder_BindCalendarDialogFragment;
import p040o.HmlPinActivity;
import p040o.isFocused;
import p040o.isVibrationEnabled;
import p040o.setCheckSampleImage;

public class ScbsSuitabilityAssessmentResultFragment extends BaseFragment implements C7132hF {
    private FragmentBuilder_BindCalendarDialogFragment MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    Button btAssessmentNext;
    @HmlPinActivity
    public setCheckSampleImage presenter;
    @BindView
    TextView tvAssessmentInvestor;
    @BindView
    TextView tvAssessmentName;
    @BindView
    TextView tvAssessmentScore;

    public static ScbsSuitabilityAssessmentResultFragment MediaBrowserCompat$ItemReceiver() {
        Bundle bundle = new Bundle();
        ScbsSuitabilityAssessmentResultFragment scbsSuitabilityAssessmentResultFragment = new ScbsSuitabilityAssessmentResultFragment();
        scbsSuitabilityAssessmentResultFragment.setArguments(bundle);
        return scbsSuitabilityAssessmentResultFragment;
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        super.onCreateView(layoutInflater, viewGroup, bundle);
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f89702131494197, viewGroup, false);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        ButterKnife.IconCompatParcelizer(this, inflate);
        setCheckSampleImage setchecksampleimage = this.presenter;
        isFocused isfocused = new isFocused(setchecksampleimage.write.MediaBrowserCompat$CustomActionResultReceiver.AlertController$RecycleListView());
        if (setchecksampleimage.RatingCompat != null) {
            z = true;
        }
        if (z) {
            isfocused.IconCompatParcelizer(setchecksampleimage.RatingCompat);
        }
        return inflate;
    }

    public final void read(String str, String str2, String str3) {
        this.tvAssessmentName.setText(str);
        this.tvAssessmentScore.setText(str2);
        this.tvAssessmentInvestor.setText(str3);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onNextClicked() {
        setCheckSampleImage setchecksampleimage = this.presenter;
        isVibrationEnabled isvibrationenabled = isVibrationEnabled.read;
        if (setchecksampleimage.RatingCompat != null) {
            isvibrationenabled.IconCompatParcelizer(setchecksampleimage.RatingCompat);
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCalendarDialogFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindCalendarDialogFragment) context;
        }
    }

    public final void write() {
        this.MediaBrowserCompat$CustomActionResultReceiver.setOverlayMode();
    }
}
