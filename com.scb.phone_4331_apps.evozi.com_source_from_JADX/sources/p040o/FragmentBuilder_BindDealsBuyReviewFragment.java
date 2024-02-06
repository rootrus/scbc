package p040o;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.scb.phone.R;
import java.util.Arrays;
import java.util.List;
import p040o.Futures;

/* renamed from: o.FragmentBuilder_BindDealsBuyReviewFragment */
public enum FragmentBuilder_BindDealsBuyReviewFragment {
    ;
    
    public static final IconCompatParcelizer Companion = null;
    /* access modifiers changed from: private */
    public static final String KEY = "VIEW_STRATEGY";

    public abstract void IconCompatParcelizer(Context context, ImageView imageView, TextView textView, TextView textView2);

    public abstract String MediaBrowserCompat$CustomActionResultReceiver(Context context);

    public abstract List<Futures.ListenableFutureAdapter> read(Context context);

    public boolean read() {
        return true;
    }

    /* renamed from: o.FragmentBuilder_BindDealsBuyReviewFragment$read */
    static final class read extends FragmentBuilder_BindDealsBuyReviewFragment {
        read(String str) {
            super(str, 0, (byte) 0);
        }

        public final String MediaBrowserCompat$CustomActionResultReceiver(Context context) {
            onGetStartedClick.write((Object) context, "context");
            return context.getString(R.string.taking_photo_details_title_bank);
        }

