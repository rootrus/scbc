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
import p040o.ForwardingListenableFuture;
import p040o.ForwardingListenableFuture.SimpleForwardingListenableFuture;

/* renamed from: o.FragmentBuilder_BindEBillSelectedFragment */
public abstract class FragmentBuilder_BindEBillSelectedFragment<T extends ForwardingListenableFuture.SimpleForwardingListenableFuture> {
    private final setExitButtonEnabled read;

    public abstract void write(T t, View view);

    public FragmentBuilder_BindEBillSelectedFragment() {
        this.read = null;
    }

    public FragmentBuilder_BindEBillSelectedFragment(setExitButtonEnabled setexitbuttonenabled) {
        this.read = setexitbuttonenabled;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0045  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ android.net.Uri write(p040o.ForwardingListenableFuture.SimpleForwardingListenableFuture r4, android.content.Context r5) throws java.lang.Exception {
        /*
            r3 = this;
            android.graphics.Bitmap r0 = r3.read(r4, r5)     // Catch:{ all -> 0x0041 }
            boolean r1 = r4.MediaBrowserCompat$CustomActionResultReceiver     // Catch:{ all -> 0x003f }
            java.lang.String r2 = ".jpg"
            if (r1 == 0) goto L_0x0022
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            r1.<init>()     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r4.read()     // Catch:{ all -> 0x003f }
            r1.append(r4)     // Catch:{ all -> 0x003f }
            r1.append(r2)     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x003f }
            android.net.Uri r4 = p040o.AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((android.graphics.Bitmap) r0, (android.content.Context) r5, (java.lang.String) r4)     // Catch:{ all -> 0x003f }
            goto L_0x0039
        L_0x0022:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x003f }
            r1.<init>()     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r4.read()     // Catch:{ all -> 0x003f }
            r1.append(r4)     // Catch:{ all -> 0x003f }
            r1.append(r2)     // Catch:{ all -> 0x003f }
            java.lang.String r4 = r1.toString()     // Catch:{ all -> 0x003f }
            android.net.Uri r4 = p040o.AlertController$RecycleListView.read((android.graphics.Bitmap) r0, (java.lang.String) r4, (android.content.Context) r5)     // Catch:{ all -> 0x003f }
        L_0x0039:
            if (r0 == 0) goto L_0x003e
            r0.recycle()
        L_0x003e:
            return r4
        L_0x003f:
            r4 = move-exception
            goto L_0x0043
        L_0x0041:
            r4 = move-exception
            r0 = 0
        L_0x0043:
            if (r0 == 0) goto L_0x0048
            r0.recycle()
        L_0x0048:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindEBillSelectedFragment.write(o.ForwardingListenableFuture$SimpleForwardingListenableFuture, android.content.Context):android.net.Uri");
    }

    static /* synthetic */ Uri MediaBrowserCompat$ItemReceiver(Bitmap bitmap, ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, Context context) throws Exception {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(simpleForwardingListenableFuture.read());
            sb.append(".jpg");
            return AlertController$RecycleListView.read(bitmap, sb.toString(), context);
        } finally {
            if (bitmap != null) {
                bitmap.recycle();
            }
        }
    }

    public final /* synthetic */ Bitmap IconCompatParcelizer(ForwardingListenableFuture.SimpleForwardingListenableFuture simpleForwardingListenableFuture, Context context) throws Exception {
        try {
            return read(simpleForwardingListenableFuture, context);
        } catch (OutOfMemoryError unused) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Bitmap Out of memory error", new Object[0]);
            return null;
        } catch (Exception unused2) {
            onCheckBoxClick.MediaBrowserCompat$CustomActionResultReceiver("Bitmap throws exception", new Object[0]);
            return null;
        }
    }

    private Bitmap read(T t, Context context) {
        setExitButtonEnabled setexitbuttonenabled;
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        View inflate = LayoutInflater.from(context).inflate(t.MediaBrowserCompat$ItemReceiver, linearLayout, false);
        write(t, inflate);
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = inflate.getLayoutParams().height;
        ThemeSlipLayout themeSlipLayout = (ThemeSlipLayout) inflate.findViewById(R.id.layout_theme_slip);
        if (!(themeSlipLayout == null || (setexitbuttonenabled = this.read) == null)) {
            themeSlipLayout.write(setexitbuttonenabled);
        }
        return AlertController$RecycleListView.IconCompatParcelizer(inflate, i, i2);
    }
}
