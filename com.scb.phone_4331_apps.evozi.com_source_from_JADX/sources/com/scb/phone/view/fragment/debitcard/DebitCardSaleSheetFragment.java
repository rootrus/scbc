package com.scb.phone.view.fragment.debitcard;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.AlertController$RecycleListView;
import p040o.getTermsConditionsReferral;
import p040o.postLoanDetail;
import p040o.verifyReferral;

public class DebitCardSaleSheetFragment extends BaseFragment implements verifyReferral.write {
    @BindView
    FrameLayout pdfView;

    public static DebitCardSaleSheetFragment IconCompatParcelizer(String str) {
        Bundle bundle = new Bundle();
        bundle.putString("PDF_PATH", str);
        DebitCardSaleSheetFragment debitCardSaleSheetFragment = new DebitCardSaleSheetFragment();
        debitCardSaleSheetFragment.setArguments(bundle);
        return debitCardSaleSheetFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86482131493875, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        AlertController$RecycleListView.IconCompatParcelizer(getContext(), this, new getTermsConditionsReferral(this), new postLoanDetail(this), this.pdfView, getArguments() != null ? getArguments().getString("PDF_PATH") : "");
        return inflate;
    }
}
