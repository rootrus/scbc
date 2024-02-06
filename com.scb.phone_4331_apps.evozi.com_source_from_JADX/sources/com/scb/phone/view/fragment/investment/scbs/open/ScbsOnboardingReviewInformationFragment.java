package com.scb.phone.view.fragment.investment.scbs.open;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.investment.scbs.open.ScbsOnboardingTcActivity;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.HmlPinActivity;
import p040o.IImageProcessor;
import p040o.PageDetectionEvent;
import p040o.getCenterMessage;
import p040o.processNativeSessions;

public class ScbsOnboardingReviewInformationFragment extends BaseFragment implements IImageProcessor {
    @BindView
    ViewGroup layoutBusinessType;
    @BindView
    LinearLayout llCreditLimit;
    @BindView
    LinearLayout llSpouseId;
    @BindView
    LinearLayout llSpouseName;
    @BindView
    LinearLayout llSpousePassport;
    @HmlPinActivity
    public getCenterMessage presenter;
    @BindView
    TextView tvOnboardingReviewInformationAccount;
    @BindView
    TextView tvOnboardingReviewInformationBusiness;
    @BindView
    TextView tvOnboardingReviewInformationCurrent;
    @BindView
    TextView tvOnboardingReviewInformationDateBirth;
    @BindView
    TextView tvOnboardingReviewInformationDeducted;
    @BindView
    TextView tvOnboardingReviewInformationFund;
    @BindView
    TextView tvOnboardingReviewInformationGender;
    @BindView
    TextView tvOnboardingReviewInformationIncome;
    @BindView
    TextView tvOnboardingReviewInformationLimit;
    @BindView
    TextView tvOnboardingReviewInformationMail;
    @BindView
    TextView tvOnboardingReviewInformationMailing;
    @BindView
    TextView tvOnboardingReviewInformationMarital;
    @BindView
    TextView tvOnboardingReviewInformationMonthly;
    @BindView
    TextView tvOnboardingReviewInformationName;
    @BindView
    TextView tvOnboardingReviewInformationNationalId;
    @BindView
    TextView tvOnboardingReviewInformationNationality;
    @BindView
    TextView tvOnboardingReviewInformationObjective;
    @BindView
    TextView tvOnboardingReviewInformationOccupation;
    @BindView
    TextView tvOnboardingReviewInformationOffice;
    @BindView
    TextView tvOnboardingReviewInformationPhone;
    @BindView
    TextView tvOnboardingReviewInformationPosition;
    @BindView
    TextView tvOnboardingReviewInformationRegistration;
    @BindView
    TextView tvOnboardingReviewInformationSpouse;
    @BindView
    TextView tvOnboardingReviewInformationSpouseId;
    @BindView
    TextView tvOnboardingReviewInformationSpousePassport;
    @BindView
    TextView tvOnboardingReviewInformationWorkplace;

