package com.scb.phone.view.fragment.cardmanagement.deejungtransfer;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.FragmentActivity;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.OnFocusChange;
import com.scb.phone.R;
import com.scb.phone.view.activity.cardmanagement.AmortizationActivity;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTransferInstallmentsReviewActivity;
import com.scb.phone.view.activity.cardmanagement.deejungtransfer.DeejungTransferMinFullReviewActivity;
import com.scb.phone.view.custom.common.CustomDialog;
import com.scb.phone.view.fragment.BaseFragment;
import com.scb.phone.view.fragment.cardmanagement.DeejungPlanErrorFragment;
import com.scb.phone.view.fragment.cardmanagement.DeejungPlansFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.text.NumberFormat;
import java.util.List;
import java.util.Locale;
import p040o.AnalyticsConnectorImpl;
import p040o.C10827Iterators;
import p040o.ConcurrentHashMultiset;
import p040o.FirebaseAnalytics;
import p040o.FirebaseVisionCloudImageLabelerOptions;
import p040o.FirebaseVisionFaceDetector;
import p040o.FirebaseVisionImageLabel;
import p040o.FirebaseVisionOnDeviceImageLabelerOptions;
import p040o.FirebaseVisionTextRecognizer;
import p040o.GlobalLibraryVersionRegistrar;
import p040o.HmlPinActivity;
import p040o.Iterators$14$MediaBrowserCompat$ItemReceiver;
import p040o.KotlinDetector;
import p040o.KotlinDetector$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.LibraryVersionComponent;
import p040o.MyECouponActivity_ViewBinding;
import p040o.RecognizedLanguage;
import p040o.RewardRedemptionService;
import p040o.access$2200;
import p040o.chain;
import p040o.confirmRedemption;
import p040o.constrainedListIterator;
import p040o.constrainedMultiset;
import p040o.deactivateECoupon;
import p040o.ensureReceiverRegistered;
import p040o.getAddress5;
import p040o.getAddress6;
import p040o.getContourMode;
import p040o.getEntityId;
import p040o.getICheckDeserializerRtti;
import p040o.getLandmark;
import p040o.getLibraryName;
import p040o.getOutputStream;
import p040o.getTextBlocks;
import p040o.incomingSummary;
import p040o.isTrackingEnabled;
import p040o.normalize;
import p040o.onGetStartedClick;
import p040o.registerAnalyticsConnectorListener;
import p040o.reviewRequester;
import p040o.setClassificationMode;
import p040o.setLastBaselineToBottomHeight;
import p040o.setPerformanceMode;
import p040o.setTapText;
import p040o.setTitleMarginStart;
import p040o.zzfy;

