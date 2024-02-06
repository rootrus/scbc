package com.thunderhead.connectivity.transport.retrofitv2;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.thunderhead.android.infrastructure.features.interactions.allowedinteractions.AllowedInteractionsApi;
import com.thunderhead.connectivity.transport.OkClientFactory;
import com.thunderhead.connectivity.transport.retrofitv2.oauth.Retrofit2HttpOAuthConsumer;
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
import p040o.C6560xb325287a;
import p040o.FragmentBuilder_BindHmlIssuerLandingFragment;
import p040o.FragmentBuilder_BindHmlOperatingBankFragment;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;
import p040o.FragmentBuilder_BindOnboardingInputAddressFragment;
import p040o.FragmentBuilder_BindQuantityPointsFragment;
import p040o.FragmentBuilder_BindQuickPromptPayFragment;
import p040o.HomeActivity;
import p040o.OnBoardingTutorialActivity;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ServiceInterfaceProviderImpl implements ServiceInterfaceProvider {
    private final Gson allowedInteractionsGson = new GsonBuilder().registerTypeAdapter(FragmentBuilder_BindQuickPromptPayFragment.class, new FragmentBuilder_BindQuantityPointsFragment()).setLenient().create();
    private Retrofit2HttpOAuthConsumer oneRetrofit2HttpOAuthConsumer;
    private FragmentBuilder_BindJuristicOnboardingLandingFragment.read stateChangeSubscription;
    private FragmentBuilder_BindHmlOperatingBankFragment thinstance;

    public ServiceInterfaceProviderImpl(FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        this.stateChangeSubscription = HomeActivity.write(fragmentBuilder_BindJuristicOnboardingLandingFragment, new C6560xb325287a() {
            public final void onStateChange(Object obj) {
                ServiceInterfaceProviderImpl.this.updateState((OnBoardingTutorialActivity) obj);
            }
        });
    }

    /* access modifiers changed from: private */
    public void updateState(OnBoardingTutorialActivity onBoardingTutorialActivity) {
        String read = FragmentBuilder_BindOnboardingInputAddressFragment.read(onBoardingTutorialActivity);
        String write = FragmentBuilder_BindOnboardingInputAddressFragment.write(onBoardingTutorialActivity);
        this.thinstance = FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$MediaItem(onBoardingTutorialActivity);
        Retrofit2HttpOAuthConsumer retrofit2HttpOAuthConsumer = this.oneRetrofit2HttpOAuthConsumer;
        if (retrofit2HttpOAuthConsumer == null || !write.equals(retrofit2HttpOAuthConsumer.getConsumerKey()) || !read.equals(this.oneRetrofit2HttpOAuthConsumer.getConsumerSecret())) {
            Retrofit2HttpOAuthConsumer retrofit2HttpOAuthConsumer2 = new Retrofit2HttpOAuthConsumer(write, read);
            this.oneRetrofit2HttpOAuthConsumer = retrofit2HttpOAuthConsumer2;
            OkClientFactory.createRuntimeHttpClient(retrofit2HttpOAuthConsumer2);
        }
    }

    private Retrofit getRuntimeRetrofit(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        if (fragmentBuilder_BindHmlOperatingBankFragment == null) {
            fragmentBuilder_BindHmlOperatingBankFragment = this.thinstance;
        }
        return new Retrofit.Builder().baseUrl(fragmentBuilder_BindHmlOperatingBankFragment.write.toString()).addConverterFactory(GsonConverterFactory.create()).client(OkClientFactory.getRuntimeHttpClient(this.oneRetrofit2HttpOAuthConsumer)).build();
    }

    private Retrofit getDesignTimeRetrofit() {
        return new Retrofit.Builder().baseUrl(this.thinstance.write.toString()).addConverterFactory(GsonConverterFactory.create()).client(FragmentBuilder_BindHmlIssuerLandingFragment.ParcelableVolumeInfo()).build();
    }

    public AllowedInteractionsApi getAllowedInteractionsApi() {
        return (AllowedInteractionsApi) new Retrofit.Builder().baseUrl(this.thinstance.write.toString()).addConverterFactory(GsonConverterFactory.create(this.allowedInteractionsGson)).client(OkClientFactory.getAllowedInteractionsApiClient()).build().create(AllowedInteractionsApi.class);
    }

    public InteractionApi getInteractionApi(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        return (InteractionApi) getRuntimeRetrofit(fragmentBuilder_BindHmlOperatingBankFragment).create(InteractionApi.class);
    }

    public PropertiesApi getPropertiesApi(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        return (PropertiesApi) getRuntimeRetrofit(fragmentBuilder_BindHmlOperatingBankFragment).create(PropertiesApi.class);
    }

    public ResponseForOptimizationPointsApi getResponseForOptimizationPointsApi(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        return (ResponseForOptimizationPointsApi) getRuntimeRetrofit(fragmentBuilder_BindHmlOperatingBankFragment).create(ResponseForOptimizationPointsApi.class);
    }

    public CapturedDataApi getSendCapturedDataApi(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        return (CapturedDataApi) getRuntimeRetrofit(fragmentBuilder_BindHmlOperatingBankFragment).create(CapturedDataApi.class);
    }

    public PushTokenApi getSendPushTokenApi(FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        return (PushTokenApi) getRuntimeRetrofit(fragmentBuilder_BindHmlOperatingBankFragment).create(PushTokenApi.class);
    }

    public AuthenticationApi getAuthenticationApi() {
        return (AuthenticationApi) getDesignTimeRetrofit().create(AuthenticationApi.class);
    }

    public GetWorkspaceApi getWorkspaceApi() {
        return (GetWorkspaceApi) getDesignTimeRetrofit().create(GetWorkspaceApi.class);
    }

    public GetPropositionsApi getPropositionsApi() {
        return (GetPropositionsApi) getDesignTimeRetrofit().create(GetPropositionsApi.class);
    }

    public GetDataAttributesListApi getDataAttributesListApi() {
        return (GetDataAttributesListApi) getDesignTimeRetrofit().create(GetDataAttributesListApi.class);
    }

    public CreateInteractionRegionApi getCreateInteractionRegionApi() {
        return (CreateInteractionRegionApi) getDesignTimeRetrofit().create(CreateInteractionRegionApi.class);
    }

    public GetInteractionContextApi getInteractionContextApi() {
        return (GetInteractionContextApi) getDesignTimeRetrofit().create(GetInteractionContextApi.class);
    }

    public GetActivityTypesApi getActivityTypesApi() {
        return (GetActivityTypesApi) getDesignTimeRetrofit().create(GetActivityTypesApi.class);
    }

    public AddTrackingPointApi getAddTrackingPointApi() {
        return (AddTrackingPointApi) getDesignTimeRetrofit().create(AddTrackingPointApi.class);
    }

    public EditTrackingPointApi getEditTrackingPointApi() {
        return (EditTrackingPointApi) getDesignTimeRetrofit().create(EditTrackingPointApi.class);
    }

    public EditInteractionRegionNameApi getEditInteractionRegionNameApi() {
        return (EditInteractionRegionNameApi) getDesignTimeRetrofit().create(EditInteractionRegionNameApi.class);
    }

    public AddCapturePointApi getAddCapturePointApi() {
        return (AddCapturePointApi) getDesignTimeRetrofit().create(AddCapturePointApi.class);
    }

    public EditCapturePointApi getEditCapturePointApi() {
        return (EditCapturePointApi) getDesignTimeRetrofit().create(EditCapturePointApi.class);
    }

    public AddNewDataAttributeApi getAddNewDataAttributeApi() {
        return (AddNewDataAttributeApi) getDesignTimeRetrofit().create(AddNewDataAttributeApi.class);
    }

    public GetAllReleasesApi getAllReleasesApi() {
        return (GetAllReleasesApi) getDesignTimeRetrofit().create(GetAllReleasesApi.class);
    }

    /* access modifiers changed from: protected */
    public void finalize() throws Throwable {
        FragmentBuilder_BindJuristicOnboardingLandingFragment.read read = this.stateChangeSubscription;
        if (read != null) {
            read.read();
        }
        super.finalize();
    }
}