    public static ScbsOnboardingReviewInformationFragment MediaBrowserCompat$ItemReceiver() {
        Bundle bundle = new Bundle();
        ScbsOnboardingReviewInformationFragment scbsOnboardingReviewInformationFragment = new ScbsOnboardingReviewInformationFragment();
        scbsOnboardingReviewInformationFragment.setArguments(bundle);
        return scbsOnboardingReviewInformationFragment;
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f89662131494193, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getCenterMessage getcentermessage = this.presenter;
        getcentermessage.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver();
        getcentermessage.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getCenterMessage.IconCompatParcelizer());
        return inflate;
    }

    public final void IconCompatParcelizer(processNativeSessions processnativesessions) {
        this.tvOnboardingReviewInformationName.setText(processnativesessions.PlaybackStateCompat);
        this.tvOnboardingReviewInformationAccount.setText(processnativesessions.write);
        this.tvOnboardingReviewInformationGender.setText(processnativesessions.MediaMetadataCompat);
        this.tvOnboardingReviewInformationNationality.setText(processnativesessions.Keep);
        this.tvOnboardingReviewInformationDateBirth.setText(processnativesessions.MediaBrowserCompat$CustomActionResultReceiver);
        this.tvOnboardingReviewInformationNationalId.setText(processnativesessions.MediaBrowserCompat$SearchResultReceiver);
        this.tvOnboardingReviewInformationMail.setText(processnativesessions.f2923x50fd9e4a);
        this.tvOnboardingReviewInformationPhone.setText(processnativesessions.AlertController$RecycleListView);
        this.tvOnboardingReviewInformationOccupation.setText(processnativesessions.PlaybackStateCompat$CustomAction);
        if (TextUtils.isEmpty(processnativesessions.MediaBrowserCompat$ItemReceiver)) {
            this.layoutBusinessType.setVisibility(8);
        } else {
            this.layoutBusinessType.setVisibility(0);
            this.tvOnboardingReviewInformationBusiness.setText(processnativesessions.MediaBrowserCompat$ItemReceiver);
        }
        this.tvOnboardingReviewInformationWorkplace.setText(processnativesessions.setExpandedFormat);
        this.tvOnboardingReviewInformationOffice.setText(processnativesessions.setHasDecor);
        this.tvOnboardingReviewInformationPosition.setText(processnativesessions.AppCompatDialogFragment);
        this.tvOnboardingReviewInformationMonthly.setText(processnativesessions.AppCompatActivity);
        this.tvOnboardingReviewInformationRegistration.setText(processnativesessions.MediaBrowserCompat$MediaItem);
        this.tvOnboardingReviewInformationCurrent.setText(processnativesessions.read);
        this.tvOnboardingReviewInformationMailing.setText(processnativesessions.MediaSessionCompat$QueueItem);
        this.tvOnboardingReviewInformationMarital.setText(processnativesessions.ParcelableVolumeInfo);
        if (processnativesessions.MediaSessionCompat$ResultReceiverWrapper) {
            this.llSpouseName.setVisibility(8);
            this.llSpouseId.setVisibility(8);
            this.llSpousePassport.setVisibility(8);
        } else {
            if ("THAI".equalsIgnoreCase(processnativesessions.AppCompatViewInflater)) {
                this.tvOnboardingReviewInformationSpouseId.setText(processnativesessions.AppCompatDelegateImpl$ListMenuDecorView);
                this.llSpousePassport.setVisibility(8);
            } else {
                this.tvOnboardingReviewInformationSpousePassport.setText(processnativesessions.AppCompatDelegateImpl$ListMenuDecorView);
                this.llSpouseId.setVisibility(8);
            }
            this.tvOnboardingReviewInformationSpouse.setText(processnativesessions.setCheckable);
        }
        this.tvOnboardingReviewInformationIncome.setText(processnativesessions.MediaDescriptionCompat);
        this.tvOnboardingReviewInformationFund.setText(processnativesessions.RatingCompat);
        this.tvOnboardingReviewInformationObjective.setText(processnativesessions.setBackgroundResource);
        if (processnativesessions.setContentView) {
            this.llCreditLimit.setVisibility(0);
            this.tvOnboardingReviewInformationLimit.setText(processnativesessions.MediaSessionCompat$Token);
        } else {
            this.llCreditLimit.setVisibility(8);
        }
        this.tvOnboardingReviewInformationDeducted.setText(processnativesessions.IconCompatParcelizer);
    }

    @OnClick
    public void clickButton() {
        getCenterMessage getcentermessage = this.presenter;
        PageDetectionEvent.C3726a aVar = PageDetectionEvent.C3726a.IconCompatParcelizer;
        if (getcentermessage.RatingCompat != null) {
            aVar.IconCompatParcelizer(getcentermessage.RatingCompat);
        }
    }

    public final void write() {
        ScbsOnboardingTcActivity.read(getContext());
    }
}
