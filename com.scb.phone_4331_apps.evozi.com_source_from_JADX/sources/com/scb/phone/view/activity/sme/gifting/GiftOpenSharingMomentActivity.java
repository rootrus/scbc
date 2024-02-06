package com.scb.phone.view.activity.sme.gifting;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.google.android.material.textfield.TextInputEditText;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.adapter.sme.gifting.GifShareMomentBackgroundAdapter;
import com.scb.phone.view.fragment.sme.gifting.GiftSharingMomentPreviewFragment;
import com.squareup.picasso.Picasso;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.io.File;
import java.io.IOException;
import org.jmrtd.lds.ImageInfo;
import p040o.AlertController$RecycleListView;
import p040o.ArrayWeekDayFormatter;
import p040o.AutoValue_CrashlyticsReport_Session_User;
import p040o.BankingServicesDeepLinkActivity;
import p040o.BulkTransferDeepLinkActivity;
import p040o.C10002hP;
import p040o.C4731hO;
import p040o.C5164qI;
import p040o.CheckParameters_MembersInjector$MediaBrowserCompat$MediaItem;
import p040o.CrashlyticsReport;
import p040o.DayFormatter;
import p040o.DebitCardResetOtpActivity;
import p040o.ForwardingListenableFuture;
import p040o.FragmentBuilder_BindDirectDebitTermsAndConditionsFragment;
import p040o.FragmentBuilder_BindEBillSelectedFragment;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFixedTransferInputFormFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.HmlETBLandingActivity;
import p040o.HmlPinActivity;
import p040o.MonthArrayTitleFormatter;
import p040o.MyECouponActivity_ViewBinding;
import p040o.WeekPagerAdapter;
import p040o.onCheckBoxClick;
import p040o.onStart;
import p040o.setChildDrawingOrderCallback;
import p040o.setLastBaselineToBottomHeight;
import p040o.setTapText;
import p040o.setZoomInMsg;
import p040o.setZoomInMsg$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.toIntArray;
import p040o.withEvents;

public class GiftOpenSharingMomentActivity extends BaseActivity implements CheckParameters_MembersInjector$MediaBrowserCompat$MediaItem, GifShareMomentBackgroundAdapter.read {
    private BulkTransferDeepLinkActivity MediaBrowserCompat$SearchResultReceiver;
    @BindView
    ImageView backgroundImage;
    @BindView
    public TextInputEditText backgroundMsg;
    @BindView
    View buttonsArea;
    @BindView
    View fragmentContainer;
    @BindView
    public TextView giftTapToEditHint;
    @BindView
    RecyclerView gridColorsRecyclerView;
    @HmlPinActivity
    public setZoomInMsg presenter;
    @BindView
    View shareMomentArea;
    @BindView
    View toolbar;

    public class SharedMoment_ViewBinding implements Unbinder {
        private SharedMoment write;

