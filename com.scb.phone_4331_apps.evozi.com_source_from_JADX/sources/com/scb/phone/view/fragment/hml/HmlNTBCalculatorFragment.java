package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.activity.hml.HmlNTBApplicationOutcomeActivity;
import com.scb.phone.view.activity.hml.HmlNTBBusinessOccupationInfoActivity;
import com.scb.phone.view.activity.hml.HmlNTBConsentActivity;
import com.scb.phone.view.activity.hml.HmlNTBLoanSetupActivity;
import com.scb.phone.view.activity.hml.HmlNTBLoanSetupActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.hml.HmlNTBPersonalInfoActivity;
import com.scb.phone.view.activity.hml.HmlNTBRepaymentAboutActivity;
import com.scb.phone.view.activity.hml.HmlNTBRepaymentAboutActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.hml.HmlNTBReviewActivity;
import com.scb.phone.view.activity.hml.HmlNTBSuccessActivity;
import com.scb.phone.view.activity.hml.NTBPinLoginActivity;
import com.scb.phone.view.activity.hml.ekyc.HmlNTBeKYCLandingActivity;
import com.scb.phone.view.activity.hml.ekyc.HmlNTBeKYCLandingActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.hml.submission.C5636xa7b1c218;
import com.scb.phone.view.activity.hml.submission.HmlNTBDocumentSubmissionActivity;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.populateFromResponse;
import p040o.setPersonalShortCuts;
import p040o.setTapText;
import p040o.zzfe;

