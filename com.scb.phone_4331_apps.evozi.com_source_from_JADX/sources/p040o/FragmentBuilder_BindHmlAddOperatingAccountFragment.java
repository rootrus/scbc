package p040o;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import com.thunderhead.WebViewActivity;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import p040o.FragmentBuilder_BindHmlLandingFragment;

/* renamed from: o.FragmentBuilder_BindHmlAddOperatingAccountFragment */
public abstract class FragmentBuilder_BindHmlAddOperatingAccountFragment extends FragmentBuilder_BindHmlETBSummaryFragment {
    public Bitmap IconCompatParcelizer;
    private FragmentBuilder_BindPreregistrationPinFragment MediaBrowserCompat$ItemReceiver = FragmentBuilder_BindHmlIssuerLandingFragment.setHasDecor();
    protected WeakReference<Activity> read;
    public volatile read write;

    /* renamed from: o.FragmentBuilder_BindHmlAddOperatingAccountFragment$read */
    public interface read {
        void MediaBrowserCompat$ItemReceiver(FragmentBuilder_BindHmlAddOperatingAccountFragment fragmentBuilder_BindHmlAddOperatingAccountFragment);
    }

    /* access modifiers changed from: package-private */
    public abstract void MediaBrowserCompat$CustomActionResultReceiver();

    /* access modifiers changed from: package-private */
    public abstract void MediaBrowserCompat$ItemReceiver();

    /* access modifiers changed from: package-private */
    public abstract void read();

    FragmentBuilder_BindHmlAddOperatingAccountFragment() {
    }

    /* access modifiers changed from: package-private */
    public final boolean MediaBrowserCompat$CustomActionResultReceiver(InputStream inputStream) {
        Bitmap decodeStream = BitmapFactory.decodeStream(inputStream);
        this.IconCompatParcelizer = decodeStream;
        return decodeStream != null;
    }

    /* access modifiers changed from: protected */
    public final void IconCompatParcelizer(FragmentBuilder_BindHmlLandingFragment fragmentBuilder_BindHmlLandingFragment) {
        Uri MediaBrowserCompat$CustomActionResultReceiver;
        boolean z = false;
        if (fragmentBuilder_BindHmlLandingFragment == null) {
            try {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindSmeLoanStatusFragment.OPEN_URL_NULL_RESPONSE, new Object[0]);
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            }
        } else {
            String MediaBrowserCompat$MediaItem = fragmentBuilder_BindHmlLandingFragment.MediaBrowserCompat$MediaItem();
            if (MediaBrowserCompat$MediaItem != null) {
                if (!MediaBrowserCompat$MediaItem.trim().isEmpty()) {
                    if (this.read != null) {
                        if (this.read.get() != null) {
                            String lowerCase = MediaBrowserCompat$MediaItem.toLowerCase();
                            if (lowerCase.startsWith("http://") || lowerCase.startsWith("https://")) {
                                z = true;
                            }
                            if (FragmentBuilder_BindHmlLandingFragment.IconCompatParcelizer.EXTERNAL.toString().equals(fragmentBuilder_BindHmlLandingFragment.read())) {
                                Uri parse = Uri.parse(MediaBrowserCompat$MediaItem);
                                if (z) {
                                    parse = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(parse);
                                }
                                Intent intent = new Intent("android.intent.action.VIEW", parse);
                                intent.putExtra("com.android.browser.application_id", this.read.get().getPackageName());
                                intent.setPackage("com.android.chrome");
                                try {
                                    this.read.get().startActivity(intent);
                                    return;
                                } catch (ActivityNotFoundException unused) {
                                    try {
                                        intent.setPackage((String) null);
                                        intent.removeExtra("com.android.browser.application_id");
                                        this.read.get().startActivity(intent);
                                        return;
                                    } catch (ActivityNotFoundException e2) {
                                        MyECouponActivity_ViewBinding.read(e2, FragmentBuilder_BindMerchantWalletFragment.NOTIFICATION_NO_ACTIVITY_FOUND);
                                        return;
                                    } catch (Exception e3) {
                                        MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e3);
                                        return;
                                    }
                                }
                            } else if (FragmentBuilder_BindHmlLandingFragment.IconCompatParcelizer.IN_APP.toString().equals(fragmentBuilder_BindHmlLandingFragment.read())) {
                                if (z && (MediaBrowserCompat$CustomActionResultReceiver = this.MediaBrowserCompat$ItemReceiver.MediaBrowserCompat$CustomActionResultReceiver(Uri.parse(MediaBrowserCompat$MediaItem))) != null) {
                                    MediaBrowserCompat$MediaItem = MediaBrowserCompat$CustomActionResultReceiver.toString();
                                }
                                BaseECouponActivity baseECouponActivity = new BaseECouponActivity(MediaBrowserCompat$MediaItem);
                                Context context = this.read.get();
                                Intent intent2 = new Intent(context, WebViewActivity.class);
                                intent2.addFlags(268435456);
                                intent2.addFlags(131072);
                                intent2.putExtra("TARGET_URL", baseECouponActivity.MediaBrowserCompat$CustomActionResultReceiver);
                                context.startActivity(intent2);
                                return;
                            } else {
                                return;
                            }
                        }
                    }
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindSmeLoanStatusFragment.NULL_CONTEXT, new Object[0]);
                    return;
                }
            }
            MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver(FragmentBuilder_BindSmeLoanStatusFragment.MISSING_TARGET_URL, fragmentBuilder_BindHmlLandingFragment.MediaBrowserCompat$ItemReceiver());
        }
    }

    /* access modifiers changed from: package-private */
    public void read(Activity activity) {
        this.read = new WeakReference<>(activity);
    }

    /* access modifiers changed from: package-private */
    public void write() {
        super.write();
        this.write = null;
    }
}
