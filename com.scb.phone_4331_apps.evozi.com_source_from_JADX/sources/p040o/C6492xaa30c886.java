package p040o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import java.util.Arrays;
import java.util.List;
import p040o.Futures;

/* renamed from: o.FragmentBuilder_BindDealsBuyReviewFragment$MediaBrowserCompat$SearchResultReceiver */
final class C6492xaa30c886 extends FragmentBuilder_BindDealsBuyReviewFragment {
    C6492xaa30c886(String str) {
        super(str, 2, (byte) 0);
    }

    public final String MediaBrowserCompat$CustomActionResultReceiver(Context context) {
        onGetStartedClick.write((Object) context, "context");
        return context.getString(R.string.taking_photo_details_title_slip);
    }

    public final void IconCompatParcelizer(Context context, ImageView imageView, TextView textView, TextView textView2) {
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) imageView, "thumbnailImage");
        onGetStartedClick.write((Object) textView, "headerText");
        onGetStartedClick.write((Object) textView2, "descriptionText");
        imageView.setImageDrawable(setLastBaselineToBottomHeight.write(context, R.drawable.ic_slip_thumbnail));
        textView2.setText(context.getString(R.string.taking_photo_details_description_details_slip));
        textView.setText(context.getString(R.string.taking_photo_details_description_slip));
    }

    public final List<Futures.ListenableFutureAdapter> read(Context context) {
        onGetStartedClick.write((Object) context, "context");
        Drawable write = setLastBaselineToBottomHeight.write(context, R.drawable.ic_slip_match);
        String string = context.getString(R.string.taking_photo_details_match_slip);
        onGetStartedClick.IconCompatParcelizer((Object) string, "context.getString(R.stri…photo_details_match_slip)");
        Drawable write2 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_7mb_upload);
        String string2 = context.getString(R.string.taking_photo_details_accepted_formats);
        onGetStartedClick.IconCompatParcelizer((Object) string2, "context.getString(R.stri…details_accepted_formats)");
        Drawable write3 = setLastBaselineToBottomHeight.write(context, R.drawable.payslipviewable);
        String string3 = context.getString(R.string.taking_photo_details_visible_slip);
        onGetStartedClick.IconCompatParcelizer((Object) string3, "context.getString(R.stri…oto_details_visible_slip)");
        Drawable write4 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_slip_blurry);
        String string4 = context.getString(R.string.taking_photo_details_blurry_slip);
        onGetStartedClick.IconCompatParcelizer((Object) string4, "context.getString(R.stri…hoto_details_blurry_slip)");
        Drawable write5 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_document_instruction);
        String string5 = context.getString(R.string.taking_photo_details_screenshots);
        onGetStartedClick.IconCompatParcelizer((Object) string5, "context.getString(R.stri…hoto_details_screenshots)");
        Futures.ListenableFutureAdapter[] listenableFutureAdapterArr = {new Futures.ListenableFutureAdapter(write, string), new Futures.ListenableFutureAdapter(write2, string2), new Futures.ListenableFutureAdapter(write3, string3), new Futures.ListenableFutureAdapter(write4, string4), new Futures.ListenableFutureAdapter(write5, string5)};
        onGetStartedClick.write((Object) listenableFutureAdapterArr, "elements");
        onGetStartedClick.write((Object) listenableFutureAdapterArr, "$this$asList");
        List<Futures.ListenableFutureAdapter> asList = Arrays.asList(listenableFutureAdapterArr);
        onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
        return asList;
    }
}
