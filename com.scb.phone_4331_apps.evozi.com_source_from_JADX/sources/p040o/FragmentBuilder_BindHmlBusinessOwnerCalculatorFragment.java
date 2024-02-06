package p040o;

import android.app.Activity;
import com.thunderhead.android.infrastructure.server.requests.AddEditCapturePointRequest;
import com.thunderhead.android.infrastructure.server.requests.AddNewDataAttributeRequest;
import com.thunderhead.android.infrastructure.server.requests.EditTrackingPointRequest;
import com.thunderhead.android.infrastructure.server.responses.AddEditCapturePointResponse;
import com.thunderhead.android.infrastructure.server.responses.AddEditTrackingPointResponse;
import com.thunderhead.android.infrastructure.server.responses.AddNewDataAttributeResponse;
import com.thunderhead.connectivity.NetworkOperationCallback;
import com.thunderhead.connectivity.NetworkOperationError;
import com.thunderhead.connectivity.OneDesignTimeApi;
import java.net.URI;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment */
public final class FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment implements OnBoardingTutorialActivity_ViewBinding {
    public ConfirmRedemptionActivity IconCompatParcelizer = new DeejungTransferInstallmentsConfirmationActivity_ViewBinding();
    public Activity MediaBrowserCompat$CustomActionResultReceiver;
    public OneDesignTimeApi MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$SearchResultReceiver;
    public URI MediaDescriptionCompat;
    private FragmentBuilder_BindJuristicOnboardingLandingFragment.read RatingCompat = HomeActivity.write(FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView(), new FragmentBuilder_BindFundSwitchSearchListFragement(this));
    public UseCaseModule read;
    public final FragmentBuilder_BindHmlDocumentUploadFragment write = new FragmentBuilder_BindHmlDocumentSubmissionFragment();

    FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment(UseCaseModule useCaseModule, OneDesignTimeApi oneDesignTimeApi) {
        this.read = useCaseModule;
        this.MediaBrowserCompat$ItemReceiver = oneDesignTimeApi;
    }

    public final void write(FragmentBuilder_BindHmlNTBOfflineSuccessFragment fragmentBuilder_BindHmlNTBOfflineSuccessFragment, final FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment, final Activity activity) {
        EditTrackingPointRequest editTrackingPointRequest = new EditTrackingPointRequest(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.Keep);
        editTrackingPointRequest.setName(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.f3146x50fd9e4a);
        editTrackingPointRequest.setPath(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaSessionCompat$QueueItem);
        editTrackingPointRequest.setPropositionName(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.PlaybackStateCompat$CustomAction);
        editTrackingPointRequest.setPropositionId(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.setHasDecor);
        editTrackingPointRequest.setDataAdapterAttributeId(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$ItemReceiver);
        editTrackingPointRequest.setDataAdapterAttributeName(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$CustomActionResultReceiver);
        editTrackingPointRequest.setEventTypeName(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.write);
        editTrackingPointRequest.setEventTypeId(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.read);
        editTrackingPointRequest.setGoalCompletion(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$SearchResultReceiver);
        editTrackingPointRequest.setEnabled(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.IconCompatParcelizer);
        editTrackingPointRequest.setEnabled(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.IconCompatParcelizer);
        editTrackingPointRequest.setInteractionId(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaMetadataCompat);
        editTrackingPointRequest.setId(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.RatingCompat);
        C65393 r1 = new NetworkOperationCallback<AddEditTrackingPointResponse>() {
            public final /* synthetic */ void onSuccess(Object obj) {
                AddEditTrackingPointResponse addEditTrackingPointResponse = (AddEditTrackingPointResponse) obj;
                if (addEditTrackingPointResponse == null) {
                    fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.write(1, "Null response");
                } else if (addEditTrackingPointResponse.getData() == null) {
                    fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.write(1, "Data section of the response is empty");
                } else {
                    fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.read();
                }
            }

            public final void onFailure(NetworkOperationError networkOperationError) {
                Activity activity = FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.this.MediaBrowserCompat$CustomActionResultReceiver;
                Activity activity2 = activity;
                if (activity2 != null) {
                    activity = activity2;
                }
                FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.this.IconCompatParcelizer.read(activity, networkOperationError, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment);
            }
        };
        if (fragmentBuilder_BindHmlNTBOfflineSuccessFragment.MediaBrowserCompat$MediaItem) {
            this.MediaBrowserCompat$ItemReceiver.deleteTrackingPoint(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.RatingCompat, r1);
        } else {
            this.MediaBrowserCompat$ItemReceiver.updateTrackingPoint(fragmentBuilder_BindHmlNTBOfflineSuccessFragment.RatingCompat, editTrackingPointRequest, r1);
        }
    }

    public final void write(FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment, FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment, Activity activity) {
        AddEditCapturePointRequest write2 = write(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment);
        MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder();
        sb.append("Send add/edit capture point request:");
        sb.append(write2.toString());
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
        MediaBrowserCompat$CustomActionResultReceiver(write2, fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment, activity, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment);
    }

