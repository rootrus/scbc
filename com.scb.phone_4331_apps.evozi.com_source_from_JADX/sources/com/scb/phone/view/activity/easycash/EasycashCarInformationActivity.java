package com.scb.phone.view.activity.easycash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.easycash.search.EasycashSequentialSearchActivity;
import com.scb.phone.view.activity.easycash.search.EasycashSequentialSearchActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.custom.common.CommonInputViewGroup;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import kotlin.TypeCastException;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Log;
import p040o.Barcode;
import p040o.C3463x6a16d4e;
import p040o.CreditCard;
import p040o.CustomConcurrentHashMap;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.Image;
import p040o.Image$BitmapDataObject$MediaBrowserCompat$MediaItem;
import p040o.Image$BitmapDataObject$MediaBrowserCompat$SearchResultReceiver;
import p040o.LinkedHashMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.forEachClear;
import p040o.getLegacySharedPrefs;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class EasycashCarInformationActivity extends BaseActivity implements CreditCard {
    private static EasycashCarInformationActivity$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$MediaItem = new EasycashCarInformationActivity$MediaBrowserCompat$ItemReceiver((byte) 0);
    private final read MediaBrowserCompat$SearchResultReceiver = new read(this);
    @BindView
    public Button btnCalculate;
    @HmlPinActivity
    public Image.BitmapDataObject presenter;
    @BindView
    public CustomSpinnerWithTitle spinnerLocation;
    @BindView
    public CustomSpinnerWithTitle spinnerYearRegistration;
    @HmlPinActivity
    public forEachClear tracker;
    @BindView
    public TextView tvBrand;
    @BindView
    public TextView tvModel;
    @BindView
    public TextView tvModelYear;
    @BindView
    public CommonInputViewGroup tvPlateNumber;
    @BindView
    public TextView tvSubModel;

    public static final void MediaBrowserCompat$CustomActionResultReceiver(Context context, String str, getLegacySharedPrefs getlegacysharedprefs) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) str, "monthlyIncome");
        onGetStartedClick.write((Object) getlegacysharedprefs, "landingTile");
        Intent intent = new Intent(context, EasycashCarInformationActivity.class);
        intent.putExtra("com.scb.phone.view.activity.easycash.MONTHLY_INCOME", str);
        intent.putExtra("com.scb.phone.view.activity.easycash.TILE_DISPLAY", getlegacysharedprefs);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            context.startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onCreate(Bundle bundle) {
        Activity activity = this;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(activity);
        super.onCreate(bundle);
        setContentView(R.layout.f77532131492978);
        ButterKnife.MediaBrowserCompat$ItemReceiver(activity);
        super.setStackedBackground();
        setTitle(R.string.auto_mcmc_header_title);
        setTabContainer();
        CommonInputViewGroup commonInputViewGroup = this.tvPlateNumber;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPlateNumber");
        }
        commonInputViewGroup.setFilter("^[\\u0E01-\\u0E39\\u0E40-\\u0E4C0-9]+$");
        CommonInputViewGroup commonInputViewGroup2 = this.tvPlateNumber;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPlateNumber");
        }
        TextWatcher textWatcher = this.MediaBrowserCompat$SearchResultReceiver;
        commonInputViewGroup2.mEditText.removeTextChangedListener(textWatcher);
        commonInputViewGroup2.MediaBrowserCompat$CustomActionResultReceiver.remove(textWatcher);
        CommonInputViewGroup commonInputViewGroup3 = this.tvPlateNumber;
        if (commonInputViewGroup3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPlateNumber");
        }
        TextWatcher textWatcher2 = this.MediaBrowserCompat$SearchResultReceiver;
        commonInputViewGroup3.mEditText.addTextChangedListener(textWatcher2);
        commonInputViewGroup3.MediaBrowserCompat$CustomActionResultReceiver.add(textWatcher2);
        CommonInputViewGroup commonInputViewGroup4 = this.tvPlateNumber;
        if (commonInputViewGroup4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPlateNumber");
        }
        boolean z = false;
        commonInputViewGroup4.setForegroundFontEnabled(false);
        CustomSpinnerWithTitle customSpinnerWithTitle = this.spinnerLocation;
        if (customSpinnerWithTitle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerLocation");
        }
        customSpinnerWithTitle.setForegroundFontEnabled(false);
        CustomSpinnerWithTitle customSpinnerWithTitle2 = this.spinnerYearRegistration;
        if (customSpinnerWithTitle2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerYearRegistration");
        }
        customSpinnerWithTitle2.setForegroundFontEnabled(false);
        Image.BitmapDataObject bitmapDataObject = this.presenter;
        if (bitmapDataObject == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        bitmapDataObject.MediaBrowserCompat$ItemReceiver(this);
        Intent intent = getIntent();
        if (intent != null) {
            Image.BitmapDataObject bitmapDataObject2 = this.presenter;
            if (bitmapDataObject2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            String stringExtra = intent.getStringExtra("com.scb.phone.view.activity.easycash.MONTHLY_INCOME");
            onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "it.getStringExtra(MONTHLY_INCOME)");
            onGetStartedClick.write((Object) stringExtra, "monthlyIncome");
            bitmapDataObject2.IconCompatParcelizer = new CustomConcurrentHashMap.NullEntry("MCMC", stringExtra, (String) null, (String) null, (String) null, (String) null, (CustomConcurrentHashMap.EntryFactory.C32861) null, (String) null, (String) null, 508);
            if (bitmapDataObject2.RatingCompat != null) {
                z = true;
            }
            if (z) {
                bitmapDataObject2.RatingCompat.AlertController$RecycleListView();
            }
            LinkedHashMultimap.C35651 r3 = bitmapDataObject2.read;
            FundFactSheetActivity image$BitmapDataObject$MediaBrowserCompat$CustomActionResultReceiver = new C3463x6a16d4e(bitmapDataObject2);
            FundFactSheetActivity write2 = new Image.BitmapDataObject.write(bitmapDataObject2);
            onGetStartedClick.write((Object) image$BitmapDataObject$MediaBrowserCompat$CustomActionResultReceiver, "onSuccess");
            onGetStartedClick.write((Object) write2, "onError");
            onGetStartedClick.write((Object) "MCMC", "productType");
            r3.MediaBrowserCompat$ItemReceiver(r3.IconCompatParcelizer, image$BitmapDataObject$MediaBrowserCompat$CustomActionResultReceiver, write2, new Barcode.CalendarDateTime.read("MCMC"), new LinkedHashMultimap.C35651.IconCompatParcelizer(r3));
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTitle(R.string.auto_mcmc_header_title);
        setTabContainer();
    }

    public final void read(List<String> list) {
        onGetStartedClick.write((Object) list, "locationList");
        CustomSpinnerWithTitle customSpinnerWithTitle = this.spinnerLocation;
        if (customSpinnerWithTitle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerLocation");
        }
        customSpinnerWithTitle.setItemsWithPlaceholder(list, true, false);
        CustomSpinnerWithTitle customSpinnerWithTitle2 = this.spinnerLocation;
        if (customSpinnerWithTitle2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerLocation");
        }
        customSpinnerWithTitle2.setMandatory(true);
        CustomSpinnerWithTitle customSpinnerWithTitle3 = this.spinnerLocation;
        if (customSpinnerWithTitle3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerLocation");
        }
        customSpinnerWithTitle3.setForegroundFontEnabled(true);
        CustomSpinnerWithTitle customSpinnerWithTitle4 = this.spinnerLocation;
        if (customSpinnerWithTitle4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerLocation");
        }
        customSpinnerWithTitle4.setOnCustomSpinnerWithTitleCompletion(new C5597xdd94d029(this));
    }

    public final void write(List<String> list) {
        onGetStartedClick.write((Object) list, "registrationYearList");
        CustomSpinnerWithTitle customSpinnerWithTitle = this.spinnerYearRegistration;
        if (customSpinnerWithTitle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerYearRegistration");
        }
        customSpinnerWithTitle.setItemsWithPlaceholder(list, true, false);
        CustomSpinnerWithTitle customSpinnerWithTitle2 = this.spinnerYearRegistration;
        if (customSpinnerWithTitle2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerYearRegistration");
        }
        customSpinnerWithTitle2.setMandatory(true);
        CustomSpinnerWithTitle customSpinnerWithTitle3 = this.spinnerYearRegistration;
        if (customSpinnerWithTitle3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerYearRegistration");
        }
        customSpinnerWithTitle3.setForegroundFontEnabled(true);
        CustomSpinnerWithTitle customSpinnerWithTitle4 = this.spinnerYearRegistration;
        if (customSpinnerWithTitle4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerYearRegistration");
        }
        customSpinnerWithTitle4.setOnCustomSpinnerWithTitleCompletion(new write(this));
    }

    public static final class write implements CustomSpinnerWithTitle.IconCompatParcelizer {
        private /* synthetic */ EasycashCarInformationActivity IconCompatParcelizer;

        public final void write() {
        }

        write(EasycashCarInformationActivity easycashCarInformationActivity) {
            this.IconCompatParcelizer = easycashCarInformationActivity;
        }

        public final void IconCompatParcelizer() {
            Image.BitmapDataObject bitmapDataObject = this.IconCompatParcelizer.presenter;
            if (bitmapDataObject == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            CustomSpinnerWithTitle customSpinnerWithTitle = this.IconCompatParcelizer.spinnerYearRegistration;
            if (customSpinnerWithTitle == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerYearRegistration");
            }
            String MediaBrowserCompat$ItemReceiver = customSpinnerWithTitle.MediaBrowserCompat$ItemReceiver();
            if (MediaBrowserCompat$ItemReceiver == null) {
                MediaBrowserCompat$ItemReceiver = "";
            }
            bitmapDataObject.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(CustomConcurrentHashMap.NullEntry nullEntry, int i, int i2) {
        onGetStartedClick.write((Object) nullEntry, "request");
        TextView textView = this.tvBrand;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvBrand");
        }
        textView.setText(nullEntry.IconCompatParcelizer);
        TextView textView2 = this.tvModel;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvModel");
        }
        textView2.setText(nullEntry.read);
        TextView textView3 = this.tvModelYear;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvModelYear");
        }
        textView3.setText(nullEntry.MediaBrowserCompat$SearchResultReceiver);
        TextView textView4 = this.tvSubModel;
        if (textView4 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvSubModel");
        }
        textView4.setText(nullEntry.RatingCompat);
        CommonInputViewGroup commonInputViewGroup = this.tvPlateNumber;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPlateNumber");
        }
        commonInputViewGroup.setText(nullEntry.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver);
        CommonInputViewGroup commonInputViewGroup2 = this.tvPlateNumber;
        if (commonInputViewGroup2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPlateNumber");
        }
        commonInputViewGroup2.setForegroundFontEnabled(true);
        CustomSpinnerWithTitle customSpinnerWithTitle = this.spinnerLocation;
        if (customSpinnerWithTitle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerLocation");
        }
        customSpinnerWithTitle.setSelectionIndex(i2 + 1);
        CustomSpinnerWithTitle customSpinnerWithTitle2 = this.spinnerYearRegistration;
        if (customSpinnerWithTitle2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerYearRegistration");
        }
        customSpinnerWithTitle2.setSelectionIndex(i + 1);
    }

    public final void write(boolean z) {
        Button button = this.btnCalculate;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnCalculate");
        }
        button.setEnabled(z);
    }

    @OnClick
    public final void onCarSequentialSearch() {
        EasycashSequentialSearchActivity$MediaBrowserCompat$ItemReceiver easycashSequentialSearchActivity$MediaBrowserCompat$ItemReceiver = EasycashSequentialSearchActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        AutoValue_CrashlyticsReport_Session_Event_Log autoValue_CrashlyticsReport_Session_Event_Log = AutoValue_CrashlyticsReport_Session_Event_Log.CAR;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) "MCMC", "productType");
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Log, "searchType");
        Intent intent = new Intent(context, EasycashSequentialSearchActivity.class);
        intent.putExtra("EXTRA_PRODUCT_TYPE", "MCMC");
        intent.putExtra("EXTRA_SEARCH_TYPE", autoValue_CrashlyticsReport_Session_Event_Log);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, 1203);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static final class read implements TextWatcher {
        private /* synthetic */ EasycashCarInformationActivity MediaBrowserCompat$ItemReceiver;

        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        read(EasycashCarInformationActivity easycashCarInformationActivity) {
            this.MediaBrowserCompat$ItemReceiver = easycashCarInformationActivity;
        }

        public final void afterTextChanged(Editable editable) {
            Image.BitmapDataObject bitmapDataObject = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (bitmapDataObject == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            bitmapDataObject.read(String.valueOf(editable));
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1203 && intent != null) {
            CommonInputViewGroup commonInputViewGroup = this.tvPlateNumber;
            if (commonInputViewGroup == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPlateNumber");
            }
            String str = "";
            commonInputViewGroup.setText(str);
            CustomSpinnerWithTitle customSpinnerWithTitle = this.spinnerLocation;
            if (customSpinnerWithTitle == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerLocation");
            }
            boolean z = false;
            customSpinnerWithTitle.setSelectionIndex(0);
            Image.BitmapDataObject bitmapDataObject = this.presenter;
            if (bitmapDataObject == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            bitmapDataObject.read(str);
            bitmapDataObject.read(-1);
            bitmapDataObject.IconCompatParcelizer(str);
            Image.BitmapDataObject bitmapDataObject2 = this.presenter;
            if (bitmapDataObject2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            Serializable serializableExtra = intent.getSerializableExtra("EXTRA_SEARCH_RESULT");
            if (serializableExtra != null) {
                HashMap hashMap = (HashMap) serializableExtra;
                onGetStartedClick.write((Object) hashMap, "searchResult");
                CustomConcurrentHashMap.NullEntry nullEntry = bitmapDataObject2.IconCompatParcelizer;
                if (nullEntry == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("mcmcCollateralRequest");
                }
                String str2 = (String) hashMap.get("BRAND");
                if (str2 == null) {
                    str2 = str;
                }
                onGetStartedClick.write((Object) str2, "<set-?>");
                nullEntry.IconCompatParcelizer = str2;
                String str3 = (String) hashMap.get("MODEL");
                if (str3 == null) {
                    str3 = str;
                }
                onGetStartedClick.write((Object) str3, "<set-?>");
                nullEntry.read = str3;
                String str4 = (String) hashMap.get("YEAROFMANUFACTURE");
                if (str4 == null) {
                    str4 = str;
                }
                onGetStartedClick.write((Object) str4, "<set-?>");
                nullEntry.MediaBrowserCompat$SearchResultReceiver = str4;
                String str5 = (String) hashMap.get("SUBMODEL");
                if (str5 != null) {
                    str = str5;
                }
                onGetStartedClick.write((Object) str, "<set-?>");
                nullEntry.RatingCompat = str;
                writeUInt64NoTag.IconCompatParcelizer image$BitmapDataObject$MediaBrowserCompat$MediaItem = new Image$BitmapDataObject$MediaBrowserCompat$MediaItem(bitmapDataObject2);
                if (bitmapDataObject2.RatingCompat != null) {
                    z = true;
                }
                if (z) {
                    image$BitmapDataObject$MediaBrowserCompat$MediaItem.IconCompatParcelizer(bitmapDataObject2.RatingCompat);
                    return;
                }
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.HashMap<kotlin.String, kotlin.String> /* = java.util.HashMap<kotlin.String, kotlin.String> */");
        }
    }

    @OnClick
    public final void onCalculateClick() {
        Image.BitmapDataObject bitmapDataObject = this.presenter;
        if (bitmapDataObject == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = Image.BitmapDataObject.IconCompatParcelizer.IconCompatParcelizer;
        if (bitmapDataObject.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(bitmapDataObject.RatingCompat);
        }
        LinkedHashMultimap.C35651 r1 = bitmapDataObject.read;
        FundFactSheetActivity mediaMetadataCompat = new Image.BitmapDataObject.MediaMetadataCompat(bitmapDataObject);
        FundFactSheetActivity image$BitmapDataObject$MediaBrowserCompat$SearchResultReceiver = new Image$BitmapDataObject$MediaBrowserCompat$SearchResultReceiver(bitmapDataObject);
        CustomConcurrentHashMap.NullEntry nullEntry = bitmapDataObject.IconCompatParcelizer;
        if (nullEntry == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mcmcCollateralRequest");
        }
        onGetStartedClick.write((Object) mediaMetadataCompat, "onSuccess");
        onGetStartedClick.write((Object) image$BitmapDataObject$MediaBrowserCompat$SearchResultReceiver, "onError");
        onGetStartedClick.write((Object) nullEntry, "request");
        r1.IconCompatParcelizer(r1.read, mediaMetadataCompat, image$BitmapDataObject$MediaBrowserCompat$SearchResultReceiver, new Barcode.DriverLicense.IconCompatParcelizer(nullEntry));
        forEachClear foreachclear = this.tracker;
        if (foreachclear == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tracker");
        }
        foreachclear.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "apply_loan_collateral_details");
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "applicationId");
        EasycashActivity.read(this, (getLegacySharedPrefs) getIntent().getParcelableExtra("com.scb.phone.view.activity.easycash.TILE_DISPLAY"));
    }

    public final void onDestroy() {
        CommonInputViewGroup commonInputViewGroup = this.tvPlateNumber;
        if (commonInputViewGroup == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvPlateNumber");
        }
        TextWatcher textWatcher = this.MediaBrowserCompat$SearchResultReceiver;
        commonInputViewGroup.mEditText.removeTextChangedListener(textWatcher);
        commonInputViewGroup.MediaBrowserCompat$CustomActionResultReceiver.remove(textWatcher);
        CustomSpinnerWithTitle customSpinnerWithTitle = this.spinnerLocation;
        if (customSpinnerWithTitle == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerLocation");
        }
        customSpinnerWithTitle.setOnCustomSpinnerWithTitleCompletion((CustomSpinnerWithTitle.IconCompatParcelizer) null);
        CustomSpinnerWithTitle customSpinnerWithTitle2 = this.spinnerYearRegistration;
        if (customSpinnerWithTitle2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("spinnerYearRegistration");
        }
        customSpinnerWithTitle2.setOnCustomSpinnerWithTitleCompletion((CustomSpinnerWithTitle.IconCompatParcelizer) null);
        Image.BitmapDataObject bitmapDataObject = this.presenter;
        if (bitmapDataObject == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        bitmapDataObject.onDestroy();
        super.onDestroy();
    }
}
