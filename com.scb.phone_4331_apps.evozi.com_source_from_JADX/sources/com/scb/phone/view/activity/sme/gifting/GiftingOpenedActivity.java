package com.scb.phone.view.activity.sme.gifting;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.view.activity.landingpage.PartnerWebViewActivity;
import com.scb.phone.view.custom.common.DefaultButton;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import org.json.JSONObject;
import p040o.AlertController$RecycleListView;
import p040o.AutoValue_CrashlyticsReport_Session_User;
import p040o.C4793if;
import p040o.C5437u;
import p040o.CheckParameters_MembersInjector$MediaSessionCompat$QueueItem;
import p040o.DateFormatDayFormatter;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailSuccessfulActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.TitleFormatter;
import p040o.setCurrentSession;
import p040o.setListener;
import p040o.setTapText;
import p040o.startHoldParallelMessage;

public class GiftingOpenedActivity extends GiftingStatusBaseActivity implements CheckParameters_MembersInjector$MediaSessionCompat$QueueItem {
    @BindView
    TextView giftExtraInfo;
    @BindView
    TextView giftItemDescription;
    @BindView
    TextView giftName;
    @BindView
    TextView giftSenderMsg;
    @BindView
    TextView giftSenderName;
    @BindView
    DefaultButton grayButton;
    @HmlPinActivity
    public startHoldParallelMessage presenter;
    @BindView
    DefaultButton purpleButton;

    /* access modifiers changed from: protected */
    public final int MediaSessionCompat$ResultReceiverWrapper() {
        return R.layout.f79122131493137;
    }

    public static final /* synthetic */ void MediaBrowserCompat$ItemReceiver(Context context, Intent intent) {
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            ((GiftingOpenedActivity) context).startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
        MediaSessionCompat$Token();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(getString(R.string.gifting_receive_gift));
    }

    @OnClick
    public void goToHome(View view) {
        RatingCompat(false);
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setCurrentSession setcurrentsession) {
        Intent putExtra = new Intent(this, PartnerWebViewActivity.class).putExtra("com.scb.phone.EXTRA_DISPLAY", setcurrentsession);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, putExtra).read();
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

    /* access modifiers changed from: protected */
    public final void MediaBrowserCompat$CustomActionResultReceiver(AutoValue_CrashlyticsReport_Session_User autoValue_CrashlyticsReport_Session_User) {
        startHoldParallelMessage startholdparallelmessage = this.presenter;
        if (this.MediaBrowserCompat$MediaItem) {
            if (!TextUtils.isEmpty(autoValue_CrashlyticsReport_Session_User.read)) {
                if (startholdparallelmessage.RatingCompat != null) {
                    if (startholdparallelmessage.RatingCompat != null) {
                        startholdparallelmessage.RatingCompat.AlertController$RecycleListView();
                    }
                    if (!TextUtils.isEmpty(autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$ItemReceiver)) {
                        startholdparallelmessage.IconCompatParcelizer.IconCompatParcelizer(autoValue_CrashlyticsReport_Session_User.read, autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$ItemReceiver);
                        startholdparallelmessage.IconCompatParcelizer.IconCompatParcelizer(new setListener<T>.IconCompatParcelizer<HmlVerifyEmailSuccessfulActivity<JSONObject, JSONObject>>() {
                            public final /* synthetic */ void onNext(Object obj) {
                                setListener setlistener = setListener.this;
                                getCapturedMsg getcapturedmsg = new getCapturedMsg((HmlVerifyEmailSuccessfulActivity) obj);
                                boolean z = true;
                                if (setlistener.RatingCompat != null) {
                                    getcapturedmsg.IconCompatParcelizer(setlistener.RatingCompat);
                                }
                                setListener setlistener2 = setListener.this;
                                if (setlistener2.RatingCompat == null) {
                                    z = false;
                                }
                                if (z) {
                                    setlistener2.RatingCompat.aj_();
                                }
                            }
                        });
                    } else {
                        startholdparallelmessage.MediaBrowserCompat$ItemReceiver.write(autoValue_CrashlyticsReport_Session_User.read);
                        startholdparallelmessage.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new setListener<T>.IconCompatParcelizer<JSONObject>(autoValue_CrashlyticsReport_Session_User) {
                            private /* synthetic */ AutoValue_CrashlyticsReport_Session_User MediaBrowserCompat$CustomActionResultReceiver;

                            {
                                this.MediaBrowserCompat$CustomActionResultReceiver = r2;
                            }

                            public final /* synthetic */ void onNext(Object obj) {
                                setListener setlistener = setListener.this;
                                getInstructionMsg getinstructionmsg = new getInstructionMsg((JSONObject) obj, this.MediaBrowserCompat$CustomActionResultReceiver);
                                boolean z = true;
                                if (setlistener.RatingCompat != null) {
                                    getinstructionmsg.IconCompatParcelizer(setlistener.RatingCompat);
                                }
                                setListener setlistener2 = setListener.this;
                                if (setlistener2.RatingCompat == null) {
                                    z = false;
                                }
                                if (z) {
                                    setlistener2.RatingCompat.aj_();
                                }
                            }
                        });
                    }
                }
            } else {
                C5437u.C5439a aVar = new C5437u.C5439a(autoValue_CrashlyticsReport_Session_User);
                if (startholdparallelmessage.RatingCompat != null) {
                    aVar.IconCompatParcelizer(startholdparallelmessage.RatingCompat);
                }
            }
        } else if (!TextUtils.isEmpty(autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$ItemReceiver)) {
            startholdparallelmessage.read(autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$ItemReceiver);
        } else {
            C4793if ifVar = new C4793if(autoValue_CrashlyticsReport_Session_User);
            if (startholdparallelmessage.RatingCompat != null) {
                ifVar.IconCompatParcelizer(startholdparallelmessage.RatingCompat);
            }
        }
        this.giftSenderName.setText(autoValue_CrashlyticsReport_Session_User.ParcelableVolumeInfo);
        this.giftName.setText(getString(R.string.open_now_gift_msg, new Object[]{autoValue_CrashlyticsReport_Session_User.MediaDescriptionCompat}));
        this.giftSenderMsg.setText(autoValue_CrashlyticsReport_Session_User.MediaSessionCompat$ResultReceiverWrapper);
        if (autoValue_CrashlyticsReport_Session_User.f2682x50fd9e4a.equals("M")) {
            this.giftItemDescription.setText(autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$CustomActionResultReceiver);
            this.giftExtraInfo.setText(getString(R.string.gift_money_saved_msg));
            DefaultButton defaultButton = this.purpleButton;
            defaultButton.setText(getString(R.string.gift_send_thanks));
            defaultButton.setOnClickListener(new DateFormatDayFormatter(this, autoValue_CrashlyticsReport_Session_User));
            defaultButton.setVisibility(0);
            this.grayButton.setVisibility(8);
            return;
        }
        this.purpleButton.setText(getResources().getString(R.string.gift_see_item_details));
        this.purpleButton.setOnClickListener(new TitleFormatter(this, autoValue_CrashlyticsReport_Session_User));
        this.purpleButton.setVisibility(0);
        DefaultButton defaultButton2 = this.grayButton;
        defaultButton2.setText(getString(R.string.gift_send_thanks));
        defaultButton2.setOnClickListener(new DateFormatDayFormatter(this, autoValue_CrashlyticsReport_Session_User));
        defaultButton2.setVisibility(0);
        this.giftItemDescription.setText(autoValue_CrashlyticsReport_Session_User.MediaBrowserCompat$SearchResultReceiver);
        this.giftExtraInfo.setText(getString(R.string.gift_redeem_msg));
    }
}
