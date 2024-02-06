package p040o;

import android.view.View;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import java.util.List;

/* renamed from: o.FragmentBuilder_BindGiftSelectionFragment */
public final /* synthetic */ class FragmentBuilder_BindGiftSelectionFragment implements C6560xb325287a {
    private final /* synthetic */ FragmentBuilder_BindHmlIssuerInputFragment MediaBrowserCompat$CustomActionResultReceiver;

    public /* synthetic */ FragmentBuilder_BindGiftSelectionFragment(FragmentBuilder_BindHmlIssuerInputFragment fragmentBuilder_BindHmlIssuerInputFragment) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindHmlIssuerInputFragment;
    }

    public final void onStateChange(Object obj) {
        FragmentBuilder_BindHmlIssuerInputFragment fragmentBuilder_BindHmlIssuerInputFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        OnBoardingTutorialActivity onBoardingTutorialActivity = (OnBoardingTutorialActivity) obj;
        fragmentBuilder_BindHmlIssuerInputFragment.IconCompatParcelizer = FragmentBuilder_BindPreloadConfigFragment.MediaBrowserCompat$ItemReceiver(onBoardingTutorialActivity);
        fragmentBuilder_BindHmlIssuerInputFragment.MediaBrowserCompat$MediaItem = FragmentBuilder_BindTransferToOthersStep1Fragment.read(onBoardingTutorialActivity);
        fragmentBuilder_BindHmlIssuerInputFragment.MediaMetadataCompat = FragmentBuilder_BindTransferToOthersStep1Fragment.MediaBrowserCompat$ItemReceiver(onBoardingTutorialActivity);
        fragmentBuilder_BindHmlIssuerInputFragment.MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindTransferToOthersStep1Fragment.IconCompatParcelizer(onBoardingTutorialActivity);
        fragmentBuilder_BindHmlIssuerInputFragment.RatingCompat = FragmentBuilder_BindTouchPointWifiSettingsFragment.write(onBoardingTutorialActivity);
        String MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindTouchPointWifiSettingsFragment.MediaBrowserCompat$ItemReceiver(onBoardingTutorialActivity);
        if (!MediaBrowserCompat$ItemReceiver.equals(fragmentBuilder_BindHmlIssuerInputFragment.MediaBrowserCompat$SearchResultReceiver) && MediaBrowserCompat$ItemReceiver.isEmpty()) {
            for (String next : fragmentBuilder_BindHmlIssuerInputFragment.read.keySet()) {
                BaseResponse baseResponse = fragmentBuilder_BindHmlIssuerInputFragment.MediaSessionCompat$ResultReceiverWrapper.get(next);
                if (baseResponse != null) {
                    fragmentBuilder_BindHmlIssuerInputFragment.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(next, baseResponse.getCaptures(), fragmentBuilder_BindHmlIssuerInputFragment.write.write.get(next));
                    fragmentBuilder_BindHmlIssuerInputFragment.write.write(next, baseResponse);
                }
            }
            fragmentBuilder_BindHmlIssuerInputFragment.MediaSessionCompat$ResultReceiverWrapper.clear();
        } else if (!MediaBrowserCompat$ItemReceiver.equals(fragmentBuilder_BindHmlIssuerInputFragment.MediaBrowserCompat$SearchResultReceiver) && fragmentBuilder_BindHmlIssuerInputFragment.MediaBrowserCompat$CustomActionResultReceiver != null) {
            for (String next2 : fragmentBuilder_BindHmlIssuerInputFragment.read.keySet()) {
                BaseResponse baseResponse2 = fragmentBuilder_BindHmlIssuerInputFragment.MediaSessionCompat$ResultReceiverWrapper.get(next2);
                if (baseResponse2 != null) {
                    fragmentBuilder_BindHmlIssuerInputFragment.MediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(next2, baseResponse2.getCaptures(), fragmentBuilder_BindHmlIssuerInputFragment.write.write.get(next2));
                    fragmentBuilder_BindHmlIssuerInputFragment.write.write(next2, baseResponse2);
                }
            }
            fragmentBuilder_BindHmlIssuerInputFragment.MediaSessionCompat$ResultReceiverWrapper.clear();
            if (fragmentBuilder_BindHmlIssuerInputFragment.MediaBrowserCompat$MediaItem && !fragmentBuilder_BindHmlIssuerInputFragment.IconCompatParcelizer) {
                for (String IconCompatParcelizer : AlertController$RecycleListView.write(FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater(), (List<View>) fragmentBuilder_BindHmlIssuerInputFragment.read())) {
                    fragmentBuilder_BindHmlIssuerInputFragment.MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer(IconCompatParcelizer);
                }
            }
        }
        fragmentBuilder_BindHmlIssuerInputFragment.MediaBrowserCompat$SearchResultReceiver = MediaBrowserCompat$ItemReceiver;
    }
}
