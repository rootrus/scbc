package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.ComputingConcurrentHashMap */
public final class ComputingConcurrentHashMap implements C4602xca7af99c {
    @SerializedName("amount")
    private final String IconCompatParcelizer;
    @SerializedName("postingType")
    private final String MediaBrowserCompat$CustomActionResultReceiver;
    @SerializedName("accountNo")
    private final String MediaBrowserCompat$ItemReceiver;
    @SerializedName("transactionType")
    private final String MediaBrowserCompat$SearchResultReceiver;
    @SerializedName("tokenId")
    private final String read;
    @SerializedName("agentCode")
    private final String write;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ComputingConcurrentHashMap)) {
            return false;
        }
        ComputingConcurrentHashMap computingConcurrentHashMap = (ComputingConcurrentHashMap) obj;
        return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$ItemReceiver, (Object) computingConcurrentHashMap.MediaBrowserCompat$ItemReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$SearchResultReceiver, (Object) computingConcurrentHashMap.MediaBrowserCompat$SearchResultReceiver) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.write, (Object) computingConcurrentHashMap.write) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) computingConcurrentHashMap.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) computingConcurrentHashMap.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) computingConcurrentHashMap.MediaBrowserCompat$CustomActionResultReceiver);
    }

    public final int hashCode() {
        String str = this.MediaBrowserCompat$ItemReceiver;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.MediaBrowserCompat$SearchResultReceiver;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.write;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.IconCompatParcelizer;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.read;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.MediaBrowserCompat$CustomActionResultReceiver;
        if (str6 != null) {
            i = str6.hashCode();
        }
        return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("GenerateQRRequest(accountNo=");
        sb.append(this.MediaBrowserCompat$ItemReceiver);
        sb.append(", transactionType=");
        sb.append(this.MediaBrowserCompat$SearchResultReceiver);
        sb.append(", agentCode=");
        sb.append(this.write);
        sb.append(", amount=");
        sb.append(this.IconCompatParcelizer);
        sb.append(", tokenId=");
        sb.append(this.read);
        sb.append(", postingType=");
        sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
        sb.append(")");
        return sb.toString();
    }

    /* renamed from: o.ComputingConcurrentHashMap$ComputationExceptionReference */
    public final class ComputationExceptionReference {
        @SerializedName("accountNumber")
        private final String IconCompatParcelizer;
        @SerializedName("function")
        private final String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("limitAmount")
        private final String read;

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ComputationExceptionReference)) {
                return false;
            }
            ComputationExceptionReference computationExceptionReference = (ComputationExceptionReference) obj;
            return onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.IconCompatParcelizer, (Object) computationExceptionReference.IconCompatParcelizer) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.read, (Object) computationExceptionReference.read) && onGetStartedClick.MediaBrowserCompat$ItemReceiver((Object) this.MediaBrowserCompat$CustomActionResultReceiver, (Object) computationExceptionReference.MediaBrowserCompat$CustomActionResultReceiver);
        }

        public final int hashCode() {
            String str = this.IconCompatParcelizer;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.read;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            String str3 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str3 != null) {
                i = str3.hashCode();
            }
            return (((hashCode * 31) + hashCode2) * 31) + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("QrToPayOtpRequest(accountNumber=");
            sb.append(this.IconCompatParcelizer);
            sb.append(", limitAmount=");
            sb.append(this.read);
            sb.append(", function=");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append(")");
            return sb.toString();
        }

        public ComputationExceptionReference(String str, String str2, String str3) {
            this.IconCompatParcelizer = str;
            this.read = str2;
            this.MediaBrowserCompat$CustomActionResultReceiver = str3;
        }
    }

    public ComputingConcurrentHashMap(String str, String str2, String str3, String str4, String str5, String str6) {
        onGetStartedClick.write((Object) str, "accountNo");
        onGetStartedClick.write((Object) str2, "transactionType");
        onGetStartedClick.write((Object) str3, "agentCode");
        onGetStartedClick.write((Object) str4, "amount");
        onGetStartedClick.write((Object) str5, "tokenId");
        onGetStartedClick.write((Object) str6, "postingType");
        this.MediaBrowserCompat$ItemReceiver = str;
        this.MediaBrowserCompat$SearchResultReceiver = str2;
        this.write = str3;
        this.IconCompatParcelizer = str4;
        this.read = str5;
        this.MediaBrowserCompat$CustomActionResultReceiver = str6;
    }

    /* renamed from: o.ComputingConcurrentHashMap$ComputingSegment */
    public class ComputingSegment {
        @SerializedName("groupName")
        public String write;

        public static ComputingSegment read() {
            return new ComputingSegment();
        }
    }

    /* renamed from: o.ComputingConcurrentHashMap$ComputedReference */
    public class ComputedReference {
        @SerializedName("recipientId")
        public long IconCompatParcelizer;
        @SerializedName("amount")
        public String MediaBrowserCompat$ItemReceiver;

        public static ComputedReference MediaBrowserCompat$CustomActionResultReceiver() {
            return new ComputedReference();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ComputedReference computedReference = (ComputedReference) obj;
            if (this.IconCompatParcelizer != computedReference.IconCompatParcelizer) {
                return false;
            }
            String str = this.MediaBrowserCompat$ItemReceiver;
            String str2 = computedReference.MediaBrowserCompat$ItemReceiver;
            if (str != null) {
                return str.equals(str2);
            }
            if (str2 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.MediaBrowserCompat$ItemReceiver;
            int hashCode = str != null ? str.hashCode() : 0;
            long j = this.IconCompatParcelizer;
            return (hashCode * 31) + ((int) (j ^ (j >>> 32)));
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BulkTransferVerifyRecipientRequest{amount='");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append('\'');
            sb.append(", recipientId=");
            sb.append(this.IconCompatParcelizer);
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: o.ComputingConcurrentHashMap$ComputingValueReference */
    public class ComputingValueReference {
        @SerializedName("expiryYear")
        private String IconCompatParcelizer;
        @SerializedName("expiryMonth")
        private String MediaBrowserCompat$ItemReceiver;
        @SerializedName("cardDetails")
        private beginTransaction read;

        public ComputingValueReference(String str, String str2, beginTransaction begintransaction) {
            this.IconCompatParcelizer = str;
            this.MediaBrowserCompat$ItemReceiver = str2;
            this.read = begintransaction;
        }
    }

    /* renamed from: o.ComputingConcurrentHashMap$ComputingSerializationProxy */
    public class ComputingSerializationProxy {
        @SerializedName("scheduleType")
        private String IconCompatParcelizer;
        @SerializedName("endDate")
        private String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("startDate")
        private String MediaBrowserCompat$ItemReceiver;
        @SerializedName("dayOfMonth")
        private String read;

        public ComputingSerializationProxy(String str, String str2, String str3, String str4) {
            this.IconCompatParcelizer = str;
            this.read = str2;
            this.MediaBrowserCompat$ItemReceiver = str3;
            this.MediaBrowserCompat$CustomActionResultReceiver = str4;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            ComputingSerializationProxy computingSerializationProxy = (ComputingSerializationProxy) obj;
            if (this.IconCompatParcelizer.equals(computingSerializationProxy.IconCompatParcelizer) && this.read.equals(computingSerializationProxy.read) && this.MediaBrowserCompat$ItemReceiver.equals(computingSerializationProxy.MediaBrowserCompat$ItemReceiver)) {
                return this.MediaBrowserCompat$CustomActionResultReceiver.equals(computingSerializationProxy.MediaBrowserCompat$CustomActionResultReceiver);
            }
            return false;
        }

        public int hashCode() {
            int hashCode = this.IconCompatParcelizer.hashCode();
            return (((((hashCode * 31) + this.read.hashCode()) * 31) + this.MediaBrowserCompat$ItemReceiver.hashCode()) * 31) + this.MediaBrowserCompat$CustomActionResultReceiver.hashCode();
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("ScheduleRequest{scheduleType='");
            sb.append(this.IconCompatParcelizer);
            sb.append('\'');
            sb.append(", dayOfMonth='");
            sb.append(this.read);
            sb.append('\'');
            sb.append(", startDate='");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append('\'');
            sb.append(", endDate='");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

    /* renamed from: o.ComputingConcurrentHashMap$NullPointerExceptionReference */
    public class NullPointerExceptionReference {
        @SerializedName("otherList")
        public List<ComputedReference> IconCompatParcelizer;
        @SerializedName("groupId")
        public String MediaBrowserCompat$CustomActionResultReceiver;
        @SerializedName("scbList")
        public List<ComputedReference> MediaBrowserCompat$ItemReceiver;
        @SerializedName("schedule")
        public ComputingSerializationProxy MediaBrowserCompat$SearchResultReceiver;
        @SerializedName("accountFrom")
        public String read;
        @SerializedName("ownList")
        public List<ComputedReference> write;

        public static NullPointerExceptionReference MediaBrowserCompat$CustomActionResultReceiver() {
            return new NullPointerExceptionReference();
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            NullPointerExceptionReference nullPointerExceptionReference = (NullPointerExceptionReference) obj;
            String str = this.read;
            if (str == null ? nullPointerExceptionReference.read != null : !str.equals(nullPointerExceptionReference.read)) {
                return false;
            }
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            if (str2 == null ? nullPointerExceptionReference.MediaBrowserCompat$CustomActionResultReceiver != null : !str2.equals(nullPointerExceptionReference.MediaBrowserCompat$CustomActionResultReceiver)) {
                return false;
            }
            ComputingSerializationProxy computingSerializationProxy = this.MediaBrowserCompat$SearchResultReceiver;
            if (computingSerializationProxy == null ? nullPointerExceptionReference.MediaBrowserCompat$SearchResultReceiver != null : !computingSerializationProxy.equals(nullPointerExceptionReference.MediaBrowserCompat$SearchResultReceiver)) {
                return false;
            }
            List<ComputedReference> list = this.write;
            if (list == null ? nullPointerExceptionReference.write != null : !list.equals(nullPointerExceptionReference.write)) {
                return false;
            }
            List<ComputedReference> list2 = this.MediaBrowserCompat$ItemReceiver;
            if (list2 == null ? nullPointerExceptionReference.MediaBrowserCompat$ItemReceiver != null : !list2.equals(nullPointerExceptionReference.MediaBrowserCompat$ItemReceiver)) {
                return false;
            }
            List<ComputedReference> list3 = this.IconCompatParcelizer;
            List<ComputedReference> list4 = nullPointerExceptionReference.IconCompatParcelizer;
            if (list3 != null) {
                return list3.equals(list4);
            }
            if (list4 != null) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            String str = this.read;
            int i = 0;
            int hashCode = str != null ? str.hashCode() : 0;
            String str2 = this.MediaBrowserCompat$CustomActionResultReceiver;
            int hashCode2 = str2 != null ? str2.hashCode() : 0;
            ComputingSerializationProxy computingSerializationProxy = this.MediaBrowserCompat$SearchResultReceiver;
            int hashCode3 = computingSerializationProxy != null ? computingSerializationProxy.hashCode() : 0;
            List<ComputedReference> list = this.write;
            int hashCode4 = list != null ? list.hashCode() : 0;
            List<ComputedReference> list2 = this.MediaBrowserCompat$ItemReceiver;
            int hashCode5 = list2 != null ? list2.hashCode() : 0;
            List<ComputedReference> list3 = this.IconCompatParcelizer;
            if (list3 != null) {
                i = list3.hashCode();
            }
            return (((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + i;
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append("BulkTransferVerifyRequest{accountFrom='");
            sb.append(this.read);
            sb.append('\'');
            sb.append(", groupId='");
            sb.append(this.MediaBrowserCompat$CustomActionResultReceiver);
            sb.append('\'');
            sb.append(", schedule=");
            sb.append(this.MediaBrowserCompat$SearchResultReceiver);
            sb.append(", ownList=");
            sb.append(this.write);
            sb.append(", scbList=");
            sb.append(this.MediaBrowserCompat$ItemReceiver);
            sb.append(", otherList=");
            sb.append(this.IconCompatParcelizer);
            sb.append('}');
            return sb.toString();
        }
    }
}
