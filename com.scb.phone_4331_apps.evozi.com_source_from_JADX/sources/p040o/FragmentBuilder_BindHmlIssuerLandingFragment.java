package p040o;

import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;
import android.view.View;
import android.view.WindowManager;
import com.google.gson.Gson;
import com.thunderhead.android.infrastructure.authentication.oauth2.retrofit2.OneClientAuthentication;
import com.thunderhead.android.infrastructure.features.pokerchip.StateConnectedPokerchipPresenter;
import com.thunderhead.android.infrastructure.features.preview.StateConnectedPreviewPanelPresenter;
import com.thunderhead.android.infrastructure.features.touchpoints.retrofit2.Retrofit2TouchpointsService;
import com.thunderhead.android.infrastructure.login.LoginPresenterImpl;
import com.thunderhead.android.infrastructure.server.responses.BaseResponse;
import com.thunderhead.connectivity.OneDesignTimeApi;
import com.thunderhead.connectivity.OneRuntimeServiceApi;
import com.thunderhead.connectivity.TransportImplFactory;
import com.thunderhead.connectivity.transport.ServiceConstants;
import com.thunderhead.connectivity.transport.retrofitv2.OneAddMetaInformationInterceptor;
import com.thunderhead.connectivity.transport.retrofitv2.RequestInterceptorsFactory;
import com.thunderhead.connectivity.transport.retrofitv2.ServiceInterfaceProvider;
import com.thunderhead.connectivity.transport.retrofitv2.ServiceInterfaceProviderImpl;
import com.thunderhead.messaging.CloudMessagingManager;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import p040o.FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/* renamed from: o.FragmentBuilder_BindHmlIssuerLandingFragment */
public final class FragmentBuilder_BindHmlIssuerLandingFragment {
    private static final ReadWriteLock IconCompatParcelizer = new ReentrantReadWriteLock(true);
    private static C6551x237ec885 MediaBrowserCompat$CustomActionResultReceiver = new write((byte) 0);
    private static Context read;
    private static final ReadWriteLock write = new ReentrantReadWriteLock(true);

    private static C6551x237ec885 setActionBarVisibilityCallback() {
        Lock readLock = IconCompatParcelizer.readLock();
        readLock.lock();
        try {
            return MediaBrowserCompat$CustomActionResultReceiver;
        } finally {
            readLock.unlock();
        }
    }

    public static Context MediaMetadataCompat() {
        Lock readLock = write.readLock();
        readLock.lock();
        try {
            return read;
        } finally {
            readLock.unlock();
        }
    }

    public static void MediaBrowserCompat$ItemReceiver(Context context) {
        Lock writeLock = write.writeLock();
        writeLock.lock();
        try {
            read = context;
        } finally {
            writeLock.unlock();
        }
    }

    public static ServiceInterfaceProvider setSplitBackground() {
        return setActionBarVisibilityCallback().setStackedBackground();
    }

    public static FragmentBuilder_BindOtpPinFragment<FragmentBuilder_BindPurchaseProfileManagementFragment, FragmentBuilder_BindQuantityPointsPlusMoneyFragment> MediaBrowserCompat$CustomActionResultReceiver() {
        return setActionBarVisibilityCallback().MediaBrowserCompat$CustomActionResultReceiver();
    }

    public static FragmentBuilder_BindPayNowSuccessFragment<FragmentBuilder_BindPurchaseProfileManagementFragment, FragmentBuilder_BindQuantityPointsPlusMoneyFragment> write() {
        return setActionBarVisibilityCallback().read();
    }

    public static FragmentBuilder_MutualFundAddressMainFragment setContentView() {
        return setActionBarVisibilityCallback().AppCompatActivity();
    }

    public static FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.IconCompatParcelizer ActionBarContextView() {
        return setActionBarVisibilityCallback().setTransitioning();
    }

    public static ComponentCallbacks2 setGroupDividerEnabled() {
        return setActionBarVisibilityCallback().setPadding();
    }

    public static ScbMapActivity MediaSessionCompat$Token() {
        return setActionBarVisibilityCallback().MediaSessionCompat$ResultReceiverWrapper();
    }

    public static FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment setSubtitle() {
        return setActionBarVisibilityCallback().setSubtitle();
    }

    public static CloudMessagingManager MediaDescriptionCompat() {
        return setActionBarVisibilityCallback().RatingCompat();
    }

    public static SharedPreferences MediaBrowserCompat$ItemReceiver(String str) {
        return setActionBarVisibilityCallback().IconCompatParcelizer(str);
    }

    public static FragmentBuilder_BindHmlETBOfflineSuccessFragment setCheckable() {
        return setActionBarVisibilityCallback().setContentView();
    }

    public static EditRecipientActivity setTransitioning() {
        return setActionBarVisibilityCallback().setTabContainer();
    }

    public static FragmentBuilder_BindSetupQuickPromptPayFragment AppCompatActivity() {
        return setActionBarVisibilityCallback().setBackgroundResource();
    }

    public static OneDesignTimeApi setShortcut() {
        return setActionBarVisibilityCallback().setShortcut();
    }

    public static FragmentBuilder_BindHmlNTBApplyLoanEntryFragment setTabContainer() {
        return setActionBarVisibilityCallback().setPrimaryBackground();
    }

