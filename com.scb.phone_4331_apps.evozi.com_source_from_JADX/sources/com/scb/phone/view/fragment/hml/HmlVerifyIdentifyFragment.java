package com.scb.phone.view.fragment.hml;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.analytics.ecommerce.Promotion;
import com.scb.phone.R;
import com.scb.phone.view.activity.findus.FindUsActivity;
import com.scb.phone.view.fragment.BaseFragment;
import p040o.CheckCaptureModule_GetIExtractionServerKtaFactory;
import p040o.HmlPinActivity;
import p040o.UserLoginResponse;
import p040o.UserLoginResponse$MediaBrowserCompat$ItemReceiver;
import p040o.access$2300;
import p040o.onGetStartedClick;
import p040o.setIconPadding;

public final class HmlVerifyIdentifyFragment extends BaseFragment implements CheckCaptureModule_GetIExtractionServerKtaFactory.IconCompatParcelizer {
    public static final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver = new IconCompatParcelizer((byte) 0);
    @HmlPinActivity
    public UserLoginResponse presenter;

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        onGetStartedClick.write((Object) layoutInflater, "inflater");
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f88122131494039, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        UserLoginResponse userLoginResponse = this.presenter;
        if (userLoginResponse == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        userLoginResponse.MediaBrowserCompat$ItemReceiver(this);
        UserLoginResponse userLoginResponse2 = this.presenter;
        if (userLoginResponse2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("HML_IDENTIFY_EKYC_METHOD") : null;
        if (userLoginResponse2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            userLoginResponse2.RatingCompat.AlertController$RecycleListView();
        }
        if (string != null) {
            setIconPadding seticonpadding = userLoginResponse2.MediaBrowserCompat$ItemReceiver;
            seticonpadding.write(seticonpadding.MediaBrowserCompat$ItemReceiver(string), new UserLoginResponse$MediaBrowserCompat$ItemReceiver(userLoginResponse2));
        } else {
            userLoginResponse2.MediaBrowserCompat$ItemReceiver(userLoginResponse2.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver(new Throwable("ekycMethod is null"), access$2300.write.NAVIGATE_BACK));
        }
        onGetStartedClick.IconCompatParcelizer((Object) inflate, "inflater.inflate(R.layou…NTIFY_EKYC_METHOD))\n    }");
        return inflate;
    }

    @OnClick
    public final void submit(View view) {
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        FindUsActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), false);
    }
}
