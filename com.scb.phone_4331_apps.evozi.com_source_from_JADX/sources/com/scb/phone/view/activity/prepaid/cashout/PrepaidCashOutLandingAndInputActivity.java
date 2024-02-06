package com.scb.phone.view.activity.prepaid.cashout;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.google.android.gms.common.internal.ServiceSpecificExtraArgs;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prepaid.cashout.PrepaidCashOutReviewActivity;
import com.scb.phone.view.custom.common.AmountEditText;
import com.scb.phone.view.custom.common.DefaultButton;
import com.scb.phone.view.custom.common.NoSwipeViewPager;
import com.scb.phone.view.custom.common.NoteEditText;
import com.scb.phone.view.fragment.prepaid.cashout.C6124x48a86f5b;
import com.scb.phone.view.fragment.prepaid.cashout.C6125x6d7cfb51;
import com.scb.phone.view.fragment.prepaid.cashout.PrepaidCashOutInputFragment;
import com.scb.phone.view.fragment.prepaid.cashout.PrepaidCashOutLandingAndInputToAccountFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p040o.AutoValue_CrashlyticsReport_Session_Event;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.C4778ho;
import p040o.C4780xd3e758ad;
import p040o.CardView;
import p040o.DebitCardMarketConductDeepLinkActivity;
import p040o.DebitCardResetOtpActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.ImmutableCollection;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OnDeviceIdExtractor;
import p040o.StreetViewPanorama;
import p040o.exportDepositStatement;
import p040o.getCustomAttributes;
import p040o.getICheckDeserializerRtti;
import p040o.getKernelIDDstAtop;
import p040o.ho$MediaBrowserCompat$SearchResultReceiver;
import p040o.ho$MediaSessionCompat$QueueItem;
import p040o.ho$MediaSessionCompat$ResultReceiverWrapper;
import p040o.ho$MediaSessionCompat$Token;
import p040o.isInstance;
import p040o.isSimulator;
import p040o.newArrayListWithCapacity;
import p040o.onGetStartedClick;
import p040o.setRam;
import p040o.setTapText;
import p040o.systemNanoTime;
import p040o.writeUInt64NoTag;

public final class PrepaidCashOutLandingAndInputActivity extends BaseActivity implements OnDeviceIdExtractor.C6966a.IconCompatParcelizer, PrepaidCashOutLandingAndInputToAccountFragment.read, PrepaidCashOutInputFragment.read {
    public static final read MediaBrowserCompat$MediaItem = new read((byte) 0);
    private exportDepositStatement MediaBrowserCompat$SearchResultReceiver;
    private PrepaidCashOutInputFragment MediaDescriptionCompat;
    private getKernelIDDstAtop MediaMetadataCompat;
    @BindView
    public FrameLayout mFragmentContainer;
    @BindView
    public FrameLayout mFragmentInputContainer;
    @BindView
    public LinearLayout mFromAccountLinearLayout;
    @HmlPinActivity
    public C4778ho mPresenter;
    @BindView
    public LinearLayout mToAccountErrorLinearLayout;
    @BindView
    public NoSwipeViewPager mViewPager;

    public static final class read {
        private read() {
        }

