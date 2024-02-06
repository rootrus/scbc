package p040o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import p040o.ZHER2K;

/* renamed from: o.isDynamicHeightEnabled */
public final class isDynamicHeightEnabled extends RecyclerView.setContentView {
    final ImageView AlertController$RecycleListView;
    final TextView PlaybackStateCompat;
    final TextView setHasDecor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public isDynamicHeightEnabled(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        TextView textView = (TextView) view.findViewById(ZHER2K.write.txtVw_currency_code);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "view.txtVw_currency_code");
        this.PlaybackStateCompat = textView;
        TextView textView2 = (TextView) view.findViewById(ZHER2K.write.txtVw_currency_name);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "view.txtVw_currency_name");
        this.setHasDecor = textView2;
        ImageView imageView = (ImageView) view.findViewById(ZHER2K.write.imgVw_currency_icon);
        onGetStartedClick.IconCompatParcelizer((Object) imageView, "view.imgVw_currency_icon");
        this.AlertController$RecycleListView = imageView;
    }
}
