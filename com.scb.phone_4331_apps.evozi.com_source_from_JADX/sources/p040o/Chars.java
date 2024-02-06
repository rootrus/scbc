package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.scb.phone.presentation.mapper.setting.ProfileSettingDisplayMapper;
import com.scb.phone.view.fragment.prepaid.traveltab.PrepaidTravelServicesTabFragment;
import p040o.Booleans;
import p040o.MapDifference;

/* renamed from: o.Chars */
public class Chars extends constrainedSetMultimap<PrepaidTravelServicesTabFragment.write, getDiskUsed> {
    public final /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
        return write((PrepaidTravelServicesTabFragment.write) obj, false);
    }

    @HmlPinActivity
    public Chars(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
    }

    /* renamed from: o.Chars$LexicographicalComparator */
    public final class LexicographicalComparator implements MileageQuantitySelectionActivity<ProfileSettingDisplayMapper> {
        public static void MediaBrowserCompat$ItemReceiver(ProfileSettingDisplayMapper profileSettingDisplayMapper, MapDifference.ValueDifference valueDifference) {
            profileSettingDisplayMapper.userInfoDisplayMapper = valueDifference;
        }

        public static void MediaBrowserCompat$CustomActionResultReceiver(ProfileSettingDisplayMapper profileSettingDisplayMapper, saturatedCast saturatedcast) {
            profileSettingDisplayMapper.profileItemMenuDisplayMapper = saturatedcast;
        }
    }

    /* renamed from: o.Chars$CharArrayAsList */
    public final class CharArrayAsList implements OPRStatusRewardsLandingActivity_ViewBinding<ProfileSettingDisplayMapper> {
        public static ProfileSettingDisplayMapper write(Resources resources, SharedPreferences sharedPreferences) {
            return new ProfileSettingDisplayMapper(resources, sharedPreferences);
        }

        public final /* synthetic */ Object get() {
            HmlReviewDocumentActivity hmlReviewDocumentActivity = null;
            ProfileSettingDisplayMapper profileSettingDisplayMapper = new ProfileSettingDisplayMapper((Resources) hmlReviewDocumentActivity.get(), (SharedPreferences) hmlReviewDocumentActivity.get());
            LexicographicalComparator.MediaBrowserCompat$ItemReceiver(profileSettingDisplayMapper, (MapDifference.ValueDifference) hmlReviewDocumentActivity.get());
            LexicographicalComparator.MediaBrowserCompat$CustomActionResultReceiver(profileSettingDisplayMapper, (saturatedCast) hmlReviewDocumentActivity.get());
            return profileSettingDisplayMapper;
        }
    }

    public final getDiskUsed write(PrepaidTravelServicesTabFragment.write write, boolean z) {
        return new getDiskUsed(IconCompatParcelizer("dd MMM yyyy", write.MediaBrowserCompat$ItemReceiver.plusDays(1)), write.MediaBrowserCompat$ItemReceiver, write.read, write.MediaBrowserCompat$CustomActionResultReceiver, MediaBrowserCompat$ItemReceiver(write.IconCompatParcelizer, new Booleans.BooleanArrayAsList(this)), z);
    }
}
