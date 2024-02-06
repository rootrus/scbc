package com.scb.phone;

import android.app.Activity;
import android.app.Service;
import android.content.SharedPreferences;
import android.os.StrictMode;
import androidx.fragment.app.Fragment;
import com.google.firebase.FirebaseApp;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.google.firebase.iid.FirebaseInstanceId;
import com.kofax.kmc.kut.utilities.AppContextProvider;
import dagger.android.DispatchingAndroidInjector;
import p039io.github.inflationx.calligraphy3.CalligraphyConfig;
import p039io.github.inflationx.calligraphy3.CalligraphyInterceptor;
import p040o.AlertController$RecycleListView;
import p040o.C1186x3feeced0;
import p040o.C1190x3ac82dc9;
import p040o.C1191xb6fc3e3c;
import p040o.FragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment;
import p040o.FragmentBuilder_BindETBCheckIdentityFragment;
import p040o.FragmentBuilder_BindHmlExternalInstructionFragment;
import p040o.FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment;
import p040o.FragmentBuilder_BindHmlMoaFragment;
import p040o.FragmentBuilder_BindHmlNTBOccupationInfoFragment;
import p040o.FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlLaserIdAboutActivity;
import p040o.HmlNTBAdditionalDocumentActivity;
import p040o.HmlNTBApplyLoanEntryActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.MileageConfirmRedemptionActivity;
import p040o.MileageQuantitySelectionActivity_ViewBinding;
import p040o.MileageReviewRedemptionActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ProductDetailActivity;
import p040o.ZHER2;
import p040o.getFactory;
import p040o.getIdType;
import p040o.onCheckBoxClick;
import p040o.onCheckBoxClick$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.onFacebookMessengerClick;
import p040o.onGetStartedClick;
import p040o.setConstraintSet;
import p040o.validateTPMV;
import p040o.zzmd;

public class AndroidApplication extends setConstraintSet implements MileageConfirmRedemptionActivity, ProductDetailActivity, MileageReviewRedemptionActivity {
    public boolean IconCompatParcelizer;
    public FragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment MediaBrowserCompat$ItemReceiver;
    @HmlPinActivity
    public DispatchingAndroidInjector<Activity> activityDispatchingAndroidInjector;
    @HmlPinActivity
    public CalligraphyConfig calligraphyConfig;
    @HmlPinActivity
    public DispatchingAndroidInjector<Fragment> fragmentDispatchingAndroidInjector;
    @HmlPinActivity
    public getIdType iDeviceCompatibilityHelper;
    @HmlPinActivity
    public FragmentBuilder_BindETBCheckIdentityFragment salesforceManager;
    @HmlPinActivity
    public DispatchingAndroidInjector<Service> serviceDispatchingAndroidInjector;
    @HmlPinActivity
    public SharedPreferences sharedPreferences;

