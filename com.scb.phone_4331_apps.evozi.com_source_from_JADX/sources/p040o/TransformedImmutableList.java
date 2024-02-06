package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.QueueFile;

/* renamed from: o.TransformedImmutableList */
final /* synthetic */ class TransformedImmutableList extends CheckEligibilityActivity_ViewBinding {
    public static final SCBSFormActivity write = new TransformedImmutableList();

    TransformedImmutableList() {
    }

    public final String getName() {
        return "sortSequence";
    }

    public final CheckSCBSEligibilityActivity getOwner() {
        return FundOnboardingLandingActivity_ViewBinding.write(ringRead.class);
    }

    public final String getSignature() {
        return "getSortSequence()I";
    }

    /* renamed from: o.TransformedImmutableList$TransformedView */
    public final class TransformedView extends constrainedSetMultimap<SupportPlaceAutocompleteFragment, QueueFile.ElementReader> {
        public final /* bridge */ /* synthetic */ Object MediaBrowserCompat$ItemReceiver(Object obj) {
            return MediaBrowserCompat$ItemReceiver((SupportPlaceAutocompleteFragment) obj);
        }

        @HmlPinActivity
        public TransformedView(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
        }

        public static QueueFile.ElementReader MediaBrowserCompat$ItemReceiver(SupportPlaceAutocompleteFragment supportPlaceAutocompleteFragment) {
            String str;
            QueueFile.ElementReader MediaBrowserCompat$ItemReceiver = QueueFile.ElementReader.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver.read = supportPlaceAutocompleteFragment.MediaBrowserCompat$CustomActionResultReceiver;
            MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = supportPlaceAutocompleteFragment.MediaBrowserCompat$ItemReceiver;
            if (supportPlaceAutocompleteFragment.IconCompatParcelizer() != null) {
                str = supportPlaceAutocompleteFragment.IconCompatParcelizer().MediaBrowserCompat$ItemReceiver;
            } else {
                str = "error";
            }
            MediaBrowserCompat$ItemReceiver.write = "1000".equals(str);
            return MediaBrowserCompat$ItemReceiver;
        }
    }

    public final Object IconCompatParcelizer(Object obj) {
        return Integer.valueOf(((ringRead) obj).MediaDescriptionCompat);
    }
}
