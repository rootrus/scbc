package com.thunderhead.connectivity.transport.retrofitv2;

import com.thunderhead.android.infrastructure.features.interactions.allowedinteractions.AllowedInteractionsApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.AddCapturePointApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.AddNewDataAttributeApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.AddTrackingPointApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.AuthenticationApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.CapturedDataApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.CreateInteractionRegionApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.EditCapturePointApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.EditInteractionRegionNameApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.EditTrackingPointApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.GetActivityTypesApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.GetAllReleasesApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.GetDataAttributesListApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.GetInteractionContextApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.GetPropositionsApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.GetWorkspaceApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.InteractionApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.PropertiesApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.PushTokenApi;
import com.thunderhead.connectivity.transport.retrofitv2.web.ResponseForOptimizationPointsApi;
import p040o.FragmentBuilder_BindHmlOperatingBankFragment;

public interface ServiceInterfaceProvider {
    GetActivityTypesApi getActivityTypesApi();

    AddCapturePointApi getAddCapturePointApi();

    AddNewDataAttributeApi getAddNewDataAttributeApi();

    AddTrackingPointApi getAddTrackingPointApi();

    GetAllReleasesApi getAllReleasesApi();

    AllowedInteractionsApi getAllowedInteractionsApi();

    AuthenticationApi getAuthenticationApi();

    CreateInteractionRegionApi getCreateInteractionRegionApi();

    GetDataAttributesListApi getDataAttributesListApi();

    EditCapturePointApi getEditCapturePointApi();

    EditInteractionRegionNameApi getEditInteractionRegionNameApi();

    EditTrackingPointApi getEditTrackingPointApi();

    InteractionApi getInteractionApi(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment);

    GetInteractionContextApi getInteractionContextApi();

    PropertiesApi getPropertiesApi(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment);

    GetPropositionsApi getPropositionsApi();

    ResponseForOptimizationPointsApi getResponseForOptimizationPointsApi(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment);

    CapturedDataApi getSendCapturedDataApi(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment);

    PushTokenApi getSendPushTokenApi(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment);

    GetWorkspaceApi getWorkspaceApi();
}