    public void onCreate() {
        super.onCreate();
        StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().build());
        validateTPMV.MediaBrowserCompat$ItemReceiver(this);
        zzmd.zzl.setNavigationIcon setnavigationicon = new zzmd.zzl.setNavigationIcon((byte) 0);
        setnavigationicon.MediaBrowserCompat$ItemReceiver(this);
        setnavigationicon.read().IconCompatParcelizer(this);
        onCheckBoxClick.IconCompatParcelizer("Enter FirebaseCrashlytics", new Object[0]);
        FirebaseCrashlytics.getInstance().setCrashlyticsCollectionEnabled(true);
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver((onCheckBoxClick$MediaBrowserCompat$CustomActionResultReceiver) new ZHER2());
        onCheckBoxClick.read(getApplicationContext().getPackageName(), new Object[0]);
        if (this.iDeviceCompatibilityHelper.read()) {
            onFacebookMessengerClick.write MediaBrowserCompat$ItemReceiver2 = onFacebookMessengerClick.MediaBrowserCompat$ItemReceiver();
            CalligraphyInterceptor calligraphyInterceptor = new CalligraphyInterceptor(this.calligraphyConfig);
            onGetStartedClick.write((Object) calligraphyInterceptor, "interceptor");
            onFacebookMessengerClick.write write = MediaBrowserCompat$ItemReceiver2;
            write.write.add(calligraphyInterceptor);
            onFacebookMessengerClick.MediaBrowserCompat$ItemReceiver(write.MediaBrowserCompat$CustomActionResultReceiver());
        }
        FragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment fragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment = new FragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment();
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment;
        registerActivityLifecycleCallbacks(fragmentBuilder_BindBaseEasycashFeaturesLoanInformationFragment);
        HmlLaserIdAboutActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
        HmlNTBAdditionalDocumentActivity.IconCompatParcelizer iconCompatParcelizer = new HmlNTBAdditionalDocumentActivity.IconCompatParcelizer();
        iconCompatParcelizer.read = 1;
        iconCompatParcelizer.MediaBrowserCompat$ItemReceiver = new HmlNTBApplyLoanEntryActivity();
        HmlLaserIdAboutActivity.MediaBrowserCompat$ItemReceiver(iconCompatParcelizer.read());
        if (this.iDeviceCompatibilityHelper.read()) {
            AppContextProvider.setContext(this);
        }
        FundFactSheetActivity iconCompatParcelizer2 = new FragmentBuilder_BindETBCheckIdentityFragment.IconCompatParcelizer(this.salesforceManager);
        onGetStartedClick.write((Object) iconCompatParcelizer2, "initializer");
        onGetStartedClick.write((Object) iconCompatParcelizer2, "initializer");
        C1190x3ac82dc9 fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver = new C1190x3ac82dc9();
        iconCompatParcelizer2.invoke(fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver);
        FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.write(fragmentBuilder_BindHmlNTBManageEmailVerificationFragment$MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$CustomActionResultReceiver());
        int i = FragmentBuilder_BindHmlExternalInstructionFragment.C11872.write[FragmentBuilder_BindHmlMoaFragment.ALL.ordinal()];
        if (i == 1) {
            MyECouponActivity_ViewBinding.read(MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver);
        } else if (i == 2) {
            MyECouponActivity_ViewBinding.read(MyECouponActivity_ViewBinding.IconCompatParcelizer);
        } else if (i == 3) {
            MyECouponActivity_ViewBinding.read(MyECouponActivity_ViewBinding.write);
        } else if (i == 4) {
            MyECouponActivity_ViewBinding.read(MyECouponActivity_ViewBinding.read);
        }
        FundFactSheetActivity fundFactSheetActivity = FragmentBuilder_BindETBCheckIdentityFragment.read.write;
        onGetStartedClick.write((Object) fundFactSheetActivity, "initializer");
        FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.MediaBrowserCompat$CustomActionResultReceiver(AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((FundFactSheetActivity<? super FragmentBuilder_BindHmlNTBVerifyEmailSuccessfulFragment.read, HmlVerifyPhoneValidateOtpActivity>) fundFactSheetActivity));
        FundFactSheetActivity fundFactSheetActivity2 = C1186x3feeced0.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) fundFactSheetActivity2, "initializer");
        onGetStartedClick.write((Object) fundFactSheetActivity2, "initializer");
        C1191xb6fc3e3c fragmentBuilder_BindHmlNTBOccupationInfoFragment$MediaBrowserCompat$CustomActionResultReceiver = new C1191xb6fc3e3c();
        fundFactSheetActivity2.invoke(fragmentBuilder_BindHmlNTBOccupationInfoFragment$MediaBrowserCompat$CustomActionResultReceiver);
        Boolean bool = fragmentBuilder_BindHmlNTBOccupationInfoFragment$MediaBrowserCompat$CustomActionResultReceiver.write;
        FragmentBuilder_BindHmlHmlNTBVerifyEmailFragment.write(new FragmentBuilder_BindHmlNTBOccupationInfoFragment(bool != null ? bool.booleanValue() : false, (byte) 0));
        FirebaseApp.initializeApp(this);
        FirebaseInstanceId.getInstance().getInstanceId().addOnSuccessListener(new getFactory.write(this));
        String string = this.sharedPreferences.getString("BASE_URL", "");
        String string2 = this.sharedPreferences.getString("BASE_STATIC_URL", "");
        String string3 = this.sharedPreferences.getString("BASE_ASSETS_URL", "");
        if (!string.equalsIgnoreCase("https://fasteasy.scbeasy.com:8443/") || !string2.equalsIgnoreCase("https://fasteasy.scbeasy.com:8888/") || !string3.equalsIgnoreCase("https://fasteasy.scbeasy.com:8888/portalserver/content/bbp/repositories/contentRepository?path=")) {
            this.sharedPreferences.edit().putString("BASE_URL", "https://fasteasy.scbeasy.com:8443/").putString("BASE_STATIC_URL", "https://fasteasy.scbeasy.com:8888/").putString("BASE_ASSETS_URL", "https://fasteasy.scbeasy.com:8888/portalserver/content/bbp/repositories/contentRepository?path=").commit();
        }
    }

    public final MileageQuantitySelectionActivity_ViewBinding<Activity> write() {
        return this.activityDispatchingAndroidInjector;
    }

    public final MileageQuantitySelectionActivity_ViewBinding<Fragment> MediaBrowserCompat$CustomActionResultReceiver() {
        return this.fragmentDispatchingAndroidInjector;
    }

    public final MileageQuantitySelectionActivity_ViewBinding<Service> IconCompatParcelizer() {
        return this.serviceDispatchingAndroidInjector;
    }
}
