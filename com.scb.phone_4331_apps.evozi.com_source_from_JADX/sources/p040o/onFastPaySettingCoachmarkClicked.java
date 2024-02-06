package p040o;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import p040o.FragmentBuilder_BindIssuerInputFragment;
import p040o.closeTutorial;

/* renamed from: o.onFastPaySettingCoachmarkClicked */
public final class onFastPaySettingCoachmarkClicked extends SQLiteOpenHelper {
    private final List<FullScreenLoadingActivity> MediaBrowserCompat$CustomActionResultReceiver;
    final List<String> write;

    /* renamed from: o.onFastPaySettingCoachmarkClicked$IconCompatParcelizer */
    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundFactSheetActivity<SQLiteDatabase, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ onFastPaySettingCoachmarkClicked IconCompatParcelizer;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(onFastPaySettingCoachmarkClicked onfastpaysettingcoachmarkclicked) {
            super(1);
            this.IconCompatParcelizer = onfastpaysettingcoachmarkclicked;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            onGetStartedClick.write((Object) sQLiteDatabase, "it");
            for (String execSQL : this.IconCompatParcelizer.write) {
                sQLiteDatabase.execSQL(execSQL);
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.onFastPaySettingCoachmarkClicked$MediaMetadataCompat */
    static final class MediaMetadataCompat extends CheckEligibilityActivity implements FundFactSheetActivity<SQLiteDatabase, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ List MediaBrowserCompat$ItemReceiver;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(List list) {
            super(1);
            this.MediaBrowserCompat$ItemReceiver = list;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            SQLiteDatabase sQLiteDatabase = (SQLiteDatabase) obj;
            onGetStartedClick.write((Object) sQLiteDatabase, "it");
            for (FullScreenLoadingActivity MediaBrowserCompat$CustomActionResultReceiver : this.MediaBrowserCompat$ItemReceiver) {
                FragmentBuilder_BindIssuerInputFragment<Exception, Boolean> MediaBrowserCompat$CustomActionResultReceiver2 = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver(sQLiteDatabase);
                if (MediaBrowserCompat$CustomActionResultReceiver2 instanceof FragmentBuilder_BindIssuerInputFragment.write) {
                    throw ((Exception) ((FragmentBuilder_BindIssuerInputFragment.write) MediaBrowserCompat$CustomActionResultReceiver2).write);
                } else if (!(MediaBrowserCompat$CustomActionResultReceiver2 instanceof FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer)) {
                    throw new NoWhenBranchMatchedException();
                } else if (!((Boolean) ((FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) MediaBrowserCompat$CustomActionResultReceiver2).MediaBrowserCompat$ItemReceiver).booleanValue()) {
                    throw new read(FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATION_STRATEGY_FAILURE);
                }
            }
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* renamed from: o.onFastPaySettingCoachmarkClicked$write */
    static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<SQLiteDatabase, HmlVerifyPhoneValidateOtpActivity> {
        private /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ String read;
        private /* synthetic */ SQLiteDatabase write;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        write(SQLiteDatabase sQLiteDatabase, String str, String str2) {
            super(1);
            this.write = sQLiteDatabase;
            this.read = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            onGetStartedClick.write((Object) (SQLiteDatabase) obj, "it");
            new ErrorPageActivity_ViewBinding().read(this.write, this.read, this.MediaBrowserCompat$CustomActionResultReceiver);
            return HmlVerifyPhoneValidateOtpActivity.MediaBrowserCompat$ItemReceiver;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public onFastPaySettingCoachmarkClicked(Context context, String str, List<String> list, List<? extends FullScreenLoadingActivity> list2) {
        super(context, str, (SQLiteDatabase.CursorFactory) null, 3);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) list, "schemaStatements");
        onGetStartedClick.write((Object) list2, "sqliteMigrations");
        this.write = list;
        this.MediaBrowserCompat$CustomActionResultReceiver = list2;
    }

    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        if (sQLiteDatabase != null) {
            try {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.CREATE_SQLITE_THUNDERHEAD_DB, new Object[0]);
                FundFactSheetActivity iconCompatParcelizer = new IconCompatParcelizer(this);
                onGetStartedClick.write((Object) sQLiteDatabase, "$this$transaction");
                onGetStartedClick.write((Object) iconCompatParcelizer, "block");
                FragmentBuilder_BindIssuerInputFragment MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(new closeTutorial.IconCompatParcelizer(sQLiteDatabase, iconCompatParcelizer));
                if (MediaBrowserCompat$CustomActionResultReceiver2 instanceof FragmentBuilder_BindIssuerInputFragment.write) {
                    MyECouponActivity_ViewBinding.read((Exception) ((FragmentBuilder_BindIssuerInputFragment.write) MediaBrowserCompat$CustomActionResultReceiver2).write, FragmentBuilder_BindMailingAddressSuccessfulFragment.SQLITE_THUNDERHEAD_DB_ONCREATE_ERROR);
                } else if (MediaBrowserCompat$CustomActionResultReceiver2 instanceof FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.CREATE_COMPLETE_SQLITE_THUNDERHEAD_DB, new Object[0]);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.read(e, FragmentBuilder_BindMailingAddressSuccessfulFragment.SQLITE_THUNDERHEAD_DB_ONCREATE_ERROR);
            }
        } else {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.NULL_SQLITE_THUNDERHEAD_DB_ONCREATE);
        }
    }

    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        if (sQLiteDatabase == null) {
            try {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.NULL_SQLITE_THUNDERHEAD_DB_UPGRADE);
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        } else {
            if (i == 2) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.ATTEMPT_VERSION_2_PROPERTIES_FIX_START, new Object[0]);
                FragmentBuilder_BindJuristicOnboardingLandingFragment<OnBoardingTutorialActivity> customView = FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView();
                onGetStartedClick.IconCompatParcelizer((Object) customView, "OneInternalProvider.getStateStore()");
                OnBoardingTutorialActivity MediaBrowserCompat$ItemReceiver = customView.MediaBrowserCompat$ItemReceiver();
                onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "OneInternalProvider.getStateStore().state");
                OnBoardingTutorialActivity onBoardingTutorialActivity = MediaBrowserCompat$ItemReceiver;
                FundFactSheetActivity write2 = new write(sQLiteDatabase, FragmentBuilder_BindOnboardingInputAddressFragment.MediaBrowserCompat$ItemReceiver().invoke(onBoardingTutorialActivity), FragmentBuilder_BindOnboardingInputAddressFragment.MediaDescriptionCompat().invoke(onBoardingTutorialActivity));
                onGetStartedClick.write((Object) sQLiteDatabase, "$this$transaction");
                onGetStartedClick.write((Object) write2, "block");
                FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(new closeTutorial.IconCompatParcelizer(sQLiteDatabase, write2));
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.ATTEMPT_VERSION_2_PROPERTIES_FIX_STOP, new Object[0]);
            }
            Collection arrayList = new ArrayList();
            Iterator it = this.MediaBrowserCompat$CustomActionResultReceiver.iterator();
            while (true) {
                boolean z = true;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                FullScreenLoadingActivity fullScreenLoadingActivity = (FullScreenLoadingActivity) next;
                if (fullScreenLoadingActivity.read() < i || fullScreenLoadingActivity.MediaBrowserCompat$ItemReceiver() > i2) {
                    z = false;
                }
                if (z) {
                    arrayList.add(next);
                }
            }
            List write3 = HmlNTBBusinessURLInformationActivity.write((List) arrayList, new C7321xdb4572f0());
            if (i2 - i != write3.size()) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.UNANTICIPATED_MIGRATION_STRATEGIES_FOUND);
                return;
            }
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_DATABASE_START, Integer.valueOf(i), Integer.valueOf(i2));
            FundFactSheetActivity mediaMetadataCompat = new MediaMetadataCompat(write3);
            onGetStartedClick.write((Object) sQLiteDatabase, "$this$transaction");
            onGetStartedClick.write((Object) mediaMetadataCompat, "block");
            FragmentBuilder_BindIssuerInputFragment MediaBrowserCompat$CustomActionResultReceiver2 = FragmentBuilder_BindInvestmentFundDetailFragment.MediaBrowserCompat$CustomActionResultReceiver(new closeTutorial.IconCompatParcelizer(sQLiteDatabase, mediaMetadataCompat));
            if (MediaBrowserCompat$CustomActionResultReceiver2 instanceof FragmentBuilder_BindIssuerInputFragment.write) {
                MyECouponActivity_ViewBinding.read((Exception) ((FragmentBuilder_BindIssuerInputFragment.write) MediaBrowserCompat$CustomActionResultReceiver2).write, FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATION_STRATEGY_FAILURE);
            } else if (MediaBrowserCompat$CustomActionResultReceiver2 instanceof FragmentBuilder_BindIssuerInputFragment.IconCompatParcelizer) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMailingAddressSuccessfulFragment.MIGRATE_DATABASE_STOP, Integer.valueOf(i), Integer.valueOf(i2));
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    /* renamed from: o.onFastPaySettingCoachmarkClicked$read */
    static final class read extends RuntimeException {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public read(FragmentBuilder_BindMerchantWalletSelectorFragment fragmentBuilder_BindMerchantWalletSelectorFragment) {
            super(fragmentBuilder_BindMerchantWalletSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver());
            onGetStartedClick.write((Object) fragmentBuilder_BindMerchantWalletSelectorFragment, "systemCode");
        }
    }
}
