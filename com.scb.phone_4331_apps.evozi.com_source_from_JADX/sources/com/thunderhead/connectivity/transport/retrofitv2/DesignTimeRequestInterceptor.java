package com.thunderhead.connectivity.transport.retrofitv2;

import com.thunderhead.connectivity.transport.ServiceConstants;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindMailingAddressDetailsFragment;
import p040o.FragmentBuilder_BindOnboardingInputAddressFragment;
import p040o.MyECouponActivity_ViewBinding;
import p040o.setTextAppearance;

class DesignTimeRequestInterceptor extends AbstractDesignTimeRequestInterceptor {
    DesignTimeRequestInterceptor() {
    }

    /* access modifiers changed from: protected */
    public setTextAppearance<String, String> provideQueryURLPathParameters() {
        String MediaMetadataCompat = FragmentBuilder_BindOnboardingInputAddressFragment.MediaMetadataCompat(FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver());
        if (MediaMetadataCompat.isEmpty()) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressDetailsFragment.NO_WORKSPACE_CONFIGURED);
        }
        setTextAppearance<String, String> settextappearance = new setTextAppearance<>();
        settextappearance.put(ServiceConstants.PS_WORKSPACE_ID_PATH_SEGMENT, MediaMetadataCompat);
        return settextappearance;
    }
}
