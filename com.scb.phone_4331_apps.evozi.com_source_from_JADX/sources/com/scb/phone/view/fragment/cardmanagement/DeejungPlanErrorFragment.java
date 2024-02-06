package com.scb.phone.view.fragment.cardmanagement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;

public class DeejungPlanErrorFragment extends BaseFragment {
    @BindView
    protected Button btnDeejungReview;
    @BindView
    protected TextView txvPlanErrorBody;
    @BindView
    protected TextView txvPlanErrorHeader;

    public static DeejungPlanErrorFragment write(String str, String str2) {
        return read(str, str2, false);
    }

    public static DeejungPlanErrorFragment read(String str, String str2, boolean z) {
        DeejungPlanErrorFragment deejungPlanErrorFragment = new DeejungPlanErrorFragment();
        Bundle bundle = new Bundle();
        bundle.putString("DeejungPlanErrorFragment.EXTRA_ERROR_TITLE", str);
        bundle.putString("DeejungPlanErrorFragment.EXTRA_ERROR_DESCRIPTION", str2);
        bundle.putBoolean("DeejungPlanErrorFragment.EXTRA_IS_YEARLY_RATE", z);
        deejungPlanErrorFragment.setArguments(bundle);
        return deejungPlanErrorFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86552131493882, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("DeejungPlanErrorFragment.EXTRA_ERROR_TITLE");
            String string2 = arguments.getString("DeejungPlanErrorFragment.EXTRA_ERROR_DESCRIPTION");
            boolean z = arguments.getBoolean("DeejungPlanErrorFragment.EXTRA_IS_YEARLY_RATE", false);
            this.txvPlanErrorHeader.setText(string);
            this.txvPlanErrorBody.setText(string2);
            this.btnDeejungReview.setText(z ? R.string.see_full_installment_plan : R.string.review);
        }
        return inflate;
    }
}
