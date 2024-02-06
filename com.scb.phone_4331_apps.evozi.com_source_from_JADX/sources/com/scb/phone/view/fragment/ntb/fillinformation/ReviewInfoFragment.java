package com.scb.phone.view.fragment.ntb.fillinformation;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ntb.EkycOtpActivity;
import com.scb.phone.view.custom.ntb.CustomInformationPanel;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.C10863setSdkVersion;
import p040o.C4151cK;
import p040o.C4212cp;
import p040o.C6487x1afa2331;
import p040o.C9872cJ;
import p040o.FragmentBuilder_BindChangeChannelStatementReviewFragment;
import p040o.HmlPinActivity;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.KtaJsonCheck;
import p040o.MyECouponActivity_ViewBinding;
import p040o.blend;
import p040o.getInput;
import p040o.getOrgId;
import p040o.getProjection;
import p040o.setFiles;
import p040o.setKey;
import p040o.setPlatform;
import p040o.setSession;
import p040o.setTapText;

public class ReviewInfoFragment extends BaseFragment implements KtaJsonCheck.MediaMetadataCompat {
    private FragmentBuilder_BindChangeChannelStatementReviewFragment.write IconCompatParcelizer;
    private KtaJsonCheck.MediaDescriptionCompat MediaBrowserCompat$CustomActionResultReceiver;
    private C6487x1afa2331 MediaBrowserCompat$MediaItem;
    private blend RatingCompat = new blend();
    @BindView
    CustomInformationPanel panelAccountInfo;
    @BindView
    CustomInformationPanel panelContactInfo;
    @BindView
    CustomInformationPanel panelOccupationInfo;
    @BindView
    CustomInformationPanel panelPersonalInfo;
    @HmlPinActivity
    public C4212cp reviewInfoPresenter;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindChangeChannelStatementReviewFragment.write) {
            this.IconCompatParcelizer = (FragmentBuilder_BindChangeChannelStatementReviewFragment.write) context;
            this.MediaBrowserCompat$MediaItem = (C6487x1afa2331) context;
        }
        if (context instanceof KtaJsonCheck.MediaDescriptionCompat) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (KtaJsonCheck.MediaDescriptionCompat) context;
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f87472131493974, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.reviewInfoPresenter.MediaBrowserCompat$ItemReceiver(this);
        KtaJsonCheck.MediaDescriptionCompat mediaDescriptionCompat = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (mediaDescriptionCompat != null) {
            blend blend = this.RatingCompat;
            String read = mediaDescriptionCompat.read();
            String write = this.reviewInfoPresenter.read.write();
            blend.read("source", read);
            if (write != null && "touchpoint".equals(read)) {
                blend.read("customer_group", write);
            }
        }
        blend blend2 = this.RatingCompat;
        if (getActivity() != null) {
            blend2.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "ekyc_review");
        }
        return inflate;
    }

    public void onResume() {
        String str;
        super.onResume();
        FragmentBuilder_BindChangeChannelStatementReviewFragment.write write = this.IconCompatParcelizer;
        if (write != null) {
            write.write(getString(R.string.ntb_fillinformation_review_info_page));
        }
        C4212cp cpVar = this.reviewInfoPresenter;
        getProjection write2 = cpVar.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver.write();
        cpVar.write = write2;
        AutoValue_CrashlyticsReport_CustomAttribute.Builder MediaBrowserCompat$CustomActionResultReceiver2 = cpVar.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(write2, cpVar.IconCompatParcelizer.IconCompatParcelizer.setCheckable());
        getInput getinput = cpVar.MediaBrowserCompat$ItemReceiver;
        ArrayList arrayList = new ArrayList();
        setSession setsession = MediaBrowserCompat$CustomActionResultReceiver2.IconCompatParcelizer;
        if (setsession != null) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver3 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver3.read = getinput.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_deposit_type);
            MediaBrowserCompat$CustomActionResultReceiver3.RatingCompat = setsession.IconCompatParcelizer;
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver3);
        }
        setPlatform setplatform = MediaBrowserCompat$CustomActionResultReceiver2.MediaMetadataCompat;
        if (setplatform != null) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver4 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver4.read = getinput.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_home_branch);
            MediaBrowserCompat$CustomActionResultReceiver4.RatingCompat = setplatform.MediaBrowserCompat$CustomActionResultReceiver;
            MediaBrowserCompat$CustomActionResultReceiver4.IconCompatParcelizer = getinput.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_home_branch_disclaimer);
            arrayList.add(MediaBrowserCompat$CustomActionResultReceiver4);
        }
        getInput getinput2 = cpVar.MediaBrowserCompat$ItemReceiver;
        ArrayList arrayList2 = new ArrayList();
        C10863setSdkVersion setsdkversion = MediaBrowserCompat$CustomActionResultReceiver2.read;
        if (setsdkversion != null) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver5 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver5.read = getinput2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_email_address);
            MediaBrowserCompat$CustomActionResultReceiver5.RatingCompat = setsdkversion.read;
            arrayList2.add(MediaBrowserCompat$CustomActionResultReceiver5);
            setFiles MediaBrowserCompat$CustomActionResultReceiver6 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver6.read = getinput2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_mobile);
            MediaBrowserCompat$CustomActionResultReceiver6.RatingCompat = setsdkversion.MediaBrowserCompat$ItemReceiver;
            arrayList2.add(MediaBrowserCompat$CustomActionResultReceiver6);
        }
        AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute = MediaBrowserCompat$CustomActionResultReceiver2.MediaDescriptionCompat;
        if (autoValue_CrashlyticsReport_CustomAttribute != null) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver7 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver7.read = getinput2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_home_address);
            MediaBrowserCompat$CustomActionResultReceiver7.RatingCompat = autoValue_CrashlyticsReport_CustomAttribute.MediaBrowserCompat$SearchResultReceiver;
            arrayList2.add(MediaBrowserCompat$CustomActionResultReceiver7);
        }
        AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute2 = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$ItemReceiver;
        if (autoValue_CrashlyticsReport_CustomAttribute2 != null) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver8 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver8.read = getinput2.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_current_address);
            MediaBrowserCompat$CustomActionResultReceiver8.RatingCompat = autoValue_CrashlyticsReport_CustomAttribute2.MediaBrowserCompat$SearchResultReceiver;
            arrayList2.add(MediaBrowserCompat$CustomActionResultReceiver8);
        }
        getInput getinput3 = cpVar.MediaBrowserCompat$ItemReceiver;
        ArrayList arrayList3 = new ArrayList();
        AutoValue_CrashlyticsReport_CustomAttribute.C30581 r6 = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$SearchResultReceiver;
        if (r6 != null) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver9 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver9.read = getinput3.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_job_title);
            MediaBrowserCompat$CustomActionResultReceiver9.RatingCompat = r6.MediaBrowserCompat$ItemReceiver;
            arrayList3.add(MediaBrowserCompat$CustomActionResultReceiver9);
        }
        getOrgId getorgid = MediaBrowserCompat$CustomActionResultReceiver2.f2672x50fd9e4a;
        if (getorgid != null) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver10 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver10.read = getinput3.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_source_of_income);
            MediaBrowserCompat$CustomActionResultReceiver10.RatingCompat = getorgid.MediaBrowserCompat$CustomActionResultReceiver;
            arrayList3.add(MediaBrowserCompat$CustomActionResultReceiver10);
        }
        setFiles MediaBrowserCompat$CustomActionResultReceiver11 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
        MediaBrowserCompat$CustomActionResultReceiver11.read = getinput3.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_company_name);
        MediaBrowserCompat$CustomActionResultReceiver11.RatingCompat = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver;
        arrayList3.add(MediaBrowserCompat$CustomActionResultReceiver11);
        AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute3 = MediaBrowserCompat$CustomActionResultReceiver2.Keep;
        if (autoValue_CrashlyticsReport_CustomAttribute3 != null) {
            setFiles MediaBrowserCompat$CustomActionResultReceiver12 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver12.read = getinput3.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_work_address);
            MediaBrowserCompat$CustomActionResultReceiver12.RatingCompat = autoValue_CrashlyticsReport_CustomAttribute3.MediaBrowserCompat$SearchResultReceiver;
            arrayList3.add(MediaBrowserCompat$CustomActionResultReceiver12);
        }
        getInput getinput4 = cpVar.MediaBrowserCompat$ItemReceiver;
        ArrayList arrayList4 = new ArrayList();
        setKey setkey = MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$MediaItem;
        if (setkey != null) {
            String str2 = "";
            if (MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper == null || MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper.MediaDescriptionCompat == null || MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper.MediaDescriptionCompat.isEmpty()) {
                str = str2;
            } else {
                str = MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper.MediaDescriptionCompat.concat(" ");
            }
            String concat = (MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper == null || MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver == null || MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver.isEmpty()) ? str2 : MediaBrowserCompat$CustomActionResultReceiver2.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver.concat(" ");
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(setkey.MediaDescriptionCompat.concat(" "));
            String str3 = null;
            sb.append(TextUtils.isEmpty(str3) ? str2 : str3.concat(" "));
            sb.append(setkey.MediaBrowserCompat$MediaItem);
            String obj = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(concat);
            sb2.append(setkey.read.concat(" "));
            if (!TextUtils.isEmpty(str3)) {
                str2 = str3.concat(" ");
            }
            sb2.append(str2);
            sb2.append(setkey.MediaBrowserCompat$SearchResultReceiver);
            String obj2 = sb2.toString();
            setFiles MediaBrowserCompat$CustomActionResultReceiver13 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver13.read = getinput4.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_name_th);
            MediaBrowserCompat$CustomActionResultReceiver13.RatingCompat = obj;
            arrayList4.add(MediaBrowserCompat$CustomActionResultReceiver13);
            setFiles MediaBrowserCompat$CustomActionResultReceiver14 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver14.read = getinput4.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_name_en);
            MediaBrowserCompat$CustomActionResultReceiver14.RatingCompat = obj2;
            arrayList4.add(MediaBrowserCompat$CustomActionResultReceiver14);
            setFiles MediaBrowserCompat$CustomActionResultReceiver15 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver15.read = getinput4.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_national_id);
            MediaBrowserCompat$CustomActionResultReceiver15.RatingCompat = setkey.MediaBrowserCompat$ItemReceiver;
            arrayList4.add(MediaBrowserCompat$CustomActionResultReceiver15);
            setFiles MediaBrowserCompat$CustomActionResultReceiver16 = setFiles.MediaBrowserCompat$CustomActionResultReceiver();
            MediaBrowserCompat$CustomActionResultReceiver16.read = getinput4.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.ntb_fillinformation_review_info_date_of_birth);
            MediaBrowserCompat$CustomActionResultReceiver16.RatingCompat = setkey.IconCompatParcelizer;
            arrayList4.add(MediaBrowserCompat$CustomActionResultReceiver16);
        }
        C4151cK cKVar = new C4151cK(arrayList4, arrayList, arrayList2, arrayList3);
        if (cpVar.RatingCompat != null) {
            cKVar.IconCompatParcelizer(cpVar.RatingCompat);
        }
    }

    public void onDetach() {
        super.onDetach();
        C6487x1afa2331 fragmentBuilder_BindChangeChannelStatementReviewFragment$MediaBrowserCompat$ItemReceiver = this.MediaBrowserCompat$MediaItem;
        if (fragmentBuilder_BindChangeChannelStatementReviewFragment$MediaBrowserCompat$ItemReceiver != null) {
            fragmentBuilder_BindChangeChannelStatementReviewFragment$MediaBrowserCompat$ItemReceiver.setItemInvoker();
        }
    }

    @OnClick
    public void onConfirmButtonClick(View view) {
        C4212cp cpVar = this.reviewInfoPresenter;
        C9872cJ cJVar = new C9872cJ(cpVar);
        if (cpVar.RatingCompat != null) {
            cJVar.IconCompatParcelizer(cpVar.RatingCompat);
        }
    }

    public final void read(List<setFiles> list, List<setFiles> list2, List<setFiles> list3, List<setFiles> list4) {
        this.panelPersonalInfo.setInformationItemList(list);
        this.panelAccountInfo.setInformationItemList(list2);
        this.panelContactInfo.setInformationItemList(list3);
        this.panelOccupationInfo.setInformationItemList(list4);
    }

    public final void IconCompatParcelizer(String str) {
        KtaJsonCheck.MediaDescriptionCompat mediaDescriptionCompat = this.MediaBrowserCompat$CustomActionResultReceiver;
        Intent read = EkycOtpActivity.read(getActivity(), str, mediaDescriptionCompat != null ? mediaDescriptionCompat.read() : null);
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
            startActivityForResult(read, 5231);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 5231 && i2 == -1) {
            getActivity().finish();
        }
    }
}
