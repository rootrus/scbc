package com.scb.phone.view.activity.contactus;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.activity.BaseActivity;
import com.thunderhead.android.aspects.IntentTidInjectionContextAspect;
import p040o.AlertController$RecycleListView;
import p040o.C7241lt;
import p040o.C7506tP;
import p040o.Keep;
import p040o.MyECouponActivity_ViewBinding;
import p040o.onCheckBoxClick;
import p040o.onStart;
import p040o.setTapText;

public class ContactUsActivity extends BaseActivity {
    @BindView
    Toolbar toolbar;

    public class CustomActionBar_ViewBinding implements Unbinder {
        private CustomActionBar MediaBrowserCompat$CustomActionResultReceiver;

        public CustomActionBar_ViewBinding(CustomActionBar customActionBar, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = customActionBar;
            customActionBar.titleTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.title_text_view, "field 'titleTextView'", TextView.class);
            customActionBar.closeButton = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.close_button, "field 'closeButton'", ImageView.class);
        }

        public final void read() {
            CustomActionBar customActionBar = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (customActionBar != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                customActionBar.titleTextView = null;
                customActionBar.closeButton = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public void onCreate(Bundle bundle) {
        AlertController$RecycleListView.MediaBrowserCompat$ItemReceiver((Activity) this);
        super.onCreate(bundle);
        setContentView(R.layout.f77172131492942);
        ButterKnife.MediaBrowserCompat$ItemReceiver(this);
        read(this.toolbar);
        CustomActionBar customActionBar = new CustomActionBar(this);
        customActionBar.titleTextView.setText(R.string.contact_us);
        customActionBar.closeButton.setOnClickListener(new C7241lt(this));
        Keep B_ = mo11B_();
        if (B_ != null) {
            B_.MediaBrowserCompat$MediaItem();
            B_.MediaBrowserCompat$ItemReceiver(customActionBar.read);
        }
    }

    public /* synthetic */ void lambda$setCustomActionBar$0$ContactUsActivity(View view) {
        onBackPressed();
    }

    @OnClick
    public void onCallUsClick() {
        Intent intent = new Intent("android.intent.action.DIAL", Uri.parse("tel:+6627777777"));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public void onEmailUsClick() {
        Intent intent = new Intent("android.intent.action.SENDTO");
        intent.setData(Uri.parse("mailto:customer_service@scb.co.th"));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    @OnClick
    public void onTwitterClick() {
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("https://twitter.com/scb_thailand"));
        IntentTidInjectionContextAspect.aspectOf();
        try {
            Intent read = setTapText.write(this, intent).read();
            MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
            StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
            sb.append(read.getData());
            sb.append("\n with context ");
            sb.append(hashCode());
            MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
            startActivity(read);
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    static class CustomActionBar {
        @BindView
        ImageView closeButton;
        View read;
        @BindView
        TextView titleTextView;

        CustomActionBar(Context context) {
            View inflate = LayoutInflater.from(context).inflate(R.layout.f81332131493359, (ViewGroup) null);
            this.read = inflate;
            ButterKnife.IconCompatParcelizer(this, inflate);
        }
    }

    @OnClick
    public void onFacebookMessengerClick() {
        try {
            if (C7506tP.read.write("com.facebook.orca", this)) {
                Intent intent = new Intent("android.intent.action.VIEW", Uri.parse("fb://messaging/140733978544"));
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read = setTapText.write(this, intent).read();
                    MyECouponActivity_ViewBinding.write write = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb.append(read.getData());
                    sb.append("\n with context ");
                    sb.append(hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write, sb.toString());
                    startActivity(read);
                } catch (Throwable th) {
                    th.printStackTrace();
                }
            } else {
                Intent intent2 = new Intent("android.intent.action.VIEW", Uri.parse("https://www.facebook.com/scb.thailand/"));
                IntentTidInjectionContextAspect.aspectOf();
                try {
                    Intent read2 = setTapText.write(this, intent2).read();
                    MyECouponActivity_ViewBinding.write write2 = MyECouponActivity_ViewBinding.MediaBrowserCompat$CustomActionResultReceiver;
                    StringBuilder sb2 = new StringBuilder("Uri intercepted on Context.startActivity(Intent), modified: ");
                    sb2.append(read2.getData());
                    sb2.append("\n with context ");
                    sb2.append(hashCode());
                    MyECouponActivity_ViewBinding.IconCompatParcelizer(write2, sb2.toString());
                    startActivity(read2);
                } catch (Throwable th2) {
                    th2.printStackTrace();
                }
            }
        } catch (RuntimeException e) {
            onCheckBoxClick.IconCompatParcelizer(e);
        }
    }
}
