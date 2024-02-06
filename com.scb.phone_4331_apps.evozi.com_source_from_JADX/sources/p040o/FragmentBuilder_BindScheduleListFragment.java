package p040o;

import android.content.Context;
import android.os.Bundle;

/* renamed from: o.FragmentBuilder_BindScheduleListFragment */
public final class FragmentBuilder_BindScheduleListFragment {
    private static final FragmentBuilder_BindSelectAccountFragment IconCompatParcelizer = C6766x63d9c603.MediaBrowserCompat$CustomActionResultReceiver;
    private static final FragmentBuilder_BindSelectAccountFragment MediaBrowserCompat$CustomActionResultReceiver = C6767x28d1f612.write;
    private static final FragmentBuilder_BindSelectAccountFragment MediaBrowserCompat$ItemReceiver = write.read;
    private static final FragmentBuilder_BindSelectAccountFragment read = read.write;

    public static final FragmentBuilder_BindSelectAccountFragment MediaBrowserCompat$ItemReceiver(int i) {
        if (i != 26) {
            return new FragmentBuilder_BindScbsSuitabilityAssessmentResultFragment(read, MediaBrowserCompat$CustomActionResultReceiver, IconCompatParcelizer);
        }
        return new FragmentBuilder_BindScbsSuitabilityAssessmentResultFragment(MediaBrowserCompat$ItemReceiver, IconCompatParcelizer);
    }

    /* renamed from: o.FragmentBuilder_BindScheduleListFragment$write */
    static final class write implements FragmentBuilder_BindSelectAccountFragment {
        public static final write read = new write();

        write() {
        }

        public final Integer read(Context context) {
            FundFactSheetActivity<OnBoardingTutorialActivity, Integer> write = FragmentBuilder_BindSequentialSearchFragment.write();
            FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> customView = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView();
            onGetStartedClick.IconCompatParcelizer((Object) customView, "OneInternalProvider.getStateStore()");
            return write.invoke(customView.MediaBrowserCompat$ItemReceiver());
        }
    }

    /* renamed from: o.FragmentBuilder_BindScheduleListFragment$read */
    static final class read implements FragmentBuilder_BindSelectAccountFragment {
        public static final read write = new read();

        read() {
        }

        public final Integer read(Context context) {
            if (context == null) {
                return null;
            }
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            int i = 0;
            if (bundle != null) {
                i = bundle.getInt("com.google.firebase.messaging.default_notification_icon", 0);
            }
            if (i != 0) {
                return Integer.valueOf(i);
            }
            return null;
        }
    }
}
