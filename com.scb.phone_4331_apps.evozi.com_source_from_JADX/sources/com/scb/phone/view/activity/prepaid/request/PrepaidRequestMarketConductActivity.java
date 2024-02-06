package com.scb.phone.view.activity.prepaid.request;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.partner.SCBUniversalWebViewActivity;
import com.scb.phone.view.activity.prepaid.request.PrepaidRequestProductCatalogActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.HashMap;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.IExceptionResponseDeserializer;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZHER2K;
import p040o.getKernelIDDstAtop;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.tZ$MediaBrowserCompat$ItemReceiver;
import p040o.writeUInt64NoTag;

public final class PrepaidRequestMarketConductActivity extends BaseActivity implements tZ$MediaBrowserCompat$ItemReceiver {
    public static final C5700x288f8104 MediaBrowserCompat$MediaItem = new C5700x288f8104((byte) 0);
    private boolean MediaBrowserCompat$SearchResultReceiver;
    private final HmlVerifyEmailActivity MediaDescriptionCompat;
    private HashMap MediaMetadataCompat;
    @HmlPinActivity
    public IExceptionResponseDeserializer presenter;

    private View MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = new HashMap();
        }
        View view = (View) this.MediaMetadataCompat.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.MediaMetadataCompat.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public PrepaidRequestMarketConductActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = IconCompatParcelizer.IconCompatParcelizer;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaDescriptionCompat = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79362131493161);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.prepaid_market_conduct_title);
        setTabContainer();
        IExceptionResponseDeserializer iExceptionResponseDeserializer = this.presenter;
        if (iExceptionResponseDeserializer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iExceptionResponseDeserializer.MediaBrowserCompat$ItemReceiver(this);
        TextView textView = (TextView) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.tvScbLink);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "tvScbLink");
        textView.setText(Html.fromHtml(getString(R.string.prepaid_market_conduct_link_label)));
        ((TextView) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.tvScbLink)).setOnClickListener(new C5701xa03496d3(this));
        ((Button) MediaBrowserCompat$CustomActionResultReceiver(ZHER2K.write.btnReadProductCatalog)).setOnClickListener(new write(this));
        this.MediaBrowserCompat$SearchResultReceiver = getIntent().getBooleanExtra("EXTRA_PREPAID_IS_FROM_DEEP_LINK", false);
        ((getKernelIDDstAtop) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_market_conduct");
    }

    static final class write implements View.OnClickListener {
        private /* synthetic */ PrepaidRequestMarketConductActivity IconCompatParcelizer;

        write(PrepaidRequestMarketConductActivity prepaidRequestMarketConductActivity) {
            this.IconCompatParcelizer = prepaidRequestMarketConductActivity;
        }

        public final void onClick(View view) {
            IExceptionResponseDeserializer iExceptionResponseDeserializer = this.IconCompatParcelizer.presenter;
            if (iExceptionResponseDeserializer == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IExceptionResponseDeserializer.write.IconCompatParcelizer;
            if (iExceptionResponseDeserializer.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(iExceptionResponseDeserializer.RatingCompat);
            }
        }
    }

    public final void IconCompatParcelizer() {
        Intent MediaBrowserCompat$ItemReceiver = SCBUniversalWebViewActivity.MediaBrowserCompat$ItemReceiver((Context) this, getString(R.string.prepaid_market_conduct_link));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, MediaBrowserCompat$ItemReceiver).read();
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

    public final void write() {
        ((getKernelIDDstAtop) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver()).read("source", this.MediaBrowserCompat$SearchResultReceiver ? "planetscb_deeplink" : "planetscb_tile");
        ((getKernelIDDstAtop) this.MediaDescriptionCompat.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_read_product_catalog");
        PrepaidRequestProductCatalogActivity.write write2 = PrepaidRequestProductCatalogActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, PrepaidRequestProductCatalogActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public final void onDestroy() {
        IExceptionResponseDeserializer iExceptionResponseDeserializer = this.presenter;
        if (iExceptionResponseDeserializer == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iExceptionResponseDeserializer.onDestroy();
        super.onDestroy();
    }

    static final class IconCompatParcelizer extends CheckEligibilityActivity implements FundActionsSuccessActivity<getKernelIDDstAtop> {
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer();

        IconCompatParcelizer() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new getKernelIDDstAtop();
        }
    }
}
