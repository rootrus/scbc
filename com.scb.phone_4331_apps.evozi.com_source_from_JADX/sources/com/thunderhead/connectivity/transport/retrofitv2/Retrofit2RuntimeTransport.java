package com.thunderhead.connectivity.transport.retrofitv2;

import com.thunderhead.android.infrastructure.server.requests.BaseRequest;
import com.thunderhead.android.infrastructure.server.requests.PropertiesRequest;
import com.thunderhead.android.infrastructure.server.requests.ResponseForOptimizationPointsRequest;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import com.thunderhead.connectivity.GenericNetworkResponse;
import com.thunderhead.connectivity.NetworkOperationCallback;
import com.thunderhead.connectivity.OneRuntimeServiceApi;
import com.thunderhead.connectivity.transport.OkClientFactory;
import com.thunderhead.connectivity.transport.ServiceConstants;
import com.thunderhead.connectivity.transport.retrofitv2.Retrofit2Transport;
import com.thunderhead.connectivity.transport.retrofitv2.web.PropertiesApi;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import okhttp3.Request;
import p040o.FragmentBuilder_BindHmlOperatingBankFragment;
import p040o.FragmentBuilder_BindManageNotificationFragment;
import p040o.MyECouponActivity_ViewBinding;
import retrofit2.Call;

public class Retrofit2RuntimeTransport extends Retrofit2Transport implements OneRuntimeServiceApi {
    public Retrofit2RuntimeTransport(ServiceInterfaceProvider serviceInterfaceProvider) {
        super(serviceInterfaceProvider);
    }

    public GenericNetworkResponse<InputStream> getOptimizationImageInputStream(String str) {
        try {
            return new Retrofit2GenericResponse(OkClientFactory.getNotificationResourceLoaderHttpClient().newCall(new Request.Builder().url(str).build()).execute());
        } catch (IOException e) {
            Retrofit2GenericResponse retrofit2GenericResponse = new Retrofit2GenericResponse(new Rv2NetworkOperationError((Throwable) e));
            e.printStackTrace();
            return retrofit2GenericResponse;
        }
    }

    public void flushNetworkConnectionPools() {
        OkClientFactory.flushConnectionsPools();
    }

