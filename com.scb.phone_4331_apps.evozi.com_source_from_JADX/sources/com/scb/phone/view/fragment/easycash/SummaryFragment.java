package com.scb.phone.view.fragment.easycash;

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
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashCreditPowerInputActivity;
import com.scb.phone.view.activity.easycash.EasycashLandingActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.custom.easycash.CustomEasyCashSectionLabel;
import com.scb.phone.view.custom.easycash.CustomSeparatedViews;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.easycash.EasycashSuccessDialogFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.AnalyticsReceiver;
import p040o.C6394xa3a265ac;
import p040o.ForcedGpuDocumentDetector_Factory;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.ImageClassificationCompletedListener;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZTBSV;
import p040o.dropBreadcrumb;
import p040o.forEachClear;
import p040o.getCornerY;
import p040o.performAutoConfigure;
import p040o.serializeEvent;
import p040o.setTapText;

public class SummaryFragment extends BaseFragment implements C6394xa3a265ac, EasycashSuccessDialogFragment.read {
    private forEachClear IconCompatParcelizer;
    @BindView
    CustomSeparatedViews contentOne;
    @BindView
    CustomSeparatedViews contentThree;
    @BindView
    CustomSeparatedViews contentTwo;
    @BindView
    TextView disclaimerDescription;
    @BindView
    CustomEasyCashSectionLabel disclaimerHeader;
    @BindView
    CustomEasyCashSectionLabel labelOne;
    @BindView
    CustomEasyCashSectionLabel labelThree;
    @BindView
    CustomEasyCashSectionLabel labelTwo;
    @HmlPinActivity
    public ImageClassificationCompletedListener presenter;

    public final IOrientationGuidanceCalculator MediaBrowserCompat$ItemReceiver() {
        return null;
    }

    public final void MediaBrowserCompat$ItemReceiver(AnalyticsReceiver analyticsReceiver, performAutoConfigure performautoconfigure) {
    }

    public static SummaryFragment IconCompatParcelizer(AnalyticsReceiver analyticsReceiver, forEachClear foreachclear) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_DISPLAY", analyticsReceiver);
        bundle.putParcelable("FIREBASE_TRACKER_DATA", foreachclear);
        SummaryFragment summaryFragment = new SummaryFragment();
        summaryFragment.setArguments(bundle);
        return summaryFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87132131493940, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        if (!(getArguments() == null || getArguments().getParcelable("com.scb.phone.EXTRA_DISPLAY") == null)) {
            this.presenter.write((AnalyticsReceiver) getArguments().getParcelable("com.scb.phone.EXTRA_DISPLAY"));
            forEachClear foreachclear = (forEachClear) ((getArguments() == null || getArguments().getParcelable("FIREBASE_TRACKER_DATA") == null) ? null : (ZTBSV) getArguments().getParcelable("FIREBASE_TRACKER_DATA"));
            this.IconCompatParcelizer = foreachclear;
            if (!(foreachclear == null || getActivity() == null)) {
                foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_preapproved_summary");
            }
        }
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(dropBreadcrumb dropbreadcrumb, int i) {
        if (i == 1) {
            CustomEasyCashSectionLabel customEasyCashSectionLabel = this.labelOne;
            CustomSeparatedViews customSeparatedViews = this.contentOne;
            customEasyCashSectionLabel.setVisibility(0);
            customEasyCashSectionLabel.setText(dropbreadcrumb.read);
            customSeparatedViews.IconCompatParcelizer(dropbreadcrumb.MediaBrowserCompat$ItemReceiver, R.layout.f84732131493700);
        } else if (i == 2) {
            CustomEasyCashSectionLabel customEasyCashSectionLabel2 = this.labelTwo;
            CustomSeparatedViews customSeparatedViews2 = this.contentTwo;
            customEasyCashSectionLabel2.setVisibility(0);
            customEasyCashSectionLabel2.setText(dropbreadcrumb.read);
            customSeparatedViews2.IconCompatParcelizer(dropbreadcrumb.MediaBrowserCompat$ItemReceiver, R.layout.f84732131493700);
        } else if (i == 3) {
            CustomEasyCashSectionLabel customEasyCashSectionLabel3 = this.labelThree;
            CustomSeparatedViews customSeparatedViews3 = this.contentThree;
            customEasyCashSectionLabel3.setVisibility(0);
            customEasyCashSectionLabel3.setText(dropbreadcrumb.read);
            customSeparatedViews3.IconCompatParcelizer(dropbreadcrumb.MediaBrowserCompat$ItemReceiver, R.layout.f84732131493700);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        this.disclaimerHeader.setVisibility(0);
        this.disclaimerHeader.setText(str);
        this.disclaimerDescription.setVisibility(0);
        this.disclaimerDescription.setText(str2);
    }

    public final void read(serializeEvent serializeevent) {
        EasycashSuccessDialogFragment write = EasycashSuccessDialogFragment.write(serializeevent);
        forEachClear foreachclear = this.IconCompatParcelizer;
        if (getActivity() != null) {
            foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_preapproved_confirmation");
        }
        write.show(getChildFragmentManager().read(), "dialog");
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo14259x50fd9e4a() {
        ImageClassificationCompletedListener imageClassificationCompletedListener = this.presenter;
        ForcedGpuDocumentDetector_Factory forcedGpuDocumentDetector_Factory = ForcedGpuDocumentDetector_Factory.MediaBrowserCompat$ItemReceiver;
        if (imageClassificationCompletedListener.RatingCompat != null) {
            forcedGpuDocumentDetector_Factory.IconCompatParcelizer(imageClassificationCompletedListener.RatingCompat);
        }
    }

    public final void MediaSessionCompat$QueueItem() {
        ImageClassificationCompletedListener imageClassificationCompletedListener = this.presenter;
        getCornerY getcornery = getCornerY.read;
        if (imageClassificationCompletedListener.RatingCompat != null) {
            getcornery.IconCompatParcelizer(imageClassificationCompletedListener.RatingCompat);
        }
    }

    public final void IconCompatParcelizer() {
        EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext());
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Intent write = EasycashCreditPowerInputActivity.write(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write = setTapText.write(activity, write).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(write);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        this.presenter.onDestroy();
    }

    @OnClick
    public void onConfirmButtonClicked() {
        Intent intent = new Intent(getContext(), PinLoginActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(intent, 7134);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
