package com.scb.phone.view.fragment.hml;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.hml.HmlNTBSummaryActivity;
import com.scb.phone.view.fragment.BaseFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.HmlPinActivity;
import p040o.KofaxWebServiceConnectorService;
import p040o.KtaJsonPassport;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class HmlNTBExternalInstructionFragment extends BaseFragment implements KtaJsonPassport {
    public static final write IconCompatParcelizer = new write((byte) 0);
    @HmlPinActivity
    public KofaxWebServiceConnectorService presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.f87862131494013, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        KofaxWebServiceConnectorService kofaxWebServiceConnectorService = this.presenter;
        if (kofaxWebServiceConnectorService == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        kofaxWebServiceConnectorService.MediaBrowserCompat$ItemReceiver(this);
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "inflater.inflate(R.layou…enter.setView(this)\n    }");
        return inflate;
    }

    @OnClick
    public final void onClick() {
        KofaxWebServiceConnectorService kofaxWebServiceConnectorService = this.presenter;
        if (kofaxWebServiceConnectorService == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = KofaxWebServiceConnectorService.read.MediaBrowserCompat$CustomActionResultReceiver;
        if (kofaxWebServiceConnectorService.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(kofaxWebServiceConnectorService.RatingCompat);
        }
    }

    public final void IconCompatParcelizer() {
        HmlNTBSummaryActivity.read read = HmlNTBSummaryActivity.MediaBrowserCompat$MediaItem;
        Context requireContext = requireContext();
        onGetStartedClick.IconCompatParcelizer((Object) requireContext, "requireContext()");
        onGetStartedClick.write((Object) requireContext, "context");
        Intent intent = new Intent(requireContext, HmlNTBSummaryActivity.class);
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
