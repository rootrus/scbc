package com.scb.phone.view.fragment.hml;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.hml.HmlConsentActivity;
import com.scb.phone.view.activity.hml.HmlSimulatorAboutActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver;
import com.scb.phone.view.custom.common.CustomDeltaInputPressed;
import com.scb.phone.view.custom.common.CustomImageWithText;
import com.scb.phone.view.custom.common.CustomRibbonStatus;
import com.scb.phone.view.custom.common.CustomSchedulePayment;
import com.scb.phone.view.custom.investment.onboarding.CustomSpinnerWithTitle;
import com.scb.phone.view.custom.tierpricing.BaseProductCatalogueView;
import com.scb.phone.view.custom.tierpricing.TierPricingPromotionView;
import com.scb.phone.view.custom.transferandpay.CustomTransferAndPayItem;
import com.scb.phone.view.fragment.BaseFragment;
import com.squareup.picasso.Picasso;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.util.ArrayList;
import java.util.List;
import p040o.ActivityBuilder_BankingAgentTCActivity;
import p040o.ActivityBuilder_BasePersonalInfoActivity;
import p040o.ActivityBuilder_BindActivateChequeReviewActivity;
import p040o.ActivityBuilder_BindActivationSuccessfulActivity;
import p040o.ActivityBuilder_BindAddAccountConsentActivity;
import p040o.ActivityBuilder_BindAddFavoriteTransferActivity;
import p040o.ActivityBuilder_BindAddNewRecipientActivity;
import p040o.ActivityBuilder_BindAmortizationActivity;
import p040o.ActivityBuilder_BindAmortizationMerchantsActivity;
import p040o.ActivityBuilder_BindBankingActionActivity;
import p040o.ActivityBuilder_BindBaseActivity;
import p040o.ActivityBuilder_BindBillPaymentActivity;
import p040o.ActivityBuilder_BindBillPaymentReviewActivity;
import p040o.ActivityBuilder_BindBillPaymentSuccessActivity;
import p040o.ActivityBuilder_BindBulkTransferActivity;
import p040o.ActivityBuilder_BindBulkTransferInfoActivity;
import p040o.ActivityBuilder_BindBulkTransferInputActivity;
import p040o.ActivityBuilder_BindBulkTransferOtpActivity;
import p040o.ActivityBuilder_BindBulkTransferReviewActivity;
import p040o.ActivityBuilder_BindBulkTransferSuccessActivity;
import p040o.ActivityBuilder_BindCCRBaseActivity;
import p040o.ActivityBuilder_BindCalendarDialogActivity;
import p040o.ActivityBuilder_BindCalendarLandingActivity;
import p040o.ActivityBuilder_BindCardActivationActivity;
import p040o.C5462x904c0edb;
import p040o.CrashlyticsController;
import p040o.CrashlyticsReport;
import p040o.DeepLinkModule_HmlPersonalInformationDeepLinkActivity;
import p040o.ExtractionParameters_Factory;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.UTCStringToDate;
import p040o.ZSYR2K;
import p040o.checkDateTimeFormat;
import p040o.copyImageToExternalStorage;
import p040o.createIpImageFromBitmap;
import p040o.getAllowEnterTransitionOverlap;
import p040o.getCreateReportSpiCall;
import p040o.getNextTransition;
import p040o.getRegionHeight;
import p040o.recordFatalFirebaseEvent;
import p040o.setDomain;
import p040o.setDomain$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setFabCradleRoundedCornerRadius;
import p040o.setTapText;
import p040o.setTimestampMillis;
import p040o.show;
import p040o.toCollection;
import p040o.writeSessionPartsToSessionFile;
import p040o.zzct;
import p040o.zzfe;
import p040o.zzjx;

