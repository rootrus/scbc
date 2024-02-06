package com.scb.phone.view.custom.ntb;

import android.app.Dialog;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import butterknife.BindView;
import p040o.C7367pc;

public class NTBAdsDialog extends Dialog implements View.OnTouchListener {
    public read IconCompatParcelizer;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    /* access modifiers changed from: private */
    public String MediaBrowserCompat$SearchResultReceiver;
    /* access modifiers changed from: private */
    public Context RatingCompat;
    @BindView
    public CheckBox darkCheckBox;
    @BindView
    TextView doNotShowTextView;
    @BindView
    public ImageView ivAdsImage;
    @BindView
    public ImageView ivClose;
    @BindView
    public CheckBox lightCheckBox;
    public String read;
    public boolean write;

    public interface read {
        void IconCompatParcelizer();

        void IconCompatParcelizer(String str);

        void MediaBrowserCompat$CustomActionResultReceiver(String str);

        void read(C7367pc pcVar);
    }

    public NTBAdsDialog(Context context, String str, String str2, String str3, String str4, String str5, read read2) {
        super(context);
        this.RatingCompat = context;
        this.MediaBrowserCompat$MediaItem = str;
        this.MediaBrowserCompat$SearchResultReceiver = str2;
        this.read = str3;
        this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        this.MediaBrowserCompat$ItemReceiver = str5;
        this.IconCompatParcelizer = read2;
    }

    public static boolean read(String str) {
        return str.startsWith("scbeasy://external") || str.startsWith("scbeasy://webview");
    }

    public boolean onTouch(View view, MotionEvent motionEvent) {
        if (motionEvent.getAction() != 4) {
            return false;
        }
        dismiss();
        return true;
    }
}
