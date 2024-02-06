package p040o;

import com.google.gson.annotations.SerializedName;
import java.util.List;

/* renamed from: o.LottieProperty */
public class LottieProperty extends getWidth {
    @SerializedName("location")
    public String AppCompatActivity;
    @SerializedName("duration")
    public String AppCompatDelegateImpl$ListMenuDecorView;
    @SerializedName("firstname")
    public String AppCompatDialogFragment;
    @SerializedName("borrower")
    public List<getDirName> MediaBrowserCompat$ItemReceiver;
    @SerializedName("accountNo")
    public String read;
    @SerializedName("lastname")
    public String setBackgroundResource;
    @SerializedName("title")
    public String setChecked;
    @SerializedName("fullLocation")
    public String setContentView;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LottieProperty lottieProperty = (LottieProperty) obj;
        String str = this.AppCompatActivity;
        if (str == null ? lottieProperty.AppCompatActivity != null : !str.equals(lottieProperty.AppCompatActivity)) {
            return false;
        }
        String str2 = this.setContentView;
        if (str2 == null ? lottieProperty.setContentView != null : !str2.equals(lottieProperty.setContentView)) {
            return false;
        }
        String str3 = this.read;
        if (str3 == null ? lottieProperty.read != null : !str3.equals(lottieProperty.read)) {
            return false;
        }
        String str4 = this.AppCompatDelegateImpl$ListMenuDecorView;
        if (str4 == null ? lottieProperty.AppCompatDelegateImpl$ListMenuDecorView != null : !str4.equals(lottieProperty.AppCompatDelegateImpl$ListMenuDecorView)) {
            return false;
        }
        String str5 = this.setChecked;
        if (str5 == null ? lottieProperty.setChecked != null : !str5.equals(lottieProperty.setChecked)) {
            return false;
        }
        String str6 = this.AppCompatDialogFragment;
        if (str6 == null ? lottieProperty.AppCompatDialogFragment != null : !str6.equals(lottieProperty.AppCompatDialogFragment)) {
            return false;
        }
        String str7 = this.setBackgroundResource;
        if (str7 == null ? lottieProperty.setBackgroundResource != null : !str7.equals(lottieProperty.setBackgroundResource)) {
            return false;
        }
        List<getDirName> list = this.MediaBrowserCompat$ItemReceiver;
        List<getDirName> list2 = lottieProperty.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            return list.equals(list2);
        }
        if (list2 != null) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        String str = this.AppCompatActivity;
        int i = 0;
        int hashCode = str != null ? str.hashCode() : 0;
        String str2 = this.setContentView;
        int hashCode2 = str2 != null ? str2.hashCode() : 0;
        String str3 = this.read;
        int hashCode3 = str3 != null ? str3.hashCode() : 0;
        String str4 = this.AppCompatDelegateImpl$ListMenuDecorView;
        int hashCode4 = str4 != null ? str4.hashCode() : 0;
        String str5 = this.setChecked;
        int hashCode5 = str5 != null ? str5.hashCode() : 0;
        String str6 = this.AppCompatDialogFragment;
        int hashCode6 = str6 != null ? str6.hashCode() : 0;
        String str7 = this.setBackgroundResource;
        int hashCode7 = str7 != null ? str7.hashCode() : 0;
        List<getDirName> list = this.MediaBrowserCompat$ItemReceiver;
        if (list != null) {
            i = list.hashCode();
        }
        return (((((((((((((hashCode * 31) + hashCode2) * 31) + hashCode3) * 31) + hashCode4) * 31) + hashCode5) * 31) + hashCode6) * 31) + hashCode7) * 31) + i;
    }
}
