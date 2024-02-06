package com.scb.phone.view.fragment.remittance;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.google.android.gms.common.api.Api;
import com.scb.phone.R;
import com.scb.phone.view.activity.remittance.RemittanceSenderAddressActivity;
import com.scb.phone.view.activity.remittance.RemittanceSenderAddressActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C5014nO;
import p040o.C5016nP;
import p040o.DebitCardResetOtpActivity;
import p040o.GoodToKnowActivity;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.loadAllVariantsForProject;
import p040o.nO$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.not;
import p040o.onGetStartedClick;
import p040o.onMapClick;
import p040o.setBackground;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class RemittanceSenderAddressReviewFragment extends BaseFragment implements loadAllVariantsForProject {
    public static final write IconCompatParcelizer = new write((byte) 0);
    @BindView
    public Button btNext;
    @BindView
    public LinearLayout llSenderAddressInputContainer;
    @HmlPinActivity
    public C5014nO presenter;
    @BindView
    public TextView tvSenderAddress;

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f89442131494171, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        C5014nO nOVar = this.presenter;
        if (nOVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nOVar.MediaBrowserCompat$ItemReceiver(this);
        C5014nO nOVar2 = this.presenter;
        if (nOVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (nOVar2.RatingCompat != null) {
            nOVar2.RatingCompat.AlertController$RecycleListView();
        }
        not not = nOVar2.IconCompatParcelizer;
        DebitCardResetOtpActivity<onMapClick> MediaBrowserCompat$ItemReceiver = not.read.MediaBrowserCompat$ItemReceiver();
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "profileRepository.address");
        C5014nO nOVar3 = nOVar2;
        not.read(MediaBrowserCompat$ItemReceiver, new C5016nP(new C5014nO.read(nOVar3)), new C5016nP(new C5014nO.IconCompatParcelizer(nOVar3)));
        LinearLayout linearLayout = this.llSenderAddressInputContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llSenderAddressInputContainer");
        }
        linearLayout.setOnClickListener(new C6160x60a035d6(this));
        Button button = this.btNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btNext");
        }
        button.setOnClickListener(new IconCompatParcelizer(this));
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ RemittanceSenderAddressReviewFragment read;

        IconCompatParcelizer(RemittanceSenderAddressReviewFragment remittanceSenderAddressReviewFragment) {
            this.read = remittanceSenderAddressReviewFragment;
        }

        public final void onClick(View view) {
            RemittanceSenderAddressReviewFragment.IconCompatParcelizer(this.read);
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 236 && i2 == -1) {
            C5014nO nOVar = this.presenter;
            if (nOVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            setBackground setbackground = intent != null ? (setBackground) intent.getParcelableExtra("USER_ADDRESS_DISPLAY") : null;
            nOVar.MediaBrowserCompat$ItemReceiver = setbackground;
            nOVar.read(setbackground);
        }
    }

    public final void IconCompatParcelizer(String str) {
        LinearLayout linearLayout = this.llSenderAddressInputContainer;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("llSenderAddressInputContainer");
        }
        int i = 1;
        linearLayout.setClickable(true);
        TextView textView = this.tvSenderAddress;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSenderAddress");
        }
        if (str != null && (!GoodToKnowActivity.read(str))) {
            i = Api.BaseClientBuilder.API_PRIORITY_OTHER;
        }
        textView.setMaxLines(i);
        TextView textView2 = this.tvSenderAddress;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSenderAddress");
        }
        textView2.setText(str);
    }

    public final void IconCompatParcelizer(boolean z) {
        Button button = this.btNext;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btNext");
        }
        button.setEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setBackground setbackground) {
        Context context = getContext();
        if (context != null) {
            RemittanceSenderAddressActivity$MediaBrowserCompat$ItemReceiver remittanceSenderAddressActivity$MediaBrowserCompat$ItemReceiver = RemittanceSenderAddressActivity.MediaDescriptionCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "it");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, RemittanceSenderAddressActivity.class);
            intent.setFlags(603979776);
            intent.putExtra("EXTRA_ADDRESS", setbackground);
            AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
            try {
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    intent = setTapText.write(activity, intent).read();
                }
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
                sb.append(intent.getData());
                sb.append("\n with context ");
                sb.append(activity.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivityForResult(intent, 236);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void onDestroyView() {
        C5014nO nOVar = this.presenter;
        if (nOVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        nOVar.onDestroy();
        super.onDestroyView();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001a, code lost:
        if (r0 == null) goto L_0x001c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final /* synthetic */ void IconCompatParcelizer(com.scb.phone.view.fragment.remittance.RemittanceSenderAddressReviewFragment r7) {
        /*
            android.os.Bundle r0 = r7.getArguments()
            java.lang.String r1 = "STATE"
            r2 = 0
            if (r0 == 0) goto L_0x001c
            r3 = -1
            int r0 = r0.getInt(r1, r3)
            if (r0 < 0) goto L_0x0017
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder[] r3 = p040o.C3092xce3d994b.Builder.values()
            r0 = r3[r0]
            goto L_0x0018
        L_0x0017:
            r0 = r2
        L_0x0018:
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder r0 = (p040o.C3092xce3d994b.Builder) r0
            if (r0 != 0) goto L_0x001e
        L_0x001c:
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame$Builder r0 = p040o.C3092xce3d994b.Builder.NORMAL
        L_0x001e:
            android.os.Bundle r3 = r7.getArguments()
            java.lang.String r4 = "display"
            if (r3 == 0) goto L_0x002c
            android.os.Parcelable r2 = r3.getParcelable(r4)
            o.AutoValue_CrashlyticsReport_Session_Event_Application_Execution_Thread_Frame r2 = (p040o.C3092xce3d994b) r2
        L_0x002c:
            com.scb.phone.view.activity.remittance.RemittanceRecipientDetailActivity$MediaBrowserCompat$CustomActionResultReceiver r3 = com.scb.phone.view.activity.remittance.RemittanceRecipientDetailActivity.MediaDescriptionCompat
            android.content.Context r3 = r7.getContext()
            if (r3 != 0) goto L_0x0037
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver()
        L_0x0037:
            java.lang.String r5 = "context!!"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r5)
            java.lang.String r5 = "context"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r5)
            java.lang.String r5 = "state"
            p040o.onGetStartedClick.write((java.lang.Object) r0, (java.lang.String) r5)
            android.content.Intent r5 = new android.content.Intent
            java.lang.Class<com.scb.phone.view.activity.remittance.RemittanceRecipientDetailActivity> r6 = com.scb.phone.view.activity.remittance.RemittanceRecipientDetailActivity.class
            r5.<init>(r3, r6)
            java.lang.Enum r0 = (java.lang.Enum) r0
            int r0 = r0.ordinal()
            android.content.Intent r0 = r5.putExtra(r1, r0)
            java.lang.String r1 = "putExtra(key, value?.ordinal ?: -1)"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r0, (java.lang.String) r1)
            android.os.Parcelable r2 = (android.os.Parcelable) r2
            r5.putExtra(r4, r2)
            com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf()
            androidx.fragment.app.FragmentActivity r0 = r7.getActivity()     // Catch:{ all -> 0x009b }
            if (r0 == 0) goto L_0x0072
            o.ZoomDocumentActivity r1 = p040o.setTapText.write(r0, r5)     // Catch:{ all -> 0x009b }
            android.content.Intent r5 = r1.read()     // Catch:{ all -> 0x009b }
        L_0x0072:
            o.MyECouponActivity_ViewBinding$write r1 = p040o.MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x009b }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x009b }
            java.lang.String r3 = "Uri intercepted on support Fragment.startActivity(Intent), modified: "
            r2.<init>(r3)     // Catch:{ all -> 0x009b }
            android.net.Uri r3 = r5.getData()     // Catch:{ all -> 0x009b }
            r2.append(r3)     // Catch:{ all -> 0x009b }
            java.lang.String r3 = "\n with context "
            r2.append(r3)     // Catch:{ all -> 0x009b }
            int r0 = r0.hashCode()     // Catch:{ all -> 0x009b }
            r2.append(r0)     // Catch:{ all -> 0x009b }
            java.lang.String r0 = r2.toString()     // Catch:{ all -> 0x009b }
            p040o.MyECouponActivity_ViewBinding.IconCompatParcelizer((p040o.MyECouponActivity_ViewBinding.write) r1, (java.lang.String) r0)     // Catch:{ all -> 0x009b }
            com.scb.phone.view.fragment.remittance.RemittanceSenderAddressReviewFragment r7 = (com.scb.phone.view.fragment.remittance.RemittanceSenderAddressReviewFragment) r7     // Catch:{ all -> 0x009b }
            r7.startActivity(r5)     // Catch:{ all -> 0x009b }
            return
        L_0x009b:
            r7 = move-exception
            r7.printStackTrace()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.remittance.RemittanceSenderAddressReviewFragment.IconCompatParcelizer(com.scb.phone.view.fragment.remittance.RemittanceSenderAddressReviewFragment):void");
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(RemittanceSenderAddressReviewFragment remittanceSenderAddressReviewFragment) {
        C5014nO nOVar = remittanceSenderAddressReviewFragment.presenter;
        if (nOVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer no_mediabrowsercompat_customactionresultreceiver = new nO$MediaBrowserCompat$CustomActionResultReceiver(nOVar);
        if (nOVar.RatingCompat != null) {
            no_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(nOVar.RatingCompat);
        }
    }
}