    public static FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment MediaSessionCompat$QueueItem() {
        return setActionBarVisibilityCallback().MediaSessionCompat$QueueItem();
    }

    public static OneRuntimeServiceApi setPadding() {
        return setActionBarVisibilityCallback().setItemInvoker();
    }

    public static FragmentBuilder_BindRtpEBillPaymentDetailFragment setExpandedFormat() {
        return setActionBarVisibilityCallback().AppCompatViewInflater();
    }

    public static ECouponCommonActivity_ViewBinding setVisibility() {
        return setActionBarVisibilityCallback().MenuItemWrapperICS$CollapsibleActionViewWrapper();
    }

    public static Gson PlaybackStateCompat$CustomAction() {
        return setActionBarVisibilityCallback().PlaybackStateCompat();
    }

    public static setRootView MediaBrowserCompat$MediaItem() {
        return setActionBarVisibilityCallback().MediaBrowserCompat$SearchResultReceiver();
    }

    public static FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> setCustomView() {
        return setActionBarVisibilityCallback().ActionBarContextView();
    }

    public static FragmentBuilder_BindHmlETBBusinessInformationFragment IconCompatParcelizer() {
        return setActionBarVisibilityCallback().write();
    }

    public static BaseResponse IconCompatParcelizer(String str) {
        return setActionBarVisibilityCallback().MediaBrowserCompat$ItemReceiver(str);
    }

    public static List<View> setBackgroundResource() {
        return setActionBarVisibilityCallback().Keep();
    }

    public static CreateRecipientGroupActivity ExpandedMenuView() {
        return setActionBarVisibilityCallback().setForceShowIcon();
    }

    public static FragmentBuilder_BindHmlETBBusinessInformationFragment setIcon() {
        return setActionBarVisibilityCallback().setExpandedFormat();
    }

    public static CalendarLandingActivity_ViewBinding AbsActionBarView() {
        return setActionBarVisibilityCallback().MenuItemImpl();
    }

    public static FragmentBuilder_BindHmlEditOperatingAccountFragment ActionMenuItemView() {
        return setActionBarVisibilityCallback().ActionMenuItemView();
    }

    public static boolean ActionBarOverlayLayout() {
        return setActionBarVisibilityCallback().setActionBarVisibilityCallback();
    }

    public static FragmentBuilder_BindHmlNTBBusinessURLInfoFragment PlaybackStateCompat() {
        return setActionBarVisibilityCallback().MediaSessionCompat$Token();
    }

    public static Activity AppCompatViewInflater() {
        return setActionBarVisibilityCallback().setChecked();
    }

    public static FragmentBuilder_BindHmlAboutFragment read() {
        return setActionBarVisibilityCallback().IconCompatParcelizer();
    }

    public static BondSelectionActivity Keep() {
        return setActionBarVisibilityCallback().PlaybackStateCompat$CustomAction();
    }

    public static FragmentBuilder_BindHmlExternalAuthenticationFragment setItemInvoker() {
        return setActionBarVisibilityCallback().setPopupCallback();
    }

    public static ReviewDocumentActivity RatingCompat() {
        return setActionBarVisibilityCallback().MediaMetadataCompat();
    }

    public static OkHttpClient ParcelableVolumeInfo() {
        return setActionBarVisibilityCallback().ParcelableVolumeInfo();
    }

    public static onImageClicked setPopupCallback() {
        return setActionBarVisibilityCallback().setIcon();
    }

    public static UseCaseModule AppCompatDelegateImpl$ListMenuDecorView() {
        return setActionBarVisibilityCallback().AppCompatDialogFragment();
    }

    public static FragmentBuilder_RegistrationFingerprintFragment MediaSessionCompat$ResultReceiverWrapper() {
        return setActionBarVisibilityCallback().MediaDescriptionCompat();
    }

    public static NtbHmlApiBasedDocumentInstructionsActivity setTitleOptional() {
        return setActionBarVisibilityCallback().setCustomView();
    }

    public static DocumentInstructionsActivity ActionBarContainer() {
        return setActionBarVisibilityCallback().ActionBarContainer();
    }

    public static FragmentBuilder_BindSCBSLandingFragment setChecked() {
        return setActionBarVisibilityCallback().setCheckable();
    }

    public static SQLiteDatabase setHideOnContentScrollEnabled() {
        return setActionBarVisibilityCallback().setTitleOptional();
    }

    public static Application.ActivityLifecycleCallbacks MediaBrowserCompat$ItemReceiver() {
        return setActionBarVisibilityCallback().MediaBrowserCompat$ItemReceiver();
    }

    public static FragmentBuilder_BindTouchPointInputCidFragment MenuItemImpl() {
        return setActionBarVisibilityCallback().ListMenuItemView();
    }

    public static FragmentBuilder_BindTempLimitReviewFragment setTitle() {
        return setActionBarVisibilityCallback().setTitle();
    }

    public static onFlashLightClicked setForceShowIcon() {
        return setActionBarVisibilityCallback().setGroupDividerEnabled();
    }

    public static onFlashLightClicked ListMenuItemView() {
        return setActionBarVisibilityCallback().ExpandedMenuView();
    }

    public static onFlashLightClicked MenuItemWrapperICS$CollapsibleActionViewWrapper() {
        return setActionBarVisibilityCallback().setContentHeight();
    }

