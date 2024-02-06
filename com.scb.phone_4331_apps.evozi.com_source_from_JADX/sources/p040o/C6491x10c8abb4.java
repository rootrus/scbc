package p040o;

import android.content.Context;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import java.util.List;
import p040o.Futures;

/* renamed from: o.FragmentBuilder_BindDealsBuyReviewFragment$MediaBrowserCompat$ItemReceiver */
final class C6491x10c8abb4 extends FragmentBuilder_BindDealsBuyReviewFragment {
    public final boolean read() {
        return false;
    }

    C6491x10c8abb4(String str) {
        super(str, 6, (byte) 0);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return context.getString(R.string.auto_mcmc_instructions_header_title);
    }

    public final void IconCompatParcelizer(Context context, ImageView imageView, TextView textView, TextView textView2) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) imageView, "thumbnailImage");
        onGetStartedClick.write((Object) textView, "headerText");
        onGetStartedClick.write((Object) textView2, "descriptionText");
        imageView.setImageDrawable(setLastBaselineToBottomHeight.write(context, R.drawable.car_banner_intrucstion));
        textView2.setText(context.getString(R.string.auto_mcmc_intructions_description));
        textView.setText(context.getString(R.string.auto_mcmc_intructions_title));
    }

    public final List<Futures.ListenableFutureAdapter> read(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return HmlNationalIdActivity.IconCompatParcelizer;
    }
}
