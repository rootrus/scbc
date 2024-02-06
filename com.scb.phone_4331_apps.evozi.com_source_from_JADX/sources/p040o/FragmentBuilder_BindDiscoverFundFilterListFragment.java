package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.LinearLayout;
import com.scb.phone.R;
import com.scb.phone.view.custom.ThemeSlipLayout;
import com.scb.phone.view.fragment.requesttopay.RtpScreenshotFragment;
import com.scb.phone.view.fragment.transferandpay.ScreenshotFragment;
import java.util.Calendar;

/* renamed from: o.FragmentBuilder_BindDiscoverFundFilterListFragment */
public final /* synthetic */ class FragmentBuilder_BindDiscoverFundFilterListFragment implements AccountSummaryDeepLinkActivity {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ getUuidUtf8Bytes MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ boolean read;
    private final /* synthetic */ Context write;

    public /* synthetic */ FragmentBuilder_BindDiscoverFundFilterListFragment(FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment, getUuidUtf8Bytes getuuidutf8bytes, boolean z, Context context, boolean z2) {
        this.MediaBrowserCompat$CustomActionResultReceiver = fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment;
        this.MediaBrowserCompat$ItemReceiver = getuuidutf8bytes;
        this.IconCompatParcelizer = z;
        this.write = context;
        this.read = z2;
    }

    public final void read(onOkClick onokclick) {
        Uri uri;
        FragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment = this.MediaBrowserCompat$CustomActionResultReceiver;
        getUuidUtf8Bytes getuuidutf8bytes = this.MediaBrowserCompat$ItemReceiver;
        boolean z = this.IconCompatParcelizer;
        Context context = this.write;
        boolean z2 = this.read;
        String valueOf = String.valueOf(Calendar.getInstance().getTimeInMillis());
        StringBuilder sb = new StringBuilder();
        String str = getuuidutf8bytes.ParcelableVolumeInfo;
        onGetStartedClick.write((Object) valueOf, "defaultValue");
        if (str == null) {
            str = valueOf;
        }
        sb.append(str);
        if (z) {
            sb.append("_");
            sb.append(valueOf);
        }
        String format = String.format("TXN_%s.jpg", new Object[]{sb.toString()});
        Bitmap bitmap = null;
        try {
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
            View inflate = LayoutInflater.from(context).inflate(fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment.MediaBrowserCompat$ItemReceiver, linearLayout, false);
            if ("rtp.requester".equals(getuuidutf8bytes.PlaybackStateCompat.MediaDescriptionCompat())) {
                new RtpScreenshotFragment().MediaBrowserCompat$ItemReceiver(getuuidutf8bytes.PlaybackStateCompat, inflate, context);
            } else {
                new ScreenshotFragment().read(getuuidutf8bytes, inflate, context);
            }
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.widthPixels;
            ThemeSlipLayout themeSlipLayout = (ThemeSlipLayout) inflate.findViewById(R.id.layout_theme_slip);
            if (themeSlipLayout != null) {
                themeSlipLayout.write(fragmentBuilder_BindEHmlNTBEkycVerifyIdentifyBranchFragment.write);
            }
            bitmap = AlertController$RecycleListView.IconCompatParcelizer(inflate, i, i2 * 7);
            if (z2) {
                uri = AlertController$RecycleListView.read(bitmap, format, context);
            } else {
                uri = AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver(bitmap, context, "screen_image.jpg");
            }
            if (uri != null) {
                onokclick.MediaBrowserCompat$CustomActionResultReceiver(uri);
            }
            onokclick.MediaBrowserCompat$CustomActionResultReceiver();
            if (bitmap == null) {
                return;
            }
        } catch (Exception e) {
            onokclick.MediaBrowserCompat$CustomActionResultReceiver((Throwable) e);
            if (bitmap == null) {
                return;
            }
        } catch (Throwable th) {
            if (bitmap != null) {
                bitmap.recycle();
            }
            throw th;
        }
        bitmap.recycle();
    }
}