    public static WindowManager MediaBrowserCompat$SearchResultReceiver() {
        return setActionBarVisibilityCallback().MediaBrowserCompat$MediaItem();
    }

    public static onFlashLightClicked AlertController$RecycleListView() {
        return setActionBarVisibilityCallback().setHasDecor();
    }

    public static ReviewDocumentActivity setPrimaryBackground() {
        return setActionBarVisibilityCallback().setSplitBackground();
    }

    public static FragmentBuilder_BindOPRStatusUnregisteredUserFragment setStackedBackground() {
        return setActionBarVisibilityCallback().AbsActionBarView();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static FragmentBuilder_BindNTBBankingServiceFragment m3059x50fd9e4a() {
        return setActionBarVisibilityCallback().mo16860x50fd9e4a();
    }

    public static FragmentBuilder_BindSharingMomentsPreviewFragment setContentHeight() {
        return setActionBarVisibilityCallback().setVisibility();
    }

    public static FragmentBuilder_BindSetupQuickBalanceFragment AppCompatDialogFragment() {
        return setActionBarVisibilityCallback().AppCompatDelegateImpl$ListMenuDecorView();
    }

    public static FragmentBuilder_BindPreregistrationPinFragment setHasDecor() {
        return setActionBarVisibilityCallback().AlertController$RecycleListView();
    }

    /* renamed from: o.FragmentBuilder_BindHmlIssuerLandingFragment$write */
    static class write implements C6551x237ec885 {
        private ServiceInterfaceProvider AlertController$RecycleListView;
        private CloudMessagingManager IconCompatParcelizer;
        private FragmentBuilder_BindHmlNTBApplyLoanEntryFragment Keep;
        private FragmentBuilder_BindScheduleBulkTransferFragment MediaBrowserCompat$CustomActionResultReceiver;
        private OkHttpClient MediaBrowserCompat$ItemReceiver;
        private FragmentBuilder_BindRtpEBillPaymentDetailFragment MediaBrowserCompat$MediaItem;
        private Gson MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        private CreateRecipientGroupActivity f2543x50fd9e4a;
        private FragmentBuilder_BindPreregistrationPinFragment MediaDescriptionCompat;
        private FragmentBuilder_BindHmlETBOfflineSuccessFragment MediaMetadataCompat;
        private BasePartialSearchActivity_ViewBinding MediaSessionCompat$QueueItem;
        private OkHttpClient MediaSessionCompat$ResultReceiverWrapper;
        private EasycashMCMCDetailCaseModule MediaSessionCompat$Token;
        private ECouponCommonActivity_ViewBinding ParcelableVolumeInfo;
        private FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment PlaybackStateCompat;
        private SQLiteOpenHelper PlaybackStateCompat$CustomAction;
        private FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment RatingCompat;
        private FragmentBuilder_BindMoneyActionFragment read;
        private SQLiteDatabase setHasDecor;
        private setRootView write;

        private write() {
        }

        /* synthetic */ write(byte b) {
            this();
        }

        private SQLiteOpenHelper setHasNonEmbeddedTabs() {
            SQLiteOpenHelper sQLiteOpenHelper;
            synchronized (this) {
                Context MediaMetadataCompat2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat();
                if (this.PlaybackStateCompat$CustomAction == null && MediaMetadataCompat2 != null) {
                    List<String> write2 = FragmentBuilder_BindRtpScreenshotFragment.write();
                    FullScreenLoadingActivity[] fullScreenLoadingActivityArr = {new ErrorPageActivity_ViewBinding(), new ErrorPageActivity()};
                    onGetStartedClick.write((Object) fullScreenLoadingActivityArr, "elements");
                    onGetStartedClick.write((Object) fullScreenLoadingActivityArr, "$this$asList");
                    List asList = Arrays.asList(fullScreenLoadingActivityArr);
                    onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
                    this.PlaybackStateCompat$CustomAction = new onFastPaySettingCoachmarkClicked(MediaMetadataCompat2, "OneOfflineStorage", write2, asList);
                }
                sQLiteOpenHelper = this.PlaybackStateCompat$CustomAction;
            }
            return sQLiteOpenHelper;
        }

        private FragmentBuilder_BindScheduleBulkTransferFragment ActionBarOverlayLayout() {
            FragmentBuilder_BindScheduleBulkTransferFragment fragmentBuilder_BindScheduleBulkTransferFragment;
            synchronized (this) {
                try {
                    if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                        this.MediaBrowserCompat$CustomActionResultReceiver = new FragmentBuilder_BindScheduleBulkTransferFragment(FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat(), setActionBarHideOffset(), FragmentBuilder_BindScheduleMonthlyFragment.IconCompatParcelizer(Build.VERSION.SDK_INT), FragmentBuilder_BindScheduleListFragment.MediaBrowserCompat$ItemReceiver(Build.VERSION.SDK_INT), FragmentBuilder_BindScbsOnboardingReviewInformationFragment.IconCompatParcelizer());
                    }
                    fragmentBuilder_BindScheduleBulkTransferFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
                } catch (Exception e) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                    return null;
                }
            }
            return fragmentBuilder_BindScheduleBulkTransferFragment;
        }