public abstract class HmlCalculatorFragment<T extends setDomain> extends BaseFragment implements ExtractionParameters_Factory {
    public Runnable IconCompatParcelizer = new ActivityBuilder_BindBulkTransferActivity(this);
    public Handler MediaBrowserCompat$CustomActionResultReceiver = new Handler();
    private zzjx.zza.zzb MediaBrowserCompat$MediaItem;
    private String RatingCompat;
    @BindView
    ImageView background;
    @BindView
    Button btnApply;
    @BindView
    CustomImageWithText businessOwnerInfoItem2ImageText;
    @BindView
    CustomTransferAndPayItem calculatorResult;
    @BindView
    CustomImageWithText consumerInfoItem2ImageText;
    @BindView
    LinearLayout interestOptionsContainer;
    @BindView
    public CustomDeltaInputPressed loanAmount;
    @BindView
    public CustomSpinnerWithTitle paymentDay;
    @HmlPinActivity
    public T presenter;
    @BindView
    ImageView productCatalogueArrow;
    @BindView
    LinearLayout productCatalogueContent;
    @HmlPinActivity
    public toCollection productCatalogueFactory;
    @BindView
    TextView productCataloguePromo;
    @BindView
    TextView productCatalogueValidUntil;
    @BindView
    LinearLayout promotionsContainer;
    @BindView
    CustomRibbonStatus ribbonStatus;
    @BindView
    ConstraintLayout rootView;
    @BindView
    public CustomSchedulePayment schedulePayment;
    @BindView
    public CustomSpinnerWithTitle startPayment;
    @BindView
    TextView tvSubtitle;
    @BindView
    public TextView tvTitle;

    public /* synthetic */ void MediaBrowserCompat$MediaItem() {
    }

