package com.thunderhead.connectivity;

import com.thunderhead.android.infrastructure.server.requests.AddEditCapturePointRequest;
import com.thunderhead.android.infrastructure.server.requests.AddNewDataAttributeRequest;
import com.thunderhead.android.infrastructure.server.requests.AddTrackingPointRequest;
import com.thunderhead.android.infrastructure.server.requests.EditTrackingPointRequest;
import com.thunderhead.android.infrastructure.server.responses.ActivityTypesResponse;
import com.thunderhead.android.infrastructure.server.responses.AddEditCapturePointResponse;
import com.thunderhead.android.infrastructure.server.responses.AddEditTrackingPointResponse;
import com.thunderhead.android.infrastructure.server.responses.AddNewDataAttributeResponse;
import com.thunderhead.android.infrastructure.server.responses.DataAttributesListResponse;
import com.thunderhead.android.infrastructure.server.responses.GetAllReleasesResponse;
import com.thunderhead.android.infrastructure.server.responses.InteractionRegionResponse;
import com.thunderhead.android.infrastructure.server.responses.PropositionResponse;
import com.thunderhead.android.infrastructure.server.responses.WorkspaceResponse;
import java.util.Map;

public interface OneDesignTimeApi {
    void addCapturePoint(AddEditCapturePointRequest addEditCapturePointRequest, NetworkOperationCallback<AddEditCapturePointResponse> networkOperationCallback);

    GenericNetworkResponse authenticate(String str, String str2);

    void createInteractionRegion(Map<String, String> map, NetworkOperationCallback<InteractionRegionResponse> networkOperationCallback);

    void createNewDataAttribute(AddNewDataAttributeRequest addNewDataAttributeRequest, String str, NetworkOperationCallback<AddNewDataAttributeResponse> networkOperationCallback);

    void createTrackingPoint(AddTrackingPointRequest addTrackingPointRequest, NetworkOperationCallback<AddEditTrackingPointResponse> networkOperationCallback);

    void deleteCapturePoint(String str, NetworkOperationCallback<AddEditCapturePointResponse> networkOperationCallback);

    void deleteTrackingPoint(String str, NetworkOperationCallback<AddEditTrackingPointResponse> networkOperationCallback);

    void editInteractionName(String str, String str2, String str3, NetworkOperationCallback<InteractionRegionResponse> networkOperationCallback);

    GenericNetworkResponse<WorkspaceResponse> getWorkspaceId(String str);

    void loadActivityTypes(NetworkOperationCallback<ActivityTypesResponse> networkOperationCallback);

    void loadAvailableReleases(NetworkOperationCallback<GetAllReleasesResponse> networkOperationCallback);

    void loadDataAttributes(NetworkOperationCallback<DataAttributesListResponse> networkOperationCallback);

    void loadInteractionContext(String str, NetworkOperationCallback<InteractionRegionResponse> networkOperationCallback);

    void loadPropositions(NetworkOperationCallback<PropositionResponse> networkOperationCallback);

    void updateCapturePoint(String str, AddEditCapturePointRequest addEditCapturePointRequest, NetworkOperationCallback<AddEditCapturePointResponse> networkOperationCallback);

    void updateTrackingPoint(String str, EditTrackingPointRequest editTrackingPointRequest, NetworkOperationCallback<AddEditTrackingPointResponse> networkOperationCallback);
}
