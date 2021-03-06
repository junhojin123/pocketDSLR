package cs495.pocketdslr;

import android.content.Context;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.os.Bundle;

import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by Chris on 3/11/2015.
 */
public class UserContext {

    protected Bundle bundle;
    protected Context context;
    protected ManualCameraSettings cameraSettings;

    public UserContext(Context context, Bundle bundle) {
        this.cameraSettings = new ManualCameraSettings(bundle);
    }

    public ManualCameraSettings getCameraSettings() {
        return this.cameraSettings;
    }

    public void saveImage(Image image, String name) {

    }

    public void viewImage(String name) {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setDataAndType(Uri.parse("file:///mnt/sdcard/pocketDSLR/imgs/" + name),"image/*");
        this.context.startActivity(intent);
    }

}
