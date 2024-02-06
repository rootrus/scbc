package com.scb.phone.view.activity.personalinfo;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.text.method.DigitsKeyListener;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.registration.RegistrationCardDetailActivity;
import com.scb.phone.view.activity.registration.RegistrationCountrySearchActivity;
import com.scb.phone.view.activity.registration.RegistrationNoDataActivity;
import com.scb.phone.view.custom.CustomExternalSelector;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.fragment.registration.RegistrationFacialRecognitionLandingActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C4346eL;
import p040o.C4347eM;
import p040o.C4349eO;
import p040o.C4351eQ;
import p040o.C4353eU;
import p040o.C6509xca412883;
import p040o.FragmentBuilder_BindDirectDebitInputSelectedFragment;
import p040o.FragmentBuilder_BindEasycashCreditPowerInformationFragment;
import p040o.FragmentBuilder_BindEasycashFeaturesCardInformationFragment;
import p040o.LocalProjectProvider;
import p040o.MyECouponActivity_ViewBinding;
import p040o.allowClickDaysOutsideCurrentMonth;
import p040o.binaryImagesJsonFromMapsFile;
import p040o.clearSelection;
import p040o.dispatchOnDateSelected;
import p040o.dispatchOnRangeSelected;
import p040o.onGetStartedClick;
import p040o.parseProcMapsJsonFromStream;
import p040o.propagateIfInstanceOf$MediaBrowserCompat$ItemReceiver;
import p040o.removeIfFromRandomAccessList;
import p040o.setCausedBy;
import p040o.setTapText;
import p040o.showOutOfRange;

public abstract class BasePersonalInfoActivity extends BaseActivity implements LocalProjectProvider.C69364 {
    private boolean MediaBrowserCompat$MediaItem;
    @BindView
    Button btnSubmit;
    @BindView
    Button btnTabAlienCard;
    @BindView
    Button btnTabCitizenId;
    @BindView
    Button btnTabPassport;
    @BindView
    CustomExternalSelector countrySelector;
    @BindView
    CommonInputViewGroup ivpAlienDob;
    @BindView
    CommonInputViewGroup ivpAlienNo;
    @BindView
    public CommonInputViewGroup ivpCitizenCardNo;
    @BindView
    public CommonInputViewGroup ivpCitizenDob;
    @BindView
    CommonInputViewGroup ivpPassportDob;
    @BindView
    CommonInputViewGroup ivpPassportNo;
    @BindView
    LinearLayout layoutAlien;
    @BindView
    LinearLayout layoutCitizen;
    @BindView
    LinearLayout layoutPassport;

    /* access modifiers changed from: protected */
    public abstract C4353eU MediaSessionCompat$QueueItem();

    /* access modifiers changed from: protected */
    public abstract parseProcMapsJsonFromStream MediaSessionCompat$ResultReceiverWrapper();

