package com.scb.phone.view.fragment.deposit.exportstatement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.deposit.exportstatement.ExportStatementSuccessfulActivity;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.C1156x42fa5590;
import p040o.CrashlyticsNativeComponent;
import p040o.HmlPinActivity;
import p040o.ScriptIntrinsicBLAS;
import p040o.adornReferenceFeature;
import p040o.getICheckDeserializerRtti;
import p040o.nativeToFile;

public class ExportStatementSuccessfulFragment extends BaseFragment implements C1156x42fa5590 {
    private ScriptIntrinsicBLAS.Transpose MediaBrowserCompat$CustomActionResultReceiver = new ScriptIntrinsicBLAS.Transpose();
    @BindView
    CustomTransferAndPaySource customAccount;
    @BindView
    CustomTransferAndPayItem customDateRange;
    @BindView
    CustomTransferAndPayItem customSentTo;
    @HmlPinActivity
    public adornReferenceFeature exportStatementSuccessfulPresenter;
    @BindView
    TextView textDescription;

    public static ExportStatementSuccessfulFragment IconCompatParcelizer(CrashlyticsNativeComponent crashlyticsNativeComponent) {
        ExportStatementSuccessfulFragment exportStatementSuccessfulFragment = new ExportStatementSuccessfulFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_DEPOSIT_EXPORT_STATEMENT_DISPLAY", crashlyticsNativeComponent);
        exportStatementSuccessfulFragment.setArguments(bundle);
        return exportStatementSuccessfulFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87362131493963, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.exportStatementSuccessfulPresenter.MediaBrowserCompat$ItemReceiver(this);
        adornReferenceFeature adornreferencefeature = this.exportStatementSuccessfulPresenter;
        nativeToFile nativetofile = new nativeToFile((CrashlyticsNativeComponent) getArguments().getParcelable("com.scb.phone.EXTRA_DEPOSIT_EXPORT_STATEMENT_DISPLAY"));
        if (adornreferencefeature.RatingCompat != null) {
            z = true;
        }
        if (z) {
            nativetofile.IconCompatParcelizer(adornreferencefeature.RatingCompat);
        }
        ScriptIntrinsicBLAS.Transpose transpose = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (getActivity() != null) {
            transpose.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "export_stmt_success");
        }
        return inflate;
    }

    public void onDestroy() {
        adornReferenceFeature adornreferencefeature = this.exportStatementSuccessfulPresenter;
        if (adornreferencefeature != null) {
            adornreferencefeature.onDestroy();
        }
        super.onDestroy();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsNativeComponent crashlyticsNativeComponent) {
        if (crashlyticsNativeComponent != null) {
            this.customAccount.setText(getString(R.string.export_statement_successful_account));
            this.customAccount.setAvatar(getICheckDeserializerRtti.write(getContext(), (int) R.drawable.bankicon_scb).toString());
            this.customAccount.setSourceName(crashlyticsNativeComponent.MediaBrowserCompat$ItemReceiver);
            this.customAccount.setAccountNumber(crashlyticsNativeComponent.MediaBrowserCompat$CustomActionResultReceiver);
            this.customDateRange.setValue(crashlyticsNativeComponent.write);
            this.customSentTo.setValue(crashlyticsNativeComponent.IconCompatParcelizer);
            if (crashlyticsNativeComponent.read) {
                this.textDescription.setText(R.string.export_statement_successful_description_with_note);
            } else {
                this.textDescription.setText(R.string.export_statement_successful_description);
            }
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onReturnHomeClick() {
        if (getActivity() != null && (getActivity() instanceof ExportStatementSuccessfulActivity)) {
            setTabContainer();
        }
    }
}
