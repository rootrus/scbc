package com.scb.phone.view.fragment.ebillsubscription;

import android.content.Intent;
import android.net.Uri;
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
import com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPaySource;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayTarget;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C9709x3b9d2c81;
import p040o.DeepLinkModule_ContributeETBProductDetailDeepLinkActivity;
import p040o.HmlPinActivity;
import p040o.ImagePerfectionProfile;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$1600;
import p040o.access$2200;
import p040o.getICheckDeserializerRtti;
import p040o.getImageHeight;
import p040o.getOversizeImage;
import p040o.getUseMRZPassportDetection;
import p040o.setTapText;
import p040o.verifyPurchaseBond;

public class EBillSubscriptionDetailFragment extends BaseFragment implements getImageHeight.write {
    @HmlPinActivity
    public ImagePerfectionProfile.UseTargetFrameCrop EBillSubscriptionDetailPresenter;
    public access$1600 IconCompatParcelizer;
    @BindView
    CustomTransferAndPaySource sourceDetail;
    @BindView
    CustomTransferAndPaySource status;
    @BindView
    CustomTransferAndPayTarget targetDetail;

    public static EBillSubscriptionDetailFragment MediaBrowserCompat$CustomActionResultReceiver(access$1600 access_1600) {
        EBillSubscriptionDetailFragment eBillSubscriptionDetailFragment = new EBillSubscriptionDetailFragment();
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_EBILL_SUBSCRIPTION_ITEM_DISPLAY", access_1600);
        eBillSubscriptionDetailFragment.setArguments(bundle);
        return eBillSubscriptionDetailFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f87192131493946, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.EBillSubscriptionDetailPresenter.MediaBrowserCompat$ItemReceiver(this);
        access$1600 access_1600 = (access$1600) getArguments().getParcelable("com.scb.phone.EXTRA_EBILL_SUBSCRIPTION_ITEM_DISPLAY");
        this.IconCompatParcelizer = access_1600;
        ImagePerfectionProfile.UseTargetFrameCrop useTargetFrameCrop = this.EBillSubscriptionDetailPresenter;
        getUseMRZPassportDetection getusemrzpassportdetection = new getUseMRZPassportDetection(access_1600);
        if (useTargetFrameCrop.RatingCompat != null) {
            z = true;
        }
        if (z) {
            getusemrzpassportdetection.IconCompatParcelizer(useTargetFrameCrop.RatingCompat);
        }
        setTransitioning();
        return inflate;
    }

    public final void MediaBrowserCompat$ItemReceiver(access$1600 access_1600) {
        this.sourceDetail.setText(getString(R.string.promptpay_id));
        if (TextUtils.equals("MOB", access_1600.MediaBrowserCompat$MediaItem)) {
            this.sourceDetail.setAvatar(getICheckDeserializerRtti.write(getContext(), (int) R.drawable.icon_prompt_pay_mobile).toString());
        } else if (TextUtils.equals("CID", access_1600.MediaBrowserCompat$MediaItem)) {
            this.sourceDetail.setAvatar(getICheckDeserializerRtti.write(getContext(), (int) R.drawable.icon_prompt_pay_cid).toString());
        }
        this.sourceDetail.mAccountNumberTextView.setVisibility(8);
        this.sourceDetail.setSourceName(getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(access_1600.MediaBrowserCompat$MediaItem, access_1600.MediaMetadataCompat));
    }

    public final void read(access$1600 access_1600) {
        this.targetDetail.setText(getString(R.string.billers_detail));
        if (access_1600.read == null || Uri.EMPTY.toString().equals(access_1600.read)) {
            this.targetDetail.setAvatar(getICheckDeserializerRtti.write(getContext(), (int) R.drawable.biller_place_holder).toString());
        } else {
            this.targetDetail.setBillerAvatar(access_1600.read);
        }
        this.targetDetail.setTargetName(access_1600.RatingCompat);
        this.targetDetail.setReferenceNumbers(access_1600.MediaBrowserCompat$CustomActionResultReceiver);
        this.targetDetail.setReferenceNo1(access_1600.MediaSessionCompat$Token);
        if (access_1600.PlaybackStateCompat$CustomAction != null && !access_1600.PlaybackStateCompat$CustomAction.isEmpty()) {
            this.targetDetail.setReferenceNo2(access_1600.MediaSessionCompat$ResultReceiverWrapper);
        }
        if (access_1600.Keep != null && !access_1600.Keep.isEmpty()) {
            this.targetDetail.setReferenceNo3(access_1600.setHasDecor);
        }
    }

    public final void IconCompatParcelizer(access$1600 access_1600) {
        this.status.setVisibility(0);
        this.status.setText(getString(R.string.rtpb_subscription_status));
        this.status.setSourceName(access_1600.MediaBrowserCompat$SearchResultReceiver);
        if (verifyPurchaseBond.REJECT.status.equals(access_1600.MediaDescriptionCompat)) {
            this.status.setAccountNumber(getString(R.string.rtpb_subscription_disclaimer));
        } else {
            this.status.mAccountNumberTextView.setVisibility(8);
        }
    }

    public final void write() {
        Intent intent = new Intent(getContext(), EBillSubscriptionActivity.class);
        intent.addFlags(603979776);
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
            startActivityForResult(intent, 6022);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x000f, code lost:
        r1 = (com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity) getActivity();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r1, int r2, android.content.Intent r3) {
        /*
            r0 = this;
            super.onActivityResult(r1, r2, r3)
            r2 = 6022(0x1786, float:8.439E-42)
            if (r1 != r2) goto L_0x0021
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            boolean r1 = r1 instanceof com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity
            if (r1 == 0) goto L_0x0021
            androidx.fragment.app.FragmentActivity r1 = r0.getActivity()
            com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity r1 = (com.scb.phone.view.activity.ebillsubscription.EBillSubscriptionActivity) r1
            o.getViewBoundariesImage r2 = r1.eBillSubscriptionPresenter
            if (r2 == 0) goto L_0x0021
            r2.MediaBrowserCompat$CustomActionResultReceiver()
            o.getViewBoundariesImage r1 = r1.eBillSubscriptionPresenter
            r1.MediaBrowserCompat$ItemReceiver()
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ebillsubscription.EBillSubscriptionDetailFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    @OnClick
    public void onUnsubscribeClick() {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(getString(R.string.unsubcribe_title)).MediaBrowserCompat$ItemReceiver(getString(R.string.unsubcribe_content));
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.unsubcribe_yes), new DeepLinkModule_ContributeETBProductDetailDeepLinkActivity(this));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.unsubcribe_no), C9709x3b9d2c81.IconCompatParcelizer).show();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200) {
        String str = access_2200.IconCompatParcelizer;
        getOversizeImage getoversizeimage = getOversizeImage.ERROR;
        FragmentActivity activity = getActivity();
        if (activity != null && getActivity() != null) {
            ((BaseActivity) getActivity()).write(activity, R.id.view_container, str, getoversizeimage);
        }
    }
}
