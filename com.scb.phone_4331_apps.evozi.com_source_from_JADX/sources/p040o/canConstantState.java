package p040o;

import java.io.File;
import java.io.IOException;
import okhttp3.ResponseBody;
import org.simpleframework.xml.transform.InvalidFormatException;
import retrofit2.Response;

/* renamed from: o.canConstantState */
public final /* synthetic */ class canConstantState implements AccountSummaryDeepLinkActivity {
    private final /* synthetic */ Response IconCompatParcelizer;
    private final /* synthetic */ setTapText MediaBrowserCompat$CustomActionResultReceiver;
    private final /* synthetic */ String read;

    public /* synthetic */ canConstantState(setTapText settaptext, String str, Response response) {
        this.MediaBrowserCompat$CustomActionResultReceiver = settaptext;
        this.read = str;
        this.IconCompatParcelizer = response;
    }

    public final void read(onOkClick onokclick) {
        File file;
        setTapText settaptext = this.MediaBrowserCompat$CustomActionResultReceiver;
        String str = this.read;
        Response response = this.IconCompatParcelizer;
        try {
            String substring = str.substring(0, str.indexOf(46));
            File file2 = settaptext.write;
            StringBuilder sb = new StringBuilder();
            sb.append("themes/");
            sb.append(substring);
            file = new File(file2, sb.toString());
            try {
                if (!file.exists()) {
                    onCheckBoxClick.read("%s created %s", file.getAbsolutePath(), Boolean.valueOf(file.mkdirs()));
                }
                File file3 = new File(file, str);
                file3.createNewFile();
                NsipPartnerPaymentReviewActivity read2 = onSubmit.read(onSubmit.read(file3));
                read2.MediaBrowserCompat$CustomActionResultReceiver((HowToAddAccountStep2Activity) ((ResponseBody) response.body()).source());
                read2.close();
                AlertController$RecycleListView.MediaBrowserCompat$CustomActionResultReceiver(file3.getAbsolutePath());
                setTapText.MediaBrowserCompat$CustomActionResultReceiver(file3);
                if (setTapText.read(file)) {
                    onokclick.MediaBrowserCompat$CustomActionResultReceiver(file.getAbsolutePath());
                } else {
                    setTapText.IconCompatParcelizer(file);
                    onokclick.MediaBrowserCompat$CustomActionResultReceiver((Throwable) new InvalidFormatException("Some of the theme files do not match ThemesComponent", ""));
                }
                onokclick.MediaBrowserCompat$CustomActionResultReceiver();
            } catch (IOException e) {
                e = e;
                setTapText.IconCompatParcelizer(file);
                onokclick.MediaBrowserCompat$CustomActionResultReceiver((Throwable) e);
            }
        } catch (IOException e2) {
            e = e2;
            file = null;
            setTapText.IconCompatParcelizer(file);
            onokclick.MediaBrowserCompat$CustomActionResultReceiver((Throwable) e);
        }
    }
}