    public /* synthetic */ void write(Integer num) {
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        View inflate = layoutInflater.inflate(R.layout.f87872131494014, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        boolean z = true;
        setHasOptionsMenu(true);
        this.tvTitle.setFocusable(true);
        this.tvTitle.setFocusableInTouchMode(true);
        this.tvTitle.requestFocus();
        if (getArguments() != null) {
            this.MediaBrowserCompat$MediaItem = (zzjx.zza.zzb) getArguments().getSerializable("PRODUCT_TYPE_ARG");
            this.RatingCompat = getArguments().getString("LEAD_TYPE");
        }
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        T t = this.presenter;
        zzjx.zza.zzb zzb = this.MediaBrowserCompat$MediaItem;
        String str2 = this.RatingCompat;
        t.f2940x50fd9e4a = zzb;
        t.read = t.MediaSessionCompat$ResultReceiverWrapper.getString("advertisingId", "");
        if (t.RatingCompat == null) {
            z = false;
        }
        if (z) {
            t.RatingCompat.AlertController$RecycleListView();
        }
        setFabCradleRoundedCornerRadius setfabcradleroundedcornerradius = t.MediaBrowserCompat$MediaItem;
        String obj = zzb.toString();
        String str3 = t.read;
        setTimestampMillis settimestampmillis = t.PlaybackStateCompat;
        if (settimestampmillis.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView() != null) {
            str = settimestampmillis.MediaBrowserCompat$ItemReceiver.AppCompatDelegateImpl$ListMenuDecorView().IconCompatParcelizer;
        } else {
            str = null;
        }
        setfabcradleroundedcornerradius.write(obj, str3, str, str2);
        t.MediaBrowserCompat$MediaItem.IconCompatParcelizer(new setDomain.read(t, (byte) 0));
        this.rootView.setOnTouchListener(new ActivityBuilder_BindActivationSuccessfulActivity(this));
        return inflate;
    }

    public void onCreateOptionsMenu(Menu menu, MenuInflater menuInflater) {
        super.onCreateOptionsMenu(menu, menuInflater);
        menuInflater.inflate(R.menu.f93092131558414, menu);
    }

    public boolean onOptionsItemSelected(MenuItem menuItem) {
        if (menuItem.getItemId() != R.id.menu_action_help) {
            return super.onOptionsItemSelected(menuItem);
        }
        T t = this.presenter;
        checkDateTimeFormat checkdatetimeformat = new checkDateTimeFormat(t);
        if (t.RatingCompat != null) {
            checkdatetimeformat.IconCompatParcelizer(t.RatingCompat);
        }
        return true;
    }

    public final void setShortcut() {
        write(R.drawable.ic_overdue, R.string.hml_landing_ribbon_pending_content, R.string.hml_landing_ribbon_pending_action, new ActivityBuilder_BindCalendarDialogActivity(this));
    }

    public final void setContentHeight() {
        write(R.drawable.ic_clear, R.string.hml_landing_ribbon_reject_content, R.string.hml_landing_ribbon_reject_action, new ActivityBuilder_BindCardActivationActivity(this));
    }

    public final void setCheckable() {
        write(R.drawable.ic_paid, R.string.hml_landing_ribbon_approve_content, R.string.hml_landing_ribbon_approve_action, new ActivityBuilder_BindBillPaymentSuccessActivity(this));
    }

    public final void AppCompatViewInflater() {
        write(R.drawable.ic_overdue, R.string.hml_landing_ribbon_accept_content, R.string.hml_landing_ribbon_accept_action, new ActivityBuilder_BindBillPaymentActivity(this));
    }

    public final void MenuItemImpl() {
        write(R.drawable.ic_paid, R.string.hml_landing_ribbon_success_content, R.string.hml_landing_ribbon_success_action, new ActivityBuilder_BindBulkTransferReviewActivity(this));
    }

    public void setGroupDividerEnabled() {
        write(R.drawable.ic_paid, R.string.hml_landing_ribbon_progress_soon_content, R.string.hml_landing_ribbon_progress_action, new ActivityBuilder_BindAddFavoriteTransferActivity(this));
    }

    public final void MenuItemWrapperICS$CollapsibleActionViewWrapper() {
        write(R.drawable.ic_overdue, R.string.hml_landing_ribbon_resubmit_documents_content, R.string.hml_landing_ribbon_resubmit_documents_action, new ActivityBuilder_BindAddAccountConsentActivity(this));
    }

    public final void setItemInvoker() {
        write(R.drawable.ic_overdue, R.string.hml_landing_ribbon_verify_indentity_pending_content, R.string.hml_landing_ribbon_verify_indentity_pending_action, new ActivityBuilder_BindBankingActionActivity(this));
    }

    public final void setPopupCallback() {
        write(R.drawable.ic_overdue, R.string.hml_landing_ribbon_accept_content, R.string.hml_landing_ribbon_accept_action, new ActivityBuilder_BindAmortizationMerchantsActivity(this));
    }

    public final void setIcon() {
        write(R.drawable.ic_overdue, R.string.hml_landing_ribbon_accept_content, R.string.hml_landing_ribbon_accept_action, new ActivityBuilder_BindBulkTransferInputActivity(this));
    }

    public final void setPadding() {
        write(R.drawable.ic_overdue, R.string.hml_landing_ribbon_accept_content, R.string.hml_landing_ribbon_accept_action, new ActivityBuilder_BindBaseActivity(this));
    }

    public final void ExpandedMenuView() {
        write(R.drawable.ic_overdue, R.string.hml_landing_ribbon_accept_content, R.string.hml_landing_ribbon_accept_action, new ActivityBuilder_BindBulkTransferInfoActivity(this));
    }

    public final void setTitle() {
        write(R.drawable.ic_overdue, R.string.hml_landing_ribbon_accept_content, R.string.hml_landing_ribbon_accept_action, new ActivityBuilder_BindCCRBaseActivity(this));
    }

    public final void setForceShowIcon() {
        write(R.drawable.ic_overdue, R.string.hml_landing_ribbon_with_aip_content, R.string.hml_landing_ribbon_with_aip_action, new ActivityBuilder_BasePersonalInfoActivity(this));
    }

    public final void ListMenuItemView() {
        write(R.drawable.ic_paid, R.string.auto_ribbon_offline_desc, R.string.hml_landing_ribbon_progress_action, new ActivityBuilder_BindBulkTransferOtpActivity(this));
    }

    /* access modifiers changed from: protected */
    public final void write(int i, int i2, int i3, View.OnClickListener onClickListener) {
        this.ribbonStatus.setIcon(getResources().getDrawable(i));
        this.ribbonStatus.setContent(getString(i2));
        this.ribbonStatus.setAction(getString(i3));
        this.ribbonStatus.setActionListener(onClickListener);
        this.ribbonStatus.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(writeSessionPartsToSessionFile writesessionpartstosessionfile, zzct.zza zza) {
        this.tvTitle.setText(writesessionpartstosessionfile.MediaDescriptionCompat);
        this.tvSubtitle.setText(writesessionpartstosessionfile.MediaMetadataCompat);
        if (!writesessionpartstosessionfile.write.isEmpty()) {
            Picasso.read().write(writesessionpartstosessionfile.write).read(this.background, (FragmentBuilder_BindEkycFragment) null);
        }
        this.loanAmount.setOnFocusLostListener(new ActivityBuilder_BankingAgentTCActivity(this), false);
        this.loanAmount.setOnClickInputAmountListener(new ActivityBuilder_BindAddNewRecipientActivity(this));
        this.loanAmount.setMaxValue(writesessionpartstosessionfile.read);
        this.loanAmount.setMinValue(writesessionpartstosessionfile.MediaBrowserCompat$MediaItem);
        this.loanAmount.setDelta(writesessionpartstosessionfile.MediaBrowserCompat$SearchResultReceiver);
        this.loanAmount.container.setBackgroundResource(R.color.f71012131100257);
        this.loanAmount.setOnDismissKeyboardListener(new ActivityBuilder_BindAmortizationActivity(this));
        this.loanAmount.setOnKeyboardDoneListener(new ActivityBuilder_BindCalendarLandingActivity(this));
        this.loanAmount.setOnIncrementChangeListener(new CustomDeltaInput$MediaBrowserCompat$CustomActionResultReceiver() {
            public final void MediaSessionCompat$Token() {
                HmlCalculatorFragment.MediaBrowserCompat$ItemReceiver(HmlCalculatorFragment.this);
            }

            /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
            public final void mo13975x50fd9e4a() {
                HmlCalculatorFragment.MediaBrowserCompat$ItemReceiver(HmlCalculatorFragment.this);
            }
        });
        this.schedulePayment.setEnabled(false);
        this.schedulePayment.setInstallment(writesessionpartstosessionfile.MediaBrowserCompat$CustomActionResultReceiver);
        this.schedulePayment.setListener(new CustomSchedulePayment.IconCompatParcelizer() {
            public final void MediaBrowserCompat$ItemReceiver(C5462x904c0edb writesessionpartstosessionfile_mediabrowsercompat_customactionresultreceiver) {
                T t = HmlCalculatorFragment.this.presenter;
                t.write = null;
                t.MediaSessionCompat$QueueItem = writesessionpartstosessionfile_mediabrowsercompat_customactionresultreceiver;
                t.MediaSessionCompat$Token = writesessionpartstosessionfile_mediabrowsercompat_customactionresultreceiver.write;
                t.Keep = writesessionpartstosessionfile_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver;
                t.ParcelableVolumeInfo = 0.0d;
                UTCStringToDate uTCStringToDate = new UTCStringToDate(t);
                if (t.RatingCompat != null) {
                    uTCStringToDate.IconCompatParcelizer(t.RatingCompat);
                }
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                HmlCalculatorFragment.read(HmlCalculatorFragment.this);
            }
        });
        this.schedulePayment.setOnFocusChangeListener(new ActivityBuilder_BindActivateChequeReviewActivity(this));
        if (writesessionpartstosessionfile.IconCompatParcelizer) {
            this.startPayment.setVisibility(8);
        } else {
            this.startPayment.setIconListener(new ActivityBuilder_BindBillPaymentReviewActivity(this));
        }
        MediaBrowserCompat$CustomActionResultReceiver(writesessionpartstosessionfile.RatingCompat);
        if (zza == zzct.zza.BUSINESS_OWNER) {
            this.consumerInfoItem2ImageText.setVisibility(8);
            this.businessOwnerInfoItem2ImageText.setVisibility(0);
            return;
        }
        this.consumerInfoItem2ImageText.setVisibility(0);
        this.businessOwnerInfoItem2ImageText.setVisibility(8);
    }

    private void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsController.ReportUploaderFilesProvider reportUploaderFilesProvider) {
        if (getContext() != null) {
            if (reportUploaderFilesProvider.write && this.schedulePayment.etAmount.write != 0.0d) {
                this.productCataloguePromo.setVisibility(0);
            } else {
                this.productCataloguePromo.setVisibility(8);
            }
            this.productCatalogueValidUntil.setText(reportUploaderFilesProvider.read);
            if (this.interestOptionsContainer.getChildCount() > 0) {
                this.interestOptionsContainer.removeAllViews();
            }
            for (CrashlyticsReport.Builder next : reportUploaderFilesProvider.MediaBrowserCompat$CustomActionResultReceiver) {
                BaseProductCatalogueView<?> IconCompatParcelizer2 = toCollection.IconCompatParcelizer(next.IconCompatParcelizer, getContext());
                IconCompatParcelizer2.setDisplay(next);
                this.interestOptionsContainer.addView(IconCompatParcelizer2);
            }
        }
    }

    public final void read(List<String> list, int i) {
        CustomSpinnerWithTitle customSpinnerWithTitle = this.startPayment;
        customSpinnerWithTitle.setOnCustomSpinnerWithTitleCompletion(new CustomSpinnerWithTitle.IconCompatParcelizer() {
            public final void write() {
            }

            public final void IconCompatParcelizer() {
                T t = HmlCalculatorFragment.this.presenter;
                t.Keep = t.MediaSessionCompat$QueueItem.read.get(HmlCalculatorFragment.this.startPayment.spinner.getSelectedItemPosition());
                getRegionHeight getregionheight = getRegionHeight.read;
                if (t.RatingCompat != null) {
                    getregionheight.IconCompatParcelizer(t.RatingCompat);
                }
                t.write(new setDomain.write());
            }
        });
        customSpinnerWithTitle.setItems(list, false, true);
        customSpinnerWithTitle.spinner.setSelection(i);
    }

    public final void write(String str) {
        this.loanAmount.setErrorMessage(String.format(getString(R.string.hml_landing_minimum_amount_error), new Object[]{str}));
        this.loanAmount.errorMessage.setVisibility(0);
    }

    public final void read(String str) {
        this.loanAmount.setErrorMessage(String.format(getString(R.string.hml_landing_maximum_amount_error), new Object[]{str}));
        this.loanAmount.errorMessage.setVisibility(0);
    }

    public final void IconCompatParcelizer() {
        this.loanAmount.errorMessage.setVisibility(8);
    }

    public final void MediaMetadataCompat(String str) {
        this.schedulePayment.setError(getString(R.string.hml_landing_amount_too_low, str));
        this.schedulePayment.IconCompatParcelizer(true);
    }

    public final void MediaDescriptionCompat(String str) {
        this.schedulePayment.setError(getString(R.string.hml_landing_amount_too_high, str));
        this.schedulePayment.IconCompatParcelizer(true);
    }

    public final void write() {
        this.schedulePayment.IconCompatParcelizer(false);
    }

    public final void ActionMenuItemView() {
        CustomDeltaInputPressed customDeltaInputPressed = this.loanAmount;
        customDeltaInputPressed.IconCompatParcelizer = 0.0d;
        customDeltaInputPressed.inputValue.setText((CharSequence) null);
        AmountEditText amountEditText = customDeltaInputPressed.inputValue;
        amountEditText.setHint(amountEditText.IconCompatParcelizer);
    }

    public final void setChecked() {
        CustomSchedulePayment customSchedulePayment = this.schedulePayment;
        customSchedulePayment.etAmount.setText((CharSequence) null);
        AmountEditText amountEditText = customSchedulePayment.etAmount;
        amountEditText.setHint(amountEditText.IconCompatParcelizer);
        this.schedulePayment.IconCompatParcelizer(false);
        this.schedulePayment.setExtraInfo("");
        this.calculatorResult.setVisibility(8);
    }

    public final void setExpandedFormat() {
        if (this.promotionsContainer.getChildCount() > 0) {
            this.promotionsContainer.removeAllViews();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        this.schedulePayment.setEnabled(z);
        this.paymentDay.setEnabled(z);
        this.startPayment.setEnabled(z);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        this.btnApply.setEnabled(false);
    }

    public final void read() {
        this.btnApply.setEnabled(true);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(int i, int i2, int i3) {
        this.paymentDay.setSelectionIndex(i3);
        this.startPayment.setSelectionIndex(i2);
        this.schedulePayment.spinner.setSelection(i);
    }

    public final void IconCompatParcelizer(List<String> list, int i) {
        CustomSpinnerWithTitle customSpinnerWithTitle = this.paymentDay;
        customSpinnerWithTitle.setOnCustomSpinnerWithTitleCompletion(new CustomSpinnerWithTitle.IconCompatParcelizer() {
            public final void write() {
            }

            public final void IconCompatParcelizer() {
                T t = HmlCalculatorFragment.this.presenter;
                t.MediaSessionCompat$Token = t.MediaSessionCompat$QueueItem.IconCompatParcelizer.get(HmlCalculatorFragment.this.paymentDay.spinner.getSelectedItemPosition());
                if (t.MediaBrowserCompat$SearchResultReceiver) {
                    t.MediaBrowserCompat$SearchResultReceiver = false;
                }
            }
        });
        customSpinnerWithTitle.setItems(list, false, true);
        customSpinnerWithTitle.spinner.setSelection(i);
    }

    public final void IconCompatParcelizer(String str) {
        this.schedulePayment.setExtraInfo(getString(R.string.hml_landing_minimum_repayment, str));
    }

    public final void MediaBrowserCompat$ItemReceiver(recordFatalFirebaseEvent recordfatalfirebaseevent) {
        this.calculatorResult.setText(recordfatalfirebaseevent.MediaBrowserCompat$CustomActionResultReceiver);
        this.calculatorResult.setValue(recordfatalfirebaseevent.write);
        this.calculatorResult.setDescriptionText(recordfatalfirebaseevent.MediaBrowserCompat$ItemReceiver);
        this.calculatorResult.setDescriptionAlignToLeft();
        this.calculatorResult.scheduleFeeText.setVisibility(0);
        this.calculatorResult.setVisibility(0);
        if (!(recordfatalfirebaseevent.read == null || getContext() == null)) {
            if (this.promotionsContainer.getChildCount() > 0) {
                this.promotionsContainer.removeAllViews();
            }
            show show = new show(recordfatalfirebaseevent.read);
            for (CrashlyticsReport.Session display : (CrashlyticsReport.Session[]) new show(show.write, new getNextTransition(show.IconCompatParcelizer, DeepLinkModule_HmlPersonalInformationDeepLinkActivity.MediaBrowserCompat$CustomActionResultReceiver)).MediaBrowserCompat$ItemReceiver((getAllowEnterTransitionOverlap<R[]>) ActivityBuilder_BindBulkTransferSuccessActivity.write)) {
                TierPricingPromotionView tierPricingPromotionView = new TierPricingPromotionView(getContext());
                tierPricingPromotionView.setDisplay(display);
                this.promotionsContainer.addView(tierPricingPromotionView);
            }
        }
        if (recordfatalfirebaseevent.IconCompatParcelizer != null) {
            MediaBrowserCompat$CustomActionResultReceiver(recordfatalfirebaseevent.IconCompatParcelizer);
        }
    }

    public static /* synthetic */ CrashlyticsReport.Session[] IconCompatParcelizer(int i) {
        return new CrashlyticsReport.Session[i];
    }

    @OnClick
    public void onApply() {
        T t = this.presenter;
        createIpImageFromBitmap createipimagefrombitmap = new createIpImageFromBitmap(t);
        if (t.RatingCompat != null) {
            createipimagefrombitmap.IconCompatParcelizer(t.RatingCompat);
        }
        t.write((setDomain.write) new setDomain$MediaBrowserCompat$CustomActionResultReceiver(t, (byte) 0));
    }

    @OnClick
    public void onProductCatalogueClick() {
        if (this.productCatalogueContent.getVisibility() == 8) {
            this.productCatalogueContent.setVisibility(0);
            this.productCatalogueArrow.setImageResource(R.drawable.arrow_up);
            return;
        }
        this.productCatalogueContent.setVisibility(8);
        this.productCatalogueArrow.setImageResource(R.drawable.arrow_down);
    }

    public final void MediaBrowserCompat$ItemReceiver(Double d) {
        ZSYR2K[] zsyr2kArr = {new ZSYR2K("user_type", "etb"), new ZSYR2K("product_application_amount", this.loanAmount.inputValue.getText().toString()), new ZSYR2K("monthly_repay_amount", d.toString()), new ZSYR2K("monthly_billing_date", this.paymentDay.MediaBrowserCompat$ItemReceiver())};
        if (getActivity() != null) {
            ((BaseActivity) getActivity()).scbAnalytics.write("p10x1_landing", zsyr2kArr);
        }
    }

    @OnClick
    public void onProductDetails() {
        T t = this.presenter;
        copyImageToExternalStorage copyimagetoexternalstorage = copyImageToExternalStorage.MediaBrowserCompat$ItemReceiver;
        if (t.RatingCompat != null) {
            copyimagetoexternalstorage.IconCompatParcelizer(t.RatingCompat);
        }
    }

    public final void read(zzct.zza zza) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (zza == zzct.zza.BUSINESS_OWNER) {
            arrayList.add(new getCreateReportSpiCall(getString(R.string.hml_business_owner_summary_simulator_about_title), getString(R.string.hml_business_owner_summary_simulator_about_steps)));
            str = getString(R.string.hml_business_owner_summary_simulator_about);
        } else {
            str = getString(R.string.hml_summary_simulator_about);
            arrayList.add(new getCreateReportSpiCall(getString(R.string.hml_summary_simulator_about_title), getString(R.string.hml_summary_simulator_about_steps)));
        }
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = HmlSimulatorAboutActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), str, arrayList);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaSessionCompat$Token() {
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = HmlConsentActivity.MediaBrowserCompat$CustomActionResultReceiver(requireContext(), zzfe.zza.NCB_CONSENT);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                MediaBrowserCompat$CustomActionResultReceiver2 = setTapText.write(activity, MediaBrowserCompat$CustomActionResultReceiver2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(MediaBrowserCompat$CustomActionResultReceiver2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(MediaBrowserCompat$CustomActionResultReceiver2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        this.calculatorResult.setVisibility(8);
    }

    public void onDestroyView() {
        this.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacks(this.IconCompatParcelizer);
        this.presenter.onDestroy();
        super.onDestroyView();
    }

    static /* synthetic */ void MediaBrowserCompat$ItemReceiver(HmlCalculatorFragment hmlCalculatorFragment) {
        hmlCalculatorFragment.MediaBrowserCompat$CustomActionResultReceiver.removeCallbacks(hmlCalculatorFragment.IconCompatParcelizer);
        hmlCalculatorFragment.MediaBrowserCompat$CustomActionResultReceiver.postDelayed(hmlCalculatorFragment.IconCompatParcelizer, 2000);
    }

    static /* synthetic */ void read(HmlCalculatorFragment hmlCalculatorFragment) {
        hmlCalculatorFragment.tvTitle.setFocusable(true);
        hmlCalculatorFragment.tvTitle.setFocusableInTouchMode(true);
        hmlCalculatorFragment.tvTitle.requestFocus();
    }

    public static /* synthetic */ void MediaBrowserCompat$CustomActionResultReceiver(HmlCalculatorFragment hmlCalculatorFragment) {
        hmlCalculatorFragment.tvTitle.setFocusable(true);
        hmlCalculatorFragment.tvTitle.setFocusableInTouchMode(true);
        hmlCalculatorFragment.tvTitle.requestFocus();
    }
}
