package com.scb.phone.view.fragment.investment;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.investment.schedule.SetupScheduleActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.CustomScheduleView;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.ActivityBuilder_BindHelpActivity;
import p040o.CrashlyticsCore;
import p040o.FragmentBuilder_BindBranchTabFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.forEachMultiply;
import p040o.getDestination;
import p040o.getHorizontalStreaks;
import p040o.setTapText;

public abstract class BaseScheduleFragment<P extends getDestination> extends BaseFragment implements FragmentBuilder_BindBranchTabFragment, getHorizontalStreaks {
    private P IconCompatParcelizer;
    public forEachMultiply MediaBrowserCompat$CustomActionResultReceiver = new forEachMultiply();
    @BindView
    CustomScheduleView customScheduleView;

    /* access modifiers changed from: protected */
    public abstract P MediaDescriptionCompat();

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.IconCompatParcelizer = MediaDescriptionCompat();
        this.customScheduleView.setOnEditClickListener(this);
        this.customScheduleView.read();
        return onCreateView;
    }

    public final void write(String str, String str2) {
        this.customScheduleView.setScheduleView(str, str2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0063  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityResult(int r7, int r8, android.content.Intent r9) {
        /*
            r6 = this;
            r0 = 100
            if (r7 != r0) goto L_0x00b1
            r7 = -1
            if (r8 != r7) goto L_0x00b1
            java.lang.String r8 = "RESULT_KEY"
            android.os.Parcelable r8 = r9.getParcelableExtra(r8)
            o.isProximityOn r8 = (p040o.isProximityOn) r8
            P r9 = r6.IconCompatParcelizer
            r9.write((p040o.isProximityOn) r8)
            boolean r9 = r8.MediaMetadataCompat
            if (r9 != 0) goto L_0x00b1
            o.forEachMultiply r9 = r6.MediaBrowserCompat$CustomActionResultReceiver
            boolean r0 = r8.MediaMetadataCompat
            r1 = 0
            if (r0 != 0) goto L_0x00a2
            java.lang.String r9 = r9.IconCompatParcelizer
            int r0 = r9.hashCode()
            r2 = -1057479348(0xffffffffc0f8254c, float:-7.754553)
            r3 = 0
            r4 = 2
            r5 = 1
            if (r0 == r2) goto L_0x004b
            r2 = -1012063516(0xffffffffc3ad22e4, float:-346.27258)
            if (r0 == r2) goto L_0x0041
            r2 = -101825359(0xfffffffff9ee44b1, float:-1.5464498E35)
            if (r0 != r2) goto L_0x0055
            java.lang.String r0 = "page_purchase"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0055
            r9 = r3
            goto L_0x0056
        L_0x0041:
            java.lang.String r0 = "page_switch"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0055
            r9 = r4
            goto L_0x0056
        L_0x004b:
            java.lang.String r0 = "page_redeem"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x0055
            r9 = r5
            goto L_0x0056
        L_0x0055:
            r9 = r7
        L_0x0056:
            if (r9 == 0) goto L_0x0063
            if (r9 == r5) goto L_0x0060
            if (r9 == r4) goto L_0x005d
            goto L_0x00a2
        L_0x005d:
            java.lang.String r1 = "mfschedule_switchonce"
            goto L_0x00a2
        L_0x0060:
            java.lang.String r1 = "mfschedule_redeemonce"
            goto L_0x00a2
        L_0x0063:
            java.lang.String r8 = r8.write
            int r9 = r8.hashCode()
            r0 = 77
            if (r9 == r0) goto L_0x0089
            r0 = 79
            if (r9 == r0) goto L_0x007f
            r0 = 87
            if (r9 != r0) goto L_0x0092
            java.lang.String r9 = "W"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0092
            r7 = r5
            goto L_0x0092
        L_0x007f:
            java.lang.String r9 = "O"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0092
            r7 = r3
            goto L_0x0092
        L_0x0089:
            java.lang.String r9 = "M"
            boolean r8 = r8.equals(r9)
            if (r8 == 0) goto L_0x0092
            r7 = r4
        L_0x0092:
            if (r7 == 0) goto L_0x009f
            if (r7 == r5) goto L_0x009c
            if (r7 == r4) goto L_0x0099
            goto L_0x00a2
        L_0x0099:
            java.lang.String r7 = "mfschedule_purchasemonthly"
            goto L_0x00a1
        L_0x009c:
            java.lang.String r7 = "mfschedule_purchaseweekly"
            goto L_0x00a1
        L_0x009f:
            java.lang.String r7 = "mfschedule_purchaseonce"
        L_0x00a1:
            r1 = r7
        L_0x00a2:
            androidx.fragment.app.FragmentActivity r7 = r6.getActivity()
            if (r7 == 0) goto L_0x00b1
            androidx.fragment.app.FragmentActivity r7 = r6.getActivity()
            com.scb.phone.view.activity.BaseActivity r7 = (com.scb.phone.view.activity.BaseActivity) r7
            r7.mo13676d_(r1)
        L_0x00b1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.investment.BaseScheduleFragment.onActivityResult(int, int, android.content.Intent):void");
    }

    public final void RatingCompat() {
        this.customScheduleView.read();
    }

    public final void MediaBrowserCompat$ItemReceiver(CrashlyticsCore.C32494 r5) {
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = SetupScheduleActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), r5);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(MediaBrowserCompat$CustomActionResultReceiver2, 100);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        this.IconCompatParcelizer.read();
    }

    public void onDestroy() {
        super.onDestroy();
        this.IconCompatParcelizer.onDestroy();
    }

    /* access modifiers changed from: protected */
    public final void write(String str, String str2, int i, DialogInterface.OnClickListener onClickListener) {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(str).MediaBrowserCompat$ItemReceiver(str2);
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(i), onClickListener);
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), ActivityBuilder_BindHelpActivity.read).show();
    }
}
