package com.scb.phone.view.activity.prelogin.quickpromptpay;

import android.content.Intent;
import android.os.Bundle;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseReviewActivity;
import com.scb.phone.view.activity.prelogin.PinLoginActivity;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getKernelIDSrcIn;
import p040o.getUuidUtf8Bytes;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public class QuickPromptPayReviewActivity extends BaseReviewActivity {
    private getKernelIDSrcIn MediaBrowserCompat$SearchResultReceiver;
    private String MediaMetadataCompat;

    public final void IconCompatParcelizer() {
    }

    public final String MediaSessionCompat$QueueItem() {
        return getString(R.string.review_prompt_pay);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.MediaBrowserCompat$SearchResultReceiver = new getKernelIDSrcIn();
        String read = read("source", "");
        this.MediaMetadataCompat = read;
        this.MediaBrowserCompat$SearchResultReceiver.read(read);
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver("promptpay");
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "transfer_review");
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        this.MediaBrowserCompat$MediaItem = setuuidfromutf8bytes;
        AlertController$RecycleListView();
        if (setGroupDividerEnabled()) {
            this.presenter.MediaBrowserCompat$CustomActionResultReceiver(setuuidfromutf8bytes, this.MediaDescriptionCompat, (String) null, (String) null);
            return;
        }
        Intent intent = new Intent(this, PinLoginActivity.class);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 7134);
        } catch (Throwable th) {
            th.printStackTrace();
        }
        setSubtitle();
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 7134 && i2 == -1) {
            write(this.MediaBrowserCompat$MediaItem);
        }
    }

    public final void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        this.MediaBrowserCompat$SearchResultReceiver.read(this.MediaMetadataCompat);
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.MediaDescriptionCompat.toString());
        this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, "transfer_slip");
        super.IconCompatParcelizer(getuuidutf8bytes);
    }

    public void onDestroy() {
        this.MediaBrowserCompat$SearchResultReceiver = null;
        super.onDestroy();
    }
}
