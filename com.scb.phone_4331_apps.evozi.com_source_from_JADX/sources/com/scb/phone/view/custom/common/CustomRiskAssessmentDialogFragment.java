package com.scb.phone.view.custom.common;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.DialogFragment;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.investment.InvestmentDetailsFragment;

public class CustomRiskAssessmentDialogFragment extends DialogFragment {
    @BindView
    TextView mRiskCode;
    @BindView
    TextView mRiskLevel;
    @BindView
    TextView mRiskLevelValue;

    public static CustomRiskAssessmentDialogFragment read(InvestmentDetailsFragment investmentDetailsFragment) {
        CustomRiskAssessmentDialogFragment customRiskAssessmentDialogFragment = new CustomRiskAssessmentDialogFragment();
        customRiskAssessmentDialogFragment.setTargetFragment(investmentDetailsFragment, 1);
        return customRiskAssessmentDialogFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f92412131494468, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (getDialog() != null) {
            getDialog().requestWindowFeature(1);
        }
        Bundle arguments = getArguments();
        this.mRiskCode.setText(arguments.getString("RISK_CODE"));
        this.mRiskLevel.setText(R.string.risk_level);
        this.mRiskLevelValue.setText(arguments.getInt("RISK_LEVEL"));
        return inflate;
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
    }

    @OnClick
    public void onClickConfirm() {
        getTargetFragment().onActivityResult(7000, -1, (Intent) null);
        getDialog().dismiss();
    }

    @OnClick
    public void onClickCancel() {
        getTargetFragment().onActivityResult(7000, 0, (Intent) null);
        getDialog().dismiss();
    }
}
