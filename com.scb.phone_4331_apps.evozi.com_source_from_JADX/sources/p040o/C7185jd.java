package p040o;

import com.scb.phone.view.activity.cardmanagement.SaveSlipBaseActivity;

/* renamed from: o.jd */
public final class C7185jd<T> implements MileageQuantitySelectionActivity<SaveSlipBaseActivity<T>> {
    public static <T> void write(SaveSlipBaseActivity<T> saveSlipBaseActivity, FirebaseVisionCloudDocumentRecognizerOptions firebaseVisionCloudDocumentRecognizerOptions) {
        saveSlipBaseActivity.saveSlipPresenter = firebaseVisionCloudDocumentRecognizerOptions;
    }

    public static <T> void read(SaveSlipBaseActivity<T> saveSlipBaseActivity, setExitButtonEnabled setexitbuttonenabled) {
        saveSlipBaseActivity.themesSlipPresenter = setexitbuttonenabled;
    }
}
