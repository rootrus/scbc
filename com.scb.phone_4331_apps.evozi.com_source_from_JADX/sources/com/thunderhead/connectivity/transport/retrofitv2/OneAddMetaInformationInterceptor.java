package com.thunderhead.connectivity.transport.retrofitv2;

import com.thunderhead.connectivity.transport.ServiceConstants;
import com.thunderhead.connectivity.transport.common.RequestInterceptorUtil;
import java.io.IOException;
import okhttp3.Interceptor;
import okhttp3.Request;
import okhttp3.Response;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindPurchaseCreditCardFragment;
import p040o.OnBoardingTutorialActivity;

public class OneAddMetaInformationInterceptor implements Interceptor {
    public Response intercept(Interceptor.Chain chain) throws IOException {
        OnBoardingTutorialActivity MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver();
        if (!FragmentBuilder_BindPurchaseCreditCardFragment.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver)) {
            return chain.proceed(chain.request());
        }
        String write = FragmentBuilder_BindPurchaseCreditCardFragment.write(MediaBrowserCompat$ItemReceiver);
        Request.Builder newBuilder = chain.request().newBuilder();
        newBuilder.addHeader(ServiceConstants.HEADER_X_ONE_SDKVER, RequestInterceptorUtil.composeSdkVersionHeader());
        newBuilder.addHeader(ServiceConstants.HEADER_X_ONE_SDKAPPNAME, write);
        return chain.proceed(newBuilder.build());
    }
}
