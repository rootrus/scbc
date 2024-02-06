package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import kotlin.TypeCastException;
import p040o.LottieCompositionFactory;
import p040o.getTestFlag;
import p040o.setCurrentScreen;

/* renamed from: o.LottieDrawable */
public class LottieDrawable {
    @SerializedName("types")
    public List<LottieCompositionFactory.C36086> MediaBrowserCompat$ItemReceiver;

    /* renamed from: o.LottieDrawable$10 */
    public final class C361410 {
        @SerializedName("remark")
        public final String IconCompatParcelizer;
        @SerializedName("sequence")
        public final Integer MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("label")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("key")
        public final String read;
        @SerializedName("sectionInfo")
        public final List<C361713> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C361410)) {
                return false;
            }
            C361410 r3 = (C361410) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.IconCompatParcelizer;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            List<C361713> list = this.write;
            int hashCode4 = list != null ? list.hashCode() : 0;
            Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (num != null) {
                i = num.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashBusinessAndMaritalInfoComponentEntity(key=");
            sb.append(this.read);
            sb.append(", label=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", remark=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", sectionInfo=");
            sb.append(this.write);
            sb.append(", sequence=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LottieDrawable$12 */
    public final class C361612 extends setCurrentItemInternal {
        @SerializedName("component")
        public final List<C361410> MediaBrowserCompat$CustomActionResultReceiver;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C361612) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) ((C361612) obj).MediaBrowserCompat$CustomActionResultReceiver);
            }
            return true;
        }

        public final int hashCode() {
            List<C361410> list = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashBusinessAndMaritalInfoEntity(component=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LottieDrawable$13 */
    public final class C361713 {
        @SerializedName("label")
        public final String IconCompatParcelizer;
        @SerializedName("sequence")
        public final Integer MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("placeHolder")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("value")
        public final List<C361814> RatingCompat;
        @SerializedName("key")
        public final String read;
        @SerializedName("remark")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C361713)) {
                return false;
            }
            C361713 r3 = (C361713) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) r3.RatingCompat);
        }

        public final int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.write;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            Integer num = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode5 = num != null ? num.hashCode() : 0;
            List<C361814> list = this.RatingCompat;
            if (list != null) {
                i = list.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashBusinessAndMaritalInfoSectionInfoEntity(key=");
            sb.append(this.read);
            sb.append(", label=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", placeHolder=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", remark=");
            sb.append(this.write);
            sb.append(", sequence=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", value=");
            sb.append(this.RatingCompat);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LottieDrawable$14 */
    public final class C361814 {
        @SerializedName("key")
        public final List<String> IconCompatParcelizer;
        @SerializedName("rawValue")
        public final List<String> MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("sequence")
        public final Integer MediaBrowserCompat$ItemReceiver;
        @SerializedName("selectedOption")
        public final Boolean read;
        @SerializedName("displayValue")
        public final List<String> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C361814)) {
                return false;
            }
            C361814 r3 = (C361814) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            List<String> list = this.write;
            int i = 0;
            int hashCode = list != null ? list.hashCode() : 0;
            List<String> list2 = this.IconCompatParcelizer;
            int hashCode2 = list2 != null ? list2.hashCode() : 0;
            List<String> list3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode3 = list3 != null ? list3.hashCode() : 0;
            Boolean bool = this.read;
            int hashCode4 = bool != null ? bool.hashCode() : 0;
            Integer num = this.MediaBrowserCompat$ItemReceiver;
            if (num != null) {
                i = num.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashBusinessAndMaritalInfoValueEntity(displayValue=");
            sb.append(this.write);
            sb.append(", key=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", rawValue=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", selectedOption=");
            sb.append(this.read);
            sb.append(", sequence=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LottieDrawable$2 */
    public final class C36202 {
        @SerializedName("details")
        public final List<C36224> IconCompatParcelizer;
        @SerializedName("duration")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("loanAmount")
        public final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36202)) {
                return false;
            }
            C36202 r3 = (C36202) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer);
        }

        public final int hashCode() {
            String str = this.write;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            List<C36224> list = this.IconCompatParcelizer;
            if (list != null) {
                i = list.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CommercialCalculationEntity(loanAmount=");
            sb.append(this.write);
            sb.append(", duration=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", details=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LottieDrawable$7 */
    public final class C36257 {
        @SerializedName("details")
        public final List<C36224> write;

        public final boolean equals(Object obj) {
            if (this != obj) {
                return (obj instanceof C36257) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) ((C36257) obj).write);
            }
            return true;
        }

        public final int hashCode() {
            List<C36224> list = this.write;
            if (list != null) {
                return list.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasyCashMCMCCalculationEntity(details=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LottieDrawable$ColorFilterData */
    public final class ColorFilterData {
        @SerializedName("bodySequence")
        final Integer IconCompatParcelizer;
        @SerializedName("iconKey")
        final Integer MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("description")
        final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("title")
        final String RatingCompat;
        @SerializedName("activeFlag")
        final String read;
        @SerializedName("indexNumber")
        final Integer write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ColorFilterData)) {
                return false;
            }
            ColorFilterData colorFilterData = (ColorFilterData) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) colorFilterData.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.RatingCompat, (Object) colorFilterData.RatingCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) colorFilterData.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) colorFilterData.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) colorFilterData.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) colorFilterData.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            Integer num = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = num != null ? num.hashCode() : 0;
            String str = this.RatingCompat;
            int hashCode2 = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.read;
            int hashCode4 = str3 != null ? str3.hashCode() : 0;
            Integer num2 = this.write;
            int hashCode5 = num2 != null ? num2.hashCode() : 0;
            Integer num3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (num3 != null) {
                i = num3.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashLoanInfoItemBodyEntity(bodySequence=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", title=");
            sb.append(this.RatingCompat);
            sb.append(", description=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", activeFlag=");
            sb.append(this.read);
            sb.append(", indexNumber=");
            sb.append(this.write);
            sb.append(", iconKey=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LottieDrawable$16 */
    public final class C362816 {
        @SerializedName("interestRateCeiling")
        private final String IconCompatParcelizer;
        @SerializedName("factor")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("spread")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("interestRatePenalty")
        private final String read;
        @SerializedName("frontEndFee")
        private final String write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C362816)) {
                return false;
            }
            C362816 r3 = (C362816) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.write;
            if (str5 != null) {
                i = str5.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("CommercialLoanCalculationEntity(interestRateCeiling=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", interestRatePenalty=");
            sb.append(this.read);
            sb.append(", factor=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", spread=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", frontEndFee=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }
    }

    /* renamed from: o.LottieDrawable$RepeatMode */
    public final class RepeatMode {
        @SerializedName("minimumCreditLimit")
        public final String IconCompatParcelizer;
        @SerializedName("sliderInterval")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("maximumCreditLimit")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("defaultCreditLimit")
        public final String read;
        @SerializedName("availableDurations")
        public final List<String> write;

        public RepeatMode() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof RepeatMode)) {
                return false;
            }
            RepeatMode repeatMode = (RepeatMode) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) repeatMode.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) repeatMode.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) repeatMode.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) repeatMode.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) repeatMode.write);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.read;
            int hashCode3 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode4 = str4 != null ? str4.hashCode() : 0;
            List<String> list = this.write;
            if (list != null) {
                i = list.hashCode();
            }
            return (((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashMCMCOffersEntity(minimumCreditLimit=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", maximumCreditLimit=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", defaultCreditLimit=");
            sb.append(this.read);
            sb.append(", sliderInterval=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", durationOptions=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        private RepeatMode(String str, String str2, String str3, String str4, List<String> list) {
            this.IconCompatParcelizer = null;
            this.MediaBrowserCompat$ItemReceiver = null;
            this.read = null;
            this.MediaBrowserCompat$CustomActionResultReceiver = null;
            this.write = null;
        }

        private /* synthetic */ RepeatMode(byte b) {
            this((String) null, (String) null, (String) null, (String) null, (List<String>) null);
        }
    }

    /* renamed from: o.LottieDrawable$8 */
    public final class C36268 {
        @SerializedName("offers")
        public final List<RepeatMode> IconCompatParcelizer;
        @SerializedName("details")
        public final List<C36224> MediaBrowserCompat$ItemReceiver;
        @SerializedName("applicationId")
        public final String write;

        public C36268() {
            this((byte) 0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36268)) {
                return false;
            }
            C36268 r3 = (C36268) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver);
        }

        public final int hashCode() {
            List<RepeatMode> list = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = list != null ? list.hashCode() : 0;
            String str = this.write;
            int hashCode2 = str != null ? str.hashCode() : 0;
            List<C36224> list2 = this.MediaBrowserCompat$ItemReceiver;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashMCMCEntity(offers=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", applicationId=");
            sb.append(this.write);
            sb.append(", details=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(")");
            return sb.toString();
        }

        private C36268(List<RepeatMode> list, String str, List<? extends C36224> list2) {
            this.IconCompatParcelizer = null;
            this.write = null;
            this.MediaBrowserCompat$ItemReceiver = null;
        }

        private /* synthetic */ C36268(byte b) {
            this((List<RepeatMode>) null, (String) null, (List<? extends C36224>) null);
        }
    }

    /* renamed from: o.LottieDrawable$5 */
    public final class C36235 {
        @SerializedName("applicationId")
        public final String IconCompatParcelizer;
        @SerializedName("offers")
        public final List<onCompositionLoaded> MediaBrowserCompat$ItemReceiver;
        @SerializedName("details")
        public final List<C36224> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36235)) {
                return false;
            }
            C36235 r3 = (C36235) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write);
        }

        public final int hashCode() {
            List<onCompositionLoaded> list = this.MediaBrowserCompat$ItemReceiver;
            int i = 0;
            int hashCode = list != null ? list.hashCode() : 0;
            String str = this.IconCompatParcelizer;
            int hashCode2 = str != null ? str.hashCode() : 0;
            List<C36224> list2 = this.write;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashMortgageLoanEntity(offers=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", applicationId=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", details=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.LottieDrawable$5$write */
        public static final class write extends CheckEligibilityActivity implements FundFactSheetActivity<onCompositionLoaded, initForTests> {
            private /* synthetic */ C36235 write;

            /* JADX INFO: super call moved to the top of the method (can break code semantics) */
            public write(C36235 r1) {
                super(1);
                this.write = r1;
            }

            public final /* synthetic */ Object invoke(Object obj) {
                onCompositionLoaded oncompositionloaded = (onCompositionLoaded) obj;
                onGetStartedClick.write((Object) oncompositionloaded, "it");
                initForTests read = C36235.read(this.write, oncompositionloaded);
                if (read == null) {
                    onGetStartedClick.MediaBrowserCompat$ItemReceiver();
                }
                return read;
            }
        }

        /* renamed from: o.LottieDrawable$5$IconCompatParcelizer */
        public static final class IconCompatParcelizer<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                Comparable comparable = ((onCompositionLoaded) t).PlaybackStateCompat$CustomAction;
                Comparable comparable2 = ((onCompositionLoaded) t2).PlaybackStateCompat$CustomAction;
                if (comparable == comparable2) {
                    return 0;
                }
                if (comparable == null) {
                    return -1;
                }
                if (comparable2 == null) {
                    return 1;
                }
                return comparable.compareTo(comparable2);
            }
        }

        /* renamed from: o.LottieDrawable$5$read */
        public static final class read<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                Comparable valueOf = Integer.valueOf(((C36224) t).MediaBrowserCompat$CustomActionResultReceiver);
                Comparable valueOf2 = Integer.valueOf(((C36224) t2).MediaBrowserCompat$CustomActionResultReceiver);
                if (valueOf == valueOf2) {
                    return 0;
                }
                if (valueOf == null) {
                    return -1;
                }
                if (valueOf2 == null) {
                    return 1;
                }
                return valueOf.compareTo(valueOf2);
            }
        }

        public static final /* synthetic */ setDataCollectionEnabled IconCompatParcelizer(C36224 r3) {
            if (r3.IconCompatParcelizer == null || r3.MediaBrowserCompat$ItemReceiver == null) {
                return null;
            }
            C5290xc2e3dd44 setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver = new C5290xc2e3dd44((byte) 0);
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = r3.MediaBrowserCompat$CustomActionResultReceiver;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = r3.IconCompatParcelizer;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.read = r3.MediaBrowserCompat$ItemReceiver;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.write = r3.read;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver = r3.MediaBrowserCompat$MediaItem;
            setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = r3.write;
            return new setDataCollectionEnabled(setdatacollectionenabled_mediabrowsercompat_customactionresultreceiver, (byte) 0);
        }

        public static final /* synthetic */ initForTests read(C36235 r1, onCompositionLoaded oncompositionloaded) {
            if (!((oncompositionloaded == null || oncompositionloaded.MediaBrowserCompat$CustomActionResultReceiver == null || oncompositionloaded.MediaBrowserCompat$ItemReceiver == null || oncompositionloaded.read == null || oncompositionloaded.PlaybackStateCompat$CustomAction == null || oncompositionloaded.MediaSessionCompat$Token == null || oncompositionloaded.MediaSessionCompat$ResultReceiverWrapper == null || oncompositionloaded.RatingCompat == null || oncompositionloaded.Keep == null || oncompositionloaded.f2757x50fd9e4a == null) ? false : true)) {
                return null;
            }
            initForTests$MediaBrowserCompat$CustomActionResultReceiver initfortests_mediabrowsercompat_customactionresultreceiver = new initForTests$MediaBrowserCompat$CustomActionResultReceiver((byte) 0);
            initfortests_mediabrowsercompat_customactionresultreceiver.read = oncompositionloaded.MediaBrowserCompat$CustomActionResultReceiver;
            initfortests_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = oncompositionloaded.MediaBrowserCompat$ItemReceiver;
            initfortests_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = oncompositionloaded.read;
            initfortests_mediabrowsercompat_customactionresultreceiver.PlaybackStateCompat = oncompositionloaded.PlaybackStateCompat$CustomAction;
            initfortests_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$QueueItem = oncompositionloaded.MediaSessionCompat$Token;
            initfortests_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem = oncompositionloaded.MediaSessionCompat$ResultReceiverWrapper;
            initfortests_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat = oncompositionloaded.RatingCompat;
            initfortests_mediabrowsercompat_customactionresultreceiver.setHasDecor = oncompositionloaded.Keep;
            initfortests_mediabrowsercompat_customactionresultreceiver.RatingCompat = oncompositionloaded.f2757x50fd9e4a;
            getUserProperties IconCompatParcelizer2 = initfortests_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer();
            if (IconCompatParcelizer2 != null) {
                return (initForTests) IconCompatParcelizer2;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.easycash.offers.EasycashMortgageLoanOffer");
        }
    }

    /* renamed from: o.LottieDrawable$9 */
    public final class C36279 {
        @SerializedName("body")
        private final List<ColorFilterData> IconCompatParcelizer;
        @SerializedName("header")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("subHeader")
        private final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("sortSequence")
        final Integer read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36279)) {
                return false;
            }
            C36279 r3 = (C36279) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer);
        }

        public final int hashCode() {
            Integer num = this.read;
            int i = 0;
            int hashCode = num != null ? num.hashCode() : 0;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode3 = str2 != null ? str2.hashCode() : 0;
            List<ColorFilterData> list = this.IconCompatParcelizer;
            if (list != null) {
                i = list.hashCode();
            }
            return (((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashLoanInfoItemEntity(sortSequence=");
            sb.append(this.read);
            sb.append(", header=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", subHeader=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", body=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public final clearConditionalUserProperty MediaBrowserCompat$CustomActionResultReceiver() {
            List list;
            List write;
            Integer num = this.read;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            String str2 = this.MediaBrowserCompat$ItemReceiver;
            List<ColorFilterData> list2 = this.IconCompatParcelizer;
            if (list2 == null || (write = HmlNTBBusinessURLInformationActivity.write(list2, new IconCompatParcelizer())) == null) {
                list = HmlNationalIdActivity.IconCompatParcelizer;
            } else {
                Iterable<ColorFilterData> iterable = write;
                int i = 10;
                onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
                if (iterable instanceof Collection) {
                    i = ((Collection) iterable).size();
                }
                Collection arrayList = new ArrayList(i);
                for (ColorFilterData colorFilterData : iterable) {
                    arrayList.add(new beginAdUnitExposure(colorFilterData.IconCompatParcelizer, colorFilterData.RatingCompat, colorFilterData.MediaBrowserCompat$ItemReceiver, colorFilterData.read, colorFilterData.write, colorFilterData.MediaBrowserCompat$CustomActionResultReceiver));
                }
                list = (List) arrayList;
            }
            return new clearConditionalUserProperty(num, str, str2, list);
        }

        /* renamed from: o.LottieDrawable$9$IconCompatParcelizer */
        public static final class IconCompatParcelizer<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                Comparable comparable = ((ColorFilterData) t).IconCompatParcelizer;
                Comparable comparable2 = ((ColorFilterData) t2).IconCompatParcelizer;
                if (comparable == comparable2) {
                    return 0;
                }
                if (comparable == null) {
                    return -1;
                }
                if (comparable2 == null) {
                    return 1;
                }
                return comparable.compareTo(comparable2);
            }
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LottieDrawable)) {
            return false;
        }
        LottieDrawable lottieDrawable = (LottieDrawable) obj;
        List<LottieCompositionFactory.C36086> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.equals(lottieDrawable.MediaBrowserCompat$ItemReceiver);
        }
        if (lottieDrawable.MediaBrowserCompat$ItemReceiver != null) {
            return false;
        }
        return true;
    }

    /* renamed from: o.LottieDrawable$3 */
    public final class C36213 {
        @SerializedName("maximumCreditLimit")
        public final String IconCompatParcelizer;
        @SerializedName("details")
        public final List<C36224> MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("loanAmount")
        public final String MediaBrowserCompat$ItemReceiver;
        @SerializedName("sliderInterval")
        public final String MediaBrowserCompat$MediaItem;
        @SerializedName("monthlyPayment")
        public final String MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("minimumCreditLimit")
        public final String MediaMetadataCompat;
        @SerializedName("duration")
        public final String read;
        @SerializedName("availableDurations")
        public final List<String> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C36213)) {
                return false;
            }
            C36213 r3 = (C36213) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaMetadataCompat, (Object) r3.MediaMetadataCompat) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) r3.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$MediaItem, (Object) r3.MediaBrowserCompat$MediaItem) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) r3.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) r3.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.MediaMetadataCompat;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.IconCompatParcelizer;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            List<String> list = this.write;
            int hashCode3 = list != null ? list.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode4 = str3 != null ? str3.hashCode() : 0;
            String str4 = this.MediaBrowserCompat$MediaItem;
            int hashCode5 = str4 != null ? str4.hashCode() : 0;
            String str5 = this.read;
            int hashCode6 = str5 != null ? str5.hashCode() : 0;
            String str6 = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode7 = str6 != null ? str6.hashCode() : 0;
            List<C36224> list2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (list2 != null) {
                i = list2.hashCode();
            }
            return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("MHMCCalculationEntity(minimumCreditLimit=");
            sb.append(this.MediaMetadataCompat);
            sb.append(", maximumCreditLimit=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", availableDurations=");
            sb.append(this.write);
            sb.append(", loanAmount=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", sliderInterval=");
            sb.append(this.MediaBrowserCompat$MediaItem);
            sb.append(", duration=");
            sb.append(this.read);
            sb.append(", monthlyPayment=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", details=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.LottieDrawable$3$write */
        public static final class write<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                Comparable valueOf = Integer.valueOf(((C36224) t).MediaBrowserCompat$CustomActionResultReceiver);
                Comparable valueOf2 = Integer.valueOf(((C36224) t2).MediaBrowserCompat$CustomActionResultReceiver);
                if (valueOf == valueOf2) {
                    return 0;
                }
                if (valueOf == null) {
                    return -1;
                }
                if (valueOf2 == null) {
                    return 1;
                }
                return valueOf.compareTo(valueOf2);
            }
        }
    }

    /* renamed from: o.LottieDrawable$LazyCompositionTask */
    public final class LazyCompositionTask extends setCurrentItemInternal {
        @SerializedName("header")
        public final String IconCompatParcelizer;
        @SerializedName("subHeader")
        public final String read;
        @SerializedName("item")
        public final List<C36279> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LazyCompositionTask)) {
                return false;
            }
            LazyCompositionTask lazyCompositionTask = (LazyCompositionTask) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) lazyCompositionTask.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) lazyCompositionTask.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) lazyCompositionTask.write);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            List<C36279> list = this.write;
            if (list != null) {
                i = list.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashLoanInfoEntity(header=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", subHeader=");
            sb.append(this.read);
            sb.append(", item=");
            sb.append(this.write);
            sb.append(")");
            return sb.toString();
        }

        /* renamed from: o.LottieDrawable$LazyCompositionTask$IconCompatParcelizer */
        public static final class IconCompatParcelizer<T> implements Comparator<T> {
            public final int compare(T t, T t2) {
                Comparable comparable = ((C36279) t).read;
                Comparable comparable2 = ((C36279) t2).read;
                if (comparable == comparable2) {
                    return 0;
                }
                if (comparable == null) {
                    return -1;
                }
                if (comparable2 == null) {
                    return 1;
                }
                return comparable.compareTo(comparable2);
            }
        }
    }

    /* renamed from: o.LottieDrawable$15 */
    public final class C361915 {
        @SerializedName("remark")
        public final C36246 IconCompatParcelizer;
        @SerializedName("applicationId")
        public final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("offers")
        public final List<debug> write;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C361915)) {
                return false;
            }
            C361915 r3 = (C361915) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) r3.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) r3.MediaBrowserCompat$CustomActionResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) r3.IconCompatParcelizer);
        }

        public final int hashCode() {
            List<debug> list = this.write;
            int i = 0;
            int hashCode = list != null ? list.hashCode() : 0;
            String str = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str != null ? str.hashCode() : 0;
            C36246 r3 = this.IconCompatParcelizer;
            if (r3 != null) {
                i = r3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("EasycashCommercialLoanEntity(offers=");
            sb.append(this.write);
            sb.append(", applicationId=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(", remark=");
            sb.append(this.IconCompatParcelizer);
            sb.append(")");
            return sb.toString();
        }

        public static getTestFlag write(debug debug) {
            getTestFlag.read read = new getTestFlag.read((byte) 0);
            read.MediaBrowserCompat$ItemReceiver = debug.MediaBrowserCompat$ItemReceiver;
            read.IconCompatParcelizer = debug.read;
            getGmpAppId$MediaBrowserCompat$CustomActionResultReceiver getgmpappid_mediabrowsercompat_customactionresultreceiver = new getGmpAppId$MediaBrowserCompat$CustomActionResultReceiver();
            getgmpappid_mediabrowsercompat_customactionresultreceiver.write = debug.MediaBrowserCompat$MediaItem;
            getgmpappid_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$ItemReceiver = debug.write;
            getgmpappid_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer = debug.IconCompatParcelizer;
            getgmpappid_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$CustomActionResultReceiver = debug.MediaBrowserCompat$CustomActionResultReceiver;
            getgmpappid_mediabrowsercompat_customactionresultreceiver.read = debug.MediaDescriptionCompat;
            getgmpappid_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$SearchResultReceiver = debug.MediaBrowserCompat$SearchResultReceiver;
            getgmpappid_mediabrowsercompat_customactionresultreceiver.PlaybackStateCompat = debug.PlaybackStateCompat$CustomAction;
            getgmpappid_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$Token = debug.MediaSessionCompat$QueueItem;
            getgmpappid_mediabrowsercompat_customactionresultreceiver.f2860x50fd9e4a = debug.AlertController$RecycleListView;
            getgmpappid_mediabrowsercompat_customactionresultreceiver.Keep = debug.PlaybackStateCompat;
            getgmpappid_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$QueueItem = debug.MediaSessionCompat$Token;
            getgmpappid_mediabrowsercompat_customactionresultreceiver.MediaBrowserCompat$MediaItem = debug.MediaSessionCompat$ResultReceiverWrapper;
            getgmpappid_mediabrowsercompat_customactionresultreceiver.MediaMetadataCompat = debug.RatingCompat;
            getgmpappid_mediabrowsercompat_customactionresultreceiver.setHasDecor = debug.Keep;
            getgmpappid_mediabrowsercompat_customactionresultreceiver.RatingCompat = debug.f2757x50fd9e4a;
            List<setResult> list = debug.setHasDecor;
            onGetStartedClick.IconCompatParcelizer((Object) list, "easycashCommercialLoanOf…ity.repaymentMonthOptions");
            Iterable<setResult> iterable = list;
            onGetStartedClick.write((Object) iterable, "$this$collectionSizeOrDefault");
            Collection arrayList = new ArrayList(iterable instanceof Collection ? ((Collection) iterable).size() : 10);
            for (setResult setresult : iterable) {
                setCurrentScreen.write write2 = new setCurrentScreen.write();
                write2.MediaBrowserCompat$ItemReceiver = setresult.write;
                write2.MediaBrowserCompat$CustomActionResultReceiver = setresult.MediaBrowserCompat$CustomActionResultReceiver;
                write2.read = setresult.read;
                arrayList.add(new setCurrentScreen(write2, (byte) 0));
            }
            getgmpappid_mediabrowsercompat_customactionresultreceiver.MediaSessionCompat$ResultReceiverWrapper = (List) arrayList;
            getUserProperties IconCompatParcelizer2 = getgmpappid_mediabrowsercompat_customactionresultreceiver.IconCompatParcelizer();
            if (IconCompatParcelizer2 != null) {
                read.MediaBrowserCompat$CustomActionResultReceiver = (getGmpAppId) IconCompatParcelizer2;
                return new getTestFlag(read, (byte) 0);
            }
            throw new TypeCastException("null cannot be cast to non-null type com.scb.phone.domain.entity.easycash.offers.EasycashExtendedLoanOffer");
        }
    }

    public int hashCode() {
        List<LottieCompositionFactory.C36086> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }
}
