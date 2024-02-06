package com.scb.phone.view.activity.etb;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.androidadvance.topsnackbar.TSnackbar;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.HomeActivity;
import com.scb.phone.view.activity.splash.SplashActivity;
import com.scb.phone.view.custom.CustomInformationList;
import com.scb.phone.view.custom.investment.CustomSuccessInformation;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.internal.cache.DiskLruCache;
import p040o.AlertController$RecycleListView;
import p040o.BankingServicesDeepLinkActivity;
import p040o.C3549J;
import p040o.C3763S;
import p040o.C4131c;
import p040o.C7387pt;
import p040o.C7390pw;
import p040o.C7404qq;
import p040o.C9838Z;
import p040o.C9982x74544727;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindEBillSelectedFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.IndoorBuilding$MediaBrowserCompat$ItemReceiver;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ScaleType;
import p040o.ScriptIntrinsicBlend;
import p040o.StreetViewPanoramaFragment;
import p040o.TextureRotationUtil;
import p040o.access$1900;
import p040o.access$2600;
import p040o.cacheUserData;
import p040o.copyToCodedOutputStream;
import p040o.defaultReportUploader;
import p040o.drawFrame;
import p040o.getOversizeImage;
import p040o.getSecondPassTexelHeightUniform;
import p040o.onCheckBoxClick;
import p040o.onStart;
import p040o.setCvv;
import p040o.setTapText;

public class EtbSuccessActivity extends BaseActivity implements setCvv.MediaDescriptionCompat {
    /* access modifiers changed from: private */
    public access$1900 MediaBrowserCompat$MediaItem;
    private copyToCodedOutputStream MediaBrowserCompat$SearchResultReceiver;
    private List<access$2600> MediaDescriptionCompat;
    private List<access$2600> MediaMetadataCompat;
    private ScriptIntrinsicBlend MediaSessionCompat$ResultReceiverWrapper = new ScriptIntrinsicBlend();
    @BindView
    LinearLayout layoutRemarks;
    @HmlPinActivity
    public getSecondPassTexelHeightUniform presenter;
    @BindView
    Button saveButton;
    @BindView
    TextView tvDateTime;
    @BindView
    TextView tvRefId;
    @BindView
    TextView tvTitle;
    @BindView
    CustomInformationList vMonthlyDeduction;
    @BindView
    CustomInformationList vOpeningDeposit;
    @BindView
    CustomSuccessInformation vSuccessInformation;

    public void onBackPressed() {
    }

    public class EtbScreenshot_ViewBinding implements Unbinder {
        private EtbScreenshot MediaBrowserCompat$ItemReceiver;

