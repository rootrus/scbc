package com.scb.phone.view.custom.additionaldocument;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.widget.ImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.ThaiTextView;
import kotlin.TypeCastException;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.Futures;
import p040o.ListenableFuture;
import p040o.onGetStartedClick;

public final class DocumentInstructionsDetailCustomView extends ConstraintLayout {
    private final Futures.C34093 MediaBrowserCompat$CustomActionResultReceiver;
    @BindView
    public ThaiTextView detailText;
    @BindView
    public ImageView iconBottom;
    @BindView
    public ImageView iconTop;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocumentInstructionsDetailCustomView(Context context, Futures.C34093 r6) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) r6, "display");
        this.MediaBrowserCompat$CustomActionResultReceiver = r6;
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f84322131493658, this, true);
            ButterKnife.IconCompatParcelizer(this);
            Futures.C34093 r5 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (r5 instanceof Futures.ListenableFutureAdapter) {
                ThaiTextView thaiTextView = this.detailText;
                if (thaiTextView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("detailText");
                }
                thaiTextView.setText(((Futures.ListenableFutureAdapter) this.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$CustomActionResultReceiver);
                ImageView imageView = this.iconTop;
                if (imageView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("iconTop");
                }
                imageView.setImageDrawable(((Futures.ListenableFutureAdapter) this.MediaBrowserCompat$CustomActionResultReceiver).read);
                Drawable drawable = ((Futures.ListenableFutureAdapter) this.MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer;
                if (drawable != null) {
                    ImageView imageView2 = this.iconBottom;
                    if (imageView2 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("iconBottom");
                    }
                    imageView2.setVisibility(0);
                    ImageView imageView3 = this.iconBottom;
                    if (imageView3 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("iconBottom");
                    }
                    imageView3.setImageDrawable(drawable);
                }
            } else if (r5 instanceof ListenableFuture) {
                ThaiTextView thaiTextView2 = this.detailText;
                if (thaiTextView2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("detailText");
                }
                thaiTextView2.setText(((ListenableFuture) this.MediaBrowserCompat$CustomActionResultReceiver).MediaBrowserCompat$CustomActionResultReceiver);
                String str = ((ListenableFuture) this.MediaBrowserCompat$CustomActionResultReceiver).IconCompatParcelizer;
                ImageView imageView4 = this.iconTop;
                if (imageView4 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("iconTop");
                }
                getContext();
                FragmentBuilder_BindDepositSelectorFragment.read((int) R.drawable.document_upload_placeholder, imageView4, str);
                String str2 = ((ListenableFuture) this.MediaBrowserCompat$CustomActionResultReceiver).write;
                if (str2 != null) {
                    ImageView imageView5 = this.iconBottom;
                    if (imageView5 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("iconBottom");
                    }
                    imageView5.setVisibility(0);
                    ImageView imageView6 = this.iconBottom;
                    if (imageView6 == null) {
                        onGetStartedClick.MediaBrowserCompat$ItemReceiver("iconBottom");
                    }
                    getContext();
                    FragmentBuilder_BindDepositSelectorFragment.read((int) R.drawable.document_upload_placeholder, imageView6, str2);
                }
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
        }
    }

    public final void setIconTop(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.iconTop = imageView;
    }

    public final void setIconBottom(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.iconBottom = imageView;
    }

    public final void setDetailText(ThaiTextView thaiTextView) {
        onGetStartedClick.write((Object) thaiTextView, "<set-?>");
        this.detailText = thaiTextView;
    }
}
