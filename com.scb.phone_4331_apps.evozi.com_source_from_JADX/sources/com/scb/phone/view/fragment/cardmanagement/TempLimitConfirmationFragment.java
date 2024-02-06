package com.scb.phone.view.fragment.cardmanagement;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.CheckCaptureActivity;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.FirebaseApp;
import p040o.HmlPinActivity;
import p040o.getHeadEulerAngleY;

public class TempLimitConfirmationFragment extends BaseFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    @HmlPinActivity
    public getHeadEulerAngleY presenter;
    @BindView
    TextView txvAdditionalCreditAmount;
    @BindView
    TextView txvCardNumber;
    @BindView
    TextView txvCardType;
    @BindView
    TextView txvDateTime;
    @BindView
    TextView txvEffectiveDate;
    @BindView
    TextView txvEndDate;
    @BindView
    TextView txvReferenceId;
    @BindView
    TextView txvTotalCreditAmount;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90072131494234, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        FirebaseApp.UserUnlockReceiver userUnlockReceiver = (FirebaseApp.UserUnlockReceiver) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.TempLimitConfirmationActivity.KEY_TEMP_LIMIT_CONFIRMATION_DISPLAY_MODEL");
        this.txvDateTime.setText(userUnlockReceiver.MediaBrowserCompat$MediaItem);
        this.txvReferenceId.setText(userUnlockReceiver.MediaMetadataCompat);
        this.txvCardType.setText(userUnlockReceiver.RatingCompat);
        this.txvCardNumber.setText(userUnlockReceiver.read);
        this.txvAdditionalCreditAmount.setText(getHeadEulerAngleY.write(userUnlockReceiver.write));
        this.txvTotalCreditAmount.setText(getHeadEulerAngleY.write(userUnlockReceiver.MediaBrowserCompat$SearchResultReceiver));
        this.txvEffectiveDate.setText(CheckCaptureActivity.read(getResources(), "dd MMM yyyy", CheckCaptureActivity.write("yyyy-MM-dd", userUnlockReceiver.MediaBrowserCompat$CustomActionResultReceiver)));
        this.txvEndDate.setText(CheckCaptureActivity.read(getResources(), "dd MMM yyyy", CheckCaptureActivity.write("yyyy-MM-dd", userUnlockReceiver.MediaBrowserCompat$ItemReceiver)));
        return inflate;
    }

    @OnClick
    public void onReturnToMyAccountsClick() {
        ActionBarContainer();
    }
}
