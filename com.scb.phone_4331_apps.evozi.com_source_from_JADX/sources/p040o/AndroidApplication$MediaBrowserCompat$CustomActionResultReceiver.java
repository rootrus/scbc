package p040o;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;

/* renamed from: o.AndroidApplication$MediaBrowserCompat$CustomActionResultReceiver */
public abstract class AndroidApplication$MediaBrowserCompat$CustomActionResultReceiver<U> extends RecyclerView.setContentView {
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AndroidApplication$MediaBrowserCompat$CustomActionResultReceiver(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
    }
}
