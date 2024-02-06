package p040o;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.gson.annotations.SerializedName;
import com.google.maps.android.p003ui.RotationLayout;
import com.scb.phone.domain.entity.mwpartner.EntityMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p040o.rsnAllocationRead1D;

/* renamed from: o.setApplyingOpacityToLayersEnabled */
public final class setApplyingOpacityToLayersEnabled extends setCurrentItemInternal {
    @SerializedName("consentVersion")
    private final String IconCompatParcelizer;
    @SerializedName("consentSubType")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("consentType")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("sequence")
    private final Number MediaBrowserCompat$MediaItem;
    @SerializedName("label")
    private final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("scopes")
    private final List<setFallbackResource> MediaDescriptionCompat;
    @SerializedName("contentUrl")
    private final setFailureListener MediaMetadataCompat;
    @SerializedName("webUrl")
    private final String RatingCompat;
    @SerializedName("consentSessionId")
    private final String read;
    @SerializedName("consentSessionTransactionId")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof setApplyingOpacityToLayersEnabled)) {
            return false;
        }
        setApplyingOpacityToLayersEnabled setapplyingopacitytolayersenabled = (setApplyingOpacityToLayersEnabled) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) setapplyingopacitytolayersenabled.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) setapplyingopacitytolayersenabled.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) setapplyingopacitytolayersenabled.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) setapplyingopacitytolayersenabled.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) setapplyingopacitytolayersenabled.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) setapplyingopacitytolayersenabled.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) setapplyingopacitytolayersenabled.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) setapplyingopacitytolayersenabled.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaDescriptionCompat, (Object) setapplyingopacitytolayersenabled.MediaDescriptionCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) setapplyingopacitytolayersenabled.MediaBrowserCompat$SearchResultReceiver);
    }

    public final int hashCode() {
        String str = this.read;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.write;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        Number number = this.MediaBrowserCompat$MediaItem;
        int hashCode3 = number != null ? number.hashCode() : 0;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        int hashCode4 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
        int hashCode5 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.IconCompatParcelizer;
        int hashCode6 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.RatingCompat;
        int hashCode7 = str6 != null ? str6.hashCode() : 0;
        setFailureListener setfailurelistener = this.MediaMetadataCompat;
        int hashCode8 = setfailurelistener != null ? setfailurelistener.hashCode() : 0;
        List<setFallbackResource> list = this.MediaDescriptionCompat;
        int hashCode9 = list != null ? list.hashCode() : 0;
        String str7 = this.MediaBrowserCompat$SearchResultReceiver;
        if (str7 != null) {
            i = str7.hashCode();
        }
        return (((((((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + hashCode8) * 31) + hashCode9) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("CSentInquiryEntity(consentSessionId=");
        sb.append(this.read);
        sb.append(", consentSessionTransactionId=");
        sb.append(this.write);
        sb.append(", sequence=");
        sb.append(this.MediaBrowserCompat$MediaItem);
        sb.append(", consentType=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", consentSubType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(", consentVersion=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", webUrl=");
        sb.append(this.RatingCompat);
        sb.append(", contentUrlEntity=");
        sb.append(this.MediaMetadataCompat);
        sb.append(", listScopesEntity=");
        sb.append(this.MediaDescriptionCompat);
        sb.append(", label=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    public final setJointType write() {
        String str = this.read;
        String str2 = this.write;
        Number number = this.MediaBrowserCompat$MediaItem;
        List list = null;
        Integer valueOf = number != null ? Integer.valueOf(number.intValue()) : null;
        String str3 = this.MediaBrowserCompat$ItemReceiver;
        if (str3 != null) {
            String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            String str5 = this.IconCompatParcelizer;
            String str6 = this.RatingCompat;
            setFailureListener setfailurelistener = this.MediaMetadataCompat;
            setClickable setclickable = setfailurelistener != null ? new setClickable(setfailurelistener.read, setfailurelistener.IconCompatParcelizer, setfailurelistener.MediaBrowserCompat$CustomActionResultReceiver) : null;
            List<setFallbackResource> list2 = this.MediaDescriptionCompat;
            if (list2 != null) {
                Iterable<setFallbackResource> iterable = list2;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (setFallbackResource setfallbackresource : iterable) {
                    arrayList.add(new setEndCap(setfallbackresource.write, setfallbackresource.read, setfallbackresource.MediaBrowserCompat$ItemReceiver));
                }
                list = (List) arrayList;
            }
            List list3 = list;
            String str7 = this.MediaBrowserCompat$SearchResultReceiver;
            if (str7 != null) {
                return new setJointType(str, str2, valueOf, str3, str4, str5, str6, setclickable, list3, str7);
            }
            throw new EntityMappingException("label can not be null");
        }
        throw new EntityMappingException("consentType can not be null");
    }

    /* renamed from: o.setApplyingOpacityToLayersEnabled$write */
    public static final class write {
        public RotationLayout IconCompatParcelizer;
        public final Context MediaBrowserCompat$CustomActionResultReceiver;
        private rsnElementCreate MediaBrowserCompat$ItemReceiver;
        public ViewGroup read;
        public TextView write;

        private write() {
        }

        public write(Context context) {
            this.MediaBrowserCompat$CustomActionResultReceiver = context;
            this.MediaBrowserCompat$ItemReceiver = new rsnElementCreate(this.MediaBrowserCompat$CustomActionResultReceiver.getResources());
            ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(this.MediaBrowserCompat$CustomActionResultReceiver).inflate(rsnAllocationRead1D.IconCompatParcelizer.amu_text_bubble, (ViewGroup) null);
            this.read = viewGroup;
            RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
            this.IconCompatParcelizer = rotationLayout;
            this.write = (TextView) rotationLayout.findViewById(rsnAllocationRead1D.read.amu_text);
            this.MediaBrowserCompat$ItemReceiver.IconCompatParcelizer = -1;
            IconCompatParcelizer(this.MediaBrowserCompat$ItemReceiver);
            Context context2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int i = rsnAllocationRead1D.write.amu_Bubble_TextAppearance_Dark;
            TextView textView = this.write;
            if (textView != null) {
                textView.setTextAppearance(context2, i);
            }
        }

        public final void IconCompatParcelizer(Drawable drawable) {
            this.read.setBackgroundDrawable(drawable);
            if (drawable != null) {
                Rect rect = new Rect();
                drawable.getPadding(rect);
                this.read.setPadding(rect.left, rect.top, rect.right, rect.bottom);
                return;
            }
            this.read.setPadding(0, 0, 0, 0);
        }
    }
}
