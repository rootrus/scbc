package p040o;

import android.content.Context;
import android.content.SharedPreferences;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Set;
import p040o.FragmentBuilder_BindJuristicOnboardingLandingFragment;

/* renamed from: o.ECouponDetailActivity_ViewBinding */
public class ECouponDetailActivity_ViewBinding implements CreateRecipientGroupActivity, OnBoardingTutorialActivity_ViewBinding {
    private WeakReference<Context> IconCompatParcelizer;
    private SharedPreferences MediaBrowserCompat$CustomActionResultReceiver;
    String MediaBrowserCompat$ItemReceiver = "";
    private FragmentBuilder_BindJuristicOnboardingLandingFragment.read MediaDescriptionCompat;
    private SharedPreferences.Editor read;
    String write = "";

    public ECouponDetailActivity_ViewBinding(Context context) {
        if (context != null) {
            this.IconCompatParcelizer = new WeakReference<>(context.getApplicationContext());
        } else {
            this.IconCompatParcelizer = new WeakReference<>(context);
        }
        this.MediaDescriptionCompat = HomeActivity.write(FragmentBuilder_BindHmlIssuerLandingFragment.setCustomView(), new SelectPurchasesActivity(this));
    }

    /* access modifiers changed from: package-private */
    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        TempLimitHomeActivity tempLimitHomeActivity = new TempLimitHomeActivity(str2, str);
        SharedPreferences.Editor IconCompatParcelizer2 = IconCompatParcelizer();
        if (IconCompatParcelizer2 != null) {
            try {
                tempLimitHomeActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        } else {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES_EDIT);
        }
    }

    /* access modifiers changed from: package-private */
    public final void write(boolean z, String str) {
        StatementChannelLandingActivity statementChannelLandingActivity = new StatementChannelLandingActivity(str, z);
        SharedPreferences.Editor IconCompatParcelizer2 = IconCompatParcelizer();
        if (IconCompatParcelizer2 != null) {
            try {
                statementChannelLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        } else {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES_EDIT);
        }
    }

    /* renamed from: t_ */
    public final void mo16307t_(String str) {
        TempLimitHomeActivity tempLimitHomeActivity = new TempLimitHomeActivity(MediaBrowserCompat$SearchResultReceiver(), str);
        SharedPreferences.Editor IconCompatParcelizer2 = IconCompatParcelizer();
        if (IconCompatParcelizer2 != null) {
            try {
                tempLimitHomeActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        } else {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES_EDIT);
        }
        try {
            if (!"".equals((String) write(TempLimitConfirmationActivity.MediaBrowserCompat$CustomActionResultReceiver))) {
                TempLimitHomeActivity tempLimitHomeActivity2 = new TempLimitHomeActivity("tid-preference", "");
                SharedPreferences.Editor IconCompatParcelizer3 = IconCompatParcelizer();
                if (IconCompatParcelizer3 != null) {
                    try {
                        tempLimitHomeActivity2.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer3);
                    } catch (Exception e2) {
                        MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e2);
                    }
                } else {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES_EDIT);
                }
            }
        } catch (Exception unused) {
            TempLimitHomeActivity tempLimitHomeActivity3 = new TempLimitHomeActivity("tid-preference", "");
            SharedPreferences.Editor IconCompatParcelizer4 = IconCompatParcelizer();
            if (IconCompatParcelizer4 != null) {
                try {
                    tempLimitHomeActivity3.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer4);
                } catch (Exception e3) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e3);
                }
            } else {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES_EDIT);
            }
        }
    }

    static /* synthetic */ String read(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getString("tid-preference", "");
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return "";
        }
    }

    public final String MediaBrowserCompat$ItemReceiver() {
        String str = (String) write(new TermAndConditionStatementChannelActivity(this));
        if ((str == null || str.equals("")) && (str = (String) write(new StatementChannelCommonActivity(this))) != null && !str.isEmpty()) {
            mo16307t_(str);
            StatementChannelSuccessfulActivity statementChannelSuccessfulActivity = new StatementChannelSuccessfulActivity(this, read());
            SharedPreferences.Editor IconCompatParcelizer2 = IconCompatParcelizer();
            if (IconCompatParcelizer2 != null) {
                try {
                    statementChannelSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
                } catch (Exception e) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                }
            } else {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES_EDIT);
            }
        }
        if (str != null) {
            return str;
        }
        return "";
    }

    public final /* synthetic */ String MediaBrowserCompat$CustomActionResultReceiver(SharedPreferences sharedPreferences) {
        try {
            String string = sharedPreferences.getString(MediaBrowserCompat$SearchResultReceiver(), "");
            if (string != null) {
                if (!"".equals(string)) {
                    return string;
                }
            }
            return sharedPreferences.getString("tid-preference", "");
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return "";
        }
    }

    public final /* synthetic */ String IconCompatParcelizer(SharedPreferences sharedPreferences) {
        try {
            String string = sharedPreferences.getString(read(), "");
            if (string != null) {
                if (!"".equals(string)) {
                    return string;
                }
            }
            return sharedPreferences.getString("tid-preference", "");
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return "";
        }
    }

    private String read() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("-");
        sb.append("tid-preference");
        return sb.toString();
    }

    private String MediaBrowserCompat$SearchResultReceiver() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append("-");
        sb.append(this.write);
        sb.append("-");
        sb.append("tid-preference");
        return sb.toString();
    }

    public final boolean MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment) {
        return Boolean.TRUE.equals((Boolean) write(new DeejungTransferInstallmentsConfirmationActivity(this, fragmentBuilder_BindHmlNtbOutcomeRejectFragment, fragmentBuilder_BindHmlOperatingBankFragment)));
    }

    public final void read(String str, String str2) {
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            MyECouponActivity_ViewBinding.write("App install sent but not saved due to missing sitekey/host.");
            return;
        }
        StatementChannelLandingActivity statementChannelLandingActivity = new StatementChannelLandingActivity(write(str, str2), true);
        SharedPreferences.Editor IconCompatParcelizer2 = IconCompatParcelizer();
        if (IconCompatParcelizer2 != null) {
            try {
                statementChannelLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        } else {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES_EDIT);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        Set<String> set = (Set) write(StatementChannelChooseAddressActivity.write);
        if (set != null) {
            for (String str : set) {
                if (str.contains("tid-preference")) {
                    StatementChannelSuccessfulActivity statementChannelSuccessfulActivity = new StatementChannelSuccessfulActivity(this, str);
                    SharedPreferences.Editor IconCompatParcelizer2 = IconCompatParcelizer();
                    if (IconCompatParcelizer2 != null) {
                        try {
                            statementChannelSuccessfulActivity.MediaBrowserCompat$CustomActionResultReceiver(IconCompatParcelizer2);
                        } catch (Exception e) {
                            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                        }
                    } else {
                        MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES_EDIT);
                    }
                }
            }
        }
    }

    static /* synthetic */ Set MediaBrowserCompat$ItemReceiver(SharedPreferences sharedPreferences) {
        try {
            return sharedPreferences.getAll().keySet();
        } catch (Exception e) {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            return new HashSet(0);
        }
    }

    public void disconnect() {
        FragmentBuilder_BindJuristicOnboardingLandingFragment.read read2 = this.MediaDescriptionCompat;
        if (read2 != null) {
            read2.read();
        }
    }

    /* access modifiers changed from: protected */
    public final <T> T write(FragmentBuilder_BindIssuerSearchFragment<SharedPreferences, T> fragmentBuilder_BindIssuerSearchFragment) {
        SharedPreferences write2 = write();
        if (write2 != null) {
            try {
                return fragmentBuilder_BindIssuerSearchFragment.read(write2);
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return null;
            }
        } else {
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES_QUERY);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public final SharedPreferences write() {
        SharedPreferences sharedPreferences;
        synchronized (this) {
            if (this.MediaBrowserCompat$CustomActionResultReceiver == null) {
                Context context = this.IconCompatParcelizer.get();
                if (context != null) {
                    this.MediaBrowserCompat$CustomActionResultReceiver = context.getSharedPreferences("thunderhead", 0);
                } else {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_CONTEXT);
                }
            }
            sharedPreferences = this.MediaBrowserCompat$CustomActionResultReceiver;
        }
        return sharedPreferences;
    }

    /* access modifiers changed from: package-private */
    public final SharedPreferences.Editor IconCompatParcelizer() {
        SharedPreferences.Editor editor;
        synchronized (this) {
            if (this.read == null) {
                SharedPreferences write2 = write();
                if (write2 != null) {
                    this.read = write2.edit();
                } else {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindMerchantWalletMoreInfoFragment.NULL_SHARED_PREFERENCES);
                }
            }
            editor = this.read;
        }
        return editor;
    }

    public final void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindHowToAddFavouriteTopUpFragment<Boolean> fragmentBuilder_BindHowToAddFavouriteTopUpFragment) {
        new Thread(new DeejungTermsAndConditionsActivity(this, fragmentBuilder_BindHowToAddFavouriteTopUpFragment)).start();
    }

    private static String write(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append("-");
        sb.append(str2);
        sb.append("-");
        sb.append("one-sent-install-interaction");
        return sb.toString();
    }

    public final /* synthetic */ Boolean read(FragmentBuilder_BindHmlNtbOutcomeRejectFragment fragmentBuilder_BindHmlNtbOutcomeRejectFragment, FragmentBuilder_BindHmlOperatingBankFragment fragmentBuilder_BindHmlOperatingBankFragment, SharedPreferences sharedPreferences) {
        String str;
        if (fragmentBuilder_BindHmlNtbOutcomeRejectFragment != null) {
            try {
                str = fragmentBuilder_BindHmlNtbOutcomeRejectFragment.read;
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                return Boolean.FALSE;
            }
        } else {
            str = this.MediaBrowserCompat$ItemReceiver;
        }
        return Boolean.valueOf(sharedPreferences.getBoolean(write(str, fragmentBuilder_BindHmlOperatingBankFragment != null ? fragmentBuilder_BindHmlOperatingBankFragment.write.getHost() : this.write), false));
    }
}
