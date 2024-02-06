package p040o;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.scb.phone.view.activity.investment.fundswitch.FundSwitchReviewActivity;
import com.scb.phone.view.activity.investment.purchase.FundPurchaseReviewActivity;
import com.scb.phone.view.fragment.investment.PdfViewerFragment;
import com.thunderhead.android.aspects.IntentTidInjectionActivityAspect;
import p040o.ExecutorUtils;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.setOnImageEventListener */
public abstract class setOnImageEventListener extends BaseActivity implements PdfViewerFragment.write {
    private Parcelable MediaBrowserCompat$MediaItem;

    /* access modifiers changed from: protected */
    public abstract int AppCompatDelegateImpl$ListMenuDecorView();

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$ItemReceiver(ExecutorUtils.C33371 r1);

    /* access modifiers changed from: protected */
    public abstract void MediaBrowserCompat$ItemReceiver(getOsBuildVersionString getosbuildversionstring);

    /* access modifiers changed from: protected */
    public abstract int MediaSessionCompat$ResultReceiverWrapper();

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.f77992131493024);
        getSupportFragmentManager().read().MediaBrowserCompat$ItemReceiver(R.id.container, PdfViewerFragment.write(getString(AppCompatDelegateImpl$ListMenuDecorView()), getIntent() != null ? getIntent().getStringExtra("PDF_URL") : "", getString(MediaSessionCompat$ResultReceiverWrapper()))).write();
        this.MediaBrowserCompat$MediaItem = getIntent().getParcelableExtra("DISPLAY_MODEL");
    }

    public void MediaSessionCompat$Token() {
        AlertController$RecycleListView();
    }

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public void mo34028x50fd9e4a() {
        aj_();
    }

    public void MediaSessionCompat$QueueItem() {
        Parcelable parcelable = this.MediaBrowserCompat$MediaItem;
        if (parcelable instanceof ExecutorUtils.C33371) {
            MediaBrowserCompat$ItemReceiver((ExecutorUtils.C33371) parcelable);
        } else if (parcelable instanceof getOsBuildVersionString) {
            MediaBrowserCompat$ItemReceiver((getOsBuildVersionString) parcelable);
        }
    }

    /* access modifiers changed from: protected */
    public final void write(ExecutorUtils.C33371 r4) {
        Intent write = FundSwitchReviewActivity.write(this, r4);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, write).read();
            MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb.toString());
            startActivityForResult(read, 1332);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(getOsBuildVersionString getosbuildversionstring) {
        Intent intent = new Intent(this, FundPurchaseReviewActivity.class);
        intent.putExtra("PURCHASE_FUND_DETAILS", getosbuildversionstring);
        IntentTidInjectionActivityAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Activity.startActivityForResult(Intent, int), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivityForResult(read, 1332);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }
}
