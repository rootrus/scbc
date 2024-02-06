package p040o;

/* renamed from: o.HmlBusinessOwnerGuidelinesActivity */
public class HmlBusinessOwnerGuidelinesActivity extends HmlBusinessOwnerLoanSetupActivity {
    public static /* synthetic */ Object[] MediaBrowserCompat$ItemReceiver(Object[] objArr, Object[] objArr2, int i, int i2, int i3, int i4) {
        if ((i4 & 2) != 0) {
            i = 0;
        }
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = objArr.length;
        }
        onGetStartedClick.write((Object) objArr, "$this$copyInto");
        onGetStartedClick.write((Object) objArr2, "destination");
        System.arraycopy(objArr, i2, objArr2, i, i3 - i2);
        return objArr2;
    }
}
