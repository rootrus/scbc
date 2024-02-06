package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.SchedulingConfigModule */
public class SchedulingConfigModule {
    @SerializedName("endDate")
    public String IconCompatParcelizer;
    @SerializedName("startDate")
    public String read;
    @SerializedName("currentDateTime")
    public String write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SchedulingConfigModule schedulingConfigModule = (SchedulingConfigModule) obj;
        String str = this.write;
        if (str == null ? schedulingConfigModule.write != null : !str.equals(schedulingConfigModule.write)) {
            return false;
        }
        String str2 = this.read;
        if (str2 == null ? schedulingConfigModule.read != null : !str2.equals(schedulingConfigModule.read)) {
            return false;
        }
        String str3 = this.IconCompatParcelizer;
        String str4 = schedulingConfigModule.IconCompatParcelizer;
        if (str3 != null) {
            return str3.equals(str4);
        }
        if (str4 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.write;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.read;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.IconCompatParcelizer;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return (((hashCode * 31) + hashCode2) * 31) + i;
    }
}
