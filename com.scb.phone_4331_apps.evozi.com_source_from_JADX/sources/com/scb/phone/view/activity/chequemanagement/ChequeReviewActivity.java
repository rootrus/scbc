package com.scb.phone.view.activity.chequemanagement;

import android.content.Intent;
import android.os.Bundle;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.fragment.chequemanagement.ChequeReviewFragment;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.C1154x5d0ada99;
import p040o.MyECouponActivity_ViewBinding;
import p040o.getUuidUtf8Bytes;
import p040o.setTapText;
import p040o.setUuidFromUtf8Bytes;

public abstract class ChequeReviewActivity extends BaseActivity implements ChequeReviewFragment.read, C1154x5d0ada99 {
    private ChequeReviewFragment MediaBrowserCompat$SearchResultReceiver;
    private setUuidFromUtf8Bytes MediaMetadataCompat;

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$ItemReceiver(setUuidFromUtf8Bytes setuuidfromutf8bytes);

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77102131492935);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        setUuidFromUtf8Bytes setuuidfromutf8bytes = (setUuidFromUtf8Bytes) getIntent().getParcelableExtra("com.scb.phone.EXTRA_REVIEW");
        this.MediaMetadataCompat = setuuidfromutf8bytes;
        if (setuuidfromutf8bytes != null) {
            this.MediaBrowserCompat$SearchResultReceiver = ChequeReviewFragment.IconCompatParcelizer(setuuidfromutf8bytes);
            getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.fragment_container, this.MediaBrowserCompat$SearchResultReceiver).write();
            this.MediaBrowserCompat$SearchResultReceiver.MediaBrowserCompat$CustomActionResultReceiver = this;
            return;
        }
        finish();
    }

    public final void setStackedBackground() {
        super.setStackedBackground();
        setTabContainer();
        if ("ORDER_CHEQUE_FUNCTION".equalsIgnoreCase(this.MediaMetadataCompat.MediaDescriptionCompat())) {
            MediaSessionCompat$QueueItem(getString(R.string.order_cheque_review_header));
        } else {
            MediaSessionCompat$QueueItem(getString(R.string.review));
        }
    }

    public final void write(setUuidFromUtf8Bytes setuuidfromutf8bytes) {
        MediaBrowserCompat$ItemReceiver(setuuidfromutf8bytes);
    }

    public void IconCompatParcelizer(getUuidUtf8Bytes getuuidutf8bytes) {
        Intent intent = new Intent(this, ChequeSuccessActivity.class);
        intent.putExtra("com.scb.phone.EXTRA_SUCCESS", getuuidutf8bytes);
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
        finish();
    }
}
