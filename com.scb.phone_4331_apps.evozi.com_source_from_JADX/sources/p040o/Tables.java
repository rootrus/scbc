package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import p040o.SignedBytes;

/* renamed from: o.Tables */
final class Tables implements findFragmentByWho {
    private final /* synthetic */ FundFactSheetActivity read;

    Tables(FundFactSheetActivity fundFactSheetActivity) {
        this.read = fundFactSheetActivity;
    }

    public final /* synthetic */ Object IconCompatParcelizer(Object obj) {
        return this.read.invoke(obj);
    }

    /* renamed from: o.Tables$AbstractCell */
    public final class AbstractCell extends constrainedListMultimap {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public AbstractCell(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
            onGetStartedClick.write((Object) resources, "resources");
            onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        }

        public final readElement MediaBrowserCompat$CustomActionResultReceiver(setOnPlaceSelectedListener setonplaceselectedlistener) {
            onGetStartedClick.write((Object) setonplaceselectedlistener, "domain");
            String IconCompatParcelizer = IconCompatParcelizer("dd MMM yyyy - HH:mm", setonplaceselectedlistener.IconCompatParcelizer);
            onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "transformToDateMonthYear…e(domain.requestDatetime)");
            String string = this.MediaBrowserCompat$CustomActionResultReceiver.getString(Iterables$3$MediaBrowserCompat$MediaItem.reference_id, new Object[]{setonplaceselectedlistener.read});
            onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.reference_id, domain.requestID)");
            return new readElement(IconCompatParcelizer, string);
        }
    }

    /* renamed from: o.Tables$ImmutableCell */
    public final class ImmutableCell extends constrainedListMultimap {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public ImmutableCell(Resources resources, SharedPreferences sharedPreferences) {
            super(resources, sharedPreferences);
            onGetStartedClick.write((Object) resources, "resources");
            onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        }

        /* renamed from: o.Tables$ImmutableCell$write */
        public static final class write implements findFragmentByWho {
            private final /* synthetic */ shouldShowCancelButton read;

            private write() {
            }

            public /* synthetic */ write(shouldShowCancelButton shouldshowcancelbutton) {
                this.read = shouldshowcancelbutton;
            }

            public final Object IconCompatParcelizer(Object obj) {
                useTextGlyphs usetextglyphs = (useTextGlyphs) obj;
                return new C4739h_(usetextglyphs.read, usetextglyphs.MediaDescriptionCompat, usetextglyphs.RatingCompat, usetextglyphs.MediaBrowserCompat$MediaItem, usetextglyphs.MediaBrowserCompat$SearchResultReceiver, usetextglyphs.MediaBrowserCompat$CustomActionResultReceiver, usetextglyphs.IconCompatParcelizer, usetextglyphs.MediaBrowserCompat$ItemReceiver, usetextglyphs.write);
            }
        }
    }

    /* renamed from: o.Tables$TransposeTable */
    public final class TransposeTable extends SignedBytes.LexicographicalComparator {

        /* renamed from: o.Tables$TransposeTable$CellSet */
        public final class CellSet extends constrainedListMultimap {
            @HmlPinActivity
            public CellSet(Resources resources, SharedPreferences sharedPreferences) {
                super(resources, sharedPreferences);
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        @HmlPinActivity
        public TransposeTable(Resources resources, SharedPreferences sharedPreferences, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
            super(resources, sharedPreferences, str);
            onGetStartedClick.write((Object) resources, "resources");
            onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
            onGetStartedClick.write((Object) str, "baseAssetsURL");
        }
    }
}
