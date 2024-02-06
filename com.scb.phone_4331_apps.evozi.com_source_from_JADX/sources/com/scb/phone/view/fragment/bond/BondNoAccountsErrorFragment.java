package com.scb.phone.view.fragment.bond;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.scb.phone.view.fragment.ErrorFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.C10831component;
import p040o.ForwardingCheckedFuture;
import p040o.HmlPinActivity;
import p040o.JsonDataEncoderBuilder$$Lambda$4;
import p040o.MyECouponActivity_ViewBinding;
import p040o.RttiJsonCheck;
import p040o.ZHPR2;
import p040o.acceptTermsAndConditions;
import p040o.setTapText;

public class BondNoAccountsErrorFragment extends ErrorFragment implements RttiJsonCheck {
    @HmlPinActivity
    public C10831component bondNoAccountsErrorPresenter;

    public static BondNoAccountsErrorFragment read(ForwardingCheckedFuture forwardingCheckedFuture, String str) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("ERROR_DISPLAY_EXTRA", forwardingCheckedFuture);
        bundle.putString("BOND_ERROR_DISPLAY_PROSPECTUS", str);
        BondNoAccountsErrorFragment bondNoAccountsErrorFragment = new BondNoAccountsErrorFragment();
        bondNoAccountsErrorFragment.setArguments(bundle);
        return bondNoAccountsErrorFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.bondNoAccountsErrorPresenter.MediaBrowserCompat$ItemReceiver(this);
        C10831component component = this.bondNoAccountsErrorPresenter;
        ForwardingCheckedFuture forwardingCheckedFuture = this.MediaBrowserCompat$CustomActionResultReceiver;
        component.write = getArguments().getString("BOND_ERROR_DISPLAY_PROSPECTUS");
        JsonDataEncoderBuilder$$Lambda$4 jsonDataEncoderBuilder$$Lambda$4 = new JsonDataEncoderBuilder$$Lambda$4(forwardingCheckedFuture);
        if (component.RatingCompat != null) {
            jsonDataEncoderBuilder$$Lambda$4.IconCompatParcelizer(component.RatingCompat);
        }
        return onCreateView;
    }

    public final void read(String str, String str2) {
        this.errorDescription.setText(ZHPR2.MediaBrowserCompat$CustomActionResultReceiver(str, str2, getResources(), new acceptTermsAndConditions(this), false, 0));
        this.errorDescription.setMovementMethod(LinkMovementMethod.getInstance());
        this.errorDescription.setHighlightColor(0);
    }

    public final void write(String str) {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
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