public class DeejungTransferLandingBottomFragment extends BaseFragment implements getAddress5 {
    private TextWatcher AlertController$RecycleListView = new TextWatcher() {
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public final void afterTextChanged(Editable editable) {
            DeejungTransferLandingBottomFragment.this.transferAmountView.removeTextChangedListener(this);
            String unused = DeejungTransferLandingBottomFragment.this.MediaBrowserCompat$MediaItem = editable.toString().trim();
            String MediaBrowserCompat$CustomActionResultReceiver = DeejungTransferLandingBottomFragment.this.MediaBrowserCompat$MediaItem;
            boolean z = false;
            if (MediaBrowserCompat$CustomActionResultReceiver == null || MediaBrowserCompat$CustomActionResultReceiver.length() == 0) {
                DeejungTransferLandingBottomFragment deejungTransferLandingBottomFragment = DeejungTransferLandingBottomFragment.this;
                deejungTransferLandingBottomFragment.transferAmountError.setVisibility(8);
                deejungTransferLandingBottomFragment.divider.setBackgroundColor(deejungTransferLandingBottomFragment.RatingCompat);
            } else {
                long parseLong = Long.parseLong(DeejungTransferLandingBottomFragment.this.MediaBrowserCompat$MediaItem.replace(",", ""));
                DeejungTransferLandingBottomFragment.this.transferAmountView.setText(NumberFormat.getInstance(Locale.getDefault()).format(parseLong));
                DeejungTransferLandingBottomFragment.this.transferAmountView.setSelection(DeejungTransferLandingBottomFragment.this.transferAmountView.getText().length());
                KotlinDetector kotlinDetector = DeejungTransferLandingBottomFragment.this.presenter;
                double d = DeejungTransferLandingBottomFragment.this.MediaMetadataCompat.MediaBrowserCompat$MediaItem;
                double d2 = DeejungTransferLandingBottomFragment.this.MediaMetadataCompat.MediaBrowserCompat$ItemReceiver;
                long j = (long) d;
                RecognizedLanguage recognizedLanguage = RecognizedLanguage.MediaBrowserCompat$CustomActionResultReceiver;
                if (kotlinDetector.RatingCompat != null) {
                    recognizedLanguage.IconCompatParcelizer(kotlinDetector.RatingCompat);
                }
                FirebaseVisionTextRecognizer firebaseVisionTextRecognizer = FirebaseVisionTextRecognizer.write;
                if (kotlinDetector.RatingCompat != null) {
                    firebaseVisionTextRecognizer.IconCompatParcelizer(kotlinDetector.RatingCompat);
                }
                kotlinDetector.MediaBrowserCompat$SearchResultReceiver = "";
                kotlinDetector.MediaDescriptionCompat = "";
                if (((double) parseLong) > d2) {
                    FirebaseVisionOnDeviceImageLabelerOptions firebaseVisionOnDeviceImageLabelerOptions = FirebaseVisionOnDeviceImageLabelerOptions.MediaBrowserCompat$CustomActionResultReceiver;
                    if (kotlinDetector.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        firebaseVisionOnDeviceImageLabelerOptions.IconCompatParcelizer(kotlinDetector.RatingCompat);
                    }
                } else if (KotlinDetector.read(j, parseLong)) {
                    setClassificationMode setclassificationmode = setClassificationMode.IconCompatParcelizer;
                    if (kotlinDetector.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        setclassificationmode.IconCompatParcelizer(kotlinDetector.RatingCompat);
                    }
                } else {
                    FirebaseVisionImageLabel firebaseVisionImageLabel = FirebaseVisionImageLabel.MediaBrowserCompat$CustomActionResultReceiver;
                    if (kotlinDetector.RatingCompat != null) {
                        z = true;
                    }
                    if (z) {
                        firebaseVisionImageLabel.IconCompatParcelizer(kotlinDetector.RatingCompat);
                    }
                }
            }
            DeejungTransferLandingBottomFragment.this.transferAmountView.addTextChangedListener(this);
        }
    };
    public chain IconCompatParcelizer;
    public getAddress6 MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$MediaItem = "";
    private Context MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private TextView.OnEditorActionListener f3077x50fd9e4a = new TextView.OnEditorActionListener() {
        public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
            if (i != 6) {
                return false;
            }
            DeejungTransferLandingBottomFragment.this.PlaybackStateCompat$CustomAction();
            DeejungTransferLandingBottomFragment.this.transferAmountView.setFocusable(false);
            DeejungTransferLandingBottomFragment.this.transferAmountView.setFocusableInTouchMode(true);
            return true;
        }
    };
    public normalize MediaDescriptionCompat;
    /* access modifiers changed from: private */
    public FirebaseAnalytics MediaMetadataCompat;
    private zzfy.zza MediaSessionCompat$QueueItem;
    /* access modifiers changed from: private */
    public String MediaSessionCompat$ResultReceiverWrapper;
    private int MediaSessionCompat$Token;
    private int ParcelableVolumeInfo;
    int RatingCompat;
    @BindView
    View divider;
    @BindView
    ImageView installmentIconImage;
    @BindView
    TextView installmentPlanLabel;
    @BindView
    CardView installmentsPlansLayout;
    @BindView
    public ViewGroup layoutReviewButtonMinMax;
    @BindView
    ImageView minMaxIconImage;
    @BindView
    CardView minMaxLayout;
    @BindView
    TextView minMaxPlanLabel;
    @BindView
    FrameLayout planFragmentContainer;
    @BindView
    public View plansLoaderView;
    @HmlPinActivity
    public KotlinDetector presenter;
    @BindView
    TextView remainingLimitLabel;
    @BindView
    public TextView selectPaymentLabel;
    @BindView
    TextView transferAmountError;
    @BindView
    EditText transferAmountView;
    @BindView
    TextView txvGeneralTerms;

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        String str;
        boolean z = false;
        View inflate = layoutInflater.inflate(R.layout.f86602131493887, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaMetadataCompat = (FirebaseAnalytics) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungLandingActivity.KEY_DEEJUNG_TRANSFER_LANDING_DISPLAY_MODEL");
        this.IconCompatParcelizer = (chain) getActivity().getIntent().getParcelableExtra("com.scb.phone.view.activity.card_management.DeejungLandingActivity.KEY_CREDIT_CARD_DISPLAY");
        this.MediaSessionCompat$Token = setLastBaselineToBottomHeight.read(getActivity(), R.color.f67152131099871);
        this.RatingCompat = setLastBaselineToBottomHeight.read(getActivity(), R.color.f67472131099903);
        this.ParcelableVolumeInfo = setLastBaselineToBottomHeight.read(getActivity(), R.color.f66462131099802);
        KotlinDetector kotlinDetector = this.presenter;
        FirebaseAnalytics firebaseAnalytics = this.MediaMetadataCompat;
        chain chain = this.IconCompatParcelizer;
        kotlinDetector.write = firebaseAnalytics;
        kotlinDetector.IconCompatParcelizer = chain;
        double doubleValue = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(chain.MediaBrowserCompat$CustomActionResultReceiver).doubleValue();
        double d = firebaseAnalytics.MediaBrowserCompat$MediaItem;
        double d2 = firebaseAnalytics.MediaBrowserCompat$ItemReceiver;
        if (d != d2) {
            StringBuilder sb = new StringBuilder();
            sb.append(NumberFormat.getInstance(Locale.getDefault()).format(d));
            sb.append(" - ");
            sb.append(NumberFormat.getInstance(Locale.getDefault()).format(d2));
            str = sb.toString();
        } else {
            str = NumberFormat.getInstance(Locale.getDefault()).format(d);
        }
        FirebaseVisionCloudImageLabelerOptions firebaseVisionCloudImageLabelerOptions = new FirebaseVisionCloudImageLabelerOptions(str, d, d2, doubleValue);
        if (kotlinDetector.RatingCompat != null) {
            z = true;
        }
        if (z) {
            firebaseVisionCloudImageLabelerOptions.IconCompatParcelizer(kotlinDetector.RatingCompat);
        }
        this.transferAmountView.setOnEditorActionListener(this.f3077x50fd9e4a);
        this.transferAmountView.addTextChangedListener(this.AlertController$RecycleListView);
        this.transferAmountView.setOnFocusChangeListener(new View.OnFocusChangeListener() {
            public final void onFocusChange(View view, boolean z) {
                if (z) {
                    if (TextUtils.isEmpty(DeejungTransferLandingBottomFragment.this.MediaSessionCompat$ResultReceiverWrapper) || DeejungTransferLandingBottomFragment.this.transferAmountView.getHint().equals(DeejungTransferLandingBottomFragment.this.MediaSessionCompat$ResultReceiverWrapper)) {
                        DeejungTransferLandingBottomFragment.this.transferAmountView.setHint("");
                    }
                } else if (TextUtils.isEmpty(DeejungTransferLandingBottomFragment.this.transferAmountView.getText())) {
                    DeejungTransferLandingBottomFragment.this.transferAmountView.setHint(DeejungTransferLandingBottomFragment.this.MediaSessionCompat$ResultReceiverWrapper);
                }
            }
        });
        return inflate;
    }

    public void onAttach(Context context) {
        this.MediaBrowserCompat$SearchResultReceiver = context;
        super.onAttach(context);
        if (context instanceof getAddress6) {
            this.MediaBrowserCompat$CustomActionResultReceiver = (getAddress6) context;
        }
    }

    public final void IconCompatParcelizer(double d) {
        this.remainingLimitLabel.setText(getActivity().getResources().getString(R.string.remaining_limit_label, new Object[]{getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(d)}));
        MediaBrowserCompat$ItemReceiver();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(ensureReceiverRegistered ensurereceiverregistered, normalize normalize) {
        getAddress6 getaddress6;
        Context context = this.MediaBrowserCompat$SearchResultReceiver;
        if (context != null && (getaddress6 = this.MediaBrowserCompat$CustomActionResultReceiver) != null) {
            AmortizationActivity.write(context, ensurereceiverregistered, normalize, getaddress6.MediaBrowserCompat$ItemReceiver(), this.IconCompatParcelizer);
        }
    }

    public final void ActionMenuItemView() {
        this.transferAmountError.setVisibility(0);
        this.transferAmountError.setText(getActivity().getResources().getString(R.string.minimum_transfer_limit_error, new Object[]{getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(this.MediaMetadataCompat.MediaBrowserCompat$MediaItem)}));
        this.divider.setBackgroundColor(this.MediaSessionCompat$Token);
    }

    public final void AppCompatViewInflater() {
        this.transferAmountError.setVisibility(0);
        this.transferAmountError.setText(R.string.maximum_transfer_limit_error);
        this.divider.setBackgroundColor(this.MediaSessionCompat$Token);
    }

    public final void MediaSessionCompat$QueueItem() {
        this.transferAmountError.setVisibility(8);
        this.divider.setBackgroundColor(this.RatingCompat);
    }

    public final void MediaBrowserCompat$ItemReceiver() {
        if (getActivity() != null) {
            int read = setLastBaselineToBottomHeight.read(getActivity(), R.color.f66112131099766);
            this.minMaxLayout.setEnabled(false);
            this.installmentsPlansLayout.setEnabled(false);
            this.installmentPlanLabel.setTextColor(read);
            this.minMaxPlanLabel.setTextColor(read);
            this.installmentIconImage.setAlpha(0.4f);
            this.minMaxIconImage.setAlpha(0.4f);
            setItemInvoker();
            setPadding();
            this.txvGeneralTerms.setVisibility(8);
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        if (getActivity() != null) {
            int read = setLastBaselineToBottomHeight.read(getActivity(), R.color.f65972131099752);
            this.minMaxLayout.setEnabled(true);
            this.installmentsPlansLayout.setEnabled(true);
            this.installmentPlanLabel.setTextColor(read);
            this.minMaxPlanLabel.setTextColor(read);
            this.installmentIconImage.setAlpha(1.0f);
            this.minMaxIconImage.setAlpha(1.0f);
        }
    }

    public final void setContentView() {
        this.transferAmountView.clearFocus();
        this.installmentsPlansLayout.setBackground(this.MediaBrowserCompat$SearchResultReceiver.getResources().getDrawable(R.drawable.shape_purple_border_rounded_rectangle));
    }

    public final void write(String str, String str2, String str3, String str4, String str5) {
        this.txvGeneralTerms.setVisibility(0);
        this.txvGeneralTerms.setText(getActivity().getResources().getString(R.string.installment_plans_general_terms_for_credit_card, new Object[]{str, str2, str3, str4, str5}));
    }

    public final void write(String str) {
        this.txvGeneralTerms.setVisibility(0);
        this.txvGeneralTerms.setText(getActivity().getResources().getString(R.string.installment_plans_general_terms_for_speedy_cash, new Object[]{str}));
    }

    public final void setPadding() {
        if (getActivity() != null) {
            this.installmentsPlansLayout.setBackgroundColor(setLastBaselineToBottomHeight.read(getActivity(), R.color.f71012131100257));
            this.txvGeneralTerms.setVisibility(8);
        }
    }

    public final void setItemInvoker() {
        if (getActivity() != null) {
            this.minMaxLayout.setBackgroundColor(setLastBaselineToBottomHeight.read(getActivity(), R.color.f71012131100257));
            this.txvGeneralTerms.setVisibility(8);
            this.layoutReviewButtonMinMax.setVisibility(8);
        }
    }

    public final void AppCompatDelegateImpl$ListMenuDecorView() {
        this.transferAmountView.clearFocus();
        this.minMaxLayout.setBackground(this.MediaBrowserCompat$SearchResultReceiver.getResources().getDrawable(R.drawable.shape_purple_border_rounded_rectangle));
    }

    public final void setCheckable() {
        this.txvGeneralTerms.setVisibility(0);
        this.txvGeneralTerms.setText(getActivity().getResources().getString(R.string.min_max_general_terms, new Object[]{this.MediaMetadataCompat.RatingCompat, this.MediaMetadataCompat.MediaDescriptionCompat}));
    }

    public final void setChecked() {
        if (getActivity() != null) {
            ScrollView scrollView = (ScrollView) getActivity().findViewById(R.id.root_scroll_view);
            this.layoutReviewButtonMinMax.setVisibility(0);
            if (scrollView != null) {
                scrollView.post(new RewardRedemptionService(this, scrollView));
            }
        }
    }

    /* access modifiers changed from: protected */
    @OnFocusChange
    public void onTransferAmountFocusChange() {
        if (this.transferAmountView.hasFocus()) {
            if (setPopupCallback()) {
                this.divider.setBackgroundColor(this.RatingCompat);
            }
        } else if (setPopupCallback()) {
            this.divider.setBackgroundColor(this.ParcelableVolumeInfo);
        } else {
            this.divider.setBackgroundColor(this.MediaSessionCompat$Token);
            MediaBrowserCompat$ItemReceiver();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean setPopupCallback() {
        /*
            r9 = this;
            java.lang.String r0 = r9.MediaBrowserCompat$MediaItem
            boolean r0 = r0.isEmpty()
            r1 = 0
            r2 = 1
            if (r0 != 0) goto L_0x0037
            java.lang.String r0 = r9.MediaBrowserCompat$MediaItem
            o.FirebaseAnalytics r3 = r9.MediaMetadataCompat
            double r3 = r3.MediaBrowserCompat$MediaItem
            o.FirebaseAnalytics r5 = r9.MediaMetadataCompat
            double r5 = r5.MediaBrowserCompat$ItemReceiver
            long r3 = (long) r3
            long r5 = (long) r5
            java.lang.String r7 = ","
            java.lang.String r8 = ""
            java.lang.String r0 = r0.replace(r7, r8)
            long r7 = java.lang.Long.parseLong(r0)
            boolean r0 = p040o.KotlinDetector.read((long) r3, (long) r7)
            if (r0 != 0) goto L_0x0033
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x002e
            r0 = r2
            goto L_0x002f
        L_0x002e:
            r0 = r1
        L_0x002f:
            if (r0 != 0) goto L_0x0033
            r0 = r2
            goto L_0x0034
        L_0x0033:
            r0 = r1
        L_0x0034:
            if (r0 != 0) goto L_0x0037
            goto L_0x0038
        L_0x0037:
            r1 = r2
        L_0x0038:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.cardmanagement.deejungtransfer.DeejungTransferLandingBottomFragment.setPopupCallback():boolean");
    }

    @OnClick
    public void handleClickOfInstallmentPlans() {
        KotlinDetector kotlinDetector = this.presenter;
        String str = this.IconCompatParcelizer.MediaDescriptionCompat;
        String str2 = this.MediaBrowserCompat$MediaItem;
        if (!kotlinDetector.MediaMetadataCompat) {
            getEntityId getentityid = new getEntityId(kotlinDetector);
            boolean z = true;
            if (kotlinDetector.RatingCompat != null) {
                getentityid.IconCompatParcelizer(kotlinDetector.RatingCompat);
            }
            if (kotlinDetector.MediaBrowserCompat$SearchResultReceiver.equalsIgnoreCase(str2)) {
                getLandmark getlandmark = getLandmark.MediaBrowserCompat$ItemReceiver;
                if (kotlinDetector.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getlandmark.IconCompatParcelizer(kotlinDetector.RatingCompat);
                    return;
                }
                return;
            }
            kotlinDetector.MediaBrowserCompat$SearchResultReceiver = str2;
            kotlinDetector.MediaMetadataCompat = true;
            isTrackingEnabled istrackingenabled = isTrackingEnabled.IconCompatParcelizer;
            if (kotlinDetector.RatingCompat == null) {
                z = false;
            }
            if (z) {
                istrackingenabled.IconCompatParcelizer(kotlinDetector.RatingCompat);
            }
            kotlinDetector.read.MediaBrowserCompat$CustomActionResultReceiver(new constrainedListIterator(Double.valueOf(Double.parseDouble(str2.replace(",", ""))), constrainedMultiset.DEEJUNG_NEWTENOR, str));
            kotlinDetector.read.IconCompatParcelizer(new KotlinDetector.write(kotlinDetector, (byte) 0));
        }
    }

    @OnClick
    public void handleClickOfMinMaxPlans() {
        KotlinDetector kotlinDetector = this.presenter;
        String str = this.IconCompatParcelizer.MediaDescriptionCompat;
        String str2 = this.MediaBrowserCompat$MediaItem;
        if (!kotlinDetector.MediaMetadataCompat) {
            FirebaseVisionFaceDetector firebaseVisionFaceDetector = FirebaseVisionFaceDetector.IconCompatParcelizer;
            boolean z = true;
            if (kotlinDetector.RatingCompat != null) {
                firebaseVisionFaceDetector.IconCompatParcelizer(kotlinDetector.RatingCompat);
            }
            if (!kotlinDetector.MediaDescriptionCompat.equalsIgnoreCase(str2)) {
                kotlinDetector.MediaDescriptionCompat = str2;
                kotlinDetector.MediaMetadataCompat = true;
                getContourMode getcontourmode = getContourMode.MediaBrowserCompat$ItemReceiver;
                if (kotlinDetector.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    getcontourmode.IconCompatParcelizer(kotlinDetector.RatingCompat);
                }
                kotlinDetector.read.IconCompatParcelizer(new constrainedListIterator(Double.valueOf(Double.parseDouble(str2.replace(",", ""))), constrainedMultiset.MIN_OR_FULL_NEWTENOR, str));
                kotlinDetector.read.IconCompatParcelizer(new KotlinDetector$MediaBrowserCompat$CustomActionResultReceiver(kotlinDetector, (byte) 0));
                return;
            }
            getLibraryName getlibraryname = getLibraryName.write;
            if (kotlinDetector.RatingCompat != null) {
                getlibraryname.IconCompatParcelizer(kotlinDetector.RatingCompat);
            }
            GlobalLibraryVersionRegistrar globalLibraryVersionRegistrar = GlobalLibraryVersionRegistrar.MediaBrowserCompat$CustomActionResultReceiver;
            if (kotlinDetector.RatingCompat == null) {
                z = false;
            }
            if (z) {
                globalLibraryVersionRegistrar.IconCompatParcelizer(kotlinDetector.RatingCompat);
            }
        }
    }

    @OnClick
    public void handleReviewButtonForMinMaxFlow() {
        this.presenter.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$MediaItem, MediaBrowserCompat$SearchResultReceiver(), this.IconCompatParcelizer.MediaDescriptionCompat, false);
    }

    public final void setExpandedFormat() {
        if (getActivity() != null) {
            ScrollView scrollView = (ScrollView) getActivity().findViewById(R.id.root_scroll_view);
            this.plansLoaderView.setVisibility(0);
            if (scrollView != null) {
                scrollView.post(new incomingSummary(this, scrollView));
            }
        }
    }

    public final void MediaSessionCompat$Token() {
        this.plansLoaderView.setVisibility(8);
    }

    public final void read() {
        this.transferAmountView.setEnabled(false);
    }

    public final void IconCompatParcelizer() {
        this.transferAmountView.setEnabled(true);
    }

    public final void setShortcut() {
        if (getActivity() != null) {
            setTitleMarginStart supportFragmentManager = getActivity().getSupportFragmentManager();
            DeejungPlansFragment deejungPlansFragment = (DeejungPlansFragment) supportFragmentManager.findFragmentByTag("DeejungPlansFragment");
            if (deejungPlansFragment != null && deejungPlansFragment.isHidden()) {
                p040o.CardView read = getActivity().getSupportFragmentManager().read();
                read.IconCompatParcelizer(deejungPlansFragment);
                read.write();
                supportFragmentManager.IconCompatParcelizer();
                IconCompatParcelizer((Activity) getActivity());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = getActivity().getSupportFragmentManager();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaSessionCompat$ResultReceiverWrapper() {
        /*
            r3 = this;
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.fragment.app.FragmentActivity r0 = r3.getActivity()
            o.setTitleMarginStart r0 = r0.getSupportFragmentManager()
            java.lang.String r1 = "DeejungPlansFragment"
            androidx.fragment.app.Fragment r1 = r0.findFragmentByTag(r1)
            if (r1 == 0) goto L_0x0027
            boolean r2 = r1.isVisible()
            if (r2 == 0) goto L_0x0027
            o.CardView r0 = r0.read()
            r0.MediaBrowserCompat$ItemReceiver(r1)
            r0.write()
        L_0x0027:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.cardmanagement.deejungtransfer.DeejungTransferLandingBottomFragment.MediaSessionCompat$ResultReceiverWrapper():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = getActivity().getSupportFragmentManager();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AppCompatDialogFragment() {
        /*
            r2 = this;
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            o.setTitleMarginStart r0 = r0.getSupportFragmentManager()
            java.lang.String r1 = "DeejungPlansFragment"
            androidx.fragment.app.Fragment r1 = r0.findFragmentByTag(r1)
            if (r1 == 0) goto L_0x0021
            o.CardView r0 = r0.read()
            r0.write(r1)
            r0.write()
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.cardmanagement.deejungtransfer.DeejungTransferLandingBottomFragment.AppCompatDialogFragment():void");
    }

    public final void read(List<normalize> list) {
        if (getActivity() != null) {
            setTitleMarginStart supportFragmentManager = getActivity().getSupportFragmentManager();
            if (((DeejungPlansFragment) supportFragmentManager.findFragmentByTag("DeejungPlansFragment")) == null) {
                p040o.CardView read = supportFragmentManager.read();
                DeejungPlansFragment MediaBrowserCompat$CustomActionResultReceiver2 = DeejungPlansFragment.MediaBrowserCompat$CustomActionResultReceiver(list);
                MediaBrowserCompat$CustomActionResultReceiver2.MediaBrowserCompat$CustomActionResultReceiver = this;
                read.write(R.id.plans_fragment_container, MediaBrowserCompat$CustomActionResultReceiver2, "DeejungPlansFragment");
                read.write();
                supportFragmentManager.IconCompatParcelizer();
                IconCompatParcelizer((Activity) getActivity());
            }
        }
    }

    private void IconCompatParcelizer(Activity activity) {
        ScrollView scrollView = (ScrollView) activity.findViewById(R.id.root_scroll_view);
        ViewGroup viewGroup = (ViewGroup) activity.findViewById(R.id.deejung_landing_parent_layout);
        if (scrollView != null && viewGroup != null) {
            scrollView.post(new deactivateECoupon(this, viewGroup, scrollView));
        }
    }

    public final chain RatingCompat() {
        return this.IconCompatParcelizer;
    }

    public final normalize MediaBrowserCompat$MediaItem() {
        return this.MediaDescriptionCompat;
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final String mo36268x50fd9e4a() {
        return this.MediaBrowserCompat$MediaItem;
    }

    public final void read(registerAnalyticsConnectorListener registeranalyticsconnectorlistener) {
        Intent IconCompatParcelizer2 = DeejungTransferInstallmentsReviewActivity.IconCompatParcelizer(getContext(), registeranalyticsconnectorlistener);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                IconCompatParcelizer2 = setTapText.write(activity, IconCompatParcelizer2).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(IconCompatParcelizer2.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(IconCompatParcelizer2);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void read(normalize normalize) {
        this.MediaDescriptionCompat = normalize;
        this.presenter.IconCompatParcelizer(normalize, this.MediaBrowserCompat$MediaItem, MediaBrowserCompat$SearchResultReceiver(), this.IconCompatParcelizer.MediaDescriptionCompat, false);
    }

    public final void IconCompatParcelizer(normalize normalize) {
        normalize normalize2 = normalize;
        this.MediaDescriptionCompat = normalize2;
        KotlinDetector kotlinDetector = this.presenter;
        String str = this.MediaBrowserCompat$MediaItem;
        String MediaBrowserCompat$SearchResultReceiver2 = MediaBrowserCompat$SearchResultReceiver();
        String str2 = this.IconCompatParcelizer.MediaDescriptionCompat;
        String str3 = this.IconCompatParcelizer.AppCompatViewInflater;
        String str4 = this.IconCompatParcelizer.MediaSessionCompat$Token;
        String str5 = this.MediaDescriptionCompat.MediaMetadataCompat;
        if (str != null && !str.isEmpty()) {
            str = getICheckDeserializerRtti.IconCompatParcelizer(getICheckDeserializerRtti.ParcelableVolumeInfo(str));
        }
        String replace = str.replace(",", "");
        LibraryVersionComponent libraryVersionComponent = LibraryVersionComponent.read;
        if (kotlinDetector.RatingCompat != null) {
            libraryVersionComponent.IconCompatParcelizer(kotlinDetector.RatingCompat);
        }
        ConcurrentHashMultiset concurrentHashMultiset = new ConcurrentHashMultiset(str5, replace, normalize2.MediaSessionCompat$ResultReceiverWrapper, normalize2.setContentView, str2);
        C10827Iterators.C353914 r3 = kotlinDetector.MediaBrowserCompat$ItemReceiver;
        getTextBlocks gettextblocks = new getTextBlocks(kotlinDetector, normalize2);
        setPerformanceMode setperformancemode = new setPerformanceMode(kotlinDetector);
        onGetStartedClick.write((Object) replace, "transferAmount");
        onGetStartedClick.write((Object) MediaBrowserCompat$SearchResultReceiver2, "toAccountNumber");
        onGetStartedClick.write((Object) concurrentHashMultiset, "request");
        onGetStartedClick.write((Object) gettextblocks, "onSuccess");
        onGetStartedClick.write((Object) setperformancemode, "onError");
        r3.write.read(gettextblocks, setperformancemode, new getOutputStream.read(concurrentHashMultiset), new Iterators$14$MediaBrowserCompat$ItemReceiver(r3, concurrentHashMultiset, str3, str4, replace, MediaBrowserCompat$SearchResultReceiver2, false), r3.MediaBrowserCompat$ItemReceiver);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AnalyticsConnectorImpl analyticsConnectorImpl) {
        Intent MediaBrowserCompat$CustomActionResultReceiver2 = DeejungTransferMinFullReviewActivity.MediaBrowserCompat$CustomActionResultReceiver(getContext(), analyticsConnectorImpl);
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

    public final void read(zzfy.zza zza) {
        this.MediaSessionCompat$QueueItem = zza;
    }

    public final zzfy.zza MediaMetadataCompat() {
        return this.MediaSessionCompat$QueueItem;
    }

    public final void MediaBrowserCompat$ItemReceiver(access$2200 access_2200, constrainedMultiset constrainedmultiset) {
        CustomDialog MediaBrowserCompat$ItemReceiver = CustomDialog.IconCompatParcelizer(getContext()).IconCompatParcelizer(access_2200.MediaBrowserCompat$ItemReceiver).MediaBrowserCompat$ItemReceiver(access_2200.IconCompatParcelizer);
        CustomDialog IconCompatParcelizer2 = MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(MediaBrowserCompat$ItemReceiver.read.getString(R.string.proceed), new confirmRedemption(this, constrainedmultiset));
        IconCompatParcelizer2.MediaBrowserCompat$ItemReceiver(IconCompatParcelizer2.read.getString(R.string.cancel), reviewRequester.read).show();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        r0 = getActivity().getSupportFragmentManager();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AppCompatActivity() {
        /*
            r2 = this;
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            androidx.fragment.app.FragmentActivity r0 = r2.getActivity()
            o.setTitleMarginStart r0 = r0.getSupportFragmentManager()
            java.lang.String r1 = "DeejungPlanErrorFragment"
            androidx.fragment.app.Fragment r1 = r0.findFragmentByTag(r1)
            if (r1 == 0) goto L_0x0021
            o.CardView r0 = r0.read()
            r0.write(r1)
            r0.write()
        L_0x0021:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.cardmanagement.deejungtransfer.DeejungTransferLandingBottomFragment.AppCompatActivity():void");
    }

    public final void MediaBrowserCompat$ItemReceiver(access$2200 access_2200) {
        if (getActivity() != null && ((DeejungPlanErrorFragment) getActivity().getSupportFragmentManager().findFragmentByTag("DeejungPlanErrorFragment")) == null) {
            p040o.CardView read = getActivity().getSupportFragmentManager().read();
            read.write(R.id.plans_fragment_container, DeejungPlanErrorFragment.write(access_2200.MediaBrowserCompat$ItemReceiver, access_2200.IconCompatParcelizer), "DeejungPlanErrorFragment");
            read.write();
        }
    }

    public final void read(String str) {
        this.MediaSessionCompat$ResultReceiverWrapper = str;
        this.transferAmountView.setHint(str);
    }

    public final String write() {
        getAddress6 getaddress6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if ((getaddress6 == null || getaddress6.MediaBrowserCompat$ItemReceiver() == null) ? false : true) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver().ParcelableVolumeInfo;
        }
        return null;
    }

    public final String MediaBrowserCompat$SearchResultReceiver() {
        getAddress6 getaddress6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if ((getaddress6 == null || getaddress6.MediaBrowserCompat$ItemReceiver() == null) ? false : true) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver().MediaSessionCompat$Token;
        }
        return null;
    }

    public final String MediaDescriptionCompat() {
        getAddress6 getaddress6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if ((getaddress6 == null || getaddress6.MediaBrowserCompat$ItemReceiver() == null) ? false : true) {
            return this.MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver().RatingCompat;
        }
        return null;
    }
}
