package p040o;

import android.text.TextUtils;
import com.thunderhead.android.infrastructure.server.entitys.AttributeData;
import p040o.FragmentBuilder_BindHmlNTBOfflineSuccessFragment;

/* renamed from: o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment */
public final class FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment {
    public String AlertController$RecycleListView;
    private String AppCompatActivity;
    public String AppCompatDelegateImpl$ListMenuDecorView;
    public String AppCompatDialogFragment;
    public String IconCompatParcelizer;
    public String Keep;
    public String MediaBrowserCompat$CustomActionResultReceiver;
    public int MediaBrowserCompat$ItemReceiver;
    public String MediaBrowserCompat$MediaItem;
    public String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public boolean f3145x50fd9e4a;
    public String MediaDescriptionCompat;
    public String MediaMetadataCompat;
    public boolean MediaSessionCompat$QueueItem;
    public boolean MediaSessionCompat$ResultReceiverWrapper;
    public String MediaSessionCompat$Token;
    public String ParcelableVolumeInfo;
    public boolean PlaybackStateCompat;
    public FragmentBuilder_BindHmlNTBOfflineSuccessFragment.write PlaybackStateCompat$CustomAction;
    public String RatingCompat;
    public String read;
    private String setBackgroundResource;
    public String setContentView;
    public FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment setHasDecor;
    public String write;

    public final void write(AttributeData attributeData) {
        if (attributeData != null) {
            if (!TextUtils.isEmpty(attributeData.getKeyApiName())) {
                this.AlertController$RecycleListView = attributeData.getKeyApiName();
            }
            if (!TextUtils.isEmpty(attributeData.getAlias())) {
                this.MediaBrowserCompat$CustomActionResultReceiver = attributeData.getAlias();
            }
            MediaBrowserCompat$ItemReceiver(attributeData.getId());
            this.IconCompatParcelizer = attributeData.getName();
            this.read = attributeData.getDataType();
        }
    }

    public final void MediaBrowserCompat$ItemReceiver(String str) {
        if (this.setHasDecor == null && !this.f3145x50fd9e4a) {
            this.setHasDecor = write();
        }
        if (!this.MediaMetadataCompat.equals(str)) {
            this.MediaMetadataCompat = str;
            read();
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment)) {
            return false;
        }
        FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment = (FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment) obj;
        if (this.MediaSessionCompat$QueueItem != fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaSessionCompat$QueueItem || this.MediaBrowserCompat$ItemReceiver != fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaBrowserCompat$ItemReceiver) {
            return false;
        }
        String str = this.write;
        if (str == null ? fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.write != null : !str.equals(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.write)) {
            return false;
        }
        String str2 = this.setBackgroundResource;
        if (str2 == null ? fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.setBackgroundResource != null : !str2.equals(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.setBackgroundResource)) {
            return false;
        }
        String str3 = this.MediaMetadataCompat;
        if (str3 == null ? fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaMetadataCompat != null : !str3.equals(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaMetadataCompat)) {
            return false;
        }
        String str4 = this.Keep;
        if (str4 == null ? fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.Keep != null : !str4.equals(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.Keep)) {
            return false;
        }
        String str5 = this.setContentView;
        if (str5 == null ? fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.setContentView != null : !str5.equals(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.setContentView)) {
            return false;
        }
        String str6 = this.AppCompatActivity;
        if (str6 == null ? fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.AppCompatActivity != null : !str6.equals(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.AppCompatActivity)) {
            return false;
        }
        String str7 = this.MediaDescriptionCompat;
        if (str7 == null ? fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaDescriptionCompat != null : !str7.equals(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaDescriptionCompat)) {
            return false;
        }
        String str8 = this.RatingCompat;
        if (str8 == null ? fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.RatingCompat != null : !str8.equals(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.RatingCompat)) {
            return false;
        }
        String str9 = this.MediaBrowserCompat$MediaItem;
        if (str9 == null ? fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaBrowserCompat$MediaItem != null : !str9.equals(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.MediaBrowserCompat$MediaItem)) {
            return false;
        }
        String str10 = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (str10 == null ? fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.AppCompatDelegateImpl$ListMenuDecorView != null : !str10.equals(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.AppCompatDelegateImpl$ListMenuDecorView)) {
            return false;
        }
        String str11 = this.ParcelableVolumeInfo;
        if (str11 == null ? fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.ParcelableVolumeInfo != null : !str11.equals(fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.ParcelableVolumeInfo)) {
            return false;
        }
        String str12 = this.AppCompatDialogFragment;
        String str13 = fragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.AppCompatDialogFragment;
        if (str12 != null) {
            return str12.equals(str13);
        }
        if (str13 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.Keep;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.setContentView;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.ParcelableVolumeInfo;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.AppCompatDialogFragment;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.write;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        int i2 = this.MediaBrowserCompat$ItemReceiver;
        String str6 = this.MediaSessionCompat$Token;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.AppCompatActivity;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.setBackgroundResource;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.MediaBrowserCompat$MediaItem;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.Keep;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (str11 != null) {
            i = str11.hashCode();
        }
        return (((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i2) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + i) * 31) + (this.MediaSessionCompat$QueueItem ? 1 : 0);
    }

    public FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment(String str) {
        this.MediaSessionCompat$ResultReceiverWrapper = false;
        this.IconCompatParcelizer = "";
        this.read = "";
        this.MediaBrowserCompat$SearchResultReceiver = "";
        this.MediaSessionCompat$Token = "";
        this.MediaMetadataCompat = "";
        this.MediaSessionCompat$QueueItem = true;
        this.Keep = "";
        this.AlertController$RecycleListView = "";
        this.MediaBrowserCompat$CustomActionResultReceiver = "";
        this.f3145x50fd9e4a = true;
        this.ParcelableVolumeInfo = str;
    }

