package p040o;

/* renamed from: o.onOpenAccountClick */
public final class onOpenAccountClick {
    public static String read(NtbDiscoverFundFilterListActivity ntbDiscoverFundFilterListActivity) {
        String obj = ntbDiscoverFundFilterListActivity.getClass().getGenericInterfaces()[0].toString();
        return obj.startsWith("kotlin.jvm.functions.") ? obj.substring(21) : obj;
    }
}
