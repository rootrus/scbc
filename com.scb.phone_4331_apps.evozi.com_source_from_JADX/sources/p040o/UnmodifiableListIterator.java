package p040o;

import android.content.SharedPreferences;
import android.content.res.Resources;
import com.scb.phone.view.activity.easycash.EasycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver;
import com.scb.phone.view.activity.juristic.JuristicRequestFormActivity;
import p040o.SignedBytes;

/* renamed from: o.UnmodifiableListIterator */
public final class UnmodifiableListIterator extends SignedBytes.LexicographicalComparator {
    private final SignedBytes.LexicographicalComparator read;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @HmlPinActivity
    public UnmodifiableListIterator(Resources resources, SharedPreferences sharedPreferences, SignedBytes.LexicographicalComparator lexicographicalComparator, @HmlRepaymentMethodAboutActivity(MediaBrowserCompat$ItemReceiver = "baseAssetsURL") String str) {
        super(resources, sharedPreferences, str);
        onGetStartedClick.write((Object) resources, "resources");
        onGetStartedClick.write((Object) sharedPreferences, "sharedPreferences");
        onGetStartedClick.write((Object) lexicographicalComparator, "assetsDisplayMapper");
        onGetStartedClick.write((Object) str, "baseAssetsURL");
        this.read = lexicographicalComparator;
    }

    public final EasycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver IconCompatParcelizer(C10833element element, String str, JuristicRequestFormActivity.read read2, boolean z) {
        String str2;
        onGetStartedClick.write((Object) element, "entity");
        onGetStartedClick.write((Object) str, "shopImage");
        onGetStartedClick.write((Object) read2, "shopTypeInfo");
        ForwardingSortedSet forwardingSortedSet = element.write;
        onGetStartedClick.IconCompatParcelizer((Object) forwardingSortedSet, "entity.owner");
        String str3 = forwardingSortedSet.MediaMetadataCompat;
        ForwardingSortedSet forwardingSortedSet2 = element.write;
        onGetStartedClick.IconCompatParcelizer((Object) forwardingSortedSet2, "entity.owner");
        String read3 = read(forwardingSortedSet2.RatingCompat, str3);
        StringBuilder sb = new StringBuilder();
        ForwardingSortedSet forwardingSortedSet3 = element.write;
        onGetStartedClick.IconCompatParcelizer((Object) forwardingSortedSet3, "entity.owner");
        String str4 = forwardingSortedSet3.IconCompatParcelizer;
        ForwardingSortedSet forwardingSortedSet4 = element.write;
        onGetStartedClick.IconCompatParcelizer((Object) forwardingSortedSet4, "entity.owner");
        sb.append(read(forwardingSortedSet4.MediaBrowserCompat$CustomActionResultReceiver, str4));
        CharSequence charSequence = read3;
        if (!(charSequence == null || charSequence.length() == 0)) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(' ');
            sb2.append(read3);
            sb2.append(' ');
            str2 = sb2.toString();
        } else {
            str2 = " ";
        }
        sb.append(str2);
        ForwardingSortedSet forwardingSortedSet5 = element.write;
        onGetStartedClick.IconCompatParcelizer((Object) forwardingSortedSet5, "entity.owner");
        String str5 = forwardingSortedSet5.MediaBrowserCompat$ItemReceiver;
        ForwardingSortedSet forwardingSortedSet6 = element.write;
        onGetStartedClick.IconCompatParcelizer((Object) forwardingSortedSet6, "entity.owner");
        sb.append(read(forwardingSortedSet6.read, str5));
        String obj = sb.toString();
        String read4 = read(read2.read, read2.MediaBrowserCompat$ItemReceiver);
        String c_ = this.read.mo26549c_("/transfer/bank-logo/014.png");
        standardElementSet standardelementset = element.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) standardelementset, "entity.bankAccount");
        String str6 = standardelementset.read;
        standardElementSet standardelementset2 = element.MediaBrowserCompat$CustomActionResultReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) standardelementset2, "entity.bankAccount");
        String MediaBrowserCompat$CustomActionResultReceiver = getICheckDeserializerRtti.MediaBrowserCompat$CustomActionResultReceiver(standardelementset2.write, z);
        unsafeCompare unsafecompare = element.MediaBrowserCompat$ItemReceiver;
        onGetStartedClick.IconCompatParcelizer((Object) unsafecompare, "entity.shop");
        return new EasycashCommonNCBConsentActivity$MediaBrowserCompat$ItemReceiver(str, c_, str6, MediaBrowserCompat$CustomActionResultReceiver, obj, unsafecompare.MediaBrowserCompat$MediaItem, read4);
    }
}
