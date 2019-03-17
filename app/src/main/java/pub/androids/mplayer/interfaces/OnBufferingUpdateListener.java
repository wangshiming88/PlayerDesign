package pub.androids.mplayer.interfaces;

import android.media.MediaPlayer;

/**
 * @see MediaPlayer.OnBufferingUpdateListener
 */
public interface OnBufferingUpdateListener {
    /**
     * @param mp
     * @param percent
     * @see MediaPlayer.OnBufferingUpdateListener#onBufferingUpdate(MediaPlayer, int)
     */
    void onBufferingUpdate(PlayInterface mp, int percent);
}