package p040o;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import android.os.Build;
import java.util.Arrays;
import java.util.List;

/* renamed from: o.FragmentBuilder_BindScheduleMonthlyFragment */
public final class FragmentBuilder_BindScheduleMonthlyFragment {
    private static final FundFactSheetActivity<Context, HmlVerifyPhoneValidateOtpActivity> MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.IconCompatParcelizer;
    private static final FundFactSheetActivity<Context, HmlVerifyPhoneValidateOtpActivity> read = write.write;
    private static final FundFactSheetActivity<Context, HmlVerifyPhoneValidateOtpActivity> write = read.write;

    public static final List<FundFactSheetActivity<Context, HmlVerifyPhoneValidateOtpActivity>> IconCompatParcelizer(int i) {
        if (i >= 26) {
            FundFactSheetActivity[] fundFactSheetActivityArr = {write, MediaBrowserCompat$ItemReceiver};
            onGetStartedClick.write((Object) fundFactSheetActivityArr, "elements");
            onGetStartedClick.write((Object) fundFactSheetActivityArr, "$this$asList");
            List<FundFactSheetActivity<Context, HmlVerifyPhoneValidateOtpActivity>> asList = Arrays.asList(fundFactSheetActivityArr);
            onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
            return asList;
        }
        FundFactSheetActivity[] fundFactSheetActivityArr2 = {read, MediaBrowserCompat$ItemReceiver};
        onGetStartedClick.write((Object) fundFactSheetActivityArr2, "elements");
        onGetStartedClick.write((Object) fundFactSheetActivityArr2, "$this$asList");
        List<FundFactSheetActivity<Context, HmlVerifyPhoneValidateOtpActivity>> asList2 = Arrays.asList(fundFactSheetActivityArr2);
        onGetStartedClick.IconCompatParcelizer((Object) asList2, "ArraysUtilJVM.asList(this)");
        return asList2;
    }

    /* renamed from: o.FragmentBuilder_BindScheduleMonthlyFragment$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<Context, HmlVerifyPhoneValidateOtpActivity> {
        public static final write write = new write();

        write() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            MyECouponActivity_ViewBinding.write(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindManageEmailVerificationSuccessFragment.DEFAULT_MESSAGING_INIT);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.FragmentBuilder_BindScheduleMonthlyFragment$read */
    static final class read extends CheckEligibilityActivity implements FundFactSheetActivity<Context, HmlVerifyPhoneValidateOtpActivity> {
        public static final read write = new read();

        read() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            Context context = (Context) obj;
            if (Build.VERSION.SDK_INT >= 26 && context != null) {
                NotificationChannel notificationChannel = new NotificationChannel("THUNDERHEAD_MESSAGING_CHANNEL_ID", "THUNDERHEAD_MESSAGING_CHANNEL", 3);
                notificationChannel.setDescription("THUNDERHEAD_MESSAGING");
                Object systemService = context.getSystemService("notification");
                if (!(systemService instanceof NotificationManager)) {
                    systemService = null;
                }
                NotificationManager notificationManager = (NotificationManager) systemService;
                if (notificationManager != null) {
                    notificationManager.createNotificationChannel(notificationChannel);
                } else {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationSuccessFragment.NULL_MESSAGING_SERVICE);
                }
                MyECouponActivity_ViewBinding.write(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindManageEmailVerificationSuccessFragment.CHANNEL_MESSAGING_INIT);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.FragmentBuilder_BindScheduleMonthlyFragment$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<Context, HmlVerifyPhoneValidateOtpActivity> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> customView = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView();
            onGetStartedClick.IconCompatParcelizer((Object) customView, "OneInternalProvider.getStateStore()");
            OnBoardingTutorialActivity MediaBrowserCompat$ItemReceiver = customView.MediaBrowserCompat$ItemReceiver();
            onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "OneInternalProvider.getStateStore().state");
            if (FragmentBuilder_BindSequentialSearchFragment.write().invoke(MediaBrowserCompat$ItemReceiver) == null) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindManageEmailVerificationSuccessFragment.NON_ADAPTIVE_SMALL_ICON_NOT_SET);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }
}
