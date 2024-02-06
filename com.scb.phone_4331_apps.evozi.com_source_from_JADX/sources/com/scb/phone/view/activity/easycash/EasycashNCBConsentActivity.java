package com.scb.phone.view.activity.easycash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import butterknife.ButterKnife;
import com.google.gson.annotations.SerializedName;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.creditpower.EasycashCreditPowerInformationActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.TermsAndConditionsFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AlertController$RecycleListView;
import p040o.C7283oN;
import p040o.C7340pB;
import p040o.C7341pC;
import p040o.C7342pD;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.CustomConcurrentHashMap;
import p040o.FragmentBuilder_BindCustomizeYourPageFragment;
import p040o.HmlPinActivity;
import p040o.Image;
import p040o.Iterables$3$MediaBrowserCompat$MediaItem;
import p040o.Multisets;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$2300;
import p040o.arbitrary;
import p040o.asGzippedBytes;
import p040o.getBitsPerChannel;
import p040o.getBitsPerChannel$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getBitsPerChannel$MediaBrowserCompat$ItemReceiver;
import p040o.getHash;
import p040o.getPreviousEvictable;
import p040o.immediateFailedFuture;
import p040o.onGetStartedClick;
import p040o.onShutter;
import p040o.performUpdateApp;
import p040o.setImagePerfectProfileUsed;
import p040o.setMaxGapFrames;
import p040o.setTapText;

public class EasycashNCBConsentActivity extends BaseActivity implements FragmentBuilder_BindCustomizeYourPageFragment, CheckExtractActivity_MembersInjector.MenuItemImpl {
    private boolean MediaMetadataCompat = false;
    @HmlPinActivity
    public getBitsPerChannel presenter;

    public final void MediaBrowserCompat$SearchResultReceiver() {
    }

