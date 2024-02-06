package com.scb.phone.view.activity.loan;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.view.activity.transferandpay.ReviewActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.HmlPinActivity;
import p040o.ImmutableSortedSet;
import p040o.MyECouponActivity_ViewBinding;
import p040o.ZSYR2K;
import p040o.getSessionKey;
import p040o.getTransit;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class LoanPaymentReviewActivity extends ReviewActivity implements getTransit.write {
    @HmlPinActivity
    public getSessionKey loanPaymentReviewPresenter;

    public static void MediaBrowserCompat$ItemReceiver(Context context, setUuidFromUtf8Bytes setuuidfromutf8bytes, String str) {
        Intent intent = new Intent(context, LoanPaymentReviewActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_REVIEW", setuuidfromutf8bytes);
        intent.putExtra("com.scb.phone.EXTRA_SUBTYPE_LOAN_SLIP", str);
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
        this.loanPaymentReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
    }

    public final String MediaSessionCompat$QueueItem() {
        return ((setUuidFromUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW")).setUiOptions;
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        getSessionKey getsessionkey = this.loanPaymentReviewPresenter;
        String stringExtra = getIntent().getStringExtra("com.scb.phone.EXTRA_SUBTYPE_LOAN_SLIP");
        if (!getsessionkey.read) {
            boolean z = true;
            getsessionkey.read = true;
            getsessionkey.write = setuuidfromutf8bytes;
            if (getsessionkey.RatingCompat == null) {
                z = false;
            }
            if (z) {
                getsessionkey.RatingCompat.AlertController$RecycleListView();
            }
            ImmutableSortedSet.Builder MediaBrowserCompat$ItemReceiver = ImmutableSortedSet.Builder.MediaBrowserCompat$ItemReceiver();
            MediaBrowserCompat$ItemReceiver.MediaSessionCompat$QueueItem = setuuidfromutf8bytes.MediaBrowserCompat$MediaItem();
            getsessionkey.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$ItemReceiver(MediaBrowserCompat$ItemReceiver);
            getsessionkey.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer(new getSessionKey.write(stringExtra));
        }
    }

    public final void IconCompatParcelizer(String str) {
        this.scbAnalytics.write("loan_slip", new ZSYR2K("subtype_loanslip", str));
    }
}
