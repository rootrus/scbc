package com.scb.phone.view.activity.prepaid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prepaid.detail.PrepaidTravelConversionLandingActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import p040o.AutoValue_CrashlyticsReport_Session_Event;
import p040o.AutoValue_CrashlyticsReport_Session_Event_Application;
import p040o.C4771hk;
import p040o.FundFactSheetActivity;
import p040o.FundOnboardingSuccessActivity;
import p040o.HmlPinActivity;
import p040o.ImmutableEnumSet;
import p040o.LocalProjectProvider;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZHER2K;
import p040o.access$700$MediaBrowserCompat$ItemReceiver;
import p040o.construct;
import p040o.getCustomAttributes;
import p040o.getKernelIDDstAtop;
import p040o.hk$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.hk$MediaBrowserCompat$ItemReceiver;
import p040o.hk$MediaBrowserCompat$SearchResultReceiver;
import p040o.newLinkedList;
import p040o.onGetStartedClick;
import p040o.setArch;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class PrepaidTravelForeignCurrencyWalletDetailActivity extends BaseActivity implements LocalProjectProvider.C6939a.read {
    public static final IconCompatParcelizer MediaMetadataCompat = new IconCompatParcelizer((byte) 0);
    private HashMap MediaBrowserCompat$MediaItem;
    private AutoValue_CrashlyticsReport_Session_Event_Application MediaBrowserCompat$SearchResultReceiver;
    private getKernelIDDstAtop MediaDescriptionCompat;
    private getCustomAttributes MediaSessionCompat$ResultReceiverWrapper;
    private ArrayList<String> MediaSessionCompat$Token;
    @BindView
    public Button mBtnBuy;
    @BindView
    public Button mBtnSell;
    @HmlPinActivity
    public C4771hk mPresenter;
    @BindView
    public TextView mTxtVwAmount;
    @BindView
    public TextView mTxtVwBuyingRate;
    @BindView
    public TextView mTxtVwCurrencyCode;
    @BindView
    public TextView mTxtVwRemainingConversionLimit;
    @BindView
    public TextView mTxtVwSellingRate;

    private View MediaBrowserCompat$ItemReceiver(int i) {
        if (this.MediaBrowserCompat$MediaItem == null) {
            this.MediaBrowserCompat$MediaItem = new HashMap();
        }
        View view = (View) this.MediaBrowserCompat$MediaItem.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.MediaBrowserCompat$MediaItem.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static Intent read(Context context, AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application, getCustomAttributes getcustomattributes, ArrayList<String> arrayList) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application, "prepaidTravelWalletDisplay");
            onGetStartedClick.write((Object) getcustomattributes, "walletSummaryDisplay");
            onGetStartedClick.write((Object) arrayList, "thbWalletAllowTag");
            Intent intent = new Intent(context, PrepaidTravelForeignCurrencyWalletDetailActivity.class);
            intent.putExtra("EXTRA_PREPAID_TRAVEL_FOREIGN_CURRENCY_WALLET_DISPLAY", autoValue_CrashlyticsReport_Session_Event_Application);
            intent.putExtra("EXTRA_PREPAID_TRAVEL_FOREIGN_CURRENCY_WALLET_SUMMARY_DISPLAY", getcustomattributes);
            intent.putExtra("EXTRA_PREPAID_TRAVEL_FOREIGN_CURRENCY_WALLET_THB_WALLET_ALLOW_TAG", arrayList);
            return intent;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79402131493165);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        C4771hk hkVar = this.mPresenter;
        if (hkVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        hkVar.MediaBrowserCompat$ItemReceiver(this);
        this.MediaDescriptionCompat = new getKernelIDDstAtop();
        setStackedBackground();
        setTabContainer();
        Parcelable parcelableExtra = getIntent().getParcelableExtra("EXTRA_PREPAID_TRAVEL_FOREIGN_CURRENCY_WALLET_DISPLAY");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra, "intent.getParcelableExtr…_CURRENCY_WALLET_DISPLAY)");
        this.MediaBrowserCompat$SearchResultReceiver = (AutoValue_CrashlyticsReport_Session_Event_Application) parcelableExtra;
        Parcelable parcelableExtra2 = getIntent().getParcelableExtra("EXTRA_PREPAID_TRAVEL_FOREIGN_CURRENCY_WALLET_SUMMARY_DISPLAY");
        onGetStartedClick.IconCompatParcelizer((Object) parcelableExtra2, "intent.getParcelableExtr…Y_WALLET_SUMMARY_DISPLAY)");
        this.MediaSessionCompat$ResultReceiverWrapper = (getCustomAttributes) parcelableExtra2;
        ArrayList<String> stringArrayListExtra = getIntent().getStringArrayListExtra("EXTRA_PREPAID_TRAVEL_FOREIGN_CURRENCY_WALLET_THB_WALLET_ALLOW_TAG");
        onGetStartedClick.IconCompatParcelizer((Object) stringArrayListExtra, "intent\n                .…LET_THB_WALLET_ALLOW_TAG)");
        this.MediaSessionCompat$Token = stringArrayListExtra;
        C4771hk hkVar2 = this.mPresenter;
        if (hkVar2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application = this.MediaBrowserCompat$SearchResultReceiver;
        if (autoValue_CrashlyticsReport_Session_Event_Application == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("prepaidTravelWalletDisplay");
        }
        getCustomAttributes getcustomattributes = this.MediaSessionCompat$ResultReceiverWrapper;
        if (getcustomattributes == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("walletSummaryDisplay");
        }
        ArrayList<String> arrayList = this.MediaSessionCompat$Token;
        if (arrayList == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("thbWalletAllowTag");
        }
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application, "prepaidTravelWalletDisplay");
        onGetStartedClick.write((Object) getcustomattributes, "prepaidTravelWalletSummaryDisplay");
        onGetStartedClick.write((Object) arrayList, "thbWalletAllowTag");
        hkVar2.read = autoValue_CrashlyticsReport_Session_Event_Application;
        hkVar2.IconCompatParcelizer = getcustomattributes;
        writeUInt64NoTag.IconCompatParcelizer hk_mediabrowsercompat_itemreceiver = new hk$MediaBrowserCompat$ItemReceiver(hkVar2, getcustomattributes);
        boolean z = true;
        if (hkVar2.RatingCompat != null) {
            hk_mediabrowsercompat_itemreceiver.IconCompatParcelizer(hkVar2.RatingCompat);
        }
        if (hkVar2.RatingCompat != null) {
            hkVar2.RatingCompat.AlertController$RecycleListView();
        }
        writeUInt64NoTag.IconCompatParcelizer ratingCompat = new C4771hk.RatingCompat(hkVar2, arrayList);
        if (hkVar2.RatingCompat == null) {
            z = false;
        }
        if (z) {
            ratingCompat.IconCompatParcelizer(hkVar2.RatingCompat);
        }
        newLinkedList newlinkedlist = hkVar2.write;
        FundFactSheetActivity hk_mediabrowsercompat_searchresultreceiver = new hk$MediaBrowserCompat$SearchResultReceiver(hkVar2);
        FundFactSheetActivity mediaMetadataCompat = new C4771hk.MediaMetadataCompat(hkVar2);
        ImmutableEnumSet.EnumSerializedForm enumSerializedForm = new ImmutableEnumSet.EnumSerializedForm(autoValue_CrashlyticsReport_Session_Event_Application.IconCompatParcelizer, "THB");
        onGetStartedClick.write((Object) hk_mediabrowsercompat_searchresultreceiver, "onSuccess");
        onGetStartedClick.write((Object) mediaMetadataCompat, "onError");
        onGetStartedClick.write((Object) enumSerializedForm, "request");
        newlinkedlist.IconCompatParcelizer(newlinkedlist.IconCompatParcelizer, hk_mediabrowsercompat_searchresultreceiver, mediaMetadataCompat, new access$700$MediaBrowserCompat$ItemReceiver(enumSerializedForm));
        getKernelIDDstAtop getkerneliddstatop = this.MediaDescriptionCompat;
        if (getkerneliddstatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_conversion_landing_screen");
    }

    public final void write(setArch setarch) {
        onGetStartedClick.write((Object) setarch, "displayRateSummaryDisplay");
        TextView textView = this.mTxtVwBuyingRate;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTxtVwBuyingRate");
        }
        textView.setText(setarch.read);
        TextView textView2 = this.mTxtVwSellingRate;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTxtVwSellingRate");
        }
        textView2.setText(setarch.IconCompatParcelizer);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
        Button button = this.mBtnSell;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mBtnSell");
        }
        button.setEnabled(z);
    }

    public final void MediaBrowserCompat$ItemReceiver(boolean z) {
        Button button = this.mBtnBuy;
        if (button == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mBtnBuy");
        }
        button.setEnabled(z);
    }

    public final void write() {
        View MediaBrowserCompat$ItemReceiver = MediaBrowserCompat$ItemReceiver(ZHER2K.write.viewCustomError);
        onGetStartedClick.IconCompatParcelizer((Object) MediaBrowserCompat$ItemReceiver, "viewCustomError");
        MediaBrowserCompat$ItemReceiver.setVisibility(0);
        LinearLayout linearLayout = (LinearLayout) MediaBrowserCompat$ItemReceiver(ZHER2K.write.layoutFcyRate);
        onGetStartedClick.IconCompatParcelizer((Object) linearLayout, "layoutFcyRate");
        linearLayout.setVisibility(8);
    }

    @OnClick
    public final void onSellButtonClick() {
        C4771hk hkVar = this.mPresenter;
        if (hkVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer hk_mediabrowsercompat_customactionresultreceiver = new hk$MediaBrowserCompat$CustomActionResultReceiver(hkVar);
        if (hkVar.RatingCompat != null) {
            hk_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(hkVar.RatingCompat);
        }
    }

    @OnClick
    public final void onBuyButtonClick() {
        C4771hk hkVar = this.mPresenter;
        if (hkVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new C4771hk.IconCompatParcelizer(hkVar);
        if (hkVar.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(hkVar.RatingCompat);
        }
    }

    public final void read(construct construct) {
        onGetStartedClick.write((Object) construct, "prepaidTravelConversionLandingRequest");
        getKernelIDDstAtop getkerneliddstatop = this.MediaDescriptionCompat;
        if (getkerneliddstatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_sell_conversion");
        PrepaidTravelConversionLandingActivity.IconCompatParcelizer iconCompatParcelizer = PrepaidTravelConversionLandingActivity.MediaBrowserCompat$MediaItem;
        Intent IconCompatParcelizer2 = PrepaidTravelConversionLandingActivity.IconCompatParcelizer.IconCompatParcelizer(this, construct);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 1000);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void write(construct construct) {
        onGetStartedClick.write((Object) construct, "prepaidTravelConversionLandingRequest");
        getKernelIDDstAtop getkerneliddstatop = this.MediaDescriptionCompat;
        if (getkerneliddstatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_buy_conversion");
        PrepaidTravelConversionLandingActivity.IconCompatParcelizer iconCompatParcelizer = PrepaidTravelConversionLandingActivity.MediaBrowserCompat$MediaItem;
        Intent IconCompatParcelizer2 = PrepaidTravelConversionLandingActivity.IconCompatParcelizer.IconCompatParcelizer(this, construct);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, IconCompatParcelizer2).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 1000);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 1000) {
            finish();
        }
    }

    public final void onDestroy() {
        C4771hk hkVar = this.mPresenter;
        if (hkVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mPresenter");
        }
        hkVar.onDestroy();
        super.onDestroy();
    }

    public final void MediaBrowserCompat$ItemReceiver(AutoValue_CrashlyticsReport_Session_Event_Application autoValue_CrashlyticsReport_Session_Event_Application, AutoValue_CrashlyticsReport_Session_Event autoValue_CrashlyticsReport_Session_Event) {
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event_Application, "prepaidTravelWalletDisplay");
        onGetStartedClick.write((Object) autoValue_CrashlyticsReport_Session_Event, "travelCardDisplay");
        MediaSessionCompat$QueueItem(autoValue_CrashlyticsReport_Session_Event_Application.write);
        TextView textView = this.mTxtVwAmount;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTxtVwAmount");
        }
        textView.setText(autoValue_CrashlyticsReport_Session_Event_Application.read);
        TextView textView2 = this.mTxtVwCurrencyCode;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTxtVwCurrencyCode");
        }
        textView2.setText(autoValue_CrashlyticsReport_Session_Event_Application.IconCompatParcelizer);
        TextView textView3 = this.mTxtVwRemainingConversionLimit;
        if (textView3 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTxtVwRemainingConversionLimit");
        }
        FundOnboardingSuccessActivity fundOnboardingSuccessActivity = FundOnboardingSuccessActivity.IconCompatParcelizer;
        String string = getString(R.string.prepaid_wallet_detail_remaining_conversion_limit_today);
        onGetStartedClick.IconCompatParcelizer((Object) string, "getString(R.string.prepa…g_conversion_limit_today)");
        String format = String.format(string, Arrays.copyOf(new Object[]{autoValue_CrashlyticsReport_Session_Event.MediaBrowserCompat$CustomActionResultReceiver}, 1));
        onGetStartedClick.IconCompatParcelizer((Object) format, "java.lang.String.format(format, *args)");
        textView3.setText(format);
    }
}
