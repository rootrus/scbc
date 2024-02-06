package p040o;

import android.content.Context;
import android.os.Bundle;

/* renamed from: o.FragmentBuilder_BindScbsOnboardingReviewInformationFragment */
public final class FragmentBuilder_BindScbsOnboardingReviewInformationFragment {
    private static final FragmentBuilder_BindSecondaryTabsFragment read = read.read;
    private static final FragmentBuilder_BindSecondaryTabsFragment write = IconCompatParcelizer.read;

    /* renamed from: o.FragmentBuilder_BindScbsOnboardingReviewInformationFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer implements FragmentBuilder_BindSecondaryTabsFragment {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
        }

        public final /* synthetic */ Integer IconCompatParcelizer(Context context) {
            return 17170443;
        }
    }

    public static final FragmentBuilder_BindSecondaryTabsFragment IconCompatParcelizer() {
        return new FragmentBuilder_BindScheduleOnceFragment(read, write);
    }

    /* renamed from: o.FragmentBuilder_BindScbsOnboardingReviewInformationFragment$read */
    static final class read implements FragmentBuilder_BindSecondaryTabsFragment {
        public static final read read = new read();

        read() {
        }

        public final Integer IconCompatParcelizer(Context context) {
            if (context == null) {
                return null;
            }
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            int i = bundle != null ? bundle.getInt("com.google.firebase.messaging.default_notification_color", -1) : -1;
            if (i != -1) {
                return Integer.valueOf(i);
            }
            return null;
        }
    }
}
