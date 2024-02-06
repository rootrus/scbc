package com.thunderhead.connectivity;

import com.thunderhead.connectivity.transport.Api19CompatOneRuntimeServiceApi;
import com.thunderhead.connectivity.transport.retrofitv2.Retrofit2DesigntimeTransport;
import com.thunderhead.connectivity.transport.retrofitv2.Retrofit2RuntimeTransport;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.MyECouponActivity_ViewBinding;

public class TransportImplFactory {
    private static final int RETROFIT2AVAILABLE = 1;
    private static final String RETROFIT_2_WILL_BE_USED_BY_ONE_SDK = "Retrofit 2 will be used by OneSDK";

    private TransportImplFactory() {
    }

    private static int checkRetrofitAvailability() {
        try {
            Class.forName("retrofit2.Retrofit");
            Class.forName("retrofit2.converter.gson.GsonConverterFactory");
            return 1;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static OneDesignTimeApi getDesignTimeServiceApi() {
        if ((checkRetrofitAvailability() & 1) == 1) {
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, RETROFIT_2_WILL_BE_USED_BY_ONE_SDK);
            return new Retrofit2DesigntimeTransport(FragmentBuilder_BindHmlIssuerLandingFragment.setSplitBackground());
        }
        MyECouponActivity_ViewBinding.write("Retrofit not detected");
        return null;
    }

    public static OneRuntimeServiceApi getRuntimeServiceApi(int i) {
        if ((checkRetrofitAvailability() & 1) == 1) {
            MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, RETROFIT_2_WILL_BE_USED_BY_ONE_SDK);
            Retrofit2RuntimeTransport retrofit2RuntimeTransport = new Retrofit2RuntimeTransport(FragmentBuilder_BindHmlIssuerLandingFragment.setSplitBackground());
            return i == 19 ? new Api19CompatOneRuntimeServiceApi(retrofit2RuntimeTransport) : retrofit2RuntimeTransport;
        }
        MyECouponActivity_ViewBinding.write("Retrofit not detected");
        return null;
    }
}
