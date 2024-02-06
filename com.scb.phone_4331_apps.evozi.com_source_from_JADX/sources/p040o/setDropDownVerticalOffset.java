package p040o;

import android.app.Notification;
import android.app.RemoteInput;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.SparseArray;
import android.widget.RemoteViews;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p040o.setDropDownHorizontalOffset;

/* renamed from: o.setDropDownVerticalOffset */
class setDropDownVerticalOffset implements proxyGetICheckDeserializerRtti {
    private RemoteViews IconCompatParcelizer;
    private final List<Bundle> MediaBrowserCompat$CustomActionResultReceiver = new ArrayList();
    private final setDropDownHorizontalOffset.IconCompatParcelizer MediaBrowserCompat$ItemReceiver;
    private int MediaBrowserCompat$MediaItem;
    private RemoteViews MediaDescriptionCompat;
    private final Bundle MediaMetadataCompat = new Bundle();
    private final Notification.Builder read;
    private RemoteViews write;

    setDropDownVerticalOffset(setDropDownHorizontalOffset.IconCompatParcelizer iconCompatParcelizer) {
        this.MediaBrowserCompat$ItemReceiver = iconCompatParcelizer;
        if (Build.VERSION.SDK_INT >= 26) {
            this.read = new Notification.Builder(iconCompatParcelizer.f2626x50fd9e4a, iconCompatParcelizer.IconCompatParcelizer);
        } else {
            this.read = new Notification.Builder(iconCompatParcelizer.f2626x50fd9e4a);
        }
        Notification notification = iconCompatParcelizer.setBackgroundResource;
        this.read.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, iconCompatParcelizer.ExpandedMenuView).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS).setOngoing((notification.flags & 2) != 0).setOnlyAlertOnce((notification.flags & 8) != 0).setAutoCancel((notification.flags & 16) != 0).setDefaults(notification.defaults).setContentTitle(iconCompatParcelizer.MediaSessionCompat$Token).setContentText(iconCompatParcelizer.MediaSessionCompat$QueueItem).setContentInfo(iconCompatParcelizer.MediaBrowserCompat$SearchResultReceiver).setContentIntent(iconCompatParcelizer.RatingCompat).setDeleteIntent(notification.deleteIntent).setFullScreenIntent(iconCompatParcelizer.PlaybackStateCompat, (notification.flags & 128) != 0).setLargeIcon(iconCompatParcelizer.AppCompatDelegateImpl$ListMenuDecorView).setNumber(iconCompatParcelizer.AppCompatActivity).setProgress(iconCompatParcelizer.AppCompatViewInflater, iconCompatParcelizer.setChecked, iconCompatParcelizer.ActionMenuItemView);
        if (Build.VERSION.SDK_INT < 21) {
            this.read.setSound(notification.sound, notification.audioStreamType);
        }
        if (Build.VERSION.SDK_INT >= 16) {
            this.read.setSubText(iconCompatParcelizer.setTitle).setUsesChronometer(iconCompatParcelizer.ListMenuItemView).setPriority(iconCompatParcelizer.setCheckable);
            Iterator<setDropDownHorizontalOffset$MediaBrowserCompat$ItemReceiver> it = iconCompatParcelizer.MediaBrowserCompat$CustomActionResultReceiver.iterator();
            while (it.hasNext()) {
                read(it.next());
            }
            if (iconCompatParcelizer.ParcelableVolumeInfo != null) {
                this.MediaMetadataCompat.putAll(iconCompatParcelizer.ParcelableVolumeInfo);
            }
            if (Build.VERSION.SDK_INT < 20) {
                if (iconCompatParcelizer.AppCompatDialogFragment) {
                    this.MediaMetadataCompat.putBoolean("android.support.localOnly", true);
                }
                if (iconCompatParcelizer.setHasDecor != null) {
                    this.MediaMetadataCompat.putString("android.support.groupKey", iconCompatParcelizer.setHasDecor);
                    if (iconCompatParcelizer.AlertController$RecycleListView) {
                        this.MediaMetadataCompat.putBoolean("android.support.isGroupSummary", true);
                    } else {
                        this.MediaMetadataCompat.putBoolean("android.support.useSideChannel", true);
                    }
                }
                if (iconCompatParcelizer.setPopupCallback != null) {
                    this.MediaMetadataCompat.putString("android.support.sortKey", iconCompatParcelizer.setPopupCallback);
                }
            }
            this.write = iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper;
            this.IconCompatParcelizer = iconCompatParcelizer.write;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            this.read.setShowWhen(iconCompatParcelizer.setPadding);
            if (Build.VERSION.SDK_INT < 21 && iconCompatParcelizer.setExpandedFormat != null && !iconCompatParcelizer.setExpandedFormat.isEmpty()) {
                this.MediaMetadataCompat.putStringArray("android.people", (String[]) iconCompatParcelizer.setExpandedFormat.toArray(new String[iconCompatParcelizer.setExpandedFormat.size()]));
            }
        }
        if (Build.VERSION.SDK_INT >= 20) {
            this.read.setLocalOnly(iconCompatParcelizer.AppCompatDialogFragment).setGroup(iconCompatParcelizer.setHasDecor).setGroupSummary(iconCompatParcelizer.AlertController$RecycleListView).setSortKey(iconCompatParcelizer.setPopupCallback);
            this.MediaBrowserCompat$MediaItem = iconCompatParcelizer.PlaybackStateCompat$CustomAction;
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.read.setCategory(iconCompatParcelizer.read).setColor(iconCompatParcelizer.MediaDescriptionCompat).setVisibility(iconCompatParcelizer.setVisibility).setPublicVersion(iconCompatParcelizer.setIcon).setSound(notification.sound, notification.audioAttributes);
            Iterator<String> it2 = iconCompatParcelizer.setExpandedFormat.iterator();
            while (it2.hasNext()) {
                this.read.addPerson(it2.next());
            }
            this.MediaDescriptionCompat = iconCompatParcelizer.Keep;
            if (iconCompatParcelizer.setContentView.size() > 0) {
                Bundle bundle = iconCompatParcelizer.read().getBundle("android.car.EXTENSIONS");
                bundle = bundle == null ? new Bundle() : bundle;
                Bundle bundle2 = new Bundle();
                for (int i = 0; i < iconCompatParcelizer.setContentView.size(); i++) {
                    bundle2.putBundle(Integer.toString(i), setPopupBackgroundDrawable.IconCompatParcelizer(iconCompatParcelizer.setContentView.get(i)));
                }
                bundle.putBundle("invisible_actions", bundle2);
                iconCompatParcelizer.read().putBundle("android.car.EXTENSIONS", bundle);
                this.MediaMetadataCompat.putBundle("android.car.EXTENSIONS", bundle);
            }
        }
        if (Build.VERSION.SDK_INT >= 24) {
            this.read.setExtras(iconCompatParcelizer.ParcelableVolumeInfo).setRemoteInputHistory(iconCompatParcelizer.setShortcut);
            if (iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper != null) {
                this.read.setCustomContentView(iconCompatParcelizer.MediaSessionCompat$ResultReceiverWrapper);
            }
            if (iconCompatParcelizer.write != null) {
                this.read.setCustomBigContentView(iconCompatParcelizer.write);
            }
            if (iconCompatParcelizer.Keep != null) {
                this.read.setCustomHeadsUpContentView(iconCompatParcelizer.Keep);
            }
        }
        if (Build.VERSION.SDK_INT >= 26) {
            this.read.setBadgeIconType(iconCompatParcelizer.MediaBrowserCompat$ItemReceiver).setShortcutId(iconCompatParcelizer.setItemInvoker).setTimeoutAfter(iconCompatParcelizer.setGroupDividerEnabled).setGroupAlertBehavior(iconCompatParcelizer.PlaybackStateCompat$CustomAction);
            if (iconCompatParcelizer.MediaBrowserCompat$MediaItem) {
                this.read.setColorized(iconCompatParcelizer.MediaMetadataCompat);
            }
            if (!TextUtils.isEmpty(iconCompatParcelizer.IconCompatParcelizer)) {
                this.read.setSound((Uri) null).setDefaults(0).setLights(0, 0, 0).setVibrate((long[]) null);
            }
        }
    }

    public Notification.Builder IconCompatParcelizer() {
        return this.read;
    }

    public Notification MediaBrowserCompat$CustomActionResultReceiver() {
        Bundle IconCompatParcelizer2;
        RemoteViews write2;
        RemoteViews IconCompatParcelizer3;
        C1479x17e19db7 setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver = this.MediaBrowserCompat$ItemReceiver.setForceShowIcon;
        if (setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver != null) {
            setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver.read(this);
        }
        RemoteViews MediaBrowserCompat$CustomActionResultReceiver2 = setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver != null ? setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver(this) : null;
        Notification read2 = read();
        if (MediaBrowserCompat$CustomActionResultReceiver2 != null) {
            read2.contentView = MediaBrowserCompat$CustomActionResultReceiver2;
        } else if (this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper != null) {
            read2.contentView = this.MediaBrowserCompat$ItemReceiver.MediaSessionCompat$ResultReceiverWrapper;
        }
        if (!(Build.VERSION.SDK_INT < 16 || setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver == null || (IconCompatParcelizer3 = setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer(this)) == null)) {
            read2.bigContentView = IconCompatParcelizer3;
        }
        if (!(Build.VERSION.SDK_INT < 21 || setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver == null || (write2 = this.MediaBrowserCompat$ItemReceiver.setForceShowIcon.write((proxyGetICheckDeserializerRtti) this)) == null)) {
            read2.headsUpContentView = write2;
        }
        if (!(Build.VERSION.SDK_INT < 16 || setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver == null || (IconCompatParcelizer2 = setDropDownHorizontalOffset.IconCompatParcelizer(read2)) == null)) {
            setdropdownhorizontaloffset_mediabrowsercompat_customactionresultreceiver.write(IconCompatParcelizer2);
        }
        return read2;
    }

    private void read(setDropDownHorizontalOffset$MediaBrowserCompat$ItemReceiver setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver) {
        Bundle bundle;
        if (Build.VERSION.SDK_INT >= 20) {
            Notification.Action.Builder builder = new Notification.Action.Builder(setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.write(), setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaMetadataCompat(), setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaBrowserCompat$CustomActionResultReceiver());
            if (setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.RatingCompat() != null) {
                for (RemoteInput addRemoteInput : C1133x65c1ec57.MediaBrowserCompat$CustomActionResultReceiver(setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.RatingCompat())) {
                    builder.addRemoteInput(addRemoteInput);
                }
            }
            if (setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver() != null) {
                bundle = new Bundle(setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaBrowserCompat$ItemReceiver());
            } else {
                bundle = new Bundle();
            }
            bundle.putBoolean("android.support.allowGeneratedReplies", setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.IconCompatParcelizer());
            if (Build.VERSION.SDK_INT >= 24) {
                builder.setAllowGeneratedReplies(setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.IconCompatParcelizer());
            }
            bundle.putInt("android.support.action.semanticAction", setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaDescriptionCompat());
            if (Build.VERSION.SDK_INT >= 28) {
                builder.setSemanticAction(setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaDescriptionCompat());
            }
            bundle.putBoolean("android.support.action.showsUserInterface", setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver.MediaBrowserCompat$SearchResultReceiver());
            builder.addExtras(bundle);
            this.read.addAction(builder.build());
        } else if (Build.VERSION.SDK_INT >= 16) {
            this.MediaBrowserCompat$CustomActionResultReceiver.add(setPopupBackgroundDrawable.write(this.read, setdropdownhorizontaloffset_mediabrowsercompat_itemreceiver));
        }
    }

    /* access modifiers changed from: protected */
    public Notification read() {
        if (Build.VERSION.SDK_INT >= 26) {
            return this.read.build();
        }
        if (Build.VERSION.SDK_INT >= 24) {
            Notification build = this.read.build();
            if (this.MediaBrowserCompat$MediaItem != 0) {
                if (!(build.getGroup() == null || (build.flags & 512) == 0 || this.MediaBrowserCompat$MediaItem != 2)) {
                    MediaBrowserCompat$ItemReceiver(build);
                }
                if (build.getGroup() != null && (build.flags & 512) == 0 && this.MediaBrowserCompat$MediaItem == 1) {
                    MediaBrowserCompat$ItemReceiver(build);
                }
            }
            return build;
        } else if (Build.VERSION.SDK_INT >= 21) {
            this.read.setExtras(this.MediaMetadataCompat);
            Notification build2 = this.read.build();
            RemoteViews remoteViews = this.write;
            if (remoteViews != null) {
                build2.contentView = remoteViews;
            }
            RemoteViews remoteViews2 = this.IconCompatParcelizer;
            if (remoteViews2 != null) {
                build2.bigContentView = remoteViews2;
            }
            RemoteViews remoteViews3 = this.MediaDescriptionCompat;
            if (remoteViews3 != null) {
                build2.headsUpContentView = remoteViews3;
            }
            if (this.MediaBrowserCompat$MediaItem != 0) {
                if (!(build2.getGroup() == null || (build2.flags & 512) == 0 || this.MediaBrowserCompat$MediaItem != 2)) {
                    MediaBrowserCompat$ItemReceiver(build2);
                }
                if (build2.getGroup() != null && (build2.flags & 512) == 0 && this.MediaBrowserCompat$MediaItem == 1) {
                    MediaBrowserCompat$ItemReceiver(build2);
                }
            }
            return build2;
        } else if (Build.VERSION.SDK_INT >= 20) {
            this.read.setExtras(this.MediaMetadataCompat);
            Notification build3 = this.read.build();
            RemoteViews remoteViews4 = this.write;
            if (remoteViews4 != null) {
                build3.contentView = remoteViews4;
            }
            RemoteViews remoteViews5 = this.IconCompatParcelizer;
            if (remoteViews5 != null) {
                build3.bigContentView = remoteViews5;
            }
            if (this.MediaBrowserCompat$MediaItem != 0) {
                if (!(build3.getGroup() == null || (build3.flags & 512) == 0 || this.MediaBrowserCompat$MediaItem != 2)) {
                    MediaBrowserCompat$ItemReceiver(build3);
                }
                if (build3.getGroup() != null && (build3.flags & 512) == 0 && this.MediaBrowserCompat$MediaItem == 1) {
                    MediaBrowserCompat$ItemReceiver(build3);
                }
            }
            return build3;
        } else if (Build.VERSION.SDK_INT >= 19) {
            SparseArray<Bundle> MediaBrowserCompat$ItemReceiver2 = setPopupBackgroundDrawable.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            if (MediaBrowserCompat$ItemReceiver2 != null) {
                this.MediaMetadataCompat.putSparseParcelableArray("android.support.actionExtras", MediaBrowserCompat$ItemReceiver2);
            }
            this.read.setExtras(this.MediaMetadataCompat);
            Notification build4 = this.read.build();
            RemoteViews remoteViews6 = this.write;
            if (remoteViews6 != null) {
                build4.contentView = remoteViews6;
            }
            RemoteViews remoteViews7 = this.IconCompatParcelizer;
            if (remoteViews7 != null) {
                build4.bigContentView = remoteViews7;
            }
            return build4;
        } else if (Build.VERSION.SDK_INT < 16) {
            return this.read.getNotification();
        } else {
            Notification build5 = this.read.build();
            Bundle IconCompatParcelizer2 = setDropDownHorizontalOffset.IconCompatParcelizer(build5);
            Bundle bundle = new Bundle(this.MediaMetadataCompat);
            for (String str : this.MediaMetadataCompat.keySet()) {
                if (IconCompatParcelizer2.containsKey(str)) {
                    bundle.remove(str);
                }
            }
            IconCompatParcelizer2.putAll(bundle);
            SparseArray<Bundle> MediaBrowserCompat$ItemReceiver3 = setPopupBackgroundDrawable.MediaBrowserCompat$ItemReceiver(this.MediaBrowserCompat$CustomActionResultReceiver);
            if (MediaBrowserCompat$ItemReceiver3 != null) {
                setDropDownHorizontalOffset.IconCompatParcelizer(build5).putSparseParcelableArray("android.support.actionExtras", MediaBrowserCompat$ItemReceiver3);
            }
            RemoteViews remoteViews8 = this.write;
            if (remoteViews8 != null) {
                build5.contentView = remoteViews8;
            }
            RemoteViews remoteViews9 = this.IconCompatParcelizer;
            if (remoteViews9 != null) {
                build5.bigContentView = remoteViews9;
            }
            return build5;
        }
    }

    private void MediaBrowserCompat$ItemReceiver(Notification notification) {
        notification.sound = null;
        notification.vibrate = null;
        notification.defaults &= -2;
        notification.defaults &= -3;
    }
}
