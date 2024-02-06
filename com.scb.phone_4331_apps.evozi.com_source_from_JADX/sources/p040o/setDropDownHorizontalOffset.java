package p040o;

import android.app.Notification;
import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.widget.RemoteViews;
import java.util.ArrayList;

/* renamed from: o.setDropDownHorizontalOffset */
public class setDropDownHorizontalOffset {

    /* renamed from: o.setDropDownHorizontalOffset$IconCompatParcelizer */
    public static class IconCompatParcelizer {
        boolean ActionMenuItemView;
        boolean AlertController$RecycleListView;
        int AppCompatActivity;
        Bitmap AppCompatDelegateImpl$ListMenuDecorView;
        boolean AppCompatDialogFragment;
        int AppCompatViewInflater;
        RemoteViews ExpandedMenuView;
        String IconCompatParcelizer;
        RemoteViews Keep;
        boolean ListMenuItemView;
        public ArrayList<setDropDownHorizontalOffset$MediaBrowserCompat$ItemReceiver> MediaBrowserCompat$CustomActionResultReceiver;
        int MediaBrowserCompat$ItemReceiver;
        boolean MediaBrowserCompat$MediaItem;
        CharSequence MediaBrowserCompat$SearchResultReceiver;

        /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
        public Context f2626x50fd9e4a;
        int MediaDescriptionCompat;
        boolean MediaMetadataCompat;
        CharSequence MediaSessionCompat$QueueItem;
        RemoteViews MediaSessionCompat$ResultReceiverWrapper;
        CharSequence MediaSessionCompat$Token;
        Bundle ParcelableVolumeInfo;
        PendingIntent PlaybackStateCompat;
        int PlaybackStateCompat$CustomAction;
        PendingIntent RatingCompat;
        String read;
        Notification setBackgroundResource;
        int setCheckable;
        int setChecked;
        ArrayList<setDropDownHorizontalOffset$MediaBrowserCompat$ItemReceiver> setContentView;
        @Deprecated
        public ArrayList<String> setExpandedFormat;
        C1479x17e19db7 setForceShowIcon;
        long setGroupDividerEnabled;
        String setHasDecor;
        Notification setIcon;
        String setItemInvoker;
        boolean setPadding;
        String setPopupCallback;
        CharSequence[] setShortcut;
        CharSequence setTitle;
        int setVisibility;
        RemoteViews write;

        public IconCompatParcelizer(Context context, String str) {
            this.MediaBrowserCompat$CustomActionResultReceiver = new ArrayList<>();
            this.setContentView = new ArrayList<>();
            this.setPadding = true;
            this.AppCompatDialogFragment = false;
            this.MediaDescriptionCompat = 0;
            this.setVisibility = 0;
            this.MediaBrowserCompat$ItemReceiver = 0;
            this.PlaybackStateCompat$CustomAction = 0;
            Notification notification = new Notification();
            this.setBackgroundResource = notification;
            this.f2626x50fd9e4a = context;
            this.IconCompatParcelizer = str;
            notification.when = System.currentTimeMillis();
            this.setBackgroundResource.audioStreamType = -1;
            this.setCheckable = 0;
            this.setExpandedFormat = new ArrayList<>();
        }

        @Deprecated
        public IconCompatParcelizer(Context context) {
            this(context, (String) null);
        }

        public IconCompatParcelizer IconCompatParcelizer(long j) {
            this.setBackgroundResource.when = j;
            return this;
        }

        public IconCompatParcelizer write(boolean z) {
            this.setPadding = z;
            return this;
        }

        public IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(int i) {
            this.setBackgroundResource.icon = i;
            return this;
        }

        public IconCompatParcelizer IconCompatParcelizer(CharSequence charSequence) {
            this.MediaSessionCompat$Token = write(charSequence);
            return this;
        }

        public IconCompatParcelizer MediaBrowserCompat$ItemReceiver(CharSequence charSequence) {
            this.MediaSessionCompat$QueueItem = write(charSequence);
            return this;
        }

