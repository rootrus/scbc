package p040o;

import android.content.Context;
import android.content.pm.PackageManager;
import java.util.Arrays;
import kotlin.TypeCastException;

/* renamed from: o.tP */
public class C7506tP {
    private final String ActionMenuItemView;
    public final String AlertController$RecycleListView;
    public final boolean AppCompatActivity;
    public final String AppCompatDelegateImpl$ListMenuDecorView;
    public final int AppCompatDialogFragment;
    public final boolean IconCompatParcelizer;
    public final String Keep;
    public final String MediaBrowserCompat$CustomActionResultReceiver;
    public final String MediaBrowserCompat$ItemReceiver;
    public final boolean MediaBrowserCompat$MediaItem;
    public final String MediaBrowserCompat$SearchResultReceiver;

    /* renamed from: MediaControllerCompat$MediaControllerImplApi21$ExtraBinderRequestResultReceiver */
    public final boolean f3180x50fd9e4a;
    public final isSupportFragmentClass<String> MediaDescriptionCompat;
    public final String MediaMetadataCompat;
    public final ExtendedAccountSelectorAdapter$ExtendedItemViewHolder MediaSessionCompat$QueueItem;
    public final String MediaSessionCompat$ResultReceiverWrapper;
    public final String MediaSessionCompat$Token;
    public final isSupportFragmentClass<String> ParcelableVolumeInfo;
    public final String PlaybackStateCompat;
    public final PlaceAutocompleteFragment PlaybackStateCompat$CustomAction;
    public final String RatingCompat;
    public final String read;
    public final String setBackgroundResource;
    private final String setCheckable;
    public final String setContentView;
    public final boolean setHasDecor;
    public final String write;

    public C7506tP() {
    }

    /* renamed from: o.tP$read */
    public static final class read {
        public final String[] IconCompatParcelizer;

        private read() {
        }

        public static boolean write(String str, Context context) {
            onGetStartedClick.write((Object) str, "packageName");
            onGetStartedClick.write((Object) context, "context");
            try {
                context.getPackageManager().getPackageInfo(str, 0);
                return true;
            } catch (PackageManager.NameNotFoundException unused) {
                return false;
            }
        }

