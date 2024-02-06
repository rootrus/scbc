package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.hml.C5602xb52cebc;
import com.scb.phone.view.activity.hml.C5610xd0499873;
import com.scb.phone.view.activity.hml.HmlApplicationOutcomeActivity;
import com.scb.phone.view.activity.hml.HmlBusinessOccupationInfoActivity;
import com.scb.phone.view.activity.hml.HmlConsentActivity;
import com.scb.phone.view.activity.hml.HmlETBLoanSetupActivity;
import com.scb.phone.view.activity.hml.HmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.hml.HmlETBPersonalInfoActivity;
import com.scb.phone.view.activity.hml.HmlETBReviewActivity;
import com.scb.phone.view.activity.hml.HmlETBSuccessActivity;
import com.scb.phone.view.activity.hml.HmlRepaymentAboutActivity;
import com.scb.phone.view.activity.hml.submission.HmlDocumentSubmissionActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setDomain;
import p040o.setPersonalShortCuts;
import p040o.setTapText;
import p040o.zzfe;

public class HmlETBCalculatorFragment extends HmlCalculatorFragment<setDomain> {
    public static final C5987x6eec40cb RatingCompat = new C5987x6eec40cb((byte) 0);

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final void MediaBrowserCompat$ItemReceiver(zzfe.zza zza) {
        onGetStartedClick.write((Object) zza, "type");
        HmlConsentActivity.read read = HmlConsentActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        Intent write = HmlConsentActivity.read.write(requireContext, zza, (immediateFailedFuture) null);
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

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = HmlApplicationOutcomeActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), false);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$CustomActionResultReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void MediaSessionCompat$QueueItem() {
        HmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver hmlETBLoanSetupActivity$MediaBrowserCompat$ItemReceiver = HmlETBLoanSetupActivity.MediaDescriptionCompat;
        Context context = getContext();
        if (context == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver();
        }
        onGetStartedClick.IconCompatParcelizer((Object) context, "context!!");
        onGetStartedClick.write((Object) context, "ctx");
        Intent intent = new Intent(context, HmlETBLoanSetupActivity.class);
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

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0037, code lost:
        r1 = (r1 = r1.getIntent()).getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        /*
            r5 = this;
            com.scb.phone.view.activity.hml.HmlETBSummaryActivity$read r0 = com.scb.phone.view.activity.hml.HmlETBSummaryActivity.MediaMetadataCompat
            android.content.Context r0 = r5.getContext()
            if (r0 != 0) goto L_0x000b
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x000b:
            java.lang.String r1 = "context!!"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
            r1 = 0
            java.lang.String r2 = "context"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.Class<com.scb.phone.view.activity.hml.HmlETBSummaryActivity> r3 = com.scb.phone.view.activity.hml.HmlETBSummaryActivity.class
            r2.<init>(r0, r3)
            java.lang.String r0 = "com.scb.phone.EXTRA_LOAN_PERSONALIZATION_SECTION"
            android.content.Intent r0 = r2.putExtra(r0, r1)
            java.lang.String r1 = "Intent(context, HmlETBSu…anPersonalizationSection)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r2 = "utm_campaign"
            r3 = 0
            if (r1 == 0) goto L_0x0042
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto L_0x0042
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x0042
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0043
        L_0x0042:
            r1 = r3
        L_0x0043:
            android.content.Intent r0 = r0.putExtra(r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r2 = "utm_content"
            if (r1 == 0) goto L_0x0060
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto L_0x0060
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x0060
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0061
        L_0x0060:
            r1 = r3
        L_0x0061:
            android.content.Intent r0 = r0.putExtra(r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r2 = "utm_source"
            if (r1 == 0) goto L_0x007e
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto L_0x007e
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x007e
            java.lang.String r1 = r1.getString(r2)
            goto L_0x007f
        L_0x007e:
            r1 = r3
        L_0x007f:
            android.content.Intent r0 = r0.putExtra(r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r2 = "utm_medium"
            if (r1 == 0) goto L_0x009c
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto L_0x009c
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x009c
            java.lang.String r1 = r1.getString(r2)
            goto L_0x009d
        L_0x009c:
            r1 = r3
        L_0x009d:
            android.content.Intent r0 = r0.putExtra(r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r2 = "intent"
            if (r1 == 0) goto L_0x00b9
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto L_0x00b9
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x00b9
            java.lang.String r3 = r1.getString(r2)
        L_0x00b9:
            android.content.Intent r0 = r0.putExtra(r2, r3)
            com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf()
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()     // Catch:{ all -> 0x00f8 }
            if (r1 == 0) goto L_0x00ce
            o.ZoomDocumentActivity r0 = p040o.setTapText.write(r1, r0)     // Catch:{ all -> 0x00f8 }
            android.content.Intent r0 = r0.read()     // Catch:{ all -> 0x00f8 }
        L_0x00ce:
            o.MyECouponActivity_ViewBinding$write r2 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00f8 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00f8 }
            java.lang.String r4 = "Uri intercepted on support Fragment.startActivity(Intent), modified: "
            r3.<init>(r4)     // Catch:{ all -> 0x00f8 }
            android.net.Uri r4 = r0.getData()     // Catch:{ all -> 0x00f8 }
            r3.append(r4)     // Catch:{ all -> 0x00f8 }
            java.lang.String r4 = "\n with context "
            r3.append(r4)     // Catch:{ all -> 0x00f8 }
            int r1 = r1.hashCode()     // Catch:{ all -> 0x00f8 }
            r3.append(r1)     // Catch:{ all -> 0x00f8 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00f8 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r2, (java.lang.String) r1)     // Catch:{ all -> 0x00f8 }
            r1 = r5
            com.scb.phone.view.fragment.hml.HmlETBCalculatorFragment r1 = (com.scb.phone.view.fragment.hml.HmlETBCalculatorFragment) r1     // Catch:{ all -> 0x00f8 }
            r1.startActivity(r0)     // Catch:{ all -> 0x00f8 }
            return
        L_0x00f8:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.HmlETBCalculatorFragment.AppCompatDelegateImpl$ListMenuDecorView():void");
    }

    public final void AppCompatActivity() {
        Intent MediaBrowserCompat$ItemReceiver = HmlRepaymentAboutActivity.MediaBrowserCompat$ItemReceiver(getContext());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$ItemReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$ItemReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setContentView() {
        C5610xd0499873 hmlETBSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlETBSuccessActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlETBSuccessActivity.class);
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

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo37678x50fd9e4a() {
        C5610xd0499873 hmlETBSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlETBSuccessActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlETBSuccessActivity.class);
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

    public final void AppCompatDialogFragment() {
        Intent MediaBrowserCompat$CustomActionResultReceiver = HmlApplicationOutcomeActivity.MediaBrowserCompat$CustomActionResultReceiver(requireContext(), false);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$CustomActionResultReceiver);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void RatingCompat() {
        Context context = getContext();
        if (context != null) {
            C5602xb52cebc hmlBusinessOccupationInfoActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlBusinessOccupationInfoActivity.MediaBrowserCompat$SearchResultReceiver;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, HmlBusinessOccupationInfoActivity.class);
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

    public void MediaSessionCompat$ResultReceiverWrapper() {
        Context context = getContext();
        if (context != null) {
            Intent MediaBrowserCompat$CustomActionResultReceiver = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver(context);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$CustomActionResultReceiver = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$CustomActionResultReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(MediaBrowserCompat$CustomActionResultReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public void MediaMetadataCompat() {
        Context context = getContext();
        if (context != null) {
            HmlETBReviewActivity.read read = HmlETBReviewActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, HmlETBReviewActivity.class);
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

    public void MediaDescriptionCompat() {
        Context context = getContext();
        if (context != null) {
            HmlDocumentSubmissionActivity.write write = HmlDocumentSubmissionActivity.MediaDescriptionCompat;
            Intent MediaBrowserCompat$ItemReceiver = HmlDocumentSubmissionActivity.write.MediaBrowserCompat$ItemReceiver(context, setPersonalShortCuts.SUBMISSION);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    MediaBrowserCompat$ItemReceiver = setTapText.write(activity, MediaBrowserCompat$ItemReceiver).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(MediaBrowserCompat$ItemReceiver.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivity(MediaBrowserCompat$ItemReceiver);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