        public IconCompatParcelizer IconCompatParcelizer(int i) {
            this.AppCompatActivity = i;
            return this;
        }

        public IconCompatParcelizer IconCompatParcelizer(PendingIntent pendingIntent) {
            this.RatingCompat = pendingIntent;
            return this;
        }

        public IconCompatParcelizer read(PendingIntent pendingIntent) {
            this.setBackgroundResource.deleteIntent = pendingIntent;
            return this;
        }

        public IconCompatParcelizer read(CharSequence charSequence) {
            this.setBackgroundResource.tickerText = write(charSequence);
            return this;
        }

        public IconCompatParcelizer IconCompatParcelizer(Bitmap bitmap) {
            this.AppCompatDelegateImpl$ListMenuDecorView = read(bitmap);
            return this;
        }

        private Bitmap read(Bitmap bitmap) {
            if (bitmap == null || Build.VERSION.SDK_INT >= 27) {
                return bitmap;
            }
            Resources resources = this.f2626x50fd9e4a.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(AppCompatSeekBar$MediaBrowserCompat$ItemReceiver.compat_notification_large_icon_max_width);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(AppCompatSeekBar$MediaBrowserCompat$ItemReceiver.compat_notification_large_icon_max_height);
            if (bitmap.getWidth() <= dimensionPixelSize && bitmap.getHeight() <= dimensionPixelSize2) {
                return bitmap;
            }
            double min = Math.min(((double) dimensionPixelSize) / ((double) Math.max(1, bitmap.getWidth())), ((double) dimensionPixelSize2) / ((double) Math.max(1, bitmap.getHeight())));
            return Bitmap.createScaledBitmap(bitmap, (int) Math.ceil(((double) bitmap.getWidth()) * min), (int) Math.ceil(((double) bitmap.getHeight()) * min), true);
        }

        public IconCompatParcelizer read(Uri uri) {
            this.setBackgroundResource.sound = uri;
            this.setBackgroundResource.audioStreamType = -1;
            if (Build.VERSION.SDK_INT >= 21) {
                this.setBackgroundResource.audioAttributes = new AudioAttributes.Builder().setContentType(4).setUsage(5).build();
            }
            return this;
        }

        public IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(long[] jArr) {
            this.setBackgroundResource.vibrate = jArr;
            return this;
        }

        public IconCompatParcelizer MediaBrowserCompat$ItemReceiver(int i, int i2, int i3) {
            this.setBackgroundResource.ledARGB = i;
            this.setBackgroundResource.ledOnMS = i2;
            this.setBackgroundResource.ledOffMS = i3;
            int i4 = (this.setBackgroundResource.ledOnMS == 0 || this.setBackgroundResource.ledOffMS == 0) ? 0 : 1;
            Notification notification = this.setBackgroundResource;
            notification.flags = i4 | (notification.flags & -2);
            return this;
        }

        public IconCompatParcelizer MediaBrowserCompat$CustomActionResultReceiver(boolean z) {
            write(16, z);
            return this;
        }

        public IconCompatParcelizer IconCompatParcelizer(boolean z) {
            this.AppCompatDialogFragment = z;
            return this;
        }

        public IconCompatParcelizer write(int i) {
            this.setBackgroundResource.defaults = i;
            if ((i & 4) != 0) {
                this.setBackgroundResource.flags |= 1;
            }
            return this;
        }

        private void write(int i, boolean z) {
            if (z) {
                Notification notification = this.setBackgroundResource;
                notification.flags = i | notification.flags;
                return;
            }
            Notification notification2 = this.setBackgroundResource;
            notification2.flags = (~i) & notification2.flags;
        }

        public IconCompatParcelizer MediaBrowserCompat$ItemReceiver(int i) {
            this.setCheckable = i;
            return this;
        }

        public Bundle read() {
            if (this.ParcelableVolumeInfo == null) {
                this.ParcelableVolumeInfo = new Bundle();
            }
            return this.ParcelableVolumeInfo;
        }

