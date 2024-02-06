package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.getProjectId;

public class DeejungTransferConfirmationHeaderFragment extends BaseFragment {
    @BindView
    TextView txvDateTime;
    @BindView
    TextView txvReferenceId;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90202131494247, viewGroup, false);
        getContext();
        read((getProjectId) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungTransferConfirmationHeaderFragment.KEY_TRANSFER_CONFIRMATION_HEADER_DISPLAY_MODEL"), inflate);
        return inflate;
    }

    public final void read(getProjectId getprojectid, View view) {
        ButterKnife.IconCompatParcelizer(this, view);
        this.txvDateTime.setText(getprojectid.IconCompatParcelizer);
        this.txvReferenceId.setText(getprojectid.write);
    }
}