    public static void IconCompatParcelizer(Activity activity, String str, String str2, String str3, String str4, List<performUpdateApp> list, boolean z) {
        Intent intent = new Intent(activity, EasycashNCBConsentActivity.class);
        intent.putExtra("EXTRA_MONTHLY_INCOME", str3);
        intent.putExtra("EXTRA_MONTHLY_PAYMENT", str4);
        intent.putExtra("EXTRA_DIRECT_TO_PIN_LOGIN", z);
        intent.putExtra("EXTRA_PRODUCT_TYPE", (String) null);
        intent.putExtra("EXTRA_PHONE_NUMBER", (String) null);
        intent.putExtra("EXTRA_LENDING_TILE", (Parcelable) null);
        intent.putExtra("EXTRA_PRODUCT_GROUP", str);
        intent.putExtra("EXTRA_FLOW_TYPE", str2);
        intent.putParcelableArrayListExtra("EXTRA_CREDIT_POWER_TILE_LIST", new ArrayList(list));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(activity, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            activity.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f78992131493124);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.loan_verification_ncb_consent_label);
        setTabContainer();
        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            String string = extras.getString("EXTRA_PRODUCT_TYPE");
            String string2 = extras.getString("EXTRA_MONTHLY_INCOME");
            String string3 = extras.getString("EXTRA_PHONE_NUMBER");
            String string4 = extras.getString("EXTRA_APPLICATION_ID");
            String string5 = extras.getString("EXTRA_PRODUCT_PROGRAM");
            String string6 = extras.getString("EXTRA_PRODUCT_GROUP");
            String string7 = extras.getString("EXTRA_FLOW_TYPE");
            ArrayList parcelableArrayListExtra = getIntent().getParcelableArrayListExtra("EXTRA_CREDIT_POWER_TILE_LIST");
            String string8 = extras.getString("EXTRA_MONTHLY_PAYMENT");
            this.presenter.MediaBrowserCompat$ItemReceiver(this);
            getBitsPerChannel getbitsperchannel = this.presenter;
            if (getbitsperchannel.RatingCompat != null) {
                getbitsperchannel.RatingCompat.AlertController$RecycleListView();
            }
            getbitsperchannel.MediaBrowserCompat$MediaItem = string6;
            getbitsperchannel.MediaBrowserCompat$SearchResultReceiver = string;
            String str2 = "0.0";
            if (TextUtils.isEmpty(string2)) {
                str = str2;
            } else {
                str = string2.replace(",", "");
            }
            getbitsperchannel.MediaMetadataCompat = str;
            getbitsperchannel.read = parcelableArrayListExtra;
            if (!TextUtils.isEmpty(string8)) {
                str2 = string8.replace(",", "");
            }
            getbitsperchannel.ParcelableVolumeInfo = str2;
            char c = 65535;
            int hashCode = string6.hashCode();
            if (hashCode != -1876773857) {
                if (hashCode != 63893315) {
                    if (hashCode == 72606051 && string6.equals("LOANS")) {
                        c = 2;
                    }
                } else if (string6.equals("CARDS")) {
                    c = 1;
                }
            } else if (string6.equals("CREDIT_POWER")) {
                c = 0;
            }
            String str3 = "NCB_CONSENT";
            if (c == 0) {
                setMaxGapFrames setmaxgapframes = getbitsperchannel.MediaSessionCompat$QueueItem;
                arbitrary arbitrary = getbitsperchannel.write;
                List<performUpdateApp> list = getbitsperchannel.read;
                onGetStartedClick.write((Object) list, "list");
                if (list.size() != 1) {
                    str3 = "CREDIT_POWER_CONSENT";
                }
                Iterable<performUpdateApp> iterable = list;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (performUpdateApp performupdateapp : iterable) {
                    arrayList.add(new getHash(arbitrary.IconCompatParcelizer, performupdateapp.MediaSessionCompat$ResultReceiverWrapper, arbitrary.IconCompatParcelizer));
                }
                setmaxgapframes.IconCompatParcelizer(new getPreviousEvictable(str3, (List) arrayList));
                getbitsperchannel.MediaSessionCompat$QueueItem.IconCompatParcelizer(new getBitsPerChannel$MediaBrowserCompat$CustomActionResultReceiver(getbitsperchannel, (byte) 0));
            } else if (c == 1 || c == 2) {
                setMaxGapFrames setmaxgapframes2 = getbitsperchannel.MediaSessionCompat$QueueItem;
                CustomConcurrentHashMap.Segment write = CustomConcurrentHashMap.Segment.write();
                write.MediaBrowserCompat$CustomActionResultReceiver = str3;
                write.MediaBrowserCompat$SearchResultReceiver = string4;
                write.read = string;
                write.IconCompatParcelizer = string3;
                setmaxgapframes2.MediaBrowserCompat$ItemReceiver(write, !"NON_REFERRAL".equals(string7), "REFERRAL_UNSECURED".equals(string7));
                getbitsperchannel.MediaSessionCompat$QueueItem.IconCompatParcelizer(new getBitsPerChannel$MediaBrowserCompat$CustomActionResultReceiver(getbitsperchannel, (byte) 0));
            } else {
                getbitsperchannel.MediaSessionCompat$QueueItem.IconCompatParcelizer(Multisets.UnmodifiableMultiset.MediaBrowserCompat$CustomActionResultReceiver(string4, string, str3, string5));
                getbitsperchannel.MediaSessionCompat$QueueItem.IconCompatParcelizer(new getBitsPerChannel.write(getbitsperchannel, (byte) 0));
            }
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.loan_verification_ncb_consent_label);
        setTabContainer();
    }

    public void onBackPressed() {
        setResult(0, getIntent());
        super.onBackPressed();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 7134) {
            this.MediaMetadataCompat = true;
        } else if (i == 12032) {
            setResult(-1);
            finish();
        }
    }

    public void onResume() {
        super.onResume();
        if (this.MediaMetadataCompat) {
            getBitsPerChannel getbitsperchannel = this.presenter;
            if ("HOME".equals(getbitsperchannel.MediaBrowserCompat$MediaItem)) {
                String str = getbitsperchannel.MediaBrowserCompat$SearchResultReceiver;
                char c = 65535;
                if (str.hashCode() == 277399877 && str.equals("HOME_TOP_UP")) {
                    c = 0;
                }
                if (c == 0) {
                    setImagePerfectProfileUsed setimageperfectprofileused = new setImagePerfectProfileUsed(getbitsperchannel);
                    if (getbitsperchannel.RatingCompat != null) {
                        setimageperfectprofileused.IconCompatParcelizer(getbitsperchannel.RatingCompat);
                    }
                }
            } else if ("CREDIT_POWER".equals(getbitsperchannel.MediaBrowserCompat$MediaItem)) {
                if (getbitsperchannel.RatingCompat != null) {
                    getbitsperchannel.RatingCompat.AlertController$RecycleListView();
                }
                onShutter onshutter = getbitsperchannel.IconCompatParcelizer;
                String str2 = getbitsperchannel.MediaMetadataCompat;
                String MediaBrowserCompat$CustomActionResultReceiver = getbitsperchannel.MediaBrowserCompat$CustomActionResultReceiver(getbitsperchannel.ParcelableVolumeInfo);
                List<performUpdateApp> list = getbitsperchannel.read;
                boolean z = getbitsperchannel.MediaBrowserCompat$ItemReceiver;
                boolean z2 = getbitsperchannel.MediaDescriptionCompat;
                onGetStartedClick.write((Object) str2, "monthlyIncome");
                onGetStartedClick.write((Object) list, "list");
                Iterable<performUpdateApp> iterable = list;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (performUpdateApp performupdateapp : iterable) {
                    String str3 = performupdateapp.MediaSessionCompat$ResultReceiverWrapper;
                    if (str3 == null) {
                        str3 = "";
                    }
                    arrayList.add(str3);
                }
                onshutter.write(new Object(str2, MediaBrowserCompat$CustomActionResultReceiver, (List) arrayList, z2 ? null : z ? DiskLruCache.VERSION_1 : "0") {
                    @SerializedName("ncbAcceptedFlag")
                    private final String MediaBrowserCompat$CustomActionResultReceiver;
                    @SerializedName("productType")
                    private final List<String> MediaBrowserCompat$ItemReceiver;
                    @SerializedName("monthlyIncome")
                    private final String read;
                    @SerializedName("willingMonthlyPayment")
                    private final String write;

                    public final boolean equals(Object obj) {
                        if (this == obj) {
                            return true;
                        }
                        if (!(obj instanceof C32924)) {
                            return false;
                        }
                        C32924 r3 = (C32924) obj;
                        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver);
                    }

                    public final int hashCode() {
                        String str = this.read;
                        int i = 0;
                        int hashCode = str != null ? str.hashCode() : 0;
                        String str2 = this.write;
                        int hashCode2 = str2 != null ? str2.hashCode() : 0;
                        List<String> list = this.MediaBrowserCompat$ItemReceiver;
                        int hashCode3 = list != null ? list.hashCode() : 0;
                        String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
                        if (str3 != null) {
                            i = str3.hashCode();
                        }
                        return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
                    }

                    public final String toString() {
                        StringBuilder sb = new StringBuilder();
                        sb.append("CreditPowerNCBInquiryRequest(monthlyIncome=");
                        sb.append(this.read);
                        sb.append(", willingMonthlyPayment=");
                        sb.append(this.write);
                        sb.append(", productType=");
                        sb.append(this.MediaBrowserCompat$ItemReceiver);
                        sb.append(", ncbAcceptedFlag=");
                        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
                        sb.append(")");
                        return sb.toString();
                    }

                    {
                        onGetStartedClick.write((Object) r2, "monthlyIncome");
                        onGetStartedClick.write((Object) r4, "productType");
                        this.read = r2;
                        this.write = r3;
                        this.MediaBrowserCompat$ItemReceiver = r4;
                        this.MediaBrowserCompat$CustomActionResultReceiver = r5;
                    }
                });
                getbitsperchannel.IconCompatParcelizer.IconCompatParcelizer(new getBitsPerChannel$MediaBrowserCompat$ItemReceiver(getbitsperchannel, getbitsperchannel.MediaMetadataCompat));
            } else {
                Image.ImageRep imageRep = new Image.ImageRep(getbitsperchannel);
                if (getbitsperchannel.RatingCompat != null) {
                    imageRep.IconCompatParcelizer(getbitsperchannel.RatingCompat);
                }
            }
            this.MediaMetadataCompat = false;
        }
        if (getIntent().getBooleanExtra("EXTRA_DIRECT_TO_PIN_LOGIN", false)) {
            this.presenter.MediaDescriptionCompat = true;
            IconCompatParcelizer();
            getIntent().putExtra("EXTRA_DIRECT_TO_PIN_LOGIN", false);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Intent intent = getIntent();
        intent.putExtra("CONSENT_CONDITIONS_TAG", "NCB_CONSENT");
        intent.putExtra("CONSENT_CONDITIONS_STATUS", z);
        setResult(-1, intent);
        finish();
    }

    public final void IconCompatParcelizer() {
        Intent intent = new Intent(this, PinLoginActivity.class);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 7134);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        EasycashLandingActivity.MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    public final void write(asGzippedBytes asgzippedbytes, String str) {
        EasycashCreditPowerInformationActivity.MediaBrowserCompat$CustomActionResultReceiver(this, asgzippedbytes, str);
    }

    public final void write() {
        EasycashCreditPowerInputActivity.IconCompatParcelizer((Context) this);
    }

    public final void read(immediateFailedFuture immediatefailedfuture) {
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, TermsAndConditionsFragment.read(immediatefailedfuture)).write();
    }

    public final void IconCompatParcelizer(String str) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = getString(R.string.ncb_conset_confirmation_popup_accept_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = getString(R.string.ncb_conset_confirmation_popup_accept_desc);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.ncb_conset_confirmation_popup_accept_confirm), new C7340pB(this));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.ncb_conset_confirmation_popup_cancel), C7341pC.write).show();
    }

    public final void write(String str) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = getString(R.string.ncb_conset_confirmation_popup_decline_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = getString(R.string.ncb_conset_confirmation_popup_decline_desc);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog IconCompatParcelizer2 = IconCompatParcelizer.IconCompatParcelizer(IconCompatParcelizer.read.getString(R.string.ncb_conset_confirmation_popup_accept_confirm), new C7342pD(this));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.ncb_conset_confirmation_popup_cancel), C7283oN.IconCompatParcelizer).show();
    }

    public final void setContentView() {
        this.presenter.MediaBrowserCompat$ItemReceiver(Iterables$3$MediaBrowserCompat$MediaItem.error_generic_resource, access$2300.write.NAVIGATE_BACK);
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }
}