        public final SQLiteDatabase setTitleOptional() {
            SQLiteDatabase sQLiteDatabase;
            synchronized (this) {
                SQLiteOpenHelper hasNonEmbeddedTabs = setHasNonEmbeddedTabs();
                if (this.setHasDecor == null && hasNonEmbeddedTabs != null) {
                    this.setHasDecor = hasNonEmbeddedTabs.getWritableDatabase();
                }
                sQLiteDatabase = this.setHasDecor;
            }
            return sQLiteDatabase;
        }

        public final FragmentBuilder_BindSCBSLandingFragment setCheckable() {
            if (setTitleOptional() != null) {
                return new FragmentBuilder_BindSMELandingFragment(setTitleOptional());
            }
            return null;
        }

        public final ScbMapActivity MediaSessionCompat$ResultReceiverWrapper() {
            return ReviewCommonActivity.read;
        }

        public final FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.IconCompatParcelizer setTransitioning() {
            FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.IconCompatParcelizer iconCompatParcelizer;
            synchronized (this) {
                iconCompatParcelizer = setSubtitle().MediaBrowserCompat$CustomActionResultReceiver;
            }
            return iconCompatParcelizer;
        }

        public final CloudMessagingManager RatingCompat() {
            CloudMessagingManager cloudMessagingManager;
            synchronized (this) {
                try {
                    Context MediaMetadataCompat2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat();
                    FragmentBuilder_BindSetupQuickPromptPayFragment backgroundResource = setBackgroundResource();
                    FragmentBuilder_BindHmlNTBApplyLoanEntryFragment primaryBackground = setPrimaryBackground();
                    Context MediaMetadataCompat3 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat();
                    MyECouponActivity myECouponActivity = MediaMetadataCompat3 != null ? new MyECouponActivity(MediaMetadataCompat3) : null;
                    if (!(this.IconCompatParcelizer != null || MediaMetadataCompat2 == null || backgroundResource == null || primaryBackground == null || myECouponActivity == null)) {
                        this.IconCompatParcelizer = new CloudMessagingManager(MediaMetadataCompat2, primaryBackground, backgroundResource);
                    }
                    cloudMessagingManager = this.IconCompatParcelizer;
                } catch (Exception e) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                    return null;
                }
            }
            return cloudMessagingManager;
        }

        public final OkHttpClient ParcelableVolumeInfo() {
            OkHttpClient okHttpClient;
            synchronized (this) {
                if (this.MediaBrowserCompat$ItemReceiver == null) {
                    HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor(FragmentBuilder_BindGroupFavoriteFragment.IconCompatParcelizer);
                    httpLoggingInterceptor.setLevel(MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver());
                    OkHttpClient.Builder addInterceptor = new OkHttpClient.Builder().connectTimeout(15, ServiceConstants.TIME_UNIT).readTimeout(15, ServiceConstants.TIME_UNIT).addInterceptor(RequestInterceptorsFactory.getDesignTimeRequestInterceptor()).addInterceptor(new OneAddMetaInformationInterceptor());
                    onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
                    OkHttpClient.Builder addInterceptor2 = addInterceptor.addInterceptor(new FragmentBuilder_BindNoEligiblePurchasesFragment(onPreviousTutorialButtonClick.read()));
                    onPreviousTutorialButtonClick onprevioustutorialbuttonclick2 = onPreviousTutorialButtonClick.read;
                    OkHttpClient.Builder addInterceptor3 = addInterceptor2.addInterceptor(new FragmentBuilder_BindOPRRewardsFragment(onPreviousTutorialButtonClick.read())).addInterceptor(new EasycashDFWYNCaseModule()).addInterceptor(httpLoggingInterceptor);
                    onPreviousTutorialButtonClick onprevioustutorialbuttonclick3 = onPreviousTutorialButtonClick.read;
                    this.MediaBrowserCompat$ItemReceiver = AlertController$RecycleListView.IconCompatParcelizer(addInterceptor3.authenticator(new FragmentBuilder_BindNsipPaymentInputFragment(onPreviousTutorialButtonClick.read()))).build();
                }
                okHttpClient = this.MediaBrowserCompat$ItemReceiver;
            }
            return okHttpClient;
        }

        public final SharedPreferences IconCompatParcelizer(String str) {
            try {
                Context MediaMetadataCompat2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat();
                if (MediaMetadataCompat2 == null) {
                    return null;
                }
                return MediaMetadataCompat2.getSharedPreferences(str, 0);
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        }

        public final UseCaseModule AppCompatDialogFragment() {
            return new FragmentBuilder_OnboardingFatcaQuestionsFragment(FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat());
        }

        public final FragmentBuilder_RegistrationFingerprintFragment MediaDescriptionCompat() {
            if (FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat() != null) {
                return new FragmentBuilder_RegistrationFingerprintFragment(FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat());
            }
            return null;
        }

        public final NtbHmlApiBasedDocumentInstructionsActivity setCustomView() {
            try {
                Retrofit IconCompatParcelizer2 = IconCompatParcelizer(false);
                if (IconCompatParcelizer2 != null) {
                    return new FragmentBuilder_FundMartialStatusFragment((Retrofit2TouchpointsService) IconCompatParcelizer2.create(Retrofit2TouchpointsService.class));
                }
                return null;
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        }

        public final DocumentInstructionsActivity ActionBarContainer() {
            return new FatcaQuestionnaireCase$FatcaVerificationCodeException(FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat());
        }

        public final FragmentBuilder_BindSetupQuickPromptPayFragment setBackgroundResource() {
            FragmentBuilder_BindScheduleBulkTransferFragment ActionBarOverlayLayout;
            synchronized (this) {
                try {
                    ActionBarOverlayLayout = ActionBarOverlayLayout();
                } catch (Exception e) {
                    MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindManageEmailVerificationSuccessFragment.GET_ERROR);
                    return null;
                }
            }
            return ActionBarOverlayLayout;
        }

        public final Gson PlaybackStateCompat() {
            Gson gson;
            synchronized (this) {
                if (this.MediaBrowserCompat$SearchResultReceiver == null) {
                    this.MediaBrowserCompat$SearchResultReceiver = new Gson();
                }
                gson = this.MediaBrowserCompat$SearchResultReceiver;
            }
            return gson;
        }

        public final setRootView MediaBrowserCompat$SearchResultReceiver() {
            setRootView setrootview;
            synchronized (this) {
                if (this.write == null) {
                    Context MediaMetadataCompat2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat();
                    this.write = new setRootView(MediaMetadataCompat2 != null ? new MyECouponActivity(MediaMetadataCompat2) : null, new WeakReference(FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat()));
                }
                setrootview = this.write;
            }
            return setrootview;
        }

        private OkHttpClient setHideOnContentScrollEnabled() {
            OkHttpClient okHttpClient;
            synchronized (this) {
                if (this.MediaSessionCompat$ResultReceiverWrapper == null) {
                    this.MediaSessionCompat$ResultReceiverWrapper = AlertController$RecycleListView.IconCompatParcelizer(new OkHttpClient.Builder().connectTimeout(15, ServiceConstants.TIME_UNIT).readTimeout(15, ServiceConstants.TIME_UNIT).addInterceptor(RequestInterceptorsFactory.getDesignTimeRequestInterceptor()).addInterceptor(new OneAddMetaInformationInterceptor()).addInterceptor(new EasycashDFWYNCaseModule())).build();
                }
                okHttpClient = this.MediaSessionCompat$ResultReceiverWrapper;
            }
            return okHttpClient;
        }

        public final FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment setSubtitle() {
            FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment fragmentBuilder_BindHmlHmlNTBVerifyEmailFragment;
            synchronized (this) {
                if (this.PlaybackStateCompat == null) {
                    this.PlaybackStateCompat = new FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment();
                }
                fragmentBuilder_BindHmlHmlNTBVerifyEmailFragment = this.PlaybackStateCompat;
            }
            return fragmentBuilder_BindHmlHmlNTBVerifyEmailFragment;
        }

        public final EditRecipientActivity setTabContainer() {
            Context MediaMetadataCompat2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat();
            if (MediaMetadataCompat2 != null) {
                return new MyECouponActivity(MediaMetadataCompat2);
            }
            return null;
        }

        public final FragmentBuilder_BindHmlETBBusinessInformationFragment write() {
            try {
                return setSubtitle().MediaBrowserCompat$CustomActionResultReceiver;
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        }

        public final BaseResponse MediaBrowserCompat$ItemReceiver(String str) {
            try {
                FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment = setSubtitle().MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
                if (fragmentBuilder_BindHmlETBBusinessInformationFragment == null) {
                    return null;
                }
                return fragmentBuilder_BindHmlETBBusinessInformationFragment.MediaBrowserCompat$CustomActionResultReceiver(str);
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        }

        public final List<View> Keep() {
            try {
                FragmentBuilder_BindHmlETBBusinessInformationFragment fragmentBuilder_BindHmlETBBusinessInformationFragment = setSubtitle().MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
                if (fragmentBuilder_BindHmlETBBusinessInformationFragment == null) {
                    return Collections.emptyList();
                }
                return fragmentBuilder_BindHmlETBBusinessInformationFragment.MediaBrowserCompat$ItemReceiver();
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return new ArrayList();
            }
        }

        public final CreateRecipientGroupActivity setForceShowIcon() {
            CreateRecipientGroupActivity createRecipientGroupActivity;
            synchronized (this) {
                if (this.f2543x50fd9e4a == null) {
                    try {
                        this.f2543x50fd9e4a = new MyECouponActivity(FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat());
                    } catch (Exception e) {
                        MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                        return null;
                    }
                }
                createRecipientGroupActivity = this.f2543x50fd9e4a;
            }
            return createRecipientGroupActivity;
        }

        public final FragmentBuilder_BindHmlETBBusinessInformationFragment setExpandedFormat() {
            try {
                return setSubtitle().MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer;
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        }

        public final CalendarLandingActivity_ViewBinding MenuItemImpl() {
            return RatingCompat();
        }

        public final FragmentBuilder_BindHmlEditOperatingAccountFragment ActionMenuItemView() {
            return FragmentBuilder_BindHmlIssuerLandingFragment.setTabContainer();
        }

        public final boolean setActionBarVisibilityCallback() {
            try {
                if (setSubtitle().MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver == 0) {
                    return true;
                }
                return false;
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return false;
            }
        }

        public final FragmentBuilder_BindHmlNTBBusinessURLInfoFragment MediaSessionCompat$Token() {
            try {
                return setSubtitle().IconCompatParcelizer;
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        }

        public final FragmentBuilder_BindHmlAboutFragment IconCompatParcelizer() {
            return new FragmentBuilder_BindHmlBusinessOwnerAccountSetupFragment();
        }

        public final BondSelectionActivity PlaybackStateCompat$CustomAction() {
            return BondSelectionActivity.MediaBrowserCompat$CustomActionResultReceiver();
        }

        public final FragmentBuilder_BindHmlExternalAuthenticationFragment setPopupCallback() {
            return FragmentBuilder_BindHmlExternalAuthenticationFragment.read();
        }

        public final FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> ActionBarContextView() {
            onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
            return onPreviousTutorialButtonClick.read();
        }

        public final FragmentBuilder_BindHmlETBOfflineSuccessFragment setContentView() {
            FragmentBuilder_BindHmlETBOfflineSuccessFragment fragmentBuilder_BindHmlETBOfflineSuccessFragment;
            synchronized (this) {
                if (this.MediaMetadataCompat == null) {
                    this.MediaMetadataCompat = new FragmentBuilder_BindHmlETBSuccessFragment();
                }
                fragmentBuilder_BindHmlETBOfflineSuccessFragment = this.MediaMetadataCompat;
            }
            return fragmentBuilder_BindHmlETBOfflineSuccessFragment;
        }

        public final OneDesignTimeApi setShortcut() {
            return TransportImplFactory.getDesignTimeServiceApi();
        }

        public final FragmentBuilder_BindHmlNTBApplyLoanEntryFragment setPrimaryBackground() {
            FragmentBuilder_BindHmlNTBApplyLoanEntryFragment fragmentBuilder_BindHmlNTBApplyLoanEntryFragment;
            synchronized (this) {
                if (this.Keep == null) {
                    CreateRecipientGroupActivity forceShowIcon = setForceShowIcon();
                    FragmentBuilder_BindRtpEBillPaymentDetailFragment AppCompatViewInflater = AppCompatViewInflater();
                    ECouponCommonActivity_ViewBinding MenuItemWrapperICS$CollapsibleActionViewWrapper = MenuItemWrapperICS$CollapsibleActionViewWrapper();
                    if (!(forceShowIcon == null || AppCompatViewInflater == null || MenuItemWrapperICS$CollapsibleActionViewWrapper == null)) {
                        this.Keep = new FragmentBuilder_BindHmlNTBApplyLoanEntryFragment(setSubtitle().MediaBrowserCompat$CustomActionResultReceiver, this.f2543x50fd9e4a, new FragmentBuilder_OnboardingFatcaQuestionsFragment(FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat()), AppCompatViewInflater, MenuItemWrapperICS$CollapsibleActionViewWrapper, setContentView());
                    }
                }
                fragmentBuilder_BindHmlNTBApplyLoanEntryFragment = this.Keep;
            }
            return fragmentBuilder_BindHmlNTBApplyLoanEntryFragment;
        }

        public final FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment MediaSessionCompat$QueueItem() {
            FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment;
            OneDesignTimeApi designTimeServiceApi;
            synchronized (this) {
                if (this.RatingCompat == null && (designTimeServiceApi = TransportImplFactory.getDesignTimeServiceApi()) != null) {
                    this.RatingCompat = new FragmentBuilder_BindHmlBusinessOwnerCalculatorFragment(new FragmentBuilder_OnboardingFatcaQuestionsFragment(FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat()), designTimeServiceApi);
                }
                fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment = this.RatingCompat;
            }
            return fragmentBuilder_BindHmlBusinessOwnerCalculatorFragment;
        }

        public final FragmentBuilder_BindRtpEBillPaymentDetailFragment AppCompatViewInflater() {
            FragmentBuilder_BindRtpEBillPaymentDetailFragment fragmentBuilder_BindRtpEBillPaymentDetailFragment;
            synchronized (this) {
                if (this.MediaBrowserCompat$MediaItem == null) {
                    FragmentBuilder_BindSMELandingFragment fragmentBuilder_BindSMELandingFragment = setTitleOptional() != null ? new FragmentBuilder_BindSMELandingFragment(setTitleOptional()) : null;
                    ECouponCommonActivity_ViewBinding MenuItemWrapperICS$CollapsibleActionViewWrapper = MenuItemWrapperICS$CollapsibleActionViewWrapper();
                    if (!(fragmentBuilder_BindSMELandingFragment == null || MenuItemWrapperICS$CollapsibleActionViewWrapper == null)) {
                        onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
                        this.MediaBrowserCompat$MediaItem = new FragmentBuilder_BindRiskReviewFragment(fragmentBuilder_BindSMELandingFragment, MenuItemWrapperICS$CollapsibleActionViewWrapper, onPreviousTutorialButtonClick.read());
                    }
                }
                fragmentBuilder_BindRtpEBillPaymentDetailFragment = this.MediaBrowserCompat$MediaItem;
            }
            return fragmentBuilder_BindRtpEBillPaymentDetailFragment;
        }

        public final ECouponCommonActivity_ViewBinding MenuItemWrapperICS$CollapsibleActionViewWrapper() {
            ECouponCommonActivity_ViewBinding eCouponCommonActivity_ViewBinding;
            synchronized (this) {
                if (this.ParcelableVolumeInfo == null) {
                    FragmentBuilder_BindHmlETBBusinessInformationFragment write2 = write();
                    CreateRecipientGroupActivity forceShowIcon = setForceShowIcon();
                    OneRuntimeServiceApi runtimeServiceApi = TransportImplFactory.getRuntimeServiceApi(Build.VERSION.SDK_INT);
                    if (!(write2 == null || forceShowIcon == null || runtimeServiceApi == null)) {
                        onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
                        this.ParcelableVolumeInfo = new ECouponCommonActivity_ViewBinding(runtimeServiceApi, write2, onPreviousTutorialButtonClick.read());
                    }
                }
                eCouponCommonActivity_ViewBinding = this.ParcelableVolumeInfo;
            }
            return eCouponCommonActivity_ViewBinding;
        }

        public final OneRuntimeServiceApi setItemInvoker() {
            return TransportImplFactory.getRuntimeServiceApi(Build.VERSION.SDK_INT);
        }

        public final Application.ActivityLifecycleCallbacks MediaBrowserCompat$ItemReceiver() {
            FragmentBuilder_BindMoneyActionFragment fragmentBuilder_BindMoneyActionFragment;
            synchronized (this) {
                if (this.read == null) {
                    onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
                    this.read = new FragmentBuilder_BindMoneyActionFragment(onPreviousTutorialButtonClick.read());
                }
                fragmentBuilder_BindMoneyActionFragment = this.read;
            }
            return fragmentBuilder_BindMoneyActionFragment;
        }

        public final FragmentBuilder_MutualFundAddressMainFragment AppCompatActivity() {
            onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
            return new LoginPresenterImpl(onPreviousTutorialButtonClick.read());
        }

        public final onFlashLightClicked setGroupDividerEnabled() {
            return FragmentBuilder_BindTermsConditionsFragment.read;
        }

        public final onFlashLightClicked setContentHeight() {
            return FragmentBuilder_BindTransferAndPayFragment.MediaBrowserCompat$CustomActionResultReceiver;
        }

        public final WindowManager MediaBrowserCompat$MediaItem() {
            try {
                return (WindowManager) FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat().getSystemService("window");
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        }

        public final onFlashLightClicked setHasDecor() {
            return FragmentBuilder_BindPrepaidActivationInputFragment.IconCompatParcelizer;
        }

        public final onFlashLightClicked ExpandedMenuView() {
            return FragmentBuilder_BindTempLimitPreApprovedBottomFragment.write;
        }

        public final ComponentCallbacks2 setPadding() {
            EasycashMCMCDetailCaseModule easycashMCMCDetailCaseModule;
            synchronized (this) {
                if (this.MediaSessionCompat$Token == null) {
                    onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
                    this.MediaSessionCompat$Token = new EasycashMCMCDetailCaseModule(onPreviousTutorialButtonClick.read());
                }
                easycashMCMCDetailCaseModule = this.MediaSessionCompat$Token;
            }
            return easycashMCMCDetailCaseModule;
        }

        public final FragmentBuilder_BindTempLimitReviewFragment setTitle() {
            onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
            return new FragmentBuilder_BindSuccessQuickOperationFragment(new StateConnectedPokerchipPresenter(onPreviousTutorialButtonClick.read()));
        }

        public final FragmentBuilder_BindTouchPointInputCidFragment ListMenuItemView() {
            onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
            return new FragmentBuilder_BindTopUpTabFragment(new StateConnectedPreviewPanelPresenter(onPreviousTutorialButtonClick.read()));
        }

        public final FragmentBuilder_BindOtpPinFragment<FragmentBuilder_BindPurchaseProfileManagementFragment, FragmentBuilder_BindQuantityPointsPlusMoneyFragment> MediaBrowserCompat$CustomActionResultReceiver() {
            return new FragmentBuilder_BindRemittanceFavouriteTargetFragment(setActionBarHideOffset());
        }

        public final FragmentBuilder_BindPayNowSuccessFragment<FragmentBuilder_BindPurchaseProfileManagementFragment, FragmentBuilder_BindQuantityPointsPlusMoneyFragment> read() {
            FragmentBuilder_BindRegistrationSuccessFragment fragmentBuilder_BindRegistrationSuccessFragment;
            synchronized (this) {
                fragmentBuilder_BindRegistrationSuccessFragment = new FragmentBuilder_BindRegistrationSuccessFragment(setStackedBackground().getAllowedInteractionsApi());
            }
            return fragmentBuilder_BindRegistrationSuccessFragment;
        }

        public final ServiceInterfaceProvider setStackedBackground() {
            ServiceInterfaceProvider serviceInterfaceProvider;
            synchronized (this) {
                if (this.AlertController$RecycleListView == null) {
                    onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
                    this.AlertController$RecycleListView = new ServiceInterfaceProviderImpl(onPreviousTutorialButtonClick.read());
                }
                serviceInterfaceProvider = this.AlertController$RecycleListView;
            }
            return serviceInterfaceProvider;
        }

        private BasePartialSearchActivity_ViewBinding setActionBarHideOffset() {
            BasePartialSearchActivity_ViewBinding basePartialSearchActivity_ViewBinding;
            Context MediaMetadataCompat2;
            synchronized (this) {
                try {
                    if (this.MediaSessionCompat$QueueItem == null && (MediaMetadataCompat2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat()) != null) {
                        this.MediaSessionCompat$QueueItem = new BaseReviewActivity(MediaMetadataCompat2);
                    }
                    basePartialSearchActivity_ViewBinding = this.MediaSessionCompat$QueueItem;
                } catch (Exception e) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                    return null;
                }
            }
            return basePartialSearchActivity_ViewBinding;
        }

        public final FragmentBuilder_BindOPRStatusUnregisteredUserFragment AbsActionBarView() {
            try {
                BasePartialSearchActivity_ViewBinding actionBarHideOffset = setActionBarHideOffset();
                Context MediaMetadataCompat2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat();
                if (actionBarHideOffset == null || MediaMetadataCompat2 == null) {
                    return null;
                }
                return new C6610x1f6da9d4(MediaMetadataCompat2, new FragmentBuilder_BindOnboardingAdressInformationFragment(actionBarHideOffset));
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        }

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final FragmentBuilder_BindNTBBankingServiceFragment mo16860x50fd9e4a() {
            try {
                BasePartialSearchActivity_ViewBinding actionBarHideOffset = setActionBarHideOffset();
                Context MediaMetadataCompat2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat();
                if (this.MediaSessionCompat$QueueItem == null || MediaMetadataCompat2 == null) {
                    return null;
                }
                return new FragmentBuilder_BindNsipPartnerPaymentSuccessFragment(MediaMetadataCompat2, new FragmentBuilder_BindNTBLifestyleLandingFragment(actionBarHideOffset));
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        }

        public final FragmentBuilder_BindSharingMomentsPreviewFragment setVisibility() {
            try {
                return ActionBarOverlayLayout();
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        }

        public final FragmentBuilder_BindSetupQuickBalanceFragment AppCompatDelegateImpl$ListMenuDecorView() {
            try {
                return ActionBarOverlayLayout();
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        }

        public final FragmentBuilder_BindPreregistrationPinFragment AlertController$RecycleListView() {
            FragmentBuilder_BindPreregistrationPinFragment fragmentBuilder_BindPreregistrationPinFragment;
            synchronized (this) {
                try {
                    if (this.MediaDescriptionCompat == null) {
                        onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
                        this.MediaDescriptionCompat = new FragmentBuilder_BindProductListFragment(onPreviousTutorialButtonClick.read());
                    }
                    fragmentBuilder_BindPreregistrationPinFragment = this.MediaDescriptionCompat;
                } catch (Exception e) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                    return null;
                }
            }
            return fragmentBuilder_BindPreregistrationPinFragment;
        }

        private Retrofit IconCompatParcelizer(boolean z) {
            onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
            String MediaDescriptionCompat2 = FragmentBuilder_BindOnboardingInputAddressFragment.MediaDescriptionCompat(onPreviousTutorialButtonClick.read().MediaBrowserCompat$ItemReceiver());
            if (MediaDescriptionCompat2 == null || MediaDescriptionCompat2.isEmpty()) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMileageQuantitySelectionFragment.MISSING_THINSTANCE);
                return null;
            }
            return new Retrofit.Builder().baseUrl(MediaDescriptionCompat2).client(z ? setHideOnContentScrollEnabled() : ParcelableVolumeInfo()).addConverterFactory(GsonConverterFactory.create()).build();
        }

        public final ReviewDocumentActivity MediaMetadataCompat() {
            Retrofit IconCompatParcelizer2 = IconCompatParcelizer(false);
            OneClientAuthentication oneClientAuthentication = IconCompatParcelizer2 != null ? (OneClientAuthentication) IconCompatParcelizer2.create(OneClientAuthentication.class) : null;
            if (oneClientAuthentication == null) {
                return null;
            }
            onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
            return new FragmentBuilder_BindNtbUserInfoFragment(oneClientAuthentication, onPreviousTutorialButtonClick.read());
        }

        public final Activity setChecked() {
            try {
                onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
                return FragmentBuilder_BindModifyQuickBalanceFragment.MediaBrowserCompat$CustomActionResultReceiver(onPreviousTutorialButtonClick.read().MediaBrowserCompat$ItemReceiver());
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        }

        public final onImageClicked setIcon() {
            Context MediaMetadataCompat2 = FragmentBuilder_BindHmlIssuerLandingFragment.MediaMetadataCompat();
            MyECouponActivity myECouponActivity = MediaMetadataCompat2 != null ? new MyECouponActivity(MediaMetadataCompat2) : null;
            if (myECouponActivity != null) {
                return new FragmentBuilder_BindSuitabilityQuestionsPart1Fragment(myECouponActivity);
            }
            return null;
        }

        public final ReviewDocumentActivity setSplitBackground() {
            Retrofit IconCompatParcelizer2 = IconCompatParcelizer(true);
            OneClientAuthentication oneClientAuthentication = IconCompatParcelizer2 != null ? (OneClientAuthentication) IconCompatParcelizer2.create(OneClientAuthentication.class) : null;
            if (oneClientAuthentication == null) {
                return null;
            }
            onPreviousTutorialButtonClick onprevioustutorialbuttonclick = onPreviousTutorialButtonClick.read;
            return new FragmentBuilder_BindNtbUserInfoFragment(oneClientAuthentication, onPreviousTutorialButtonClick.read());
        }
    }
}
