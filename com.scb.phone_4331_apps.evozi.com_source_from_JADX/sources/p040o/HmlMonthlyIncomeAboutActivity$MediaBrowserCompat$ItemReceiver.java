package p040o;

/* renamed from: o.HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver */
class HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver {
    final ThreadLocal<HmlEtbConfirmationOtpActivity> IconCompatParcelizer;
    int read;
    final ThreadLocal<Integer> write;

    private HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver() {
        this.IconCompatParcelizer = new ThreadLocal<>();
        this.write = new ThreadLocal<>();
        this.read = 0;
    }

    /* synthetic */ HmlMonthlyIncomeAboutActivity$MediaBrowserCompat$ItemReceiver(byte b) {
        this();
    }
}