        public read(String[] strArr) {
            onGetStartedClick.write((Object) strArr, "formattedCurrentAddress");
            this.IconCompatParcelizer = strArr;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) getClass(), (Object) obj != null ? obj.getClass() : null)) {
                return false;
            }
            if (obj == null) {
                throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.mailingaddress.MailingAddressDetailsEntity");
            } else if (!Arrays.equals(this.IconCompatParcelizer, ((read) obj).IconCompatParcelizer)) {
                return false;
            } else {
                return true;
            }
        }

        public int hashCode() {
            return Arrays.hashCode(this.IconCompatParcelizer);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MailingAddressDetailsEntity(formattedCurrentAddress=");
            sb.append(Arrays.toString(this.IconCompatParcelizer));
            sb.append(")");
            return sb.toString();
        }
    }

    public C7506tP(String str, String str2, int i, boolean z, boolean z2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, PlaceAutocompleteFragment placeAutocompleteFragment, String str13, String str14, String str15, String str16, String str17, ExtendedAccountSelectorAdapter$ExtendedItemViewHolder extendedAccountSelectorAdapter$ExtendedItemViewHolder, boolean z3, String str18, boolean z4, boolean z5, String str19) {
        this.read = str;
        this.PlaybackStateCompat = str2;
        this.AppCompatDialogFragment = i;
        this.AppCompatActivity = z;
        this.f3180x50fd9e4a = z2;
        this.MediaBrowserCompat$SearchResultReceiver = str3;
        this.setContentView = str4;
        this.setCheckable = str5;
        this.MediaSessionCompat$ResultReceiverWrapper = str6;
        this.MediaMetadataCompat = str7;
        this.AppCompatDelegateImpl$ListMenuDecorView = str8;
        this.ActionMenuItemView = str9;
        this.MediaSessionCompat$Token = str10;
        this.RatingCompat = str11;
        this.MediaBrowserCompat$ItemReceiver = str12;
        this.PlaybackStateCompat$CustomAction = placeAutocompleteFragment;
        this.write = str13;
        this.Keep = str14;
        this.AlertController$RecycleListView = str15;
        this.MediaDescriptionCompat = isSupportFragmentClass.MediaBrowserCompat$ItemReceiver(str16);
        this.ParcelableVolumeInfo = isSupportFragmentClass.MediaBrowserCompat$ItemReceiver(str17);
        this.MediaSessionCompat$QueueItem = extendedAccountSelectorAdapter$ExtendedItemViewHolder;
        this.setHasDecor = z3;
        this.setBackgroundResource = str18;
        this.MediaBrowserCompat$MediaItem = z4;
        this.IconCompatParcelizer = z5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str19;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C7506tP tPVar = (C7506tP) obj;
        if (this.AppCompatDialogFragment != tPVar.AppCompatDialogFragment || this.AppCompatActivity != tPVar.AppCompatActivity || this.f3180x50fd9e4a != tPVar.f3180x50fd9e4a) {
            return false;
        }
        String str = this.read;
        if (str == null ? tPVar.read != null : !str.equals(tPVar.read)) {
            return false;
        }
        String str2 = this.PlaybackStateCompat;
        if (str2 == null ? tPVar.PlaybackStateCompat != null : !str2.equals(tPVar.PlaybackStateCompat)) {
            return false;
        }
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str3 == null ? tPVar.MediaBrowserCompat$SearchResultReceiver != null : !str3.equals(tPVar.MediaBrowserCompat$SearchResultReceiver)) {
            return false;
        }
        String str4 = this.setContentView;
        if (str4 == null ? tPVar.setContentView != null : !str4.equals(tPVar.setContentView)) {
            return false;
        }
        String str5 = this.setCheckable;
        if (str5 == null ? tPVar.setCheckable != null : !str5.equals(tPVar.setCheckable)) {
            return false;
        }
        String str6 = this.MediaSessionCompat$ResultReceiverWrapper;
        if (str6 == null ? tPVar.MediaSessionCompat$ResultReceiverWrapper != null : !str6.equals(tPVar.MediaSessionCompat$ResultReceiverWrapper)) {
            return false;
        }
        String str7 = this.MediaMetadataCompat;
        if (str7 == null ? tPVar.MediaMetadataCompat != null : !str7.equals(tPVar.MediaMetadataCompat)) {
            return false;
        }
        String str8 = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (str8 == null ? tPVar.AppCompatDelegateImpl$ListMenuDecorView != null : !str8.equals(tPVar.AppCompatDelegateImpl$ListMenuDecorView)) {
            return false;
        }
        String str9 = this.ActionMenuItemView;
        if (str9 == null ? tPVar.ActionMenuItemView != null : !str9.equals(tPVar.ActionMenuItemView)) {
            return false;
        }
        String str10 = this.MediaSessionCompat$Token;
        if (str10 == null ? tPVar.MediaSessionCompat$Token != null : !str10.equals(tPVar.MediaSessionCompat$Token)) {
            return false;
        }
        String str11 = this.RatingCompat;
        if (str11 == null ? tPVar.RatingCompat != null : !str11.equals(tPVar.RatingCompat)) {
            return false;
        }
        String str12 = this.MediaBrowserCompat$ItemReceiver;
        if (str12 == null ? tPVar.MediaBrowserCompat$ItemReceiver != null : !str12.equals(tPVar.MediaBrowserCompat$ItemReceiver)) {
            return false;
        }
        if (this.PlaybackStateCompat$CustomAction != tPVar.PlaybackStateCompat$CustomAction) {
            return false;
        }
        String str13 = this.write;
        if (str13 == null ? tPVar.write != null : !str13.equals(tPVar.write)) {
            return false;
        }
        String str14 = this.Keep;
        if (str14 == null ? tPVar.Keep != null : !str14.equals(tPVar.Keep)) {
            return false;
        }
        String str15 = this.AlertController$RecycleListView;
        if (str15 == null ? tPVar.AlertController$RecycleListView != null : !str15.equals(tPVar.AlertController$RecycleListView)) {
            return false;
        }
        isSupportFragmentClass<String> issupportfragmentclass = this.MediaDescriptionCompat;
        if (issupportfragmentclass == null ? tPVar.MediaDescriptionCompat != null : !issupportfragmentclass.equals(tPVar.MediaDescriptionCompat)) {
            return false;
        }
        isSupportFragmentClass<String> issupportfragmentclass2 = this.ParcelableVolumeInfo;
        if (issupportfragmentclass2 == null ? tPVar.ParcelableVolumeInfo != null : !issupportfragmentclass2.equals(tPVar.ParcelableVolumeInfo)) {
            return false;
        }
        if ((!this.setHasDecor) == tPVar.setHasDecor) {
            return false;
        }
        String str16 = this.setBackgroundResource;
        if (str16 == null ? tPVar.setBackgroundResource != null : !str16.equals(tPVar.setBackgroundResource)) {
            return false;
        }
        if (this.MediaBrowserCompat$MediaItem != tPVar.MediaBrowserCompat$MediaItem || this.IconCompatParcelizer != tPVar.IconCompatParcelizer) {
            return false;
        }
        String str17 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str17 == null ? tPVar.MediaBrowserCompat$CustomActionResultReceiver != null : !str17.equals(tPVar.MediaBrowserCompat$CustomActionResultReceiver)) {
            return false;
        }
        ExtendedAccountSelectorAdapter$ExtendedItemViewHolder extendedAccountSelectorAdapter$ExtendedItemViewHolder = this.MediaSessionCompat$QueueItem;
        ExtendedAccountSelectorAdapter$ExtendedItemViewHolder extendedAccountSelectorAdapter$ExtendedItemViewHolder2 = tPVar.MediaSessionCompat$QueueItem;
        if (extendedAccountSelectorAdapter$ExtendedItemViewHolder != null) {
            return extendedAccountSelectorAdapter$ExtendedItemViewHolder.equals(extendedAccountSelectorAdapter$ExtendedItemViewHolder2);
        }
        if (extendedAccountSelectorAdapter$ExtendedItemViewHolder2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.read;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.PlaybackStateCompat;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        int i = this.AppCompatDialogFragment;
        boolean z = this.AppCompatActivity;
        boolean z2 = this.f3180x50fd9e4a;
        String str3 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.setContentView;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.setCheckable;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaSessionCompat$ResultReceiverWrapper;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.MediaMetadataCompat;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        String str8 = this.AppCompatDelegateImpl$ListMenuDecorView;
        int hashCode8 = str8 != null ? str8.hashCode() : 0;
        String str9 = this.ActionMenuItemView;
        int hashCode9 = str9 != null ? str9.hashCode() : 0;
        String str10 = this.MediaSessionCompat$Token;
        int hashCode10 = str10 != null ? str10.hashCode() : 0;
        String str11 = this.RatingCompat;
        int hashCode11 = str11 != null ? str11.hashCode() : 0;
        String str12 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode12 = str12 != null ? str12.hashCode() : 0;
        PlaceAutocompleteFragment placeAutocompleteFragment = this.PlaybackStateCompat$CustomAction;
        int hashCode13 = placeAutocompleteFragment != null ? placeAutocompleteFragment.hashCode() : 0;
        String str13 = this.write;
        int hashCode14 = str13 != null ? str13.hashCode() : 0;
        String str14 = this.Keep;
        int hashCode15 = str14 != null ? str14.hashCode() : 0;
        String str15 = this.AlertController$RecycleListView;
        int hashCode16 = str15 != null ? str15.hashCode() : 0;
        isSupportFragmentClass<String> issupportfragmentclass = this.MediaDescriptionCompat;
        int hashCode17 = issupportfragmentclass != null ? issupportfragmentclass.hashCode() : 0;
        isSupportFragmentClass<String> issupportfragmentclass2 = this.ParcelableVolumeInfo;
        int hashCode18 = issupportfragmentclass2 != null ? issupportfragmentclass2.hashCode() : 0;
        ExtendedAccountSelectorAdapter$ExtendedItemViewHolder extendedAccountSelectorAdapter$ExtendedItemViewHolder = this.MediaSessionCompat$QueueItem;
        int hashCode19 = extendedAccountSelectorAdapter$ExtendedItemViewHolder != null ? extendedAccountSelectorAdapter$ExtendedItemViewHolder.hashCode() : 0;
        String str16 = this.setBackgroundResource;
        int hashCode20 = str16 != null ? str16.hashCode() : 0;
        boolean z3 = this.MediaBrowserCompat$MediaItem;
        boolean z4 = this.IconCompatParcelizer;
        boolean z5 = this.setHasDecor;
        String str17 = this.MediaBrowserCompat$CustomActionResultReceiver;
        return (((((((((((((((((((((((((((((((((((((((((((((((((((hashCode * 31) + hashCode2) * 31) + i) * 31) + (z ? 1 : 0)) * 31) + (z2 ? 1 : 0)) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + hashCode10) * 31) + hashCode11) * 31) + hashCode12) * 31) + hashCode13) * 31) + hashCode14) * 31) + hashCode15) * 31) + hashCode16) * 31) + hashCode17) * 31) + hashCode18) * 31) + hashCode19) * 31) + hashCode20) * 31) + (z3 ? 1 : 0)) * 31) + (z4 ? 1 : 0)) * 31) + (z5 ? 1 : 0)) * 31) + (str17 != null ? str17.hashCode() : 0);
    }
}