        public IconCompatParcelizer MediaBrowserCompat$ItemReceiver(int i, CharSequence charSequence, PendingIntent pendingIntent) {
            this.MediaBrowserCompat$CustomActionResultReceiver.add(new setDropDownHorizontalOffset$MediaBrowserCompat$ItemReceiver(i, charSequence, pendingIntent));
            return this;
        }

        public IconCompatParcelizer write(C1479x17e19db7 setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver) {
            if (this.setForceShowIcon != setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver) {
                this.setForceShowIcon = setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver;
                if (setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver != null) {
                    setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver.write(this);
                }
            }
            return this;
        }

        public IconCompatParcelizer read(int i) {
            this.MediaDescriptionCompat = i;
            return this;
        }

        public IconCompatParcelizer MediaMetadataCompat(int i) {
            this.setVisibility = i;
            return this;
        }

        public IconCompatParcelizer MediaBrowserCompat$ItemReceiver(String str) {
            this.IconCompatParcelizer = str;
            return this;
        }

        public Notification MediaBrowserCompat$ItemReceiver() {
            return new setDropDownVerticalOffset(this).MediaBrowserCompat$CustomActionResultReceiver();
        }

        protected static CharSequence write(CharSequence charSequence) {
            return (charSequence != null && charSequence.length() > 5120) ? charSequence.subSequence(0, 5120) : charSequence;
        }
    }

    /* renamed from: o.setDropDownHorizontalOffset$write */
    public static class write extends C1479x17e19db7 {
        private Bitmap MediaBrowserCompat$CustomActionResultReceiver;
        private boolean MediaBrowserCompat$MediaItem;
        private Bitmap MediaMetadataCompat;

        public write MediaBrowserCompat$ItemReceiver(Bitmap bitmap) {
            this.MediaMetadataCompat = bitmap;
            return this;
        }

        public write IconCompatParcelizer(Bitmap bitmap) {
            this.MediaBrowserCompat$CustomActionResultReceiver = bitmap;
            this.MediaBrowserCompat$MediaItem = true;
            return this;
        }

        public void read(proxyGetICheckDeserializerRtti proxygeticheckdeserializerrtti) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigPictureStyle bigPicture = new Notification.BigPictureStyle(proxygeticheckdeserializerrtti.IconCompatParcelizer()).setBigContentTitle(this.MediaBrowserCompat$ItemReceiver).bigPicture(this.MediaMetadataCompat);
                if (this.MediaBrowserCompat$MediaItem) {
                    bigPicture.bigLargeIcon(this.MediaBrowserCompat$CustomActionResultReceiver);
                }
                if (this.write) {
                    bigPicture.setSummaryText(this.IconCompatParcelizer);
                }
            }
        }
    }

    /* renamed from: o.setDropDownHorizontalOffset$read */
    public static class read extends C1479x17e19db7 {
        private CharSequence MediaBrowserCompat$CustomActionResultReceiver;

        public read write(CharSequence charSequence) {
            this.MediaBrowserCompat$CustomActionResultReceiver = IconCompatParcelizer.write(charSequence);
            return this;
        }

        public void read(proxyGetICheckDeserializerRtti proxygeticheckdeserializerrtti) {
            if (Build.VERSION.SDK_INT >= 16) {
                Notification.BigTextStyle bigText = new Notification.BigTextStyle(proxygeticheckdeserializerrtti.IconCompatParcelizer()).setBigContentTitle(this.MediaBrowserCompat$ItemReceiver).bigText(this.MediaBrowserCompat$CustomActionResultReceiver);
                if (this.write) {
                    bigText.setSummaryText(this.IconCompatParcelizer);
                }
            }
        }
    }

    public static Bundle IconCompatParcelizer(Notification notification) {
        if (Build.VERSION.SDK_INT >= 19) {
            return notification.extras;
        }
        if (Build.VERSION.SDK_INT >= 16) {
            return setPopupBackgroundDrawable.write(notification);
        }
        return null;
    }
}
