package com.scb.phone.view.custom.additionaldocument;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import kotlin.TypeCastException;
import p040o.FundFactSheetActivity;
import p040o.Futures;
import p040o.onGetStartedClick;

public final class DocumentUploadedCustomView extends ConstraintLayout {
    /* access modifiers changed from: private */
    public final Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer IconCompatParcelizer;
    @BindView
    public ImageView deleteIcon;
    @BindView
    public TextView name;
    private final String write;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocumentUploadedCustomView(Context context, Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer iconCompatParcelizer, String str) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
        onGetStartedClick.write((Object) iconCompatParcelizer, "display");
        onGetStartedClick.write((Object) str, "imageName");
        this.IconCompatParcelizer = iconCompatParcelizer;
        this.write = str;
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f81692131493395, this, true);
            ButterKnife.IconCompatParcelizer(this);
            TextView textView = this.name;
            if (textView == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("name");
            }
            textView.setText(this.write);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final void setDeleteIcon(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.deleteIcon = imageView;
    }

    public final void setName(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.name = textView;
    }

    static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ FundFactSheetActivity MediaBrowserCompat$CustomActionResultReceiver;
        private /* synthetic */ DocumentUploadedCustomView read;

        IconCompatParcelizer(DocumentUploadedCustomView documentUploadedCustomView, FundFactSheetActivity fundFactSheetActivity) {
            this.read = documentUploadedCustomView;
            this.MediaBrowserCompat$CustomActionResultReceiver = fundFactSheetActivity;
        }

        public final void onClick(View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver.invoke(this.read.IconCompatParcelizer);
        }
    }
}