public final class HmlNTBCalculatorFragment extends HmlCalculatorFragment<populateFromResponse> {
    public static final C5994x28b99a94 MediaBrowserCompat$SearchResultReceiver = new C5994x28b99a94((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    private static final /* synthetic */ void IconCompatParcelizer(Fragment fragment, Intent intent) {
        try {
            FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((HmlNTBCalculatorFragment) fragment).startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final /* synthetic */ void write(Integer num) {
        int intValue = num.intValue();
        NTBPinLoginActivity.IconCompatParcelizer iconCompatParcelizer = NTBPinLoginActivity.MediaDescriptionCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, NTBPinLoginActivity.class);
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
            startActivityForResult(intent, intValue);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0026, code lost:
        r0 = (r0 = r0.getIntent()).getExtras();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        /*
            r5 = this;
            com.scb.phone.view.activity.hml.HmlNTBSummaryActivity$read r0 = com.scb.phone.view.activity.hml.HmlNTBSummaryActivity.MediaBrowserCompat$MediaItem
            android.content.Context r0 = r5.requireContext()
            java.lang.String r1 = "requireContext()"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
            java.lang.String r1 = "context"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r1)
            android.content.Intent r1 = new android.content.Intent
            java.lang.Class<com.scb.phone.view.activity.hml.HmlNTBSummaryActivity> r2 = com.scb.phone.view.activity.hml.HmlNTBSummaryActivity.class
            r1.<init>(r0, r2)
            androidx.fragment.app.FragmentActivity r0 = r5.getActivity()
            java.lang.String r2 = "utm_campaign"
            r3 = 0
            if (r0 == 0) goto L_0x0031
            android.content.Intent r0 = r0.getIntent()
            if (r0 == 0) goto L_0x0031
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r0.getString(r2)
            goto L_0x0032
        L_0x0031:
            r0 = r3
        L_0x0032:
            android.content.Intent r0 = r1.putExtra(r2, r0)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r2 = "utm_content"
            if (r1 == 0) goto L_0x004f
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto L_0x004f
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x004f
            java.lang.String r1 = r1.getString(r2)
            goto L_0x0050
        L_0x004f:
            r1 = r3
        L_0x0050:
            android.content.Intent r0 = r0.putExtra(r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r2 = "utm_source"
            if (r1 == 0) goto L_0x006d
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto L_0x006d
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x006d
            java.lang.String r1 = r1.getString(r2)
            goto L_0x006e
        L_0x006d:
            r1 = r3
        L_0x006e:
            android.content.Intent r0 = r0.putExtra(r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r2 = "utm_medium"
            if (r1 == 0) goto L_0x008b
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto L_0x008b
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x008b
            java.lang.String r1 = r1.getString(r2)
            goto L_0x008c
        L_0x008b:
            r1 = r3
        L_0x008c:
            android.content.Intent r0 = r0.putExtra(r2, r1)
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()
            java.lang.String r2 = "intent"
            if (r1 == 0) goto L_0x00a8
            android.content.Intent r1 = r1.getIntent()
            if (r1 == 0) goto L_0x00a8
            android.os.Bundle r1 = r1.getExtras()
            if (r1 == 0) goto L_0x00a8
            java.lang.String r3 = r1.getString(r2)
        L_0x00a8:
            android.content.Intent r0 = r0.putExtra(r2, r3)
            com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf()
            androidx.fragment.app.FragmentActivity r1 = r5.getActivity()     // Catch:{ all -> 0x00e7 }
            if (r1 == 0) goto L_0x00bd
            o.ZoomDocumentActivity r0 = p040o.setTapText.write(r1, r0)     // Catch:{ all -> 0x00e7 }
            android.content.Intent r0 = r0.read()     // Catch:{ all -> 0x00e7 }
        L_0x00bd:
            o.MyECouponActivity_ViewBinding$write r2 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x00e7 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x00e7 }
            java.lang.String r4 = "Uri intercepted on support Fragment.startActivity(Intent), modified: "
            r3.<init>(r4)     // Catch:{ all -> 0x00e7 }
            android.net.Uri r4 = r0.getData()     // Catch:{ all -> 0x00e7 }
            r3.append(r4)     // Catch:{ all -> 0x00e7 }
            java.lang.String r4 = "\n with context "
            r3.append(r4)     // Catch:{ all -> 0x00e7 }
            int r1 = r1.hashCode()     // Catch:{ all -> 0x00e7 }
            r3.append(r1)     // Catch:{ all -> 0x00e7 }
            java.lang.String r1 = r3.toString()     // Catch:{ all -> 0x00e7 }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r2, (java.lang.String) r1)     // Catch:{ all -> 0x00e7 }
            r1 = r5
            com.scb.phone.view.fragment.hml.HmlNTBCalculatorFragment r1 = (com.scb.phone.view.fragment.hml.HmlNTBCalculatorFragment) r1     // Catch:{ all -> 0x00e7 }
            r1.startActivity(r0)     // Catch:{ all -> 0x00e7 }
            return
        L_0x00e7:
            r0 = move-exception
            r0.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.hml.HmlNTBCalculatorFragment.AppCompatDelegateImpl$ListMenuDecorView():void");
    }

    public final void AppCompatActivity() {
        HmlNTBRepaymentAboutActivity$MediaBrowserCompat$ItemReceiver hmlNTBRepaymentAboutActivity$MediaBrowserCompat$ItemReceiver = HmlNTBRepaymentAboutActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlNTBRepaymentAboutActivity.class);
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

    public final void MediaBrowserCompat$ItemReceiver(zzfe.zza zza) {
        onGetStartedClick.write((Object) zza, "type");
        HmlNTBConsentActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBConsentActivity.MediaMetadataCompat;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        Intent MediaBrowserCompat$ItemReceiver = HmlNTBConsentActivity.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(requireContext, zza, (immediateFailedFuture) null);
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

    public final void MediaBrowserCompat$SearchResultReceiver() {
        HmlNTBApplicationOutcomeActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBApplicationOutcomeActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent putExtra = new Intent(requireContext, HmlNTBApplicationOutcomeActivity.class).putExtra("SHOW_PENDING_STATE", false);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlNTBAp…_EXTRA, showPendingState)");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        IconCompatParcelizer(this, putExtra);
    }

    public final void MediaSessionCompat$QueueItem() {
        HmlNTBLoanSetupActivity$MediaBrowserCompat$ItemReceiver hmlNTBLoanSetupActivity$MediaBrowserCompat$ItemReceiver = HmlNTBLoanSetupActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "ctx");
        Intent intent = new Intent(requireContext, HmlNTBLoanSetupActivity.class);
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

    public final void setContentView() {
        HmlNTBSuccessActivity.write write = HmlNTBSuccessActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlNTBSuccessActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo37678x50fd9e4a() {
        HmlNTBSuccessActivity.write write = HmlNTBSuccessActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlNTBSuccessActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        Context context = getContext();
        if (context != null) {
            HmlNTBeKYCLandingActivity$MediaBrowserCompat$ItemReceiver hmlNTBeKYCLandingActivity$MediaBrowserCompat$ItemReceiver = HmlNTBeKYCLandingActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "context");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, HmlNTBeKYCLandingActivity.class);
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

    public final void AppCompatDialogFragment() {
        HmlNTBApplicationOutcomeActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBApplicationOutcomeActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent putExtra = new Intent(requireContext, HmlNTBApplicationOutcomeActivity.class).putExtra("SHOW_PENDING_STATE", false);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlNTBAp…_EXTRA, showPendingState)");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                putExtra = setTapText.write(activity, putExtra).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(putExtra.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(putExtra);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            switch (i) {
                case 1001:
                    HmlNTBApplicationOutcomeActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBApplicationOutcomeActivity.MediaBrowserCompat$SearchResultReceiver;
                    Context requireContext = requireContext();
                    onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
                    onGetStartedClick.write((Object) requireContext, "context");
                    Intent putExtra = new Intent(requireContext, HmlNTBApplicationOutcomeActivity.class).putExtra("SHOW_PENDING_STATE", false);
                    onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, HmlNTBAp…_EXTRA, showPendingState)");
                    AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
                    IconCompatParcelizer(this, putExtra);
                    return;
                case 1002:
                    MediaSessionCompat$QueueItem();
                    return;
                case 1003:
                    mo37678x50fd9e4a();
                    return;
                case 1004:
                    setContentView();
                    return;
                case 1005:
                    MediaBrowserCompat$MediaItem();
                    return;
                default:
                    return;
            }
        }
    }

    public final void RatingCompat() {
        Context context = getContext();
        if (context != null) {
            HmlNTBBusinessOccupationInfoActivity.read read = HmlNTBBusinessOccupationInfoActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, HmlNTBBusinessOccupationInfoActivity.class);
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

    public final void MediaSessionCompat$ResultReceiverWrapper() {
        Context context = getContext();
        if (context != null) {
            Intent IconCompatParcelizer = HmlNTBPersonalInfoActivity.IconCompatParcelizer(context);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    IconCompatParcelizer = setTapText.write(activity, IconCompatParcelizer).read();
                }
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
                sb.append(IconCompatParcelizer.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivity(IconCompatParcelizer);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaMetadataCompat() {
        Context context = getContext();
        if (context != null) {
            HmlNTBReviewActivity.IconCompatParcelizer iconCompatParcelizer = HmlNTBReviewActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, HmlNTBReviewActivity.class);
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

    public final void MediaDescriptionCompat() {
        Context context = getContext();
        if (context != null) {
            C5636xa7b1c218 hmlNTBDocumentSubmissionActivity$MediaBrowserCompat$CustomActionResultReceiver = HmlNTBDocumentSubmissionActivity.MediaMetadataCompat;
            Intent MediaBrowserCompat$ItemReceiver = C5636xa7b1c218.MediaBrowserCompat$ItemReceiver(context, setPersonalShortCuts.SUBMISSION);
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
    }
}
