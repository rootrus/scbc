package com.scb.phone.view.fragment.transferandpay.topuptab;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.scheduledtransaction.ScheduleLandingActivity;
import com.scb.phone.view.activity.transferandpay.topup.TopUpActivity;
import com.scb.phone.view.activity.transferandpay.topup.TopUpReviewActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.CustomScheduleView;
import com.scb.phone.view.fragment.transferandpay.BaseTargetSelectedFragment;
import com.thunderhead.android.aspects.AndroidXSupportFragmentIntentTidInjectionAspect;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindAccountManagementFragment;
import p040o.FragmentBuilder_BindAccountManagementSuccessFragment;
import p040o.FragmentBuilder_BindBranchTabFragment;
import p040o.FragmentBuilder_BindEasycashContactInformationFragment;
import p040o.HmlPinActivity;
import p040o.ICameraUpdateFactoryDelegate;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getDefaultReturnObject;
import p040o.getEasycashIntroductions;
import p040o.getExtractActivityClass;
import p040o.getICheckDeserializerRtti;
import p040o.getIExtractionServerKta;
import p040o.getOversizeImage;
import p040o.getParametersKey;
import p040o.getRamUsed;
import p040o.getTopLeftCornerWidth;
import p040o.parseEventLog;
import p040o.parseEventSignal;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class TopUpBillerSelectedFragment extends BaseTargetSelectedFragment implements getTopLeftCornerWidth.setCheckable, FragmentBuilder_BindBranchTabFragment {
    private double MediaBrowserCompat$CustomActionResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private getRamUsed f3100x50fd9e4a;
    private String MediaMetadataCompat = "";
    private String MediaSessionCompat$QueueItem;
    private getEasycashIntroductions MediaSessionCompat$ResultReceiverWrapper;
    private boolean MediaSessionCompat$Token = false;
    private String ParcelableVolumeInfo;
    @BindView
    protected CustomScheduleView customScheduleView;
    @BindView
    protected LinearLayout noteLayout;
    @BindView
    protected LinearLayout scheduleLinearLayout;
    @HmlPinActivity
    public getIExtractionServerKta topUpBillerSelectedPresenter;

    /* renamed from: c_ */
    public final void mo13978c_(boolean z) {
    }

    public static TopUpBillerSelectedFragment write(parseEventSignal parseeventsignal, CrashlyticsReport.FilesPayload.File.Builder builder, String str, String str2) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.scb.phone.EXTRA_TOP_DISPLAY", parseeventsignal);
        bundle.putParcelable("com.scb.phone.EXTRA_AVAILABLE_AMOUNT", builder);
        bundle.putString("source", str);
        bundle.putString("subtype", str2);
        TopUpBillerSelectedFragment topUpBillerSelectedFragment = new TopUpBillerSelectedFragment();
        topUpBillerSelectedFragment.setArguments(bundle);
        return topUpBillerSelectedFragment;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.f85782131493805, viewGroup, false);
        ButterKnife.IconCompatParcelizer(this, inflate);
        this.MediaDescriptionCompat = "com.scb.phone/BROADCAST_TOP_UP_BACK_STEP";
        this.topUpBillerSelectedPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaBrowserCompat$MediaItem = (parseEventSignal) getArguments().getParcelable("com.scb.phone.EXTRA_TOP_DISPLAY");
        if (!(getActivity() == null || getActivity().getIntent() == null)) {
            this.topUpBillerSelectedPresenter.read = getActivity().getIntent().getBooleanExtra("EXTRA_BILL_PAYMENT_IS_PREDICTIVE", false);
        }
        getIExtractionServerKta getiextractionserverkta = this.topUpBillerSelectedPresenter;
        parseEventSignal parseeventsignal = this.MediaBrowserCompat$MediaItem;
        getiextractionserverkta.MediaBrowserCompat$SearchResultReceiver = parseeventsignal;
        if ((getiextractionserverkta.RatingCompat != null) && parseeventsignal != null) {
            if (parseeventsignal.MediaBrowserCompat$ItemReceiver() || getiextractionserverkta.read) {
                getParametersKey getparameterskey = new getParametersKey(parseeventsignal);
                if (getiextractionserverkta.RatingCompat != null) {
                    getparameterskey.IconCompatParcelizer(getiextractionserverkta.RatingCompat);
                }
            } else {
                getDefaultReturnObject getdefaultreturnobject = new getDefaultReturnObject(parseeventsignal);
                if (getiextractionserverkta.RatingCompat != null) {
                    getdefaultreturnobject.IconCompatParcelizer(getiextractionserverkta.RatingCompat);
                }
            }
            if (parseeventsignal.AlertController$RecycleListView == ICameraUpdateFactoryDelegate.TYPE_RANGE) {
                String valueOf = String.valueOf(parseeventsignal.MediaDescriptionCompat);
                if (getiextractionserverkta.RatingCompat != null) {
                    getiextractionserverkta.RatingCompat.Keep();
                }
                getiextractionserverkta.MediaMetadataCompat.IconCompatParcelizer(valueOf);
                getiextractionserverkta.MediaMetadataCompat.IconCompatParcelizer(new getIExtractionServerKta.read(getiextractionserverkta, (byte) 0));
            } else {
                String valueOf2 = String.valueOf(parseeventsignal.MediaDescriptionCompat);
                if (getiextractionserverkta.RatingCompat != null) {
                    getiextractionserverkta.RatingCompat.Keep();
                }
                getiextractionserverkta.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver(valueOf2);
                getiextractionserverkta.MediaMetadataCompat.IconCompatParcelizer(new getIExtractionServerKta.write(getiextractionserverkta, (byte) 0));
            }
            getExtractActivityClass getextractactivityclass = new getExtractActivityClass(getiextractionserverkta, parseeventsignal);
            if (getiextractionserverkta.RatingCompat != null) {
                getextractactivityclass.IconCompatParcelizer(getiextractionserverkta.RatingCompat);
            }
        }
        this.MediaSessionCompat$QueueItem = AbsActionBarView();
        this.ParcelableVolumeInfo = setVisibility();
        if ("PREPAID".equalsIgnoreCase(this.MediaBrowserCompat$MediaItem.PlaybackStateCompat$CustomAction)) {
            ZSYR2K[] zsyr2kArr = {new ZSYR2K("source", this.MediaSessionCompat$QueueItem), new ZSYR2K("subtype", "prepaid_card")};
            if (getActivity() != null) {
                ((BaseActivity) getActivity()).scbAnalytics.write("topup_input", zsyr2kArr);
            }
        } else {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new ZSYR2K("source", this.MediaSessionCompat$QueueItem));
            String str = this.ParcelableVolumeInfo;
            if (str != null) {
                arrayList.add(new ZSYR2K("subtype", str));
            }
            IconCompatParcelizer("topup_input", (ZSYR2K[]) arrayList.toArray(new ZSYR2K[arrayList.size()]));
        }
        super.onCreateView(layoutInflater, viewGroup, bundle);
        this.mAmountValue.setOnAmountChangeListener(new AmountEditText.read() {
            public final void MediaBrowserCompat$CustomActionResultReceiver(double d) {
            }

            public final void MediaBrowserCompat$CustomActionResultReceiver() {
                TopUpBillerSelectedFragment.this.PlaybackStateCompat$CustomAction();
            }
        });
        CrashlyticsReport.FilesPayload.File.Builder builder = (CrashlyticsReport.FilesPayload.File.Builder) getArguments().getParcelable("com.scb.phone.EXTRA_AVAILABLE_AMOUNT");
        if (!(builder == null || builder == null)) {
            this.RatingCompat = builder.MediaSessionCompat$Token;
            this.IconCompatParcelizer = builder.MediaBrowserCompat$CustomActionResultReceiver;
            MediaBrowserCompat$MediaItem();
        }
        this.customScheduleView.setOnEditClickListener(this);
        return inflate;
    }

    public void onDestroy() {
        if (this.MediaBrowserCompat$SearchResultReceiver != null && !this.MediaBrowserCompat$SearchResultReceiver.isDisposed()) {
            this.MediaBrowserCompat$SearchResultReceiver.dispose();
        }
        getIExtractionServerKta getiextractionserverkta = this.topUpBillerSelectedPresenter;
        if (getiextractionserverkta != null) {
            getiextractionserverkta.onDestroy();
        }
        super.onDestroy();
    }

    public final void write(parseEventSignal parseeventsignal) {
        boolean z;
        MediaBrowserCompat$ItemReceiver(parseeventsignal);
        this.mReferenceTextView1.setText(parseeventsignal.ParcelableVolumeInfo);
        this.mReferenceEditText1.setHint(parseeventsignal.MediaSessionCompat$Token);
        this.mReferenceEditText1.setInputType(3);
        this.mAmountInputLayout.setHintEnabled(false);
        this.mButton.setButtonEnabled(false);
        this.mButton.setText(getString(R.string.review));
        if (parseeventsignal.IconCompatParcelizer()) {
            this.mCustomTransferAndPayBiller.mBackButton.setVisibility(8);
            if (!TextUtils.isEmpty(parseeventsignal.Keep)) {
                this.mReferenceEditText1.setText(parseeventsignal.Keep);
            }
        }
        if ("PREPAID".equalsIgnoreCase(parseeventsignal.PlaybackStateCompat$CustomAction)) {
            if (getActivity() instanceof TopUpActivity) {
                z = ((TopUpActivity) getActivity()).MediaBrowserCompat$SearchResultReceiver;
            } else {
                z = false;
            }
            if (z) {
                this.mReferenceEditText1.setText(parseeventsignal.MediaMetadataCompat);
            }
            this.mAmountValue.setHint(parseeventsignal.f2915x50fd9e4a);
            this.mReferenceEditText1.setEnabled(!z);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.mReferenceTextView2.getLayoutParams();
            layoutParams.topMargin = 8;
            this.mReferenceTextView2.setLayoutParams(layoutParams);
            this.mReferenceTextView2.setTextSize(2, 16.0f);
            this.mReferenceTextView2.setTextColor(setLastBaselineToBottomHeight.read(getContext(), R.color.f67152131099871));
            this.mReferenceTextView2.setText(getResources().getString(R.string.prepaid_top_up_validate_input_account_no));
            this.mReferenceEditText1.setFilters(new InputFilter[]{new InputFilter.LengthFilter(16)});
            this.mReferenceEditText1.setOnFocusChangeListener(new FragmentBuilder_BindAccountManagementSuccessFragment(this));
        }
    }

    public final /* synthetic */ void MediaBrowserCompat$ItemReceiver(View view, boolean z) {
        int i = 8;
        if (!z) {
            TextView textView = this.mReferenceTextView2;
            if (((EditText) view).getText().toString().length() < 16) {
                i = 0;
            }
            textView.setVisibility(i);
            return;
        }
        this.mReferenceTextView2.setVisibility(8);
    }

    public final void read(parseEventSignal parseeventsignal) {
        write(parseeventsignal);
        this.mReferenceEditText1.setEnabled(false);
        this.mReferenceEditText1.setText(parseeventsignal.Keep);
        this.mCustomTransferAndPayBiller.mBackButton.setVisibility(8);
        this.MediaMetadataCompat = parseeventsignal.MediaBrowserCompat$MediaItem;
    }

    public final void write(parseEventLog parseeventlog) {
        this.MediaSessionCompat$Token = false;
        String str = parseeventlog.IconCompatParcelizer;
        this.mAmountInputLayout.setVisibility(0);
        this.mDivider.setVisibility(0);
        this.mAmountValue.setHint(str);
        this.mAmountValue.setCustomHint(str, this.mAmountInputLayout);
        this.mAmountValue.setOnFocusChangeListener(new FragmentBuilder_BindAccountManagementFragment(this, str));
        parseEventSignal parseeventsignal = this.topUpBillerSelectedPresenter.MediaBrowserCompat$SearchResultReceiver;
        if (parseeventsignal.IconCompatParcelizer() && !getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(parseeventsignal.MediaBrowserCompat$SearchResultReceiver)) {
            this.mAmountValue.setText(parseeventsignal.MediaBrowserCompat$SearchResultReceiver);
        }
        this.mAmountValue.setCurrencyFormattingTextWatcher(new FragmentBuilder_BindEasycashContactInformationFragment(this.mAmountValue, this.mAmountInputLayout, parseeventlog.MediaBrowserCompat$ItemReceiver.doubleValue(), parseeventlog.read.doubleValue(), getResources().getString(R.string.error_limit), getResources().getString(R.string.not_enough_funds_on_selected_account)));
        FragmentBuilder_BindEasycashContactInformationFragment fragmentBuilder_BindEasycashContactInformationFragment = this.mAmountValue.read;
        if (fragmentBuilder_BindEasycashContactInformationFragment != null) {
            fragmentBuilder_BindEasycashContactInformationFragment.IconCompatParcelizer(Double.MAX_VALUE);
        }
    }

    public final /* synthetic */ void IconCompatParcelizer(String str, boolean z) {
        if (z) {
            this.mAmountInputLayout.setHintEnabled(false);
            this.mAmountValue.setHint("");
            if (getActivity() != null && isAdded()) {
                ((BaseActivity) getActivity()).ActionBarContainer();
            }
        } else if (getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(this.mAmountValue.getText().toString())) {
            this.mAmountInputLayout.setHintEnabled(true);
            this.mAmountValue.setText("");
            this.mAmountValue.setHint(str);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(parseEventLog parseeventlog) {
        write(parseeventlog);
        String str = this.topUpBillerSelectedPresenter.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver;
        if (!getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(str)) {
            this.mAmountValue.setText(str);
        }
        if (this.topUpBillerSelectedPresenter.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$ResultReceiverWrapper) {
            this.mAmountInputLayout.setHintEnabled(false);
            this.mAmountValue.setEnabled(getICheckDeserializerRtti.MediaBrowserCompat$MediaItem(str));
        }
    }

    public final void read(List<Integer> list) {
        this.mRecyclerView.setVisibility(0);
        this.MediaSessionCompat$Token = true;
        this.mReferenceEditText1.setImeOptions(6);
        getContext();
        this.mRecyclerView.setLayoutManager(new LinearLayoutManager(0, false));
        this.MediaSessionCompat$ResultReceiverWrapper = new getEasycashIntroductions(list, this.IconCompatParcelizer);
        this.mRecyclerView.setAdapter(this.MediaSessionCompat$ResultReceiverWrapper);
        MediaBrowserCompat$MediaItem();
        parseEventSignal parseeventsignal = this.topUpBillerSelectedPresenter.MediaBrowserCompat$SearchResultReceiver;
        if (parseeventsignal.IconCompatParcelizer() && !TextUtils.isEmpty(parseeventsignal.MediaBrowserCompat$SearchResultReceiver)) {
            this.MediaSessionCompat$ResultReceiverWrapper.write(parseeventsignal.MediaBrowserCompat$SearchResultReceiver);
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(List<Integer> list) {
        read(list);
        this.MediaSessionCompat$ResultReceiverWrapper.write(this.topUpBillerSelectedPresenter.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$SearchResultReceiver);
    }

    public final void MediaBrowserCompat$ItemReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes, boolean z) {
        setUuidFromUtf8Bytes MediaBrowserCompat$ItemReceiver = setuuidfromutf8bytes.IconCompatParcelizer(this.RatingCompat).MediaBrowserCompat$ItemReceiver(getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(this.RatingCompat, z));
        MediaBrowserCompat$ItemReceiver.ListMenuItemView = this.RatingCompat;
        MediaBrowserCompat$ItemReceiver.setGroupDividerEnabled = getICheckDeserializerRtti.write(getContext(), (int) R.drawable.bankicon_scb);
        MediaBrowserCompat$ItemReceiver.AlertController$RecycleListView = this.mReferenceEditText1.getText().toString();
        CrashlyticsReport.Session.Application.read read = new CrashlyticsReport.Session.Application.read();
        read.IconCompatParcelizer = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(NumberFormat.getCurrencyInstance()).format(this.MediaBrowserCompat$CustomActionResultReceiver);
        MediaBrowserCompat$ItemReceiver.f2965x50fd9e4a = new CrashlyticsReport.Session.Application(read, (byte) 0);
        MediaBrowserCompat$ItemReceiver.setBackgroundResource = this.MediaMetadataCompat;
        MediaBrowserCompat$ItemReceiver.setOnMenuItemClickListener = this.noteEditText.mNoteEditText.getText().toString();
        MediaBrowserCompat$ItemReceiver.setShowingForActionMode = this.f3100x50fd9e4a;
        if ("PREPAID".equalsIgnoreCase(this.MediaBrowserCompat$MediaItem.PlaybackStateCompat$CustomAction) && (getActivity() instanceof TopUpActivity) && ((TopUpActivity) getActivity()).MediaBrowserCompat$SearchResultReceiver) {
            setuuidfromutf8bytes.setItemInvoker = true;
        }
        IconCompatParcelizer(setuuidfromutf8bytes);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    @butterknife.OnClick
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdditionalInfoButtonClicked() {
        /*
            r11 = this;
            o.getIExtractionServerKta r0 = r11.topUpBillerSelectedPresenter
            com.scb.phone.view.custom.common.NoteEditText r1 = r11.noteEditText
            android.widget.EditText r1 = r1.mNoteEditText
            android.text.Editable r1 = r1.getText()
            java.lang.String r1 = r1.toString()
            java.lang.String r1 = r1.trim()
            T r2 = r0.RatingCompat
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x001a
            r2 = r3
            goto L_0x001b
        L_0x001a:
            r2 = r4
        L_0x001b:
            if (r2 == 0) goto L_0x0046
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0044
            java.lang.String r2 = "^(?=\\S)[0-9a-zA-Z\\u0E00-\\u0E3E\\u0E40-\\u0E7F _*'\"#&*()@\\-]+$"
            java.util.regex.Pattern r2 = java.util.regex.Pattern.compile(r2)
            java.util.regex.Matcher r1 = r2.matcher(r1)
            boolean r1 = r1.matches()
            if (r1 != 0) goto L_0x0044
            o.BillCaptureModule r1 = p040o.BillCaptureModule.MediaBrowserCompat$ItemReceiver
            T r2 = r0.RatingCompat
            if (r2 == 0) goto L_0x003b
            r2 = r3
            goto L_0x003c
        L_0x003b:
            r2 = r4
        L_0x003c:
            if (r2 == 0) goto L_0x0046
            T r0 = r0.RatingCompat
            r1.IconCompatParcelizer(r0)
            goto L_0x0046
        L_0x0044:
            r0 = r3
            goto L_0x0047
        L_0x0046:
            r0 = r4
        L_0x0047:
            if (r0 == 0) goto L_0x0147
            o.getIExtractionServerKta r0 = r11.topUpBillerSelectedPresenter
            boolean r0 = r0.MediaBrowserCompat$ItemReceiver
            if (r0 != 0) goto L_0x0147
            com.scb.phone.view.custom.common.AmountEditText r0 = r11.mAmountValue
            android.text.Editable r0 = r0.getText()
            if (r0 != 0) goto L_0x0060
            o.getEasycashIntroductions r0 = r11.MediaSessionCompat$ResultReceiverWrapper
            int r0 = r0.write()
            r1 = -1
            if (r0 == r1) goto L_0x0147
        L_0x0060:
            com.scb.phone.view.custom.ScbEditText r0 = r11.mReferenceEditText1
            android.text.Editable r0 = r0.getText()
            if (r0 == 0) goto L_0x0147
            java.lang.String r0 = r11.RatingCompat
            if (r0 == 0) goto L_0x0147
            boolean r0 = r11.MediaSessionCompat$Token
            if (r0 == 0) goto L_0x0077
            o.getEasycashIntroductions r0 = r11.MediaSessionCompat$ResultReceiverWrapper
            java.lang.Double r0 = r0.MediaBrowserCompat$ItemReceiver()
            goto L_0x0085
        L_0x0077:
            com.scb.phone.view.custom.common.AmountEditText r0 = r11.mAmountValue
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            java.lang.Double r0 = p040o.getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver((java.lang.String) r0)
        L_0x0085:
            double r0 = r0.doubleValue()
            r11.MediaBrowserCompat$CustomActionResultReceiver = r0
            com.scb.phone.view.custom.ScbEditText r0 = r11.mReferenceEditText1
            android.text.Editable r0 = r0.getText()
            java.lang.String r0 = r0.toString()
            o.parseEventSignal r1 = r11.MediaBrowserCompat$MediaItem
            java.lang.String r1 = r1.PlaybackStateCompat$CustomAction
            java.lang.String r2 = "PREPAID"
            boolean r1 = r2.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00b7
            androidx.fragment.app.FragmentActivity r1 = r11.getActivity()
            boolean r1 = r1 instanceof com.scb.phone.view.activity.transferandpay.topup.TopUpActivity
            if (r1 == 0) goto L_0x00b7
            androidx.fragment.app.FragmentActivity r1 = r11.getActivity()
            com.scb.phone.view.activity.transferandpay.topup.TopUpActivity r1 = (com.scb.phone.view.activity.transferandpay.topup.TopUpActivity) r1
            boolean r1 = r1.MediaBrowserCompat$SearchResultReceiver
            if (r1 == 0) goto L_0x00b7
            o.parseEventSignal r0 = r11.MediaBrowserCompat$MediaItem
            java.lang.String r0 = r0.Keep
        L_0x00b7:
            o.getIExtractionServerKta r1 = r11.topUpBillerSelectedPresenter
            java.lang.String r2 = r11.RatingCompat
            double r5 = r11.MediaBrowserCompat$CustomActionResultReceiver
            o.getRamUsed r7 = r11.f3100x50fd9e4a
            com.scb.phone.view.custom.common.NoteEditText r8 = r11.noteEditText
            android.widget.EditText r8 = r8.mNoteEditText
            android.text.Editable r8 = r8.getText()
            java.lang.String r8 = r8.toString()
            T r9 = r1.RatingCompat
            if (r9 == 0) goto L_0x00d1
            r9 = r3
            goto L_0x00d2
        L_0x00d1:
            r9 = r4
        L_0x00d2:
            if (r9 == 0) goto L_0x0147
            java.lang.String r8 = r8.trim()
            o.getIBillDeserializerKta r9 = p040o.getIBillDeserializerKta.read
            T r10 = r1.RatingCompat
            if (r10 == 0) goto L_0x00e0
            r10 = r3
            goto L_0x00e1
        L_0x00e0:
            r10 = r4
        L_0x00e1:
            if (r10 == 0) goto L_0x00e8
            T r10 = r1.RatingCompat
            r9.IconCompatParcelizer(r10)
        L_0x00e8:
            r1.MediaBrowserCompat$ItemReceiver = r3
            o.consumingIterable r9 = p040o.consumingIterable.MediaBrowserCompat$CustomActionResultReceiver()
            r9.MediaBrowserCompat$CustomActionResultReceiver = r2
            r9.MediaDescriptionCompat = r0
            java.lang.String r0 = p040o.removeIfFromRandomAccessList.read((double) r5)
            r9.MediaBrowserCompat$ItemReceiver = r0
            java.lang.String r0 = "TOPUP"
            r9.IconCompatParcelizer = r0
            o.parseEventSignal r0 = r1.MediaBrowserCompat$SearchResultReceiver
            java.lang.Integer r0 = r0.MediaDescriptionCompat
            int r0 = r0.intValue()
            r9.read = r0
            r0 = 0
            if (r7 == 0) goto L_0x011f
            java.lang.String r2 = r7.IconCompatParcelizer
            java.lang.String r5 = r7.MediaBrowserCompat$CustomActionResultReceiver
            java.lang.String r5 = p040o.CheckCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver(r5)
            java.lang.String r6 = r7.read
            java.lang.String r6 = p040o.CheckCaptureActivity.MediaBrowserCompat$CustomActionResultReceiver(r6)
            o.setActivity r10 = new o.setActivity
            java.lang.String r7 = r7.write
            r10.<init>(r2, r5, r6, r7)
            goto L_0x0120
        L_0x011f:
            r10 = r0
        L_0x0120:
            r9.MediaMetadataCompat = r10
            o.parseEventSignal r2 = r1.MediaBrowserCompat$SearchResultReceiver
            java.lang.String r2 = r2.setHasDecor
            r9.RatingCompat = r2
            if (r8 == 0) goto L_0x0131
            int r2 = r8.length()
            if (r2 == 0) goto L_0x0131
            r3 = r4
        L_0x0131:
            if (r3 == 0) goto L_0x0134
            r8 = r0
        L_0x0134:
            o.paddedPartition<java.lang.String> r0 = r9.write
            r0.MediaBrowserCompat$ItemReceiver = r8
            o.getAppIdOrigin r0 = r1.MediaMetadataCompat
            r0.write(r9)
            o.getAppIdOrigin r0 = r1.MediaMetadataCompat
            o.getIExtractionServerKta$MediaBrowserCompat$CustomActionResultReceiver r2 = new o.getIExtractionServerKta$MediaBrowserCompat$CustomActionResultReceiver
            r2.<init>(r1, r4)
            r0.IconCompatParcelizer(r2)
        L_0x0147:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.fragment.transferandpay.topuptab.TopUpBillerSelectedFragment.onAdditionalInfoButtonClicked():void");
    }

    public final boolean AppCompatDialogFragment() {
        if (!this.MediaSessionCompat$Token) {
            return super.AppCompatDialogFragment();
        }
        getEasycashIntroductions geteasycashintroductions = this.MediaSessionCompat$ResultReceiverWrapper;
        return geteasycashintroductions != null && geteasycashintroductions.write() >= 0 && this.RatingCompat != null && !this.RatingCompat.isEmpty();
    }

    public final void IconCompatParcelizer(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        Intent intent = new Intent(getActivity(), TopUpReviewActivity.class);
        intent.putExtra("source", this.MediaSessionCompat$QueueItem);
        intent.putExtra("subtype", this.ParcelableVolumeInfo);
        if ("PREPAID".equalsIgnoreCase(this.MediaBrowserCompat$MediaItem.PlaybackStateCompat$CustomAction)) {
            intent.putExtra("subtype", "prepaid_card");
        }
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivity(Intent), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(intent);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        aj_();
    }

    public final void write(String str) {
        this.mRemainingLimit.setVisibility(0);
        this.mRemainingLimit.setText(str);
    }

    public final void read() {
        this.noteEditText.write();
    }

    public final void MediaBrowserCompat$SearchResultReceiver() {
        Intent intent = new Intent(getActivity(), ScheduleLandingActivity.class);
        AndroidXSupportFragmentIntentTidInjectionAspect.aspectOf();
        try {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                intent = setTapText.write(activity, intent).read();
            }
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on support Fragment.startActivityForResult(Intent, int), modified: ");
            sb.append(intent.getData());
            sb.append("\n with context ");
            sb.append(activity.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(intent, 100);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 100) {
            if (i2 == -1) {
                this.f3100x50fd9e4a = (getRamUsed) intent.getParcelableExtra("SCHEDULE_DETAIL");
                if (this.noteLayout.getVisibility() == 0) {
                    this.noteLayout.setVisibility(8);
                    if (!this.noteEditText.mNoteEditText.getText().toString().isEmpty()) {
                        FragmentActivity activity = getActivity();
                        String string = getString(R.string.topup_input_010);
                        getOversizeImage getoversizeimage = getOversizeImage.ERROR;
                        if (getActivity() != null) {
                            ((BaseActivity) getActivity()).write(activity, R.id.fragment_container_top_up, string, getoversizeimage);
                        }
                        this.noteEditText.mNoteEditText.setText("");
                    }
                }
                this.customScheduleView.setScheduleView(this.f3100x50fd9e4a, true);
            } else if (i2 == 1) {
                this.customScheduleView.read();
                this.noteLayout.setVisibility(0);
                this.f3100x50fd9e4a = null;
            }
            MediaBrowserCompat$MediaItem();
        }
    }

    private void MediaBrowserCompat$MediaItem() {
        getEasycashIntroductions geteasycashintroductions = this.MediaSessionCompat$ResultReceiverWrapper;
        if (geteasycashintroductions != null) {
            geteasycashintroductions.IconCompatParcelizer(this.IconCompatParcelizer, this.scheduleLinearLayout.getVisibility() == 0);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        this.topUpBillerSelectedPresenter.MediaBrowserCompat$ItemReceiver = false;
    }

    public final void read(CrashlyticsReport.FilesPayload.File.Builder builder) {
        if (builder != null) {
            this.RatingCompat = builder.MediaSessionCompat$Token;
            this.IconCompatParcelizer = builder.MediaBrowserCompat$CustomActionResultReceiver;
            MediaBrowserCompat$MediaItem();
        }
    }
}
