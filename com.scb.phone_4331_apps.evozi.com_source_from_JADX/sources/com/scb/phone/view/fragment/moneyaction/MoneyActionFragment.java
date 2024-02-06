package com.scb.phone.view.fragment.moneyaction;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.OnClick;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.requesttopay.RequestToPayActivity;
import com.scb.phone.view.activity.transferandpay.ScanPaymentActivity;
import com.scb.phone.view.activity.transferandpay.billpayment.BillPaymentActivity;
import com.scb.phone.view.activity.transferandpay.cardlessatm.CardlessATMTutorialActivity;
import com.scb.phone.view.activity.transferandpay.topup.TopUpActivity;
import com.scb.phone.view.activity.transferandpay.transfer.TransferActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.AppstatsThresholdReachedListener;
import p040o.FragmentBuilder_BindBaseRequestToPayFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getIdType;
import p040o.setTapText;

public class MoneyActionFragment extends BaseFragment implements FragmentBuilder_BindBaseRequestToPayFragment {
    @BindView
    ImageView bgMoneyMovement;
    @HmlPinActivity
    public getIdType iDeviceCompatibilityHelper;
    @BindView
    ImageView mImageView;
    @BindView
    RecyclerView mRecyclerView;
    @HmlPinActivity
    public AppstatsThresholdReachedListener moneyActionPresenter;

