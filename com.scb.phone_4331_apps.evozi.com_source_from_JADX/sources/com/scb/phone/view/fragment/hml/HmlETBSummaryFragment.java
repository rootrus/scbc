package com.scb.phone.view.fragment.hml;

import android.content.Intent;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.C5607x23cfbb87;
import com.scb.phone.view.activity.hml.HmlETBLandingActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.HmlBusinessOwnerReviewSubmissionActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.zzjx;

public final class HmlETBSummaryFragment extends HmlSummaryFragment {
    public static final write MediaBrowserCompat$CustomActionResultReceiver = new write((byte) 0);
    @BindView
    public TextView step1Description;
    @BindView
    public ImageView step1Image;
    @BindView
    public TextView step1Text;
    @BindView
    public TextView step2Desc;
    @BindView
    public TextView step3Description;
    @BindView
    public TextView step3Text;
    @BindView
    public TextView step4Text;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public HmlETBSummaryFragment() {
        String[] strArr = {"1000", "1998", "1999"};
        onGetStartedClick.write((Object) strArr, "elements");
        HmlBusinessOwnerReviewSubmissionActivity.MediaBrowserCompat$ItemReceiver(strArr);
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x006c, code lost:
        r0 = (r0 = r0.getIntent()).getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void IconCompatParcelizer(p040o.zzct.zza r6) {
        /*
            r5 = this;
            java.lang.String r0 = "flowType"
            p040o.onGetStartedClick.write((java.lang.Object) r6, (java.lang.String) r0)
            r0 = 1
            o.ZSYR2K[] r1 = new p040o.ZSYR2K[r0]
            o.ZSYR2K r2 = new o.ZSYR2K
            java.lang.String r3 = "user_type"
            java.lang.String r4 = "etb"
            r2.<init>(r3, r4)
            r3 = 0
            r1[r3] = r2
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()
            if (r2 == 0) goto L_0x0027
            androidx.fragment.app.FragmentActivity r2 = r5.getActivity()
            com.scb.phone.view.activity.BaseActivity r2 = (com.scb.phone.view.activity.BaseActivity) r2
            o.getKernelIDDst r2 = r2.scbAnalytics
            java.lang.String r3 = "p10x1_simulator_summary"
            r2.write(r3, r1)
        L_0x0027:
            android.content.Context r1 = r5.getContext()
            if (r1 == 0) goto L_0x012c
            int[] r2 = p040o.ActivityBuilder_BindDonationsLandingActivity.MediaBrowserCompat$ItemReceiver
            int r6 = r6.ordinal()
            r6 = r2[r6]
            if (r6 == r0) goto L_0x0054
            r0 = 2
            if (r6 != r0) goto L_0x004e
            com.scb.phone.view.activity.hml.HmlBusinessETBPersonalInfoActivity$write r6 = com.scb.phone.view.activity.hml.HmlBusinessETBPersonalInfoActivity.MediaDescriptionCompat
            java.lang.String r6 = "it"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r1, (java.lang.String) r6)
            java.lang.String r6 = "context"
            p040o.onGetStartedClick.write((java.lang.Object) r1, (java.lang.String) r6)
            android.content.Intent r6 = new android.content.Intent
            java.lang.Class<com.scb.phone.view.activity.hml.HmlBusinessETBPersonalInfoActivity> r0 = com.scb.phone.view.activity.hml.HmlBusinessETBPersonalInfoActivity.class
            r6.<init>(r1, r0)
            goto L_0x005d
        L_0x004e:
            kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
            r6.<init>()
            throw r6
        L_0x0054:
            android.content.Intent r6 = com.scb.phone.view.activity.hml.HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver(r1)
            java.lang.String r0 = "HmlETBPersonalInfoActivity.createIntent(it)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r6, (java.lang.String) r0)
        L_0x005d:
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            java.lang.String r1 = "utm_campaign"
            r2 = 0
            if (r0 == 0) goto L_0x0077
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0077
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0077
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0078
        L_0x0077:
            r0 = r2
        L_0x0078:
            r6.putExtra(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            java.lang.String r1 = "utm_content"
            if (r0 == 0) goto L_0x0094
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0094
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0094
            java.lang.String r0 = r0.getString(r1)
            goto L_0x0095
        L_0x0094:
            r0 = r2
        L_0x0095:
            r6.putExtra(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            java.lang.String r1 = "utm_source"
            if (r0 == 0) goto L_0x00b1
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x00b1
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x00b1
            java.lang.String r0 = r0.getString(r1)
            goto L_0x00b2
        L_0x00b1:
            r0 = r2
        L_0x00b2:
            r6.putExtra(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            java.lang.String r1 = "utm_medium"
            if (r0 == 0) goto L_0x00ce
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x00ce
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x00ce
            java.lang.String r0 = r0.getString(r1)
            goto L_0x00cf
        L_0x00ce:
            r0 = r2
        L_0x00cf:
            r6.putExtra(r1, r0)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            java.lang.String r1 = "intent"
            if (r0 == 0) goto L_0x00ea
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x00ea
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x00ea
            java.lang.String r2 = r0.getString(r1)
        L_0x00ea:
            r6.putExtra(r1, r2)
            com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf()
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()     // Catch:{ all -> 0x0128 }
            if (r0 == 0) goto L_0x00fe
            o.ZoomDocumentActivity r6 = p040o.setTapText.write(r0, r6)     // Catch:{ all -> 0x0128 }
            android.content.Intent r6 = r6.read()     // Catch:{ all -> 0x0128 }
        L_0x00fe:
            o.MyECouponActivity_ViewBinding$write r1 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x0128 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0128 }
            java.lang.String r3 = "Uri intercepted on support Fragment.startActivity(Intent), modified: "
            r2.<init>(r3)     // Catch:{ all -> 0x0128 }
            android.net.Uri r3 = r6.getData()     // Catch:{ all -> 0x0128 }
            r2.append(r3)     // Catch:{ all -> 0x0128 }
            java.lang.String r3 = "\n with context "
            r2.append(r3)     // Catch:{ all -> 0x0128 }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x0128 }
            r2.append(r0)     // Catch:{ all -> 0x0128 }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x0128 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r1, (java.lang.String) r0)     // Catch:{ all -> 0x0128 }
            r0 = r5
            com.scb.phone.view.fragment.hml.HmlETBSummaryFragment r0 = (com.scb.phone.view.fragment.hml.HmlETBSummaryFragment) r0     // Catch:{ all -> 0x0128 }
            r0.startActivity(r6)     // Catch:{ all -> 0x0128 }
            return
        L_0x0128:
            r6 = move-exception
            r6.printStackTrace()
        L_0x012c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.HmlETBSummaryFragment.IconCompatParcelizer(o.zzct$zza):void");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(zzjx.zza.zzb zzb) {
        onGetStartedClick.write((Object) zzb, "productType");
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C5607x23cfbb87 hmlETBLandingActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlETBLandingActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) activity, "activity");
            Intent IconCompatParcelizer = C5607x23cfbb87.IconCompatParcelizer(activity, zzb);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity2 = getActivity();
                if (activity2 != null) {
                    IconCompatParcelizer = setTapText.write(activity2, IconCompatParcelizer).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(IconCompatParcelizer.getData());
                sb.append("\n with context ");
                sb.append(activity2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(IconCompatParcelizer);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void IconCompatParcelizer() {
        TextView textView = this.step2Text;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step2Text");
        }
        textView.setVisibility(8);
        ImageView imageView = this.step2Image;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step2Image");
        }
        imageView.setVisibility(8);
        ImageView imageView2 = this.step1Image;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step1Image");
        }
        imageView2.setImageResource(R.drawable.icon_national_id_scan);
        TextView textView2 = this.step1Text;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step1Text");
        }
        textView2.setText(getResources().getText(R.string.hml_summary_personal_info_step));
        TextView textView3 = this.step1Description;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step1Description");
        }
        textView3.setVisibility(8);
        TextView textView4 = this.step3Text;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step3Text");
        }
        textView4.setText(getResources().getText(R.string.hml_summary_review_occupation_step));
        ImageView imageView3 = this.step3Image;
        if (imageView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step3Image");
        }
        imageView3.setImageResource(R.drawable.ic_occupation_step);
        TextView textView5 = this.step3Description;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step3Description");
        }
        textView5.setText(getResources().getText(R.string.hml_summary_doc_income_doc));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        TextView textView = this.step3Text;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step3Text");
        }
        textView.setVisibility(8);
        ImageView imageView = this.step3Image;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step3Image");
        }
        imageView.setVisibility(8);
        TextView textView2 = this.step3Description;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step3Description");
        }
        textView2.setVisibility(8);
        TextView textView3 = this.step1Text;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step1Text");
        }
        textView3.setText(getString(R.string.hml_business_flow_simulator_summary_personal_info_step));
        TextView textView4 = this.step1Description;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step1Description");
        }
        textView4.setVisibility(8);
        TextView textView5 = this.step2Text;
        if (textView5 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step2Text");
        }
        textView5.setText(getString(R.string.hml_business_flow_simulator_summary_business_info_step));
        TextView textView6 = this.step2Desc;
        if (textView6 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step2Desc");
        }
        textView6.setText(getString(R.string.hml_business_flow_simulator_summary_business_step_desc));
        TextView textView7 = this.step2Desc;
        if (textView7 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step2Desc");
        }
        textView7.setVisibility(0);
        TextView textView8 = this.step4Text;
        if (textView8 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("step4Text");
        }
        textView8.setText(getString(R.string.hml_business_flow_simulator_summary_ncb_consent_step));
    }
}