        public EtbScreenshot_ViewBinding(EtbScreenshot etbScreenshot, View view) {
            this.MediaBrowserCompat$ItemReceiver = etbScreenshot;
            etbScreenshot.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.text_title, "field 'tvTitle'", TextView.class);
            etbScreenshot.tvDateTime = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_date_time, "field 'tvDateTime'", TextView.class);
            etbScreenshot.tvRefId = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.tv_ref_id, "field 'tvRefId'", TextView.class);
            etbScreenshot.vSuccessInformation = (CustomSuccessInformation) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.success_information, "field 'vSuccessInformation'", CustomSuccessInformation.class);
            etbScreenshot.vOpeningDeposit = (CustomInformationList) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_information_list_opening_deposit, "field 'vOpeningDeposit'", CustomInformationList.class);
            etbScreenshot.vMonthlyDeduction = (CustomInformationList) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.custom_information_list_monthly_deduction, "field 'vMonthlyDeduction'", CustomInformationList.class);
            etbScreenshot.layoutRemarks = (LinearLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.container_remarks, "field 'layoutRemarks'", LinearLayout.class);
        }

        public final void read() {
            EtbScreenshot etbScreenshot = this.MediaBrowserCompat$ItemReceiver;
            if (etbScreenshot != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                etbScreenshot.tvTitle = null;
                etbScreenshot.tvDateTime = null;
                etbScreenshot.tvRefId = null;
                etbScreenshot.vSuccessInformation = null;
                etbScreenshot.vOpeningDeposit = null;
                etbScreenshot.vMonthlyDeduction = null;
                etbScreenshot.layoutRemarks = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public static Intent read(Context context, access$1900 access_1900, cacheUserData cacheuserdata, defaultReportUploader defaultreportuploader) {
        Intent intent = new Intent(context, EtbSuccessActivity.class);
        intent.putExtra("com.scb.phone.view.fragment.etb.ARG_ACCOUNT", access_1900);
        intent.putExtra("EXTRA_ETB_OTP", cacheuserdata);
        intent.putExtra("ARG_ETB_REVIEW", defaultreportuploader);
        return intent;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77812131493006);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$MediaItem = (access$1900) getIntent().getExtras().getParcelable("com.scb.phone.view.fragment.etb.ARG_ACCOUNT");
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        getSecondPassTexelHeightUniform getsecondpasstexelheightuniform = this.presenter;
        access$1900 access_1900 = this.MediaBrowserCompat$MediaItem;
        cacheUserData cacheuserdata = (cacheUserData) getIntent().getParcelableExtra("EXTRA_ETB_OTP");
        defaultReportUploader defaultreportuploader = (defaultReportUploader) getIntent().getParcelableExtra("ARG_ETB_REVIEW");
        String D_ = mo3026D_();
        getsecondpasstexelheightuniform.read = cacheuserdata;
        C3549J j = new C3549J(getsecondpasstexelheightuniform, access_1900);
        boolean z = true;
        if (getsecondpasstexelheightuniform.RatingCompat != null) {
            j.IconCompatParcelizer(getsecondpasstexelheightuniform.RatingCompat);
        }
        drawFrame drawframe = new drawFrame(getsecondpasstexelheightuniform, cacheuserdata);
        if (getsecondpasstexelheightuniform.RatingCompat != null) {
            drawframe.IconCompatParcelizer(getsecondpasstexelheightuniform.RatingCompat);
        }
        if ("2".equalsIgnoreCase(access_1900.MediaBrowserCompat$CustomActionResultReceiver)) {
            C4131c.C4136c cVar = C4131c.C4136c.read;
            if (getsecondpasstexelheightuniform.RatingCompat != null) {
                cVar.IconCompatParcelizer(getsecondpasstexelheightuniform.RatingCompat);
            }
        } else if (DiskLruCache.VERSION_1.equalsIgnoreCase(access_1900.MediaBrowserCompat$CustomActionResultReceiver)) {
            C4131c.C4137d dVar = C4131c.C4137d.IconCompatParcelizer;
            if (getsecondpasstexelheightuniform.RatingCompat != null) {
                dVar.IconCompatParcelizer(getsecondpasstexelheightuniform.RatingCompat);
            }
        }
        ScaleType scaleType = new ScaleType(getsecondpasstexelheightuniform, defaultreportuploader);
        if (getsecondpasstexelheightuniform.RatingCompat != null) {
            scaleType.IconCompatParcelizer(getsecondpasstexelheightuniform.RatingCompat);
        }
        TextureRotationUtil textureRotationUtil = new TextureRotationUtil(getsecondpasstexelheightuniform, access_1900, defaultreportuploader, cacheuserdata);
        if (getsecondpasstexelheightuniform.RatingCompat == null) {
            z = false;
        }
        if (z) {
            textureRotationUtil.IconCompatParcelizer(getsecondpasstexelheightuniform.RatingCompat);
        }
        getsecondpasstexelheightuniform.MediaBrowserCompat$ItemReceiver.write(D_);
        getsecondpasstexelheightuniform.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new IndoorBuilding$MediaBrowserCompat$ItemReceiver<List<StreetViewPanoramaFragment>>(access_1900, cacheuserdata, defaultreportuploader) {
            private /* synthetic */ cacheUserData IconCompatParcelizer;
            private /* synthetic */ defaultReportUploader MediaBrowserCompat$CustomActionResultReceiver;
            private /* synthetic */ access$1900 read;

            {
                this.read = r2;
                this.IconCompatParcelizer = r3;
                this.MediaBrowserCompat$CustomActionResultReceiver = r4;
            }

            public final /* synthetic */ void onNext(Object obj) {
                isSupportFragmentClass issupportfragmentclass;
                String str;
                List list = (List) obj;
                super.onNext(list);
                show show = new show(list);
                if (show.IconCompatParcelizer.hasNext()) {
                    issupportfragmentclass = isSupportFragmentClass.read(show.IconCompatParcelizer.next());
                } else {
                    issupportfragmentclass = isSupportFragmentClass.MediaBrowserCompat$CustomActionResultReceiver();
                }
                boolean z = true;
                if (issupportfragmentclass.IconCompatParcelizer != null) {
                    T t = issupportfragmentclass.IconCompatParcelizer;
                    if (t != null) {
                        str = ((StreetViewPanoramaFragment) t).read;
                    } else {
                        throw new NoSuchElementException("No value present");
                    }
                } else {
                    str = "";
                }
                String str2 = str;
                getSecondPassTexelHeightUniform getsecondpasstexelheightuniform = getSecondPassTexelHeightUniform.this;
                asInt asint = new asInt(this, this.read);
                if (getsecondpasstexelheightuniform.RatingCompat != null) {
                    asint.IconCompatParcelizer(getsecondpasstexelheightuniform.RatingCompat);
                }
                getSecondPassTexelHeightUniform getsecondpasstexelheightuniform2 = getSecondPassTexelHeightUniform.this;
                loadProgram loadprogram = new loadProgram(this, this.IconCompatParcelizer);
                if (getsecondpasstexelheightuniform2.RatingCompat != null) {
                    loadprogram.IconCompatParcelizer(getsecondpasstexelheightuniform2.RatingCompat);
                }
                if ("2".equalsIgnoreCase(this.read.MediaBrowserCompat$CustomActionResultReceiver)) {
                    getSecondPassTexelHeightUniform getsecondpasstexelheightuniform3 = getSecondPassTexelHeightUniform.this;
                    C4131c.C4136c cVar = C4131c.C4136c.read;
                    if (getsecondpasstexelheightuniform3.RatingCompat != null) {
                        cVar.IconCompatParcelizer(getsecondpasstexelheightuniform3.RatingCompat);
                    }
                } else if (DiskLruCache.VERSION_1.equalsIgnoreCase(this.read.MediaBrowserCompat$CustomActionResultReceiver)) {
                    getSecondPassTexelHeightUniform getsecondpasstexelheightuniform4 = getSecondPassTexelHeightUniform.this;
                    C4131c.C4137d dVar = C4131c.C4137d.IconCompatParcelizer;
                    if (getsecondpasstexelheightuniform4.RatingCompat != null) {
                        dVar.IconCompatParcelizer(getsecondpasstexelheightuniform4.RatingCompat);
                    }
                }
                getSecondPassTexelHeightUniform getsecondpasstexelheightuniform5 = getSecondPassTexelHeightUniform.this;
                Rotation rotation = new Rotation(this, this.MediaBrowserCompat$CustomActionResultReceiver, str2);
                if (getsecondpasstexelheightuniform5.RatingCompat != null) {
                    rotation.IconCompatParcelizer(getsecondpasstexelheightuniform5.RatingCompat);
                }
                getSecondPassTexelHeightUniform getsecondpasstexelheightuniform6 = getSecondPassTexelHeightUniform.this;
                OpenGlUtils openGlUtils = new OpenGlUtils(this, this.read, this.MediaBrowserCompat$CustomActionResultReceiver, this.IconCompatParcelizer, str2);
                if (getsecondpasstexelheightuniform6.RatingCompat != null) {
                    openGlUtils.IconCompatParcelizer(getsecondpasstexelheightuniform6.RatingCompat);
                }
                if (getSecondPassTexelHeightUniform.this.write.MediaBrowserCompat$CustomActionResultReceiver.setShortcut()) {
                    getSecondPassTexelHeightUniform getsecondpasstexelheightuniform7 = getSecondPassTexelHeightUniform.this;
                    C3964Y y = C3964Y.MediaBrowserCompat$CustomActionResultReceiver;
                    if (getsecondpasstexelheightuniform7.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        y.IconCompatParcelizer(getsecondpasstexelheightuniform7.RatingCompat);
                        return;
                    }
                    return;
                }
                getSecondPassTexelHeightUniform getsecondpasstexelheightuniform8 = getSecondPassTexelHeightUniform.this;
                PixelBuffer pixelBuffer = PixelBuffer.IconCompatParcelizer;
                if (getsecondpasstexelheightuniform8.RatingCompat != null) {
                    pixelBuffer.IconCompatParcelizer(getsecondpasstexelheightuniform8.RatingCompat);
                }
                if (this.IconCompatParcelizer.IconCompatParcelizer) {
                    getSecondPassTexelHeightUniform getsecondpasstexelheightuniform9 = getSecondPassTexelHeightUniform.this;
                    C3763S s = C3763S.MediaBrowserCompat$ItemReceiver;
                    if (getsecondpasstexelheightuniform9.RatingCompat == null) {
                        z = false;
                    }
                    if (z) {
                        s.IconCompatParcelizer(getsecondpasstexelheightuniform9.RatingCompat);
                    }
                }
            }

            static /* synthetic */ void read(setCvv.MediaDescriptionCompat mediaDescriptionCompat) {
                mediaDescriptionCompat.write(false);
                mediaDescriptionCompat.MediaBrowserCompat$ItemReceiver(false);
            }
        });
        this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "etb_sucess");
    }

    public final void IconCompatParcelizer(String str) {
        this.tvTitle.setText(str);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        write write2 = new write();
        String str = this.MediaBrowserCompat$SearchResultReceiver.RatingCompat;
        DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(write2, new EtbScreenshot(String.format(getString(R.string.etb_success_screenshot_filename), new Object[]{str}), this.MediaBrowserCompat$SearchResultReceiver, this.MediaMetadataCompat, this.MediaDescriptionCompat, z), this)).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribe(new C7390pw(this), new C7387pt(this));
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        C7404qq.IconCompatParcelizer(this, i, iArr);
    }

    @OnClick
    public void onSaveButtonClicked() {
        getSecondPassTexelHeightUniform getsecondpasstexelheightuniform = this.presenter;
        C9838Z z = C9838Z.write;
        if (getsecondpasstexelheightuniform.RatingCompat != null) {
            z.IconCompatParcelizer(getsecondpasstexelheightuniform.RatingCompat);
        }
    }

    @OnClick
    public void onReturnButtonClicked() {
        getSecondPassTexelHeightUniform getsecondpasstexelheightuniform = this.presenter;
        getsecondpasstexelheightuniform.write.read();
        getsecondpasstexelheightuniform.write.IconCompatParcelizer(new C9982x74544727(getsecondpasstexelheightuniform, (byte) 0));
    }

    public final void write(copyToCodedOutputStream copytocodedoutputstream) {
        this.MediaBrowserCompat$SearchResultReceiver = copytocodedoutputstream;
        this.tvDateTime.setText(copytocodedoutputstream.IconCompatParcelizer);
        this.tvRefId.setText(this.MediaBrowserCompat$SearchResultReceiver.RatingCompat);
        List<String> list = copytocodedoutputstream.MediaDescriptionCompat;
        this.layoutRemarks.removeAllViews();
        for (String text : list) {
            View inflate = LayoutInflater.from(this).inflate(R.layout.f90552131494282, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.tv_remarks)).setText(text);
            this.layoutRemarks.addView(inflate);
        }
        this.vSuccessInformation.setData(this.MediaBrowserCompat$SearchResultReceiver.read, this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver, this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver, this.MediaBrowserCompat$SearchResultReceiver.MediaMetadataCompat, this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$MediaItem);
    }

    public final void IconCompatParcelizer(List<access$2600> list) {
        this.MediaMetadataCompat = list;
        this.vOpeningDeposit.setItems(list, false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<access$2600> list) {
        this.MediaDescriptionCompat = list;
        if (DiskLruCache.VERSION_1.equalsIgnoreCase(this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver)) {
            this.vMonthlyDeduction.setItems(this.MediaDescriptionCompat, false);
            this.vMonthlyDeduction.setBottomViewVisibility(false);
            return;
        }
        this.vMonthlyDeduction.setItems(this.MediaDescriptionCompat, true);
    }

    public final void write(boolean z) {
        this.saveButton.setVisibility(z ? 0 : 8);
    }

    public final void RatingCompat() {
        write(this, R.id.root_view_successful, getString(R.string.mf_onboarding_success_saved_slip_snack_label), getOversizeImage.SUCCESS);
    }

    public final void MediaBrowserCompat$MediaItem() {
        int i;
        int i2;
        String string = getString(R.string.mf_onboarding_success_auto_saved_slip_snack_label);
        getOversizeImage getoversizeimage = getOversizeImage.SUCCESS;
        C10862 r8 = new TSnackbar.IconCompatParcelizer() {
            public final void read(TSnackbar tSnackbar, int i) {
                getSecondPassTexelHeightUniform getsecondpasstexelheightuniform = EtbSuccessActivity.this.presenter;
                if (getsecondpasstexelheightuniform.read.IconCompatParcelizer && getsecondpasstexelheightuniform.write.MediaBrowserCompat$CustomActionResultReceiver.setShortcut()) {
                    C3763S s = C3763S.MediaBrowserCompat$ItemReceiver;
                    if (getsecondpasstexelheightuniform.RatingCompat != null) {
                        s.IconCompatParcelizer(getsecondpasstexelheightuniform.RatingCompat);
                    }
                }
            }
        };
        if (getoversizeimage == getOversizeImage.SUCCESS) {
            i = R.drawable.ic_check_circle_white_24dp;
            i2 = R.color.f67402131099896;
        } else if (getoversizeimage == getOversizeImage.INFO) {
            i = R.drawable.info_icon;
            i2 = R.color.f70992131100255;
        } else {
            i = R.drawable.ic_error_white_24dp;
            i2 = R.color.f66062131099761;
        }
        int i3 = i;
        int i4 = i2;
        if (this.IconCompatParcelizer) {
            AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(this, findViewById(R.id.root_view_successful), i3, string, R.color.f71012131100257, i4, AlertController$RecycleListView.IconCompatParcelizer((Context) this), r8, 0, (View.OnClickListener) null, 0);
            return;
        }
        AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(this, findViewById(R.id.root_view_successful), i3, string, R.color.f71012131100257, i4, 0, r8, 0, (View.OnClickListener) null, 0);
    }

    public final void read() {
        write(this, R.id.root_view_successful, getString(R.string.etb_success_alert_over_30_account), getOversizeImage.ERROR);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        HomeActivity.write((Context) this, true);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        C7404qq.write(this, z);
    }

    public final void write() {
        this.vOpeningDeposit.setVisibility(8);
        this.vMonthlyDeduction.setVisibility(8);
        this.tvRefId.setVisibility(8);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.vMonthlyDeduction.setTitle(getString(R.string.etb_review_info_monthly_deduction_header_closing));
    }

    public static void MediaSessionCompat$QueueItem() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void MediaSessionCompat$ResultReceiverWrapper() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    public class EtbScreenshot extends ForwardingListenableFuture.SimpleForwardingListenableFuture {
        List<access$2600> IconCompatParcelizer;
        copyToCodedOutputStream MediaBrowserCompat$MediaItem;
        @BindView
        LinearLayout layoutRemarks;
        List<access$2600> read;
        @BindView
        TextView tvDateTime;
        @BindView
        TextView tvRefId;
        @BindView
        TextView tvTitle;
        @BindView
        CustomInformationList vMonthlyDeduction;
        @BindView
        CustomInformationList vOpeningDeposit;
        @BindView
        CustomSuccessInformation vSuccessInformation;

        public EtbScreenshot(String str, copyToCodedOutputStream copytocodedoutputstream, List<access$2600> list, List<access$2600> list2, boolean z) {
            super(R.layout.f91412131494368, str, false, z);
            this.MediaBrowserCompat$MediaItem = copytocodedoutputstream;
            this.read = list;
            this.IconCompatParcelizer = list2;
        }
    }

    public class write extends FragmentBuilder_BindEBillSelectedFragment<EtbScreenshot> {
        public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
            EtbScreenshot etbScreenshot = (EtbScreenshot) simpleForwardingListenableFuture;
            ButterKnife.IconCompatParcelizer(etbScreenshot, view);
            TextView textView = etbScreenshot.tvTitle;
            getSecondPassTexelHeightUniform getsecondpasstexelheightuniform = EtbSuccessActivity.this.presenter;
            textView.setText(getsecondpasstexelheightuniform.IconCompatParcelizer.IconCompatParcelizer(EtbSuccessActivity.this.MediaBrowserCompat$MediaItem));
            etbScreenshot.tvDateTime.setText(etbScreenshot.MediaBrowserCompat$MediaItem.IconCompatParcelizer);
            etbScreenshot.tvRefId.setText(etbScreenshot.MediaBrowserCompat$MediaItem.RatingCompat);
            List<String> list = etbScreenshot.MediaBrowserCompat$MediaItem.MediaDescriptionCompat;
            etbScreenshot.layoutRemarks.removeAllViews();
            for (String text : list) {
                View inflate = LayoutInflater.from(EtbSuccessActivity.this.getBaseContext()).inflate(R.layout.f90552131494282, (ViewGroup) null);
                ((TextView) inflate.findViewById(R.id.tv_remarks)).setText(text);
                etbScreenshot.layoutRemarks.addView(inflate);
            }
            etbScreenshot.vSuccessInformation.setData(etbScreenshot.MediaBrowserCompat$MediaItem.read, etbScreenshot.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver, etbScreenshot.MediaBrowserCompat$MediaItem.MediaBrowserCompat$ItemReceiver, etbScreenshot.MediaBrowserCompat$MediaItem.MediaMetadataCompat, etbScreenshot.MediaBrowserCompat$MediaItem.MediaBrowserCompat$MediaItem);
            etbScreenshot.vOpeningDeposit.setItems(etbScreenshot.read, false);
            if (DiskLruCache.VERSION_1.equalsIgnoreCase(EtbSuccessActivity.this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver)) {
                etbScreenshot.vMonthlyDeduction.setItems(etbScreenshot.IconCompatParcelizer, false);
                etbScreenshot.vMonthlyDeduction.setBottomViewVisibility(false);
            } else {
                etbScreenshot.vMonthlyDeduction.setItems(etbScreenshot.IconCompatParcelizer, true);
            }
            etbScreenshot.vMonthlyDeduction.setTitleBackground(R.color.f70982131100254);
            etbScreenshot.vOpeningDeposit.setTitleBackground(R.color.f70982131100254);
            if ("2".equalsIgnoreCase(EtbSuccessActivity.this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver)) {
                etbScreenshot.vOpeningDeposit.setVisibility(8);
                etbScreenshot.vMonthlyDeduction.setVisibility(8);
                etbScreenshot.tvRefId.setVisibility(8);
            } else if (DiskLruCache.VERSION_1.equalsIgnoreCase(EtbSuccessActivity.this.MediaBrowserCompat$MediaItem.MediaBrowserCompat$CustomActionResultReceiver)) {
                etbScreenshot.vMonthlyDeduction.setTitle(EtbSuccessActivity.this.getString(R.string.etb_review_info_monthly_deduction_header_closing));
            }
        }
    }

    public final void IconCompatParcelizer() {
        Intent flags = new Intent(this, SplashActivity.class).setFlags(268468224);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, flags).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
