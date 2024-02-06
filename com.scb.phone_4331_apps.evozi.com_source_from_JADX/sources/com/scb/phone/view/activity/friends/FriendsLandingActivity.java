package com.scb.phone.view.activity.friends;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import com.scb.phone.data.network.service.TopUpService;
import com.scb.phone.data.network.service.TouchPointService;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.landingpage.PartnerWebViewActivity;
import com.squareup.picasso.Picasso;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import kotlin.TypeCastException;
import p040o.AlertController$RecycleListView;
import p040o.C3567x79609cdc;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.FragmentBuilder_BindFundDetailSummaryFragment;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.LinkedHashMultimap;
import p040o.MyECouponActivity_ViewBinding;
import p040o.RegularImmutableMap;
import p040o.ZHPR2;
import p040o.ZHPR2$MediaBrowserCompat$ItemReceiver;
import p040o.ZSYR2K;
import p040o.getLastInNonemptyList$MediaBrowserCompat$ItemReceiver;
import p040o.getNativeSessionFiles;
import p040o.getOversizeImage;
import p040o.getPersonalNumber;
import p040o.onGetStartedClick;
import p040o.setCurrentSession;
import p040o.setOcrBufferSize;
import p040o.setOcrBufferSize$MediaBrowserCompat$CustomActionResultReceiver;
import p040o.setOcrBufferSize$MediaBrowserCompat$ItemReceiver;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class FriendsLandingActivity extends BaseActivity implements getPersonalNumber {
    @BindView
    public ImageView ivFriendHeader;
    @HmlPinActivity
    public setOcrBufferSize presenter;
    @BindView
    public TextView tvRefCode;
    @BindView
    public TextView tvTermCondition;

    @OnClick
    public final void onCopy() {
        setOcrBufferSize setocrbuffersize = this.presenter;
        if (setocrbuffersize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer read2 = new setOcrBufferSize.read(setocrbuffersize);
        if (setocrbuffersize.RatingCompat != null) {
            read2.IconCompatParcelizer(setocrbuffersize.RatingCompat);
        }
    }

    @OnClick
    public final void onShare() {
        setOcrBufferSize setocrbuffersize = this.presenter;
        if (setocrbuffersize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = new setOcrBufferSize.IconCompatParcelizer(setocrbuffersize);
        if (setocrbuffersize.RatingCompat != null) {
            iconCompatParcelizer.IconCompatParcelizer(setocrbuffersize.RatingCompat);
        }
    }

    @OnClick
    public final void openTermsAndConditions() {
        setOcrBufferSize setocrbuffersize = this.presenter;
        if (setocrbuffersize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        writeUInt64NoTag.IconCompatParcelizer setocrbuffersize_mediabrowsercompat_customactionresultreceiver = new setOcrBufferSize$MediaBrowserCompat$CustomActionResultReceiver(setocrbuffersize);
        if (setocrbuffersize.RatingCompat != null) {
            setocrbuffersize_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(setocrbuffersize.RatingCompat);
        }
    }

    public static final class read {
        public final TouchPointService IconCompatParcelizer;

        private read() {
        }

        @HmlPinActivity
        public read(TouchPointService touchPointService) {
            onGetStartedClick.write((Object) touchPointService, "service");
            this.IconCompatParcelizer = touchPointService;
        }
    }

    public static final class write {
        public TopUpService write;

        private write() {
        }

        @HmlPinActivity
        public write(TopUpService topUpService) {
            this.write = topUpService;
        }
    }

    public final void onCreate(Bundle bundle) {
        Activity activity = this;
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(activity);
        super.onCreate(bundle);
        setContentView(R.layout.f77972131493022);
        ButterKnife.MediaBrowserCompat$ItemReceiver(activity);
        setStackedBackground();
        setTabContainer();
        setTitle(R.string.invite_friends_title);
        TextView textView = this.tvTermCondition;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvTermCondition");
        }
        textView.setText(ZHPR2.MediaBrowserCompat$CustomActionResultReceiver("", getString(R.string.invite_friends_terms_and_cons), getResources(), (ZHPR2$MediaBrowserCompat$ItemReceiver) null, true, 0));
        boolean z = false;
        this.scbAnalytics.write("friends_get_friends_landing", new ZSYR2K[0]);
        setOcrBufferSize setocrbuffersize = this.presenter;
        if (setocrbuffersize == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        setocrbuffersize.MediaBrowserCompat$ItemReceiver(this);
        setOcrBufferSize setocrbuffersize2 = this.presenter;
        if (setocrbuffersize2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (setocrbuffersize2.RatingCompat != null) {
            z = true;
        }
        if (z) {
            setocrbuffersize2.RatingCompat.AlertController$RecycleListView();
        }
        LinkedHashMultimap.SetDecorator.C35661 r1 = setocrbuffersize2.read;
        FundFactSheetActivity write2 = new setOcrBufferSize.write(setocrbuffersize2);
        FundFactSheetActivity setocrbuffersize_mediabrowsercompat_itemreceiver = new setOcrBufferSize$MediaBrowserCompat$ItemReceiver(setocrbuffersize2);
        RegularImmutableMap.KeySet keySet = setocrbuffersize2.IconCompatParcelizer;
        onGetStartedClick.write((Object) write2, "onSuccess");
        onGetStartedClick.write((Object) setocrbuffersize_mediabrowsercompat_itemreceiver, "onError");
        onGetStartedClick.write((Object) keySet, "transform");
        r1.MediaBrowserCompat$ItemReceiver(r1.IconCompatParcelizer, write2, setocrbuffersize_mediabrowsercompat_itemreceiver, new getLastInNonemptyList$MediaBrowserCompat$ItemReceiver(), new C3567x79609cdc(keySet));
    }

    public final void read(getNativeSessionFiles getnativesessionfiles) {
        onGetStartedClick.write((Object) getnativesessionfiles, "display");
        TextView textView = this.tvRefCode;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvRefCode");
        }
        textView.setText(getnativesessionfiles.MediaBrowserCompat$CustomActionResultReceiver);
        FragmentBuilder_BindFundDetailSummaryFragment write2 = Picasso.read().write(getnativesessionfiles.IconCompatParcelizer);
        ImageView imageView = this.ivFriendHeader;
        if (imageView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivFriendHeader");
        }
        write2.read(imageView, (FragmentBuilder_BindEkycFragment) null);
        ImageView imageView2 = this.ivFriendHeader;
        if (imageView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivFriendHeader");
        }
        imageView2.post(new IconCompatParcelizer(this));
    }

    static final class IconCompatParcelizer implements Runnable {
        private /* synthetic */ FriendsLandingActivity write;

        IconCompatParcelizer(FriendsLandingActivity friendsLandingActivity) {
            this.write = friendsLandingActivity;
        }

        public final void run() {
            ImageView imageView = this.write.ivFriendHeader;
            if (imageView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivFriendHeader");
            }
            ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
            if (layoutParams instanceof LinearLayout.LayoutParams) {
                Resources resources = this.write.getResources();
                onGetStartedClick.IconCompatParcelizer((Object) resources, "resources");
                layoutParams.height = (int) (((double) resources.getDisplayMetrics().widthPixels) * 0.3875d);
            }
            ImageView imageView2 = this.write.ivFriendHeader;
            if (imageView2 == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("ivFriendHeader");
            }
            imageView2.setLayoutParams(layoutParams);
        }
    }

    public final void IconCompatParcelizer(String str) {
        onGetStartedClick.write((Object) str, "inviteText");
        Object systemService = getSystemService("clipboard");
        if (systemService != null) {
            ((ClipboardManager) systemService).setPrimaryClip(ClipData.newPlainText("FriendsGetFriends", str));
            write(this, R.id.root_view, getString(R.string.invite_friends_copied), getOversizeImage.SUCCESS);
            this.scbAnalytics.write("friends_get_friends_landing_button", new ZSYR2K("button", "copy"));
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.content.ClipboardManager");
    }

    public final void write(String str) {
        onGetStartedClick.write((Object) str, "shareText");
        Intent intent = new Intent();
        intent.setAction("android.intent.action.SEND");
        intent.putExtra("android.intent.extra.TEXT", str);
        intent.setType("text/plain");
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
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
        write("friends_get_friends_landing_button", new ZSYR2K("button", "share"));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setCurrentSession setcurrentsession) {
        onGetStartedClick.write((Object) setcurrentsession, "display");
        Intent intent = new Intent(this, PartnerWebViewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_DISPLAY", setcurrentsession);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read2 = setTapText.write(this, intent).read();
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
}
