package com.scb.phone.view.fragment.investment.scbs.open;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.custom.investment.scbs.open.OnboardingAddressInformationItemCustomView;
import com.scb.phone.view.fragment.BaseFragment;
import okhttp3.internal.cache.DiskLruCache;
import p040o.ActivityBuilder_BindSelectPurchasesActivity;
import p040o.ActivityBuilder_BindSetupQuickBalanceActivity;
import p040o.ActivityBuilder_BindSetupQuickPromptPayActivity;
import p040o.ActivityBuilder_BindSetupQuickTopUpActivity;
import p040o.ActivityBuilder_BindSetupQuickTopUpReviewActivity;
import p040o.ActivityBuilder_BindSharingMomentsPreviewActivity;
import p040o.ActivityBuilder_BindShortcutRouterActivity;
import p040o.ActivityBuilder_BindSmeLoanDetailActivity;
import p040o.ActivityBuilder_BindSplashActivity;
import p040o.ActivityBuilder_BindStopChequeReviewActivity;
import p040o.ActivityBuilder_BindSuccessActivity;
import p040o.ActivityBuilder_BindSummaryDetailActivity;
import p040o.FragmentBuilder_BindCalendarDialogFragment;
import p040o.HmlPinActivity;
import p040o.InstallException;
import p040o.MetaDataStore;
import p040o.PreviewCallbackListener;
import p040o.RttiJsonPassport;
import p040o.getNv21;
import p040o.getPosX;
import p040o.getPosX$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getPosX$MediaBrowserCompat$ItemReceiver;
import p040o.getRotationLandscape;
import p040o.gzipInputStream;
import p040o.keyType;
import p040o.setTitleMarginStart;
import p040o.valueType;

public class OnboardingAddressInformationFragment extends BaseFragment implements RttiJsonPassport {
    private FragmentBuilder_BindCalendarDialogFragment IconCompatParcelizer;
    @BindView
    TextView addressRegisteredWithScbTextView;
    @BindView
    OnboardingAddressInformationItemCustomView currentAddressItem;
    @BindView
    OnboardingAddressInformationItemCustomView homeRegistrationItem;
    @BindView
    OnboardingAddressInformationItemCustomView mailingAddressItem;
    @BindView
    Button nextButton;
    @HmlPinActivity
    public getPosX presenter;
    @BindView
    OnboardingAddressInformationItemCustomView workAddressItem;

