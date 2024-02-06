package p040o;

import com.google.gson.annotations.SerializedName;

/* renamed from: o.TimeModule */
public class TimeModule extends setCurrentItemInternal {
    @SerializedName("data")
    public SchedulingConfigModule write;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SchedulingConfigModule schedulingConfigModule = this.write;
        SchedulingConfigModule schedulingConfigModule2 = ((TimeModule) obj).write;
        if (schedulingConfigModule != null) {
            return schedulingConfigModule.equals(schedulingConfigModule2);
        }
        if (schedulingConfigModule2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        SchedulingConfigModule schedulingConfigModule = this.write;
        if (schedulingConfigModule != null) {
            return schedulingConfigModule.hashCode();
        }
        return 0;
    }
}
