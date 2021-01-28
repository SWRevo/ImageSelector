package id.indosw.imageselector.result;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

import id.indosw.imageselector.PhotoSelector;

import java.io.File;

class BitmapResult extends Result<Bitmap> {

    BitmapResult(PhotoSelector.ResultCallback<Bitmap> callback) {
        super(callback);
    }

    @Override
    Bitmap onImageResult(File file) {
        return BitmapFactory.decodeFile(file.getPath());
    }

}
