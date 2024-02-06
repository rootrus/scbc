package com.thunderhead.connectivity;

import com.thunderhead.android.infrastructure.server.requests.BaseRequest;
import com.thunderhead.android.infrastructure.server.requests.PropertiesRequest;
import com.thunderhead.android.infrastructure.server.requests.ResponseForOptimizationPointsRequest;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import p040o.FragmentBuilder_BindHmlOperatingBankFragment;

public interface OneRuntimeServiceApi {
    void flushNetworkConnectionPools();

    GenericNetworkResponse getOptimizationImageInputStream(String str);

    void sendAnalyticsData(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback);

    void sendBaseTouchpointProperties(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, PropertiesRequest propertiesRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback);

    void sendInteraction(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback);

    void sendInteractionProperties(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, PropertiesRequest propertiesRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback);

    void sendOfflineInteraction(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback);

    void sendPushToken(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, BaseRequest baseRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback);

    void sendResponseForOptimizationPoint(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, String str, String str2, String str3, ResponseForOptimizationPointsRequest responseForOptimizationPointsRequest, NetworkOperationCallback<BaseResponse> networkOperationCallback);
}