    public static OnboardingAddressInformationFragment write() {
        Bundle bundle = new Bundle();
        OnboardingAddressInformationFragment onboardingAddressInformationFragment = new OnboardingAddressInformationFragment();
        onboardingAddressInformationFragment.setArguments(bundle);
        return onboardingAddressInformationFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f88722131494099, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.nextButton.setEnabled(false);
        this.homeRegistrationItem.setTitle(R.string.onboarding_address_information_house_registration_address);
        this.homeRegistrationItem.setTextHint(R.string.onboarding_address_information_enter_house_registration_address);
        this.homeRegistrationItem.setCheckBoxText(R.string.onboarding_address_information_my_house_registration_address_is_the_same_scb, 0);
        boolean z = true;
        this.homeRegistrationItem.setEnabledCheckBox(0, true);
        this.homeRegistrationItem.setEnabledForNextStep(true);
        this.homeRegistrationItem.setOnClickListener(new ActivityBuilder_BindSetupQuickTopUpActivity(this));
        this.workAddressItem.setTitle(R.string.onboarding_address_information_work_address);
        this.workAddressItem.setTextHint(R.string.onboarding_address_information_enter_work_address);
        this.workAddressItem.setCheckBoxText(R.string.onboarding_address_information_my_work_address_is_the_same_scb, 0);
        this.workAddressItem.setCheckBoxText(R.string.onboarding_address_information_my_work_address_is_the_same_house, 1);
        this.workAddressItem.setEnabledCheckBox(0, true);
        this.workAddressItem.setEnabledForNextStep(false);
        this.workAddressItem.setOnClickListener(new ActivityBuilder_BindSetupQuickPromptPayActivity(this));
        this.currentAddressItem.setTitle(R.string.onboarding_address_information_current_address);
        this.currentAddressItem.setTextHint(R.string.onboarding_address_information_enter_current_address);
        this.currentAddressItem.setCheckBoxText(R.string.onboarding_address_information_current_address_is_ths_same_scb, 0);
        this.currentAddressItem.setCheckBoxText(R.string.onboarding_address_information_current_address_is_ths_same_house, 1);
        this.currentAddressItem.setCheckBoxText(R.string.onboarding_address_information_current_address_is_ths_same_work, 2);
        this.currentAddressItem.setEnabledCheckBox(0, true);
        this.currentAddressItem.setEnabledForNextStep(false);
        this.currentAddressItem.setOnClickListener(new ActivityBuilder_BindSetupQuickTopUpReviewActivity(this));
        this.mailingAddressItem.setTitle(R.string.onboarding_address_information_mailing_address);
        this.mailingAddressItem.addressTextBoxLayout.setVisibility(8);
        this.mailingAddressItem.setCheckBoxText(R.string.onboarding_address_information_mailing_address_is_the_same_house, 0);
        this.mailingAddressItem.setCheckBoxText(R.string.onboarding_address_information_mailing_address_is_the_same_work, 1);
        this.mailingAddressItem.setCheckBoxText(R.string.onboarding_address_information_mailing_address_is_the_same_current_address, 2);
        this.mailingAddressItem.setEnabledCheckBox(0, true);
        this.mailingAddressItem.setEnabledClickOnCheckBox(0, false);
        this.mailingAddressItem.setEnabledCheckBox(1, true);
        this.mailingAddressItem.setEnabledClickOnCheckBox(1, false);
        this.mailingAddressItem.setEnabledCheckBox(2, true);
        this.mailingAddressItem.setEnabledClickOnCheckBox(2, false);
        this.mailingAddressItem.setEnabledForNextStep(false);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getPosX getposx = this.presenter;
        if (getposx.RatingCompat == null) {
            z = false;
        }
        if (z) {
            getposx.RatingCompat.AlertController$RecycleListView();
        }
        getposx.write.read();
        getposx.write.IconCompatParcelizer(new getPosX$MediaBrowserCompat$CustomActionResultReceiver(getposx, (byte) 0));
        return inflate;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 0 && i2 == -1) {
            getPosX getposx = this.presenter;
            if (getposx.RatingCompat != null) {
                getposx.RatingCompat.AlertController$RecycleListView();
            }
            getposx.write.read();
            getposx.write.IconCompatParcelizer(new getPosX$MediaBrowserCompat$ItemReceiver(getposx, (byte) 0));
        }
    }

    public void onDestroy() {
        this.presenter.onDestroy();
        super.onDestroy();
    }

    @OnClick
    public void clickNextButton() {
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        getPosX getposx = this.presenter;
        if (getposx.RatingCompat != null) {
            getposx.RatingCompat.AlertController$RecycleListView();
        }
        InstallException installException = getposx.MediaBrowserCompat$ItemReceiver;
        boolean z = getposx.IconCompatParcelizer.RatingCompat;
        String str8 = DiskLruCache.VERSION_1;
        String str9 = z ? str8 : "0";
        if (getposx.IconCompatParcelizer.ParcelableVolumeInfo) {
            str = str8;
        } else {
            str = "0";
        }
        if (getposx.IconCompatParcelizer.f2759x50fd9e4a) {
            str2 = str8;
        } else {
            str2 = "0";
        }
        if (getposx.IconCompatParcelizer.read) {
            str3 = str8;
        } else {
            str3 = "0";
        }
        if (getposx.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver) {
            str4 = str8;
        } else {
            str4 = "0";
        }
        if (getposx.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) {
            str5 = str8;
        } else {
            str5 = "0";
        }
        if (getposx.IconCompatParcelizer.MediaDescriptionCompat) {
            str6 = str8;
        } else {
            str6 = "0";
        }
        if (getposx.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver) {
            str7 = str8;
        } else {
            str7 = "0";
        }
        if (!getposx.IconCompatParcelizer.MediaBrowserCompat$MediaItem) {
            str8 = "0";
        }
        keyType keytype = r7;
        keyType keytype2 = new keyType((valueType) null, (valueType) null, (valueType) null, str9, str, str2, str3, str4, str5, str6, str7, str8);
        installException.MediaBrowserCompat$ItemReceiver(keytype);
        getposx.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getPosX.read(getposx, (byte) 0));
    }

    public final void read() {
        this.homeRegistrationItem.setCheckBoxListener(0, new ActivityBuilder_BindSelectPurchasesActivity(this));
        this.workAddressItem.setCheckBoxListener(0, new ActivityBuilder_BindShortcutRouterActivity(this));
        this.workAddressItem.setCheckBoxListener(1, new ActivityBuilder_BindSummaryDetailActivity(this));
        this.currentAddressItem.setCheckBoxListener(0, new ActivityBuilder_BindSuccessActivity(this));
        this.currentAddressItem.setCheckBoxListener(1, new ActivityBuilder_BindSmeLoanDetailActivity(this));
        this.currentAddressItem.setCheckBoxListener(2, new ActivityBuilder_BindSetupQuickBalanceActivity(this));
        this.mailingAddressItem.setCheckBoxListener(0, new ActivityBuilder_BindSharingMomentsPreviewActivity(this));
        this.mailingAddressItem.setCheckBoxListener(1, new ActivityBuilder_BindSplashActivity(this));
        this.mailingAddressItem.setCheckBoxListener(2, new ActivityBuilder_BindStopChequeReviewActivity(this));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        ParcelableVolumeInfo(getString(R.string.mf_onboarding_page_address));
    }

    public final void write(String str) {
        this.addressRegisteredWithScbTextView.setText(str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        OnboardingAddressInformationItemCustomView onboardingAddressInformationItemCustomView = this.workAddressItem;
        int i2 = 0;
        while (i2 != 3) {
            onboardingAddressInformationItemCustomView.setCheckboxChecked(i2, i2 == i);
            i2++;
        }
    }

    public final void write(int i) {
        OnboardingAddressInformationItemCustomView onboardingAddressInformationItemCustomView = this.currentAddressItem;
        int i2 = 0;
        while (i2 != 3) {
            onboardingAddressInformationItemCustomView.setCheckboxChecked(i2, i2 == i);
            i2++;
        }
    }

    public final void IconCompatParcelizer(int i) {
        OnboardingAddressInformationItemCustomView onboardingAddressInformationItemCustomView = this.mailingAddressItem;
        int i2 = 0;
        while (i2 != 3) {
            onboardingAddressInformationItemCustomView.setCheckboxChecked(i2, i2 == i);
            i2++;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(gzipInputStream gzipinputstream, String str) {
        setTitleMarginStart fragmentManager = getFragmentManager();
        if (fragmentManager != null) {
            OnboardingInputAddressFragment MediaBrowserCompat$ItemReceiver = OnboardingInputAddressFragment.MediaBrowserCompat$ItemReceiver(gzipinputstream, str);
            MediaBrowserCompat$ItemReceiver.setTargetFragment(this, 0);
            fragmentManager.read().MediaBrowserCompat$CustomActionResultReceiver(R.id.container, MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$CustomActionResultReceiver((String) null).write();
        }
    }

    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof FragmentBuilder_BindCalendarDialogFragment) {
            this.IconCompatParcelizer = (FragmentBuilder_BindCalendarDialogFragment) context;
        }
    }

    public final void IconCompatParcelizer() {
        this.IconCompatParcelizer.setOverlayMode();
    }

    public final void MediaBrowserCompat$ItemReceiver(MetaDataStore.C36551 r12) {
        String str = r12.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = r12.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = r12.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(str);
        boolean z3 = r12.RatingCompat;
        boolean z4 = !TextUtils.isEmpty(str2);
        boolean z5 = r12.ParcelableVolumeInfo;
        boolean z6 = r12.f2759x50fd9e4a;
        boolean isEmpty = TextUtils.isEmpty(str3);
        boolean z7 = r12.read;
        boolean z8 = r12.MediaBrowserCompat$ItemReceiver;
        boolean z9 = r12.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z10 = (z2 || z3) && (z4 || z5 || z6);
        this.currentAddressItem.setEnabledForNextStep(z10);
        this.currentAddressItem.setEnabledAddress(z10 && !z7 && !z8 && !z9);
        this.currentAddressItem.setEnabledClickedAddressTextBox(z10 && !z7 && !z8 && !z9);
        this.currentAddressItem.setEnabledTextHint(!z10 || !(isEmpty ^ true) || z7 || z8 || z9);
        this.currentAddressItem.setEnabledCheckBox(1, z2);
        this.currentAddressItem.setEnabledCheckBox(2, z4);
        this.currentAddressItem.setCheckBoxText(z2 ? R.string.onboarding_address_information_current_address_is_ths_same_house : R.string.onboarding_address_information_current_address_is_ths_same_work, 1);
        this.currentAddressItem.setCheckBoxText(R.string.onboarding_address_information_current_address_is_ths_same_work, 2);
        this.currentAddressItem.setAddress(str3);
        if (!z10) {
            getPosX getposx = this.presenter;
            getposx.IconCompatParcelizer.read = false;
            getposx.IconCompatParcelizer.MediaBrowserCompat$ItemReceiver = false;
            getposx.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver = false;
            PreviewCallbackListener previewCallbackListener = new PreviewCallbackListener(getposx);
            if (getposx.RatingCompat == null) {
                z = false;
            }
            if (z) {
                previewCallbackListener.IconCompatParcelizer(getposx.RatingCompat);
            }
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(MetaDataStore.C36551 r7) {
        String str = r7.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver;
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z = r7.RatingCompat;
        boolean z2 = !z;
        this.homeRegistrationItem.setEnabledAddress(z2);
        OnboardingAddressInformationItemCustomView onboardingAddressInformationItemCustomView = this.homeRegistrationItem;
        boolean z3 = true;
        if ((!isEmpty) && !z) {
            z3 = false;
        }
        onboardingAddressInformationItemCustomView.setEnabledTextHint(z3);
        this.homeRegistrationItem.setEnabledClickedAddressTextBox(z2);
        this.homeRegistrationItem.setAddress(str);
        this.homeRegistrationItem.setCheckboxChecked(0, z);
    }

    public final void read(MetaDataStore.C36551 r6) {
        boolean z = true;
        boolean z2 = ((TextUtils.isEmpty(r6.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver) ^ true) || r6.RatingCompat) && ((TextUtils.isEmpty(r6.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver) ^ true) || r6.ParcelableVolumeInfo || r6.f2759x50fd9e4a) && (!TextUtils.isEmpty(r6.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver) || r6.read || r6.MediaBrowserCompat$ItemReceiver || r6.MediaBrowserCompat$CustomActionResultReceiver);
        this.mailingAddressItem.setEnabledForNextStep(z2);
        this.mailingAddressItem.setEnabledClickOnCheckBox(0, z2);
        this.mailingAddressItem.setEnabledClickOnCheckBox(1, z2);
        this.mailingAddressItem.setEnabledClickOnCheckBox(2, z2);
        if (!z2) {
            getPosX getposx = this.presenter;
            getposx.IconCompatParcelizer.MediaDescriptionCompat = false;
            getposx.IconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver = false;
            getposx.IconCompatParcelizer.MediaBrowserCompat$MediaItem = false;
            getRotationLandscape getrotationlandscape = new getRotationLandscape(getposx);
            if (getposx.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getrotationlandscape.IconCompatParcelizer(getposx.RatingCompat);
            }
        }
    }

    public final void IconCompatParcelizer(MetaDataStore.C36551 r10) {
        String str = r10.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(r10.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver);
        boolean isEmpty = TextUtils.isEmpty(str);
        boolean z3 = r10.RatingCompat;
        boolean z4 = r10.ParcelableVolumeInfo;
        boolean z5 = r10.f2759x50fd9e4a;
        boolean z6 = z2 || z3;
        this.workAddressItem.setEnabledForNextStep(z6);
        this.workAddressItem.setEnabledClickedAddressTextBox(z6 && !z4 && !z5);
        this.workAddressItem.setEnabledAddress(z6 && !z4 && !z5);
        this.workAddressItem.setEnabledTextHint(!z6 || !(isEmpty ^ true) || z4 || z5);
        this.workAddressItem.setEnabledCheckBox(1, z2);
        this.workAddressItem.setAddress(str);
        if (!z6) {
            getPosX getposx = this.presenter;
            getposx.IconCompatParcelizer.ParcelableVolumeInfo = false;
            getposx.IconCompatParcelizer.f2759x50fd9e4a = false;
            getNv21 getnv21 = new getNv21(getposx);
            if (getposx.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getnv21.IconCompatParcelizer(getposx.RatingCompat);
            }
        }
    }

    public final void write(MetaDataStore.C36551 r5) {
        boolean z = r5.read;
        boolean z2 = r5.MediaBrowserCompat$ItemReceiver;
        boolean z3 = r5.MediaBrowserCompat$CustomActionResultReceiver;
        this.currentAddressItem.setCheckboxChecked(0, z);
        this.currentAddressItem.setCheckboxChecked(1, z2);
        this.currentAddressItem.setCheckboxChecked(2, z3);
    }

    public final void MediaBrowserCompat$SearchResultReceiver(MetaDataStore.C36551 r5) {
        boolean z = r5.MediaDescriptionCompat;
        boolean z2 = r5.MediaBrowserCompat$SearchResultReceiver;
        boolean z3 = r5.MediaBrowserCompat$MediaItem;
        this.mailingAddressItem.setCheckboxChecked(0, z);
        this.mailingAddressItem.setCheckboxChecked(1, z2);
        this.mailingAddressItem.setCheckboxChecked(2, z3);
    }

    public final void MediaDescriptionCompat(MetaDataStore.C36551 r7) {
        String str = r7.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = r7.MediaSessionCompat$QueueItem.MediaBrowserCompat$CustomActionResultReceiver;
        String str3 = r7.IconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(str) || r7.RatingCompat;
        boolean z3 = !TextUtils.isEmpty(str2) || r7.ParcelableVolumeInfo || r7.f2759x50fd9e4a;
        boolean z4 = !TextUtils.isEmpty(str3) || r7.read || r7.MediaBrowserCompat$ItemReceiver || r7.MediaBrowserCompat$CustomActionResultReceiver;
        boolean z5 = r7.MediaDescriptionCompat || r7.MediaBrowserCompat$SearchResultReceiver || r7.MediaBrowserCompat$MediaItem;
        if (!z2 || !z3 || !z4 || !z5) {
            z = false;
        }
        this.nextButton.setEnabled(z);
    }

    public final void MediaMetadataCompat(MetaDataStore.C36551 r4) {
        boolean z = r4.ParcelableVolumeInfo;
        boolean z2 = r4.f2759x50fd9e4a;
        this.workAddressItem.setCheckboxChecked(0, z);
        this.workAddressItem.setCheckboxChecked(1, z2);
    }
}
