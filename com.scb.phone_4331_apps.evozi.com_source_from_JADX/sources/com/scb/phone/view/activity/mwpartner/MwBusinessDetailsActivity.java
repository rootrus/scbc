package com.scb.phone.view.activity.mwpartner;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.InputFilter;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.custom.common.EditTextDecorator;
import com.scb.phone.view.custom.common.EditTextDecorator$MediaBrowserCompat$ItemReceiver;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.x509.DisplayText;
import p040o.AppCompatTextView;
import p040o.AuroraView;
import p040o.AutoCrashlyticsReportEncoder;
import p040o.C4783i;
import p040o.DebitCardResetOtpActivity;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.HmlETBPersonalInfoActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OnAbsListener;
import p040o.OnPaFaceDetectorListener;
import p040o.PaFaceDetectorManager;
import p040o.PaFaceLogger;
import p040o.getDateTextAppearance;
import p040o.getDividerColor;
import p040o.getFrontException;
import p040o.getFrontException$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.getIndexForDay;
import p040o.getNdkPayload;
import p040o.getRangeIndex;
import p040o.isSupportFragmentClass;
import p040o.onCheckBoxClick;
import p040o.onDetectComplete;
import p040o.onDetectFaceInfo;
import p040o.onDetectMotionDone;
import p040o.onDetectMotionTips;
import p040o.onDetectProgress;
import p040o.onDetectTips;
import p040o.onInterruptError;
import p040o.setAuroraBg;
import p040o.setAuroraColorChangeListener;
import p040o.setAuroraViewColor;
import p040o.setCircleRadius;
import p040o.setCircleXY;
import p040o.setGravityEnable;
import p040o.setLastBaselineToBottomHeight;
import p040o.setLoggerEnable;
import p040o.setMultiMode;
import p040o.setOnFaceDetectorListener;
import p040o.setScreenBrightnessEnable;
import p040o.setTapText;
import p040o.show;
import p040o.startFaceDetect;
import p040o.stopFaceDetect;
import p040o.validateSYR2;

public class MwBusinessDetailsActivity extends BaseActivity implements getFrontException$MediaBrowserCompat$CustomActionResultReceiver {
    public HmlETBPersonalInfoActivity<isSupportFragmentClass<getNdkPayload>> AlertController$RecycleListView;
    private getRangeIndex<getNdkPayload> AppCompatActivity;
    private getRangeIndex<AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder> AppCompatDelegateImpl$ListMenuDecorView;
    private HmlETBPersonalInfoActivity<Object> AppCompatDialogFragment;
    public HmlETBPersonalInfoActivity<Boolean> Keep;
    public getRangeIndex<AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder> MediaBrowserCompat$MediaItem;
    public HmlETBPersonalInfoActivity<Boolean> MediaBrowserCompat$SearchResultReceiver;
    public HmlETBPersonalInfoActivity<isSupportFragmentClass<AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder>> MediaDescriptionCompat;
    public HmlETBPersonalInfoActivity<isSupportFragmentClass<AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder>> MediaMetadataCompat;
    public HmlETBPersonalInfoActivity<Boolean> MediaSessionCompat$ResultReceiverWrapper;
    public getFrontException.read MediaSessionCompat$Token;
    public HmlETBPersonalInfoActivity<Boolean> PlaybackStateCompat;
    public HmlETBPersonalInfoActivity<Boolean> PlaybackStateCompat$CustomAction;
    @BindView
    Button btnChoosePhoto;
    @BindView
    Button btnNext;
    @BindView
    Button btnTakePhoto;
    @BindView
    EditText etEnglishShopName;
    @BindView
    EditText etLineId;
    @BindView
    EditText etReferralCode;
    @BindView
    EditText etShopEmail;
    @BindView
    EditText etShopPhoneNumber;
    @BindView
    EditText etThaiShopName;
    @BindView
    EditTextDecorator etdEnglishShopName;
    @BindView
    EditTextDecorator etdLineId;
    @BindView
    EditTextDecorator etdReferralCode;
    @BindView
    EditTextDecorator etdShopEmail;
    @BindView
    EditTextDecorator etdShopPhoneNumber;
    @BindView
    EditTextDecorator etdThaiShopName;
    @BindView
    ImageView ivAddShopCover;
    @BindView
    ImageView ivDeleteIcon;
    @BindView
    ImageView ivShopCover;
    @BindView
    LinearLayout llAddShopPhotoContainer;
    @BindView
    LinearLayout llShopPhotoContainer;
    private String setBackgroundResource;
    private HmlETBPersonalInfoActivity<Boolean> setContentView;
    public HmlETBPersonalInfoActivity<Boolean> setHasDecor;
    @BindView
    Spinner spinnerCategory;
    @BindView
    Spinner spinnerEstimatedSales;
    @BindView
    public Spinner spinnerSubCategory;
    @BindView
    TextView tvBusinessInformation;
    @BindView
    TextView tvKymNotice;
    @BindView
    TextView tvNameLabel;
    @BindView
    TextView tvNameValue;
    @BindView
    TextView tvPersonalInformation1;
    @BindView
    TextView tvPersonalInformation2;
    @BindView
    TextView tvShopCategoryLabel;
    @BindView
    TextView tvShopEstimatedSalesLabel;
    @BindView
    TextView tvShopPhoto;
    @BindView
    TextView tvShopSubCategoryLabel;
    @BindView
    TextView tvUploadPhotoError;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public static /* synthetic */ void m2959x50fd9e4a() {
    }

