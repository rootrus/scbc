package com.thunderhead.connectivity.transport.retrofitv2;

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
import com.thunderhead.connectivity.GenericNetworkResponse;
import com.thunderhead.connectivity.NetworkOperationCallback;
import com.thunderhead.connectivity.OneDesignTimeApi;
import com.thunderhead.connectivity.transport.retrofitv2.Retrofit2Transport;
import java.io.IOException;
import java.util.Map;
import p040o.MyECouponActivity_ViewBinding;

public class Retrofit2DesigntimeTransport extends Retrofit2Transport implements OneDesignTimeApi {
    public Retrofit2DesigntimeTransport(ServiceInterfaceProvider serviceInterfaceProvider) {
        super(serviceInterfaceProvider);
    }

    public void loadInteractionContext(final String str, final NetworkOperationCallback<InteractionRegionResponse> networkOperationCallback) {
        new Thread(new Runnable() {
            public void run() {
                Retrofit2DesigntimeTransport.this.serviceInterfaceProvider.getInteractionContextApi().getInteractionContext(str).enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback));
            }
        }).start();
    }

    public void createInteractionRegion(final Map<String, String> map, final NetworkOperationCallback<InteractionRegionResponse> networkOperationCallback) {
        new Thread(new Runnable() {
            public void run() {
                Retrofit2DesigntimeTransport.this.serviceInterfaceProvider.getCreateInteractionRegionApi().createInteractionRegion(map).enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback));
            }
        }).start();
    }

    public void editInteractionName(String str, String str2, String str3, NetworkOperationCallback<InteractionRegionResponse> networkOperationCallback) {
        final String str4 = str;
        final String str5 = str2;
        final String str6 = str3;
        final NetworkOperationCallback<InteractionRegionResponse> networkOperationCallback2 = networkOperationCallback;
        new Thread(new Runnable() {
            public void run() {
                Retrofit2DesigntimeTransport.this.serviceInterfaceProvider.getEditInteractionRegionNameApi().editInteractionName(str4, str5, str6).enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback2));
            }
        }).start();
    }

    public void createTrackingPoint(final AddTrackingPointRequest addTrackingPointRequest, final NetworkOperationCallback<AddEditTrackingPointResponse> networkOperationCallback) {
        new Thread(new Runnable() {
            public void run() {
                Retrofit2DesigntimeTransport.this.serviceInterfaceProvider.getAddTrackingPointApi().addOnLoadTrackingPoint(addTrackingPointRequest).enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback));
            }
        }).start();
    }

    public void updateTrackingPoint(final String str, final EditTrackingPointRequest editTrackingPointRequest, final NetworkOperationCallback<AddEditTrackingPointResponse> networkOperationCallback) {
        new Thread(new Runnable() {
            public void run() {
                Retrofit2DesigntimeTransport.this.serviceInterfaceProvider.getEditTrackingPointApi().updateTrackingPoint(str, editTrackingPointRequest).enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback));
            }
        }).start();
    }

    public void deleteTrackingPoint(final String str, final NetworkOperationCallback<AddEditTrackingPointResponse> networkOperationCallback) {
        new Thread(new Runnable() {
            public void run() {
                Retrofit2DesigntimeTransport.this.serviceInterfaceProvider.getEditTrackingPointApi().deleteTrackingPoint(str).enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback));
            }
        }).start();
    }

    public void addCapturePoint(final AddEditCapturePointRequest addEditCapturePointRequest, final NetworkOperationCallback<AddEditCapturePointResponse> networkOperationCallback) {
        new Thread(new Runnable() {
            public void run() {
                Retrofit2DesigntimeTransport.this.serviceInterfaceProvider.getAddCapturePointApi().addCapturePoint(addEditCapturePointRequest).enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback));
            }
        }).start();
    }

    public void updateCapturePoint(final String str, final AddEditCapturePointRequest addEditCapturePointRequest, final NetworkOperationCallback<AddEditCapturePointResponse> networkOperationCallback) {
        new Thread(new Runnable() {
            public void run() {
                Retrofit2DesigntimeTransport.this.serviceInterfaceProvider.getEditCapturePointApi().updateCapturePoint(str, addEditCapturePointRequest).enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback));
            }
        }).start();
    }

    public void deleteCapturePoint(final String str, final NetworkOperationCallback<AddEditCapturePointResponse> networkOperationCallback) {
        new Thread(new Runnable() {
            public void run() {
                Retrofit2DesigntimeTransport.this.serviceInterfaceProvider.getEditCapturePointApi().deleteCapturePoint(str).enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback));
            }
        }).start();
    }

    public void loadAvailableReleases(final NetworkOperationCallback<GetAllReleasesResponse> networkOperationCallback) {
        new Thread(new Runnable() {
            public void run() {
                Retrofit2DesigntimeTransport.this.serviceInterfaceProvider.getAllReleasesApi().loadAllAvailableReleases().enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback));
            }
        }).start();
    }

    public void loadPropositions(final NetworkOperationCallback<PropositionResponse> networkOperationCallback) {
        new Thread(new Runnable() {
            public void run() {
                Retrofit2DesigntimeTransport.this.serviceInterfaceProvider.getPropositionsApi().getProposition().enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback));
            }
        }).start();
    }

    public void loadDataAttributes(final NetworkOperationCallback<DataAttributesListResponse> networkOperationCallback) {
        new Thread(new Runnable() {
            public void run() {
                Retrofit2DesigntimeTransport.this.serviceInterfaceProvider.getDataAttributesListApi().getList().enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback));
            }
        }).start();
    }

    public void loadActivityTypes(final NetworkOperationCallback<ActivityTypesResponse> networkOperationCallback) {
        new Thread(new Runnable() {
            public void run() {
                Retrofit2DesigntimeTransport.this.serviceInterfaceProvider.getActivityTypesApi().getActivityTypes().enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback));
            }
        }).start();
    }

    public void createNewDataAttribute(final AddNewDataAttributeRequest addNewDataAttributeRequest, final String str, final NetworkOperationCallback<AddNewDataAttributeResponse> networkOperationCallback) {
        new Thread(new Runnable() {
            public void run() {
                Retrofit2DesigntimeTransport.this.serviceInterfaceProvider.getAddNewDataAttributeApi().addNewDataAttribute(addNewDataAttributeRequest, str).enqueue(new Retrofit2Transport.BypassCallback(networkOperationCallback));
            }
        }).start();
    }

    public GenericNetworkResponse authenticate(String str, String str2) {
        try {
            return new Retrofit2GenericResponse(this.serviceInterfaceProvider.getAuthenticationApi().authentication(str, str2).execute());
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Retrofit 2 transport: Failed to execute authentication request ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            return new Retrofit2GenericResponse(new Rv2NetworkOperationError((Throwable) e));
        }
    }

    public GenericNetworkResponse<WorkspaceResponse> getWorkspaceId(String str) {
        try {
            return new Retrofit2GenericResponse(this.serviceInterfaceProvider.getWorkspaceApi().getWorkspace(str).execute());
        } catch (IOException e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Retrofit 2 transport: Failed to retrieve workspaceId ");
            sb.append(e.getMessage());
            MyECouponActivity_ViewBinding.write(sb.toString());
            Retrofit2GenericResponse retrofit2GenericResponse = new Retrofit2GenericResponse(new Rv2NetworkOperationError((Throwable) e));
            e.printStackTrace();
            return retrofit2GenericResponse;
        }
    }
}
