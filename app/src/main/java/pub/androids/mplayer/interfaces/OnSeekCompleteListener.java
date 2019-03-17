package pub.androids.mplayer.interfaces;

import android.media.MediaPlayer;

/**
 * @see MediaPlayer.OnSeekCompleteListener
 */
public interface OnSeekCompleteListener {
    /**
     * @param mp
     * @see OnSeekCompleteListener
     */
    void onSeekComplete(PlayInterface mp);
}