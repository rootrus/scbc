package p040o;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.analytics.ecommerce.Promotion;
import p040o.ZHER2K;
import p040o.setDynamicHeightEnabled;

/* renamed from: o.setHeaderTextAppearance */
public final class setHeaderTextAppearance extends RecyclerView.setContentView {
    final ImageView AlertController$RecycleListView;
    final TextView Keep;
    final TextView PlaybackStateCompat;
    final ImageView setHasDecor;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public setHeaderTextAppearance(View view) {
        super(view);
        onGetStartedClick.write((Object) view, Promotion.ACTION_VIEW);
        TextView textView = (TextView) view.findViewById(ZHER2K.write.txv_account_number);
        onGetStartedClick.IconCompatParcelizer((Object) textView, "view.txv_account_number");
        this.Keep = textView;
        TextView textView2 = (TextView) view.findViewById(ZHER2K.write.txv_account_name);
        onGetStartedClick.IconCompatParcelizer((Object) textView2, "view.txv_account_name");
        this.PlaybackStateCompat = textView2;
        ImageView imageView = (ImageView) view.findViewById(ZHER2K.write.img_bank_logo);
        onGetStartedClick.IconCompatParcelizer((Object) imageView, "view.img_bank_logo");
        this.setHasDecor = imageView;
        ImageView imageView2 = (ImageView) view.findViewById(ZHER2K.write.view_edit);
        onGetStartedClick.IconCompatParcelizer((Object) imageView2, "view.view_edit");
        this.AlertController$RecycleListView = imageView2;
    }

    /* renamed from: o.setHeaderTextAppearance$IconCompatParcelizer */
    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ setDynamicHeightEnabled.write write;

        IconCompatParcelizer(setDynamicHeightEnabled.write write2) {
            this.write = write2;
        }

        public final void onClick(View view) {
            this.write.IconCompatParcelizer();
        }
    }
}
