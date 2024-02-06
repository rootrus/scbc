package com.scb.phone.view.fragment.easycash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import butterknife.OnClick;
import com.scb.phone.view.activity.easycash.EasycashSubDistrictSearchActivity;
import com.scb.phone.view.fragment.ntb.address.BaseAddressFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import p040o.AutoValue_CrashlyticsReport_CustomAttribute;
import p040o.C1346xf91fc122;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getTimeOutParameters;
import p040o.setTapText;

public abstract class BaseBreadcrumbAddressFragment extends BaseAddressFragment implements C1346xf91fc122 {
    private getTimeOutParameters IconCompatParcelizer;
    private boolean MediaBrowserCompat$CustomActionResultReceiver = false;

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof getTimeOutParameters) {
            this.IconCompatParcelizer = (getTimeOutParameters) context;
        }
    }

    public void onStart() {
        Bundle arguments;
        AutoValue_CrashlyticsReport_CustomAttribute autoValue_CrashlyticsReport_CustomAttribute;
        super.onStart();
        this.IconCompatParcelizer.write((C1346xf91fc122) this);
        if (!this.MediaBrowserCompat$CustomActionResultReceiver && (arguments = getArguments()) != null && arguments.containsKey("com.scb.phone.view.fragment.easycash.financial_information.ADDRESS_DISPLAY") && (autoValue_CrashlyticsReport_CustomAttribute = (AutoValue_CrashlyticsReport_CustomAttribute) arguments.getParcelable("com.scb.phone.view.fragment.easycash.financial_information.ADDRESS_DISPLAY")) != null) {
            this.MediaMetadataCompat = autoValue_CrashlyticsReport_CustomAttribute;
            IconCompatParcelizer(autoValue_CrashlyticsReport_CustomAttribute, true);
        }
    }

    public void onDetach() {
        super.onDetach();
        this.IconCompatParcelizer = null;
    }

    @OnClick
    public void onSelectProvinceClick() {
        this.MediaBrowserCompat$CustomActionResultReceiver = true;
        Intent read = EasycashSubDistrictSearchActivity.read(getContext(), PlaybackStateCompat());
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                read = setTapText.write(activity, read).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 10002);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
