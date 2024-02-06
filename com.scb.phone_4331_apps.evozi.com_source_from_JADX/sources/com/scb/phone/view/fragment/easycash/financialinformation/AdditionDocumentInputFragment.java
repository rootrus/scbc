package com.scb.phone.view.fragment.easycash.financialinformation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlConsentActivity;
import com.scb.phone.view.adapter.easycash.AdditionDocumentAdapter;
import com.scb.phone.view.adapter.easycash.C5743x44174185;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.easycash.EasycashContactInformationFragment;
import com.scb.phone.view.fragment.easycash.issuer.EasycashIssuerLandingFragment;
import com.scb.phone.view.fragment.etb.BreadcrumbFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.C6390x3b6ff3c3;
import p040o.HmlPinActivity;
import p040o.IOrientationGuidanceCalculator;
import p040o.ImageProcessor;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.addAnalysisCompleteEventListener;
import p040o.analysisProgress;
import p040o.closeOrLog;
import p040o.forEachClear;
import p040o.getPrePaidCardSummary;
import p040o.getPrepaidTravelConversionVerification;
import p040o.getProgressPct;
import p040o.setAutoFocusEnabled;
import p040o.setProcessedImageJpegQuality;
import p040o.setTapText;
import p040o.zzfe;

public class AdditionDocumentInputFragment extends BreadcrumbFragment implements C6390x3b6ff3c3, C5743x44174185, C5925xb5b84be0 {
    public IOrientationGuidanceCalculator IconCompatParcelizer;
    private setAutoFocusEnabled.IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private AdditionDocumentTakePhotoFragment RatingCompat;
    @HmlPinActivity
    public ImageProcessor.ImageOutListener additionDocumentInputPresenter;
    @BindView
    LinearLayout layoutPhotoAttached;
    @BindView
    TextView requiredDocText;
    @BindView
    TextView requiredDocTitle;
    @BindView
    RecyclerView rvDocument;
    @HmlPinActivity
    public forEachClear tracker;
    @BindView
    TextView tvPhotoAttached;

    public final int ParcelableVolumeInfo() {
        return 1;
    }

