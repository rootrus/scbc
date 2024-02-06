package com.scb.phone.view.adapter.notification;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.Unbinder;
import com.scb.phone.R;
import com.scb.phone.view.custom.common.DefaultButton;
import java.util.ArrayList;
import java.util.List;
import p040o.FragmentBuilder_BindDepositSelectorFragment;
import p040o.KtaCheckExtractor;
import p040o.getLoanOfferStatus;
import p040o.getMutualFundsDiscover;
import p040o.onCheckBoxClick;
import p040o.onStart;
import p040o.setBuildVersion;
import p040o.setLastBaselineToBottomHeight;
import p040o.setNdkPayload;

public final class NotificationAdapter extends RecyclerView.IconCompatParcelizer {
    public boolean MediaBrowserCompat$ItemReceiver = false;
    private final Context MediaMetadataCompat;
    public KtaCheckExtractor read;
    public List<setNdkPayload> write = new ArrayList();

    @FunctionalInterface
    public interface IconCompatParcelizer {
        void MediaBrowserCompat$ItemReceiver(boolean z);
    }

    public class NotificationHolder_ViewBinding implements Unbinder {
        private NotificationHolder MediaBrowserCompat$CustomActionResultReceiver;

        public NotificationHolder_ViewBinding(NotificationHolder notificationHolder, View view) {
            this.MediaBrowserCompat$CustomActionResultReceiver = notificationHolder;
            notificationHolder.readFlagView = (RelativeLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.read_flag_view, "field 'readFlagView'", RelativeLayout.class);
            notificationHolder.sentTimeTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.sent_time_textview, "field 'sentTimeTextView'", TextView.class);
            notificationHolder.subjectTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.subject_textview, "field 'subjectTextView'", TextView.class);
            notificationHolder.bodyTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.body_textview, "field 'bodyTextView'", TextView.class);
            notificationHolder.clickMessageTextView = (TextView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.click_message_textview, "field 'clickMessageTextView'", TextView.class);
            notificationHolder.deepLinkButton = (DefaultButton) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.deepLinkButton, "field 'deepLinkButton'", DefaultButton.class);
            notificationHolder.categoryView = (FrameLayout) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.category_framelayout, "field 'categoryView'", FrameLayout.class);
            notificationHolder.categoryIcon = (ImageView) onStart.MediaBrowserCompat$CustomActionResultReceiver(view, (int) R.id.category_icon_image_view, "field 'categoryIcon'", ImageView.class);
        }

        public final void read() {
            NotificationHolder notificationHolder = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (notificationHolder != null) {
                this.MediaBrowserCompat$CustomActionResultReceiver = null;
                notificationHolder.readFlagView = null;
                notificationHolder.sentTimeTextView = null;
                notificationHolder.subjectTextView = null;
                notificationHolder.bodyTextView = null;
                notificationHolder.clickMessageTextView = null;
                notificationHolder.deepLinkButton = null;
                notificationHolder.categoryView = null;
                notificationHolder.categoryIcon = null;
                return;
            }
            throw new IllegalStateException("Bindings already cleared.");
        }
    }

    public NotificationAdapter(Context context) {
        this.MediaMetadataCompat = context;
    }

    public final RecyclerView.setContentView IconCompatParcelizer(ViewGroup viewGroup, int i) {
        return new NotificationHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.f83462131493572, viewGroup, false));
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(RecyclerView.setContentView setcontentview, int i) {
        String str;
        if (setcontentview instanceof NotificationHolder) {
            NotificationHolder notificationHolder = (NotificationHolder) setcontentview;
            setNdkPayload setndkpayload = this.write.get(i);
            notificationHolder.readFlagView.setBackgroundColor(setndkpayload.RatingCompat ? -9031231 : -1);
            notificationHolder.sentTimeTextView.setText(setndkpayload.MediaBrowserCompat$SearchResultReceiver);
            notificationHolder.subjectTextView.setText(setndkpayload.f2951x50fd9e4a);
            notificationHolder.bodyTextView.setText(setndkpayload.write);
            if (!TextUtils.isEmpty(setndkpayload.MediaBrowserCompat$ItemReceiver)) {
                notificationHolder.categoryView.setVisibility(8);
                notificationHolder.categoryIcon.setVisibility(0);
                FragmentBuilder_BindDepositSelectorFragment.MediaBrowserCompat$CustomActionResultReceiver(notificationHolder.categoryIcon, setndkpayload.MediaBrowserCompat$ItemReceiver);
            } else if (!TextUtils.isEmpty(setndkpayload.IconCompatParcelizer)) {
                notificationHolder.categoryIcon.setVisibility(8);
                try {
                    Drawable write2 = setLastBaselineToBottomHeight.write(this.MediaMetadataCompat, R.drawable.shape_notification_category_payment);
                    write2.setColorFilter(Color.parseColor(setndkpayload.IconCompatParcelizer), PorterDuff.Mode.SRC);
                    notificationHolder.categoryView.setVisibility(0);
                    notificationHolder.categoryView.setBackground(write2);
                } catch (IllegalArgumentException e) {
                    onCheckBoxClick.IconCompatParcelizer(e);
                }
            } else {
                notificationHolder.categoryIcon.setVisibility(8);
                notificationHolder.categoryView.setVisibility(4);
            }
            notificationHolder.clickMessageTextView.setVisibility(8);
            notificationHolder.deepLinkButton.setVisibility(8);
            if (setndkpayload.MediaDescriptionCompat != null && !setndkpayload.MediaDescriptionCompat.isEmpty()) {
                if (!TextUtils.isEmpty(setndkpayload.MediaDescriptionCompat.get(0).read)) {
                    str = setndkpayload.MediaDescriptionCompat.get(0).read;
                } else if (!TextUtils.isEmpty(setndkpayload.MediaBrowserCompat$CustomActionResultReceiver)) {
                    str = setndkpayload.MediaBrowserCompat$CustomActionResultReceiver;
                } else {
                    str = null;
                }
                if (this.read.write(setndkpayload.MediaDescriptionCompat.get(0).IconCompatParcelizer) && str != null) {
                    notificationHolder.deepLinkButton.setVisibility(0);
                    notificationHolder.deepLinkButton.setText(str);
                    notificationHolder.deepLinkButton.setOnClickListener(new getMutualFundsDiscover(this, notificationHolder));
                }
            } else if (setndkpayload.read == setBuildVersion.RTP_ACTION_ID || setndkpayload.read == setBuildVersion.GIFT_ACTION_ID) {
                notificationHolder.deepLinkButton.setVisibility(0);
                notificationHolder.deepLinkButton.setText(setndkpayload.MediaBrowserCompat$CustomActionResultReceiver);
                notificationHolder.deepLinkButton.setOnClickListener(new getLoanOfferStatus(this, notificationHolder));
            }
        }
    }

    public final int IconCompatParcelizer() {
        return this.write.size();
    }

    public class NotificationHolder extends RecyclerView.setContentView {
        @BindView
        TextView bodyTextView;
        @BindView
        ImageView categoryIcon;
        @BindView
        FrameLayout categoryView;
        @BindView
        TextView clickMessageTextView;
        @BindView
        DefaultButton deepLinkButton;
        @BindView
        RelativeLayout readFlagView;
        @BindView
        TextView sentTimeTextView;
        @BindView
        TextView subjectTextView;

        public NotificationHolder(View view) {
            super(view);
            ButterKnife.IconCompatParcelizer(this, view);
        }
    }
}