    public void sendBaseTouchpointProperties(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, PropertiesRequest propertiesRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback) {
        new Thread(new Runnable(fragmentBuilder_BindHmlOperatingBankFragment, propertiesRequest, str, str2, str3, networkOperationCallback) {
            private final /* synthetic */ FragmentBuilder_BindHmlOperatingBankFragment f$1;
            private final /* synthetic */ PropertiesRequest f$2;
            private final /* synthetic */ String f$3;
            private final /* synthetic */ String f$4;
            private final /* synthetic */ String f$5;
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
                Retrofit2RuntimeTransport.this.lambda$sendBaseTouchpointProperties$42$Retrofit2RuntimeTransport(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        }).start();
    }

    public /* synthetic */ void lambda$sendBaseTouchpointProperties$42$Retrofit2RuntimeTransport(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, PropertiesRequest propertiesRequest, String str, String str2, String str3, NetworkOperationCallback networkOperationCallback) {
        Call<BaseResponse> call;
        PropertiesApi propertiesApi = this.serviceInterfaceProvider.getPropertiesApi(fragmentBuilder_BindHmlOperatingBankFragment);
        if (propertiesRequest.getTimestamp() == null || propertiesRequest.getTimestamp().longValue() <= 0) {
            propertiesRequest.voidTimestamp();
            call = propertiesApi.sendProperties(str, str2, str3, propertiesRequest);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(ServiceConstants.HEADER_X_ONE_TIMESTAMP, propertiesRequest.getTimestamp());
            propertiesRequest.voidTimestamp();
            call = propertiesApi.sendProperties(hashMap, str, str2, str3, propertiesRequest);
        }
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageNotificationFragment.SEND_TOUCHPOINT_PROPERTIES, str, str2, str3, propertiesRequest.toString());
        call.enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback, FragmentBuilder_BindManageNotificationFragment.RECEIVE_TOUCHPOINT_PROPERTIES));
    }

    public void sendInteraction(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback) {
        new Thread(new Runnable(fragmentBuilder_BindHmlOperatingBankFragment, str, str3, str2, baseRequest, networkOperationCallback) {
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
                Retrofit2RuntimeTransport.this.lambda$sendInteraction$43$Retrofit2RuntimeTransport(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        }).start();
    }

    public /* synthetic */ void lambda$sendInteraction$43$Retrofit2RuntimeTransport(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback networkOperationCallback) {
        Call<BaseResponse> sendInteraction = this.serviceInterfaceProvider.getInteractionApi(fragmentBuilder_BindHmlOperatingBankFragment).sendInteraction(str, str2, str3, baseRequest);
        FragmentBuilder_BindManageNotificationFragment fragmentBuilder_BindManageNotificationFragment = FragmentBuilder_BindManageNotificationFragment.SEND_INTERACTION;
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str3;
        objArr[2] = str2;
        objArr[3] = baseRequest != null ? baseRequest.toString() : null;
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindManageNotificationFragment, objArr);
        sendInteraction.enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback, FragmentBuilder_BindManageNotificationFragment.RECEIVE_INTERACTION));
    }

    public void sendOfflineInteraction(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback) {
        new Thread(new Runnable(fragmentBuilder_BindHmlOperatingBankFragment, str, str3, str2, baseRequest, networkOperationCallback) {
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
                Retrofit2RuntimeTransport.this.lambda$sendOfflineInteraction$44$Retrofit2RuntimeTransport(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        }).start();
    }

    public /* synthetic */ void lambda$sendOfflineInteraction$44$Retrofit2RuntimeTransport(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback networkOperationCallback) {
        Call<BaseResponse> sendOfflineInteraction = this.serviceInterfaceProvider.getInteractionApi(fragmentBuilder_BindHmlOperatingBankFragment).sendOfflineInteraction(str, str2, str3, baseRequest);
        FragmentBuilder_BindManageNotificationFragment fragmentBuilder_BindManageNotificationFragment = FragmentBuilder_BindManageNotificationFragment.SEND_OFFLINE_INTERACTION;
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str3;
        objArr[2] = str2;
        objArr[3] = baseRequest != null ? baseRequest.toString() : null;
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindManageNotificationFragment, objArr);
        sendOfflineInteraction.enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback, FragmentBuilder_BindManageNotificationFragment.RECEIVE_OFFLINE_INTERACTION));
    }

    public void sendPushToken(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback) {
        new Thread(new Runnable(fragmentBuilder_BindHmlOperatingBankFragment, str, str3, str2, baseRequest, networkOperationCallback) {
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
                Retrofit2RuntimeTransport.this.lambda$sendPushToken$45$Retrofit2RuntimeTransport(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        }).start();
    }

    public /* synthetic */ void lambda$sendPushToken$45$Retrofit2RuntimeTransport(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback networkOperationCallback) {
        Call<BaseResponse> sendPushToken = this.serviceInterfaceProvider.getSendPushTokenApi(fragmentBuilder_BindHmlOperatingBankFragment).sendPushToken(str, str2, str3, baseRequest);
        FragmentBuilder_BindManageNotificationFragment fragmentBuilder_BindManageNotificationFragment = FragmentBuilder_BindManageNotificationFragment.SEND_PUSH_TOKEN;
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str3;
        objArr[2] = str2;
        objArr[3] = baseRequest != null ? baseRequest.toString() : null;
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindManageNotificationFragment, objArr);
        sendPushToken.enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback, FragmentBuilder_BindManageNotificationFragment.RECEIVE_PUSH_TOKEN));
    }

    public void sendAnalyticsData(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback) {
        new Thread(new Runnable(fragmentBuilder_BindHmlOperatingBankFragment, str, str3, str2, baseRequest, networkOperationCallback) {
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
                Retrofit2RuntimeTransport.this.lambda$sendAnalyticsData$46$Retrofit2RuntimeTransport(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        }).start();
    }

    public /* synthetic */ void lambda$sendAnalyticsData$46$Retrofit2RuntimeTransport(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback networkOperationCallback) {
        Call<BaseResponse> sendCapturedData = this.serviceInterfaceProvider.getSendCapturedDataApi(fragmentBuilder_BindHmlOperatingBankFragment).sendCapturedData(str, str2, str3, baseRequest);
        FragmentBuilder_BindManageNotificationFragment fragmentBuilder_BindManageNotificationFragment = FragmentBuilder_BindManageNotificationFragment.SEND_POINT;
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str3;
        objArr[2] = str2;
        objArr[3] = baseRequest != null ? baseRequest.toString() : null;
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindManageNotificationFragment, objArr);
        sendCapturedData.enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback, FragmentBuilder_BindManageNotificationFragment.RECEIVE_POINT));
    }

    public void sendResponseForOptimizationPoint(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, ResponseForOptimizationPointsRequest responseForOptimizationPointsRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback) {
        new Thread(new Runnable(fragmentBuilder_BindHmlOperatingBankFragment, str, str2, str3, responseForOptimizationPointsRequest, networkOperationCallback) {
            private final /* synthetic */ FragmentBuilder_BindHmlOperatingBankFragment f$1;
            private final /* synthetic */ String f$2;
            private final /* synthetic */ String f$3;
            private final /* synthetic */ String f$4;
            private final /* synthetic */ ResponseForOptimizationPointsRequest f$5;
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
                Retrofit2RuntimeTransport.this.mo40638x65bff433(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        }).start();
    }

    /* renamed from: lambda$sendResponseForOptimizationPoint$47$Retrofit2RuntimeTransport */
    public /* synthetic */ void mo40638x65bff433(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, ResponseForOptimizationPointsRequest responseForOptimizationPointsRequest, NetworkOperationCallback networkOperationCallback) {
        Call<BaseResponse> sendResponseForOptimizationPointsWithTid = this.serviceInterfaceProvider.getResponseForOptimizationPointsApi(fragmentBuilder_BindHmlOperatingBankFragment).sendResponseForOptimizationPointsWithTid(str, str2, str3, responseForOptimizationPointsRequest);
        FragmentBuilder_BindManageNotificationFragment fragmentBuilder_BindManageNotificationFragment = FragmentBuilder_BindManageNotificationFragment.SEND_OPTIMIZATION_RESPONSE;
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = str3;
        objArr[3] = responseForOptimizationPointsRequest != null ? responseForOptimizationPointsRequest.toString() : null;
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindManageNotificationFragment, objArr);
        sendResponseForOptimizationPointsWithTid.enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback, FragmentBuilder_BindManageNotificationFragment.RECEIVE_OPTIMIZATION_RESPONSE));
    }

    public void sendInteractionProperties(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, PropertiesRequest propertiesRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback) {
        new Thread(new Runnable(fragmentBuilder_BindHmlOperatingBankFragment, propertiesRequest, str, str2, str3, networkOperationCallback) {
            private final /* synthetic */ FragmentBuilder_BindHmlOperatingBankFragment f$1;
            private final /* synthetic */ PropertiesRequest f$2;
            private final /* synthetic */ String f$3;
            private final /* synthetic */ String f$4;
            private final /* synthetic */ String f$5;
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
                Retrofit2RuntimeTransport.this.lambda$sendInteractionProperties$48$Retrofit2RuntimeTransport(this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, this.f$6);
            }
        }).start();
    }

    public /* synthetic */ void lambda$sendInteractionProperties$48$Retrofit2RuntimeTransport(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, PropertiesRequest propertiesRequest, String str, String str2, String str3, NetworkOperationCallback networkOperationCallback) {
        Call<BaseResponse> call;
        PropertiesApi propertiesApi = this.serviceInterfaceProvider.getPropertiesApi(fragmentBuilder_BindHmlOperatingBankFragment);
        if (propertiesRequest == null || propertiesRequest.getTimestamp() == null || propertiesRequest.getTimestamp().longValue() <= 0) {
            if (propertiesRequest != null) {
                propertiesRequest.voidTimestamp();
            }
            call = propertiesApi.sendProperties(str, str2, str3, propertiesRequest);
        } else {
            HashMap hashMap = new HashMap();
            hashMap.put(ServiceConstants.HEADER_X_ONE_TIMESTAMP, propertiesRequest.getTimestamp());
            propertiesRequest.voidTimestamp();
            call = propertiesApi.sendProperties(hashMap, str, str2, str3, propertiesRequest);
        }
        FragmentBuilder_BindManageNotificationFragment fragmentBuilder_BindManageNotificationFragment = FragmentBuilder_BindManageNotificationFragment.SEND_INTERACTION_PROPERTIES;
        Object[] objArr = new Object[4];
        objArr[0] = str;
        objArr[1] = str2;
        objArr[2] = str3;
        objArr[3] = propertiesRequest != null ? propertiesRequest.toString() : null;
        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(fragmentBuilder_BindManageNotificationFragment, objArr);
        call.enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback, FragmentBuilder_BindManageNotificationFragment.RECEIVE_INTERACTION_PROPERTIES));
    }
}
