package pub.androids.mplayer.interfaces;

import android.media.MediaPlayer;
import android.media.MediaPlayer;

/**
 *
 */
public interface OnVideoSizeChangedListener {

    /**
     * @param mp
     * @param width
     * @param height
     * @see MediaPlayer.OnVideoSizeChangedListener#onVideoSizeChanged(MediaPlayer, int, int)
     */
    void onVideoSizeChanged(PlayInterface mp, int width, int height, int displayHeight, int displayWidth);
}