        public final void IconCompatParcelizer(Context context, ImageView imageView, TextView textView, TextView textView2) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) imageView, "thumbnailImage");
            onGetStartedClick.write((Object) textView, "headerText");
            onGetStartedClick.write((Object) textView2, "descriptionText");
            imageView.setImageDrawable(setLastBaselineToBottomHeight.write(context, R.drawable.ic_bbs_thumbnail));
            textView2.setText(context.getString(R.string.taking_photo_bank_statement_description_details));
            textView.setText(context.getString(R.string.taking_photo_details_description_bank));
        }

        public final List<Futures.ListenableFutureAdapter> read(Context context) {
            onGetStartedClick.write((Object) context, "context");
            Drawable write = setLastBaselineToBottomHeight.write(context, R.drawable.ic_bs_match);
            String string = context.getString(R.string.taking_photo_details_match_bank);
            onGetStartedClick.IconCompatParcelizer((Object) string, "context.getString(R.stri…photo_details_match_bank)");
            Drawable write2 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_7mb_upload);
            String string2 = context.getString(R.string.taking_photo_details_hml_pdf_accepted_formats);
            onGetStartedClick.IconCompatParcelizer((Object) string2, "context.getString(R.stri…hml_pdf_accepted_formats)");
            Drawable write3 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_bs_visible);
            String string3 = context.getString(R.string.taking_photo_details_visible_bank);
            onGetStartedClick.IconCompatParcelizer((Object) string3, "context.getString(R.stri…oto_details_visible_bank)");
            Drawable write4 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_bs_blurry);
            String string4 = context.getString(R.string.taking_photo_details_blurry_bank);
            onGetStartedClick.IconCompatParcelizer((Object) string4, "context.getString(R.stri…hoto_details_blurry_bank)");
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

    /* renamed from: o.FragmentBuilder_BindDealsBuyReviewFragment$write */
    static final class write extends FragmentBuilder_BindDealsBuyReviewFragment {
        write(String str) {
            super(str, 1, (byte) 0);
        }

        public final String MediaBrowserCompat$CustomActionResultReceiver(Context context) {
            onGetStartedClick.write((Object) context, "context");
            return context.getString(R.string.taking_photo_details_title_bank);
        }

        public final void IconCompatParcelizer(Context context, ImageView imageView, TextView textView, TextView textView2) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) imageView, "thumbnailImage");
            onGetStartedClick.write((Object) textView, "headerText");
            onGetStartedClick.write((Object) textView2, "descriptionText");
            imageView.setImageDrawable(setLastBaselineToBottomHeight.write(context, R.drawable.ic_bbs_thumbnail));
            textView2.setText(context.getString(R.string.taking_photo_bank_statement_description_details));
            textView.setText(context.getString(R.string.taking_photo_details_description_bank));
        }

        public final List<Futures.ListenableFutureAdapter> read(Context context) {
            onGetStartedClick.write((Object) context, "context");
            Drawable write = setLastBaselineToBottomHeight.write(context, R.drawable.ic_bs_match);
            String string = context.getString(R.string.taking_photo_details_match_bank);
            onGetStartedClick.IconCompatParcelizer((Object) string, "context.getString(R.stri…photo_details_match_bank)");
            Drawable write2 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_7mb_upload);
            String string2 = context.getString(R.string.taking_photo_details_accepted_formats);
            onGetStartedClick.IconCompatParcelizer((Object) string2, "context.getString(R.stri…details_accepted_formats)");
            Drawable write3 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_bs_visible);
            String string3 = context.getString(R.string.taking_photo_details_visible_bank);
            onGetStartedClick.IconCompatParcelizer((Object) string3, "context.getString(R.stri…oto_details_visible_bank)");
            Drawable write4 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_bs_blurry);
            String string4 = context.getString(R.string.taking_photo_details_blurry_bank);
            onGetStartedClick.IconCompatParcelizer((Object) string4, "context.getString(R.stri…hoto_details_blurry_bank)");
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

    /* renamed from: o.FragmentBuilder_BindDealsBuyReviewFragment$MediaMetadataCompat */
    static final class MediaMetadataCompat extends FragmentBuilder_BindDealsBuyReviewFragment {
        MediaMetadataCompat(String str) {
            super(str, 4, (byte) 0);
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
            String string2 = context.getString(R.string.taking_photo_details_hml_pdf_accepted_formats);
            onGetStartedClick.IconCompatParcelizer((Object) string2, "context.getString(R.stri…hml_pdf_accepted_formats)");
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

    /* renamed from: o.FragmentBuilder_BindDealsBuyReviewFragment$MediaDescriptionCompat */
    static final class MediaDescriptionCompat extends FragmentBuilder_BindDealsBuyReviewFragment {
        MediaDescriptionCompat(String str) {
            super(str, 5, (byte) 0);
        }

        public final String MediaBrowserCompat$CustomActionResultReceiver(Context context) {
            onGetStartedClick.write((Object) context, "context");
            return context.getString(R.string.taking_photo_details_title_card);
        }

        public final void IconCompatParcelizer(Context context, ImageView imageView, TextView textView, TextView textView2) {
            onGetStartedClick.write((Object) context, "context");
            onGetStartedClick.write((Object) imageView, "thumbnailImage");
            onGetStartedClick.write((Object) textView, "headerText");
            onGetStartedClick.write((Object) textView2, "descriptionText");
            imageView.setImageDrawable(setLastBaselineToBottomHeight.write(context, R.drawable.ic_cid_thumbnail));
            textView2.setText(context.getString(R.string.taking_photo_details_description_details));
            textView.setText(context.getString(R.string.taking_photo_details_description_card));
        }

        public final List<Futures.ListenableFutureAdapter> read(Context context) {
            onGetStartedClick.write((Object) context, "context");
            Drawable write = setLastBaselineToBottomHeight.write(context, R.drawable.ic_card_match);
            String string = context.getString(R.string.taking_photo_details_match_card);
            onGetStartedClick.IconCompatParcelizer((Object) string, "context.getString(R.stri…photo_details_match_card)");
            Drawable write2 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_7mb_upload);
            String string2 = context.getString(R.string.taking_photo_details_hml_pdf_accepted_formats);
            onGetStartedClick.IconCompatParcelizer((Object) string2, "context.getString(R.stri…hml_pdf_accepted_formats)");
            Drawable write3 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_card_visible);
            String string3 = context.getString(R.string.taking_photo_details_visible_card);
            onGetStartedClick.IconCompatParcelizer((Object) string3, "context.getString(R.stri…oto_details_visible_card)");
            Drawable write4 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_card_blurry);
            String string4 = context.getString(R.string.taking_photo_details_blurry_card);
            onGetStartedClick.IconCompatParcelizer((Object) string4, "context.getString(R.stri…hoto_details_blurry_card)");
            Drawable write5 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_card_guideline);
            Drawable write6 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_card_guideline_wrong);
            String string5 = context.getString(R.string.taking_photo_details_photocopy_card);
            onGetStartedClick.IconCompatParcelizer((Object) string5, "context.getString(R.stri…o_details_photocopy_card)");
            Drawable write7 = setLastBaselineToBottomHeight.write(context, R.drawable.ic_document_instruction);
            String string6 = context.getString(R.string.taking_photo_details_screenshots);
            onGetStartedClick.IconCompatParcelizer((Object) string6, "context.getString(R.stri…hoto_details_screenshots)");
            Futures.ListenableFutureAdapter[] listenableFutureAdapterArr = {new Futures.ListenableFutureAdapter(write, string), new Futures.ListenableFutureAdapter(write2, string2), new Futures.ListenableFutureAdapter(write3, string3), new Futures.ListenableFutureAdapter(write4, string4), new Futures.ListenableFutureAdapter(write5, write6, string5), new Futures.ListenableFutureAdapter(write7, string6)};
            onGetStartedClick.write((Object) listenableFutureAdapterArr, "elements");
            onGetStartedClick.write((Object) listenableFutureAdapterArr, "$this$asList");
            List<Futures.ListenableFutureAdapter> asList = Arrays.asList(listenableFutureAdapterArr);
            onGetStartedClick.IconCompatParcelizer((Object) asList, "ArraysUtilJVM.asList(this)");
            return asList;
        }
    }

    /* renamed from: o.FragmentBuilder_BindDealsBuyReviewFragment$IconCompatParcelizer */
    public static final class IconCompatParcelizer {
        private IconCompatParcelizer() {
        }

        public /* synthetic */ IconCompatParcelizer(byte b) {
            this();
        }

        public static String MediaBrowserCompat$ItemReceiver() {
            return FragmentBuilder_BindDealsBuyReviewFragment.KEY;
        }
    }

    static {
        Companion = new IconCompatParcelizer((byte) 0);
        KEY = KEY;
    }
}