        public /* synthetic */ read(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79342131493159);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.MediaMetadataCompat = new getKernelIDDstAtop();
        C4778ho hoVar = this.mPresenter;
        if (hoVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        hoVar.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.prepaid_cash_out_landing_title);
        setTabContainer();
        getCustomAttributes getcustomattributes = (getCustomAttributes) getIntent().getParcelableExtra("EXTRA_PREPAID_TRAVEL_WALLET_SUMMARY_DISPLAY");
        isSimulator issimulator = (isSimulator) getIntent().getParcelableExtra("EXTRA_PREPAID_CARD_DISPLAY");
        C4778ho hoVar2 = this.mPresenter;
        if (hoVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        onGetStartedClick.IconCompatParcelizer((Object) getcustomattributes, "prepaidTravelWalletSummaryDisplay");
        onGetStartedClick.IconCompatParcelizer((Object) issimulator, "prepaidCardDisplay");
        String D_ = mo3026D_();
        onGetStartedClick.IconCompatParcelizer((Object) D_, "language");
        onGetStartedClick.write((Object) getcustomattributes, "prepaidTravelWalletSummaryDisplay");
        onGetStartedClick.write((Object) issimulator, "prepaidCardDisplay");
        onGetStartedClick.write((Object) D_, "language");
        hoVar2.MediaMetadataCompat = getcustomattributes;
        boolean z = false;
        hoVar2.MediaBrowserCompat$SearchResultReceiver = getcustomattributes.read.get(0);
        hoVar2.MediaBrowserCompat$MediaItem = issimulator;
        hoVar2.write = D_;
        if (hoVar2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            hoVar2.RatingCompat.AlertController$RecycleListView();
        }
        newArrayListWithCapacity newarraylistwithcapacity = hoVar2.IconCompatParcelizer;
        FundFactSheetActivity ho_mediasessioncompat_token = new ho$MediaSessionCompat$Token(hoVar2);
        FundFactSheetActivity ho_mediasessioncompat_resultreceiverwrapper = new ho$MediaSessionCompat$ResultReceiverWrapper(hoVar2);
        onGetStartedClick.write((Object) ho_mediasessioncompat_token, "onSuccess");
        onGetStartedClick.write((Object) ho_mediasessioncompat_resultreceiverwrapper, "onError");
        isInstance isinstance = newarraylistwithcapacity.write;
        DebitCardResetOtpActivity<List<StreetViewPanorama.OnStreetViewPanoramaLongClickListener>> IconCompatParcelizer = isinstance.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer("PREPAID_CARD_CASHOUT_TARGET");
        onGetStartedClick.IconCompatParcelizer((Object) IconCompatParcelizer, "mDepositRepositoryContra…PAID_CARD_CASHOUT_TARGET)");
        isinstance.read(IconCompatParcelizer, new DebitCardMarketConductDeepLinkActivity() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                onGetStartedClick.IconCompatParcelizer(FundFactSheetActivity.this.invoke(obj), "invoke(...)");
            }
        }, new DebitCardMarketConductDeepLinkActivity() {
            public final /* synthetic */ void IconCompatParcelizer(Object obj) {
                onGetStartedClick.IconCompatParcelizer(FundFactSheetActivity.this.invoke(obj), "invoke(...)");
            }
        });
        getKernelIDDstAtop getkerneliddstatop = this.MediaMetadataCompat;
        if (getkerneliddstatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_cashout_input_screen");
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 999 && i2 == -1) {
            PrepaidCashOutInputFragment prepaidCashOutInputFragment = this.MediaDescriptionCompat;
            if (prepaidCashOutInputFragment == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPrepaidCashOutInputFragment");
            }
            AmountEditText amountEditText = prepaidCashOutInputFragment.mAmountEditText;
            if (amountEditText == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mAmountEditText");
            }
            amountEditText.setFormattedAmount("");
        }
    }

    public final void IconCompatParcelizer(AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application) {
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application, "prepaidTravelWalletDisplay");
        LinearLayout linearLayout = this.mFromAccountLinearLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFromAccountLinearLayout");
        }
        linearLayout.setVisibility(0);
        exportDepositStatement exportdepositstatement = new exportDepositStatement(this);
        this.MediaBrowserCompat$SearchResultReceiver = exportdepositstatement;
        List<AutoValue_CrashlyticsReport_Session_Event_Application> singletonList = Collections.singletonList(autoValue_CrashlyticsReport_Session_Event_Application);
        onGetStartedClick.IconCompatParcelizer((Object) singletonList, "java.util.Collections.singletonList(element)");
        onGetStartedClick.write((Object) singletonList, "prepaidTravelWalletDisplayList");
        exportdepositstatement.write = singletonList;
        exportdepositstatement.notifyDataSetChanged();
        NoSwipeViewPager noSwipeViewPager = this.mViewPager;
        if (noSwipeViewPager == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mViewPager");
        }
        exportDepositStatement exportdepositstatement2 = this.MediaBrowserCompat$SearchResultReceiver;
        if (exportdepositstatement2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFromAccountViewPageAdapter");
        }
        noSwipeViewPager.setAdapter(exportdepositstatement2);
    }

    public final void read() {
        FrameLayout frameLayout = this.mFragmentContainer;
        if (frameLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFragmentContainer");
        }
        frameLayout.removeAllViews();
        LinearLayout linearLayout = this.mToAccountErrorLinearLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mToAccountErrorLinearLayout");
        }
        linearLayout.setVisibility(0);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(List<setRam> list) {
        onGetStartedClick.write((Object) list, "toAccounts");
        LinearLayout linearLayout = this.mToAccountErrorLinearLayout;
        if (linearLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mToAccountErrorLinearLayout");
        }
        linearLayout.setVisibility(8);
        C6125x6d7cfb51 prepaidCashOutLandingAndInputToAccountFragment$MediaBrowserCompat$CustomActionResultReceiver = PrepaidCashOutLandingAndInputToAccountFragment.IconCompatParcelizer;
        PrepaidCashOutLandingAndInputToAccountFragment.read read2 = this;
        onGetStartedClick.write((Object) list, "toAccounts");
        onGetStartedClick.write((Object) read2, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
        PrepaidCashOutLandingAndInputToAccountFragment prepaidCashOutLandingAndInputToAccountFragment = new PrepaidCashOutLandingAndInputToAccountFragment();
        prepaidCashOutLandingAndInputToAccountFragment.MediaMetadataCompat = read2;
        Bundle bundle = new Bundle();
        bundle.putParcelableArrayList("EXTRA_ACCOUNT_SOURCE_DISPLAY_LIST", (ArrayList) list);
        prepaidCashOutLandingAndInputToAccountFragment.setArguments(bundle);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.cash_out_fragment_container, prepaidCashOutLandingAndInputToAccountFragment).write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_Session_Event.C30691 r4) {
        onGetStartedClick.write((Object) r4, "prepaidCashOutReviewDisplay");
        PrepaidCashOutReviewActivity.write write = PrepaidCashOutReviewActivity.MediaBrowserCompat$SearchResultReceiver;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) r4, "prepaidCashOutReviewDisplay");
        Intent putExtra = new Intent(context, PrepaidCashOutReviewActivity.class).putExtra("EXTRA_SHOULD_DISPLAY_LOGO", r4);
        onGetStartedClick.IconCompatParcelizer((Object) putExtra, "Intent(context, PrepaidC…paidCashOutReviewDisplay)");
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, putExtra).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read2.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read2, 999);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        CardView read2 = getSupportFragmentManager().read();
        onGetStartedClick.IconCompatParcelizer((Object) read2, "supportFragmentManager.beginTransaction()");
        if (z) {
            C6124x48a86f5b prepaidCashOutInputFragment$MediaBrowserCompat$CustomActionResultReceiver = PrepaidCashOutInputFragment.MediaBrowserCompat$CustomActionResultReceiver;
            PrepaidCashOutInputFragment.read read3 = this;
            onGetStartedClick.write((Object) read3, ServiceSpecificExtraArgs.CastExtraArgs.LISTENER);
            PrepaidCashOutInputFragment prepaidCashOutInputFragment = new PrepaidCashOutInputFragment();
            prepaidCashOutInputFragment.IconCompatParcelizer = read3;
            this.MediaDescriptionCompat = prepaidCashOutInputFragment;
            read2.MediaBrowserCompat$SearchResultReceiver();
            PrepaidCashOutInputFragment prepaidCashOutInputFragment2 = this.MediaDescriptionCompat;
            if (prepaidCashOutInputFragment2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPrepaidCashOutInputFragment");
            }
            read2.MediaBrowserCompat$ItemReceiver(R.id.cash_out_input_fragment_container, prepaidCashOutInputFragment2).write();
            return;
        }
        FrameLayout frameLayout = this.mFragmentInputContainer;
        if (frameLayout == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mFragmentInputContainer");
        }
        frameLayout.removeAllViews();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        PrepaidCashOutInputFragment prepaidCashOutInputFragment = this.MediaDescriptionCompat;
        if (prepaidCashOutInputFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPrepaidCashOutInputFragment");
        }
        DefaultButton defaultButton = prepaidCashOutInputFragment.btnReview;
        if (defaultButton == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("btnReview");
        }
        defaultButton.setButtonEnabled(z);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver() {
        PrepaidCashOutInputFragment prepaidCashOutInputFragment = this.MediaDescriptionCompat;
        if (prepaidCashOutInputFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPrepaidCashOutInputFragment");
        }
        NoteEditText noteEditText = prepaidCashOutInputFragment.mNoteEditText;
        if (noteEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mNoteEditText");
        }
        noteEditText.write();
    }

    public final void write() {
        PrepaidCashOutInputFragment prepaidCashOutInputFragment = this.MediaDescriptionCompat;
        if (prepaidCashOutInputFragment == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPrepaidCashOutInputFragment");
        }
        NoteEditText noteEditText = prepaidCashOutInputFragment.mNoteEditText;
        if (noteEditText == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mNoteEditText");
        }
        noteEditText.IconCompatParcelizer();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final void mo15161x50fd9e4a() {
        C4778ho hoVar = this.mPresenter;
        if (hoVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        boolean z = false;
        hoVar.MediaBrowserCompat$ItemReceiver = false;
        writeUInt64NoTag.IconCompatParcelizer ho_mediasessioncompat_queueitem = new ho$MediaSessionCompat$QueueItem(hoVar);
        if (hoVar.RatingCompat != null) {
            z = true;
        }
        if (z) {
            ho_mediasessioncompat_queueitem.IconCompatParcelizer(hoVar.RatingCompat);
        }
    }

    public final void write(setRam setram) {
        onGetStartedClick.write((Object) setram, "prepaidCashOutLandingToAccountDisplay");
        C4778ho hoVar = this.mPresenter;
        if (hoVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        onGetStartedClick.write((Object) setram, "prepaidCashOutLandingToAccountDisplay");
        if (!hoVar.MediaBrowserCompat$ItemReceiver) {
            boolean z = true;
            hoVar.MediaBrowserCompat$ItemReceiver = true;
            writeUInt64NoTag.IconCompatParcelizer ho_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver = new C4780xd3e758ad(hoVar, setram);
            if (hoVar.RatingCompat == null) {
                z = false;
            }
            if (z) {
                ho_mediacontrollercompat_mediacontrollerimplapi21_extrabinderrequestresultreceiver.IconCompatParcelizer(hoVar.RatingCompat);
            }
        }
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "amount");
        C4778ho hoVar = this.mPresenter;
        if (hoVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        onGetStartedClick.write((Object) str, "amount");
        Double MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "Utilities.amountStringToDouble(amount)");
        hoVar.read = MediaBrowserCompat$ItemReceiver.doubleValue();
        writeUInt64NoTag.IconCompatParcelizer ho_mediabrowsercompat_searchresultreceiver = new ho$MediaBrowserCompat$SearchResultReceiver(hoVar);
        if (hoVar.RatingCompat != null) {
            ho_mediabrowsercompat_searchresultreceiver.IconCompatParcelizer(hoVar.RatingCompat);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x003d  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean r4, java.lang.String r5) {
        /*
            r3 = this;
            java.lang.String r0 = "note"
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            o.ho r1 = r3.mPresenter
            if (r1 != 0) goto L_0x000e
            java.lang.String r2 = "mPresenter"
            p040o.onGetStartedClick.MediaBrowserCompat$ItemReceiver(r2)
        L_0x000e:
            p040o.onGetStartedClick.write((java.lang.Object) r5, (java.lang.String) r0)
            r0 = 0
            r2 = 1
            if (r4 != 0) goto L_0x0025
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            int r4 = r5.length()
            if (r4 != 0) goto L_0x001f
            r4 = r2
            goto L_0x0020
        L_0x001f:
            r4 = r0
        L_0x0020:
            if (r4 == 0) goto L_0x0023
            goto L_0x0025
        L_0x0023:
            r4 = r0
            goto L_0x0026
        L_0x0025:
            r4 = r2
        L_0x0026:
            r1.MediaDescriptionCompat = r4
            if (r4 == 0) goto L_0x003d
            o.ho$RatingCompat r4 = p040o.C4778ho.RatingCompat.IconCompatParcelizer
            o.writeUInt64NoTag$IconCompatParcelizer r4 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r4
            T r5 = r1.RatingCompat
            if (r5 == 0) goto L_0x0034
            r5 = r2
            goto L_0x0035
        L_0x0034:
            r5 = r0
        L_0x0035:
            if (r5 == 0) goto L_0x004f
            T r5 = r1.RatingCompat
            r4.IconCompatParcelizer(r5)
            goto L_0x004f
        L_0x003d:
            o.ho$MediaMetadataCompat r4 = p040o.C4778ho.MediaMetadataCompat.MediaBrowserCompat$CustomActionResultReceiver
            o.writeUInt64NoTag$IconCompatParcelizer r4 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r4
            T r5 = r1.RatingCompat
            if (r5 == 0) goto L_0x0047
            r5 = r2
            goto L_0x0048
        L_0x0047:
            r5 = r0
        L_0x0048:
            if (r5 == 0) goto L_0x004f
            T r5 = r1.RatingCompat
            r4.IconCompatParcelizer(r5)
        L_0x004f:
            o.ho$MediaBrowserCompat$MediaItem r4 = new o.ho$MediaBrowserCompat$MediaItem
            r4.<init>(r1)
            o.writeUInt64NoTag$IconCompatParcelizer r4 = (p040o.writeUInt64NoTag.IconCompatParcelizer) r4
            T r5 = r1.RatingCompat
            if (r5 == 0) goto L_0x005b
            r0 = r2
        L_0x005b:
            if (r0 == 0) goto L_0x0062
            T r5 = r1.RatingCompat
            r4.IconCompatParcelizer(r5)
        L_0x0062:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.scb.phone.view.activity.prepaid.cashout.PrepaidCashOutLandingAndInputActivity.MediaBrowserCompat$CustomActionResultReceiver(boolean, java.lang.String):void");
    }

    public final void write(String str, String str2) {
        onGetStartedClick.write((Object) str, "amount");
        onGetStartedClick.write((Object) str2, "note");
        getKernelIDDstAtop getkerneliddstatop = this.MediaMetadataCompat;
        if (getkerneliddstatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_cashout_review");
        C4778ho hoVar = this.mPresenter;
        if (hoVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        onGetStartedClick.write((Object) str, "amount");
        onGetStartedClick.write((Object) str2, "note");
        if (hoVar.RatingCompat != null) {
            hoVar.RatingCompat.AlertController$RecycleListView();
        }
        getCustomAttributes getcustomattributes = hoVar.MediaMetadataCompat;
        if (getcustomattributes == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPrepaidTravelWalletSummaryDisplay");
        }
        String str3 = getcustomattributes.MediaBrowserCompat$ItemReceiver;
        AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application = hoVar.MediaBrowserCompat$SearchResultReceiver;
        if (autoValue_CrashlyticsReport_Session_Event_Application == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTravelWalletDisplay");
        }
        String str4 = autoValue_CrashlyticsReport_Session_Event_Application.IconCompatParcelizer;
        Double MediaBrowserCompat$ItemReceiver = getICheckDeserializerRtti.MediaBrowserCompat$ItemReceiver(str);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "Utilities.amountStringToDouble(amount)");
        double doubleValue = MediaBrowserCompat$ItemReceiver.doubleValue();
        StreetViewPanorama.OnStreetViewPanoramaLongClickListener onStreetViewPanoramaLongClickListener = hoVar.MediaSessionCompat$QueueItem;
        if (onStreetViewPanoramaLongClickListener == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("selectedToAccount");
        }
        String str5 = onStreetViewPanoramaLongClickListener.write;
        onGetStartedClick.IconCompatParcelizer((Object) str5, "selectedToAccount.accountNumber");
        ImmutableCollection.Builder builder = new ImmutableCollection.Builder(str3, str4, doubleValue, str5, str2);
        newArrayListWithCapacity newarraylistwithcapacity = hoVar.IconCompatParcelizer;
        FundFactSheetActivity mediaDescriptionCompat = new C4778ho.MediaDescriptionCompat(hoVar, str, str2);
        FundFactSheetActivity parcelableVolumeInfo = new C4778ho.ParcelableVolumeInfo(hoVar);
        onGetStartedClick.write((Object) mediaDescriptionCompat, "onSuccess");
        onGetStartedClick.write((Object) parcelableVolumeInfo, "onError");
        onGetStartedClick.write((Object) builder, "request");
        newarraylistwithcapacity.IconCompatParcelizer(newarraylistwithcapacity.IconCompatParcelizer, mediaDescriptionCompat, parcelableVolumeInfo, new systemNanoTime.write(builder));
    }

    public final void onDestroy() {
        C4778ho hoVar = this.mPresenter;
        if (hoVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        hoVar.onDestroy();
        super.onDestroy();
    }
}
