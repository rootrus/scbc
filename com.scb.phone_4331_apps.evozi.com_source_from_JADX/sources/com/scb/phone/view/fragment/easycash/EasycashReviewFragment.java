package com.scb.phone.view.fragment.easycash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.EasycashCreditPowerInputActivity;
import com.scb.phone.view.activity.easycash.EasycashSuccessActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.Locale;
import p040o.AnalyticsReceiver;
import p040o.C6394xa3a265ac;
import p040o.C9764x43753c2b;
import p040o.ForcedGpuDocumentDetector_Factory;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.ImageClassificationCompletedListener;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.forEachClear;
import p040o.performAutoConfigure;
import p040o.setTapText;

public class EasycashReviewFragment extends EasycashBaseReviewFragment implements C6394xa3a265ac {
    private boolean IconCompatParcelizer;
    private IOrientationGuidanceCalculator MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public ImageClassificationCompletedListener presenter;
    @HmlPinActivity
    public forEachClear tracker;

    public static EasycashReviewFragment IconCompatParcelizer(AnalyticsReceiver analyticsReceiver) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_DISPLAY", analyticsReceiver);
        EasycashReviewFragment easycashReviewFragment = new EasycashReviewFragment();
        easycashReviewFragment.setArguments(bundle);
        return easycashReviewFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87092131493936, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        if (!(getArguments() == null || getArguments().getParcelable("com.scb.phone.EXTRA_DISPLAY") == null)) {
            this.presenter.write((AnalyticsReceiver) getArguments().getParcelable("com.scb.phone.EXTRA_DISPLAY"));
        }
        this.btnSubmit.setText(getString(R.string.easycash_review_submit_button));
        return inflate;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (IOrientationGuidanceCalculator) context;
        }
    }

    @OnClick
    public void onConfirmButtonClicked() {
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator;
        if (!this.IconCompatParcelizer && (iOrientationGuidanceCalculator = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            boolean z = true;
            this.IconCompatParcelizer = true;
            this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", iOrientationGuidanceCalculator.write()));
            String MediaMetadataCompat = this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat();
            char c = 65535;
            int hashCode = MediaMetadataCompat.hashCode();
            if (hashCode != 2223327) {
                if (hashCode == 2090361232 && MediaMetadataCompat.equals("PURPOSEFUL_LOAN")) {
                    c = 0;
                }
            } else if (MediaMetadataCompat.equals("HOME")) {
                c = 1;
            }
            if (c == 0) {
                this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("product_program", this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver().AlertController$RecycleListView));
            } else if (c == 1) {
                this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("product_program", this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver().AlertController$RecycleListView));
                this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("tenor", String.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver().MediaBrowserCompat$CustomActionResultReceiver)));
                this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("amount", String.format(Locale.getDefault(), "%.2f", new Object[]{Double.valueOf(this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver().read)})));
            }
            forEachClear foreachclear = this.tracker;
            if (getActivity() != null) {
                foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_review");
            }
            ImageClassificationCompletedListener imageClassificationCompletedListener = this.presenter;
            String MediaMetadataCompat2 = this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat();
            String write = this.MediaBrowserCompat$CustomActionResultReceiver.write();
            if (MediaMetadataCompat2.equals("HOME")) {
                if (imageClassificationCompletedListener.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    imageClassificationCompletedListener.RatingCompat.AlertController$RecycleListView();
                }
                imageClassificationCompletedListener.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(imageClassificationCompletedListener.MediaBrowserCompat$ItemReceiver());
                imageClassificationCompletedListener.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C9764x43753c2b(imageClassificationCompletedListener, (byte) 0));
            } else if (MediaMetadataCompat2.equals("PURPOSEFUL") && write.equals("REFERRAL")) {
                if (imageClassificationCompletedListener.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    imageClassificationCompletedListener.RatingCompat.AlertController$RecycleListView();
                }
                imageClassificationCompletedListener.MediaBrowserCompat$ItemReceiver.read(imageClassificationCompletedListener.MediaBrowserCompat$ItemReceiver());
                imageClassificationCompletedListener.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C9764x43753c2b(imageClassificationCompletedListener, (byte) 0));
            }
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(AnalyticsReceiver analyticsReceiver, performAutoConfigure performautoconfigure) {
        EasycashSuccessActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), analyticsReceiver.MediaDescriptionCompat, this.MediaBrowserCompat$CustomActionResultReceiver.MediaMetadataCompat(), this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$SearchResultReceiver(), performautoconfigure.MediaBrowserCompat$ItemReceiver, performautoconfigure.IconCompatParcelizer, performautoconfigure.MediaBrowserCompat$CustomActionResultReceiver, performautoconfigure.write, analyticsReceiver.MediaBrowserCompat$ItemReceiver);
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo14259x50fd9e4a() {
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (iOrientationGuidanceCalculator != null) {
            this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", iOrientationGuidanceCalculator.write()));
            forEachClear foreachclear = this.tracker;
            if (getActivity() != null) {
                foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_result");
            }
        }
        ImageClassificationCompletedListener imageClassificationCompletedListener = this.presenter;
        ForcedGpuDocumentDetector_Factory forcedGpuDocumentDetector_Factory = ForcedGpuDocumentDetector_Factory.MediaBrowserCompat$ItemReceiver;
        if (imageClassificationCompletedListener.RatingCompat != null) {
            forcedGpuDocumentDetector_Factory.IconCompatParcelizer(imageClassificationCompletedListener.RatingCompat);
        }
    }

    public final IOrientationGuidanceCalculator MediaBrowserCompat$ItemReceiver() {
        return this.MediaBrowserCompat$CustomActionResultReceiver;
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

    public void onDestroyView() {
        this.tracker = null;
        this.presenter.onDestroy();
        super.onDestroyView();
    }

    public void onResume() {
        super.onResume();
        this.IconCompatParcelizer = false;
    }
}
