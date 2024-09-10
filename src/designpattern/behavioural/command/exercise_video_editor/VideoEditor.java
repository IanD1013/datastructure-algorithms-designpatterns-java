package designpattern.behavioural.command.exercise_video_editor;

/**
 * This class represents the operations we can perform on a video,
 * such as adding a label to it or changing its contrast,
 *
 * We need to allow the user to undo any changes he/she makes to a video
 */
public class VideoEditor {
    private float contrast = 0.5f;
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public void removeText() {
        this.text = "";
    }

    public float getContrast() {
        return contrast;
    }

    public void setContrast(float contrast) {
        this.contrast = contrast;
    }

    @Override
    public String toString() {
        return "VideoEditor{" +
                "contrast=" + contrast +
                ", text='" + text + '\'' +
                '}';
    }
}
