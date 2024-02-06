package p040o;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import com.thunderhead.android.aspects.WebViewAsp;
import p040o.MyECouponActivity_ViewBinding;

/* renamed from: o.verifyReferral */
public final class verifyReferral extends WebViewClient {
    private final IconCompatParcelizer IconCompatParcelizer;
    private final IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver;
    private final write write;

    /* renamed from: o.verifyReferral$IconCompatParcelizer */
    public interface IconCompatParcelizer {
        void IconCompatParcelizer();
    }

    /* renamed from: o.verifyReferral$write */
    public interface write {
        void Keep();

        void ay_();
    }

    public verifyReferral(write write2) {
        this(write2, (IconCompatParcelizer) null, (IconCompatParcelizer) null);
    }

    public verifyReferral(write write2, IconCompatParcelizer iconCompatParcelizer, IconCompatParcelizer iconCompatParcelizer2) {
        this.write = write2;
        this.IconCompatParcelizer = iconCompatParcelizer;
        this.MediaBrowserCompat$CustomActionResultReceiver = iconCompatParcelizer2;
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        super.onPageStarted(webView, str, bitmap);
        write write2 = this.write;
        if (write2 != null) {
            write2.Keep();
        }
        IconCompatParcelizer iconCompatParcelizer = this.IconCompatParcelizer;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.IconCompatParcelizer();
        }
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        return IconCompatParcelizer(webView, webResourceRequest.getUrl().toString());
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return IconCompatParcelizer(webView, str);
    }

    public final void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        IconCompatParcelizer iconCompatParcelizer = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (iconCompatParcelizer != null) {
            iconCompatParcelizer.IconCompatParcelizer();
        }
        write write2 = this.write;
        if (write2 != null) {
            write2.ay_();
        }
    }

    private boolean IconCompatParcelizer(WebView webView, String str) {
        if (!str.startsWith("mailto:")) {
            WebViewAsp.aspectOf();
            try {
                Context context = webView.getContext();
                new onRotateClicked();
                String write2 = onRotateClicked.write(str);
                MyECouponActivity_ViewBinding.write write3 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb = new StringBuilder("Uri intercepted on WebView.loadUrl(String), modified: ");
                sb.append(write2);
                sb.append("\n with context ");
                sb.append(context.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write3, sb.toString());
                webView.loadUrl(write2);
                return false;
            } catch (Throwable th) {
                th.printStackTrace();
                return false;
            }
        } else {
            Intent intent = new Intent("android.intent.action.SENDTO");
            intent.setData(Uri.parse(str));
            Context context2 = webView.getContext();
            IntentTidInjectionContextAspect.aspectOf();
            try {
                Intent read = setTapText.write(context2, intent).read();
                MyECouponActivity_ViewBinding.write write4 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                sb2.append(read.getData());
                sb2.append("\n with context ");
                sb2.append(context2.hashCode());
                MyECouponActivity_ViewBinding.IconCompatParcelizer(write4, sb2.toString());
                context2.startActivity(read);
                return true;
            } catch (Throwable th2) {
                th2.printStackTrace();
                return true;
            }
        }
    }
}
