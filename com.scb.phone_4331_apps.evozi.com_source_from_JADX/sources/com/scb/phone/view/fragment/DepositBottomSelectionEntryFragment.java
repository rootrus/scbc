package com.scb.phone.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.scb.phone.R;
import java.util.List;

public class DepositBottomSelectionEntryFragment extends BottomSheetDialogFragment {
    public List<String> IconCompatParcelizer;
    @BindView
    LinearLayout closeAccount;
    @BindView
    LinearLayout selectExportStatement;
    private C1115xe3ed9a7b write;

    public static DepositBottomSelectionEntryFragment write() {
        return new DepositBottomSelectionEntryFragment();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85192131493746, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        List<String> list = this.IconCompatParcelizer;
        if (list != null) {
            if (list.contains("CLOSE_ACCOUNT_SOURCE")) {
                this.closeAccount.setVisibility(0);
            }
            if (list.contains("EXPORT_STATEMENT")) {
                this.selectExportStatement.setVisibility(0);
            }
        }
        return inflate;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof C1115xe3ed9a7b) {
            this.write = (C1115xe3ed9a7b) context;
            return;
        }
        throw new IllegalStateException("This context needs to implement the OnEntrySelectionListener contract");
    }

    @OnClick
    public void exportStatement(View view) {
        this.write.MediaSessionCompat$ResultReceiverWrapper();
    }

    @OnClick
    public void closeAccount(View view) {
        this.write.MediaSessionCompat$Token();
    }
}
