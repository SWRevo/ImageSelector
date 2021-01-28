package id.indosw.imageselector.result;

import android.graphics.drawable.Drawable;

import androidx.appcompat.graphics.drawable.DrawableWrapper;

import id.indosw.imageselector.PhotoSelector;

import java.io.File;

class DrawableResult extends Result<Drawable> {

    DrawableResult(PhotoSelector.ResultCallback<Drawable> callback) {
        super(callback);
    }

    @Override
    Drawable onImageResult(File file) {
        return DrawableWrapper.createFromPath(file.getPath());
    }

}
