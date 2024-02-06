package com.scb.phone.view.fragment.investment.scbs.open;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.scb.phone.R;
import com.scb.phone.view.adapter.investment.scbs.open.SuitabilityAssessmentAdapter;
import com.scb.phone.view.custom.common.CustomDialog;
import p040o.ActivityBuilder_BindUserUnderAgeErrorActivity;
import p040o.ActivityBuilder_BindWifiSettingsActivity;
import p040o.ActivityBuilder_ContribuitesHmlNationalIdActivity;
import p040o.ActivityBuilder_ContribuitesHmlNdidNationalIdInputActivity;
import p040o.ActivityBuilder_ContributNationalIdHelpActivity;
import p040o.ActivityBuilder_ContributeAbstractPartnerLoginActivity;
import p040o.ActivityBuilder_ContributeAccountManagementSuccessActivity;
import p040o.C7130hD;
import p040o.FragmentBuilder_BindCalendarDialogFragment;
import p040o.HmlPinActivity;
import p040o.finalizeSessionWithNativeEvent;
import p040o.getCheckSampleImage;
import p040o.isPageDetectOrientationFlag;

public class SuitabilityQuestionsPart2Fragment extends SuitabilityQuestionsFragment implements C7130hD {
    private FragmentBuilder_BindCalendarDialogFragment MediaBrowserCompat$CustomActionResultReceiver;
    @HmlPinActivity
    public getCheckSampleImage presenter;

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver() {
    }

    public static /* synthetic */ void MediaBrowserCompat$MediaItem() {
    }

    public static /* synthetic */ void MediaMetadataCompat() {
    }

    public static SuitabilityQuestionsPart2Fragment MediaBrowserCompat$SearchResultReceiver() {
        Bundle bundle = new Bundle();
        SuitabilityQuestionsPart2Fragment suitabilityQuestionsPart2Fragment = new SuitabilityQuestionsPart2Fragment();
        suitabilityQuestionsPart2Fragment.setArguments(bundle);
        return suitabilityQuestionsPart2Fragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getCheckSampleImage getchecksampleimage = this.presenter;
        boolean z = false;
        isPageDetectOrientationFlag ispagedetectorientationflag = new isPageDetectOrientationFlag(getchecksampleimage.MediaBrowserCompat$ItemReceiver.write(getchecksampleimage.write.write.Keep(), false));
        if (getchecksampleimage.RatingCompat != null) {
            z = true;
        }
        if (z) {
            ispagedetectorientationflag.IconCompatParcelizer(getchecksampleimage.RatingCompat);
        }
        return onCreateView;
    }

    public final void MediaBrowserCompat$ItemReceiver(finalizeSessionWithNativeEvent finalizesessionwithnativeevent) {
        this.recyclerView.setAdapter(new SuitabilityAssessmentAdapter(finalizesessionwithnativeevent, new ActivityBuilder_ContributNationalIdHelpActivity(this)));
    }

    public final void read() {
        this.MediaBrowserCompat$CustomActionResultReceiver.setOverlayMode();
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.suitability_assessment_error_title).IconCompatParcelizer((int) R.string.suitability_assessment_offshore_derivatives_error);
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.suitability_assessment_dialog_accept), new ActivityBuilder_BindUserUnderAgeErrorActivity(this));
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.suitability_assessment_dialog_cancel), ActivityBuilder_ContribuitesHmlNationalIdActivity.read);
        MediaBrowserCompat$ItemReceiver.setCancelable(false);
        MediaBrowserCompat$ItemReceiver.show();
    }

    public final void IconCompatParcelizer() {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.suitability_assessment_error_title).IconCompatParcelizer((int) R.string.suitability_assessment_derivatives_error);
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.suitability_assessment_dialog_accept), new ActivityBuilder_BindWifiSettingsActivity(this));
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.suitability_assessment_dialog_cancel), ActivityBuilder_ContributeAccountManagementSuccessActivity.read);
        MediaBrowserCompat$ItemReceiver.setCancelable(false);
        MediaBrowserCompat$ItemReceiver.show();
    }

    public final void write() {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.suitability_assessment_error_title).IconCompatParcelizer((int) R.string.suitability_assessment_offshore_error);
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.suitability_assessment_dialog_accept), new ActivityBuilder_ContributeAbstractPartnerLoginActivity(this));
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.suitability_assessment_dialog_cancel), ActivityBuilder_ContribuitesHmlNdidNationalIdInputActivity.MediaBrowserCompat$ItemReceiver);
        MediaBrowserCompat$ItemReceiver.setCancelable(false);
        MediaBrowserCompat$ItemReceiver.show();
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCalendarDialogFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (FragmentBuilder_BindCalendarDialogFragment) context;
        }
    }
}
