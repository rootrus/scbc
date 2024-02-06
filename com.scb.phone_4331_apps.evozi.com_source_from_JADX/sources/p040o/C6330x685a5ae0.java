package p040o;

/* renamed from: o.BankingAgentSuccessActivity$MediaBrowserCompat$CustomActionResultReceiver */
class C6330x685a5ae0 implements Runnable {
    String IconCompatParcelizer;
    String MediaBrowserCompat$CustomActionResultReceiver;
    private /* synthetic */ BankingAgentSuccessActivity MediaBrowserCompat$ItemReceiver;
    boolean read;
    String write;

    private C6330x685a5ae0(BankingAgentSuccessActivity bankingAgentSuccessActivity) {
        this.MediaBrowserCompat$ItemReceiver = bankingAgentSuccessActivity;
    }

    /* synthetic */ C6330x685a5ae0(BankingAgentSuccessActivity bankingAgentSuccessActivity, byte b) {
        this(bankingAgentSuccessActivity);
    }

    public final void run() {
        BankingAgentSuccessActivity bankingAgentSuccessActivity = this.MediaBrowserCompat$ItemReceiver;
        String str = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str2 = this.write;
        String str3 = this.IconCompatParcelizer;
        setTextAppearance settextappearance = new setTextAppearance();
        settextappearance.put(str2, str3);
        bankingAgentSuccessActivity.read.write(str, settextappearance);
        if (this.read) {
            this.MediaBrowserCompat$ItemReceiver.read.IconCompatParcelizer(this.MediaBrowserCompat$CustomActionResultReceiver, this.write);
        }
    }
}