    public static /* synthetic */ void MediaSessionCompat$ResultReceiverWrapper() {
    }

    public static Intent IconCompatParcelizer(Context context) {
        return new Intent(context, MwBusinessDetailsActivity.class);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f78802131493105);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTabContainer();
        setTitle(R.string.mw_shop_information_title);
        mo13676d_("merchant_business_detail");
        this.etdLineId.MediaBrowserCompat$SearchResultReceiver.add(new write(this, setAuroraViewColor.read));
        this.etdThaiShopName.MediaBrowserCompat$SearchResultReceiver.add(new write(this, setAuroraColorChangeListener.MediaBrowserCompat$CustomActionResultReceiver));
        this.etdEnglishShopName.MediaBrowserCompat$SearchResultReceiver.add(new AuroraView(this));
        this.etdShopPhoneNumber.MediaBrowserCompat$SearchResultReceiver.add(new onDetectMotionTips(this));
        this.etdShopEmail.MediaBrowserCompat$SearchResultReceiver.add(new onDetectMotionDone(this));
        this.etdReferralCode.MediaBrowserCompat$SearchResultReceiver.add(new stopFaceDetect(this));
        this.MediaSessionCompat$ResultReceiverWrapper = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver();
        this.setHasDecor = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver();
        this.MediaBrowserCompat$SearchResultReceiver = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver();
        this.PlaybackStateCompat$CustomAction = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver();
        this.Keep = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver();
        this.PlaybackStateCompat = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver();
        this.setContentView = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver();
        this.etdShopPhoneNumber.setPhoneNumberTextWatcher();
        boolean z = false;
        this.etEnglishShopName.setFilters(new InputFilter[]{new InputFilter.AllCaps(), new InputFilter.LengthFilter(DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE)});
        DebitCardResetOtpActivity<R> combineLatest = DebitCardResetOtpActivity.combineLatest(this.MediaSessionCompat$ResultReceiverWrapper, this.setHasDecor, this.MediaBrowserCompat$SearchResultReceiver, this.PlaybackStateCompat$CustomAction, this.Keep, this.PlaybackStateCompat, this.setContentView, C4783i.C4787a.MediaBrowserCompat$ItemReceiver);
        this.MediaBrowserCompat$MediaItem = new getRangeIndex<>(this, getResources().getString(R.string.mw_shop_information_select_business_type), setAuroraBg.read, new onDetectProgress(this));
        this.AppCompatActivity = new getRangeIndex<>(this, getResources().getString(R.string.mw_shop_information_select_product_type), getDividerColor.IconCompatParcelizer, new OnPaFaceDetectorListener(this));
        this.AppCompatDelegateImpl$ListMenuDecorView = new getRangeIndex<>(this, getResources().getString(R.string.mw_shop_information_select_month_sale), setLoggerEnable.read, new setScreenBrightnessEnable(this));
        this.MediaBrowserCompat$MediaItem.write(this.spinnerCategory);
        this.AppCompatActivity.write(this.spinnerSubCategory);
        this.AppCompatDelegateImpl$ListMenuDecorView.write(this.spinnerEstimatedSales);
        this.AppCompatDialogFragment = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver();
        this.MediaMetadataCompat = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver();
        this.AlertController$RecycleListView = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver();
        this.MediaDescriptionCompat = HmlETBPersonalInfoActivity.MediaBrowserCompat$CustomActionResultReceiver();
        EditText editText = this.etThaiShopName;
        if (editText != null) {
            DebitCardResetOtpActivity map = new validateSYR2(editText).map(setOnFaceDetectorListener.read);
            EditText editText2 = this.etShopPhoneNumber;
            if (editText2 != null) {
                DebitCardResetOtpActivity.combineLatest(map, new validateSYR2(editText2).map(setCircleXY.MediaBrowserCompat$CustomActionResultReceiver), this.MediaMetadataCompat, this.AlertController$RecycleListView, this.MediaDescriptionCompat, combineLatest, new setCircleRadius(this)).takeUntil(this.AppCompatDialogFragment).subscribe(new getDateTextAppearance(this.btnNext));
                this.MediaMetadataCompat.onNext(isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver());
                this.AlertController$RecycleListView.onNext(isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver());
                this.MediaDescriptionCompat.onNext(isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver());
                EditTextDecorator editTextDecorator = this.etdLineId;
                onDetectComplete ondetectcomplete = new onDetectComplete(this);
                editTextDecorator.write.add(ondetectcomplete);
                ondetectcomplete.MediaBrowserCompat$CustomActionResultReceiver(!(editTextDecorator.read.getVisibility() == 0));
                EditTextDecorator editTextDecorator2 = this.etdThaiShopName;
                OnAbsListener onAbsListener = new OnAbsListener(this);
                editTextDecorator2.write.add(onAbsListener);
                onAbsListener.MediaBrowserCompat$CustomActionResultReceiver(!(editTextDecorator2.read.getVisibility() == 0));
                EditTextDecorator editTextDecorator3 = this.etdEnglishShopName;
                onInterruptError oninterrupterror = new onInterruptError(this);
                editTextDecorator3.write.add(oninterrupterror);
                oninterrupterror.MediaBrowserCompat$CustomActionResultReceiver(!(editTextDecorator3.read.getVisibility() == 0));
                EditTextDecorator editTextDecorator4 = this.etdShopPhoneNumber;
                PaFaceDetectorManager.Holder holder = new PaFaceDetectorManager.Holder(this);
                editTextDecorator4.write.add(holder);
                holder.MediaBrowserCompat$CustomActionResultReceiver(!(editTextDecorator4.read.getVisibility() == 0));
                EditTextDecorator editTextDecorator5 = this.etdShopEmail;
                onDetectTips ondetecttips = new onDetectTips(this);
                editTextDecorator5.write.add(ondetecttips);
                ondetecttips.MediaBrowserCompat$CustomActionResultReceiver(!(editTextDecorator5.read.getVisibility() == 0));
                EditTextDecorator editTextDecorator6 = this.etdReferralCode;
                PaFaceLogger paFaceLogger = new PaFaceLogger(this);
                editTextDecorator6.write.add(paFaceLogger);
                if (editTextDecorator6.read.getVisibility() == 0) {
                    z = true;
                }
                paFaceLogger.MediaBrowserCompat$CustomActionResultReceiver(!z);
                this.MediaSessionCompat$Token.read((getFrontException$MediaBrowserCompat$CustomActionResultReceiver) this);
                this.MediaSessionCompat$Token.IconCompatParcelizer();
                return;
            }
            throw new NullPointerException("view == null");
        }
        throw new NullPointerException("view == null");
    }

    public static /* synthetic */ Boolean IconCompatParcelizer(Boolean bool, Boolean bool2) {
        return Boolean.valueOf(bool.booleanValue() && bool2.booleanValue());
    }

    public static /* synthetic */ Boolean IconCompatParcelizer(Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) throws Exception {
        T t = show.IconCompatParcelizer((T[]) new Boolean[]{bool, bool2, bool3, bool4, bool5, bool6, bool7}).IconCompatParcelizer(setMultiMode.read).IconCompatParcelizer;
        if (t != null) {
            return (Boolean) t;
        }
        throw new NoSuchElementException("No value present");
    }

    public void onDestroy() {
        super.onDestroy();
        this.AppCompatDialogFragment.onNext(new Object());
        this.AppCompatDialogFragment.onComplete();
        this.MediaMetadataCompat.onComplete();
        this.AlertController$RecycleListView.onComplete();
        this.MediaDescriptionCompat.onComplete();
    }

    public final void write(boolean z) {
        this.spinnerSubCategory.setEnabled(z);
        this.tvShopSubCategoryLabel.setTextColor(setLastBaselineToBottomHeight.read(this, z ? R.color.f66092131099764 : R.color.f66182131099773));
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.setType("image/*");
        if (intent.resolveActivity(getPackageManager()) != null) {
            IntentTidInjectionActivityAspect.aspectOf();
            try {
                Intent read = setTapText.write(this, intent).read();
                MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                sb.append(read.getData());
                sb.append("\n with context ");
                sb.append(hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                startActivityForResult(read, 1366);
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public final void IconCompatParcelizer() {
        Intent intent = new Intent("android.media.action.IMAGE_CAPTURE");
        if (intent.resolveActivity(getPackageManager()) != null) {
            try {
                File file = new File(getFilesDir(), "merchant_wallet_temp.jpg");
                Uri IconCompatParcelizer = AppCompatTextView.IconCompatParcelizer(this, "com.scb.phone.fileprovider", file);
                file.getAbsolutePath();
                this.setBackgroundResource = IconCompatParcelizer.toString();
                intent.putExtra("output", IconCompatParcelizer);
                IntentTidInjectionActivityAspect.aspectOf();
                try {
                    Intent read = setTapText.write(this, intent).read();
                    MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
                    sb.append(read.getData());
                    sb.append("\n with context ");
                    sb.append(hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
                    startActivityForResult(read, 1365);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } catch (IOException e) {
                onCheckBoxClick.IconCompatParcelizer(e);
            }
        }
    }

    public final void write() {
        Intent read = MwShopTypeActivity.read(this);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, read).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(String str) {
        Intent MediaBrowserCompat$CustomActionResultReceiver = MwPartnerCropPhotoActivity.MediaBrowserCompat$CustomActionResultReceiver(this, str);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$CustomActionResultReceiver).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read, 1367);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        switch (i) {
            case 1365:
                if (i2 == -1) {
                    this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver(this.setBackgroundResource);
                    return;
                }
                return;
            case 1366:
                if (i2 == -1 && intent.getData() != null) {
                    this.MediaSessionCompat$Token.write(intent.getData().toString());
                    return;
                }
                return;
            case 1367:
                if (i2 == -1 && intent != null) {
                    this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindDepositSelectorFragment.read((Context) this, MwPartnerCropPhotoActivity.read(intent)));
                    return;
                } else if (i2 == 0 && intent != null) {
                    this.MediaSessionCompat$Token.MediaBrowserCompat$CustomActionResultReceiver();
                    return;
                } else {
                    return;
                }
            default:
                return;
        }
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        getIndexForDay.MediaBrowserCompat$CustomActionResultReceiver(this, i, iArr);
    }

    public final void write(List<getNdkPayload> list) {
        this.AppCompatActivity.MediaBrowserCompat$ItemReceiver(list);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(String str, String str2) {
        this.tvNameValue.setText(str);
        this.etLineId.setText(str2);
    }

    public final void write(String str) {
        this.etShopPhoneNumber.setText(str);
    }

    public final void read(String str) {
        this.etShopEmail.setText(str);
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onNextClick() {
        this.MediaSessionCompat$Token.read(new AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder(this.etLineId.getText().toString(), this.etThaiShopName.getText().toString(), this.etEnglishShopName.getText().toString(), this.etShopPhoneNumber.getText().toString(), this.etShopEmail.getText().toString(), this.etReferralCode.getText().toString()));
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onChoosePhotoClick() {
        this.MediaSessionCompat$Token.read();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onTakePhotoClickBeforeCheck() {
        getIndexForDay.IconCompatParcelizer(this);
    }

    public final void IconCompatParcelizer(List<AutoCrashlyticsReportEncoder.CrashlyticsReportFilesPayloadFileEncoder> list) {
        this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver(list);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<AutoCrashlyticsReportEncoder.CrashlyticsReportEncoder> list) {
        this.AppCompatDelegateImpl$ListMenuDecorView.MediaBrowserCompat$ItemReceiver(list);
    }

    public final void MediaBrowserCompat$SearchResultReceiver(String str) {
        this.llAddShopPhotoContainer.setVisibility(8);
        this.llShopPhotoContainer.setVisibility(0);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(str, this.ivShopCover);
    }

    public final void MediaBrowserCompat$MediaItem(String str) {
        this.llAddShopPhotoContainer.setVisibility(8);
        this.llShopPhotoContainer.setVisibility(0);
        FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(str, this.ivShopCover);
    }

    public final void read() {
        this.llShopPhotoContainer.setVisibility(8);
        this.llAddShopPhotoContainer.setVisibility(0);
    }

    public final void IconCompatParcelizer(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder) {
        this.etThaiShopName.setText(crashlyticsReportSessionOperatingSystemEncoder.MediaMetadataCompat);
        this.etEnglishShopName.setText(crashlyticsReportSessionOperatingSystemEncoder.write);
        this.etShopPhoneNumber.setText(crashlyticsReportSessionOperatingSystemEncoder.MediaBrowserCompat$ItemReceiver);
        this.etShopEmail.setText(crashlyticsReportSessionOperatingSystemEncoder.IconCompatParcelizer);
        this.etReferralCode.setText(crashlyticsReportSessionOperatingSystemEncoder.read);
    }

    public final void write(int i) {
        this.spinnerCategory.setSelection(i + 1);
    }

    public final void IconCompatParcelizer(int i) {
        this.spinnerSubCategory.setSelection(i + 1);
    }

    public final void MediaBrowserCompat$ItemReceiver(int i) {
        this.spinnerEstimatedSales.setSelection(i + 1);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.tvKymNotice.setVisibility(0);
    }

    public final void MediaDescriptionCompat() {
        this.tvUploadPhotoError.setVisibility(0);
    }

    public final void write(AutoCrashlyticsReportEncoder.CrashlyticsReportSessionOperatingSystemEncoder crashlyticsReportSessionOperatingSystemEncoder) {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.mw_shop_information_change_information_titile);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(R.string.mw_shop_information_change_information_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.mw_dialog_business_detail_confirm_close_btn_cancel), PaFaceDetectorManager.C69711.MediaBrowserCompat$CustomActionResultReceiver);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.confirm), new onDetectFaceInfo(this, crashlyticsReportSessionOperatingSystemEncoder)).show();
    }

    public final void IconCompatParcelizer(boolean z) {
        this.setContentView.onNext(Boolean.valueOf(z));
    }

    static class write implements EditTextDecorator$MediaBrowserCompat$ItemReceiver {
        private final Context MediaBrowserCompat$ItemReceiver;
        private final C10780write write;

        /* renamed from: com.scb.phone.view.activity.mwpartner.MwBusinessDetailsActivity$write$write  reason: collision with other inner class name */
        public interface C10780write {
            boolean MediaBrowserCompat$CustomActionResultReceiver(String str);
        }

        write(Context context, C10780write write2) {
            this.MediaBrowserCompat$ItemReceiver = context;
            this.write = write2;
        }

        public final String read(String str) {
            if (this.write.MediaBrowserCompat$CustomActionResultReceiver(str)) {
                return null;
            }
            return this.MediaBrowserCompat$ItemReceiver.getString(R.string.mw_bd_error_line_id);
        }
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != 16908332) {
            return super.onOptionsItemSelected(menuItem);
        }
        MediaSessionCompat$Token();
        return true;
    }

    public void onBackPressed() {
        MediaSessionCompat$Token();
    }

    private void MediaSessionCompat$Token() {
        CustomDialog IconCompatParcelizer = CustomDialog.IconCompatParcelizer((Context) this);
        String string = IconCompatParcelizer.read.getString(R.string.mw_dialog_business_detail_confirm_close_title);
        if (!(string == null || string.length() == 0)) {
            IconCompatParcelizer.mTitleTextView.setVisibility(0);
            IconCompatParcelizer.mTitleTextView.setText(string);
        }
        String string2 = IconCompatParcelizer.read.getString(R.string.mw_dialog_business_detail_confirm_close_description);
        if (true ^ (string2 == null || string2.length() == 0)) {
            IconCompatParcelizer.mTextTextView.setVisibility(0);
            IconCompatParcelizer.mTextTextView.setText(string2);
        }
        CustomDialog MediaBrowserCompat$ItemReceiver = IconCompatParcelizer.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer.read.getString(R.string.mw_dialog_business_detail_confirm_close_btn_cancel), startFaceDetect.MediaBrowserCompat$ItemReceiver);
        MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.mw_dialog_business_detail_confirm_close_btn_confirm), new setGravityEnable(this)).show();
    }

    /* access modifiers changed from: package-private */
    @OnClick
    public void onDeleteClick() {
        try {
            new File(getFilesDir(), "merchant_wallet_temp.jpg").deleteOnExit();
        } catch (IOException e) {
            onCheckBoxClick.read("Deleting image file failed", e);
        }
        this.MediaSessionCompat$Token.write();
    }
}
