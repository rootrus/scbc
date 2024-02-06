package p040o;

import java.io.IOException;
import java.net.Socket;

@Deprecated
/* renamed from: o.OnBoardingTutorialViewPagerAdapter$TutorialItemHolder */
public final class OnBoardingTutorialViewPagerAdapter$TutorialItemHolder implements RequesterReviewActivity {
    private onGiftsSendButtonClick IconCompatParcelizer;
    private CalendarDialogActivity MediaBrowserCompat$ItemReceiver;
    private final PrepaidTravelCoachMarkActivity_ViewBinding read = PrepaidOtpActivity.write((Class) getClass());

    public OnBoardingTutorialViewPagerAdapter$TutorialItemHolder(onGiftsSendButtonClick ongiftssendbuttonclick) {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(ongiftssendbuttonclick, "Scheme registry");
        this.IconCompatParcelizer = ongiftssendbuttonclick;
        this.MediaBrowserCompat$ItemReceiver = new InvestmentViewPagerAdapter$ViewHolder();
    }

    public final DealsSuccessActivity MediaBrowserCompat$ItemReceiver() {
        return new BaseHorizontalBubbleAdapter$SelectedItemHolder();
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x00aa  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00ca A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void read(p040o.DealsSuccessActivity r17, p040o.PrivacyManagementLandingViewHolder r18, java.net.InetAddress r19, p040o.CreditCardBilledDetailAdapter$ParentViewHolder r20, p040o.AmountDetailsSuccessAdapter$SuccessRow_ViewBinding r21) throws java.io.IOException {
        /*
            r16 = this;
            r1 = r16
            r2 = r17
            r3 = r18
            r4 = r19
            r5 = r21
            java.lang.String r0 = "Connection"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r2, (java.lang.String) r0)
            java.lang.String r0 = "Target host"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r3, (java.lang.String) r0)
            java.lang.String r0 = "HTTP parameters"
            p040o.DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(r5, (java.lang.String) r0)
            boolean r0 = r17.IconCompatParcelizer()
            r6 = 1
            r0 = r0 ^ r6
            if (r0 == 0) goto L_0x00d2
            java.lang.String r0 = "http.scheme-registry"
            r7 = r20
            java.lang.Object r0 = r7.MediaBrowserCompat$ItemReceiver(r0)
            o.onGiftsSendButtonClick r0 = (p040o.onGiftsSendButtonClick) r0
            if (r0 != 0) goto L_0x002f
            o.onGiftsSendButtonClick r0 = r1.IconCompatParcelizer
        L_0x002f:
            java.lang.String r7 = r3.read
            o.GiftPreviewActivity_ViewBinding r0 = r0.MediaBrowserCompat$CustomActionResultReceiver(r7)
            o.GiftingActivity r7 = r0.read
            java.lang.String r8 = r3.write
            o.CalendarDialogActivity r9 = r1.MediaBrowserCompat$ItemReceiver
            java.net.InetAddress[] r8 = r9.MediaBrowserCompat$CustomActionResultReceiver(r8)
            int r9 = r3.MediaBrowserCompat$CustomActionResultReceiver
            if (r9 > 0) goto L_0x0045
            int r9 = r0.MediaBrowserCompat$ItemReceiver
        L_0x0045:
            r10 = 0
            r11 = r10
        L_0x0047:
            int r0 = r8.length
            if (r11 >= r0) goto L_0x00d1
            r0 = r8[r11]
            int r12 = r8.length
            int r12 = r12 - r6
            if (r11 != r12) goto L_0x0052
            r12 = r6
            goto L_0x0053
        L_0x0052:
            r12 = r10
        L_0x0053:
            java.net.Socket r13 = r7.MediaBrowserCompat$CustomActionResultReceiver(r5)
            r2.write(r13)
            o.onUnscheduleClick r14 = new o.onUnscheduleClick
            r14.<init>(r3, r0, r9)
            r0 = 0
            if (r4 == 0) goto L_0x0067
            java.net.InetSocketAddress r0 = new java.net.InetSocketAddress
            r0.<init>(r4, r10)
        L_0x0067:
            o.PrepaidTravelCoachMarkActivity_ViewBinding r15 = r1.read
            boolean r15 = r15.IconCompatParcelizer()
            if (r15 == 0) goto L_0x0085
            o.PrepaidTravelCoachMarkActivity_ViewBinding r15 = r1.read
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "Connecting to "
            r6.append(r10)
            r6.append(r14)
            java.lang.String r6 = r6.toString()
            r15.write(r6)
        L_0x0085:
            java.net.Socket r0 = r7.IconCompatParcelizer(r13, r14, r0, r5)     // Catch:{ ConnectException -> 0x009f, ConnectTimeoutException -> 0x009a }
            if (r13 == r0) goto L_0x008f
            r2.write(r0)     // Catch:{ ConnectException -> 0x009f, ConnectTimeoutException -> 0x009a }
            r13 = r0
        L_0x008f:
            MediaBrowserCompat$CustomActionResultReceiver(r13, r5)     // Catch:{ ConnectException -> 0x009f, ConnectTimeoutException -> 0x009a }
            boolean r0 = r7.read(r13)     // Catch:{ ConnectException -> 0x009f, ConnectTimeoutException -> 0x009a }
            r2.IconCompatParcelizer(r0, r5)     // Catch:{ ConnectException -> 0x009f, ConnectTimeoutException -> 0x009a }
            return
        L_0x009a:
            r0 = move-exception
            if (r12 != 0) goto L_0x009e
            goto L_0x00a2
        L_0x009e:
            throw r0
        L_0x009f:
            r0 = move-exception
            if (r12 != 0) goto L_0x00d0
        L_0x00a2:
            o.PrepaidTravelCoachMarkActivity_ViewBinding r0 = r1.read
            boolean r0 = r0.IconCompatParcelizer()
            if (r0 == 0) goto L_0x00ca
            o.PrepaidTravelCoachMarkActivity_ViewBinding r0 = r1.read
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r10 = "Connect to "
            r6.append(r10)
            r6.append(r14)
            java.lang.String r10 = " timed out. "
            r6.append(r10)
            java.lang.String r10 = "Connection will be retried using another IP address"
            r6.append(r10)
            java.lang.String r6 = r6.toString()
            r0.write(r6)
        L_0x00ca:
            int r11 = r11 + 1
            r6 = 1
            r10 = 0
            goto L_0x0047
        L_0x00d0:
            throw r0
        L_0x00d1:
            return
        L_0x00d2:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "Connection must not be open"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p040o.OnBoardingTutorialViewPagerAdapter$TutorialItemHolder.read(o.DealsSuccessActivity, o.PrivacyManagementLandingViewHolder, java.net.InetAddress, o.CreditCardBilledDetailAdapter$ParentViewHolder, o.AmountDetailsSuccessAdapter$SuccessRow_ViewBinding):void");
    }

    public final void MediaBrowserCompat$CustomActionResultReceiver(DealsSuccessActivity dealsSuccessActivity, PrivacyManagementLandingViewHolder privacyManagementLandingViewHolder, CreditCardBilledDetailAdapter$ParentViewHolder creditCardBilledDetailAdapter$ParentViewHolder, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(dealsSuccessActivity, "Connection");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(privacyManagementLandingViewHolder, "Target host");
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "Parameters");
        if (dealsSuccessActivity.IconCompatParcelizer()) {
            onGiftsSendButtonClick ongiftssendbuttonclick = (onGiftsSendButtonClick) creditCardBilledDetailAdapter$ParentViewHolder.MediaBrowserCompat$ItemReceiver("http.scheme-registry");
            if (ongiftssendbuttonclick == null) {
                ongiftssendbuttonclick = this.IconCompatParcelizer;
            }
            GiftPreviewActivity_ViewBinding MediaBrowserCompat$CustomActionResultReceiver = ongiftssendbuttonclick.MediaBrowserCompat$CustomActionResultReceiver(privacyManagementLandingViewHolder.read);
            if (MediaBrowserCompat$CustomActionResultReceiver.read instanceof GiftRecipientActivity) {
                GiftRecipientActivity giftRecipientActivity = (GiftRecipientActivity) MediaBrowserCompat$CustomActionResultReceiver.read;
                Socket RatingCompat = dealsSuccessActivity.RatingCompat();
                String str = privacyManagementLandingViewHolder.write;
                int i = privacyManagementLandingViewHolder.MediaBrowserCompat$CustomActionResultReceiver;
                if (i <= 0) {
                    i = MediaBrowserCompat$CustomActionResultReceiver.MediaBrowserCompat$ItemReceiver;
                }
                Socket read2 = giftRecipientActivity.read(RatingCompat, str, i);
                MediaBrowserCompat$CustomActionResultReceiver(read2, amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
                dealsSuccessActivity.MediaBrowserCompat$ItemReceiver(read2, privacyManagementLandingViewHolder, giftRecipientActivity.read(read2), amountDetailsSuccessAdapter$SuccessRow_ViewBinding);
                return;
            }
            throw new IllegalStateException("Socket factory must implement SchemeLayeredSocketFactory");
        }
        throw new IllegalStateException("Connection must be open");
    }

    private static void MediaBrowserCompat$CustomActionResultReceiver(Socket socket, AmountDetailsSuccessAdapter$SuccessRow_ViewBinding amountDetailsSuccessAdapter$SuccessRow_ViewBinding) throws IOException {
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        boolean z = true;
        socket.setTcpNoDelay(amountDetailsSuccessAdapter$SuccessRow_ViewBinding.IconCompatParcelizer("http.tcp.nodelay", true));
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        socket.setSoTimeout(amountDetailsSuccessAdapter$SuccessRow_ViewBinding.MediaBrowserCompat$ItemReceiver("http.socket.timeout", 0));
        DepositTransactionAdapter$GroupItemViewHolder.IconCompatParcelizer(amountDetailsSuccessAdapter$SuccessRow_ViewBinding, "HTTP parameters");
        int MediaBrowserCompat$ItemReceiver2 = amountDetailsSuccessAdapter$SuccessRow_ViewBinding.MediaBrowserCompat$ItemReceiver("http.socket.linger", -1);
        if (MediaBrowserCompat$ItemReceiver2 >= 0) {
            if (MediaBrowserCompat$ItemReceiver2 <= 0) {
                z = false;
            }
            socket.setSoLinger(z, MediaBrowserCompat$ItemReceiver2);
        }
    }
}
