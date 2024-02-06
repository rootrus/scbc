package com.scb.phone.view.fragment.ntb.touchpoint;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointFillInfoActivity;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointFillInfoActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.ntb.touchpoint.TouchPointInputCidActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.ThaiTextView;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_FilesPayload_File;
import p040o.C4251dI;
import p040o.C4252dJ;
import p040o.C7041xd5e892c2;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.IdRegion$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$220;
import p040o.checkMap;
import p040o.dJ$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.dJ$MediaBrowserCompat$ItemReceiver;
import p040o.dJ$MediaSessionCompat$Token;
import p040o.emptySet;
import p040o.onCheckBoxClick;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class TouchPointWifiSettingsFragment extends BaseFragment implements IdRegion$MediaBrowserCompat$ItemReceiver {
    public static final C6112x131c48e6 MediaBrowserCompat$CustomActionResultReceiver = new C6112x131c48e6((byte) 0);
    private ConnectivityManager IconCompatParcelizer;
    private TouchPointWifiSettingsFragment$MediaBrowserCompat$ItemReceiver MediaDescriptionCompat = new TouchPointWifiSettingsFragment$MediaBrowserCompat$ItemReceiver(this);
    private final NetworkRequest RatingCompat = new NetworkRequest.Builder().build();
    @BindView
    public Button actionButton;
    @BindView
    public LinearLayout containerLayout;
    @BindView
    public ThaiTextView hintMessageTv;
    @BindView
    public ImageView icon;
    @BindView
    public ThaiTextView messageTv;
    @HmlPinActivity
    public C4252dJ presenter;
    @BindView
    public ThaiTextView remarkTv;

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f90152131494242, viewGroup, false);
        this.read = ButterKnife.IconCompatParcelizer(this, inflate);
        return inflate;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x004d, code lost:
        r3 = r3.getApplicationContext();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onViewCreated(android.view.View r3, android.os.Bundle r4) {
        /*
            r2 = this;
            java.lang.String r0 = "view"
            p040o.onGetStartedClick.write((java.lang.Object) r3, (java.lang.String) r0)
            super.onViewCreated(r3, r4)
            super.setTransitioning()
            r2.setActionBarVisibilityCallback()
            o.dJ r3 = r2.presenter
            java.lang.String r4 = "presenter"
            if (r3 != 0) goto L_0x0017
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0017:
            r0 = r2
            o.CheckCaptureModule_GetICheckDeserializerRttiFactory r0 = (p040o.CheckCaptureModule_GetICheckDeserializerRttiFactory) r0
            r3.MediaBrowserCompat$ItemReceiver(r0)
            android.os.Bundle r3 = r2.getArguments()
            if (r3 == 0) goto L_0x0046
            java.lang.String r0 = "EXTRA_STATE_FLOW"
            java.lang.String r3 = r3.getString(r0)
            if (r3 == 0) goto L_0x0046
            o.dJ r0 = r2.presenter
            if (r0 != 0) goto L_0x0032
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r4)
        L_0x0032:
            java.lang.String r4 = "it"
            p040o.onGetStartedClick.IconCompatParcelizer((java.lang.Object) r3, (java.lang.String) r4)
            android.content.Context r4 = r2.getContext()
            r1 = 1
            if (r4 == 0) goto L_0x0043
            boolean r4 = p040o.AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver((android.content.Context) r4)
            r1 = r1 ^ r4
        L_0x0043:
            r0.MediaBrowserCompat$CustomActionResultReceiver(r3, r1)
        L_0x0046:
            android.content.Context r3 = r2.getContext()
            r4 = 0
            if (r3 == 0) goto L_0x005a
            android.content.Context r3 = r3.getApplicationContext()
            if (r3 == 0) goto L_0x005a
            java.lang.String r0 = "connectivity"
            java.lang.Object r3 = r3.getSystemService(r0)
            goto L_0x005b
        L_0x005a:
            r3 = r4
        L_0x005b:
            boolean r0 = r3 instanceof android.net.ConnectivityManager
            if (r0 != 0) goto L_0x0060
            goto L_0x0061
        L_0x0060:
            r4 = r3
        L_0x0061:
            android.net.ConnectivityManager r4 = (android.net.ConnectivityManager) r4
            r2.IconCompatParcelizer = r4
            if (r4 == 0) goto L_0x0075
            com.scb.phone.view.fragment.ntb.touchpoint.TouchPointWifiSettingsFragment$MediaBrowserCompat$ItemReceiver r3 = r2.MediaDescriptionCompat     // Catch:{ Exception -> 0x006f }
            android.net.ConnectivityManager$NetworkCallback r3 = (android.net.ConnectivityManager.NetworkCallback) r3     // Catch:{ Exception -> 0x006f }
            r4.unregisterNetworkCallback(r3)     // Catch:{ Exception -> 0x006f }
            goto L_0x0075
        L_0x006f:
            r3 = move-exception
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            p040o.onCheckBoxClick.IconCompatParcelizer(r3)
        L_0x0075:
            android.net.ConnectivityManager r3 = r2.IconCompatParcelizer
            if (r3 == 0) goto L_0x0082
            android.net.NetworkRequest r4 = r2.RatingCompat
            com.scb.phone.view.fragment.ntb.touchpoint.TouchPointWifiSettingsFragment$MediaBrowserCompat$ItemReceiver r0 = r2.MediaDescriptionCompat
            android.net.ConnectivityManager$NetworkCallback r0 = (android.net.ConnectivityManager.NetworkCallback) r0
            r3.registerNetworkCallback(r4, r0)
        L_0x0082:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.ntb.touchpoint.TouchPointWifiSettingsFragment.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public final void setTransitioning() {
        super.setTransitioning();
        setActionBarVisibilityCallback();
    }

    public final void write() {
        Intent intent = new Intent("android.settings.WIFI_SETTINGS");
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

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "mobileNumber");
        C4252dJ dJVar = this.presenter;
        if (dJVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        onGetStartedClick.write((Object) str, "mobileNumber");
        C7041xd5e892c2 rttiJsonBill_MembersInjector$read$MediaBrowserCompat$ItemReceiver = dJVar.MediaBrowserCompat$ItemReceiver;
        if (rttiJsonBill_MembersInjector$read$MediaBrowserCompat$ItemReceiver == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("stage");
        }
        int i = C4251dI.MediaBrowserCompat$CustomActionResultReceiver[rttiJsonBill_MembersInjector$read$MediaBrowserCompat$ItemReceiver.ordinal()];
        boolean z = false;
        if (i == 1) {
            writeUInt64NoTag.IconCompatParcelizer dj_mediabrowsercompat_itemreceiver = new dJ$MediaBrowserCompat$ItemReceiver(str);
            if (dJVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                dj_mediabrowsercompat_itemreceiver.IconCompatParcelizer(dJVar.RatingCompat);
            }
        } else if (i == 2) {
            if (dJVar.RatingCompat != null) {
                z = true;
            }
            if (z) {
                dJVar.RatingCompat.AlertController$RecycleListView();
            }
            checkMap checkmap = dJVar.read;
            FundFactSheetActivity dj_mediabrowsercompat_customactionresultreceiver = new dJ$MediaBrowserCompat$CustomActionResultReceiver(dJVar);
            FundFactSheetActivity mediaMetadataCompat = new C4252dJ.MediaMetadataCompat(dJVar);
            emptySet emptyset = new emptySet(str);
            onGetStartedClick.write((Object) dj_mediabrowsercompat_customactionresultreceiver, "onSuccess");
            onGetStartedClick.write((Object) mediaMetadataCompat, "onError");
            onGetStartedClick.write((Object) emptyset, "request");
            checkmap.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(dj_mediabrowsercompat_customactionresultreceiver, mediaMetadataCompat, new access$220.write(emptyset), checkmap.MediaBrowserCompat$ItemReceiver);
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "mobileNumber");
        TouchPointInputCidActivity.write write2 = TouchPointInputCidActivity.MediaBrowserCompat$MediaItem;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        onGetStartedClick.write((Object) str, "mobileNumber");
        Intent putExtra = new Intent(requireContext, TouchPointInputCidActivity.class).putExtra("EXTRA_MOBILE_NUMBER", str);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, TouchPoi…ILE_NUMBER, mobileNumber)");
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                putExtra = setTapText.write(activity, putExtra).read();
            }
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(putExtra.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(putExtra);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void IconCompatParcelizer() {
        setPrimaryBackground();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    public final void MediaBrowserCompat$MediaItem() {
        if (!AlertController$RecycleListView.MediaBrowserCompat$SearchResultReceiver(requireContext()) && getContext() != null) {
            String string = getContext().getString(R.string.no_connection_msg);
            Dialog dialog = this.write;
            if (dialog != null && dialog.isShowing()) {
                this.write.dismiss();
                this.write = null;
            }
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).mo13677k_(string);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        try {
            ConnectivityManager connectivityManager = this.IconCompatParcelizer;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(this.MediaDescriptionCompat);
            }
        } catch (Exception e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }

    static final class write implements DialogInterface.OnClickListener {
        private /* synthetic */ TouchPointWifiSettingsFragment IconCompatParcelizer;

        write(TouchPointWifiSettingsFragment touchPointWifiSettingsFragment) {
            this.IconCompatParcelizer = touchPointWifiSettingsFragment;
        }

        public final void onClick(DialogInterface dialogInterface, int i) {
            dialogInterface.dismiss();
            C4252dJ dJVar = this.IconCompatParcelizer.presenter;
            if (dJVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = dJ$MediaSessionCompat$Token.write;
            if (dJVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(dJVar.RatingCompat);
            }
        }
    }

    public final void RatingCompat() {
        CustomDialog IconCompatParcelizer2 = CustomDialog.IconCompatParcelizer(getContext()).MediaBrowserCompat$ItemReceiver((int) R.string.ntb_resume_popup_title).IconCompatParcelizer((int) R.string.ntb_resume_popup_description);
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.ntb_resume_popup_start_over), new write(this));
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.ntb_resume_popup_resume), new C6113x4afbfe07(this)).show();
    }

    public final void read() {
        TouchPointFillInfoActivity$MediaBrowserCompat$ItemReceiver touchPointFillInfoActivity$MediaBrowserCompat$ItemReceiver = TouchPointFillInfoActivity.MediaBrowserCompat$SearchResultReceiver;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        Intent write2 = TouchPointFillInfoActivity$MediaBrowserCompat$ItemReceiver.write(requireContext, DiskLruCache.VERSION_1);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                write2 = setTapText.write(activity, write2).read();
            }
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(write2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(write2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        FragmentActivity activity2 = getActivity();
        if (activity2 != null) {
            activity2.finish();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        setPrimaryBackground();
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    private final void MediaBrowserCompat$CustomActionResultReceiver(boolean z, String str, FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity> fundActionsSuccessActivity) {
        Button button = this.actionButton;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("actionButton");
        }
        View view = button;
        onGetStartedClick.write((Object) view, "$this$isInVisible");
        view.setVisibility(z ? 4 : 0);
        if (!z) {
            Button button2 = this.actionButton;
            if (button2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("actionButton");
            }
            button2.setText(str);
            Button button3 = this.actionButton;
            if (button3 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("actionButton");
            }
            button3.setOnClickListener(new IconCompatParcelizer(fundActionsSuccessActivity));
        }
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ FundActionsSuccessActivity MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(FundActionsSuccessActivity fundActionsSuccessActivity) {
            this.MediaBrowserCompat$ItemReceiver = fundActionsSuccessActivity;
        }

        public final void onClick(View view) {
            FundActionsSuccessActivity fundActionsSuccessActivity = this.MediaBrowserCompat$ItemReceiver;
            if (fundActionsSuccessActivity != null) {
                fundActionsSuccessActivity.invoke();
            }
        }
    }

    private final void IconCompatParcelizer(boolean z, String str) {
        ThaiTextView thaiTextView = this.remarkTv;
        if (thaiTextView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remarkTv");
        }
        View view = thaiTextView;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(z ? 0 : 8);
        ThaiTextView thaiTextView2 = this.remarkTv;
        if (thaiTextView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("remarkTv");
        }
        thaiTextView2.setText(str);
    }

    static final class read implements Runnable {
        private /* synthetic */ TouchPointWifiSettingsFragment MediaBrowserCompat$CustomActionResultReceiver;

        read(TouchPointWifiSettingsFragment touchPointWifiSettingsFragment) {
            this.MediaBrowserCompat$CustomActionResultReceiver = touchPointWifiSettingsFragment;
        }

        public final void run() {
            C4252dJ dJVar = this.MediaBrowserCompat$CustomActionResultReceiver.presenter;
            if (dJVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            boolean MediaBrowserCompat$ItemReceiver = TouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            if (!dJVar.write) {
                if (!(dJVar.IconCompatParcelizer == C4252dJ.IconCompatParcelizer.MOBILE_NUMBER_FOUND)) {
                    C7041xd5e892c2 rttiJsonBill_MembersInjector$read$MediaBrowserCompat$ItemReceiver = dJVar.MediaBrowserCompat$ItemReceiver;
                    if (rttiJsonBill_MembersInjector$read$MediaBrowserCompat$ItemReceiver == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("stage");
                    }
                    dJVar.MediaBrowserCompat$CustomActionResultReceiver(rttiJsonBill_MembersInjector$read$MediaBrowserCompat$ItemReceiver.name(), MediaBrowserCompat$ItemReceiver);
                }
            }
        }
    }

    public static final /* synthetic */ boolean MediaBrowserCompat$ItemReceiver(TouchPointWifiSettingsFragment touchPointWifiSettingsFragment) {
        Context context = touchPointWifiSettingsFragment.getContext();
        if (context != null) {
            return !AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(context);
        }
        return true;
    }

    public final void onDestroy() {
        try {
            ConnectivityManager connectivityManager = this.IconCompatParcelizer;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(this.MediaDescriptionCompat);
            }
        } catch (Exception e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
        C4252dJ dJVar = this.presenter;
        if (dJVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        dJVar.onDestroy();
        super.onDestroy();
    }

    public final void onDestroyView() {
        try {
            ConnectivityManager connectivityManager = this.IconCompatParcelizer;
            if (connectivityManager != null) {
                connectivityManager.unregisterNetworkCallback(this.MediaDescriptionCompat);
            }
        } catch (Exception e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
        C4252dJ dJVar = this.presenter;
        if (dJVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        dJVar.onDestroy();
        super.onDestroyView();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_FilesPayload_File.Builder builder) {
        onGetStartedClick.write((Object) builder, "display");
        String string = getString(builder.MediaMetadataCompat);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(display.titleId)");
        ParcelableVolumeInfo(string);
        int i = builder.read;
        ImageView imageView = this.icon;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("icon");
        }
        imageView.setImageResource(i);
        String str = builder.IconCompatParcelizer;
        ThaiTextView thaiTextView = this.messageTv;
        if (thaiTextView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("messageTv");
        }
        thaiTextView.setText(str);
        String str2 = builder.MediaBrowserCompat$CustomActionResultReceiver;
        ThaiTextView thaiTextView2 = this.hintMessageTv;
        if (thaiTextView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("hintMessageTv");
        }
        thaiTextView2.setText(str2);
        String str3 = builder.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            MediaBrowserCompat$CustomActionResultReceiver(false, str3, builder.write);
        } else {
            MediaBrowserCompat$CustomActionResultReceiver(true, (String) null, (FundActionsSuccessActivity<HmlVerifyPhoneValidateOtpActivity>) null);
        }
        String str4 = builder.MediaDescriptionCompat;
        if (str4 != null) {
            IconCompatParcelizer(true, str4);
        } else {
            IconCompatParcelizer(false, (String) null);
        }
        LinearLayout linearLayout = this.containerLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("containerLayout");
        }
        View view = linearLayout;
        onGetStartedClick.write((Object) view, "$this$isVisible");
        view.setVisibility(0);
    }
}