    public static MoneyActionFragment read(byte[] bArr) {
        MoneyActionFragment moneyActionFragment = new MoneyActionFragment();
        Bundle bundle = new Bundle();
        bundle.putByteArray("EXTRA_BITMAP", bArr);
        moneyActionFragment.setArguments(bundle);
        return moneyActionFragment;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00b2, code lost:
        if (r12 == r1) goto L_0x00b6;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public android.view.View onCreateView(android.view.LayoutInflater r11, android.view.ViewGroup r12, android.os.Bundle r13) {
        /*
            r10 = this;
            androidx.fragment.app.FragmentActivity r13 = r10.getActivity()
            com.scb.phone.view.activity.HomeActivity r13 = (com.scb.phone.view.activity.HomeActivity) r13
            r0 = 1
            r13.MediaMetadataCompat = r0
            r13 = 0
            r1 = 2131494078(0x7f0c04be, float:1.8611654E38)
            android.view.View r11 = r11.inflate(r1, r12, r13)
            butterknife.ButterKnife.IconCompatParcelizer(r10, r11)
            android.os.Bundle r12 = r10.getArguments()
            java.lang.String r1 = "EXTRA_BITMAP"
            r12.getByteArray(r1)
            com.scb.phone.view.adapter.moneyaction.MoneyActionAdapter r12 = new com.scb.phone.view.adapter.moneyaction.MoneyActionAdapter
            o.AppstatsThresholdReachedListener r1 = r10.moneyActionPresenter
            int[] r2 = p040o.AppstatsThresholdReachedListener.C30453.MediaBrowserCompat$ItemReceiver
            o.notNull r1 = r1.read
            o.zzmd$zzm$zzb$zza r1 = r1.IconCompatParcelizer()
            int r1 = r1.ordinal()
            r1 = r2[r1]
            r2 = 5
            java.lang.Integer r3 = java.lang.Integer.valueOf(r2)
            r4 = 4
            java.lang.Integer r5 = java.lang.Integer.valueOf(r4)
            r6 = 3
            java.lang.Integer r7 = java.lang.Integer.valueOf(r6)
            r8 = 2
            if (r1 == r0) goto L_0x0066
            r1 = 6
            java.lang.Integer[] r1 = new java.lang.Integer[r1]
            java.lang.Integer r9 = java.lang.Integer.valueOf(r13)
            r1[r13] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r0)
            r1[r0] = r9
            java.lang.Integer r9 = java.lang.Integer.valueOf(r8)
            r1[r8] = r9
            r1[r6] = r7
            r1[r4] = r5
            r1[r2] = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r1 = java.util.Arrays.asList(r1)
            r2.<init>(r1)
            goto L_0x0077
        L_0x0066:
            java.lang.Integer[] r1 = new java.lang.Integer[r6]
            r1[r13] = r7
            r1[r0] = r5
            r1[r8] = r3
            java.util.ArrayList r2 = new java.util.ArrayList
            java.util.List r1 = java.util.Arrays.asList(r1)
            r2.<init>(r1)
        L_0x0077:
            r12.<init>(r10, r2)
            androidx.recyclerview.widget.RecyclerView r1 = r10.mRecyclerView
            r1.setAdapter(r12)
            androidx.recyclerview.widget.RecyclerView r12 = r10.mRecyclerView
            r12.setNestedScrollingEnabled(r0)
            o.AppstatsThresholdReachedListener r12 = r10.moneyActionPresenter
            o.StreetViewPanoramaOrientation r12 = r12.MediaBrowserCompat$ItemReceiver
            o.AbstractMultimap$EntryIterator r12 = r12.MediaBrowserCompat$ItemReceiver
            boolean r12 = r12.MediaBrowserCompat$ItemReceiver()
            if (r12 == 0) goto L_0x00b5
            o.AppstatsThresholdReachedListener r12 = r10.moneyActionPresenter
            o.StreetViewPanoramaOrientation r12 = r12.MediaBrowserCompat$ItemReceiver
            o.AbstractMultimap$EntryIterator r12 = r12.MediaBrowserCompat$ItemReceiver
            boolean r12 = r12.write()
            if (r12 != 0) goto L_0x00b5
            o.zzmd$zzm$zzb$zza r12 = p040o.zzmd.zzm.zzb.zza.INDIVIDUAL
            androidx.fragment.app.FragmentActivity r1 = r10.getActivity()
            boolean r1 = r1 instanceof com.scb.phone.view.activity.PreLoadCheckActivity
            if (r1 == 0) goto L_0x00b1
            androidx.fragment.app.FragmentActivity r1 = r10.getActivity()
            com.scb.phone.view.activity.PreLoadCheckActivity r1 = (com.scb.phone.view.activity.PreLoadCheckActivity) r1
            o.zzmd$zzm$zzb$zza r1 = r1.setTitleOptional()
            goto L_0x00b2
        L_0x00b1:
            r1 = 0
        L_0x00b2:
            if (r12 != r1) goto L_0x00b5
            goto L_0x00b6
        L_0x00b5:
            r0 = r13
        L_0x00b6:
            if (r0 == 0) goto L_0x00de
            android.content.Context r12 = r10.getContext()
            r13 = 2131230882(0x7f0800a2, float:1.807783E38)
            android.graphics.drawable.Drawable r12 = p040o.setLastBaselineToBottomHeight.write(r12, r13)
            r10.getContext()
            o.AppstatsThresholdReachedListener r13 = r10.moneyActionPresenter
            o.PlacesOptions$Builder r0 = p040o.PlacesOptions.Builder.BG_MONEY_MOVEMENT
            o.StreetViewPanoramaOrientation r13 = r13.MediaBrowserCompat$ItemReceiver
            o.AbstractMultimap$EntryIterator r13 = r13.MediaBrowserCompat$ItemReceiver
            java.lang.String r13 = r13.IconCompatParcelizer()
            java.io.File r1 = new java.io.File
            java.lang.String r0 = r0.component
            r1.<init>(r13, r0)
            android.widget.ImageView r13 = r10.bgMoneyMovement
            p040o.FragmentBuilder_BindDepositSelectorFragment.IconCompatParcelizer((java.io.File) r1, (android.widget.ImageView) r13, (android.graphics.drawable.Drawable) r12)
        L_0x00de:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.moneyaction.MoneyActionFragment.onCreateView(android.view.LayoutInflater, android.view.ViewGroup, android.os.Bundle):android.view.View");
    }

    public final void IconCompatParcelizer(int i) {
        if (i == 0) {
            ((BaseActivity) getActivity()).mo13676d_("action_mm_requestmoney");
            RequestToPayActivity.IconCompatParcelizer(getContext(), "");
        } else if (i == 1) {
            ((BaseActivity) getActivity()).mo13676d_("action_mm_cardlessatm");
            CardlessATMTutorialActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), "moneyMovement");
        } else if (i != 2) {
            if (i == 3) {
                ((BaseActivity) getActivity()).mo13676d_("action_mm_topup");
                TopUpActivity.MediaBrowserCompat$ItemReceiver(getContext(), "input");
            } else if (i == 4) {
                ((BaseActivity) getActivity()).mo13676d_("action_mm_transfer");
                TransferActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), "input");
            } else if (i == 5) {
                ((BaseActivity) getActivity()).mo13676d_("action_mm_billpayment");
                BillPaymentActivity.read(getContext(), "input");
            }
        } else if (this.iDeviceCompatibilityHelper.read()) {
            ((BaseActivity) getActivity()).mo13676d_("action_mm_scanpayment");
            Intent intent = new Intent(getContext(), ScanPaymentActivity.class);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(intent);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    @OnClick
    public void onOutsideClick() {
        if (getActivity() != null) {
            getActivity().onBackPressed();
        }
    }
}
