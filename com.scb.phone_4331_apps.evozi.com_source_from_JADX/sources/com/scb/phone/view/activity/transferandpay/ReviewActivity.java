package com.scb.phone.view.activity.transferandpay;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.transferandpay.ReviewFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.CrashlyticsReport;
import p040o.MyECouponActivity_ViewBinding;
import p040o.access$2200;
import p040o.getTopLeftCornerWidth;
import p040o.getUuidUtf8Bytes;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public abstract class ReviewActivity extends BaseActivity implements ReviewFragment.read, getTopLeftCornerWidth.AppCompatActivity {
    private ReviewFragment MediaDescriptionCompat;

    /* access modifiers changed from: protected */
    public abstract String MediaSessionCompat$QueueItem();

    /* access modifiers changed from: protected */
    public abstract void write(setUuidFromUtf8Bytes setuuidfromutf8bytes);

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f76792131492904);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(MediaSessionCompat$QueueItem());
        setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW");
        if (setuuidfromutf8bytes == null) {
            finish();
            return;
        }
        ReviewFragment MediaBrowserCompat$CustomActionResultReceiver = ReviewFragment.MediaBrowserCompat$CustomActionResultReceiver(setuuidfromutf8bytes);
        this.MediaDescriptionCompat = MediaBrowserCompat$CustomActionResultReceiver;
        MediaBrowserCompat$CustomActionResultReceiver.IconCompatParcelizer = this;
        getSupportFragmentManager().read().IconCompatParcelizer(R.id.container, this.MediaDescriptionCompat, "REVIEW_FRAGMENT_TAG").write();
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        write(setuuidfromutf8bytes);
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        MediaSessionCompat$QueueItem(MediaSessionCompat$QueueItem());
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(access$2200 access_2200) {
        this.MediaDescriptionCompat.mConfirmButton.setButtonEnabled(true);
    }

    /* access modifiers changed from: protected */
    public final void MediaSessionCompat$ResultReceiverWrapper() {
        this.MediaDescriptionCompat.mConfirmButton.setButtonEnabled(true);
    }

    public void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        Intent intent = new Intent(this, SuccessActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_SUCCESS", getuuidutf8bytes);
        String str = "";
        if (getIntent().getStringExtra("source") != null) {
            String stringExtra = getIntent().getStringExtra("source");
            if (!read("subtype", str).isEmpty()) {
                intent.putExtra("subtype", getIntent().getStringExtra("subtype"));
            }
            str = stringExtra;
        }
        intent.putExtra("source", str);
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
        this.MediaDescriptionCompat.mConfirmButton.setButtonEnabled(true);
        aj_();
        setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW");
        if (setuuidfromutf8bytes != null && setuuidfromutf8bytes.setIcon) {
            Intent intent2 = new Intent();
            intent2.setAction("com.scb.phone/BROADCAST_ADD_TILE_TO_ROOT");
            sendBroadcast(intent2);
        }
    }

    public void MediaBrowserCompat$CustomActionResultReceiver(CrashlyticsReport.Session.Event.Application application) {
        setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW");
        if (setuuidfromutf8bytes != null && setuuidfromutf8bytes.setIcon) {
            Intent intent = new Intent();
            intent.setAction("com.scb.phone/BROADCAST_ADD_TILE_TO_ROOT");
            sendBroadcast(intent);
        }
        FixedTransferSuccessActivity.write(this, application);
    }
}