        public SharedMoment_ViewBinding(SharedMoment sharedMoment, View view) {
            this.write = sharedMoment;
            sharedMoment.momentPreviewMsg = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_share_moment_preview_msg, "field 'momentPreviewMsg'", TextView.class);
            sharedMoment.momentPreviewImg = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.gift_share_moment_preview_img, "field 'momentPreviewImg'", ImageView.class);
        }

        public final void read() {
            SharedMoment sharedMoment = this.write;
            if (sharedMoment != null) {
                this.write = null;
                sharedMoment.momentPreviewMsg = null;
                sharedMoment.momentPreviewImg = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f79932131493218);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.gift_send_thanks));
        this.MediaBrowserCompat$SearchResultReceiver = setChildDrawingOrderCallback.IconCompatParcelizer(this, new IntentFilter("com.scb.phone/BROADCAST_CLOSE_SHARING_MOMENT_GIFT_PREVIEW")).subscribe(new WeekPagerAdapter.Weekly(this), DayFormatter.read);
        this.gridColorsRecyclerView.setLayoutManager(new GridLayoutManager(this, 4));
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        this.backgroundMsg.setOnTouchListener(new ArrayWeekDayFormatter(this));
        setZoomInMsg setzoominmsg = this.presenter;
        AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User = (AutoValue_CrashlyticsReport_Session_User) getIntent().getParcelableExtra("EXTRA_GIFT_STATUS_SELECTED");
        boolean z = true;
        if (setzoominmsg.RatingCompat != null) {
            setzoominmsg.IconCompatParcelizer = autoValue_CrashlyticsReport_Session_User;
            if (setzoominmsg.RatingCompat != null) {
                setzoominmsg.RatingCompat.AlertController$RecycleListView();
            }
            setzoominmsg.write.MediaBrowserCompat$CustomActionResultReceiver();
            setzoominmsg.write.IconCompatParcelizer(new setZoomInMsg$MediaBrowserCompat$CustomActionResultReceiver(setzoominmsg, (byte) 0));
        }
        setZoomInMsg setzoominmsg2 = this.presenter;
        AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User2 = setzoominmsg2.IconCompatParcelizer;
        if (autoValue_CrashlyticsReport_Session_User2 != null && autoValue_CrashlyticsReport_Session_User2.f2682x50fd9e4a != null) {
            if (setzoominmsg2.IconCompatParcelizer.f2682x50fd9e4a.equals("M")) {
                str = "money";
            } else {
                str = setzoominmsg2.IconCompatParcelizer.f2682x50fd9e4a.equals("P") ? "present" : "";
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(setzoominmsg2.IconCompatParcelizer.MediaBrowserCompat$MediaItem)) {
                C4731hO hOVar = new C4731hO(setzoominmsg2, str);
                if (setzoominmsg2.RatingCompat == null) {
                    z = false;
                }
                if (z) {
                    hOVar.IconCompatParcelizer(setzoominmsg2.RatingCompat);
                }
            }
        }
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.gift_send_thanks));
    }

    public void onDestroy() {
        BulkTransferDeepLinkActivity bulkTransferDeepLinkActivity = this.MediaBrowserCompat$SearchResultReceiver;
        if (bulkTransferDeepLinkActivity != null && !bulkTransferDeepLinkActivity.isDisposed()) {
            this.MediaBrowserCompat$SearchResultReceiver.dispose();
        }
        this.presenter.onDestroy();
        super.onDestroy();
    }

    private void IconCompatParcelizer(final withEvents withevents) {
        AlertController$RecycleListView();
        FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(withevents.IconCompatParcelizer);
        write.write = true;
        FragmentBuilder_BindFixedTransferInputFormFragment.read read = write.MediaBrowserCompat$CustomActionResultReceiver;
        if (!read.IconCompatParcelizer) {
            read.MediaBrowserCompat$ItemReceiver = true;
            write.read(this.backgroundImage, new FragmentBuilder_BindEkycFragment() {
                public final void MediaBrowserCompat$ItemReceiver() {
                    FragmentBuilder_BindFundDetailSummaryFragment write = Picasso.read().write(withevents.write);
                    write.write = true;
                    FragmentBuilder_BindFixedTransferInputFormFragment.read read = write.MediaBrowserCompat$CustomActionResultReceiver;
                    if (!read.IconCompatParcelizer) {
                        read.MediaBrowserCompat$ItemReceiver = true;
                        write.write(GiftOpenSharingMomentActivity.this.backgroundImage.getDrawable()).read(GiftOpenSharingMomentActivity.this.backgroundImage, (FragmentBuilder_BindEkycFragment) null);
                        GiftOpenSharingMomentActivity.this.aj_();
                        return;
                    }
                    throw new IllegalStateException("Center inside can not be used after calling centerCrop");
                }

                public final void MediaBrowserCompat$CustomActionResultReceiver(Exception exc) {
                    GiftOpenSharingMomentActivity.this.aj_();
                }
            });
            return;
        }
        throw new IllegalStateException("Center inside can not be used after calling centerCrop");
    }

    public final void MediaBrowserCompat$ItemReceiver(withEvents withevents) {
        setZoomInMsg setzoominmsg = this.presenter;
        toIntArray tointarray = setzoominmsg.MediaMetadataCompat;
        AutoValue_CrashlyticsReport_Session_User.Builder read = AutoValue_CrashlyticsReport_Session_User.Builder.read(R.layout.f91502131494377, "gifting_sharing_moment");
        read.read = tointarray.mo26549c_(withevents.write);
        read.IconCompatParcelizer = withevents.MediaBrowserCompat$CustomActionResultReceiver;
        setzoominmsg.read = read;
        IconCompatParcelizer(withevents);
        int read2 = setLastBaselineToBottomHeight.read(this, withevents.MediaBrowserCompat$CustomActionResultReceiver);
        this.giftTapToEditHint.setTextColor(read2);
        this.backgroundMsg.setTextColor(read2);
        this.backgroundMsg.setFocusable(false);
        this.backgroundMsg.setCursorVisible(false);
        this.giftTapToEditHint.setVisibility(0);
    }

    public void onBackPressed() {
        FragmentManager fragmentManager = getFragmentManager();
        if (fragmentManager.getBackStackEntryCount() > 0) {
            fragmentManager.popBackStack();
            m3010x50fd9e4a();
            return;
        }
        super.onBackPressed();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    private void m3010x50fd9e4a() {
        this.buttonsArea.setVisibility(0);
        this.shareMomentArea.setVisibility(0);
        this.toolbar.setVisibility(0);
        this.fragmentContainer.setVisibility(8);
    }

    @OnClick
    public void previewButton() {
        String str;
        this.presenter.read.RatingCompat = this.backgroundMsg.getText().toString();
        AutoValue_CrashlyticsReport_Session_User.Builder builder = this.presenter.read;
        setZoomInMsg setzoominmsg = this.presenter;
        AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User = setzoominmsg.IconCompatParcelizer;
        if (!(autoValue_CrashlyticsReport_Session_User == null || autoValue_CrashlyticsReport_Session_User.f2682x50fd9e4a == null)) {
            if (setzoominmsg.IconCompatParcelizer.f2682x50fd9e4a.equals("M")) {
                str = "money";
            } else {
                str = setzoominmsg.IconCompatParcelizer.f2682x50fd9e4a.equals("P") ? "present" : "";
            }
            if (!TextUtils.isEmpty(str) && !TextUtils.isEmpty(setzoominmsg.IconCompatParcelizer.MediaBrowserCompat$MediaItem)) {
                C10002hP hPVar = new C10002hP(setzoominmsg, str);
                if (setzoominmsg.RatingCompat != null) {
                    hPVar.IconCompatParcelizer(setzoominmsg.RatingCompat);
                }
            }
        }
        this.buttonsArea.setVisibility(8);
        this.shareMomentArea.setVisibility(8);
        this.toolbar.setVisibility(8);
        this.fragmentContainer.setVisibility(0);
        FragmentTransaction beginTransaction = getFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.container, GiftSharingMomentPreviewFragment.MediaBrowserCompat$ItemReceiver(builder), "SHARING_MOMENT_PREVIEW_FRAGMENT");
        beginTransaction.addToBackStack("SHARING_MOMENT_PREVIEW_FRAGMENT");
        beginTransaction.commit();
    }

    @OnClick
    public void shareGiftMoment() {
        this.presenter.read.RatingCompat = this.backgroundMsg.getText().toString();
        MonthArrayTitleFormatter.MediaBrowserCompat$CustomActionResultReceiver(this);
    }

    public static void MediaSessionCompat$ResultReceiverWrapper() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onPermissionDenied", new Object[0]);
    }

    public static void MediaSessionCompat$QueueItem() {
        onCheckBoxClick.MediaBrowserCompat$ItemReceiver("onNeverAskAgain", new Object[0]);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        super.onRequestPermissionsResult(i, strArr, iArr);
        MonthArrayTitleFormatter.MediaBrowserCompat$CustomActionResultReceiver(this, i, iArr);
    }

    public final void MediaSessionCompat$Token() {
        String str;
        setZoomInMsg setzoominmsg = this.presenter;
        AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User = setzoominmsg.IconCompatParcelizer;
        if (!(autoValue_CrashlyticsReport_Session_User == null || autoValue_CrashlyticsReport_Session_User.f2682x50fd9e4a == null)) {
            String str2 = "";
            if (setzoominmsg.IconCompatParcelizer.f2682x50fd9e4a.equals("M")) {
                str = "money";
            } else {
                str = setzoominmsg.IconCompatParcelizer.f2682x50fd9e4a.equals("P") ? "present" : str2;
            }
            CrashlyticsReport crashlyticsReport = setzoominmsg.MediaBrowserCompat$ItemReceiver;
            if (!(crashlyticsReport == null || crashlyticsReport.IconCompatParcelizer == null)) {
                str2 = setzoominmsg.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer.read;
            }
            if (!TextUtils.isEmpty(str2) && !TextUtils.isEmpty(setzoominmsg.IconCompatParcelizer.MediaBrowserCompat$MediaItem)) {
                C5164qI qIVar = new C5164qI(setzoominmsg, str, str2);
                if (setzoominmsg.RatingCompat != null) {
                    qIVar.IconCompatParcelizer(setzoominmsg.RatingCompat);
                }
            }
        }
        DebitCardResetOtpActivity.fromCallable(new FragmentBuilder_BindDirectDebitTermsAndConditionsFragment(new SharedMoment(this), this.presenter.read, this)).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribeOn(HmlETBLandingActivity.IconCompatParcelizer()).subscribeOn(HmlETBLandingActivity.MediaBrowserCompat$ItemReceiver()).observeOn(BankingServicesDeepLinkActivity.MediaBrowserCompat$ItemReceiver()).subscribe(new setZoomInMsg.read(this.presenter, (byte) 0));
    }

    public final void read(Uri uri) {
        Intent intent = new Intent("android.intent.action.SEND");
        intent.setType(ImageInfo.JPEG_MIME_TYPE);
        intent.addFlags(1);
        intent.putExtra("android.intent.extra.STREAM", uri);
        Intent createChooser = Intent.createChooser(intent, getString(R.string.share));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, createChooser).read();
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

    public class SharedMoment extends FragmentBuilder_BindEBillSelectedFragment<AutoValue_CrashlyticsReport_Session_User.Builder> {
        @BindView
        ImageView momentPreviewImg;
        @BindView
        TextView momentPreviewMsg;
        private Context write;

        public final /* synthetic */ void write(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, View view) {
            AutoValue_CrashlyticsReport_Session_User.Builder builder = (AutoValue_CrashlyticsReport_Session_User.Builder) simpleForwardingListenableFuture;
            ButterKnife.IconCompatParcelizer(this, view);
            Context context = this.write;
            StringBuilder sb = new StringBuilder();
            sb.append(builder.read());
            sb.append(".jpg");
            String obj = sb.toString();
            File file = new File(Environment.getExternalStorageDirectory(), AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(context));
            if (file.exists()) {
                if (obj != null) {
                    obj = obj.replaceAll(":", ".");
                }
                File file2 = new File(file, obj);
                if (file2.exists()) {
                    file2.delete();
                }
            }
            try {
                this.momentPreviewImg.setImageBitmap(Picasso.read().write(builder.read).MediaBrowserCompat$CustomActionResultReceiver());
            } catch (IOException e) {
                Log.e("SharedMoment", "bind: ", e);
            }
            this.momentPreviewMsg.setText(builder.RatingCompat);
            this.momentPreviewMsg.setTextColor(setLastBaselineToBottomHeight.read(this.write, builder.IconCompatParcelizer));
        }

        public SharedMoment(Context context) {
            this.write = context;
        }
    }

    public static /* synthetic */ void write(GiftOpenSharingMomentActivity giftOpenSharingMomentActivity) {
        giftOpenSharingMomentActivity.getFragmentManager().popBackStackImmediate();
        giftOpenSharingMomentActivity.m3010x50fd9e4a();
    }

    public final void IconCompatParcelizer(CrashlyticsReport crashlyticsReport) {
        withEvents withevents = crashlyticsReport.IconCompatParcelizer;
        IconCompatParcelizer(withevents);
        int read = setLastBaselineToBottomHeight.read(this, withevents.MediaBrowserCompat$CustomActionResultReceiver);
        this.giftTapToEditHint.setTextColor(read);
        this.backgroundMsg.setTextColor(read);
        this.giftTapToEditHint.setTextColor(setLastBaselineToBottomHeight.read(this, withevents.MediaBrowserCompat$CustomActionResultReceiver));
        this.giftTapToEditHint.setVisibility(0);
        this.backgroundMsg.setText(crashlyticsReport.write);
        this.gridColorsRecyclerView.setAdapter(new GifShareMomentBackgroundAdapter(crashlyticsReport.MediaBrowserCompat$CustomActionResultReceiver, this));
    }
}
