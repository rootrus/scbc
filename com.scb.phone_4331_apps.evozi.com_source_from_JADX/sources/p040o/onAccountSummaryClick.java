package p040o;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.os.Build;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatTextView;
import p040o.FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment;
import p040o.PlaybackStateCompat;

/* renamed from: o.onAccountSummaryClick */
public final class onAccountSummaryClick {
    public onAccountSummaryClick$MediaBrowserCompat$ItemReceiver IconCompatParcelizer;
    public C7296xbf02ac7d MediaBrowserCompat$CustomActionResultReceiver;
    public String MediaBrowserCompat$ItemReceiver;
    public Activity MediaBrowserCompat$MediaItem;
    private String MediaBrowserCompat$SearchResultReceiver = "";
    private String MediaDescriptionCompat = "";
    private View MediaMetadataCompat;
    public String RatingCompat;
    public PlaybackStateCompat.CustomAction read;
    public boolean write = false;

    public onAccountSummaryClick() {
    }

    public onAccountSummaryClick(String str, String str2, String str3, String str4) {
        this.RatingCompat = str;
        this.MediaBrowserCompat$ItemReceiver = str2;
        this.MediaDescriptionCompat = str3;
        this.MediaBrowserCompat$SearchResultReceiver = str4;
    }

    public final void read() {
        PlaybackStateCompat.CustomAction customAction = this.read;
        if (customAction != null && customAction.isShowing()) {
            try {
                this.read.dismiss();
            } catch (Exception e) {
                MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
            } catch (Throwable th) {
                this.read = null;
                throw th;
            }
            this.read = null;
        }
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(Activity activity) {
        this.MediaBrowserCompat$MediaItem = activity;
        if (this.write) {
            this.MediaMetadataCompat = LayoutInflater.from(AlertController$RecycleListView.MediaDescriptionCompat((Context) activity)).inflate(C6554xc460715d.th_layout_dialog_loading, (ViewGroup) null);
            if (Build.VERSION.SDK_INT == 21) {
                int color = activity.getResources().getColor(17170444);
                try {
                    TypedValue typedValue = new TypedValue();
                    AlertController$RecycleListView.MediaDescriptionCompat((Context) activity).getTheme().resolveAttribute(C6553x91db41c.thProgressBarIndicatorColor, typedValue, true);
                    color = typedValue.data;
                } catch (Exception e) {
                    MyECouponActivity_ViewBinding.MediaBrowserCompat$ItemReceiver(e);
                    MyECouponActivity_ViewBinding.write("Could not apply dialog indeterminate tint.");
                }
                ((ProgressBar) this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.oneres_loading_dialog_progress_bar)).getIndeterminateDrawable().setColorFilter(color, PorterDuff.Mode.SRC_IN);
            }
        } else {
            View inflate = LayoutInflater.from(AlertController$RecycleListView.MediaDescriptionCompat((Context) activity)).inflate(C6554xc460715d.th_layout_dialog_alert, (ViewGroup) null);
            this.MediaMetadataCompat = inflate;
            ((AppCompatTextView) inflate.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.dialog_title)).setText(this.RatingCompat);
            ((AppCompatTextView) this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.dialog_message)).setText(this.MediaBrowserCompat$ItemReceiver);
            this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_positive).setVisibility(0);
            ((AppCompatButton) this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_positive)).setText(this.MediaDescriptionCompat.equals("") ? activity.getString(17039370) : this.MediaDescriptionCompat);
        }
        C1246xea60bf60 playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver = new C1246xea60bf60(AlertController$RecycleListView.MediaDescriptionCompat((Context) activity), C1189xa6547b7b.ThunderheadAlert);
        playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.write = false;
        playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.read.MediaSessionCompat$QueueItem = this.MediaMetadataCompat;
        PlaybackStateCompat.CustomAction write2 = playbackStateCompat$CustomAction$MediaBrowserCompat$CustomActionResultReceiver.write();
        this.read = write2;
        if (!this.write) {
            write2.setOnDismissListener(new read(this.MediaBrowserCompat$CustomActionResultReceiver));
            this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_positive).setOnClickListener(new write(this.read, this.IconCompatParcelizer));
            if (!this.MediaBrowserCompat$SearchResultReceiver.isEmpty()) {
                this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_cancel).setVisibility(0);
                ((AppCompatTextView) this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_cancel)).setText(this.MediaBrowserCompat$SearchResultReceiver);
                this.MediaMetadataCompat.findViewById(FragmentBuilder_BindHmlNTBBusinessOwnerGuidelinesFragment.RatingCompat.btn_cancel).setOnClickListener(new write(this.read, (onAccountSummaryClick$MediaBrowserCompat$ItemReceiver) null));
            }
        }
        if (this.read.getWindow() != null && !activity.isFinishing()) {
            this.read.show();
        }
    }

    /* renamed from: o.onAccountSummaryClick$write */
    static class write implements View.OnClickListener {
        private PlaybackStateCompat.CustomAction MediaBrowserCompat$CustomActionResultReceiver;
        private onAccountSummaryClick$MediaBrowserCompat$ItemReceiver MediaBrowserCompat$ItemReceiver;

        write(PlaybackStateCompat.CustomAction customAction, onAccountSummaryClick$MediaBrowserCompat$ItemReceiver onaccountsummaryclick_mediabrowsercompat_itemreceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = customAction;
            this.MediaBrowserCompat$ItemReceiver = onaccountsummaryclick_mediabrowsercompat_itemreceiver;
        }

        public final void onClick(View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver.dismiss();
            onAccountSummaryClick$MediaBrowserCompat$ItemReceiver onaccountsummaryclick_mediabrowsercompat_itemreceiver = this.MediaBrowserCompat$ItemReceiver;
            if (onaccountsummaryclick_mediabrowsercompat_itemreceiver != null) {
                onaccountsummaryclick_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver();
                this.MediaBrowserCompat$ItemReceiver = null;
            }
        }
    }

    /* renamed from: o.onAccountSummaryClick$read */
    static class read implements DialogInterface.OnDismissListener {
        private C7296xbf02ac7d MediaBrowserCompat$CustomActionResultReceiver;

        read(C7296xbf02ac7d onaccountsummaryclick_mediabrowsercompat_customactionresultreceiver) {
            this.MediaBrowserCompat$CustomActionResultReceiver = onaccountsummaryclick_mediabrowsercompat_customactionresultreceiver;
        }

        public final void onDismiss(DialogInterface dialogInterface) {
            C7296xbf02ac7d onaccountsummaryclick_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (onaccountsummaryclick_mediabrowsercompat_customactionresultreceiver != null) {
                onaccountsummaryclick_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver();
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
            }
        }
    }
}
