package com.scb.phone.view.adapter.chubb;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.squareup.picasso.Picasso;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import p040o.CrashlyticsReport;
import p040o.FragmentBuilder_BindBaseFragment;
import p040o.FragmentBuilder_BindEkycFragment;
import p040o.acceptRemittanceTc;
import p040o.confirmRemittance;
import p040o.execute;
import p040o.getICheckDeserializerRtti;
import p040o.onCheckBoxClick;
import p040o.onStart;

public final class PaymentInfoAdapter extends RecyclerView.IconCompatParcelizer {
    private FragmentBuilder_BindBaseFragment MediaBrowserCompat$ItemReceiver;
    private boolean MediaBrowserCompat$MediaItem = false;
    /* access modifiers changed from: private */
    public Context MediaBrowserCompat$SearchResultReceiver;
    private int RatingCompat = 0;
    public boolean read;
    public List<CrashlyticsReport.Session.OperatingSystem.Builder> write = new ArrayList();

    public class ViewTypeMiniQrHolder_ViewBinding implements Unbinder {
        private ViewTypeMiniQrHolder MediaBrowserCompat$CustomActionResultReceiver;

        public ViewTypeMiniQrHolder_ViewBinding(ViewTypeMiniQrHolder viewTypeMiniQrHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = viewTypeMiniQrHolder;
            viewTypeMiniQrHolder.tvTitle = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_description_text, "field 'tvTitle'", TextView.class);
            viewTypeMiniQrHolder.imageQrCode = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_image, "field 'imageQrCode'", ImageView.class);
            viewTypeMiniQrHolder.tvHeader = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_reference_id_text, "field 'tvHeader'", TextView.class);
            viewTypeMiniQrHolder.tvDescription = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.qr_code_description, "field 'tvDescription'", TextView.class);
        }

        public final void read() {
            ViewTypeMiniQrHolder viewTypeMiniQrHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (viewTypeMiniQrHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                viewTypeMiniQrHolder.tvTitle = null;
                viewTypeMiniQrHolder.imageQrCode = null;
                viewTypeMiniQrHolder.tvHeader = null;
                viewTypeMiniQrHolder.tvDescription = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ViewTypeTextAndImageHolder_ViewBinding implements Unbinder {
        private ViewTypeTextAndImageHolder MediaBrowserCompat$ItemReceiver;

        public ViewTypeTextAndImageHolder_ViewBinding(ViewTypeTextAndImageHolder viewTypeTextAndImageHolder, View view) {
            this.MediaBrowserCompat$ItemReceiver = viewTypeTextAndImageHolder;
            viewTypeTextAndImageHolder.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text_view, "field 'titleTextView'", TextView.class);
            viewTypeTextAndImageHolder.headerTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_text_view, "field 'headerTextView'", TextView.class);
            viewTypeTextAndImageHolder.descriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description_text_view, "field 'descriptionTextView'", TextView.class);
            viewTypeTextAndImageHolder.imageView = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.image_chubb, "field 'imageView'", ImageView.class);
            viewTypeTextAndImageHolder.divider = onStart.IconCompatParcelizer(view, R.id.divider, "field 'divider'");
        }

        public final void read() {
            ViewTypeTextAndImageHolder viewTypeTextAndImageHolder = this.MediaBrowserCompat$ItemReceiver;
            if (viewTypeTextAndImageHolder != null) {
                this.MediaBrowserCompat$ItemReceiver = null;
                viewTypeTextAndImageHolder.titleTextView = null;
                viewTypeTextAndImageHolder.headerTextView = null;
                viewTypeTextAndImageHolder.descriptionTextView = null;
                viewTypeTextAndImageHolder.imageView = null;
                viewTypeTextAndImageHolder.divider = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public class ViewTypeTextHolder_ViewBinding implements Unbinder {
        private ViewTypeTextHolder IconCompatParcelizer;

        public ViewTypeTextHolder_ViewBinding(ViewTypeTextHolder viewTypeTextHolder, View view) {
            this.IconCompatParcelizer = viewTypeTextHolder;
            viewTypeTextHolder.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text_view, "field 'titleTextView'", TextView.class);
            viewTypeTextHolder.headerTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.header_text_view, "field 'headerTextView'", TextView.class);
            viewTypeTextHolder.descriptionTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.description_text_view, "field 'descriptionTextView'", TextView.class);
            viewTypeTextHolder.divider = onStart.IconCompatParcelizer(view, R.id.divider, "field 'divider'");
            viewTypeTextHolder.spaceTopItem = (Space) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.space_top_item, "field 'spaceTopItem'", Space.class);
        }

        public final void read() {
            ViewTypeTextHolder viewTypeTextHolder = this.IconCompatParcelizer;
            if (viewTypeTextHolder != null) {
                this.IconCompatParcelizer = null;
                viewTypeTextHolder.titleTextView = null;
                viewTypeTextHolder.headerTextView = null;
                viewTypeTextHolder.descriptionTextView = null;
                viewTypeTextHolder.divider = null;
                viewTypeTextHolder.spaceTopItem = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public PaymentInfoAdapter(Context context) {
        this.MediaBrowserCompat$SearchResultReceiver = context;
        this.MediaBrowserCompat$ItemReceiver = null;
    }

    public PaymentInfoAdapter(Context context, FragmentBuilder_BindBaseFragment fragmentBuilder_BindBaseFragment, boolean z) {
        this.MediaBrowserCompat$SearchResultReceiver = context;
        this.MediaBrowserCompat$ItemReceiver = fragmentBuilder_BindBaseFragment;
        this.MediaBrowserCompat$MediaItem = z;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        if (i == 3) {
            return new ViewTypeMiniQrHolder(from.inflate(R.layout.f83522131493578, viewGroup, false));
        }
        if (i == 2) {
            return new ViewTypeTextAndImageHolder(from.inflate(R.layout.f83542131493580, viewGroup, false));
        }
        return new ViewTypeTextHolder(from.inflate(R.layout.f83532131493579, viewGroup, false));
    }

    public final int MediaBrowserCompat$CustomActionResultReceiver(int i) {
        if ("TEXT_WITH_IMAGE".equalsIgnoreCase(this.write.get(i).MediaBrowserCompat$MediaItem)) {
            String str = this.write.get(i).MediaBrowserCompat$ItemReceiver;
            if (str == null || !str.equals("")) {
                return 2;
            }
        }
        if ("MINI_QR".equalsIgnoreCase(this.write.get(i).MediaBrowserCompat$MediaItem)) {
            return 3;
        }
        return 1;
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        int i2;
        int i3 = 8;
        if (MediaBrowserCompat$CustomActionResultReceiver(i) == 2) {
            ViewTypeTextAndImageHolder viewTypeTextAndImageHolder = (ViewTypeTextAndImageHolder) setcontentview;
            CrashlyticsReport.Session.OperatingSystem.Builder builder = this.write.get(i);
            viewTypeTextAndImageHolder.titleTextView.setText(builder.MediaBrowserCompat$SearchResultReceiver);
            viewTypeTextAndImageHolder.headerTextView.setText(builder.MediaBrowserCompat$CustomActionResultReceiver);
            viewTypeTextAndImageHolder.descriptionTextView.setText(builder.IconCompatParcelizer);
            try {
                if (PaymentInfoAdapter.this.read) {
                    viewTypeTextAndImageHolder.imageView.setImageBitmap(Picasso.read().write(builder.MediaBrowserCompat$ItemReceiver).IconCompatParcelizer((int) R.color.f66182131099773).MediaBrowserCompat$CustomActionResultReceiver());
                } else {
                    Picasso.read().write(builder.MediaBrowserCompat$ItemReceiver).IconCompatParcelizer((int) R.color.f66182131099773).read(viewTypeTextAndImageHolder.imageView, (FragmentBuilder_BindEkycFragment) null);
                }
            } catch (IOException e) {
                onCheckBoxClick.IconCompatParcelizer(e);
            }
            View view = viewTypeTextAndImageHolder.divider;
            RecyclerView recyclerView = viewTypeTextAndImageHolder.MediaMetadataCompat;
            if (recyclerView == null) {
                i2 = -1;
            } else {
                i2 = recyclerView.MediaBrowserCompat$CustomActionResultReceiver((RecyclerView.setContentView) viewTypeTextAndImageHolder);
            }
            if (i2 != PaymentInfoAdapter.this.write.size() - 1) {
                i3 = 0;
            }
            view.setVisibility(i3);
            MediaBrowserCompat$ItemReceiver(PaymentInfoAdapter.this);
        } else if (MediaBrowserCompat$CustomActionResultReceiver(i) == 3) {
            ViewTypeMiniQrHolder viewTypeMiniQrHolder = (ViewTypeMiniQrHolder) setcontentview;
            CrashlyticsReport.Session.OperatingSystem.Builder builder2 = this.write.get(i);
            viewTypeMiniQrHolder.tvTitle.setText(builder2.MediaBrowserCompat$SearchResultReceiver);
            viewTypeMiniQrHolder.Keep = String.format("%s.jpg", new Object[]{builder2.read});
            File file = new File(new File(PaymentInfoAdapter.this.MediaBrowserCompat$SearchResultReceiver.getCacheDir(), "pullslip"), viewTypeMiniQrHolder.Keep);
            if (!file.exists()) {
                getICheckDeserializerRtti.write(builder2.read, TitleChanger.DEFAULT_ANIMATION_DELAY, TitleChanger.DEFAULT_ANIMATION_DELAY, execute.M).subscribe(new confirmRemittance(viewTypeMiniQrHolder), new acceptRemittanceTc(viewTypeMiniQrHolder));
            } else {
                viewTypeMiniQrHolder.MediaBrowserCompat$CustomActionResultReceiver(BitmapFactory.decodeFile(file.getAbsolutePath(), new BitmapFactory.Options()));
            }
            viewTypeMiniQrHolder.tvHeader.setText(builder2.MediaBrowserCompat$CustomActionResultReceiver);
            if (builder2.IconCompatParcelizer == null || builder2.IconCompatParcelizer.isEmpty()) {
                viewTypeMiniQrHolder.tvDescription.setVisibility(8);
            } else {
                viewTypeMiniQrHolder.tvDescription.setText(builder2.IconCompatParcelizer);
            }
        } else {
            ViewTypeTextHolder viewTypeTextHolder = (ViewTypeTextHolder) setcontentview;
            CrashlyticsReport.Session.OperatingSystem.Builder builder3 = this.write.get(i);
            String str = builder3.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = builder3.IconCompatParcelizer;
            viewTypeTextHolder.titleTextView.setText(builder3.MediaBrowserCompat$SearchResultReceiver);
            viewTypeTextHolder.headerTextView.setText(builder3.MediaBrowserCompat$CustomActionResultReceiver);
            viewTypeTextHolder.descriptionTextView.setText(builder3.IconCompatParcelizer);
            TextView textView = viewTypeTextHolder.titleTextView;
            String str3 = builder3.MediaBrowserCompat$SearchResultReceiver;
            textView.setVisibility(str3 == null || str3.length() == 0 ? 8 : 0);
            viewTypeTextHolder.headerTextView.setVisibility(str == null || str.length() == 0 ? 8 : 0);
            viewTypeTextHolder.descriptionTextView.setVisibility(str2 == null || str2.length() == 0 ? 8 : 0);
            if (PaymentInfoAdapter.this.MediaBrowserCompat$MediaItem) {
                viewTypeTextHolder.divider.setVisibility(8);
                if (viewTypeTextHolder.mo1614s_() > 0) {
                    viewTypeTextHolder.spaceTopItem.setVisibility(8);
                }
            } else {
                View view2 = viewTypeTextHolder.divider;
                if (viewTypeTextHolder.mo1614s_() != PaymentInfoAdapter.this.write.size() - 1) {
                    i3 = 0;
                }
                view2.setVisibility(i3);
            }
            MediaBrowserCompat$ItemReceiver(PaymentInfoAdapter.this);
        }
    }

    public final int IconCompatParcelizer() {
        List<CrashlyticsReport.Session.OperatingSystem.Builder> list = this.write;
        if (list != null) {
            return list.size();
        }
        return 0;
    }

    public class ViewTypeMiniQrHolder extends RecyclerView.setContentView {
        String Keep;
        @BindView
        public ImageView imageQrCode;
        @BindView
        TextView tvDescription;
        @BindView
        TextView tvHeader;
        @BindView
        TextView tvTitle;

        public ViewTypeMiniQrHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }

        public final void MediaBrowserCompat$CustomActionResultReceiver(Bitmap bitmap) {
            File file = new File(PaymentInfoAdapter.this.MediaBrowserCompat$SearchResultReceiver.getCacheDir(), "pullslip");
            if (!file.exists()) {
                onCheckBoxClick.read("%s created %s", file.getAbsolutePath(), Boolean.valueOf(file.mkdirs()));
            }
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(file, this.Keep), false);
                bitmap.compress(Bitmap.CompressFormat.JPEG, 70, fileOutputStream);
                fileOutputStream.close();
            } catch (IOException e) {
                onCheckBoxClick.IconCompatParcelizer(e);
            }
            this.imageQrCode.setImageBitmap(bitmap);
            PaymentInfoAdapter.MediaBrowserCompat$ItemReceiver(PaymentInfoAdapter.this);
        }
    }

    public class ViewTypeTextHolder extends RecyclerView.setContentView {
        @BindView
        TextView descriptionTextView;
        @BindView
        View divider;
        @BindView
        TextView headerTextView;
        @BindView
        Space spaceTopItem;
        @BindView
        TextView titleTextView;

        public ViewTypeTextHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public class ViewTypeTextAndImageHolder extends RecyclerView.setContentView {
        @BindView
        TextView descriptionTextView;
        @BindView
        View divider;
        @BindView
        TextView headerTextView;
        @BindView
        ImageView imageView;
        @BindView
        TextView titleTextView;

        public ViewTypeTextAndImageHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }

    public static /* synthetic */ void MediaBrowserCompat$ItemReceiver(PaymentInfoAdapter paymentInfoAdapter) {
        FragmentBuilder_BindBaseFragment fragmentBuilder_BindBaseFragment;
        int i = paymentInfoAdapter.RatingCompat + 1;
        paymentInfoAdapter.RatingCompat = i;
        List<CrashlyticsReport.Session.OperatingSystem.Builder> list = paymentInfoAdapter.write;
        if (i == (list != null ? list.size() : 0) && (fragmentBuilder_BindBaseFragment = paymentInfoAdapter.MediaBrowserCompat$ItemReceiver) != null) {
            fragmentBuilder_BindBaseFragment.MediaBrowserCompat$SearchResultReceiver();
        }
    }
}
