package p040o;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.WindowManager;
import com.scb.phone.R;
import com.scb.phone.view.custom.ThemeSlipLayout;
import java.util.Calendar;

/* renamed from: o.setOnTabSelectListener */
public final /* synthetic */ class setOnTabSelectListener implements AccountSummaryDeepLinkActivity {
    private final /* synthetic */ boolean IconCompatParcelizer;
    private final /* synthetic */ boolean MediaBrowserCompat$CustomActionResultReceiver = true;
    private final /* synthetic */ getUuidUtf8Bytes MediaBrowserCompat$ItemReceiver;
    private final /* synthetic */ Context read;
    private final /* synthetic */ setTabTitleTextAppearance write;

    public /* synthetic */ setOnTabSelectListener(setTabTitleTextAppearance settabtitletextappearance, getUuidUtf8Bytes getuuidutf8bytes, boolean z, Context context, boolean z2) {
        this.write = settabtitletextappearance;
        this.MediaBrowserCompat$ItemReceiver = getuuidutf8bytes;
        this.read = context;
        this.IconCompatParcelizer = true;
    }

    public final void read(onOkClick onokclick) {
        setTabTitleTextAppearance settabtitletextappearance = this.write;
        getUuidUtf8Bytes getuuidutf8bytes = this.MediaBrowserCompat$ItemReceiver;
        boolean z = this.MediaBrowserCompat$CustomActionResultReceiver;
        Context context = this.read;
        boolean z2 = this.IconCompatParcelizer;
        StringBuilder sb = new StringBuilder();
        sb.append("Cardless_");
        sb.append(getuuidutf8bytes.MediaBrowserCompat$SearchResultReceiver.MediaSessionCompat$ResultReceiverWrapper);
        if (z) {
            sb.append("_");
            sb.append(String.valueOf(Calendar.getInstance().getTimeInMillis()));
        }
        String format = String.format("TXN_%s.jpg", new Object[]{sb.toString()});
        Bitmap bitmap = null;
        try {
            View write2 = setTabTitleTextAppearance.write(getuuidutf8bytes, context);
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.widthPixels;
            ThemeSlipLayout themeSlipLayout = (ThemeSlipLayout) write2.findViewById(R.id.layout_theme_slip);
            if (themeSlipLayout != null) {
                themeSlipLayout.write(settabtitletextappearance.IconCompatParcelizer);
            }
            bitmap = AlertController$RecycleListView.IconCompatParcelizer(write2, i, i2 * 7);
            Uri MediaBrowserCompat$ItemReceiver2 = setTabTitleTextAppearance.MediaBrowserCompat$ItemReceiver(context, bitmap, format, z2);
            if (MediaBrowserCompat$ItemReceiver2 != null) {
                onokclick.MediaBrowserCompat$CustomActionResultReceiver(MediaBrowserCompat$ItemReceiver2);
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