    public final boolean setHasDecor() {
        return true;
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.occupation_info_title);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f86912131493918, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.additionDocumentInputPresenter.MediaBrowserCompat$ItemReceiver(this);
        if (getActivity() != null) {
            this.MediaBrowserCompat$CustomActionResultReceiver = getArguments() != null ? (setAutoFocusEnabled.IconCompatParcelizer) getArguments().getSerializable("com.scb.phone.FLOW_TYPE") : setAutoFocusEnabled.IconCompatParcelizer.DEFAULT;
            AdditionDocumentTakePhotoFragment additionDocumentTakePhotoFragment = (AdditionDocumentTakePhotoFragment) getChildFragmentManager().findFragmentById(R.id.fragment_take_photo);
            this.RatingCompat = additionDocumentTakePhotoFragment;
            additionDocumentTakePhotoFragment.IconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
            this.additionDocumentInputPresenter.read(this.IconCompatParcelizer.read(), this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(), this.MediaBrowserCompat$CustomActionResultReceiver);
        }
        getContext();
        this.rvDocument.setLayoutManager(new LinearLayoutManager(1, false));
        this.rvDocument.setNestedScrollingEnabled(false);
        this.rvDocument.setAdapter(new AdditionDocumentAdapter(new ArrayList(), this));
        return inflate;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.requiredDocTitle.setText(i);
    }

    public void write() {
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = HmlConsentActivity.MediaBrowserCompat$CustomActionResultReceiver(requireContext(), zzfe.zza.NCB_CONSENT);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaDescriptionCompat() {
        this.requiredDocText.setText(this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver() == null ? "" : this.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver().setHasDecor);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.requiredDocText.setText(i);
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.additionDocumentInputPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.read(), this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver());
    }

    public final void write(List<closeOrLog> list) {
        AdditionDocumentAdapter additionDocumentAdapter = (AdditionDocumentAdapter) this.rvDocument.MediaDescriptionCompat;
        additionDocumentAdapter.write = list;
        additionDocumentAdapter.IconCompatParcelizer.write();
        boolean z = true;
        this.tvPhotoAttached.setText(getString(R.string.addition_document_image_attached, Integer.valueOf(list.size())));
        this.layoutPhotoAttached.setVisibility(0);
        this.rvDocument.setVisibility(0);
        AdditionDocumentTakePhotoFragment additionDocumentTakePhotoFragment = this.RatingCompat;
        List list2 = null;
        boolean z2 = list2.size() >= 30;
        ImageProcessor.IpProgressClient.C34831 r5 = additionDocumentTakePhotoFragment.presenter;
        if (z2) {
            ImageProcessor.AnalysisCompleteEvent analysisCompleteEvent = ImageProcessor.AnalysisCompleteEvent.write;
            if (r5.RatingCompat == null) {
                z = false;
            }
            if (z) {
                analysisCompleteEvent.IconCompatParcelizer(r5.RatingCompat);
                return;
            }
            return;
        }
        addAnalysisCompleteEventListener addanalysiscompleteeventlistener = addAnalysisCompleteEventListener.read;
        if (r5.RatingCompat == null) {
            z = false;
        }
        if (z) {
            addanalysiscompleteeventlistener.IconCompatParcelizer(r5.RatingCompat);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.layoutPhotoAttached.setVisibility(8);
        this.rvDocument.setVisibility(8);
    }

    public final void IconCompatParcelizer(String str) {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.addition_document_delete_title)).MediaBrowserCompat$ItemReceiver(getString(R.string.addition_document_delete_content));
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.delete_button), new getPrePaidCardSummary(this, str));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), getPrepaidTravelConversionVerification.read).show();
    }

    @OnClick
    public void doneAction() {
        IOrientationGuidanceCalculator iOrientationGuidanceCalculator = this.IconCompatParcelizer;
        boolean z = true;
        if (iOrientationGuidanceCalculator != null) {
            this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", iOrientationGuidanceCalculator.write()));
            this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("ID_photo_attachment", this.rvDocument.MediaDescriptionCompat.IconCompatParcelizer() > 0 ? "Yes" : "No"));
            forEachClear foreachclear = this.tracker;
            if (getActivity() != null) {
                foreachclear.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_document");
            }
        }
        ImageProcessor.ImageOutListener imageOutListener = this.additionDocumentInputPresenter;
        if (getArguments() != null && getArguments().getBoolean("com.scb.phone.IS_REQUIRE_ISSUER_FLAG", false)) {
            analysisProgress analysisprogress = analysisProgress.IconCompatParcelizer;
            if (imageOutListener.RatingCompat == null) {
                z = false;
            }
            if (z) {
                analysisprogress.IconCompatParcelizer(imageOutListener.RatingCompat);
            }
        } else if (imageOutListener.read == setAutoFocusEnabled.IconCompatParcelizer.HML) {
            getProgressPct getprogresspct = getProgressPct.MediaBrowserCompat$ItemReceiver;
            if (imageOutListener.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getprogresspct.IconCompatParcelizer(imageOutListener.RatingCompat);
            }
        } else {
            setProcessedImageJpegQuality setprocessedimagejpegquality = setProcessedImageJpegQuality.MediaBrowserCompat$CustomActionResultReceiver;
            if (imageOutListener.RatingCompat == null) {
                z = false;
            }
            if (z) {
                setprocessedimagejpegquality.IconCompatParcelizer(imageOutListener.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (this.MediaMetadataCompat != null) {
            this.MediaMetadataCompat.IconCompatParcelizer(this, new EasycashIssuerLandingFragment());
        }
    }

    public final void read() {
        if (this.MediaMetadataCompat != null) {
            this.MediaMetadataCompat.IconCompatParcelizer(this, EasycashContactInformationFragment.write());
        }
    }

    public final void RatingCompat() {
        this.additionDocumentInputPresenter.MediaBrowserCompat$CustomActionResultReceiver(this.IconCompatParcelizer.read(), this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver());
    }

    public final void MediaMetadataCompat() {
        this.additionDocumentInputPresenter.read(this.IconCompatParcelizer.read(), this.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver(), this.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final void IconCompatParcelizer() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof IOrientationGuidanceCalculator) {
            this.IconCompatParcelizer = (IOrientationGuidanceCalculator) context;
        }
    }

    public void onDestroy() {
        this.tracker = null;
        this.IconCompatParcelizer = null;
        super.onDestroy();
    }
}
