package com.scb.phone.view.activity.fastpay;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import com.scb.phone.view.activity.transferandpay.transfer.TransferReviewActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.HmlPinActivity;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getKernelIDSrcIn;
import p040o.getUuidUtf8Bytes;
import p040o.newCheckExtractor$MediaBrowserCompat$ItemReceiver;
import p040o.readImageFromFileBuffer;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;
import p040o.unsafeComparator;

public class FastPayTransferReviewActivity extends TransferReviewActivity implements newCheckExtractor$MediaBrowserCompat$ItemReceiver {
    private getKernelIDSrcIn MediaSessionCompat$Token;
    @HmlPinActivity
    public readImageFromFileBuffer fastPayTransferReviewPresenter;

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.fastPayTransferReviewPresenter.MediaBrowserCompat$ItemReceiver(this);
        this.MediaSessionCompat$Token = new getKernelIDSrcIn();
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        readImageFromFileBuffer readimagefromfilebuffer = this.fastPayTransferReviewPresenter;
        if (readimagefromfilebuffer.RatingCompat != null) {
            readimagefromfilebuffer.RatingCompat.AlertController$RecycleListView();
        }
        unsafeComparator MediaBrowserCompat$ItemReceiver = unsafeComparator.MediaBrowserCompat$ItemReceiver();
        MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver = setuuidfromutf8bytes.MediaBrowserCompat$MediaItem();
        readimagefromfilebuffer.write.read(MediaBrowserCompat$ItemReceiver);
        readimagefromfilebuffer.write.IconCompatParcelizer(new readImageFromFileBuffer.read(setuuidfromutf8bytes));
    }

    public final void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        String name = !TextUtils.isEmpty(this.MediaBrowserCompat$SearchResultReceiver) ? this.MediaMetadataCompat : this.MediaDescriptionCompat.name();
        this.MediaSessionCompat$Token.read(this.MediaBrowserCompat$SearchResultReceiver);
        this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(name);
        this.MediaSessionCompat$Token.MediaBrowserCompat$ItemReceiver(this.scbAnalytics, read("com.scb.phone.analytics.KEY_EVENT_FINISH", "transfer_slip"));
        Intent intent = new Intent(this, FastPaySuccessActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_SUCCESS", getuuidutf8bytes);
        intent.putExtra("source", getIntent().getStringExtra("source") != null ? getIntent().getStringExtra("source") : "");
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
        MediaSessionCompat$ResultReceiverWrapper();
        aj_();
        setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW");
        if (setuuidfromutf8bytes != null && setuuidfromutf8bytes.setIcon) {
            Intent intent2 = new Intent();
            intent2.setAction("com.scb.phone/BROADCAST_ADD_TILE_TO_ROOT");
            sendBroadcast(intent2);
        }
    }

    public void onDestroy() {
        this.MediaSessionCompat$Token = null;
        super.onDestroy();
    }
}
