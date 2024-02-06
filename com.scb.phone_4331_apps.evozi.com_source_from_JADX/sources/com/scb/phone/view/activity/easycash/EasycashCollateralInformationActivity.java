package com.scb.phone.view.activity.easycash;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.google.android.material.textfield.TextInputLayout;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.AmountEditText$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import p040o.C10178z;
import p040o.C5186r;
import p040o.C7281oL;
import p040o.CheckExtractActivity_MembersInjector;
import p040o.DetectionResult;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.HmlPinActivity;
import p040o.Image;
import p040o.Image$FileIOEngine$MediaBrowserCompat$ItemReceiver;
import p040o.LinkedHashMultimap;
import p040o.MultiProcessor$zza$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.addDelayedShutdownHook;
import p040o.forEachClear;
import p040o.getLegacySharedPrefs;
import p040o.getTargetRect;
import p040o.nextInChain;
import p040o.onGetStartedClick;
import p040o.setAspectRatioFraction;
import p040o.setTapText;
import p040o.setTargetFrameAspectRatio;
import p040o.zzwk;

public class EasycashCollateralInformationActivity extends BaseActivity implements CheckExtractActivity_MembersInjector.setPopupCallback {
    private CustomSpinnerWithTitle.IconCompatParcelizer MediaDescriptionCompat = new CustomSpinnerWithTitle.IconCompatParcelizer() {
        public final void write() {
        }

        public final void IconCompatParcelizer() {
            Image.FileIOEngine fileIOEngine = EasycashCollateralInformationActivity.this.presenter;
            boolean z = true;
            int selectedItemPosition = EasycashCollateralInformationActivity.this.customSpinnerLoadType.spinner.getSelectedItemPosition() - 1;
            if (selectedItemPosition != -1) {
                nextInChain nextinchain = fileIOEngine.MediaDescriptionCompat;
                String str = fileIOEngine.read.get(selectedItemPosition).MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.write((Object) str, "<set-?>");
                nextinchain.MediaBrowserCompat$ItemReceiver = str;
                DetectionResult detectionResult = new DetectionResult(fileIOEngine);
                if (fileIOEngine.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    detectionResult.IconCompatParcelizer(fileIOEngine.RatingCompat);
                }
            }
        }
    };
    @BindView
    public TextInputLayout amountLayout;
    @BindView
    public Button btnCalculate;
    @BindView
    protected CustomSpinnerWithTitle customSpinnerLoadType;
    @BindView
    public AmountEditText etPrice;
    @BindView
    public RelativeLayout layoutLocation;
    @HmlPinActivity
    public Image.FileIOEngine presenter;
    @BindView
    public RadioGroup rgCollateralOwnership;
    @BindView
    public RadioGroup rgFireInsurance;
    @BindView
    public RadioGroup rgLifeInsurance;
    @BindView
    public RadioGroup rgResidentialStatus;
    @BindView
    public TextView textLocation;
    @HmlPinActivity
    public forEachClear tracker;

