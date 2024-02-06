package com.scb.phone.view.fragment.cardmanagement;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.cardmanagement.TempLimitReviewActivity;
import com.scb.phone.view.activity.scheduledtransaction.CalendarDialogActivity;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Calendar;
import org.threeten.p041bp.OffsetDateTime;
import p040o.CheckCaptureActivity;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.HmlPinActivity;
import p040o.LanguageSettingAdapter$LanguageSettingHolder_ViewBinding;
import p040o.Maps;
import p040o.MyECouponActivity_ViewBinding;
import p040o.QuickAccountSelectAdapter$FooterHolder;
import p040o.chain;
import p040o.ensureBackgroundStateListenerRegistered;
import p040o.getTrackingId;
import p040o.sendOta;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;

public class TempLimitPreApprovedBottomFragment extends BaseFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    private AdapterView.OnItemSelectedListener IconCompatParcelizer = new AdapterView.OnItemSelectedListener() {
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            TempLimitPreApprovedBottomFragment.MediaBrowserCompat$CustomActionResultReceiver(TempLimitPreApprovedBottomFragment.this, adapterView, i);
            if (i != 0) {
                String unused = TempLimitPreApprovedBottomFragment.this.MediaBrowserCompat$CustomActionResultReceiver = adapterView.getSelectedItem().toString();
                TempLimitPreApprovedBottomFragment.this.btnReview.setButtonEnabled(getTrackingId.MediaBrowserCompat$CustomActionResultReceiver(TempLimitPreApprovedBottomFragment.this.MediaBrowserCompat$CustomActionResultReceiver, TempLimitPreApprovedBottomFragment.this.MediaBrowserCompat$SearchResultReceiver, TempLimitPreApprovedBottomFragment.this.MediaDescriptionCompat));
                TempLimitPreApprovedBottomFragment.this.MediaMetadataCompat.setBackground(setLastBaselineToBottomHeight.write(TempLimitPreApprovedBottomFragment.this.getActivity(), R.drawable.bg_button_transparent));
            }
        }
    };
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$CustomActionResultReceiver;
    private AdapterView.OnItemSelectedListener MediaBrowserCompat$MediaItem = new AdapterView.OnItemSelectedListener() {
        public final void onNothingSelected(AdapterView<?> adapterView) {
        }

        public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
            TempLimitPreApprovedBottomFragment.MediaBrowserCompat$CustomActionResultReceiver(TempLimitPreApprovedBottomFragment.this, adapterView, i);
            if (i != 0) {
                String unused = TempLimitPreApprovedBottomFragment.this.MediaDescriptionCompat = adapterView.getSelectedItem().toString();
                TempLimitPreApprovedBottomFragment.this.btnReview.setButtonEnabled(getTrackingId.MediaBrowserCompat$CustomActionResultReceiver(TempLimitPreApprovedBottomFragment.this.MediaBrowserCompat$CustomActionResultReceiver, TempLimitPreApprovedBottomFragment.this.MediaBrowserCompat$SearchResultReceiver, TempLimitPreApprovedBottomFragment.this.MediaDescriptionCompat));
                TempLimitPreApprovedBottomFragment.this.RatingCompat.setBackground(setLastBaselineToBottomHeight.write(TempLimitPreApprovedBottomFragment.this.getActivity(), R.drawable.bg_button_transparent));
            }
        }
    };
    /* access modifiers changed from: private */
    public OffsetDateTime MediaBrowserCompat$SearchResultReceiver = null;
    /* access modifiers changed from: private */
    public String MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public Spinner MediaMetadataCompat;
    private ensureBackgroundStateListenerRegistered MediaSessionCompat$ResultReceiverWrapper;
    /* access modifiers changed from: private */
    public Spinner RatingCompat;
    @BindView
    DefaultButton btnReview;
    @HmlPinActivity
    public getTrackingId presenter;
    @HmlPinActivity
    public Maps.C36423 tempLimitPreApprovedDtoMapper;
    @BindView
    TextView txvEndDate;
    @BindView
    ViewGroup vgAdditionalAmount;
    @BindView
    ViewGroup vgReason;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f91982131494425, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        ensureBackgroundStateListenerRegistered ensurebackgroundstatelistenerregistered = (ensureBackgroundStateListenerRegistered) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.TempLimitHomeActivity.KEY_TEMP_LIMIT_CRITERIA");
        this.MediaSessionCompat$ResultReceiverWrapper = ensurebackgroundstatelistenerregistered;
        this.MediaMetadataCompat = (Spinner) this.vgAdditionalAmount.findViewById(R.id.spinner);
        this.MediaMetadataCompat.setAdapter(new sendOta((Context) getActivity(), ensurebackgroundstatelistenerregistered.IconCompatParcelizer));
        this.MediaMetadataCompat.setOnItemSelectedListener(this.IconCompatParcelizer);
        this.RatingCompat = (Spinner) this.vgReason.findViewById(R.id.spinner);
        this.RatingCompat.setAdapter(new sendOta((Context) getActivity(), ensurebackgroundstatelistenerregistered.MediaDescriptionCompat));
        this.RatingCompat.setOnItemSelectedListener(this.MediaBrowserCompat$MediaItem);
        this.btnReview.setButtonEnabled(false);
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).mo13676d_("templimit_preapproved_landing");
        }
        return inflate;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 2 && i2 == -1) {
            OffsetDateTime offsetDateTime = (OffsetDateTime) intent.getSerializableExtra("com.scb.phone.EXTRA_DATE");
            this.MediaBrowserCompat$SearchResultReceiver = offsetDateTime;
            this.txvEndDate.setText(CheckCaptureActivity.read(getResources(), "dd MMM yyyy", offsetDateTime));
            this.btnReview.setButtonEnabled(getTrackingId.MediaBrowserCompat$CustomActionResultReceiver(this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$SearchResultReceiver, this.MediaDescriptionCompat));
            this.txvEndDate.setBackground(setLastBaselineToBottomHeight.write(getActivity(), R.drawable.bg_button_transparent));
        } else if (i == 102 && i2 == 3) {
            this.MediaMetadataCompat.setSelection(0);
            this.txvEndDate.setText("");
            this.MediaBrowserCompat$SearchResultReceiver = null;
            this.RatingCompat.setSelection(0);
            this.btnReview.setButtonEnabled(false);
        } else if (102 == i && i2 == 104) {
            getActivity().setResult(104);
            getActivity().finish();
        }
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onEndDateClick() {
        OffsetDateTime write = CheckCaptureActivity.write("yyyy-MM-dd", this.MediaSessionCompat$ResultReceiverWrapper.RatingCompat);
        OffsetDateTime write2 = CheckCaptureActivity.write("yyyy-MM-dd", this.MediaSessionCompat$ResultReceiverWrapper.write);
        Intent write3 = CalendarDialogActivity.write(getContext(), OffsetDateTime.ofInstant(QuickAccountSelectAdapter$FooterHolder.toInstant(Calendar.getInstance()), LanguageSettingAdapter$LanguageSettingHolder_ViewBinding.m3070of("Asia/Bangkok")), this.MediaBrowserCompat$SearchResultReceiver, write, write2);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write3 = setTapText.write(activity, write3).read();
            }
            MyECouponActivity_ViewBinding.write write4 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(write3.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write4, sb.toString());
            startActivityForResult(write3, 2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public void navigateToReviewPage() {
        Intent read = TempLimitReviewActivity.read(getContext(), Maps.C36423.MediaBrowserCompat$CustomActionResultReceiver((chain) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.TempLimitHomeActivity.KEY_CREDIT_CARD_DISPLAY"), this.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$SearchResultReceiver, CheckCaptureActivity.write("yyyy-MM-dd", this.MediaSessionCompat$ResultReceiverWrapper.RatingCompat), this.MediaDescriptionCompat, this.MediaSessionCompat$ResultReceiverWrapper.read));
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 102);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(TempLimitPreApprovedBottomFragment tempLimitPreApprovedBottomFragment, AdapterView adapterView, int i) {
        FragmentActivity activity = tempLimitPreApprovedBottomFragment.getActivity();
        if (i == 0 && activity != null) {
            View childAt = adapterView.getChildAt(0);
            if (childAt instanceof TextView) {
                ((TextView) childAt).setTextColor(setLastBaselineToBottomHeight.read(activity, R.color.f66402131099796));
            }
        }
    }
}
