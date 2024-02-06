package com.thunderhead.connectivity.transport;

import com.thunderhead.android.infrastructure.server.requests.BaseRequest;
import com.thunderhead.android.infrastructure.server.requests.PropertiesRequest;
import com.thunderhead.android.infrastructure.server.requests.ResponseForOptimizationPointsRequest;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import com.thunderhead.connectivity.GenericNetworkResponse;
import com.thunderhead.connectivity.NetworkOperationCallback;
import com.thunderhead.connectivity.OneRuntimeServiceApi;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import p040o.FragmentBuilder_BindHmlOperatingBankFragment;

public class Api19CompatOneRuntimeServiceApi implements OneRuntimeServiceApi {
    private static ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 10, 500, TimeUnit.MILLISECONDS, new ArrayBlockingQueue(50));
    /* access modifiers changed from: private */
    public OneRuntimeServiceApi decorated;

    public Api19CompatOneRuntimeServiceApi(OneRuntimeServiceApi oneRuntimeServiceApi) {
        this.decorated = oneRuntimeServiceApi;
    }

    public GenericNetworkResponse getOptimizationImageInputStream(String str) {
        return this.decorated.getOptimizationImageInputStream(str);
    }

    public void flushNetworkConnectionPools() {
        this.decorated.flushNetworkConnectionPools();
    }

    public void sendBaseTouchpointProperties(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, PropertiesRequest propertiesRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback) {
        final FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment2 = fragmentBuilder_BindHmlOperatingBankFragment;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final PropertiesRequest propertiesRequest2 = propertiesRequest;
        final NetworkOperationCallback<BaseResponse> networkOperationCallback2 = networkOperationCallback;
        threadPoolExecutor.execute(new Runnable() {
            public void run() {
                Api19CompatOneRuntimeServiceApi.this.decorated.sendBaseTouchpointProperties(fragmentBuilder_BindHmlOperatingBankFragment2, str4, str5, str6, propertiesRequest2, networkOperationCallback2);
            }
        });
    }

    public void sendInteraction(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback) {
        final FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment2 = fragmentBuilder_BindHmlOperatingBankFragment;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final BaseRequest baseRequest2 = baseRequest;
        final NetworkOperationCallback<BaseResponse> networkOperationCallback2 = networkOperationCallback;
        threadPoolExecutor.execute(new Runnable() {
            public void run() {
                Api19CompatOneRuntimeServiceApi.this.decorated.sendInteraction(fragmentBuilder_BindHmlOperatingBankFragment2, str4, str5, str6, baseRequest2, networkOperationCallback2);
            }
        });
    }

    public /* synthetic */ void lambda$sendOfflineInteraction$49$Api19CompatOneRuntimeServiceApi(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback networkOperationCallback) {
        this.decorated.sendOfflineInteraction(fragmentBuilder_BindHmlOperatingBankFragment, str, str2, str3, baseRequest, networkOperationCallback);
    }

    public void sendOfflineInteraction(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback) {
        threadPoolExecutor.execute(new Runnable(fragmentBuilder_BindHmlOperatingBankFragment, str, str2, str3, baseRequest, networkOperationCallback) {
            private final /* synthetic */ FragmentBuilder_BindHmlOperatingBankFragment f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ String f$3;
            private final /* synthetic */ String f$4;
            private final /* synthetic */ BaseRequest f$5;
            private final /* synthetic */ NetworkOperationCallback f$6;

            {
                this.f$1 = r2;
                this.f$2 = r3;
                this.f$3 = r4;
                this.f$4 = r5;
                this.f$5 = r6;
                this.f$6 = r7;
            }

            public final void run() {
                Api19CompatOneRuntimeServiceApi.this.lambda$sendOfflineInteraction$49$Api19CompatOneRuntimeServiceApi(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        });
    }

    public void sendPushToken(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback) {
        final FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment2 = fragmentBuilder_BindHmlOperatingBankFragment;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final BaseRequest baseRequest2 = baseRequest;
        final NetworkOperationCallback<BaseResponse> networkOperationCallback2 = networkOperationCallback;
        threadPoolExecutor.execute(new Runnable() {
            public void run() {
                Api19CompatOneRuntimeServiceApi.this.decorated.sendPushToken(fragmentBuilder_BindHmlOperatingBankFragment2, str4, str5, str6, baseRequest2, networkOperationCallback2);
            }
        });
    }

    public void sendAnalyticsData(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback) {
        final FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment2 = fragmentBuilder_BindHmlOperatingBankFragment;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final BaseRequest baseRequest2 = baseRequest;
        final NetworkOperationCallback<BaseResponse> networkOperationCallback2 = networkOperationCallback;
        threadPoolExecutor.execute(new Runnable() {
            public void run() {
                Api19CompatOneRuntimeServiceApi.this.decorated.sendAnalyticsData(fragmentBuilder_BindHmlOperatingBankFragment2, str4, str5, str6, baseRequest2, networkOperationCallback2);
            }
        });
    }

    public void sendResponseForOptimizationPoint(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, ResponseForOptimizationPointsRequest responseForOptimizationPointsRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback) {
        final FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment2 = fragmentBuilder_BindHmlOperatingBankFragment;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final ResponseForOptimizationPointsRequest responseForOptimizationPointsRequest2 = responseForOptimizationPointsRequest;
        final NetworkOperationCallback<BaseResponse> networkOperationCallback2 = networkOperationCallback;
        threadPoolExecutor.execute(new Runnable() {
            public void run() {
                Api19CompatOneRuntimeServiceApi.this.decorated.sendResponseForOptimizationPoint(fragmentBuilder_BindHmlOperatingBankFragment2, str4, str5, str6, responseForOptimizationPointsRequest2, networkOperationCallback2);
            }
        });
    }

    public void sendInteractionProperties(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, PropertiesRequest propertiesRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback) {
        final FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment2 = fragmentBuilder_BindHmlOperatingBankFragment;
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final PropertiesRequest propertiesRequest2 = propertiesRequest;
        final NetworkOperationCallback<BaseResponse> networkOperationCallback2 = networkOperationCallback;
        threadPoolExecutor.execute(new Runnable() {
            public void run() {
                Api19CompatOneRuntimeServiceApi.this.decorated.sendInteractionProperties(fragmentBuilder_BindHmlOperatingBankFragment2, str4, str5, str6, propertiesRequest2, networkOperationCallback2);
            }
        });
    }
}
