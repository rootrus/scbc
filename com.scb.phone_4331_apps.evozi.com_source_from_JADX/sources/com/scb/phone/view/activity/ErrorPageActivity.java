package com.scb.phone.view.activity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import com.scb.phone.R;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.PlaceAutocompleteFragment;
import p040o.forEachDstIn;
import p040o.onGetStartedClick;

public final class ErrorPageActivity extends BaseActivity {
    private static final String MediaBrowserCompat$MediaItem = "HEADER_ERROR_PAGE";
    private static final String MediaBrowserCompat$SearchResultReceiver = "ERROR_CODE";
    private static final String MediaDescriptionCompat = "MSG_ERROR_PAGE";
    private String MediaMetadataCompat = "";
    private final HmlVerifyEmailActivity MediaSessionCompat$ResultReceiverWrapper;
    private String MediaSessionCompat$Token = "";
    @BindView
    protected TextView tvErrorPageMsg;
    @BindView
    protected TextView tvErrorPageTile;

    public final void onBackPressed() {
    }

    public ErrorPageActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = IconCompatParcelizer.read;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaSessionCompat$ResultReceiverWrapper = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class read {
        public final String IconCompatParcelizer;
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        public final String MediaBrowserCompat$ItemReceiver;
        public final String MediaBrowserCompat$MediaItem;
        public final String MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public final String f3063x50fd9e4a;
        public final String MediaDescriptionCompat;
        public final String MediaMetadataCompat;
        public final String MediaSessionCompat$ResultReceiverWrapper;
        public final String MediaSessionCompat$Token;
        public final String ParcelableVolumeInfo;
        public final String RatingCompat;
        public final String read;
        public final String write;

        private read() {
        }

        public read(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14) {
            this.write = str;
            this.MediaBrowserCompat$CustomActionResultReceiver = str2;
            this.MediaDescriptionCompat = str3;
            this.MediaSessionCompat$ResultReceiverWrapper = str4;
            this.ParcelableVolumeInfo = str5;
            this.f3063x50fd9e4a = str6;
            this.MediaBrowserCompat$MediaItem = str7;
            this.MediaSessionCompat$Token = str8;
            this.IconCompatParcelizer = str9;
            this.MediaMetadataCompat = str10;
            this.MediaBrowserCompat$SearchResultReceiver = str11;
            this.RatingCompat = str12;
            this.MediaBrowserCompat$ItemReceiver = str13;
            this.read = str14;
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77752131493000);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        String stringExtra = getIntent().getStringExtra(MediaBrowserCompat$MediaItem);
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra, "intent.getStringExtra(HEADER_ERROR_PAGE)");
        this.MediaMetadataCompat = stringExtra;
        String stringExtra2 = getIntent().getStringExtra(MediaDescriptionCompat);
        onGetStartedClick.IconCompatParcelizer((Object) stringExtra2, "intent.getStringExtra(MSG_ERROR_PAGE)");
        this.MediaSessionCompat$Token = stringExtra2;
        TextView textView = this.tvErrorPageTile;
        if (textView == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvErrorPageTile");
        }
        textView.setText(this.MediaMetadataCompat);
        TextView textView2 = this.tvErrorPageMsg;
        if (textView2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("tvErrorPageMsg");
        }
        textView2.setText(this.MediaSessionCompat$Token);
        if (getIntent().hasExtra(MediaBrowserCompat$SearchResultReceiver)) {
            String stringExtra3 = getIntent().getStringExtra(MediaBrowserCompat$SearchResultReceiver);
            if (onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) PlaceAutocompleteFragment.PROFILE_IS_BLOCKED.code, (Object) stringExtra3) || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) PlaceAutocompleteFragment.DEVICE_IS_SWITCHED.code, (Object) stringExtra3) || onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) PlaceAutocompleteFragment.PROFILE_IS_UNSUBSCRIBE.code, (Object) stringExtra3)) {
                ((forEachDstIn) this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver()).read("status_code", stringExtra3);
                ((forEachDstIn) this.MediaSessionCompat$ResultReceiverWrapper.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "juristic_error_page");
            }
        }
    }

    @OnClick
    public final void goToPersonalButtonClick() {
        setShowingForActionMode();
    }

    public static final Intent IconCompatParcelizer(Context context, String str, String str2) {
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, ErrorPageActivity.class);
        intent.putExtra(MediaBrowserCompat$MediaItem, str);
        intent.putExtra(MediaDescriptionCompat, str2);
        return intent;
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<forEachDstIn> {
        public static final IconCompatParcelizer read = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new forEachDstIn();
        }
    }

    public static final Intent IconCompatParcelizer(Context context, String str, String str2, String str3) {
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, ErrorPageActivity.class);
        intent.putExtra(MediaBrowserCompat$SearchResultReceiver, str);
        intent.putExtra(MediaBrowserCompat$MediaItem, str2);
        intent.putExtra(MediaDescriptionCompat, str3);
        return intent;
    }
}