    public abstract void write(String str, String str2, propagateIfInstanceOf$MediaBrowserCompat$ItemReceiver propagateifinstanceof_mediabrowsercompat_itemreceiver);

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        onBackPressed();
        return true;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77932131493018);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.forgot_pin_personal_info_title);
        setTabContainer();
        onCitizenTabClicked();
        CommonInputViewGroup commonInputViewGroup = this.ivpCitizenCardNo;
        commonInputViewGroup.mEditText.setCustomSelectionActionModeCallback(new FragmentBuilder_BindDirectDebitInputSelectedFragment());
        commonInputViewGroup.mEditText.setLongClickable(false);
        commonInputViewGroup.mEditText.setTextIsSelectable(false);
        this.ivpCitizenCardNo.mEditText.setInputType(2);
        this.ivpCitizenCardNo.mEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789 "));
        CommonInputViewGroup commonInputViewGroup2 = this.ivpCitizenCardNo;
        FragmentBuilder_BindEasycashFeaturesCardInformationFragment fragmentBuilder_BindEasycashFeaturesCardInformationFragment = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment(commonInputViewGroup2.mEditText, "X XXXX XXXXX XX X", new showOutOfRange(this));
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment.read = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment.write() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                BasePersonalInfoActivity.this.MediaSessionCompat$QueueItem().MediaBrowserCompat$ItemReceiver(str, false);
            }

            public final void write(String str) {
                if (TextUtils.isEmpty(str)) {
                    CommonInputViewGroup commonInputViewGroup = BasePersonalInfoActivity.this.ivpCitizenCardNo;
                    commonInputViewGroup.write = false;
                    commonInputViewGroup.mEditClearImageButton.setVisibility(8);
                } else {
                    CommonInputViewGroup commonInputViewGroup2 = BasePersonalInfoActivity.this.ivpCitizenCardNo;
                    commonInputViewGroup2.write = true;
                    commonInputViewGroup2.mEditClearImageButton.setVisibility(0);
                }
                BasePersonalInfoActivity.this.MediaSessionCompat$QueueItem().MediaBrowserCompat$ItemReceiver(str, true);
            }
        };
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment.write = true;
        commonInputViewGroup2.mEditText.addTextChangedListener(fragmentBuilder_BindEasycashFeaturesCardInformationFragment);
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.add(fragmentBuilder_BindEasycashFeaturesCardInformationFragment);
        CommonInputViewGroup commonInputViewGroup3 = this.ivpCitizenDob;
        commonInputViewGroup3.mEditText.setCustomSelectionActionModeCallback(new FragmentBuilder_BindDirectDebitInputSelectedFragment());
        commonInputViewGroup3.mEditText.setLongClickable(false);
        commonInputViewGroup3.mEditText.setTextIsSelectable(false);
        this.ivpCitizenDob.mEditText.setInputType(2);
        this.ivpCitizenDob.mEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789/"));
        CommonInputViewGroup commonInputViewGroup4 = this.ivpCitizenDob;
        FragmentBuilder_BindEasycashFeaturesCardInformationFragment fragmentBuilder_BindEasycashFeaturesCardInformationFragment2 = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment(commonInputViewGroup4.mEditText, "XX/XX/XXXX", new allowClickDaysOutsideCurrentMonth(this));
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment2.read = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment.write() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                BasePersonalInfoActivity.this.MediaSessionCompat$QueueItem().read(str, false);
            }

            public final void write(String str) {
                BasePersonalInfoActivity.this.MediaSessionCompat$QueueItem().read(str, true);
            }
        };
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment2.write = true;
        commonInputViewGroup4.mEditText.addTextChangedListener(fragmentBuilder_BindEasycashFeaturesCardInformationFragment2);
        commonInputViewGroup4.MediaBrowserCompat$CustomActionResultReceiver.add(fragmentBuilder_BindEasycashFeaturesCardInformationFragment2);
        CustomExternalSelector customExternalSelector = this.countrySelector;
        Integer valueOf = Integer.valueOf(R.drawable.ic_dark_chevron_up);
        customExternalSelector.setDynamicIcons(valueOf, valueOf);
        CustomExternalSelector customExternalSelector2 = this.countrySelector;
        dispatchOnRangeSelected dispatchonrangeselected = new dispatchOnRangeSelected(this);
        onGetStartedClick.write((Object) dispatchonrangeselected, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        View view = customExternalSelector2.container;
        if (view == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("container");
        }
        view.setOnClickListener(dispatchonrangeselected);
        CommonInputViewGroup commonInputViewGroup5 = this.ivpPassportNo;
        commonInputViewGroup5.mEditText.setCustomSelectionActionModeCallback(new FragmentBuilder_BindDirectDebitInputSelectedFragment());
        commonInputViewGroup5.mEditText.setLongClickable(false);
        commonInputViewGroup5.mEditText.setTextIsSelectable(false);
        CommonInputViewGroup commonInputViewGroup6 = this.ivpPassportNo;
        FragmentBuilder_BindEasycashCreditPowerInformationFragment fragmentBuilder_BindEasycashCreditPowerInformationFragment = new FragmentBuilder_BindEasycashCreditPowerInformationFragment(commonInputViewGroup6.mEditText, "^[a-zA-Z0-9]+$", 3);
        fragmentBuilder_BindEasycashCreditPowerInformationFragment.MediaBrowserCompat$CustomActionResultReceiver = new C6509xca412883() {
            public final void write(String str) {
                BasePersonalInfoActivity.this.MediaSessionCompat$QueueItem().MediaBrowserCompat$MediaItem(str, false);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                BasePersonalInfoActivity.this.MediaSessionCompat$QueueItem().MediaBrowserCompat$MediaItem(str, true);
            }
        };
        fragmentBuilder_BindEasycashCreditPowerInformationFragment.IconCompatParcelizer.setInputType(524432);
        fragmentBuilder_BindEasycashCreditPowerInformationFragment.read = true;
        commonInputViewGroup6.mEditText.addTextChangedListener(fragmentBuilder_BindEasycashCreditPowerInformationFragment);
        commonInputViewGroup6.MediaBrowserCompat$CustomActionResultReceiver.add(fragmentBuilder_BindEasycashCreditPowerInformationFragment);
        CommonInputViewGroup commonInputViewGroup7 = this.ivpPassportDob;
        commonInputViewGroup7.mEditText.setCustomSelectionActionModeCallback(new FragmentBuilder_BindDirectDebitInputSelectedFragment());
        commonInputViewGroup7.mEditText.setLongClickable(false);
        commonInputViewGroup7.mEditText.setTextIsSelectable(false);
        this.ivpPassportDob.mEditText.setInputType(2);
        this.ivpPassportDob.mEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789/"));
        CommonInputViewGroup commonInputViewGroup8 = this.ivpPassportDob;
        FragmentBuilder_BindEasycashFeaturesCardInformationFragment fragmentBuilder_BindEasycashFeaturesCardInformationFragment3 = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment(commonInputViewGroup8.mEditText, "XX/XX/XXXX", new clearSelection(this));
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment3.read = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment.write() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                BasePersonalInfoActivity.this.MediaSessionCompat$QueueItem().IconCompatParcelizer(str, false);
            }

            public final void write(String str) {
                BasePersonalInfoActivity.this.MediaSessionCompat$QueueItem().IconCompatParcelizer(str, true);
            }
        };
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment3.write = true;
        commonInputViewGroup8.mEditText.addTextChangedListener(fragmentBuilder_BindEasycashFeaturesCardInformationFragment3);
        commonInputViewGroup8.MediaBrowserCompat$CustomActionResultReceiver.add(fragmentBuilder_BindEasycashFeaturesCardInformationFragment3);
        CommonInputViewGroup commonInputViewGroup9 = this.ivpAlienNo;
        commonInputViewGroup9.mEditText.setCustomSelectionActionModeCallback(new FragmentBuilder_BindDirectDebitInputSelectedFragment());
        commonInputViewGroup9.mEditText.setLongClickable(false);
        commonInputViewGroup9.mEditText.setTextIsSelectable(false);
        CommonInputViewGroup commonInputViewGroup10 = this.ivpAlienNo;
        FragmentBuilder_BindEasycashCreditPowerInformationFragment fragmentBuilder_BindEasycashCreditPowerInformationFragment2 = new FragmentBuilder_BindEasycashCreditPowerInformationFragment(commonInputViewGroup10.mEditText, "^[a-zA-Z0-9]+$", 5);
        fragmentBuilder_BindEasycashCreditPowerInformationFragment2.MediaBrowserCompat$CustomActionResultReceiver = new C6509xca412883() {
            public final void write(String str) {
                BasePersonalInfoActivity.this.MediaSessionCompat$QueueItem().MediaBrowserCompat$CustomActionResultReceiver(str, false);
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                BasePersonalInfoActivity.this.MediaSessionCompat$QueueItem().MediaBrowserCompat$CustomActionResultReceiver(str, true);
            }
        };
        fragmentBuilder_BindEasycashCreditPowerInformationFragment2.IconCompatParcelizer.setInputType(524432);
        fragmentBuilder_BindEasycashCreditPowerInformationFragment2.read = true;
        commonInputViewGroup10.mEditText.addTextChangedListener(fragmentBuilder_BindEasycashCreditPowerInformationFragment2);
        commonInputViewGroup10.MediaBrowserCompat$CustomActionResultReceiver.add(fragmentBuilder_BindEasycashCreditPowerInformationFragment2);
        CommonInputViewGroup commonInputViewGroup11 = this.ivpAlienDob;
        commonInputViewGroup11.mEditText.setCustomSelectionActionModeCallback(new FragmentBuilder_BindDirectDebitInputSelectedFragment());
        commonInputViewGroup11.mEditText.setLongClickable(false);
        commonInputViewGroup11.mEditText.setTextIsSelectable(false);
        this.ivpAlienDob.mEditText.setInputType(2);
        this.ivpAlienDob.mEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789/"));
        CommonInputViewGroup commonInputViewGroup12 = this.ivpAlienDob;
        FragmentBuilder_BindEasycashFeaturesCardInformationFragment fragmentBuilder_BindEasycashFeaturesCardInformationFragment4 = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment(commonInputViewGroup12.mEditText, "XX/XX/XXXX", new dispatchOnDateSelected(this));
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment4.read = new FragmentBuilder_BindEasycashFeaturesCardInformationFragment.write() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(String str) {
                BasePersonalInfoActivity.this.MediaSessionCompat$QueueItem().write(str, false);
            }

            public final void write(String str) {
                BasePersonalInfoActivity.this.MediaSessionCompat$QueueItem().write(str, true);
            }
        };
        fragmentBuilder_BindEasycashFeaturesCardInformationFragment4.write = true;
        commonInputViewGroup12.mEditText.addTextChangedListener(fragmentBuilder_BindEasycashFeaturesCardInformationFragment4);
        commonInputViewGroup12.MediaBrowserCompat$CustomActionResultReceiver.add(fragmentBuilder_BindEasycashFeaturesCardInformationFragment4);
        MediaSessionCompat$QueueItem().MediaBrowserCompat$ItemReceiver(this);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.forgot_pin_personal_info_title);
        setTabContainer();
    }

    public final /* synthetic */ String RatingCompat(String str) {
        MediaSessionCompat$QueueItem();
        return removeIfFromRandomAccessList.read(str, "[^0-9]", "X XXXX XXXXX XX X");
    }

    public final /* synthetic */ String MediaBrowserCompat$SearchResultReceiver(String str) {
        MediaSessionCompat$QueueItem();
        return removeIfFromRandomAccessList.read(str, "[^0-9]", "XX/XX/XXXX");
    }

    public final /* synthetic */ String ParcelableVolumeInfo(String str) {
        MediaSessionCompat$QueueItem();
        return removeIfFromRandomAccessList.read(str, "[^0-9]", "XX/XX/XXXX");
    }

    public final /* synthetic */ String MediaSessionCompat$ResultReceiverWrapper(String str) {
        MediaSessionCompat$QueueItem();
        return removeIfFromRandomAccessList.read(str, "[^0-9]", "XX/XX/XXXX");
    }

    @OnClick
    public void onCitizenTabClicked() {
        boolean z = true;
        this.btnTabCitizenId.setSelected(true);
        this.btnTabPassport.setSelected(false);
        this.btnTabAlienCard.setSelected(false);
        this.layoutCitizen.setVisibility(0);
        this.layoutPassport.setVisibility(8);
        this.layoutAlien.setVisibility(8);
        this.btnTabCitizenId.requestFocus();
        C4353eU MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem();
        C4347eM eMVar = new C4347eM(MediaSessionCompat$QueueItem);
        if (MediaSessionCompat$QueueItem.RatingCompat == null) {
            z = false;
        }
        if (z) {
            eMVar.IconCompatParcelizer(MediaSessionCompat$QueueItem.RatingCompat);
        }
    }

    @OnClick
    public void onPassportTabClicked() {
        boolean z = false;
        this.btnTabCitizenId.setSelected(false);
        this.btnTabPassport.setSelected(true);
        this.btnTabAlienCard.setSelected(false);
        this.layoutCitizen.setVisibility(8);
        this.layoutPassport.setVisibility(0);
        this.layoutAlien.setVisibility(8);
        this.btnTabPassport.requestFocus();
        C4353eU MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem();
        C4351eQ eQVar = new C4351eQ(MediaSessionCompat$QueueItem);
        if (MediaSessionCompat$QueueItem.RatingCompat != null) {
            z = true;
        }
        if (z) {
            eQVar.IconCompatParcelizer(MediaSessionCompat$QueueItem.RatingCompat);
        }
    }

    @OnClick
    public void onAlienCardTabClicked() {
        boolean z = false;
        this.btnTabCitizenId.setSelected(false);
        this.btnTabPassport.setSelected(false);
        this.btnTabAlienCard.setSelected(true);
        this.layoutCitizen.setVisibility(8);
        this.layoutPassport.setVisibility(8);
        this.layoutAlien.setVisibility(0);
        this.btnTabAlienCard.requestFocus();
        C4353eU MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem();
        C4346eL eLVar = new C4346eL(MediaSessionCompat$QueueItem);
        if (MediaSessionCompat$QueueItem.RatingCompat != null) {
            z = true;
        }
        if (z) {
            eLVar.IconCompatParcelizer(MediaSessionCompat$QueueItem.RatingCompat);
        }
    }

    @OnClick
    public void onSubmit() {
        propagateIfInstanceOf$MediaBrowserCompat$ItemReceiver propagateifinstanceof_mediabrowsercompat_itemreceiver;
        String str;
        if (getIntent() != null) {
            String str2 = null;
            if (this.btnTabCitizenId.isSelected()) {
                str2 = this.ivpCitizenCardNo.mEditText.getText().toString();
                str = this.ivpCitizenDob.mEditText.getText().toString();
                propagateifinstanceof_mediabrowsercompat_itemreceiver = propagateIfInstanceOf$MediaBrowserCompat$ItemReceiver.CID;
            } else if (this.btnTabPassport.isSelected()) {
                StringBuilder sb = new StringBuilder();
                sb.append(MediaSessionCompat$QueueItem().MediaSessionCompat$Token.IconCompatParcelizer);
                sb.append(this.ivpPassportNo.mEditText.getText().toString());
                str2 = sb.toString();
                str = this.ivpPassportDob.mEditText.getText().toString();
                propagateifinstanceof_mediabrowsercompat_itemreceiver = propagateIfInstanceOf$MediaBrowserCompat$ItemReceiver.PASSPORT;
            } else if (this.btnTabAlienCard.isSelected()) {
                str2 = this.ivpAlienNo.mEditText.getText().toString();
                str = this.ivpAlienDob.mEditText.getText().toString();
                propagateifinstanceof_mediabrowsercompat_itemreceiver = propagateIfInstanceOf$MediaBrowserCompat$ItemReceiver.ALIEN;
            } else {
                str = null;
                propagateifinstanceof_mediabrowsercompat_itemreceiver = null;
            }
            boolean z = false;
            if (!(str2 == null || str2.length() == 0)) {
                if (str == null || str.length() == 0) {
                    z = true;
                }
                if (!z && propagateifinstanceof_mediabrowsercompat_itemreceiver != null) {
                    write(str2, str, propagateifinstanceof_mediabrowsercompat_itemreceiver);
                }
            }
        }
    }

    public final void MediaBrowserCompat$MediaItem(boolean z) {
        if (z) {
            this.ivpCitizenCardNo.MediaBrowserCompat$ItemReceiver();
        } else {
            this.ivpCitizenCardNo.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void write(boolean z) {
        if (z) {
            this.ivpCitizenDob.MediaBrowserCompat$ItemReceiver();
        } else {
            this.ivpCitizenDob.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void MediaMetadataCompat(boolean z) {
        if (z) {
            this.ivpPassportNo.MediaBrowserCompat$ItemReceiver();
        } else {
            this.ivpPassportNo.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void MediaDescriptionCompat(boolean z) {
        if (z) {
            this.ivpPassportDob.MediaBrowserCompat$ItemReceiver();
        } else {
            this.ivpPassportDob.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        if (z) {
            this.ivpAlienNo.MediaBrowserCompat$ItemReceiver();
        } else {
            this.ivpAlienNo.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        if (z) {
            this.ivpAlienDob.MediaBrowserCompat$ItemReceiver();
        } else {
            this.ivpAlienDob.MediaBrowserCompat$CustomActionResultReceiver();
        }
    }

    public final void read(boolean z) {
        this.btnSubmit.setEnabled(z);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        boolean z = false;
        if (i == 10001) {
            ParcelableVolumeInfo(false);
        } else if (i == 10002 && i2 == -1) {
            C4353eU MediaSessionCompat$QueueItem = MediaSessionCompat$QueueItem();
            setCausedBy setcausedby = (setCausedBy) intent.getParcelableExtra("COUNTRY_DISPLAY");
            MediaSessionCompat$QueueItem.MediaSessionCompat$Token = setcausedby;
            C4349eO eOVar = new C4349eO(setcausedby);
            if (MediaSessionCompat$QueueItem.RatingCompat != null) {
                eOVar.IconCompatParcelizer(MediaSessionCompat$QueueItem.RatingCompat);
            }
            C4351eQ eQVar = new C4351eQ(MediaSessionCompat$QueueItem);
            if (MediaSessionCompat$QueueItem.RatingCompat != null) {
                z = true;
            }
            if (z) {
                eQVar.IconCompatParcelizer(MediaSessionCompat$QueueItem.RatingCompat);
            }
        }
    }

    public void onResume() {
        super.onResume();
        this.MediaBrowserCompat$MediaItem = false;
    }

    public final void write() {
        Intent IconCompatParcelizer = RegistrationNoDataActivity.IconCompatParcelizer(this, getString(R.string.ntb_fillinformation_review_info_error_title), getString(R.string.ntb_no_reg_data_desc));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        finish();
    }

    public final void read() {
        Intent intent;
        if (MediaSessionCompat$ResultReceiverWrapper() == parseProcMapsJsonFromStream.FAST_EASY) {
            intent = RegistrationFacialRecognitionLandingActivity.MediaBrowserCompat$ItemReceiver((Context) this, binaryImagesJsonFromMapsFile.NEW_REGISTRATION);
        } else {
            intent = RegistrationFacialRecognitionLandingActivity.MediaBrowserCompat$ItemReceiver((Context) this, binaryImagesJsonFromMapsFile.FORGOT_PIN);
        }
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        Intent read = RegistrationCardDetailActivity.read(this, z, MediaSessionCompat$ResultReceiverWrapper());
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(setCausedBy setcausedby) {
        this.countrySelector.setSelected(setcausedby.write);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        setSplitBackground();
    }

    public /* synthetic */ void lambda$init$2$BasePersonalInfoActivity(View view) {
        if (!this.MediaBrowserCompat$MediaItem) {
            this.MediaBrowserCompat$MediaItem = true;
            RegistrationCountrySearchActivity.read read = RegistrationCountrySearchActivity.MediaBrowserCompat$MediaItem;
            onGetStartedClick.write((Object) this, "context");
            Intent intent = new Intent(this, RegistrationCountrySearchActivity.class);
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read2 = setTapText.write(this, intent).read();
                MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb.append(read2.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                startActivityForResult(read2, 10002);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }
}
