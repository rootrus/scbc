package com.scb.phone.view.fragment.ntb.fatca;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import java.util.List;
import p040o.ActivityBuilder_ContributeHmlETBBusinessInformationActivity;
import p040o.ActivityBuilder_ContributeHmlETBManageEmailVerificationActivity;
import p040o.C1346xf91fc122;
import p040o.CheckCaptureModule_GetLookAndFeelParametersFactory;
import p040o.FragmentBuilder_BindBulkTransferEmptyFragment;
import p040o.HmlPinActivity;
import p040o.KtaJsonCheck;
import p040o.ZSYR2K;
import p040o.blend;
import p040o.doWriteNonFatal;
import p040o.getTimeOutParameters;
import p040o.nativeGetDocument;
import p040o.nativeGetDocument$MediaBrowserCompat$ItemReceiver;

public class FatcaLandingQuestionFragment extends BaseFragment implements CheckCaptureModule_GetLookAndFeelParametersFactory.read, C1346xf91fc122 {
    private getTimeOutParameters IconCompatParcelizer;
    private int MediaBrowserCompat$CustomActionResultReceiver;
    private FragmentBuilder_BindBulkTransferEmptyFragment MediaBrowserCompat$SearchResultReceiver;
    private KtaJsonCheck.MediaDescriptionCompat MediaMetadataCompat;
    private blend RatingCompat = new blend();
    @HmlPinActivity
    public nativeGetDocument fatcaLandingPresenter;

    public final int ParcelableVolumeInfo() {
        return 2;
    }

    public boolean setHasDecor() {
        return true;
    }

    public static FatcaLandingQuestionFragment MediaBrowserCompat$CustomActionResultReceiver() {
        FatcaLandingQuestionFragment fatcaLandingQuestionFragment = new FatcaLandingQuestionFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("BUNDLE_FATCA_TYPE", 0);
        fatcaLandingQuestionFragment.setArguments(bundle);
        return fatcaLandingQuestionFragment;
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindBulkTransferEmptyFragment) {
            this.MediaBrowserCompat$SearchResultReceiver = (FragmentBuilder_BindBulkTransferEmptyFragment) context;
        }
        if (context instanceof getTimeOutParameters) {
            this.IconCompatParcelizer = (getTimeOutParameters) context;
        }
        if (context instanceof KtaJsonCheck.MediaDescriptionCompat) {
            this.MediaMetadataCompat = (KtaJsonCheck.MediaDescriptionCompat) context;
        }
    }

    public void onDetach() {
        super.onDetach();
        this.MediaBrowserCompat$SearchResultReceiver = null;
        this.IconCompatParcelizer = null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87412131493968, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        setTransitioning();
        this.fatcaLandingPresenter.MediaBrowserCompat$ItemReceiver(this);
        int i = getArguments().getInt("BUNDLE_FATCA_TYPE");
        this.MediaBrowserCompat$CustomActionResultReceiver = i;
        this.fatcaLandingPresenter.IconCompatParcelizer = i;
        if (this.MediaBrowserCompat$SearchResultReceiver != null) {
            int i2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        this.RatingCompat.read("etb");
                    } else if (i2 == 3) {
                        this.RatingCompat.read("scbs");
                        ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", "scbs")};
                        if (getActivity() != null) {
                            ((BaseActivity) getActivity()).scbAnalytics.write("scbsonboard_fatca", zsyr2kArr);
                        }
                    } else if (i2 == 4) {
                        this.RatingCompat.read("your_loan");
                    }
                } else if (getActivity() != null) {
                    ((BaseActivity) getActivity()).mo13676d_("mfonboard_fatca");
                }
                this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem();
            } else {
                KtaJsonCheck.MediaDescriptionCompat mediaDescriptionCompat = this.MediaMetadataCompat;
                String read = mediaDescriptionCompat != null ? mediaDescriptionCompat.read() : "ekyc";
                blend blend = this.RatingCompat;
                String write = this.fatcaLandingPresenter.MediaBrowserCompat$ItemReceiver.write();
                blend.read("source", read);
                if (write != null && "touchpoint".equals(read)) {
                    blend.read("customer_group", write);
                }
            }
            blend blend2 = this.RatingCompat;
            if (getActivity() != null) {
                blend2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_fatca");
            }
            this.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$QueueItem();
        }
        return inflate;
    }

    public void onStart() {
        super.onStart();
        getTimeOutParameters gettimeoutparameters = this.IconCompatParcelizer;
        if (gettimeoutparameters != null) {
            gettimeoutparameters.write((C1346xf91fc122) this);
        }
    }

    @OnClick
    public void onNextButtonClick() {
        nativeGetDocument nativegetdocument = this.fatcaLandingPresenter;
        if (nativegetdocument.RatingCompat != null) {
            nativegetdocument.RatingCompat.AlertController$RecycleListView();
        }
        nativegetdocument.write.write();
        nativegetdocument.write.IconCompatParcelizer(new nativeGetDocument$MediaBrowserCompat$ItemReceiver(nativegetdocument, (byte) 0));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<doWriteNonFatal> list) {
        getChildFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fatca_containner, FatcaQuestionnaireFragment.write(list, this.fatcaLandingPresenter.IconCompatParcelizer)).MediaBrowserCompat$CustomActionResultReceiver("fatca").write();
    }

    public void MediaBrowserCompat$ItemReceiver() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.ntb_pop_up_title_exit).IconCompatParcelizer((int) R.string.ntb_pop_up_message_exit);
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), ActivityBuilder_ContributeHmlETBBusinessInformationActivity.read);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ok), new ActivityBuilder_ContributeHmlETBManageEmailVerificationActivity(this)).show();
    }

    public final String PlaybackStateCompat() {
        return getString(R.string.etb_answer_fatca);
    }
}
