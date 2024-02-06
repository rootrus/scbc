package com.scb.phone.view.fragment.cardmanagement;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.cardmanagement.TempLimitConfirmationActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.CheckCaptureActivity;
import p040o.ConcurrentHashMultiset;
import p040o.ConventionBasedJsonIdDeserializer;
import p040o.FirebaseApp;
import p040o.FirebaseNetworkException;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getSmilingProbability;
import p040o.getVisionFaceDetector;
import p040o.setTapText;

public class TempLimitReviewFragment extends BaseFragment implements ConventionBasedJsonIdDeserializer {
    private FirebaseNetworkException MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public getSmilingProbability presenter;
    @BindView
    TextView txvAdditionalCreditAmount;
    @BindView
    TextView txvCardNumber;
    @BindView
    TextView txvCardType;
    @BindView
    TextView txvEffectiveDate;
    @BindView
    TextView txvEndDate;
    @BindView
    TextView txvTotalCreditAmount;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f90092131494236, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        FirebaseNetworkException firebaseNetworkException = (FirebaseNetworkException) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.TempLimitReviewActivity.KEY_TEMP_LIMIT_PRE_APPROVED_DTO");
        this.MediaBrowserCompat$CustomActionResultReceiver = firebaseNetworkException;
        this.txvCardType.setText(firebaseNetworkException.MediaMetadataCompat);
        this.txvCardNumber.setText(firebaseNetworkException.RatingCompat);
        this.txvAdditionalCreditAmount.setText(getSmilingProbability.read(firebaseNetworkException.MediaBrowserCompat$CustomActionResultReceiver));
        this.txvTotalCreditAmount.setText(getSmilingProbability.read(firebaseNetworkException.MediaBrowserCompat$SearchResultReceiver));
        this.txvEffectiveDate.setText(CheckCaptureActivity.read(getResources(), "dd MMM yyyy", CheckCaptureActivity.write("yyyy-MM-dd", firebaseNetworkException.write)));
        this.txvEndDate.setText(CheckCaptureActivity.read(getResources(), "dd MMM yyyy", CheckCaptureActivity.write("yyyy-MM-dd", firebaseNetworkException.IconCompatParcelizer)));
        return inflate;
    }

    @OnClick
    public void onConfirmButtonClick() {
        getSmilingProbability getsmilingprobability = this.presenter;
        FirebaseNetworkException firebaseNetworkException = this.MediaBrowserCompat$CustomActionResultReceiver;
        getVisionFaceDetector getvisionfacedetector = getVisionFaceDetector.write;
        if (getsmilingprobability.RatingCompat != null) {
            getvisionfacedetector.IconCompatParcelizer(getsmilingprobability.RatingCompat);
        }
        getsmilingprobability.read.IconCompatParcelizer(firebaseNetworkException.MediaBrowserCompat$ItemReceiver, new ConcurrentHashMultiset.FieldSettersHolder(firebaseNetworkException.MediaDescriptionCompat, firebaseNetworkException.MediaBrowserCompat$CustomActionResultReceiver.doubleValue(), firebaseNetworkException.IconCompatParcelizer, firebaseNetworkException.MediaBrowserCompat$MediaItem));
        getsmilingprobability.read.IconCompatParcelizer(new getSmilingProbability.read(getsmilingprobability, (byte) 0));
    }

    public final void IconCompatParcelizer(FirebaseApp.UserUnlockReceiver userUnlockReceiver) {
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = TempLimitConfirmationActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), userUnlockReceiver);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$CustomActionResultReceiver2, 103);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer() {
        getActivity().setResult(3);
    }

    public final FirebaseNetworkException MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (103 == i && i2 == 104) {
            getActivity().setResult(104);
            getActivity().finish();
        }
    }
}
