package com.scb.phone.view.activity.prepaid;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.prepaid.activation.PrepaidActivationLandingActivity;
import com.scb.phone.view.activity.prepaid.activation.PrepaidActivationLandingActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.prepaid.request.C5700x288f8104;
import com.scb.phone.view.activity.prepaid.request.PrepaidRequestMarketConductActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import java.util.HashMap;
import p040o.C4749hf;
import p040o.HmlPinActivity;
import p040o.LocalProjectProvider;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZHER2K;
import p040o.getKernelIDDstAtop;
import p040o.onGetStartedClick;
import p040o.setTapText;
import p040o.writeUInt64NoTag;

public final class PrepaidMenuActivity extends BaseActivity implements LocalProjectProvider.C69386.write {
    public static final C5694x7cae54ca MediaBrowserCompat$MediaItem = new C5694x7cae54ca((byte) 0);
    private HashMap MediaBrowserCompat$SearchResultReceiver;
    private getKernelIDDstAtop MediaDescriptionCompat;
    @HmlPinActivity
    public C4749hf presenter;

    private View write(int i) {
        if (this.MediaBrowserCompat$SearchResultReceiver == null) {
            this.MediaBrowserCompat$SearchResultReceiver = new HashMap();
        }
        View view = (View) this.MediaBrowserCompat$SearchResultReceiver.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.MediaBrowserCompat$SearchResultReceiver.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f79372131493162);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setStackedBackground();
        setTitle(R.string.prepaid_card);
        setTabContainer();
        this.MediaDescriptionCompat = new getKernelIDDstAtop();
        C4749hf hfVar = this.presenter;
        if (hfVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hfVar.MediaBrowserCompat$ItemReceiver(this);
        ((TextView) write(ZHER2K.write.btnRequestPrepaidCard)).setOnClickListener(new PrepaidMenuActivity$MediaBrowserCompat$ItemReceiver(this));
        ((TextView) write(ZHER2K.write.btnActivatePrepaidCard)).setOnClickListener(new IconCompatParcelizer(this));
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ PrepaidMenuActivity IconCompatParcelizer;

        IconCompatParcelizer(PrepaidMenuActivity prepaidMenuActivity) {
            this.IconCompatParcelizer = prepaidMenuActivity;
        }

        public final void onClick(View view) {
            C4749hf hfVar = this.IconCompatParcelizer.presenter;
            if (hfVar == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
            }
            writeUInt64NoTag.IconCompatParcelizer iconCompatParcelizer = C4749hf.write.MediaBrowserCompat$ItemReceiver;
            if (hfVar.RatingCompat != null) {
                iconCompatParcelizer.IconCompatParcelizer(hfVar.RatingCompat);
            }
        }
    }

    public final void write() {
        getKernelIDDstAtop getkerneliddstatop = this.MediaDescriptionCompat;
        if (getkerneliddstatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_request_prepaid_card");
        C5700x288f8104 prepaidRequestMarketConductActivity$MediaBrowserCompat$CustomActionResultReceiver = PrepaidRequestMarketConductActivity.MediaBrowserCompat$MediaItem;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, PrepaidRequestMarketConductActivity.class);
        intent.putExtra("EXTRA_PREPAID_IS_FROM_DEEP_LINK", false);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
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

    public final void read() {
        getKernelIDDstAtop getkerneliddstatop = this.MediaDescriptionCompat;
        if (getkerneliddstatop == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("mTracker");
        }
        getkerneliddstatop.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "planetscb_activate_prepaid_card");
        PrepaidActivationLandingActivity$MediaBrowserCompat$ItemReceiver prepaidActivationLandingActivity$MediaBrowserCompat$ItemReceiver = PrepaidActivationLandingActivity.MediaDescriptionCompat;
        Context context = this;
        onGetStartedClick.write((Object) context, "context");
        Intent intent = new Intent(context, PrepaidActivationLandingActivity.class);
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
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

    public final void onDestroy() {
        C4749hf hfVar = this.presenter;
        if (hfVar == null) {
            onGetStartedClick.MediaBrowserCompat$ItemReceiver("presenter");
        }
        hfVar.onDestroy();
        super.onDestroy();
    }
}
