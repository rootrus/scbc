package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;

/* renamed from: o.NullsLastOrdering */
public final class NullsLastOrdering extends constrainedListMultimap {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public NullsLastOrdering(Resources resources, SharedPreferences sharedPreferences) {
        super(resources, sharedPreferences);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
    }

    @HmlSetNTBPinActivity
    /* renamed from: o.NullsLastOrdering$write */
    public static final class write {
        private write() {
        }

        @HmlPinActivity
        public write(FragmentBuilder_BindTransferInstallmentReviewBottomFragment fragmentBuilder_BindTransferInstallmentReviewBottomFragment) {
            onGetStartedClick.write((Object) fragmentBuilder_BindTransferInstallmentReviewBottomFragment, "feeMapper");
        }
    }
}
