package p040o;

import java.util.List;

/* renamed from: o.logEventAndBundle */
public final class logEventAndBundle extends getGmpAppId {
    public List<getCachedAppInstanceId> AlertController$RecycleListView;
    public String AppCompatActivity;
    public String AppCompatDelegateImpl$ListMenuDecorView;
    public String AppCompatDialogFragment;
    public String PlaybackStateCompat$CustomAction;
    public String setBackgroundResource;
    public String setContentView;
    public String setExpandedFormat;

    /* synthetic */ logEventAndBundle(logEventAndBundle$MediaBrowserCompat$ItemReceiver logeventandbundle_mediabrowsercompat_itemreceiver, byte b) {
        this(logeventandbundle_mediabrowsercompat_itemreceiver);
    }

    private logEventAndBundle(logEventAndBundle$MediaBrowserCompat$ItemReceiver logeventandbundle_mediabrowsercompat_itemreceiver) {
        super(logeventandbundle_mediabrowsercompat_itemreceiver);
        this.AppCompatActivity = logeventandbundle_mediabrowsercompat_itemreceiver.AppCompatActivity;
        this.setBackgroundResource = logeventandbundle_mediabrowsercompat_itemreceiver.setBackgroundResource;
        this.PlaybackStateCompat$CustomAction = logeventandbundle_mediabrowsercompat_itemreceiver.PlaybackStateCompat$CustomAction;
        this.AppCompatDelegateImpl$ListMenuDecorView = logeventandbundle_mediabrowsercompat_itemreceiver.setContentView;
        this.setExpandedFormat = logeventandbundle_mediabrowsercompat_itemreceiver.AppCompatViewInflater;
        this.setContentView = logeventandbundle_mediabrowsercompat_itemreceiver.AppCompatDialogFragment;
        this.AppCompatDialogFragment = logeventandbundle_mediabrowsercompat_itemreceiver.AppCompatDelegateImpl$ListMenuDecorView;
        this.AlertController$RecycleListView = logeventandbundle_mediabrowsercompat_itemreceiver.AlertController$RecycleListView;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        logEventAndBundle logeventandbundle = (logEventAndBundle) obj;
        String str = this.AppCompatActivity;
        if (str == null ? logeventandbundle.AppCompatActivity != null : !str.equals(logeventandbundle.AppCompatActivity)) {
            return false;
        }
        String str2 = this.setBackgroundResource;
        if (str2 == null ? logeventandbundle.setBackgroundResource != null : !str2.equals(logeventandbundle.setBackgroundResource)) {
            return false;
        }
        String str3 = this.PlaybackStateCompat$CustomAction;
        if (str3 == null ? logeventandbundle.PlaybackStateCompat$CustomAction != null : !str3.equals(logeventandbundle.PlaybackStateCompat$CustomAction)) {
            return false;
        }
        String str4 = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (str4 == null ? logeventandbundle.AppCompatDelegateImpl$ListMenuDecorView != null : !str4.equals(logeventandbundle.AppCompatDelegateImpl$ListMenuDecorView)) {
            return false;
        }
        String str5 = this.setExpandedFormat;
        if (str5 == null ? logeventandbundle.setExpandedFormat != null : !str5.equals(logeventandbundle.setExpandedFormat)) {
            return false;
        }
        String str6 = this.setContentView;
        if (str6 == null ? logeventandbundle.setContentView != null : !str6.equals(logeventandbundle.setContentView)) {
            return false;
        }
        String str7 = this.AppCompatDialogFragment;
        if (str7 == null ? logeventandbundle.AppCompatDialogFragment != null : !str7.equals(logeventandbundle.AppCompatDialogFragment)) {
            return false;
        }
        List<getCachedAppInstanceId> list = this.AlertController$RecycleListView;
        List<getCachedAppInstanceId> list2 = logeventandbundle.AlertController$RecycleListView;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.AppCompatActivity;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.setBackgroundResource;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.PlaybackStateCompat$CustomAction;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.AppCompatDelegateImpl$ListMenuDecorView;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.setExpandedFormat;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.setContentView;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.AppCompatDialogFragment;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        List<getCachedAppInstanceId> list = this.AlertController$RecycleListView;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }
}
