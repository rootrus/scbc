package p040o;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import com.thunderhead.FullScreenNotificationScreen;
import com.thunderhead.MiniOptimizationViewController;
import java.lang.ref.WeakReference;
import p040o.FragmentBuilder_BindHmlAddOperatingAccountFragment;
import p040o.FragmentBuilder_BindHmlETBSummaryFragment;
import p040o.FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.FragmentBuilder_BindHmlETBSuccessFragment */
public final class FragmentBuilder_BindHmlETBSuccessFragment extends FragmentBuilder_BindHmlETBOfflineSuccessFragment<FragmentBuilder_BindHmlETBSummaryFragment> implements FragmentBuilder_BindHmlAddOperatingAccountFragment.read, C6550x270b6bf5, OnBoardingTutorialActivity_ViewBinding {
    private FragmentBuilder_BindHmlAddOperatingAccountFragment IconCompatParcelizer;
    boolean MediaBrowserCompat$CustomActionResultReceiver;
    FragmentBuilder_BindVerifyIdentityFragment MediaBrowserCompat$ItemReceiver;
    private FragmentBuilder_BindJuristicOnboardingLandingFragment.read MediaBrowserCompat$MediaItem;
    private Handler MediaDescriptionCompat;
    private FragmentBuilder_BindHmlAddOperatingAccountFragment read;
    public FragmentBuilder_BindHmlAddOperatingAccountFragment write;

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Object obj) {
        FragmentBuilder_BindHmlETBSummaryFragment fragmentBuilder_BindHmlETBSummaryFragment = (FragmentBuilder_BindHmlETBSummaryFragment) obj;
        if (fragmentBuilder_BindHmlETBSummaryFragment != null) {
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder();
            sb.append("Notification ");
            sb.append(fragmentBuilder_BindHmlETBSummaryFragment.hashCode());
            sb.append(" added to the NM for ");
            sb.append(fragmentBuilder_BindHmlETBSummaryFragment.RatingCompat);
            sb.append(" interaction");
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            FragmentBuilder_BindHmlNTBAccountConsentFragment MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver());
            if (!FragmentBuilder_BindTransferToOthersStep1Fragment.read(FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView().MediaBrowserCompat$ItemReceiver()) && MediaBrowserCompat$CustomActionResultReceiver2 != FragmentBuilder_BindHmlNTBAccountConsentFragment.USER_MODE) {
                return;
            }
            if (FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer.MINI_NOTIFICATION_BOTTOM != fragmentBuilder_BindHmlETBSummaryFragment.MediaMetadataCompat() && FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer.FULL != fragmentBuilder_BindHmlETBSummaryFragment.MediaMetadataCompat()) {
                return;
            }
            if (IconCompatParcelizer() != null) {
                MyECouponActivity_ViewBinding.IconCompatParcelizer(MyECouponActivity_ViewBinding.write, "Skipping an optimization because another one is going to be shown");
                return;
            }
            fragmentBuilder_BindHmlETBSummaryFragment.ParcelableVolumeInfo = this;
            MediaBrowserCompat$CustomActionResultReceiver((FragmentBuilder_BindHmlAddOperatingAccountFragment) fragmentBuilder_BindHmlETBSummaryFragment);
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Notification ");
            sb2.append(fragmentBuilder_BindHmlETBSummaryFragment.hashCode());
            sb2.append(", int. ");
            sb2.append(fragmentBuilder_BindHmlETBSummaryFragment.RatingCompat);
            sb2.append(" is preparing");
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb2.toString());
            String str = fragmentBuilder_BindHmlETBSummaryFragment.MediaDescriptionCompat;
            if (str == null || str.trim().isEmpty()) {
                fragmentBuilder_BindHmlETBSummaryFragment.MediaBrowserCompat$MediaItem();
            } else {
                new FragmentBuilder_BindHmlETBSummaryFragment.write(fragmentBuilder_BindHmlETBSummaryFragment, (byte) 0).start();
            }
        }
    }

    public FragmentBuilder_BindHmlETBSuccessFragment() {
        this(FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView());
    }

    private FragmentBuilder_BindHmlETBSuccessFragment(FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> fragmentBuilder_BindJuristicOnboardingLandingFragment) {
        this.MediaDescriptionCompat = new Handler(Looper.getMainLooper());
        this.MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindVerifyIdentityFragment.RUNTIME;
        this.MediaBrowserCompat$MediaItem = HomeActivity.write(fragmentBuilder_BindJuristicOnboardingLandingFragment, new FragmentBuilder_BindFundSwitchLandingFragment(this));
    }

    private FragmentBuilder_BindHmlAddOperatingAccountFragment IconCompatParcelizer() {
        FragmentBuilder_BindHmlAddOperatingAccountFragment fragmentBuilder_BindHmlAddOperatingAccountFragment;
        synchronized (this) {
            fragmentBuilder_BindHmlAddOperatingAccountFragment = this.IconCompatParcelizer;
        }
        return fragmentBuilder_BindHmlAddOperatingAccountFragment;
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlAddOperatingAccountFragment fragmentBuilder_BindHmlAddOperatingAccountFragment) {
        synchronized (this) {
            if (fragmentBuilder_BindHmlAddOperatingAccountFragment != null) {
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder();
                sb.append("Notification ");
                sb.append(fragmentBuilder_BindHmlAddOperatingAccountFragment.hashCode());
                sb.append(", interaction ");
                sb.append(fragmentBuilder_BindHmlAddOperatingAccountFragment.RatingCompat);
                sb.append(" was set as pending.");
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            } else {
                MyECouponActivity_ViewBinding.write(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindMerchantWalletFragment.NOTIFICATION_NULL_PENDING);
            }
            this.IconCompatParcelizer = fragmentBuilder_BindHmlAddOperatingAccountFragment;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(String str) {
        FragmentBuilder_BindHmlAddOperatingAccountFragment fragmentBuilder_BindHmlAddOperatingAccountFragment;
        FragmentBuilder_BindHmlAddOperatingAccountFragment fragmentBuilder_BindHmlAddOperatingAccountFragment2 = this.write;
        if ((fragmentBuilder_BindHmlAddOperatingAccountFragment2 == null || !(fragmentBuilder_BindHmlAddOperatingAccountFragment2 instanceof FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment)) && (fragmentBuilder_BindHmlAddOperatingAccountFragment = this.write) != null && fragmentBuilder_BindHmlAddOperatingAccountFragment.RatingCompat.equals(str)) {
            this.write.MediaBrowserCompat$CustomActionResultReceiver();
            FragmentBuilder_BindHmlAddOperatingAccountFragment fragmentBuilder_BindHmlAddOperatingAccountFragment3 = this.write;
            synchronized (this) {
                if (this.write == fragmentBuilder_BindHmlAddOperatingAccountFragment3) {
                    this.write = null;
                }
            }
        }
    }

    private void read() {
        synchronized (this) {
            MyECouponActivity_ViewBinding.write(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindMerchantWalletFragment.NOTIFICATION_CANCELLING_PENDING);
            if (IconCompatParcelizer() != null) {
                IconCompatParcelizer().write();
                MediaBrowserCompat$CustomActionResultReceiver((FragmentBuilder_BindHmlAddOperatingAccountFragment) null);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(Activity activity) {
        if (this.write != null && FragmentBuilder_BindHmlETBSummaryFragment.IconCompatParcelizer.MINI_NOTIFICATION_BOTTOM.equals(this.write.MediaMetadataCompat()) && activity.isChangingConfigurations()) {
            this.write.read();
            this.read = this.write;
        }
    }

    /* access modifiers changed from: package-private */
    public final void read(Activity activity) {
        if (!(this.write instanceof FragmentBuilder_BindHmlBusinessOwnerOutcomePendingFragment) || !(activity instanceof FullScreenNotificationScreen)) {
            FragmentBuilder_BindHmlAddOperatingAccountFragment fragmentBuilder_BindHmlAddOperatingAccountFragment = this.write;
            if (fragmentBuilder_BindHmlAddOperatingAccountFragment != null) {
                if (fragmentBuilder_BindHmlAddOperatingAccountFragment instanceof FragmentBuilder_BindHmlETBLoanSetupFragment) {
                    FragmentBuilder_BindHmlETBLoanSetupFragment fragmentBuilder_BindHmlETBLoanSetupFragment = (FragmentBuilder_BindHmlETBLoanSetupFragment) fragmentBuilder_BindHmlAddOperatingAccountFragment;
                    WeakReference<MiniOptimizationViewController> weakReference = fragmentBuilder_BindHmlETBLoanSetupFragment.MediaBrowserCompat$ItemReceiver;
                    if (!(weakReference == null || weakReference.get() == null)) {
                        MiniOptimizationViewController miniOptimizationViewController = fragmentBuilder_BindHmlETBLoanSetupFragment.MediaBrowserCompat$ItemReceiver.get();
                        miniOptimizationViewController.MediaBrowserCompat$ItemReceiver();
                        miniOptimizationViewController.read.removeView(miniOptimizationViewController);
                    }
                    if (fragmentBuilder_BindHmlETBLoanSetupFragment.write != null) {
                        fragmentBuilder_BindHmlETBLoanSetupFragment.write.MediaBrowserCompat$ItemReceiver(fragmentBuilder_BindHmlETBLoanSetupFragment);
                    }
                } else {
                    fragmentBuilder_BindHmlAddOperatingAccountFragment.MediaBrowserCompat$ItemReceiver();
                }
            }
            this.write = null;
            read();
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$ItemReceiver(Activity activity) {
        FragmentBuilder_BindHmlAddOperatingAccountFragment fragmentBuilder_BindHmlAddOperatingAccountFragment;
        if (!FragmentBuilder_BindGiftingMoneyTransferInputFragment.read(activity) && (fragmentBuilder_BindHmlAddOperatingAccountFragment = this.read) != null) {
            this.write = fragmentBuilder_BindHmlAddOperatingAccountFragment;
            this.read = null;
            fragmentBuilder_BindHmlAddOperatingAccountFragment.read(activity);
        }
    }

    public final void IconCompatParcelizer(FragmentBuilder_BindHmlETBSummaryFragment fragmentBuilder_BindHmlETBSummaryFragment) {
        this.MediaDescriptionCompat.post(new FragmentBuilder_BindFundSourceFragment(this, fragmentBuilder_BindHmlETBSummaryFragment));
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindHmlETBSummaryFragment fragmentBuilder_BindHmlETBSummaryFragment) {
        MediaBrowserCompat$CustomActionResultReceiver((FragmentBuilder_BindHmlAddOperatingAccountFragment) null);
        if (!fragmentBuilder_BindHmlETBSummaryFragment.MediaBrowserCompat$MediaItem) {
            if (this.write == null && this.read == null) {
                FragmentBuilder_BindHmlAddOperatingAccountFragment fragmentBuilder_BindHmlAddOperatingAccountFragment = (FragmentBuilder_BindHmlAddOperatingAccountFragment) fragmentBuilder_BindHmlETBSummaryFragment;
                FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.IconCompatParcelizer iconCompatParcelizer = FragmentBuilder_BindHmlIssuerLandingFragment.setSubtitle().MediaBrowserCompat$CustomActionResultReceiver;
                String str = fragmentBuilder_BindHmlETBSummaryFragment.RatingCompat;
                FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment = iconCompatParcelizer.IconCompatParcelizer;
                if ((fragmentBuilder_BindHmlETBBusinessInformationFragment != null && fragmentBuilder_BindHmlETBBusinessInformationFragment.MediaBrowserCompat$CustomActionResultReceiver().contains(str)) || !fragmentBuilder_BindHmlETBSummaryFragment.MediaSessionCompat$Token) {
                    this.write = fragmentBuilder_BindHmlAddOperatingAccountFragment;
                    fragmentBuilder_BindHmlAddOperatingAccountFragment.write = this;
                    MyECouponActivity_ViewBinding.write(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindMerchantWalletFragment.NOTIFICATION_ONGOING_AND_READY);
                    FragmentBuilder_BindHmlAddOperatingAccountFragment fragmentBuilder_BindHmlAddOperatingAccountFragment2 = this.write;
                    if (fragmentBuilder_BindHmlAddOperatingAccountFragment2 == null) {
                        MyECouponActivity_ViewBinding.write(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindMerchantWalletFragment.NOTIFICATION_NULL_PENDING);
                    } else if (this.MediaBrowserCompat$CustomActionResultReceiver) {
                        fragmentBuilder_BindHmlAddOperatingAccountFragment2.MediaBrowserCompat$ItemReceiver();
                    } else {
                        Activity AppCompatViewInflater = FragmentBuilder_BindHmlIssuerLandingFragment.AppCompatViewInflater();
                        if (AppCompatViewInflater == null) {
                            MyECouponActivity_ViewBinding.write(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindMerchantWalletFragment.NOTIFICATION_NULL_ACTIVITY);
                            this.write.MediaBrowserCompat$ItemReceiver();
                            return;
                        }
                        MyECouponActivity_ViewBinding.write(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindMerchantWalletFragment.NOTIFICATION_SHOWING);
                        this.write.read(AppCompatViewInflater);
                    }
                } else {
                    MyECouponActivity_ViewBinding.write(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindMerchantWalletFragment.NOTIFICATION_OUTDATED);
                }
            } else {
                MyECouponActivity_ViewBinding.write(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver, FragmentBuilder_BindMerchantWalletFragment.NOTIFICATION_IN_PROGRESS);
            }
        }
    }

    public final void write(FragmentBuilder_BindHmlETBSummaryFragment fragmentBuilder_BindHmlETBSummaryFragment) {
        MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
        StringBuilder sb = new StringBuilder();
        sb.append("Notification ");
        sb.append(fragmentBuilder_BindHmlETBSummaryFragment.hashCode());
        sb.append(", int. ");
        sb.append(fragmentBuilder_BindHmlETBSummaryFragment.RatingCompat);
        sb.append(" is removing from pendings");
        MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
        MediaBrowserCompat$CustomActionResultReceiver((FragmentBuilder_BindHmlAddOperatingAccountFragment) null);
    }

    public final void disconnect() {
        FragmentBuilder_BindJuristicOnboardingLandingFragment.read read2 = this.MediaBrowserCompat$MediaItem;
        if (read2 != null) {
            read2.read();
            this.MediaBrowserCompat$MediaItem = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        FragmentBuilder_BindHmlAddOperatingAccountFragment fragmentBuilder_BindHmlAddOperatingAccountFragment = this.write;
        if (fragmentBuilder_BindHmlAddOperatingAccountFragment != null) {
            fragmentBuilder_BindHmlAddOperatingAccountFragment.MediaBrowserCompat$ItemReceiver();
        }
        read();
    }

    public final void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindHmlAddOperatingAccountFragment fragmentBuilder_BindHmlAddOperatingAccountFragment) {
        synchronized (this) {
            if (this.write == fragmentBuilder_BindHmlAddOperatingAccountFragment) {
                this.write = null;
            }
        }
    }
}
