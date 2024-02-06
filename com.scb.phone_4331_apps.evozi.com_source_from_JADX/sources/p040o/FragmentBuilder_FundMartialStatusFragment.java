package p040o;

import com.thunderhead.android.infrastructure.features.touchpoints.retrofit2.Retrofit2TouchpointsService;
import com.thunderhead.android.infrastructure.server.requests.CreateTouchpointRequest;

/* renamed from: o.FragmentBuilder_FundMartialStatusFragment */
public final class FragmentBuilder_FundMartialStatusFragment implements NtbHmlApiBasedDocumentInstructionsActivity {
    private final Retrofit2TouchpointsService write;

    public FragmentBuilder_FundMartialStatusFragment(Retrofit2TouchpointsService retrofit2TouchpointsService) {
        this.write = retrofit2TouchpointsService;
    }

    public final void write(FragmentBuilder_BindIncomingFragment fragmentBuilder_BindIncomingFragment, FragmentBuilder_BindHowToAddFavouriteTopUpFragment<FragmentBuilder_BindLandingFragment<Exception>> fragmentBuilder_BindHowToAddFavouriteTopUpFragment, FragmentBuilder_BindHowToAddFavouriteTopUpFragment<FragmentBuilder_BindJuristicRequestFormSuccessfulFragment<FragmentBuilder_BindInformationTabFragment>> fragmentBuilder_BindHowToAddFavouriteTopUpFragment2) {
        try {
            this.write.create(new CreateTouchpointRequest("MOBILE", fragmentBuilder_BindIncomingFragment.read, fragmentBuilder_BindIncomingFragment.MediaBrowserCompat$ItemReceiver)).enqueue(new FragmentBuilder_BindWorkAddressFragment(fragmentBuilder_BindHowToAddFavouriteTopUpFragment, fragmentBuilder_BindHowToAddFavouriteTopUpFragment2));
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(new Exception(e));
            FragmentBuilder_BindMileageQuantitySelectionFragment fragmentBuilder_BindMileageQuantitySelectionFragment = FragmentBuilder_BindMileageQuantitySelectionFragment.RETROFIT2_ERROR;
            fragmentBuilder_BindHowToAddFavouriteTopUpFragment.MediaBrowserCompat$CustomActionResultReceiver(new FragmentBuilder_BindLandingFragment(e));
        }
    }
}