    public FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment(String str, String str2, String str3, String str4, String str5, int i, String str6, boolean z, String str7, String str8, String str9, String str10, String str11, String str12, String str13) {
        this.MediaSessionCompat$ResultReceiverWrapper = false;
        this.IconCompatParcelizer = "";
        this.read = "";
        this.MediaBrowserCompat$SearchResultReceiver = "";
        this.MediaSessionCompat$Token = "";
        this.MediaMetadataCompat = "";
        this.MediaSessionCompat$QueueItem = true;
        this.Keep = "";
        this.AlertController$RecycleListView = "";
        this.MediaBrowserCompat$CustomActionResultReceiver = "";
        this.write = str;
        this.MediaMetadataCompat = str2;
        this.setBackgroundResource = str3;
        this.setContentView = str4;
        this.AppCompatActivity = str5;
        this.MediaBrowserCompat$ItemReceiver = i;
        this.MediaDescriptionCompat = str6;
        this.MediaSessionCompat$QueueItem = z;
        this.RatingCompat = str7;
        this.AppCompatDialogFragment = str8;
        this.MediaBrowserCompat$MediaItem = str9;
        this.ParcelableVolumeInfo = str10;
        this.Keep = str11;
        this.AppCompatDelegateImpl$ListMenuDecorView = str12;
        this.MediaSessionCompat$Token = str13;
    }

    private FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment(String str, String str2, String str3, String str4, String str5, int i, String str6, boolean z, String str7, String str8, String str9, String str10, String str11, String str12, String str13, byte b) {
        this.MediaSessionCompat$ResultReceiverWrapper = false;
        this.IconCompatParcelizer = "";
        this.read = "";
        this.MediaBrowserCompat$SearchResultReceiver = "";
        this.MediaSessionCompat$Token = "";
        this.MediaMetadataCompat = "";
        this.MediaSessionCompat$QueueItem = true;
        this.Keep = "";
        this.AlertController$RecycleListView = "";
        this.MediaBrowserCompat$CustomActionResultReceiver = "";
        this.setHasDecor = null;
        this.PlaybackStateCompat = false;
        this.f3145x50fd9e4a = false;
        this.write = str;
        this.MediaMetadataCompat = str2;
        this.setBackgroundResource = str3;
        this.setContentView = str4;
        this.AppCompatActivity = str5;
        this.MediaBrowserCompat$ItemReceiver = i;
        this.MediaDescriptionCompat = str6;
        this.MediaSessionCompat$QueueItem = z;
        this.RatingCompat = str7;
        this.AppCompatDialogFragment = str8;
        this.MediaBrowserCompat$MediaItem = str9;
        this.ParcelableVolumeInfo = str10;
        this.Keep = str11;
        this.AppCompatDelegateImpl$ListMenuDecorView = str12;
        this.MediaSessionCompat$Token = str13;
    }

    public final FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment write() {
        return new FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment(this.write, this.MediaMetadataCompat, this.setBackgroundResource, this.setContentView, this.AppCompatActivity, this.MediaBrowserCompat$ItemReceiver, this.MediaDescriptionCompat, this.MediaSessionCompat$QueueItem, this.RatingCompat, this.AppCompatDialogFragment, this.MediaBrowserCompat$MediaItem, this.ParcelableVolumeInfo, this.Keep, this.AppCompatDelegateImpl$ListMenuDecorView, this.MediaSessionCompat$Token, (byte) 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:35:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read() {
        /*
            r4 = this;
            java.lang.String r0 = r4.Keep
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0012
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0012
            r0 = r1
            goto L_0x0013
        L_0x0012:
            r0 = r2
        L_0x0013:
            if (r0 != 0) goto L_0x002a
            java.lang.String r0 = r4.MediaMetadataCompat
            if (r0 == 0) goto L_0x0025
            java.lang.String r0 = r0.trim()
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0025
            r0 = r1
            goto L_0x0026
        L_0x0025:
            r0 = r2
        L_0x0026:
            if (r0 != 0) goto L_0x002a
            r0 = r1
            goto L_0x002b
        L_0x002a:
            r0 = r2
        L_0x002b:
            r0 = r0 ^ r2
            o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment r3 = r4.setHasDecor
            if (r3 == 0) goto L_0x0039
            if (r0 == 0) goto L_0x0039
            boolean r3 = r4.equals(r3)
            if (r3 != 0) goto L_0x0039
            r1 = r2
        L_0x0039:
            o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment r3 = r4.setHasDecor
            if (r3 != 0) goto L_0x0040
            if (r0 == 0) goto L_0x0040
            goto L_0x0041
        L_0x0040:
            r2 = r1
        L_0x0041:
            boolean r0 = r4.PlaybackStateCompat
            if (r0 == r2) goto L_0x0054
            r4.PlaybackStateCompat = r2
            o.FragmentBuilder_BindHmlNTBOfflineSuccessFragment$write r0 = r4.PlaybackStateCompat$CustomAction
            if (r0 == 0) goto L_0x0054
            if (r2 == 0) goto L_0x0051
            r0.IconCompatParcelizer()
            return
        L_0x0051:
            r0.MediaBrowserCompat$CustomActionResultReceiver()
        L_0x0054:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.FragmentBuilder_BindHmlNTBEkycBranchInstructionFragment.read():void");
    }
}
