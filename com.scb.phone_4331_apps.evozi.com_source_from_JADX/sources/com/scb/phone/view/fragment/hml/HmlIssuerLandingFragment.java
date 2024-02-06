package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlConsentActivity;
import com.scb.phone.view.activity.hml.HmlIssuerInputActivity;
import com.scb.phone.view.fragment.easycash.issuer.EasycashIssuerLandingFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.ZTBSV;
import p040o.forEachClear;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.zzfe;

public final class HmlIssuerLandingFragment extends EasycashIssuerLandingFragment {
    public static final write IconCompatParcelizer = new write((byte) 0);

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public final boolean setHasDecor() {
        return false;
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        super.onViewCreated(view, bundle);
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb")};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_issuer_landing", zsyr2kArr);
        }
    }

    public final void MediaDescriptionCompat() {
        Context context = getContext();
        if (context != null) {
            HmlIssuerInputActivity.read read = HmlIssuerInputActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.IconCompatParcelizer((Object) context, "context");
            onGetStartedClick.write((Object) context, "context");
            Intent intent = new Intent(context, HmlIssuerInputActivity.class);
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
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "issuerId");
        this.easycashIssuerLandingPresenter.MediaBrowserCompat$CustomActionResultReceiver(str, (String) null);
    }

    public final void MediaMetadataCompat() {
        MediaBrowserCompat$ItemReceiver();
        RecyclerView recyclerView = this.issuerRecyclerView;
        onGetStartedClick.IconCompatParcelizer((Object) recyclerView, "issuerRecyclerView");
        RecyclerView.IconCompatParcelizer iconCompatParcelizer = recyclerView.MediaDescriptionCompat;
        if (iconCompatParcelizer != null) {
            this.tracker.MediaBrowserCompat$ItemReceiver(new ZSYR2K("customer_type", "consumer"));
            forEachClear foreachclear = this.tracker;
            onGetStartedClick.IconCompatParcelizer((Object) iconCompatParcelizer, "it");
            foreachclear.MediaBrowserCompat$ItemReceiver(new ZSYR2K("issuer", iconCompatParcelizer.IconCompatParcelizer() > 0 ? "Yes" : "No"));
            ZTBSV ztbsv = this.tracker;
            if (getActivity() != null) {
                ztbsv.MediaBrowserCompat$ItemReceiver(((BaseActivity) getActivity()).scbAnalytics, "apply_loan_issuers");
            }
        }
        Context context = getContext();
        if (context != null) {
            HmlConsentActivity.read read = HmlConsentActivity.MediaMetadataCompat;
            onGetStartedClick.IconCompatParcelizer((Object) context, "context");
            Intent write2 = HmlConsentActivity.read.write(context, zzfe.zza.NCB_CONSENT, (immediateFailedFuture) null);
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
        }
    }
}