    public static void write(Context context, getLegacySharedPrefs getlegacysharedprefs, String str, String str2, String str3) {
        Intent intent = new Intent(context, EasycashCollateralInformationActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.TILE_DISPLAY", getlegacysharedprefs);
        intent.putExtra("com.scb.phone.view.activity.easycash.PRODUCT_TYPE", getlegacysharedprefs.MediaDescriptionCompat);
        intent.putExtra("NCB_TRANSACTION_ID", str);
        intent.putExtra("com.scb.phone.view.activity.easycash.MONTHLY_INCOME", str2);
        intent.putExtra("com.scb.phone.view.activity.easycash.MONTHLY_REPAYMENT", str3);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77542131492979);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTitle(R.string.easycash_introduction_mhmc_title);
        setTabContainer();
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        if (getIntent().getExtras() != null) {
            Image.FileIOEngine fileIOEngine = this.presenter;
            String string = getIntent().getExtras().getString("com.scb.phone.view.activity.easycash.PRODUCT_TYPE");
            String string2 = getIntent().getExtras().getString("com.scb.phone.view.activity.easycash.MONTHLY_INCOME");
            String string3 = getIntent().getExtras().getString("com.scb.phone.view.activity.easycash.MONTHLY_REPAYMENT");
            nextInChain nextinchain = new nextInChain();
            fileIOEngine.MediaDescriptionCompat = nextinchain;
            onGetStartedClick.write((Object) string, "<set-?>");
            nextinchain.MediaBrowserCompat$MediaItem = string;
            nextInChain nextinchain2 = fileIOEngine.MediaDescriptionCompat;
            onGetStartedClick.write((Object) string2, "<set-?>");
            nextinchain2.MediaMetadataCompat = string2;
            nextInChain nextinchain3 = fileIOEngine.MediaDescriptionCompat;
            onGetStartedClick.write((Object) string3, "<set-?>");
            nextinchain3.RatingCompat = string3;
            if (fileIOEngine.RatingCompat != null) {
                fileIOEngine.RatingCompat.AlertController$RecycleListView();
            }
            LinkedHashMultimap.SetDecorator setDecorator = fileIOEngine.MediaBrowserCompat$ItemReceiver;
            setAspectRatioFraction setaspectratiofraction = new setAspectRatioFraction(fileIOEngine);
            setTargetFrameAspectRatio settargetframeaspectratio = new setTargetFrameAspectRatio(fileIOEngine);
            onGetStartedClick.write((Object) setaspectratiofraction, "onSuccess");
            onGetStartedClick.write((Object) settargetframeaspectratio, "onError");
            onGetStartedClick.write((Object) "MHMC", "productType");
            setDecorator.IconCompatParcelizer(setDecorator.read, setaspectratiofraction, settargetframeaspectratio, new MultiProcessor$zza$MediaBrowserCompat$ItemReceiver("MHMC"));
            C10178z.C7545a aVar = new C10178z.C7545a(this);
            this.rgCollateralOwnership.setOnCheckedChangeListener(aVar);
            this.rgResidentialStatus.setOnCheckedChangeListener(aVar);
            this.rgFireInsurance.setOnCheckedChangeListener(aVar);
            this.rgLifeInsurance.setOnCheckedChangeListener(aVar);
            this.layoutLocation.setOnClickListener(new C7281oL(this));
            this.etPrice.setCustomHint(getString(R.string.collateral_feature_title_estimated_price_hint));
            this.etPrice.setOnAmountChangeListener(new AmountEditText.read() {
                public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
                    Image.FileIOEngine fileIOEngine = EasycashCollateralInformationActivity.this.presenter;
                    Double valueOf = Double.valueOf(d);
                    fileIOEngine.IconCompatParcelizer(valueOf.doubleValue() > 0.0d ? valueOf.toString() : "");
                }

                public final void MediaBrowserCompat$CustomActionResultReceiver() {
                    EasycashCollateralInformationActivity.this.presenter.IconCompatParcelizer(EasycashCollateralInformationActivity.this.etPrice.getText().toString());
                    EasycashCollateralInformationActivity.this.PlaybackStateCompat$CustomAction();
                }
            });
            this.etPrice.setHandleDismissKeyboard(new C5186r.C5188a(this));
            this.customSpinnerLoadType.setOnCustomSpinnerWithTitleCompletion(this.MediaDescriptionCompat);
        }
    }

    public /* synthetic */ void lambda$setListener$1$EasycashCollateralInformationActivity(View view) {
        Intent read = EasycashSubDistrictSearchActivity.read(this, getString(R.string.easycash_introduction_mhmc_title));
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read2, 12031);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.easycash_introduction_mhmc_title);
        setTabContainer();
    }

    public final void MediaBrowserCompat$ItemReceiver(Double d) {
        AmountEditText amountEditText = this.etPrice;
        amountEditText.setCurrencyFormattingTextWatcher(new FragmentBuilder_BindEasycashContactInformationFragment(amountEditText, this.amountLayout, 9.9999999999E8d, d.doubleValue(), getResources().getString(R.string.collateral_estimate_price_error), (String) null, getResources().getString(R.string.easycash_invalid_amount_transfer_input)));
        this.etPrice.setOnPasteListener(new AmountEditText$MediaBrowserCompat$ItemReceiver());
    }

    public final void IconCompatParcelizer(Boolean bool) {
        this.btnCalculate.setEnabled(bool.booleanValue());
    }

    public final void read(List<String> list) {
        this.customSpinnerLoadType.setItemsWithPlaceholder(list, true, false);
        this.customSpinnerLoadType.setMandatory(true);
    }

    public final void read(String str) {
        this.textLocation.setText(str);
    }

    public final void write(String str) {
        this.etPrice.setText(str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i) {
        this.customSpinnerLoadType.setSelectionIndex(i);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 != -1) {
            return;
        }
        if (i == 12031) {
            Image.FileIOEngine fileIOEngine = this.presenter;
            addDelayedShutdownHook adddelayedshutdownhook = (addDelayedShutdownHook) intent.getParcelableExtra("SUB_DISTRICT_DISPLAY");
            if (adddelayedshutdownhook != null) {
                nextInChain nextinchain = fileIOEngine.MediaDescriptionCompat;
                zzwk zzwk = new zzwk();
                zzwk.MediaBrowserCompat$ItemReceiver = adddelayedshutdownhook.MediaDescriptionCompat;
                zzwk.MediaBrowserCompat$CustomActionResultReceiver = adddelayedshutdownhook.read;
                zzwk.write = adddelayedshutdownhook.RatingCompat;
                zzwk.read = adddelayedshutdownhook.MediaBrowserCompat$CustomActionResultReceiver;
                onGetStartedClick.write((Object) zzwk, "<set-?>");
                nextinchain.write = zzwk;
                getTargetRect gettargetrect = new getTargetRect(fileIOEngine);
                boolean z = true;
                if (fileIOEngine.RatingCompat != null) {
                    gettargetrect.IconCompatParcelizer(fileIOEngine.RatingCompat);
                }
                DetectionResult detectionResult = new DetectionResult(fileIOEngine);
                if (fileIOEngine.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    detectionResult.IconCompatParcelizer(fileIOEngine.RatingCompat);
                }
            }
        } else if (i == 12032) {
            finish();
        }
    }

    public final void write(boolean z) {
        this.rgCollateralOwnership.check(z ? R.id.rdb_myself : R.id.rdb_family);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.rgResidentialStatus.check(z ? R.id.rdb_residential_status_yes : R.id.rdb_residential_status_no);
    }

    public final void read(boolean z) {
        this.rgFireInsurance.check(z ? R.id.rdb_fire_insurance_yes : R.id.rdb_fire_insurance_no);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        this.rgLifeInsurance.check(z ? R.id.rdb_life_insurance_yes : R.id.rdb_life_insurance_no);
    }

    @OnClick
    public void onCalculateClick() {
        this.tracker.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "apply_loan_collateral_details");
        Image.FileIOEngine fileIOEngine = this.presenter;
        if (fileIOEngine.RatingCompat != null) {
            fileIOEngine.RatingCompat.AlertController$RecycleListView();
        }
        fileIOEngine.write.MediaBrowserCompat$CustomActionResultReceiver(fileIOEngine.MediaDescriptionCompat);
        fileIOEngine.write.IconCompatParcelizer(new Image$FileIOEngine$MediaBrowserCompat$ItemReceiver(fileIOEngine, (byte) 0));
    }

    public final void IconCompatParcelizer(String str) {
        EasycashActivity.MediaBrowserCompat$ItemReceiver(this, (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.TILE_DISPLAY"), str, getIntent().getStringExtra("NCB_TRANSACTION_ID"));
    }
}
