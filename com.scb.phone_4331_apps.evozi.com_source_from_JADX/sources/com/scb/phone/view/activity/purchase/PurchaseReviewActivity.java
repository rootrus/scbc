package com.scb.phone.view.activity.purchase;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.scb.phone.R;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.C10178z;
import p040o.HmlPinActivity;
import p040o.ImmutableSet;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getCarbonStrip;
import p040o.getUuidUtf8Bytes;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class PurchaseReviewActivity extends ReviewActivity implements getCarbonStrip.MediaDescriptionCompat {
    private String MediaBrowserCompat$MediaItem;
    private String MediaDescriptionCompat;
    @HmlPinActivity
    public C10178z.C547010.C54711 presenter;

    public static void MediaBrowserCompat$CustomActionResultReceiver(Context context, setUuidFromUtf8Bytes setuuidfromutf8bytes, String str) {
        Intent intent = new Intent(context, PurchaseReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        if (!TextUtils.isEmpty((CharSequence) null)) {
            intent.putExtra("source", (String) null);
        }
        if (!TextUtils.isEmpty(str)) {
            intent.putExtra("subtype", str);
        }
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(context, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(context.hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            context.startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        this.MediaBrowserCompat$MediaItem = read("source", "");
        String read = read("subtype", "");
        this.MediaDescriptionCompat = read;
        this.scbAnalytics.write("purchase_review", new ZSYR2K("subtype", read), new ZSYR2K("source", this.MediaBrowserCompat$MediaItem));
        this.presenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        this.scbAnalytics.write("purchase_slip", new ZSYR2K("subtype", this.MediaDescriptionCompat), new ZSYR2K("source", "purchase_slip"));
        super.IconCompatParcelizer(getuuidutf8bytes);
    }

    public final String MediaSessionCompat$QueueItem() {
        return getString(R.string.purchase_review_title);
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        C10178z.C547010.C54711 r0 = this.presenter;
        if (r0.RatingCompat != null) {
            r0.RatingCompat.AlertController$RecycleListView();
        }
        r0.write = setuuidfromutf8bytes;
        r0.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(new ImmutableSet.SerializedForm(setuuidfromutf8bytes.MediaBrowserCompat$MediaItem()));
        r0.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new C10178z.C547010.C54711.write());
    }
}
