package com.scb.phone.view.custom.additionaldocument;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import butterknife.BindView;
import butterknife.ButterKnife;
import com.scb.phone.R;
import com.scb.phone.view.custom.additionaldocument.DocumentUploadedCustomView;
import kotlin.TypeCastException;
import p040o.FundFactSheetActivity;
import p040o.Futures;
import p040o.HmlVerifyPhoneValidateOtpActivity;
import p040o.onGetStartedClick;

public final class DocumentsUploadedSectionCustomView extends ConstraintLayout {
    @BindView
    public Button addButton;
    @BindView
    public TextView label;
    @BindView
    public LinearLayout listLayout;
    @BindView
    public ImageView questionMark;
    @BindView
    public View separator;
    @BindView
    public TextView tvRemark;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DocumentsUploadedSectionCustomView(Context context) {
        super(context);
        onGetStartedClick.write((Object) context, "context");
        Object systemService = context.getSystemService("layout_inflater");
        if (systemService != null) {
            ((LayoutInflater) systemService).inflate(R.layout.f81702131493396, this, true);
            ButterKnife.IconCompatParcelizer(this);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.view.LayoutInflater");
    }

    public final void setLabel(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.label = textView;
    }

    public final void setTvRemark(TextView textView) {
        onGetStartedClick.write((Object) textView, "<set-?>");
        this.tvRemark = textView;
    }

    public final void setQuestionMark(ImageView imageView) {
        onGetStartedClick.write((Object) imageView, "<set-?>");
        this.questionMark = imageView;
    }

    public final void setListLayout(LinearLayout linearLayout) {
        onGetStartedClick.write((Object) linearLayout, "<set-?>");
        this.listLayout = linearLayout;
    }

    public final void setAddButton(Button button) {
        onGetStartedClick.write((Object) button, "<set-?>");
        this.addButton = button;
    }

    public final void setSeparator(View view) {
        onGetStartedClick.write((Object) view, "<set-?>");
        this.separator = view;
    }

    public static final class IconCompatParcelizer implements View.OnClickListener {
        private /* synthetic */ FundFactSheetActivity IconCompatParcelizer;
        private /* synthetic */ Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer read;

        public IconCompatParcelizer(FundFactSheetActivity fundFactSheetActivity, Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer iconCompatParcelizer) {
            this.IconCompatParcelizer = fundFactSheetActivity;
            this.read = iconCompatParcelizer;
        }

        public final void onClick(View view) {
            this.IconCompatParcelizer.invoke(this.read);
        }
    }

    public final void read(Futures.ListenableFutureAdapter.C34161.IconCompatParcelizer iconCompatParcelizer, FundFactSheetActivity<? super Futures.ListenableFutureAdapter.C34161.read, HmlVerifyPhoneValidateOtpActivity> fundFactSheetActivity) {
        Context context = getContext();
        if (context != null) {
            LinearLayout linearLayout = this.listLayout;
            if (linearLayout == null) {
                onGetStartedClick.MediaBrowserCompat$ItemReceiver("listLayout");
            }
            linearLayout.removeAllViews();
            for (Futures.ListenableFutureAdapter.C34161.read read : iconCompatParcelizer.MediaSessionCompat$Token) {
                DocumentUploadedCustomView documentUploadedCustomView = new DocumentUploadedCustomView(context, iconCompatParcelizer, read.MediaBrowserCompat$CustomActionResultReceiver);
                FundFactSheetActivity documentsUploadedSectionCustomView$MediaBrowserCompat$CustomActionResultReceiver = new C5798xdcae4390(read, fundFactSheetActivity);
                onGetStartedClick.write((Object) documentsUploadedSectionCustomView$MediaBrowserCompat$CustomActionResultReceiver, "onClick");
                ImageView imageView = documentUploadedCustomView.deleteIcon;
                if (imageView == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("deleteIcon");
                }
                imageView.setOnClickListener(new DocumentUploadedCustomView.IconCompatParcelizer(documentUploadedCustomView, documentsUploadedSectionCustomView$MediaBrowserCompat$CustomActionResultReceiver));
                LinearLayout linearLayout2 = this.listLayout;
                if (linearLayout2 == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver("listLayout");
                }
                linearLayout2.addView(documentUploadedCustomView);
            }
        }
    }
}
