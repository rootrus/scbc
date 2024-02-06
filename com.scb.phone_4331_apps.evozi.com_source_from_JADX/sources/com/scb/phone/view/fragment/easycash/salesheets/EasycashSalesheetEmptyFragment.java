package com.scb.phone.view.fragment.easycash.salesheets;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.CrashlyticsController;

public class EasycashSalesheetEmptyFragment extends BaseFragment {
    @BindView
    TextView errorDescription;
    @BindView
    TextView errorText;

    public static EasycashSalesheetEmptyFragment read(CrashlyticsController crashlyticsController) {
        EasycashSalesheetEmptyFragment easycashSalesheetEmptyFragment = new EasycashSalesheetEmptyFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.SALESHEET_EMPTY_DISPLAY", crashlyticsController);
        easycashSalesheetEmptyFragment.setArguments(bundle);
        return easycashSalesheetEmptyFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87102131493937, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        if (!(getArguments() == null || getArguments().getParcelable("com.scb.phone.SALESHEET_EMPTY_DISPLAY") == null)) {
            CrashlyticsController crashlyticsController = (CrashlyticsController) getArguments().getParcelable("com.scb.phone.SALESHEET_EMPTY_DISPLAY");
            this.errorText.setText(crashlyticsController.MediaBrowserCompat$ItemReceiver);
            this.errorDescription.setText(crashlyticsController.MediaBrowserCompat$CustomActionResultReceiver);
        }
        return inflate;
    }
}
