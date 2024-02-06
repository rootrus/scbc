package com.scb.phone.view.activity.prepaid.request;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.productcatalog.ProductCatalogFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.HashMap;
import p040o.CheckEligibilityActivity;
import p040o.FundActionsSuccessActivity;
import p040o.FundFactSheetActivity;
import p040o.HmlPinActivity;
import p040o.HmlVerifyEmailActivity;
import p040o.HmlVerifyPhoneTermsConditionsActivity;
import p040o.IDataUnitProcessedListener;
import p040o.MyECouponActivity_ViewBinding;
import p040o.OnDeviceIdExtractor;
import p040o.ZHER2K;
import p040o.charBufferFromThreadLocal$MediaBrowserCompat$ItemReceiver;
import p040o.getKernelIDDstAtop;
import p040o.indexOfImpl;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.verifyReferral;
import p040o.writeUInt64NoTag;

public final class PrepaidRequestProductCatalogActivity extends BaseActivity implements OnDeviceIdExtractor.C69651.read, verifyReferral.write {
    public static final write MediaBrowserCompat$MediaItem = new write((byte) 0);
    private final HmlVerifyEmailActivity MediaBrowserCompat$SearchResultReceiver;
    private HashMap MediaMetadataCompat;
    @HmlPinActivity
    public IDataUnitProcessedListener presenter;

    public PrepaidRequestProductCatalogActivity() {
        FundActionsSuccessActivity fundActionsSuccessActivity = read.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.write((Object) fundActionsSuccessActivity, "initializer");
        this.MediaBrowserCompat$SearchResultReceiver = new HmlVerifyPhoneTermsConditionsActivity(fundActionsSuccessActivity);
    }

    public static final class write {
        private write() {
        }

        public /* synthetic */ write(byte b) {
            this();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79382131493163);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.prepaid_product_catalog_title);
        setTabContainer();
        IDataUnitProcessedListener iDataUnitProcessedListener = this.presenter;
        if (iDataUnitProcessedListener == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iDataUnitProcessedListener.MediaBrowserCompat$ItemReceiver(this);
        IDataUnitProcessedListener iDataUnitProcessedListener2 = this.presenter;
        if (iDataUnitProcessedListener2 == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (iDataUnitProcessedListener2.RatingCompat != null) {
            iDataUnitProcessedListener2.RatingCompat.AlertController$RecycleListView();
        }
        indexOfImpl indexofimpl = iDataUnitProcessedListener2.MediaBrowserCompat$ItemReceiver;
        FundFactSheetActivity iconCompatParcelizer = new IDataUnitProcessedListener.IconCompatParcelizer(iDataUnitProcessedListener2);
        FundFactSheetActivity write2 = new IDataUnitProcessedListener.write(iDataUnitProcessedListener2);
        onGetStartedClick.write((Object) iconCompatParcelizer, "onSuccess");
        onGetStartedClick.write((Object) write2, "onError");
        indexofimpl.IconCompatParcelizer(indexofimpl.IconCompatParcelizer, iconCompatParcelizer, write2, new charBufferFromThreadLocal$MediaBrowserCompat$ItemReceiver());
        int i = ZHER2K.write.btnNext;
        if (this.MediaMetadataCompat == null) {
            this.MediaMetadataCompat = new HashMap();
        }
        View view = (View) this.MediaMetadataCompat.get(Integer.valueOf(i));
        if (view == null) {
            view = findViewById(i);
            this.MediaMetadataCompat.put(Integer.valueOf(i), view);
        }
        ((Button) view).setOnClickListener(new IconCompatParcelizer(this));
        ((getKernelIDDstAtop) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_product_catalog");
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ PrepaidRequestProductCatalogActivity MediaBrowserCompat$ItemReceiver;

        IconCompatParcelizer(PrepaidRequestProductCatalogActivity prepaidRequestProductCatalogActivity) {
            this.MediaBrowserCompat$ItemReceiver = prepaidRequestProductCatalogActivity;
        }

        public final void onClick(View view) {
            IDataUnitProcessedListener iDataUnitProcessedListener = this.MediaBrowserCompat$ItemReceiver.presenter;
            if (iDataUnitProcessedListener == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = IDataUnitProcessedListener.read.MediaBrowserCompat$ItemReceiver;
            if (iDataUnitProcessedListener.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(iDataUnitProcessedListener.RatingCompat);
            }
        }
    }

    public final void read(String str) {
        onGetStartedClick.write((Object) str, "catalogUrl");
        ProductCatalogFragment.read read2 = ProductCatalogFragment.IconCompatParcelizer;
        onGetStartedClick.write((Object) str, "catalogUrl");
        ProductCatalogFragment productCatalogFragment = new ProductCatalogFragment();
        Bundle bundle = new Bundle();
        bundle.putString("ARGS_CATALOG_URL", str);
        productCatalogFragment.setArguments(bundle);
        getSupportFragmentManager().read().write(R.id.container, productCatalogFragment, (String) null).write();
    }

    public final void ay_() {
        IDataUnitProcessedListener iDataUnitProcessedListener = this.presenter;
        if (iDataUnitProcessedListener == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        if (iDataUnitProcessedListener.RatingCompat != null) {
            iDataUnitProcessedListener.RatingCompat.aj_();
        }
    }

    public final void onDestroy() {
        IDataUnitProcessedListener iDataUnitProcessedListener = this.presenter;
        if (iDataUnitProcessedListener == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        iDataUnitProcessedListener.onDestroy();
        super.onDestroy();
    }

    static final class read extends CheckEligibilityActivity implements FundActionsSuccessActivity<getKernelIDDstAtop> {
        public static final read MediaBrowserCompat$CustomActionResultReceiver = new read();

        read() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new getKernelIDDstAtop();
        }
    }

    public final void read() {
        ((getKernelIDDstAtop) this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver()).MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_next_product_catalog");
        C5698xe7b26873 prepaidRequestLandingActivity$MediaBrowserCompat$CustomActionResultReceiver = PrepaidRequestLandingActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, PrepaidRequestLandingActivity.class);
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