    public static AddEditCapturePointRequest write(FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment) {
        AddEditCapturePointRequest addEditCapturePointRequest = new AddEditCapturePointRequest();
        addEditCapturePointRequest.setName(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.Keep);
        addEditCapturePointRequest.setPath(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.setContentView);
        addEditCapturePointRequest.setEnabled(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaSessionCompat$QueueItem);
        addEditCapturePointRequest.setInteractionId(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.ParcelableVolumeInfo);
        addEditCapturePointRequest.setDataAdapterAttributeId(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaMetadataCompat);
        addEditCapturePointRequest.setElementType(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaDescriptionCompat);
        addEditCapturePointRequest.setDomainType("CUSTOMER_DATA");
        if (!fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.f3145x50fd9e4a) {
            addEditCapturePointRequest.setAttribute(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.write);
            addEditCapturePointRequest.setCaptureDelay(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaBrowserCompat$ItemReceiver);
            addEditCapturePointRequest.setCaptureType(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.RatingCompat);
            addEditCapturePointRequest.setPropositionId(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.AppCompatDialogFragment);
            addEditCapturePointRequest.setElementName(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaBrowserCompat$MediaItem);
            addEditCapturePointRequest.setTypeName(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.AppCompatDelegateImpl$ListMenuDecorView);
        }
        return addEditCapturePointRequest;
    }

    public final void read(FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment, FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment, AddNewDataAttributeRequest addNewDataAttributeRequest, int i, Activity activity) {
        if (this.MediaBrowserCompat$ItemReceiver != null) {
            final FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment2 = fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment;
            final FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment2 = fragmentBuilder_BindHmlDocumentUploadGuidelineFragment;
            final Activity activity2 = activity;
            final AddNewDataAttributeRequest addNewDataAttributeRequest2 = addNewDataAttributeRequest;
            final int i2 = i;
            this.MediaBrowserCompat$ItemReceiver.createNewDataAttribute(addNewDataAttributeRequest, fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaBrowserCompat$SearchResultReceiver, new NetworkOperationCallback<AddNewDataAttributeResponse>() {
                public final /* synthetic */ void onSuccess(Object obj) {
                    AddNewDataAttributeResponse addNewDataAttributeResponse = (AddNewDataAttributeResponse) obj;
                    fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment2.MediaBrowserCompat$ItemReceiver(addNewDataAttributeResponse.getData().getId());
                    fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment2.IconCompatParcelizer = addNewDataAttributeResponse.getData().getName();
                    FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.this.write(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment2, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment2, activity2);
                }

                public final void onFailure(NetworkOperationError networkOperationError) {
                    if (networkOperationError.getHttpStatusCode() == 409) {
                        AddNewDataAttributeRequest addNewDataAttributeRequest = addNewDataAttributeRequest2;
                        StringBuilder sb = new StringBuilder();
                        sb.append(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment2.Keep);
                        sb.append(" - ");
                        sb.append(i2);
                        addNewDataAttributeRequest.setName(sb.toString());
                        FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.this.read(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment2, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment2, addNewDataAttributeRequest2, i2 + 1, activity2);
                        return;
                    }
                    fragmentBuilder_BindHmlDocumentUploadGuidelineFragment2.write(networkOperationError.getHttpStatusCode(), networkOperationError.getMessage());
                    FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.this.IconCompatParcelizer.read(FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.this.MediaBrowserCompat$CustomActionResultReceiver, networkOperationError, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment2);
                }
            });
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AddEditCapturePointRequest addEditCapturePointRequest, FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment, final Activity activity, final FragmentBuilder_BindHmlDocumentUploadGuidelineFragment fragmentBuilder_BindHmlDocumentUploadGuidelineFragment) {
        C65428 r0 = new NetworkOperationCallback<AddEditCapturePointResponse>() {
            public final /* synthetic */ void onSuccess(Object obj) {
                AddEditCapturePointResponse addEditCapturePointResponse = (AddEditCapturePointResponse) obj;
                if (addEditCapturePointResponse == null) {
                    fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.write(1, "Null response");
                } else if (addEditCapturePointResponse.getData() == null) {
                    fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.write(1, "Data section of the response is empty");
                } else {
                    fragmentBuilder_BindHmlDocumentUploadGuidelineFragment.read();
                }
            }

            public final void onFailure(NetworkOperationError networkOperationError) {
                Activity activity = FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.this.MediaBrowserCompat$CustomActionResultReceiver;
                Activity activity2 = activity;
                if (activity2 != null) {
                    activity = activity2;
                }
                FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment.this.IconCompatParcelizer.read(activity, networkOperationError, fragmentBuilder_BindHmlDocumentUploadGuidelineFragment);
            }
        };
        if (fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.f3145x50fd9e4a) {
            this.MediaBrowserCompat$ItemReceiver.addCapturePoint(addEditCapturePointRequest, r0);
        } else if (fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaSessionCompat$ResultReceiverWrapper) {
            this.MediaBrowserCompat$ItemReceiver.deleteCapturePoint(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaSessionCompat$Token, r0);
        } else {
            this.MediaBrowserCompat$ItemReceiver.updateCapturePoint(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaSessionCompat$Token, addEditCapturePointRequest, r0);
        }
    }

    public final void disconnect() {
        FragmentBuilder_BindJuristicOnboardingLandingFragment.read read2 = this.RatingCompat;
        if (read2 != null) {
            read2.read();
        }
    }
}
